package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import java.util.EnumSet;

/* renamed from: com.facebook.ads.redexgen.X.FK */
/* loaded from: assets/audience_network.dex */
public final class C4815FK extends AbstractC6252cq {
    public static String[] A02 = {"Wdifh5HSN4RyvogFUrIVqQJQULlKdEei", "S34yOHPbjBOZXrhEKXqsFwPvtnd1qciy", "vu9eRI", "x0OqZ", "VYF0eZRg0jpnLcLhIoRoBnoO3djZf6SI", "33GTCt01Ki3rQT8tpwoWMPFpMqFvVQrj", "pa13jV0ykdfTm6Oo414mEZE7qu5xzGka", "tj8XsVszyFe6dIsjKXzcwTwgC3z6jHVp"};
    @VisibleForTesting
    public static final InterfaceC403021 A03 = new C6241cf();
    @Nullable
    public C6246ck A00;
    public final C402920 A01;

    public C4815FK(C402920 c402920) {
        super(c402920.A05(), A03.A4N(c402920));
        this.A01 = c402920;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6252cq
    public final void A05() {
        C6246ck c6246ck = this.A00;
        if (c6246ck != null) {
            c6246ck.A0F();
        }
        InterfaceC40241v interfaceC40241v = super.A00;
        EnumC40231u enumC40231u = EnumC40231u.A04;
        if (A02[1].charAt(8) == 'f') {
            throw new RuntimeException();
        }
        A02[4] = "bjBCaQy28rNQq0pISHtZZouKJ3cbndZJ";
        interfaceC40241v.AEV(enumC40231u);
    }

    public final C6246ck A07() {
        return this.A00;
    }

    public final void A08() {
        this.A00 = new C6246ck(this.A01, this, this.A02);
        this.A00.A0I(this.A01.A0A(), this.A01.A06());
    }

    public final void A09(InterstitialAd interstitialAd, EnumSet<CacheFlag> enumSet, @Nullable String str) {
        if (super.A00.A5K()) {
            return;
        }
        this.A01.A0C(interstitialAd);
        C6246ck c6246ck = this.A00;
        if (c6246ck != null) {
            c6246ck.A0I(enumSet, str);
            return;
        }
        this.A01.A0J(enumSet);
        this.A01.A0G(str);
        A08();
    }

    public final boolean A0A() {
        C6246ck c6246ck = this.A00;
        if (c6246ck != null) {
            return c6246ck.A0J();
        }
        if (this.A01.A00() > 0) {
            int i = (C5236MJ.A00() > this.A01.A00() ? 1 : (C5236MJ.A00() == this.A01.A00() ? 0 : -1));
            if (A02[0].charAt(6) == 'y') {
                throw new RuntimeException();
            }
            A02[4] = "spPOKGUnJm6foAMMjUQWH3rPbfiGZlB3";
            if (i > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0B() {
        C6246ck c6246ck = this.A00;
        if (c6246ck != null) {
            return c6246ck.A0K();
        }
        return super.A00.A5d() == EnumC40231u.A06;
    }

    public final boolean A0C(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A5L()) {
            return false;
        }
        this.A01.A0C(interstitialAd);
        C6246ck c6246ck = this.A00;
        if (c6246ck != null) {
            return c6246ck.A0L();
        }
        this.A00 = new C6246ck(this.A01, this, this.A02);
        this.A00.A0L();
        return false;
    }
}
