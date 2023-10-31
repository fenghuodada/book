package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.eS */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC6347eS {
    @Nullable
    public InterfaceC6348eT A00;

    public final void A00() {
        InterfaceC6348eT interfaceC6348eT = this.A00;
        if (interfaceC6348eT != null) {
            interfaceC6348eT.onStart();
        }
    }

    public final void A01() {
        InterfaceC6348eT interfaceC6348eT = this.A00;
        if (interfaceC6348eT != null) {
            interfaceC6348eT.onStop();
        }
    }

    public final void A02(InterfaceC6348eT interfaceC6348eT) {
        this.A00 = interfaceC6348eT;
    }
}
