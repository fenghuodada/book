package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.InterfaceC6608b;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C6552k implements InterfaceC6608b.InterfaceC6609a, C7417m.InterfaceC7418a {

    /* renamed from: b */
    public final /* synthetic */ Object f10346b;

    /* renamed from: c */
    public final /* synthetic */ Object f10347c;

    public /* synthetic */ C6552k(Object obj, Object obj2) {
        this.f10346b = obj;
        this.f10347c = obj2;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6608b.InterfaceC6609a
    public final Object execute() {
        ((C6559r) this.f10346b).f10362c.mo6244i((Iterable) this.f10347c);
        return null;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).m6199K();
    }
}
