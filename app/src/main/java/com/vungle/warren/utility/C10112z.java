package com.vungle.warren.utility;

import com.vungle.warren.C9975t1;
import com.vungle.warren.InterfaceC10136z;
import com.vungle.warren.error.VungleException;
import java.lang.ref.WeakReference;

/* renamed from: com.vungle.warren.utility.z */
/* loaded from: classes3.dex */
public final class C10112z implements InterfaceC10136z {

    /* renamed from: a */
    public final WeakReference<InterfaceC10136z> f20356a;

    public C10112z(C9975t1.C9977b c9977b) {
        this.f20356a = new WeakReference<>(c9977b);
    }

    @Override // com.vungle.warren.InterfaceC10136z
    public final void onAdLoad(String str) {
        InterfaceC10136z interfaceC10136z = this.f20356a.get();
        if (interfaceC10136z != null) {
            interfaceC10136z.onAdLoad(str);
        }
    }

    @Override // com.vungle.warren.InterfaceC10136z, com.vungle.warren.InterfaceC9782e0
    public final void onError(String str, VungleException vungleException) {
        InterfaceC10136z interfaceC10136z = this.f20356a.get();
        if (interfaceC10136z != null) {
            interfaceC10136z.onError(str, vungleException);
        }
    }
}
