package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.synchronization.InterfaceC6608b;
import com.google.android.exoplayer2.C7508z0;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C6553l implements InterfaceC6608b.InterfaceC6609a, C7417m.InterfaceC7418a {

    /* renamed from: b */
    public final /* synthetic */ Object f10348b;

    public /* synthetic */ C6553l(Object obj) {
        this.f10348b = obj;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6608b.InterfaceC6609a
    public final Object execute() {
        ((C6559r) this.f10348b).f10368i.mo6251a();
        return null;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public final void invoke(Object obj) {
        C7508z0 c7508z0 = (C7508z0) this.f10348b;
        ((Player.InterfaceC6626b) obj).onPlayerStateChanged(c7508z0.f14267l, c7508z0.f14260e);
    }
}
