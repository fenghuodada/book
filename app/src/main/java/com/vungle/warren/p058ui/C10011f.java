package com.vungle.warren.p058ui;

import androidx.annotation.Nullable;
import com.vungle.warren.C9758c;
import com.vungle.warren.model.Placement;
import com.vungle.warren.p058ui.contract.InterfaceC10003b;
import com.vungle.warren.utility.C10069a;

/* renamed from: com.vungle.warren.ui.f */
/* loaded from: classes3.dex */
public final class C10011f implements C10069a.InterfaceC10074e {

    /* renamed from: a */
    public final InterfaceC10003b.InterfaceC10004a f20112a;

    /* renamed from: b */
    public final Placement f20113b;

    public C10011f(@Nullable InterfaceC10003b.InterfaceC10004a interfaceC10004a, @Nullable Placement placement) {
        this.f20112a = interfaceC10004a;
        this.f20113b = placement;
    }

    @Override // com.vungle.warren.utility.C10069a.InterfaceC10074e
    /* renamed from: a */
    public final void mo1283a() {
        String str;
        InterfaceC10003b.InterfaceC10004a interfaceC10004a = this.f20112a;
        if (interfaceC10004a != null) {
            Placement placement = this.f20113b;
            if (placement == null) {
                str = null;
            } else {
                str = placement.f19769a;
            }
            ((C9758c) interfaceC10004a).m1587c("open", "adLeftApplication", str);
        }
    }
}
