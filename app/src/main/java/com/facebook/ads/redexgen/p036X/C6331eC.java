package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.view.View;
import androidx.annotation.Nullable;
import com.facebook.infer.annotation.Nullsafe;

@Nullsafe(Nullsafe.Mode.LOCAL)
/* renamed from: com.facebook.ads.redexgen.X.eC */
/* loaded from: assets/audience_network.dex */
public final class C6331eC {
    public final C6342eN A00;
    public final C6340eL A01;

    public C6331eC(AbstractC6347eS abstractC6347eS, C6340eL c6340eL, C6342eN c6342eN) {
        this.A00 = c6342eN;
        this.A01 = c6340eL;
        abstractC6347eS.A02(new C4875GK(c6340eL));
    }

    public static C6331eC A00(AbstractC6347eS abstractC6347eS, InterfaceC6351eW interfaceC6351eW, InterfaceC4876GL interfaceC4876GL) {
        C6342eN c6342eN = new C6342eN();
        return new C6331eC(abstractC6347eS, new C6340eL(interfaceC6351eW, new C4880GP(), interfaceC4876GL, c6342eN, new Handler()), c6342eN);
    }

    public final void A01(View view) {
        this.A00.A01(view);
    }

    public final void A02(View view, C6349eU c6349eU) {
        this.A00.A02(view, c6349eU);
    }

    public final void A03(@Nullable InterfaceC6346eR interfaceC6346eR) {
        this.A01.A0B(interfaceC6346eR);
    }

    public final void A04(@Nullable InterfaceC6344eP interfaceC6344eP) {
        this.A01.A0C(interfaceC6344eP);
    }
}
