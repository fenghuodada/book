package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Jd */
/* loaded from: assets/audience_network.dex */
public class C5076Jd {
    public double A00;
    public EnumC5082Jj A01;
    public EnumC5083Jk A02;
    public String A03;
    public String A04;
    @Nullable
    public Map<String, String> A05;
    public boolean A06;

    public final C5076Jd A00(double d) {
        this.A00 = d;
        return this;
    }

    public final C5076Jd A01(EnumC5082Jj enumC5082Jj) {
        this.A01 = enumC5082Jj;
        return this;
    }

    public final C5076Jd A02(EnumC5083Jk enumC5083Jk) {
        this.A02 = enumC5083Jk;
        return this;
    }

    public final C5076Jd A03(String str) {
        this.A03 = str;
        return this;
    }

    public final C5076Jd A04(String str) {
        this.A04 = str;
        return this;
    }

    public final C5076Jd A05(@Nullable Map<String, String> mData) {
        this.A05 = mData;
        return this;
    }

    public final C5076Jd A06(boolean z) {
        this.A06 = z;
        return this;
    }

    public final C5077Je A07(C44148U c44148u) {
        return new C5077Je(c44148u, this.A04, this.A00, this.A03, this.A05, this.A01, this.A02, this.A06);
    }
}
