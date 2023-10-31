package com.facebook.ads.redexgen.p036X;

import java.io.Serializable;

/* renamed from: com.facebook.ads.redexgen.X.2C */
/* loaded from: assets/audience_network.dex */
public final class C40412C implements Serializable {
    public C40402B A00;
    public C40402B A01;

    public C40412C() {
        this(0.5d, 0.5d);
    }

    public C40412C(double d) {
        this(d, 0.5d);
    }

    public C40412C(double d, double d2) {
        this.A00 = new C40402B(d);
        this.A01 = new C40402B(d2);
        A02();
    }

    public final C40402B A00() {
        return this.A00;
    }

    public final C40402B A01() {
        return this.A01;
    }

    public final void A02() {
        this.A00.A06();
        this.A01.A06();
    }

    public final void A03() {
        this.A00.A07();
        this.A01.A07();
    }

    public final void A04(double d, double d2) {
        this.A00.A08(d, d2);
    }

    public final void A05(double d, double d2) {
        this.A01.A08(d, d2);
    }
}
