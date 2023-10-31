package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Xi */
/* loaded from: assets/audience_network.dex */
public class C5937Xi implements InterfaceC5156Ky {
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5156Ky
    public final void AE0(Throwable th, Object obj) {
        if (obj instanceof InterfaceC44128S) {
            C5953Xy A5b = ((InterfaceC44128S) obj).A5b();
            if (A5b != null) {
                A5b.A0H(th);
            }
        } else if (!(obj instanceof View)) {
        } else {
            Context context = ((View) obj).getContext();
            if (!(context instanceof C5953Xy)) {
                return;
            }
            ((C5953Xy) context).A0H(th);
        }
    }
}
