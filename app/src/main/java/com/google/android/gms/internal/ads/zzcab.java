package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
final class zzcab extends ScheduledThreadPoolExecutor {
    public zzcab(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
