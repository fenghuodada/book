package com.vungle.warren;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.vungle.warren.tasks.C9978a;
import com.vungle.warren.tasks.InterfaceC9982e;
import com.vungle.warren.tasks.JobInfo;
import com.vungle.warren.utility.C10069a;

/* renamed from: com.vungle.warren.r */
/* loaded from: classes3.dex */
public final class C9964r {

    /* renamed from: a */
    public final InterfaceC9982e f20005a;
    @VisibleForTesting

    /* renamed from: b */
    public long f20006b = 0;

    /* renamed from: c */
    public long f20007c;

    /* renamed from: d */
    public long f20008d;

    /* renamed from: e */
    public int f20009e;

    public C9964r(@NonNull InterfaceC9982e interfaceC9982e) {
        this.f20005a = interfaceC9982e;
        C10069a c10069a = C10069a.f20278j;
        if (c10069a.f20279a) {
            c10069a.m1287a(new C9961q(this));
        } else {
            Log.e(C9964r.class.getSimpleName(), "No lifecycle listener set");
            VungleLogger.m1603c(C9964r.class.getSimpleName().concat("#deliverError"), "No lifecycle listener set");
        }
        this.f20009e = 0;
    }

    /* renamed from: a */
    public final synchronized void m1370a() {
        if (this.f20009e == 1) {
            return;
        }
        this.f20009e = 1;
        if (this.f20006b == 0) {
            InterfaceC9982e interfaceC9982e = this.f20005a;
            String[] strArr = C9978a.f20059d;
            JobInfo jobInfo = new JobInfo("com.vungle.warren.tasks.a");
            jobInfo.f20057h = 0;
            jobInfo.f20051b = true;
            interfaceC9982e.mo1353a(jobInfo);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("cache_bust_interval", this.f20006b);
            bundle.putLong("next_cache_bust", SystemClock.elapsedRealtime() + this.f20006b);
            InterfaceC9982e interfaceC9982e2 = this.f20005a;
            String[] strArr2 = C9978a.f20059d;
            JobInfo jobInfo2 = new JobInfo("com.vungle.warren.tasks.a");
            jobInfo2.f20057h = 0;
            jobInfo2.f20051b = true;
            jobInfo2.f20053d = this.f20006b;
            jobInfo2.f20056g = 0;
            jobInfo2.f20055f = bundle;
            interfaceC9982e2.mo1353a(jobInfo2);
        }
        this.f20007c = SystemClock.elapsedRealtime();
    }
}
