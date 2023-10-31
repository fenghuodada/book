package com.vungle.warren;

import android.os.Bundle;
import android.os.SystemClock;
import com.vungle.warren.tasks.C9978a;
import com.vungle.warren.tasks.JobInfo;
import com.vungle.warren.utility.C10069a;

/* renamed from: com.vungle.warren.q */
/* loaded from: classes3.dex */
public final class C9961q extends C10069a.C10075f {

    /* renamed from: a */
    public final /* synthetic */ C9964r f20002a;

    public C9961q(C9964r c9964r) {
        this.f20002a = c9964r;
    }

    @Override // com.vungle.warren.utility.C10069a.C10075f
    /* renamed from: c */
    public final void mo1279c() {
        C9964r c9964r = this.f20002a;
        if (c9964r.f20009e == 0 && c9964r.f20006b != 0) {
            c9964r.f20009e = 1;
            Bundle bundle = new Bundle();
            bundle.putLong("cache_bust_interval", c9964r.f20006b);
            bundle.putLong("next_cache_bust", SystemClock.elapsedRealtime() + c9964r.f20006b);
            String[] strArr = C9978a.f20059d;
            JobInfo jobInfo = new JobInfo("com.vungle.warren.tasks.a");
            jobInfo.f20057h = 0;
            jobInfo.f20051b = true;
            long j = c9964r.f20006b;
            jobInfo.f20052c = j - c9964r.f20008d;
            jobInfo.f20053d = j;
            jobInfo.f20056g = 0;
            jobInfo.f20055f = bundle;
            c9964r.f20005a.mo1353a(jobInfo);
            c9964r.f20008d = 0L;
            c9964r.f20007c = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.vungle.warren.utility.C10069a.C10075f
    /* renamed from: d */
    public final void mo1280d() {
        C9964r c9964r = this.f20002a;
        if (c9964r.f20006b != 0) {
            c9964r.f20008d = (SystemClock.elapsedRealtime() - c9964r.f20007c) % c9964r.f20006b;
        }
        String[] strArr = C9978a.f20059d;
        c9964r.f20005a.mo1352b();
        c9964r.f20009e = 0;
    }
}
