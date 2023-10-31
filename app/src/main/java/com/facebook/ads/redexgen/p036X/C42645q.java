package com.facebook.ads.redexgen.p036X;

/* renamed from: com.facebook.ads.redexgen.X.5q */
/* loaded from: assets/audience_network.dex */
public final class C42645q {
    public final long A00;
    public final EnumC42635p A01;
    public final String A02;
    public final boolean A03;

    public C42645q(String str, boolean z, EnumC42635p enumC42635p) {
        this(str, z, enumC42635p, System.currentTimeMillis());
    }

    public C42645q(String str, boolean z, EnumC42635p enumC42635p, long j) {
        this.A02 = str;
        this.A03 = z;
        this.A01 = enumC42635p;
        this.A00 = j;
    }

    public static C42645q A00() {
        return new C42645q("", true, EnumC42635p.A06, -1L);
    }

    public final long A01() {
        return this.A00;
    }

    public final EnumC42635p A02() {
        return this.A01;
    }

    public final String A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A03;
    }
}
