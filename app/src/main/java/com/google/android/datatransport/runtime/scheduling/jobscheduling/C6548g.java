package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.AbstractC6522n;
import com.google.android.datatransport.runtime.synchronization.InterfaceC6608b;
import com.google.android.exoplayer2.C7508z0;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.trackselection.C7303k;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C6548g implements InterfaceC6608b.InterfaceC6609a, C7417m.InterfaceC7418a {

    /* renamed from: b */
    public final /* synthetic */ int f10334b;

    /* renamed from: c */
    public final /* synthetic */ Object f10335c;

    /* renamed from: d */
    public final /* synthetic */ Object f10336d;

    public /* synthetic */ C6548g(int i, Object obj, Object obj2) {
        this.f10334b = i;
        this.f10335c = obj;
        this.f10336d = obj2;
    }

    @Override // com.google.android.datatransport.runtime.synchronization.InterfaceC6608b.InterfaceC6609a
    public final Object execute() {
        return Boolean.valueOf(((C6559r) this.f10335c).f10362c.mo6247C((AbstractC6522n) this.f10336d));
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public final void invoke(Object obj) {
        switch (this.f10334b) {
            case 1:
                ((Player.InterfaceC6626b) obj).onTracksChanged(((C7508z0) this.f10335c).f14263h, (C7303k) this.f10336d);
                return;
            default:
                ((AnalyticsListener) obj).m6190T();
                return;
        }
    }
}
