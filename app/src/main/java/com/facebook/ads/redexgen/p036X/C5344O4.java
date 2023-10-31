package com.facebook.ads.redexgen.p036X;

import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.O4 */
/* loaded from: assets/audience_network.dex */
public final class C5344O4 extends RelativeLayout {
    public static InterfaceC5269Mq A05;
    public static byte[] A06;
    public static String[] A07 = {"CT308ms2RTF49ixw7iITcI5DvAIGWMXZ", "UVauKq3DlAHpB1vMyeeSD4Us6AaVXCYd", "G3Ivv2DNtSsvdOlvNnw6jHI40eb4uyYL", "qur6nZLrhU9XJET37yOODnXWYcrj37IJ", "OCLfHPrXkMpm02uq88EYR3Uw1JpI2kE3", "KopKmjllEHptdGx3", "mL4xXMXopKoNgp", "1VwEGJcTQNgN7iTbFc9O"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public AbstractC6198bv A00;
    public C5953Xy A01;
    public C39630w A02;
    @Nullable
    public C5661TC A03;
    @Nullable
    public C5371OV A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[6].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[2] = "hwjeWCnyrgrPOyFOaJyYR4Ki88uO9bQs";
            strArr[0] = "4m7NTkn57B9pIqsgccGzW0RoTzQfESBy";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 119);
            i4++;
        }
    }

    public static void A02() {
        A06 = new byte[]{-25, 5, 22, 19, 25, 23, 9, 16, -60, -14, 5, 24, 13, 26, 9, -60, 26, 13, 9, 27, -60, 5, 8, 9, 20, 24, 9, 22, -60, 13, 23, 18, -53, 24, -60, 7, 22, 9, 5, 24, 9, 8, -60, 20, 22, 19, 20, 9, 22, 16, 29, -5, -7, 2, -7, 6, -3, -9};
    }

    static {
        A02();
        A09 = (int) (C5208Lr.A00 * 8.0f);
        A08 = A09 * 10;
        A0A = (int) (C5208Lr.A00 * 15.0f);
        A05 = new C5660TB();
    }

    public C5344O4(C5953Xy c5953Xy) {
        super(c5953Xy);
        this.A01 = c5953Xy;
        this.A02 = new C39630w(c5953Xy);
        C5245MS.A0K(this.A02);
        this.A00 = new C4805FA();
        this.A00.A0G(this.A02);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
    }

    /* JADX WARN: Incorrect condition in loop: B:7:0x001a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.ArrayList<com.facebook.ads.redexgen.p036X.C5437Pa> A01(com.facebook.ads.redexgen.p036X.AbstractC397518 r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L8
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L8:
            java.util.List r5 = r7.A0c()
            int r0 = r5.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            r3 = 0
        L16:
            int r0 = r5.size()
            if (r3 >= r0) goto L31
            java.lang.Object r2 = r5.get(r3)
            com.facebook.ads.redexgen.X.1B r2 = (com.facebook.ads.redexgen.p036X.C39781B) r2
            int r1 = r5.size()
            com.facebook.ads.redexgen.X.Pa r0 = new com.facebook.ads.redexgen.X.Pa
            r0.<init>(r3, r1, r2)
            r4.add(r0)
            int r3 = r3 + 1
            goto L16
        L31:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5344O4.A01(com.facebook.ads.redexgen.X.18):java.util.ArrayList");
    }

    public final void A04() {
        this.A02.setAdapter(null);
    }

    public final void A05(C5721UB c5721ub, int i) {
        ArrayList<C5437Pa> A01 = A01(c5721ub.A0z());
        this.A02.setCardsInfo(A01);
        this.A03 = new C5661TC(this.A01, A01, c5721ub.A0z(), this.A01.A00().A08(), c5721ub, A05, c5721ub.A0z().A0U(), this.A02.getCarouselCardBehaviorHelper(), null);
        this.A02.setAdapter(this.A03);
        this.A03.A0F(i - A08, 16, 0);
        this.A03.A07();
        setupDotsLayout(c5721ub, A01);
    }

    public final void A06(C5521Qw c5521Qw) {
        C5661TC c5661tc = this.A03;
        if (c5661tc != null) {
            c5661tc.A0G(c5521Qw);
        } else {
            this.A01.A06().A8y(A00(51, 7, 29), C44458z.A1u, new C444690(A00(0, 51, 45)));
        }
        this.A02.A22(c5521Qw);
    }

    public static InterfaceC5269Mq getDummyListener() {
        return A05;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C5661TC c5661tc;
        if (z && (c5661tc = this.A03) != null) {
            c5661tc.A0F((i3 - i) - A08, 16, 0);
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpLayoutForCardAtIndex(int i) {
        C5371OV c5371ov = this.A04;
        if (c5371ov != null) {
            c5371ov.A00(i);
        }
    }

    private void setupDotsLayout(C5721UB c5721ub, ArrayList<C5437Pa> arrayList) {
        this.A02.getCarouselCardBehaviorHelper().A0Z(new C5659TA(this));
        this.A04 = new C5371OV(this.A01, c5721ub.A0z().A0N().A01(), arrayList.size());
        C5245MS.A0K(this.A04);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(3, this.A02.getId());
        layoutParams.setMargins(0, A0A, 0, 0);
        addView(this.A04, layoutParams);
    }
}
