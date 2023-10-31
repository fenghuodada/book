package com.bumptech.glide.util;

import android.os.SystemClock;

/* renamed from: com.bumptech.glide.util.f */
/* loaded from: classes.dex */
public final class C3855f {

    /* renamed from: a */
    public static final double f9945a = 1.0d / Math.pow(10.0d, 6.0d);

    /* renamed from: b */
    public static final /* synthetic */ int f9946b = 0;

    /* renamed from: a */
    public static double m6413a(long j) {
        return (SystemClock.elapsedRealtimeNanos() - j) * f9945a;
    }
}
