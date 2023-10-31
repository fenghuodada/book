package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.facebook.ads.redexgen.X.8L */
/* loaded from: assets/audience_network.dex */
public final class C44078L extends AbstractC5681TW implements InterfaceC5442Pf {
    public static byte[] A0N;
    public static String[] A0O = {"jpfQHsJU1lQWxp7CXlwdVdxcmzkEjD3g", "zEjz0M8mBGIlVid6uM60nN2wm9TWrUGD", "N1PpSZkKdQQSk7AxXPBdtL04F7CB9SRH", "NsCDsqdLjA318x1fHEY8u0Kcg9miAoAi", "WmIcjMDFfLwNDk", "", "Zb94j8IQkKLdVAKFmXIR3eGQpuAhW41l", "pxOHyfKHQ8aixQeNEjeruqZzDXsiYM9P"};
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public int A00;
    public int A01;
    public int A02;
    @Nullable
    public RelativeLayout A03;
    public C6281dJ A04;
    public C43657U A05;
    @Nullable
    public C40512M A06;
    @Nullable
    public AbstractC5359OJ A07;
    @Nullable
    public C5371OV A08;
    @Nullable
    public C5598SB A09;
    @Nullable
    @DoNotStrip
    public AbstractC5520Qv A0A;
    public C5521Qw A0B;
    @Nullable
    public String A0C;
    public List<C5437Pa> A0D;
    public final int A0E;
    public final C39871K A0F;
    public final C5953Xy A0G;
    public final C5237MK A0H;
    public final InterfaceC5269Mq A0I;
    public final C5385Oj A0J;
    public final C5443Pg A0K;
    public final C5443Pg A0L;
    public final C5036Ix A0M;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 14;
            if (A0O[0].charAt(17) == 'P') {
                throw new RuntimeException();
            }
            A0O[5] = "";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        byte[] bArr = {94, -117, -117, -120, -117, 57, 124, -117, 126, 122, -115, -126, -121, Byte.MIN_VALUE, 57, 124, 122, -117, -120, -114, -116, 126, -123, 57, -113, -126, 126, -112, 89, -122, -122, -125, -122, 52, -117, 124, 125, Byte.MIN_VALUE, 121, 52, 119, 117, -122, -125, -119, -121, 121, Byte.MIN_VALUE, 52, 119, 117, -122, 120, 52, 119, 124, 117, -126, 123, 121, 66, 91, 87, 86, -118, 121, 126, 122, -125, 120, 122, 99, 122, -119, -116, -124, -121, Byte.MIN_VALUE, -97, -94, -99, -94, -97, -78, -97, -99, -96, -77, -84, -94, -86, -93, -33, -21, -23, -86, -30, -35, -33, -31, -34, -21, -21, -25, -86, -35, -32, -17, -86, -27, -22, -16, -31, -18, -17, -16, -27, -16, -27, -35, -24, -86, -33, -24, -27, -33, -25, -31, -32};
        if (A0O[0].charAt(17) == 'P') {
            throw new RuntimeException();
        }
        A0O[0] = "0pXVmbGKHAzIVbBBK7Eyv6Mrdc2f0VIY";
        A0N = bArr;
    }

    static {
        A0B();
        A0Q = (int) (C5208Lr.A00 * 8.0f);
        A0R = (int) (C5208Lr.A00 * 8.0f);
        A0S = (int) (C5208Lr.A00 * 12.0f);
        A0P = (int) (C5208Lr.A00 * 42.0f);
    }

    public C44078L(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, C43657U c43657u, InterfaceC5269Mq interfaceC5269Mq, C6281dJ c6281dJ) {
        super(c5953Xy, interfaceC5080Jh, interfaceC5269Mq, c6281dJ);
        this.A0H = new C5237MK();
        this.A00 = -1;
        this.A05 = c43657u;
        this.A0G = c5953Xy;
        this.A0I = interfaceC5269Mq;
        this.A0E = super.A08.A0c().size();
        this.A0M = new C5036Ix(this.A0G);
        this.A0L = new C5443Pg(this.A0G, EnumC5441Pe.A04, this);
        this.A0K = new C5443Pg(this.A0G, EnumC5441Pe.A03, this);
        this.A0J = new C5384Oi(this.A0G, interfaceC5080Jh, getAudienceNetworkListener(), this.A04, null, this.A0B, this.A0H).A0J();
        this.A0F = c6281dJ.A0N().A01();
        if (C5064JR.A1X(this.A0G)) {
            super.A0C.setProgressSpinnerInvisible(true);
        }
    }

    private void A08() {
        if (this.A00 > 0) {
            this.A0K.setVisibility(0);
        } else {
            this.A0K.setVisibility(8);
        }
        if (this.A00 != this.A0E - 1) {
            C5443Pg c5443Pg = this.A0L;
            String[] strArr = A0O;
            if (strArr[7].charAt(14) == strArr[1].charAt(14)) {
                throw new RuntimeException();
            }
            A0O[0] = "6a52QfyEa3IWfhbHGHqjZ8J10HxaoQoC";
            c5443Pg.setVisibility(0);
            return;
        }
        this.A0L.setVisibility(8);
    }

    private void A09() {
        if (this.A08 != null && this.A06 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (getResources().getConfiguration().orientation == 1) {
                layoutParams.addRule(3, this.A06.getId());
                layoutParams.setMargins(0, A0Q, 0, 0);
            } else {
                layoutParams.addRule(12);
                layoutParams.setMargins(0, 0, 0, A0Q);
            }
            layoutParams.addRule(14);
            this.A08.setLayoutParams(layoutParams);
        }
    }

    private void A0A() {
        int min;
        int i;
        int childWidth;
        int i2 = getResources().getConfiguration().orientation;
        int i3 = C5208Lr.A01.widthPixels;
        int i4 = C5208Lr.A01.heightPixels;
        if (i2 == 1) {
            int height = A0Q;
            int i5 = i3 - (height * 4);
            int height2 = i4 / 2;
            min = Math.min(i5, height2);
            i = (i3 - min) / 8;
            childWidth = i * 4;
            this.A0K.setVisibility(8);
            this.A0L.setVisibility(8);
        } else {
            min = Math.min(i4, i3);
            i = (i3 - min) / 2;
            childWidth = i;
            A08();
        }
        C40512M c40512m = this.A06;
        if (c40512m != null) {
            C5596S9 fullscreenCarouselRecyclerViewAdapter = c40512m.getFullscreenCarouselRecyclerViewAdapter();
            if (fullscreenCarouselRecyclerViewAdapter != null) {
                fullscreenCarouselRecyclerViewAdapter.A0F(min, i, childWidth);
                fullscreenCarouselRecyclerViewAdapter.A07();
                return;
            }
            return;
        }
        Log.e(A06(61, 17, 7), A06(0, 28, 11));
        onDestroy();
    }

    private final void A0C() {
        C40512M c40512m = this.A06;
        if (c40512m != null) {
            c40512m.removeAllViews();
            this.A06 = null;
        }
        C5371OV c5371ov = this.A08;
        if (c5371ov != null) {
            c5371ov.removeAllViews();
            this.A08 = null;
        }
        RelativeLayout relativeLayout = this.A03;
        if (A0O[5].length() != 0) {
            throw new RuntimeException();
        }
        A0O[5] = "";
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
    }

    private final void A0D(int i, @Nullable Bundle bundle) {
        boolean z = i == 1;
        this.A03 = new RelativeLayout(getContext());
        this.A07 = new C5646Sx(this.A0G, 0, this.A0D.get(0).A03().A0E().A00() == EnumC39831G.A05, this.A0F, super.A08.A0O().A0F().A06(), A06(92, 37, 110), getAdEventManager(), this.A0I, this.A0B, this.A0H);
        this.A07.A0A(z ? 1 : 0);
        this.A03.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A0A = new C5595S8(this);
        this.A0B = new C5521Qw(this, 1, new WeakReference(this.A0A), this.A0G);
        this.A0B.A0W(this.A01);
        this.A0B.A0X(this.A02);
        this.A06 = new C40512M(this.A0G);
        C5245MS.A0K(this.A06);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.A09 = new C5598SB(this.A06, i, this.A0D, this.A0B, bundle);
        if (this.A0C != null) {
            this.A06.setAdapter(new C5596S9(this.A0G, this.A0D, this.A04, super.A0A, this.A05, this.A0B, this.A0H, getAudienceNetworkListener(), this.A0C, this.A09, this.A0M));
            A0A();
        } else if (A0O[0].charAt(17) == 'P') {
            throw new RuntimeException();
        } else {
            A0O[5] = "";
            Log.e(A06(61, 17, 7), A06(0, 28, 11));
            onDestroy();
        }
        A0F(this.A09);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        if (C5064JR.A1I(this.A0G)) {
            InterfaceC5092Jt A09 = this.A0G.A09();
            C40512M c40512m = this.A06;
            String A0U = super.A08.A0U();
            if (A0O[4].length() == 17) {
                throw new RuntimeException();
            }
            A0O[5] = "";
            A09.AFP(c40512m, A0U, false);
        }
        this.A03.addView(this.A06, layoutParams);
        A09();
        this.A03.addView(this.A08);
        this.A07.setTitleMaxLines(3);
        this.A07.A09();
        this.A07.A08();
        this.A03.addView(this.A07, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        int i2 = A0P;
        layoutParams3.width = i2;
        layoutParams3.height = i2;
        layoutParams3.setMargins(A0Q, 0, 0, 0);
        layoutParams4.addRule(11);
        layoutParams4.addRule(15);
        int i3 = A0P;
        layoutParams4.width = i3;
        layoutParams4.height = i3;
        layoutParams4.setMargins(0, 0, A0Q, 0);
        this.A03.addView(this.A0K, layoutParams3);
        this.A03.addView(this.A0L, layoutParams4);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(12);
        this.A03.addView(this.A0M, layoutParams5);
        A0U(this.A03, true, i);
        removeView(findViewById(C5379Od.A00));
        boolean isPortrait = C5064JR.A21(this.A0G);
        if (isPortrait) {
            C5245MS.A0M(this, -1);
        } else {
            C5379Od.A00(this.A0J.A05(), this, this.A04.A0O().A0D().A07());
        }
        if (this.A0C != null) {
            this.A07.setInfo(this.A04.A0O().A0E(), this.A04.A0O().A0F(), this.A0C, super.A08.A0R().A01(), null);
        }
    }

    private void A0E(C6281dJ c6281dJ) {
        this.A04 = c6281dJ;
        this.A0C = this.A04.A0U();
        this.A01 = this.A04.A0H();
        this.A02 = this.A04.A0I();
        List<C39781B> A0c = this.A04.A0c();
        this.A0D = new ArrayList(A0c.size());
        for (int i = 0; i < A0c.size(); i++) {
            this.A0D.add(new C5437Pa(i, A0c.size(), A0c.get(i)));
        }
    }

    private void A0F(C5598SB c5598sb) {
        new C4805FA().A0G(this.A06);
        c5598sb.A0Z(new C5594S7(this));
        this.A08 = new C5371OV(this.A0G, super.A05.A01(), this.A0D.size());
        C5245MS.A0K(this.A08);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0R);
        layoutParams.setMargins(0, A0S, 0, 0);
        this.A08.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5681TW
    public final boolean A0a() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void A8n(Intent intent, @Nullable Bundle bundle, C422159 c422159) {
        C6281dJ c6281dJ = (C6281dJ) intent.getSerializableExtra(A06(78, 14, 48));
        A0V(c422159);
        if (c6281dJ != null) {
            A0E(c6281dJ);
        }
        A0D(c422159.A0H().getResources().getConfiguration().orientation, bundle);
        c422159.A0K(new C5593S6(this, c422159));
        int A03 = super.A08.A0O().A0D().A03();
        if (A03 > 0) {
            A0T(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5681TW, com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void ABj(boolean z) {
        super.ABj(z);
        C5598SB c5598sb = this.A09;
        if (c5598sb != null) {
            c5598sb.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5681TW, com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void AC8(boolean z) {
        super.AC8(z);
        C5598SB c5598sb = this.A09;
        if (c5598sb != null) {
            c5598sb.A0R();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5442Pf
    public final void ACT(EnumC5441Pe enumC5441Pe) {
        int i;
        C40512M c40512m = this.A06;
        if (c40512m != null) {
            C6213cB layoutManager = c40512m.getLayoutManager();
            if (enumC5441Pe == EnumC5441Pe.A03) {
                int i2 = this.A00;
                i = i2 <= 0 ? 0 : i2 - 1;
                layoutManager.A21(this.A06, new C41944i(), i);
            } else {
                int i3 = this.A00;
                int i4 = this.A0E;
                i = i3 >= i4 + (-1) ? i4 - 1 : i3 + 1;
                layoutManager.A21(this.A06, new C41944i(), i);
            }
            setUpLayoutForCardAtIndex(i);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void AEI(Bundle bundle) {
        C5598SB c5598sb = this.A09;
        if (c5598sb != null) {
            c5598sb.A0X(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5681TW
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        AEI(new Bundle());
        super.onConfigurationChanged(configuration);
        A0A();
        C40512M c40512m = this.A06;
        if (c40512m != null && this.A09 != null) {
            c40512m.getLayoutManager().A1t(Math.max(this.A00, 0));
            this.A09.A0U(Math.max(this.A00, 0));
        }
        A09();
        AbstractC5359OJ abstractC5359OJ = this.A07;
        if (abstractC5359OJ != null) {
            abstractC5359OJ.A0A(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC5681TW, com.facebook.ads.redexgen.p036X.InterfaceC5270Mr
    public final void onDestroy() {
        super.onDestroy();
        if (C5064JR.A1I(this.A0G)) {
            InterfaceC5092Jt A09 = this.A0G.A09();
            if (A0O[0].charAt(17) == 'P') {
                throw new RuntimeException();
            }
            A0O[4] = "nCvA44nJ0TVVJ";
            A09.AFF(this.A06);
        }
        if (!TextUtils.isEmpty(this.A0C)) {
            super.A0A.A8v(this.A0C, new C5356OG().A03(this.A0B).A02(this.A0H).A05());
        }
        A0C();
        this.A0B.A0V();
        this.A0B = null;
        this.A0A = null;
        this.A0D = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0H.A06(this.A0G, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setUpLayoutForCardAtIndex(int r12) {
        /*
            r11 = this;
            com.facebook.ads.redexgen.X.OV r0 = r11.A08
            if (r0 == 0) goto L7
            r0.A00(r12)
        L7:
            com.facebook.ads.redexgen.X.dJ r0 = r11.A04
            com.facebook.ads.redexgen.X.1B r4 = r0.A0P(r12)
            if (r4 == 0) goto L81
            int r0 = r11.A00
            if (r0 == r12) goto L81
            r11.A00 = r12
            android.content.res.Resources r0 = r11.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 2
            if (r1 != r0) goto L25
            r11.A08()
        L25:
            int r0 = com.facebook.ads.redexgen.p036X.C5379Od.A00
            android.view.View r0 = r11.findViewById(r0)
            r11.removeView(r0)
            com.facebook.ads.redexgen.X.Xy r0 = r11.A0G
            boolean r0 = com.facebook.ads.redexgen.p036X.C5064JR.A21(r0)
            if (r0 == 0) goto La3
            r0 = -1
            com.facebook.ads.redexgen.p036X.C5245MS.A0M(r11, r0)
        L3a:
            java.lang.String r0 = r11.A0C
            if (r0 == 0) goto L58
            com.facebook.ads.redexgen.X.OJ r5 = r11.A07
            java.lang.String[] r1 = com.facebook.ads.redexgen.p036X.C44078L.A0O
            r0 = 0
            r1 = r1[r0]
            r0 = 17
            char r1 = r1.charAt(r0)
            r0 = 80
            if (r1 == r0) goto Lb5
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C44078L.A0O
            java.lang.String r1 = "kFih28rpO37RepskuaJrvvoNb65qRIkh"
            r0 = 6
            r2[r0] = r1
            if (r5 != 0) goto L8a
        L58:
            r2 = 61
            r1 = 17
            r0 = 7
            java.lang.String r3 = A06(r2, r1, r0)
            r2 = 28
            r1 = 33
            r0 = 6
            java.lang.String r0 = A06(r2, r1, r0)
            android.util.Log.e(r3, r0)
        L6d:
            com.facebook.ads.redexgen.X.1E r0 = r4.A0D()
            java.lang.String r0 = r0.A08()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L82
            com.facebook.ads.redexgen.X.Ix r1 = r11.A0M
            r0 = 0
            r1.setVisibility(r0)
        L81:
            return
        L82:
            com.facebook.ads.redexgen.X.Ix r1 = r11.A0M
            r0 = 8
            r1.setVisibility(r0)
            goto L81
        L8a:
            com.facebook.ads.redexgen.X.1I r6 = r4.A0E()
            com.facebook.ads.redexgen.X.1L r7 = r4.A0F()
            java.lang.String r8 = r11.A0C
            com.facebook.ads.redexgen.X.dJ r0 = r11.A08
            com.facebook.ads.redexgen.X.1U r0 = r0.A0R()
            java.lang.String r9 = r0.A01()
            r10 = 0
            r5.setInfo(r6, r7, r8, r9, r10)
            goto L6d
        La3:
            com.facebook.ads.redexgen.X.Oj r0 = r11.A0J
            com.facebook.ads.redexgen.X.Xy r1 = r0.A05()
            com.facebook.ads.redexgen.X.1E r0 = r4.A0D()
            java.lang.String r0 = r0.A07()
            com.facebook.ads.redexgen.p036X.C5379Od.A00(r1, r11, r0)
            goto L3a
        Lb5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C44078L.setUpLayoutForCardAtIndex(int):void");
    }
}
