package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8N */
/* loaded from: assets/audience_network.dex */
public final class C44088N extends AbstractC5613SQ {
    public static byte[] A0L;
    public static String[] A0M = {"Mriq29lS8vjEPztqvg4mnlhqPa1pf4jw", "J0ebGdEZD5oKohgNzUxMA3JiHaSF4bRJ", "IT9tvlYp44pYwsfxgtsksFS", "El43mrOkb3qqMjbYlNbneDDC3riKbt8u", "SsyQgLhJr8BA6K4Jeu0226NIXlotTSUK", "5pKSfcHcmxRzGJ6MCKbxSHPk9j0pnkgf", "vZ9Xs81YGHnjRjGsoTeSsIOHxP", "Y9Sammkz"};
    @Nullable
    public AbstractC5381Of A00;
    public C5454Pr A01;
    @Nullable
    public EnumC5469Q6 A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final InterfaceC421957 A09;
    public final C5460Px A0A;
    public final C5483QK A0B;
    public final C439889 A0C;
    public final AbstractC5285N6 A0D;
    public final AbstractC5283N4 A0E;
    public final AbstractC5216Lz A0F;
    public final AbstractC5200Lj A0G;
    public final AbstractC5161L4 A0H;
    public final AbstractC5160L3 A0I;
    public final C5125KS A0J;
    public final C5036Ix A0K;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 88);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0L = new byte[]{-3, 21, 7, 5, 21, -1};
    }

    static {
        A08();
    }

    public C44088N(C5953Xy c5953Xy, InterfaceC5296NI interfaceC5296NI, InterfaceC5080Jh interfaceC5080Jh, AbstractC397518 abstractC397518, C43657U c43657u, InterfaceC5269Mq interfaceC5269Mq) {
        super(c5953Xy, interfaceC5296NI, interfaceC5080Jh, abstractC397518, c43657u, interfaceC5269Mq);
        this.A09 = new C5606SJ(this);
        this.A0H = new AbstractC5161L4() { // from class: com.facebook.ads.redexgen.X.9C
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C5173LG c5173lg) {
                C44088N.this.A07 = true;
            }
        };
        this.A0G = new AbstractC5200Lj() { // from class: com.facebook.ads.redexgen.X.9B
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C5215Ly c5215Ly) {
                C44088N.this.A08 = true;
                C44088N.this.A0P();
            }
        };
        this.A0F = new AbstractC5216Lz() { // from class: com.facebook.ads.redexgen.X.9A
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            public final /* bridge */ /* synthetic */ void A03(C439585 c439585) {
            }
        };
        this.A0I = new AbstractC5160L3() { // from class: com.facebook.ads.redexgen.X.92
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C439484 c439484) {
                AbstractC5381Of abstractC5381Of;
                C44088N.this.A0F(c439484);
                C44088N.this.A0E(c439484);
                abstractC5381Of = C44088N.this.A00;
                abstractC5381Of.A0A(c439484);
            }
        };
        this.A0D = new AbstractC5285N6() { // from class: com.facebook.ads.redexgen.X.8v
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C439788 c439788) {
                C5483QK c5483qk;
                C44088N c44088n = C44088N.this;
                c5483qk = c44088n.A0B;
                c44088n.A0D(c439788, c5483qk.getState() != EnumC5518Qt.A06, false);
            }
        };
        this.A0E = new C44118Q(this);
        boolean z = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = false;
        this.A05 = false;
        this.A04 = false;
        this.A0B = new C5483QK(super.A03);
        this.A0B.setFunnelLoggingHandler(super.A05);
        this.A0B.getEventBus().A03(this.A0H, this.A0G, this.A0F, this.A0I, this.A0D, this.A0E);
        this.A0C = new C439889(super.A03, super.A04, this.A0B, super.A01.A0U());
        if (C5064JR.A1J(super.A03)) {
            this.A0A = new C5460Px(super.A03, super.A04, this.A0B, super.A01.A0U(), null);
        } else {
            this.A0A = null;
        }
        this.A01 = new C5454Pr(super.A03, super.A09, super.A01.A0a(), interfaceC5269Mq);
        this.A0J = new C5125KS(super.A03, super.A05);
        this.A0K = new C5036Ix(super.A03);
        A07();
        this.A0B.setVideoURI(super.A02.A0S(super.A01.A0O().A0D().A08()));
        A05();
        int A03 = super.A01.A0O().A0D().A03();
        if (C5064JR.A1d(super.A03)) {
            this.A05 = A03 == 0;
        } else {
            this.A05 = A03 <= 0;
        }
        if (super.A01.A0O().A0M() && super.A01.A0O().A0D().A02() > 0) {
            z = true;
        }
        this.A03 = z;
        C5245MS.A0M(this, super.A01.A0N().A01().A07(true));
        if (C5064JR.A1X(super.A03)) {
            super.A07.setProgressSpinnerInvisible(true);
        }
    }

    private AbstractC5381Of A00(int i) {
        return C5382Og.A00(new C5384Oi(super.A03, super.A04, super.A08, super.A01, this.A0B, super.A0A, super.A06).A0E(super.A07.getToolbarHeight()).A0H(super.A07).A0D(i).A0F(this.A0J).A0I(this.A0K).A0J(), null, true);
    }

    private void A04() {
        this.A0B.postDelayed(new C5605SI(this), C5064JR.A0I(super.A03));
    }

    private void A05() {
        this.A0B.postDelayed(new C5604SH(this), C5064JR.A0J(super.A03));
    }

    private void A06() {
        this.A05 = true;
        AbstractC5381Of abstractC5381Of = this.A00;
        if (abstractC5381Of != null) {
            abstractC5381Of.A0Z();
        }
    }

    private void A07() {
        this.A0B.A0c(this.A0K);
        this.A0B.A0c(this.A0J);
        if (!TextUtils.isEmpty(super.A01.A0O().A0D().A07())) {
            C43797m c43797m = new C43797m(super.A03);
            this.A0B.A0c(c43797m);
            c43797m.setImage(super.A01.A0O().A0D().A07());
        }
        C43246p c43246p = new C43246p(super.A03, true, super.A05);
        this.A0B.A0c(c43246p);
        this.A0B.A0c(new C5126KT(c43246p, EnumC5482QJ.A03, true));
        this.A0B.A0c(new C43737c(super.A03));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C439788 c439788, boolean z, boolean z2) {
        if (this.A06) {
            return;
        }
        if (A0M[6].length() != 26) {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[2] = "N5ZIPH8mvSXK1CHoPTlSEsF";
        strArr[7] = "PVGkj9Ta";
        this.A06 = true;
        if (!this.A05) {
            A06();
        }
        AbstractC5381Of abstractC5381Of = this.A00;
        if (abstractC5381Of != null) {
            abstractC5381Of.A09(c439788);
        }
        super.A07.setToolbarActionMessage(A03(0, 0, 25));
        A0H(z, z2);
        super.A07.setToolbarActionMode(getCloseButtonStyle());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C439484 c439484) {
        if (this.A0B.getState() == EnumC5518Qt.A02 && C5064JR.A11(super.A03)) {
            this.A0B.postDelayed(new C5607SK(this, c439484), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(C439484 c439484) {
        int A00 = c439484.A00();
        if (this.A03) {
            int A02 = super.A01.A0O().A0D().A02() - (A00 / 1000);
            if (A02 > 0) {
                super.A07.setToolbarActionMessage(super.A01.A0S().A00().replace(A03(0, 6, 74), String.valueOf(A02)));
            } else {
                super.A07.setToolbarActionMessage(A03(0, 0, 25));
                A0H(false, false);
            }
        }
        float min = A00 / Math.min(super.A01.A0O().A0D().A03() * 1000.0f, this.A0B.getDuration());
        super.A07.setProgress(100.0f * min);
        if (min >= 1.0f && !this.A05) {
            A06();
            String[] strArr = A0M;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[0] = "PXM0w4DTcyhv6xVVxlaJPbpxowOdlGPl";
            strArr2[4] = "ZagmJHoPVKqTZKI94Zh80WtjAbW4VeCE";
            super.A07.setToolbarActionMode(getCloseButtonStyle());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(String str) {
        int i = 0;
        int i2 = 0;
        C5483QK c5483qk = this.A0B;
        if (c5483qk != null) {
            i = c5483qk.getCurrentPositionInMillis();
            i2 = this.A0B.getDuration();
            this.A0B.A0Z(3);
        }
        super.A03.A0D().A2n(str);
        if (C5064JR.A12(super.A03)) {
            A0D(new C439788(i, i2), false, true);
            return;
        }
        InterfaceC5269Mq interfaceC5269Mq = super.A08;
        if (A0M[3].charAt(0) == 'z') {
            throw new RuntimeException();
        }
        A0M[3] = "uhCmlX27t5rzSWT78KYVdoY12DutI5Be";
        interfaceC5269Mq.A3s(super.A09.A6Z());
        super.A08.A3s(super.A09.A6U());
    }

    private synchronized void A0H(boolean z, boolean z2) {
        if (this.A03 && !z && !z2) {
            super.A08.A3s(super.A09.A5a());
            this.A01.A05();
            this.A03 = false;
            if (this.A00 != null) {
                this.A00.A0X();
            }
            return;
        }
        this.A03 = false;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5613SQ
    public final void A0Q() {
        C5245MS.A0L(this.A00);
        C5245MS.A0L(super.A07);
        this.A0B.setVolume(super.A01.A0O().A0D().A09() ? 0.0f : 1.0f);
        this.A0B.A0b(EnumC5469Q6.A02, 20);
        AbstractC5381Of abstractC5381Of = this.A00;
        if (abstractC5381Of != null && this.A03) {
            abstractC5381Of.A0Y();
        }
        AbstractC5381Of abstractC5381Of2 = this.A00;
        if (abstractC5381Of2 != null && !this.A05) {
            abstractC5381Of2.A0a();
        }
        A04();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5613SQ
    public final void A0S(C422159 c422159) {
        c422159.A0K(this.A09);
        this.A00 = A00(c422159.A0H().getResources().getConfiguration().orientation);
        addView(this.A00, AbstractC5613SQ.A0D);
        addView(super.A07, new FrameLayout.LayoutParams(-1, super.A07.getToolbarHeight()));
        C5245MS.A0H(this.A00);
        C5245MS.A0H(super.A07);
        AbstractC5381Of abstractC5381Of = this.A00;
        setUpFullscreenMode(abstractC5381Of != null && abstractC5381Of.A0c());
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5613SQ
    public final boolean A0T() {
        AbstractC5381Of abstractC5381Of = this.A00;
        return abstractC5381Of != null && abstractC5381Of.A0d(this.A03);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void ABj(boolean z) {
        if (this.A0B.A0i()) {
            return;
        }
        this.A02 = this.A0B.getVideoStartReason();
        this.A04 = z;
        this.A0B.A0e(false, 13);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void AC8(boolean z) {
        if (this.A0B.A0j() || this.A06 || this.A0B.getState() == EnumC5518Qt.A06 || this.A02 == null) {
            return;
        }
        if (!this.A04 || z) {
            C5483QK c5483qk = this.A0B;
            EnumC5469Q6 enumC5469Q6 = this.A02;
            String[] strArr = A0M;
            if (strArr[0].charAt(8) == strArr[4].charAt(8)) {
                throw new RuntimeException();
            }
            A0M[1] = "5vrQw9TAnlgebYwA7tbvLzoGHglPMjBr";
            c5483qk.A0b(enumC5469Q6, 19);
        }
    }

    private int getCloseButtonStyle() {
        AbstractC5381Of abstractC5381Of = this.A00;
        if (abstractC5381Of != null) {
            return abstractC5381Of.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5613SQ, com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void onDestroy() {
        super.onDestroy();
        if (C5064JR.A1I(super.A03)) {
            super.A03.A09().AFF(this.A0B);
        }
        AbstractC5381Of abstractC5381Of = this.A00;
        if (abstractC5381Of != null) {
            abstractC5381Of.A0W();
        }
        C5483QK c5483qk = this.A0B;
        if (c5483qk != null) {
            if (!this.A06) {
                c5483qk.A0a(EnumC5464Q1.A05);
            }
            this.A0B.getEventBus().A04(this.A0H, this.A0G, this.A0F, this.A0I, this.A0D, this.A0E);
            this.A0B.A0V();
        }
        C5460Px c5460Px = this.A0A;
        if (c5460Px != null) {
            c5460Px.A0A();
        }
        this.A0C.A0g();
    }

    @VisibleForTesting
    public void setServerSideRewardHandler(C5454Pr c5454Pr) {
        this.A01 = c5454Pr;
    }
}
