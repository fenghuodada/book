package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import com.google.android.exoplayer2.extractor.InterfaceC6905t;
import com.google.android.exoplayer2.source.C7139a0;
import com.google.android.exoplayer2.source.C7147b0;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC6543e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f10327a;

    /* renamed from: b */
    public final /* synthetic */ Object f10328b;

    /* renamed from: c */
    public final /* synthetic */ Object f10329c;

    public /* synthetic */ RunnableC6543e(int i, Object obj, Object obj2) {
        this.f10327a = i;
        this.f10328b = obj;
        this.f10329c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC6905t c6907b;
        int i = this.f10327a;
        boolean z = false;
        Object obj = this.f10329c;
        Object obj2 = this.f10328b;
        switch (i) {
            case 0:
                int i2 = JobInfoSchedulerService.f10315a;
                ((JobInfoSchedulerService) obj2).jobFinished((JobParameters) obj, false);
                return;
            default:
                C7139a0 c7139a0 = (C7139a0) obj2;
                InterfaceC6905t interfaceC6905t = (InterfaceC6905t) obj;
                if (c7139a0.f12735r == null) {
                    c6907b = interfaceC6905t;
                } else {
                    c6907b = new InterfaceC6905t.C6907b(-9223372036854775807L);
                }
                c7139a0.f12742y = c6907b;
                c7139a0.f12743z = interfaceC6905t.mo5794i();
                int i3 = 1;
                if (c7139a0.f12711F == -1 && interfaceC6905t.mo5794i() == -9223372036854775807L) {
                    z = true;
                }
                c7139a0.f12706A = z;
                if (z) {
                    i3 = 7;
                }
                c7139a0.f12707B = i3;
                ((C7147b0) c7139a0.f12724g).m5467t(c7139a0.f12743z, interfaceC6905t.mo5796c(), c7139a0.f12706A);
                if (!c7139a0.f12739v) {
                    c7139a0.m5477x();
                    return;
                }
                return;
        }
    }
}
