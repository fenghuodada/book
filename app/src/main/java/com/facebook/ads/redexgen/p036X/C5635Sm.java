package com.facebook.ads.redexgen.p036X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Sm */
/* loaded from: assets/audience_network.dex */
public final class C5635Sm extends AbstractC5381Of {
    @Nullable
    public static C5635Sm A0S;
    public static byte[] A0T;
    public static String[] A0U = {"E7d9V", "HfiTPdnQE6JsOHdYoOA4lRNnbQ3", "7AVXCU5oRbsgBqmorHmAVCwb6r5tuTQ8", "hoWzaZbN7yXesQFa", "a3ZYa3", "EXUfJIeYYGyfdCGOPOS2l0on83CPH94Z", "MYJwByDzw5bCUSkxw6qgTJ7WJbI", "X3l5ZIwYV4"};
    public static final int A0V;
    public static final int A0W;
    public static final int A0X;
    public static final int A0Y;
    public static final int A0Z;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View A06;
    public LinearLayout A07;
    public LinearLayout A08;
    public TextView A09;
    public AbstractC397518 A0A;
    public C5332Ns A0B;
    public C5333Nt A0C;
    @Nullable
    public C5663TE A0D;
    public C5385Oj A0E;
    public C5392Oq A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public final View A0M;
    public final AbstractC39470f A0N;
    public final C5088Jp A0O;
    public final InterfaceC5369OT A0P;
    public final C5370OU A0Q;
    public final C5036Ix A0R;

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0T, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A0K() {
        A0T = new byte[]{36};
    }

    static {
        A0K();
        A0X = (int) (C5208Lr.A00 * 26.0f);
        A0V = (int) (C5208Lr.A00 * 4.0f);
        A0Z = (int) (C5208Lr.A00 * 8.0f);
        A0W = C40592U.A01(-1, 77);
        A0Y = (int) (C5208Lr.A00 * 12.0f);
        A0S = null;
    }

    public C5635Sm(C5385Oj c5385Oj) {
        super(c5385Oj, true);
        this.A01 = 0;
        this.A0G = false;
        this.A0I = false;
        this.A0K = false;
        this.A0J = false;
        this.A0L = false;
        this.A0E = c5385Oj;
        this.A0A = this.A0E.A04();
        this.A0O = new C5088Jp(c5385Oj.A04().A0U(), c5385Oj.A06());
        this.A0R = this.A0E.A0A();
        C5036Ix c5036Ix = this.A0R;
        if (c5036Ix != null) {
            C5245MS.A0K(c5036Ix);
        }
        this.A0M = this.A0E.A03();
        this.A0N = C39480g.A01(c5385Oj.A05(), c5385Oj.A06(), c5385Oj.A04().A0U(), C5191La.A00(c5385Oj.A04().A0O().A0F().A05()), new HashMap(), false, true);
        C5379Od.A00(c5385Oj.A05(), this, c5385Oj.A04().A0O().A0D().A07());
        setupLayoutConfiguration(false);
        A0G();
        A0C();
        postDelayed(new C5641Ss(this), 1000L);
        A0J();
        this.A0P = new C5640Sr(this);
        this.A0Q = new C5370OU(c5385Oj, this.A0A, this.A0E.A02() instanceof C5483QK ? (C5483QK) this.A0E.A02() : null, this.A0E.A09(), this.A0P, this.A09, this.A0F, this.A0R, this.A0M);
    }

