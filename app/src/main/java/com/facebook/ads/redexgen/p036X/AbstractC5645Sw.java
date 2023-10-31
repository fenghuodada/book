package com.facebook.ads.redexgen.p036X;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sw */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC5645Sw extends AbstractC5381Of {
    public static byte[] A06;
    public static String[] A07 = {"1qM0UqBuKeNFs4931PZdKXfB5ZchECK5", "3ZSmcCEAG5Dz0dWrJNlp2MNszP7YT25A", "Vrvau7r1HMpQKQXhvyVkTfJZAsfHOW4A", "oVRoE2FdK0le1s2SfNIozg00Kc9sH4MP", "npYoVlwUwM4clRwIxvjz9nauDkw8jySV", "7Yuh663Y", "kkRlGGIMUj7iwn7pYEfT9Vq54HRzcbQk", "UynwTjbvMY6JmtelA"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public C5130KX A00;
    @Nullable
    public C5019Ig A01;
    public C5006IT A02;
    public final AbstractC397518 A03;
    public final C39781B A04;
    public final AbstractC5359OJ A05;

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A06 = new byte[]{9, 5, 7, 68, 12, 11, 9, 15, 8, 5, 5, 1, 68, 11, 14, 25, 68, 3, 4, 30, 15, 24, 25, 30, 3, 30, 3, 11, 6, 68, 9, 6, 3, 9, 1, 15, 14, 92, 75, 89, 79, 92, 74, 75, 74, 113, 88, 71, 74, 75, 65};
    }

    static {
        A0B();
        A0B = (int) (C5208Lr.A00 * 48.0f);
        A0F = (int) (C5208Lr.A00 * 16.0f);
        A08 = (int) (C5208Lr.A00 * 4.0f);
        A0E = (int) (C5208Lr.A00 * 44.0f);
        A0C = (int) (C5208Lr.A00 * 8.0f);
        A0D = (int) (C5208Lr.A00 * 12.0f);
        A0H = (int) (C5208Lr.A00 * 12.0f);
        A0G = (int) (C5208Lr.A00 * 26.0f);
        A09 = C40592U.A01(-1, 77);
        A0A = C40592U.A01(A09, 90);
    }

    public AbstractC5645Sw(C5385Oj c5385Oj, boolean z) {
        super(c5385Oj, z);
        this.A03 = c5385Oj.A04();
        this.A04 = this.A03.A0O();
        this.A05 = A09(c5385Oj);
        AbstractC5268Mp A082 = c5385Oj.A08();
        if (A082 != null) {
            A082.setLayoutParams(new RelativeLayout.LayoutParams(-1, A082.getToolbarHeight()));
            A082.setPageDetailsVisible(false);
        }
    }

    private AbstractC5359OJ A09(C5385Oj c5385Oj) {
        String A0A2;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        if (c5385Oj.A04().A0Y().equals(A0A(37, 14, 56))) {
            A0A2 = EnumC5472Q9.A04.A02();
        } else {
            A0A2 = A0A(0, 37, 124);
        }
        C5646Sx c5646Sx = new C5646Sx(c5385Oj.A05(), A0B, this.A04.A0E().A00() == EnumC39831G.A05, getColors(), this.A04.A0F().A06(), A0A2, c5385Oj.A06(), c5385Oj.A09(), c5385Oj.A0B(), c5385Oj.A07());
        this.A02 = new C5006IT(c5646Sx, 400, 100, 0);
        C5245MS.A0K(c5646Sx);
        c5646Sx.A0A(c5385Oj.A00());
        addView(c5646Sx, layoutParams);
        return c5646Sx;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of
    public void A0b(C39781B c39781b, String str, double d, @Nullable Bundle bundle) {
        super.A0b(c39781b, str, d, bundle);
        this.A05.setInfo(c39781b.A0E(), c39781b.A0F(), str, this.A03.A0R().A01(), null);
    }

    public final int A0e(@Nullable AbstractC5268Mp abstractC5268Mp) {
        return abstractC5268Mp == null ? AbstractC5268Mp.A00 : abstractC5268Mp.getToolbarHeight();
    }

    public void A0f() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            this.A00 = new C5130KX(true);
            C5019Ig c5019Ig = this.A01;
            if (c5019Ig != null) {
                C5130KX c5130kx = this.A00;
                if (A07[0].charAt(30) == 'l') {
                    throw new RuntimeException();
                }
                A07[7] = "KTvg88bTO6HmKn15GgbH1";
                c5130kx.A0I(c5019Ig);
            }
            C39871K A01 = this.A03.A0N().A01();
            this.A00.A0I(new C5008IV(getAdDetailsView().getCTAButton(), 300, -1, A01.A09(true)));
            this.A00.A0I(new C5020Ih(getAdDetailsView().getCTAButton(), 300, C5245MS.A08(A09, A0A, A08), C5245MS.A05(A01.A08(true), A08)));
            this.A00.A0I(new C5011IY(expandableLayout, 150, false));
            this.A00.A0H(2300);
        }
    }

    public AbstractC397518 getAdDataBundle() {
        return this.A03;
    }

    public C5006IT getAdDetailsAnimation() {
        return this.A02;
    }

    public AbstractC5359OJ getAdDetailsView() {
        return this.A05;
    }

    public C39781B getAdInfo() {
        return this.A04;
    }

    public C5130KX getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5381Of, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getAdDetailsView().A0A(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout == null || !z) {
            return;
        }
        C5019Ig c5019Ig = this.A01;
        if (A07[2].charAt(30) != '4') {
            throw new RuntimeException();
        }
        A07[0] = "AO2Vor543jhYYkt1oYijcT7buZTkR3eI";
        if (c5019Ig == null) {
            this.A01 = new C5019Ig(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A00.A0I(this.A01);
            this.A00.A0G();
        }
    }
}
