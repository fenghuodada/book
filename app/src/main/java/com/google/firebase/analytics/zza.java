package com.google.firebase.analytics;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
final class zza extends ThreadPoolExecutor {
    public zza(FirebaseAnalytics firebaseAnalytics, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue blockingQueue) {
        super(0, 1, 30L, timeUnit, blockingQueue);
    }
}
