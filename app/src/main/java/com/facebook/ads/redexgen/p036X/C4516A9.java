package com.facebook.ads.redexgen.p036X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.A9 */
/* loaded from: assets/audience_network.dex */
public final class C4516A9 extends AbstractC5645Sw implements InterfaceC5286N7 {
    public static byte[] A0D;
    public static String[] A0E = {"QUFYIN7o4MSHfMbcaqgxGqdg8oING", "Qixa92rp7KQSHPhBId3L5m9SXc6gxNRP", "TUKhftCqFUFv9xNbjbPA3CLhBIkdW", "aNiMBj1VMT3xct4Co4hWzqTsg", "QYSCqyZ4CS", "VjIbmM2G6pRRrYhuKIf6SOzC6eQUF7eo", "KFJXOgKoK7JNlCBWMf", "dachHr6cLZKwbIDqTeRsc0FgbmZCJ"};
    @Nullable
    public View A00;
    public View A01;
    public C5953Xy A02;
    @Nullable
    public AbstractC5268Mp A03;
    public C5453Pq A04;
    @Nullable
    public C5006IT A05;
    public boolean A06;
    public final InterfaceC5269Mq A07;
    public final InterfaceC5369OT A08;
    public final C5370OU A09;
    public final C5483QK A0A;
    public final C5036Ix A0B;
    public final AtomicBoolean A0C;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 13);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{-53, -60, -39, -56, -30, -42, -41, -60, -43, -41, -52, -47, -54, -30, -60, -47, -52, -48, -60, -41, -52, -46, -47, -42, -30, -45, -49, -60, -36, -56, -57, -51, -48, -44, -58, -32, -45, -58, -40, -62, -45, -59, -32, -44, -60, -45, -58, -58, -49, -32, -44, -55, -48, -40, -49, -53, -75, -57, -45, -71, -62, -72, -45, -73, -75, -58, -72, -45, -57, -68, -61, -53, -62};
    }

    static {
        A07();
    }

    public C4516A9(C5385Oj c5385Oj) {
        super(c5385Oj, false);
        this.A0C = new AtomicBoolean(false);
        this.A06 = false;
        this.A02 = c5385Oj.A05();
        this.A03 = c5385Oj.A08();
        this.A01 = new View(this.A02);
        C5245MS.A0K(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        addView(this.A01, layoutParams);
        A04();
        this.A07 = c5385Oj.A09();
        C5379Od.A00(c5385Oj.A05(), this, getAdInfo().A0D().A07());
        this.A0A = A00(c5385Oj);
        getAdDetailsView().bringToFront();
        this.A0B = A01(c5385Oj);
        A0f();
        this.A04 = new C5453Pq(this.A02, c5385Oj.A06(), getAdDataBundle());
        this.A08 = new C5643Su(this);
        this.A09 = new C5370OU(c5385Oj, getAdDataBundle(), this.A0A, this.A0B, getAdDetailsView(), this.A07, this.A08);
    }

    private C5483QK A00(C5385Oj c5385Oj) {
        C5483QK c5483qk = (C5483QK) c5385Oj.A02();
        int A0e = A0e(c5385Oj.A08());
        ImageView imageView = (ImageView) c5385Oj.A03();
        imageView.setPadding(AbstractC5645Sw.A0D, AbstractC5645Sw.A0D, AbstractC5645Sw.A0D, AbstractC5645Sw.A0D);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC5645Sw.A0E, AbstractC5645Sw.A0E);
        layoutParams.setMargins(0, A0e, AbstractC5645Sw.A0C, 0);
        layoutParams.addRule(11);
        layoutParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(13);
        addView(c5483qk, layoutParams2);
        c5483qk.addView(imageView, layoutParams);
        return c5483qk;
    }

    private C5036Ix A01(C5385Oj c5385Oj) {
        C5036Ix A0A = c5385Oj.A0A();
        A0A.A06(-1, AbstractC5645Sw.A09);
        A0A.setPadding(AbstractC5645Sw.A0H, AbstractC5645Sw.A0H, AbstractC5645Sw.A0H, AbstractC5645Sw.A0H);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, AbstractC5645Sw.A0G);
        layoutParams.addRule(12);
        addView(A0A, layoutParams);
        return A0A;
    }

    private void A03() {
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A0E();
            this.A0A.A0d(getAnimationPlugin());
        }
    }

    private void A04() {
        AbstractC5268Mp abstractC5268Mp = this.A03;
        if (abstractC5268Mp == null) {
            return;
        }
        this.A05 = new C5006IT(abstractC5268Mp, 400, -abstractC5268Mp.getToolbarHeight(), 0);
    }

    private void A05() {
        new C5088Jp(getAdDataBundle().A0U(), getAdEventManager()).A02(EnumC5087Jo.A0r, null);
        if (!getAdInfo().A0O()) {
            return;
        }
        this.A0C.set(true);
        C5245MS.A0T(this);
        C5245MS.A0H(this.A0A);
        C5245MS.A0Z(this.A0A, this.A0B, this.A09, this.A00);
        C5245MS.A0L(this.A03);
        C5453Pq c5453Pq = this.A04;
        View$OnClickListenerC5650T1 ctaButton = getCtaButton();
        String[] strArr = A0E;
        if (strArr[2].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        A0E[3] = "FxfG3zWETYKhpCEsP1aqGpvXk";
        Pair<EnumC5452Pp, View> A03 = c5453Pq.A03(ctaButton);
        this.A00 = (View) A03.second;
        int i = C5386Ok.A00[((EnumC5452Pp) A03.first).ordinal()];
        if (i == 1) {
            getAdDetailsView().setVisibility(0);
            RelativeLayout.LayoutParams screenshotParams = new RelativeLayout.LayoutParams(-1, -1);
            screenshotParams.setMargins(0, A0e(this.A03), 0, 0);
            screenshotParams.addRule(2, getAdDetailsView().getId());
            addView(this.A00, screenshotParams);
        } else if (i != 2) {
        } else {
            C5245MS.A0Z(getAdDetailsView());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.setMargins(AbstractC5645Sw.A0F, AbstractC5645Sw.A0F, AbstractC5645Sw.A0F, AbstractC5645Sw.A0F);
            addView(this.A00, layoutParams);
        }
    }

    private void A06() {
        C5006IT c5006it = this.A05;
        if (c5006it != null) {
            c5006it.A3M(true, false);
        }
        if (getAdDetailsAnimation() != null) {
            getAdDetailsAnimation().A3M(true, false);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final void A09(C439788 c439788) {
        super.A09(c439788);
        A05();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final void A0A(C439484 c439484) {
        super.A0A(c439484);
        int duration = this.A0A.getDuration() - c439484.A00();
        if (getAnimationPlugin() != null) {
            int remainingVideoTimeInMillis = A0E[1].charAt(18);
            if (remainingVideoTimeInMillis != 51) {
                throw new RuntimeException();
            }
            A0E[5] = "xiBnzSw2W6K3rvYkwdUGMYXv5m3ZqRWR";
            if (duration < 3000 && getAnimationPlugin().A0J()) {
                getAnimationPlugin().A0F();
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final void A0W() {
        super.A0W();
        A03();
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5645Sw, com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final void A0b(C39781B c39781b, String str, double d, @Nullable Bundle bundle) {
        super.A0b(c39781b, str, d, bundle);
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!bundle.getBoolean(A02(0, 31, 118), false)) {
            A06();
        }
        if (bundle.getBoolean(A02(55, 18, 103), false)) {
            A05();
        }
        if (bundle.getBoolean(A02(31, 24, 116), false)) {
            C5370OU c5370ou = this.A09;
            if (A0E[1].charAt(18) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[2] = "jjtMTZWEM7Dg1szUnnnmuTjwvMhej";
            strArr[0] = "cexdZia4vusGbXInA5fVVHDcQrSB4";
            c5370ou.A07(this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final boolean A0c() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final boolean A0d(boolean z) {
        if (z && !this.A06) {
            boolean z2 = this.A0C.get();
            String[] strArr = A0E;
            if (strArr[7].length() != strArr[4].length()) {
                String[] strArr2 = A0E;
                strArr2[2] = "IfEmWBIDBUNw5tL7YhS4lNzldGhzw";
                strArr2[0] = "8CoNQoXVMdzgwU1krh95bRLsSKKH4";
                if (!z2) {
                    this.A09.A07(this);
                    return true;
                }
            }
            throw new RuntimeException();
        }
        boolean A0O = getAdInfo().A0O();
        if (A0E[5].charAt(17) != 'k') {
            A0E[1] = "YRUjLZqfjvY5EOxU383ujQcW8j7gUgor";
            if (A0O && !this.A0C.get()) {
                this.A0A.A0a(EnumC5464Q1.A08);
                return true;
            }
            return false;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5645Sw
    public final void A0f() {
        super.A0f();
        if (getAnimationPlugin() != null) {
            getAnimationPlugin().A8o(this.A0A);
        }
    }

    public final boolean A0g() {
        return getAdInfo().A0O();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        if (A0g() && !this.A0C.get()) {
            return 1;
        }
        return super.getCloseButtonStyle();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5645Sw, com.facebook.ads.redexgen.p036X.AbstractC5381Of, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
