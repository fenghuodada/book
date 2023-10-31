package com.vungle.warren.utility;

import android.os.Handler;
import androidx.annotation.NonNull;

/* renamed from: com.vungle.warren.utility.r */
/* loaded from: classes3.dex */
public final class HandlerC10102r extends Handler {

    /* renamed from: a */
    public long f20337a;

    /* renamed from: b */
    public long f20338b;

    /* renamed from: c */
    public final long f20339c;

    /* renamed from: d */
    public final Runnable f20340d;

    public HandlerC10102r(@NonNull RunnableC10076a0 runnableC10076a0, long j) {
        this.f20339c = j;
        this.f20340d = runnableC10076a0;
    }

    /* renamed from: a */
    public final synchronized void m1251a() {
        removeMessages(0);
        removeCallbacks(this.f20340d);
        this.f20338b = 0L;
        this.f20337a = 0L;
    }

    /* renamed from: b */
    public final synchronized void m1250b() {
        if (this.f20339c <= 0) {
            return;
        }
        if (!hasMessages(0)) {
            long j = this.f20339c - this.f20338b;
            this.f20337a = System.currentTimeMillis();
            postDelayed(this.f20340d, j);
        }
    }
}
