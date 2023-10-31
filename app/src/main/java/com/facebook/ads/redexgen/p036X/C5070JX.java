package com.facebook.ads.redexgen.p036X;

import android.view.View;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.JX */
/* loaded from: assets/audience_network.dex */
public final class C5070JX {
    public final View A00;
    public final C5952Xx A01;
    public final InterfaceC5080Jh A02;
    public final String A03;
    public final HashMap<String, String> A04 = new HashMap<>();
    public final boolean A05;
    public final boolean A06;

    public C5070JX(C5952Xx c5952Xx, View view, String str, boolean z, boolean z2) {
        this.A03 = str;
        this.A01 = c5952Xx;
        this.A02 = c5952Xx.A08();
        this.A00 = view;
        this.A05 = z2;
        this.A06 = z;
    }

    public final View A00() {
        return this.A00;
    }

    public final C5952Xx A01() {
        return this.A01;
    }

    public final InterfaceC5080Jh A02() {
        return this.A02;
    }

    public final String A03() {
        return this.A03;
    }

    public final Map<String, String> A04() {
        return Collections.unmodifiableMap(this.A04);
    }

    public final boolean A05() {
        return this.A05;
    }

    public final boolean A06() {
        return this.A06;
    }
}