    private void A0B() {
        C5245MS.A0J(this.A08);
        this.A08 = new LinearLayout(this.A0E.A05());
        C5245MS.A0R(this.A08, getAdContextWrapper());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0G ? this.A02 / 4 : this.A02 / 5);
        layoutParams.addRule(12);
        this.A08.setLayoutParams(layoutParams);
        addView(this.A08, 2);
    }

    private void A0C() {
        C5245MS.A0J(this.A07);
        this.A07 = new LinearLayout(this.A0E.A05());
        this.A07.setOrientation(1);
        C5245MS.A0K(this.A07);
        A0H();
        this.A07.setBackgroundColor(-1);
        addView(this.A07);
    }

    private void A0D() {
        View view = this.A0M;
        if (view != null) {
            C5245MS.A0J(view);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC5381Of.A09, AbstractC5381Of.A09);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(AbstractC5381Of.A08, this.A05, AbstractC5381Of.A08, AbstractC5381Of.A08);
            addView(this.A0M, layoutParams);
        }
    }

    private void A0E() {
        C5036Ix c5036Ix = this.A0R;
        if (c5036Ix != null) {
            C5245MS.A0J(c5036Ix);
            C5036Ix c5036Ix2 = this.A0R;
            int i = A0Y;
            c5036Ix2.setPadding(i, i, i, i);
            this.A0R.A06(-1, A0W);
            this.A0R.setTranslationY(0.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0X);
            if (this.A0H) {
                layoutParams.addRule(8, this.A06.getId());
            } else {
                String[] strArr = A0U;
                if (strArr[3].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0U;
                strArr2[3] = "zjul6o0OG2Ezis8Q";
                strArr2[0] = "LmcEL";
                layoutParams.addRule(12);
            }
            addView(this.A0R, layoutParams);
        }
    }

    private void A0F() {
        AbstractC5268Mp A08 = this.A0E.A08();
        if (A08 == null) {
            return;
        }
        A08.setPageDetailsVisible((this.A0H || A08.A05()) ? false : true);
    }

    private void A0G() {
        this.A06 = this.A0E.A02();
        C5245MS.A0J(this.A06);
        C5245MS.A0K(this.A06);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        addView(this.A06, 1, layoutParams);
        this.A09 = new TextView(this.A0E.A05());
        C5245MS.A0K(this.A09);
        this.A09.setGravity(17);
        this.A09.setTextColor(getColors().A05(true));
        this.A09.setEllipsize(TextUtils.TruncateAt.END);
        this.A09.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        int i = A0Z;
        layoutParams2.setMargins(i, i / 2, i, this.A0R == null ? i : A0X);
        addView(this.A09, layoutParams2);
        C5245MS.A0K(this.A09);
        C5385Oj c5385Oj = this.A0E;
        this.A0F = new C5392Oq(c5385Oj, c5385Oj.A04().A0O().A0F().A04(), getColors(), new C5639Sq(this));
        C5245MS.A0G(1001, this.A0F);
        addView(this.A0F);
        A0I();
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (this.A03 * 4) / 5);
        if (A0e()) {
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.addRule(12);
            LinearLayout linearLayout = this.A07;
            String[] strArr = A0U;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0U;
            strArr2[7] = "mOqhFUC5R4";
            strArr2[4] = "x2rQdK";
            linearLayout.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A03 + 1, 0, 0);
        }
        this.A07.setTranslationY(0.0f);
        this.A07.setLayoutParams(layoutParams);
    }

    private void A0I() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.A0G ? this.A02 / 4 : this.A02 / 5);
        layoutParams.addRule(14);
        layoutParams.addRule(2, this.A09.getId());
        layoutParams.setMargins(0, 0, 0, 0);
        this.A0F.setLayoutParams(layoutParams);
    }

    private void A0J() {
        A0E();
        A0D();
        A0F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(String str) {
        C5663TE c5663te;
        C5245MS.A0J(this.A0D);
        C5637So c5637So = new C5637So(this);
        if (this.A0E.A05().A0C() == null) {
            this.A0E.A05().A0D().A88();
        }
        if (C5065JS.A02(this.A0E.A05()) || this.A0E.A05().A0C() == null) {
            c5663te = new C5663TE(this.A0E.A05(), c5637So);
        } else {
            c5663te = new C5663TE(this.A0E.A05(), this.A0E.A05().A0C(), c5637So);
        }
        this.A0D = c5663te;
        setUpBrowserControls(this.A0D);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A07.addView(this.A0D, layoutParams);
        this.A0D.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P(boolean z) {
        ObjectAnimator objectAnimator;
        int i;
        int i2;
        long j;
        int i3;
        this.A0H = z;
        postDelayed(new C5636Sn(this, z), 250L);
        ObjectAnimator ctaTransAnim = null;
        String A0A = A0A(0, 1, 39);
        if (z) {
            C5392Oq c5392Oq = this.A0F;
            objectAnimator = ObjectAnimator.ofFloat(c5392Oq, A0A, c5392Oq.getY(), this.A03 / 5);
        } else {
            objectAnimator = null;
        }
        LinearLayout linearLayout = this.A07;
        float[] fArr = new float[2];
        fArr[0] = linearLayout.getY();
        int i4 = this.A03;
        if (z) {
            i4 /= 5;
        }
        fArr[1] = i4;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, A0A, fArr);
        ofFloat.setDuration(500L);
        int i5 = (this.A03 / 2) - (this.A01 / 2);
        View view = this.A06;
        float[] fArr2 = new float[2];
        fArr2[0] = view.getY();
        fArr2[1] = (z || this.A0G) ? 0.0f : i5;
        ObjectAnimator browserTransAnim = ObjectAnimator.ofFloat(view, A0A, fArr2);
        browserTransAnim.setDuration(500L);
        C5036Ix c5036Ix = this.A0R;
        int height = c5036Ix == null ? 0 : c5036Ix.getHeight();
        if (z) {
            int i6 = this.A02;
            String[] strArr = A0U;
            if (strArr[6].length() == strArr[1].length()) {
                String[] strArr2 = A0U;
                strArr2[7] = "g83HcTndNM";
                strArr2[4] = "KO02it";
                i = (i6 / 5) - height;
            }
            throw new RuntimeException();
        }
        i = (this.A03 - A0X) - A0Z;
        C5036Ix c5036Ix2 = this.A0R;
        if (c5036Ix2 != null) {
            float[] fArr3 = new float[2];
            fArr3[0] = c5036Ix2.getY();
            String[] strArr3 = A0U;
            if (strArr3[6].length() == strArr3[1].length()) {
                A0U[2] = "uMAfPHErUq8gYLqYGWwvrPw2H7I5hxcd";
                fArr3[1] = i;
                ctaTransAnim = ObjectAnimator.ofFloat(c5036Ix2, A0A, fArr3);
            }
            throw new RuntimeException();
        }
        int[] iArr = new int[2];
        iArr[0] = this.A06.getHeight();
        if (z) {
            i2 = this.A03 / 5;
        } else {
            i2 = this.A01;
        }
        iArr[1] = i2;
        ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(500L);
        duration.addUpdateListener(new C5388Om(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, browserTransAnim, duration);
        if (objectAnimator != null) {
            j = 500;
            objectAnimator.setDuration(500L);
            i3 = 1;
            animatorSet.playTogether(objectAnimator);
        } else {
            j = 500;
            i3 = 1;
        }
        if (ctaTransAnim != null) {
            ctaTransAnim.setDuration(j);
            Animator[] animatorArr = new Animator[i3];
            animatorArr[0] = ctaTransAnim;
            animatorSet.playTogether(animatorArr);
        }
        animatorSet.addListener(new C5389On(this, z));
        animatorSet.start();
    }

    private void A0Q(boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z);
        C5245MS.A0J(this.A06);
        this.A06 = this.A0E.A02();
        C5245MS.A0K(this.A06);
        if (this.A0H) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A03 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            A0C();
        }
        this.A06.setTranslationY(0.0f);
        String[] strArr = A0U;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0U;
        strArr2[7] = "FZuJEB1DgE";
        strArr2[4] = "ioAK5D";
        addView(this.A06, 1, layoutParams);
        A0B();
        A0I();
    }

    private boolean A0R() {
        if (this.A0A.A0O().A0D().A0A()) {
            boolean z = this.A0J;
            String[] strArr = A0U;
            if (strArr[3].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0U;
            strArr2[7] = "WvW0Ef6T7c";
            strArr2[4] = "9KXIlI";
            if (z && !this.A0L && !this.A0K) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final void A0W() {
        super.A0W();
        A0S = null;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final void A0X() {
        AbstractC5268Mp A08 = this.A0E.A08();
        if (A08 != null) {
            A08.setPageDetailsVisible((A0e() || A08.A05()) ? false : true);
        }
        this.A0J = false;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final void A0Y() {
        if (this.A0E.A08() != null) {
            AbstractC5268Mp A08 = this.A0E.A08();
            String[] strArr = A0U;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0U;
            strArr2[3] = "MMiJw7TNUivh7iTB";
            strArr2[0] = "GEB80";
            A08.setPageDetailsVisible(false);
        }
        this.A0J = true;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final void A0Z() {
        this.A0K = false;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final void A0a() {
        this.A0K = true;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final void A0b(C39781B c39781b, String str, double d, @Nullable Bundle bundle) {
        super.A0b(c39781b, str, d, bundle);
        String A05 = c39781b.A0E().A05();
        if (A05 == null || A05.trim().length() == 0) {
            C5245MS.A0N(this.A08, 8);
        } else {
            this.A09.setText(A05);
        }
        if (d > 0.0d) {
            this.A01 = (int) (this.A04 / d);
        }
        this.A01 = this.A0G ? this.A02 : this.A01;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final boolean A0c() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public final boolean A0d(boolean z) {
        if (A0e()) {
            A0P(false);
            return true;
        } else if (A0R()) {
            this.A0Q.A07(this);
            return true;
        } else {
            return false;
        }
    }

    public final boolean A0e() {
        return this.A0H;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        if (A0e()) {
            return 3;
        }
        if (this.A0K) {
            return 2;
        }
        if (this.A0A.A0O().A0D().A0A()) {
            return 1;
        }
        if (this.A0J) {
            if (A0U[5].charAt(10) != 'N') {
                String[] strArr = A0U;
                strArr[6] = "NhzVRhgvHrOwM64xV2PIAOEbNcq";
                strArr[1] = "xEzMNY3CkayGfsMDFyAKLsf22gx";
                return 4;
            }
            throw new RuntimeException();
        }
        return super.getCloseButtonStyle();
    }

    private String getUrl() {
        return this.A0E.A04().A0O().A0F().A05();
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0Q(A0e());
        A0J();
        setupLayoutConfiguration(A0e());
        A0H();
    }

    private void setUpBrowserControls(C5663TE c5663te) {
        C5245MS.A0J(this.A0B);
        this.A0B = new C5332Ns(this.A0E.A05(), c5663te);
        c5663te.setBrowserNavigationListener(this.A0B.getBrowserNavigationListener());
        C5245MS.A0K(this.A0B);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0B.setListener(new C5638Sp(this));
        this.A0B.setOnTouchListener(new View$OnTouchListenerC5387Ol(this));
        this.A07.addView(this.A0B, layoutParams);
        C5245MS.A0J(this.A0C);
        this.A0C = new C5333Nt(this.A0E.A05(), null, 16842872);
        this.A07.addView(this.A0C, new LinearLayout.LayoutParams(-1, A0V));
    }

    private void setupLayoutConfiguration(boolean z) {
        this.A0G = getResources().getConfiguration().orientation == 2;
        this.A05 = this.A0E.A08() == null ? 0 : this.A0E.A08().getToolbarHeight();
        this.A0H = z;
        this.A02 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A04 = Resources.getSystem().getDisplayMetrics().widthPixels;
        this.A03 = this.A02 + (this.A0G ? 0 : this.A05);
        this.A01 = this.A02;
    }
}
