package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.PP */
/* loaded from: assets/audience_network.dex */
public final class C5426PP {
    @Nullable
    public String A02;
    @Nullable
    public String A03;
    public final C39851I A04;
    public final C39971U A05;
    public final C5953Xy A06;
    public C39871K A01 = C39871K.A01(null);
    public int A00 = 1000;

    public C5426PP(C5953Xy c5953Xy, C39851I c39851i, C39971U c39971u) {
        this.A06 = c5953Xy;
        this.A04 = c39851i;
        this.A05 = c39971u;
    }

    public static /* synthetic */ int A00(C5426PP c5426pp) {
        return c5426pp.A00;
    }

    public static /* synthetic */ C39851I A01(C5426PP c5426pp) {
        return c5426pp.A04;
    }

    public static /* synthetic */ C39871K A02(C5426PP c5426pp) {
        return c5426pp.A01;
    }

    public static /* synthetic */ C39971U A03(C5426PP c5426pp) {
        return c5426pp.A05;
    }

    public static /* synthetic */ C5953Xy A04(C5426PP c5426pp) {
        return c5426pp.A06;
    }

    public static /* synthetic */ String A05(C5426PP c5426pp) {
        return c5426pp.A03;
    }

    public static /* synthetic */ String A06(C5426PP c5426pp) {
        return c5426pp.A02;
    }

    public final C5426PP A07(int i) {
        this.A00 = i;
        return this;
    }

    public final C5426PP A08(C39871K c39871k) {
        this.A01 = c39871k;
        return this;
    }

    public final C5426PP A09(String str) {
        this.A02 = str;
        return this;
    }

    public final C5426PP A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final C5428PR A0B() {
        return new C5428PR(this, null);
    }
}
