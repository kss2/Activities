package com.github.kss.activities;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.HashSet;
import java.util.Set;

class ActivityLifecycleContextListener implements Application.ActivityLifecycleCallbacks {

    private Activity activity;

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    private Set<Activity> activities = new HashSet<>();

    public Set<Activity> getActivities() {
        return activities;
    }

    @Override
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        this.activity = activity;
        if(!activities.contains(activity)){
            activities.add(activity);
        }
    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {

    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {
        this.activity = activity;
        if(!activities.contains(activity)){
            activities.add(activity);
        }
    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {
        this.activity = activity;
        if(!activities.contains(activity)){
            activities.add(activity);
        }
    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {
        if(activities.contains(activity)){
            activities.remove(activity);
        }
    }
}
