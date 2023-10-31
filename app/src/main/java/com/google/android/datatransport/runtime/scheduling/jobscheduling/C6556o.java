package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6572c;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6608b;
import com.google.android.exoplayer2.C6968g0;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.o */
/* loaded from: classes.dex */
public final /* synthetic */ class C6556o implements InterfaceC6608b.InterfaceC6609a, C7417m.InterfaceC7418a {

    /* renamed from: b */
    public final /* synthetic */ Object f10354b;

    public /* synthetic */ C6556o(Object obj) {
        this.f10354b = obj;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6608b.InterfaceC6609a
    public final Object execute() {
        return ((InterfaceC6572c) this.f10354b).mo6250d();
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public final void invoke(Object obj) {
        ((Player.InterfaceC6626b) obj).onMediaMetadataChanged(((C6968g0) this.f10354b).f12037C);
    }
}
