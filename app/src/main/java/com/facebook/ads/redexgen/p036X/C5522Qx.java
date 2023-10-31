package com.facebook.ads.redexgen.p036X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Qx */
/* loaded from: assets/audience_network.dex */
public final class C5522Qx {
    public float A00;
    public EnumC39320Q A01;
    public Map<String, String> A02;

    public C5522Qx(EnumC39320Q enumC39320Q) {
        this(enumC39320Q, 0.0f);
    }

    public C5522Qx(EnumC39320Q enumC39320Q, float f) {
        this(enumC39320Q, f, null);
    }

    public C5522Qx(EnumC39320Q enumC39320Q, float f, Map<String, String> map) {
        this.A01 = enumC39320Q;
        this.A00 = f;
        if (map != null) {
            this.A02 = map;
            return;
        }
        Map<String, String> windowParams = new HashMap<>();
        this.A02 = windowParams;
    }

    public final float A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01.A02();
    }

    public final EnumC39320Q A02() {
        return this.A01;
    }

    public final Map<String, String> A03() {
        return this.A02;
    }

    public final boolean A04() {
        return this.A01 == EnumC39320Q.A0J;
    }
}
