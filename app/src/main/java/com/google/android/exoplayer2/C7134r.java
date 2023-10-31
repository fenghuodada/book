package com.google.android.exoplayer2;

import androidx.core.view.accessibility.InterfaceC0863d;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.util.C7417m;

/* renamed from: com.google.android.exoplayer2.r */
/* loaded from: classes.dex */
public final /* synthetic */ class C7134r implements C7417m.InterfaceC7418a, InterfaceC0863d {

    /* renamed from: b */
    public final /* synthetic */ Object f12673b;

    public /* synthetic */ C7134r(Object obj) {
        this.f12673b = obj;
    }

    @Override // com.google.android.exoplayer2.util.C7417m.InterfaceC7418a
    public final void invoke(Object obj) {
        C7508z0 c7508z0 = (C7508z0) this.f12673b;
        Player.InterfaceC6626b interfaceC6626b = (Player.InterfaceC6626b) obj;
        interfaceC6626b.onLoadingChanged(c7508z0.f14262g);
        interfaceC6626b.onIsLoadingChanged(c7508z0.f14262g);
    }
}
