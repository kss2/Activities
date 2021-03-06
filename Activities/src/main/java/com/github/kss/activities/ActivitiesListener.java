package com.github.kss.activities;

import android.app.Activity;
import android.os.Bundle;

public interface ActivitiesListener {
    void onActivityCreated(Activity activity, Bundle bundle);

    void onActivityStarted(Activity activity);

    void onActivityResumed(Activity activity);

    void onActivityPaused(Activity activity);

    void onActivityStopped(Activity activity);

    void onActivitySaveInstanceState(Activity activity, Bundle bundle);

    void onActivityDestroyed(Activity activity);
}
