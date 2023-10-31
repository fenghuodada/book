package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.HU */
/* loaded from: assets/audience_network.dex */
public final class C4945HU {
    public final int A00;
    public final C4942HR A01;
    @Nullable
    public final Object A02;
    public final C4563Av[] A03;

    public C4945HU(C4563Av[] c4563AvArr, InterfaceC4941HQ[] interfaceC4941HQArr, @Nullable Object obj) {
        this.A03 = c4563AvArr;
        this.A01 = new C4942HR(interfaceC4941HQArr);
        this.A02 = obj;
        this.A00 = c4563AvArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(C4945HU c4945hu) {
        if (c4945hu == null || c4945hu.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i = 0; i < this.A01.A01; i++) {
            if (!A02(c4945hu, i)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(C4945HU c4945hu, int i) {
        return c4945hu != null && C5038Iz.A0g(this.A03[i], c4945hu.A03[i]) && C5038Iz.A0g(this.A01.A00(i), c4945hu.A01.A00(i));
    }
}
