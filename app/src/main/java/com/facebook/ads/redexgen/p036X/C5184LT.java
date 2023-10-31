package com.facebook.ads.redexgen.p036X;

import androidx.annotation.VisibleForTesting;

/* renamed from: com.facebook.ads.redexgen.X.LT */
/* loaded from: assets/audience_network.dex */
public final class C5184LT {
    public static final C5184LT A04 = new C5184LT(new C5705Tv(), new C5704Tu());
    public final InterfaceC5183LS A02;
    public final InterfaceC5235MI A03;
    public boolean A01 = true;
    public long A00 = -1;

    @VisibleForTesting
    public C5184LT(InterfaceC5235MI interfaceC5235MI, InterfaceC5183LS interfaceC5183LS) {
        this.A03 = interfaceC5235MI;
        this.A02 = interfaceC5183LS;
    }

    public static C5184LT A00() {
        return A04;
    }

    public final synchronized void A01() {
        this.A01 = false;
        this.A00 = this.A03.A4g();
    }

    public final synchronized void A02() {
        this.A00 = -1L;
    }

    public final boolean A03() {
        boolean z = true;
        if (this.A02.A6r() != null) {
            return true;
        }
        synchronized (C5184LT.class) {
            if (this.A01) {
                return true;
            }
            if (this.A00 >= 0 && this.A03.A4g() - this.A00 >= 1000) {
                z = false;
            }
            return z;
        }
    }
}
