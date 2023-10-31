package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.sessions.api.SessionSubscriber;

/* loaded from: classes3.dex */
public class CrashlyticsAppQualitySessionsSubscriber implements SessionSubscriber {
    @Nullable
    private String appQualitySessionId = null;
    private final DataCollectionArbiter dataCollectionArbiter;

    public CrashlyticsAppQualitySessionsSubscriber(DataCollectionArbiter dataCollectionArbiter) {
        this.dataCollectionArbiter = dataCollectionArbiter;
    }

    @Nullable
    public String getAppQualitySessionId() {
        return this.appQualitySessionId;
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    @NonNull
    public SessionSubscriber.Name getSessionSubscriberName() {
        return SessionSubscriber.Name.CRASHLYTICS;
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public boolean isDataCollectionEnabled() {
        return this.dataCollectionArbiter.isAutomaticDataCollectionEnabled();
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public void onSessionChanged(@NonNull SessionSubscriber.SessionDetails sessionDetails) {
        Logger logger = Logger.getLogger();
        logger.m3348d("App Quality Sessions session changed: " + sessionDetails);
        this.appQualitySessionId = sessionDetails.getSessionId();
    }
}
