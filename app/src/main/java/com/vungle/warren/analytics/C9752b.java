package com.vungle.warren.analytics;

import androidx.annotation.NonNull;
import com.google.gson.C8695r;
import com.vungle.warren.tasks.AnalyticsJob;
import com.vungle.warren.tasks.InterfaceC9982e;
import com.vungle.warren.tasks.JobInfo;

/* renamed from: com.vungle.warren.analytics.b */
/* loaded from: classes3.dex */
public final class C9752b implements InterfaceC9751a {

    /* renamed from: a */
    public final InterfaceC9982e f19413a;

    public C9752b(InterfaceC9982e interfaceC9982e) {
        this.f19413a = interfaceC9982e;
    }

    @Override // com.vungle.warren.analytics.InterfaceC9751a
    /* renamed from: a */
    public final void mo1593a(C8695r c8695r) {
        this.f19413a.mo1353a(AnalyticsJob.m1362b(0, c8695r.toString(), null, 1));
    }

    @Override // com.vungle.warren.analytics.InterfaceC9751a
    /* renamed from: b */
    public final String[] mo1592b() {
        this.f19413a.mo1353a(AnalyticsJob.m1362b(2, null, null, 1));
        return new String[0];
    }

    @Override // com.vungle.warren.analytics.InterfaceC9751a
    /* renamed from: c */
    public final String[] mo1591c(@NonNull String[] strArr) {
        JobInfo m1362b = AnalyticsJob.m1362b(3, null, strArr, 0);
        InterfaceC9982e interfaceC9982e = this.f19413a;
        interfaceC9982e.mo1353a(m1362b);
        interfaceC9982e.mo1353a(AnalyticsJob.m1362b(1, null, strArr, 1));
        return new String[0];
    }

    @Override // com.vungle.warren.analytics.InterfaceC9751a
    /* renamed from: d */
    public final void mo1590d(String[] strArr) {
    }
}
