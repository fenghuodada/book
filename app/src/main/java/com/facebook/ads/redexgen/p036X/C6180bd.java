package com.facebook.ads.redexgen.p036X;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.DefaultMediaViewVideoRenderer;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.NativeAd;
import com.facebook.ads.internal.api.AdComponentView;
import com.facebook.ads.internal.api.AdComponentViewApi;
import com.facebook.ads.internal.api.AdComponentViewParentApi;
import com.facebook.ads.internal.api.AdViewConstructorParams;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.List;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.bd */
/* loaded from: assets/audience_network.dex */
public final class C6180bd extends C42265E implements MediaViewApi, Repairable, InterfaceC44128S {
    public static byte[] A0E;
    public static String[] A0F = {"5egxRyJvv3hsImr6xVPVZGZzS", "S92E58UIdGCmPOb4LYA51SRur0tU5vPU", "gB2LJBWgacco1yi3dwEv6yCRJyLib4yq", "IRYDxixZynQ1VjnPzR0JfxvjieAE", "Yx6PPUM30uHFy3rHO75LIsUaVykI", "YSQgGTlHzzB", "fqdcFq1cD4m6uZ0nLvDLKOa7nCA9CaYH", "MqJIv4BM2hfR6AMSoGkEEGT8SPZgcE8o"};
    public static final String A0G;
    public View A00;
    public View A01;
    public ImageView A02;
    public MediaView A03;
    @Nullable
    public MediaViewListener A04;
    public MediaViewVideoRenderer A05;
    public AdComponentViewParentApi A06;
    public C5953Xy A07;
    public C39771A A08;
    public C5353OD A09;
    @Nullable
    public C4508A1 A0A;
    @Nullable
    public C5445Pi A0B;
    public boolean A0C;
    public boolean A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 47);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A0E = new byte[]{56, 26, 9, 20, 14, 8, 30, 23, 91, 9, 30, 21, 31, 30, 9, 30, 9, 91, 22, 14, 8, 15, 91, 25, 30, 91, 8, 30, 15, 91, 25, 30, 29, 20, 9, 30, 91, 21, 26, 15, 18, 13, 30, 58, 31, 85, 26, 30, 29, 41, 56, 53, 57, 50, Utf8.REPLACEMENT_BYTE, 57, 18, 57, 40, 43, 51, 46, 55, 64, 100, 104, 110, 108, 41, 123, 108, 103, 109, 108, 123, 108, 123, 41, 100, 124, 122, 125, 41, 107, 108, 41, 122, 108, 125, 41, 107, 108, 111, 102, 123, 108, 41, 103, 104, 125, 96, Byte.MAX_VALUE, 108, 72, 109, 39, 96, 68, 72, 78, 76, 9, 91, 76, 71, 77, 76, 91, 76, 91, 9, 68, 92, 90, 93, 9, 75, 76, 9, 90, 76, 93, 9, 75, 76, 79, 70, 91, 76, 9, 71, 72, 93, 64, 95, 76, 107, 72, 71, 71, 76, 91, 104, 77, 7, 18, 53, 45, 58, 55, 50, Utf8.REPLACEMENT_BYTE, 123, 13, 50, 62, 44, 123, 56, 52, 53, 40, 47, 41, 46, 56, 47, 52, 41, 123, 43, 58, 41, 58, 54, 40, 123, 47, 34, 43, 62, 117, 1, 46, 59, 38, 57, 42, 111, 14, 43, 111, 6, 44, 32, 33, 111, 38, 60, 111, 33, 58, 35, 35, 97, 11, 52, 57, 56, 50, 125, 47, 56, 51, 57, 56, 47, 56, 47, 125, 48, 40, 46, 41, 125, Utf8.REPLACEMENT_BYTE, 56, 125, 46, 56, 41, 125, Utf8.REPLACEMENT_BYTE, 56, 59, 50, 47, 56, 125, 51, 60, 41, 52, 43, 56, 28, 57, 115, 26, 11, 18, 96, 108, 110, 45, 101, 98, 96, 102, 97, 108, 108, 104, 45, 98, 103, 112, 45, 109, 98, 119, 106, 117, 102, 45, 96, 111, 106, 96, 104, 102, 103, 117, 106, 103, 102, 108, 86, 113, 111, 62};
    }

    static {
        A08();
        A0G = MediaView.class.getSimpleName();
    }

    private void A05() {
        C4508A1 c4508a1 = this.A0A;
        if (c4508a1 != null) {
            c4508a1.setVisibility(8);
            C409838.A0A(this.A0A.getDynamicWebViewController().A0O(), new ColorDrawable(0));
            this.A03.removeView(this.A0A);
            this.A0A = null;
        }
    }

    private void A06() {
        if (!this.A0D) {
            View view = this.A01;
            String[] strArr = A0F;
            if (strArr[4].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "HiqmuX4YAHl";
            strArr2[0] = "JtgDxExoVYEb5OmxUIRsQ7gjV";
            if (view != null) {
                C5245MS.A0J(this.A08);
            }
            float f = C5208Lr.A00;
            int round = Math.round(4.0f * f);
            int round2 = Math.round(12.0f * f);
            this.A08.setChildSpacing(round);
            this.A08.setPadding(0, round2, 0, round2);
            this.A08.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A01 = this.A08;
            this.A03.addView(this.A01, layoutParams);
            return;
        }
        throw new IllegalStateException(A04(0, 46, 84));
    }

    private void A07() {
        EnumC5213Lw.A04(this.A03, EnumC5213Lw.A0A);
        EnumC5213Lw.A04(this.A09, EnumC5213Lw.A0A);
        EnumC5213Lw.A04(this.A05, EnumC5213Lw.A0A);
        EnumC5213Lw.A04(this.A01, EnumC5213Lw.A0A);
    }

    private final void A09(View view, ViewGroup.LayoutParams layoutParams) {
        A01(false);
        this.A03.addView(view, layoutParams);
        A01(true);
    }

    private void A0A(View view, C5721UB c5721ub) {
        C5445Pi c5445Pi = this.A0B;
        if (c5445Pi != null) {
            MediaView mediaView = this.A03;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "tYahJlzELN2bWoIKGOvNb4V2q4om3tal";
            strArr2[2] = "knO8IZUpKtredd0Q2IkvjJrJQGpJW1Qq";
            mediaView.removeView(c5445Pi);
        }
        if (!c5721ub.A1d()) {
            return;
        }
        String A1C = c5721ub.A1C();
        Context context = this.A03.getContext();
        String[] strArr3 = A0F;
        if (strArr3[5].length() != strArr3[0].length()) {
            String[] strArr4 = A0F;
            strArr4[4] = "LedcnhOkj71a4gNr9a9uwwPVwkpS";
            strArr4[3] = "bOPNktfa058vxRDYU7HJ2aiUk3a2";
            if (context == null) {
                return;
            }
        } else if (context == null) {
            return;
        }
        C5445Pi A01 = C5444Ph.A01(this.A07, A1C);
        if (A0F[7].charAt(21) != 'L') {
            A0F[1] = "IBU68ioTGuVBWJ1dkmCJ7UK76Osi7EVF";
            this.A0B = A01;
            if (this.A0B == null) {
                return;
            }
        } else {
            this.A0B = A01;
            if (this.A0B == null) {
                return;
            }
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(5, view.getId());
        layoutParams.addRule(7, view.getId());
        layoutParams.addRule(6, view.getId());
        layoutParams.addRule(8, view.getId());
        if (Build.VERSION.SDK_INT >= 17) {
            layoutParams.addRule(16, view.getId());
            layoutParams.addRule(17, view.getId());
        }
        A09(this.A0B, layoutParams);
        this.A06.bringChildToFront(this.A0B);
    }

    private void A0B(ImageView imageView) {
        if (!this.A0D) {
            ImageView imageView2 = this.A02;
            String[] strArr = A0F;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[6] = "9onWrVOda1qlu0pAvyXYf5LKITz29A5r";
            strArr2[2] = "G6pev0JETY7bhqmEZOziJsmCoQM1bBBX";
            if (imageView2 != null) {
                C5245MS.A0J(imageView2);
            }
            imageView.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(imageView, layoutParams);
            imageView.setId(C5245MS.A00());
            this.A02 = imageView;
            return;
        }
        throw new IllegalStateException(A04(106, 49, 6));
    }

    @TargetApi(21)
    private final void A0C(C5953Xy c5953Xy, AttributeSet attributeSet, int i, int i2, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c5953Xy, attributeSet, i, i2));
        A0H(new C5353OD(c5953Xy, attributeSet, i, i2));
        this.A08 = new C39771A(c5953Xy, attributeSet, i);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c5953Xy, attributeSet, i, i2));
        A07();
    }

    private final void A0D(C5953Xy c5953Xy, AttributeSet attributeSet, int i, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c5953Xy, attributeSet, i));
        A0H(new C5353OD(c5953Xy, attributeSet, i));
        this.A08 = new C39771A(c5953Xy, attributeSet, i);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c5953Xy, attributeSet, i));
        A07();
    }

    private final void A0E(C5953Xy c5953Xy, AttributeSet attributeSet, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c5953Xy, attributeSet));
        A0H(new C5353OD(c5953Xy, attributeSet));
        this.A08 = new C39771A(c5953Xy, attributeSet);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c5953Xy, attributeSet));
        A07();
    }

    private final void A0F(C5953Xy c5953Xy, MediaView mediaView) {
        this.A03 = mediaView;
        A0B(new ImageView(c5953Xy));
        A0H(new C5353OD(c5953Xy));
        this.A08 = new C39771A(c5953Xy);
        A06();
        setVideoRenderer(new DefaultMediaViewVideoRenderer(c5953Xy));
        A07();
    }

    private void A0G(C5721UB c5721ub, boolean z, C5104K5 c5104k5) {
        AsyncTaskC5652T3 A04 = new AsyncTaskC5652T3(this.A02, this.A07).A04();
        if (z) {
            A04.A06(new C6187bk(this, c5721ub));
        }
        A04.A07(c5104k5.getUrl());
    }

    private void A0H(C5353OD c5353od) {
        if (!this.A0D) {
            C5353OD c5353od2 = this.A09;
            if (c5353od2 != null) {
                this.A03.removeView(c5353od2);
            }
            c5353od.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.A03.addView(c5353od, layoutParams);
            this.A09 = c5353od;
            return;
        }
        throw new IllegalStateException(A04(63, 43, 38));
    }

    private boolean A0I(NativeAd nativeAd) {
        List<NativeAd> A03 = ((C42345M) nativeAd.getNativeAdApi()).A03();
        if (A03 == null) {
            return false;
        }
        for (NativeAd childNativeAd : A03) {
            if (childNativeAd.getAdCoverImage() == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(NativeAd nativeAd) {
        return Build.VERSION.SDK_INT >= 14 && !TextUtils.isEmpty(((C42345M) nativeAd.getNativeAdApi()).A02());
    }

    public final void A0L(NativeAd nativeAd) {
        AbstractC6285dN viewAdapter;
        C5953Xy A11 = ((C5721UB) nativeAd.getInternalNativeAd()).A11();
        A11.A0G(this);
        this.A07.A0F(A11);
        this.A07.A0E(A11.A0D());
        this.A0D = true;
        C5721UB A0L = C5721UB.A0L(nativeAd.getInternalNativeAd());
        A0L.A1Q(this.A03);
        this.A02.setVisibility(8);
        this.A02.setImageDrawable(null);
        if (A0L.A0z() != null) {
            boolean A0r = A0L.A0z().A0r();
            if (A0F[7].charAt(21) != 'L') {
                String[] strArr = A0F;
                strArr[4] = "CvXrj9TTP1W52m7bIbynzmDbx8Ql";
                strArr[3] = "OGerX4RrBYJpkLXwbXTHIjvyoHPN";
                if (A0r) {
                    if (!TextUtils.isEmpty(A0L.A0z().A0O().A0D().A08())) {
                        A0L.A11().A0D().AEj(EnumC39440c.A06);
                    } else {
                        A0L.A11().A0D().AEj(EnumC39440c.A05);
                    }
                    A05();
                    this.A09.setVisibility(8);
                    this.A09.setImage(null, null);
                    this.A05.setVisibility(8);
                    this.A05.unsetNativeAd();
                    ((C42335L) this.A05.getMediaViewVideoRendererApi()).A03();
                    View view = this.A01;
                    if (view != null) {
                        view.setVisibility(8);
                        View view2 = this.A01;
                        if (view2 instanceof C5344O4) {
                            C5344O4 c5344o4 = (C5344O4) view2;
                            if (A0F[1].charAt(24) != 't') {
                                String[] strArr2 = A0F;
                                strArr2[4] = "rVZQRbya12lyykx5Eq2uFJ3JGH4l";
                                strArr2[3] = "XRSLHysRpGcYp4QaXPRJ4K4uNDdg";
                                c5344o4.A04();
                            } else {
                                c5344o4.A04();
                            }
                        } else {
                            ((C4804F9) view2).setAdapter(null);
                        }
                    }
                    A01(false);
                    C6185bi c6185bi = new C6185bi(this, A0L, nativeAd);
                    C5953Xy c5953Xy = this.A07;
                    this.A0A = new C4508A1(c5953Xy, c5953Xy.A08(), c6185bi, A0L.A0z(), A04(261, 31, 44), 4, A0L.A19());
                    EnumC5213Lw.A04(this.A0A, EnumC5213Lw.A0A);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(13);
                    this.A03.addView(this.A0A, layoutParams);
                    C4508A1 c4508a1 = this.A0A;
                    this.A00 = c4508a1;
                    bringChildToFront(c4508a1);
                    this.A0A.setVisibility(0);
                    A0A(this.A0A, A0L);
                    A01(true);
                    return;
                }
            }
            throw new RuntimeException();
        }
        if (!A0I(nativeAd)) {
            if (A0J(nativeAd)) {
                A0L.A11().A0D().AEj(EnumC39440c.A09);
                A0L.A1b(this.A0C);
                this.A00 = this.A05.getMediaViewVideoRendererApi().getVideoView();
                A05();
                this.A09.setVisibility(8);
                this.A09.setImage(null, null);
                View view3 = this.A01;
                if (view3 != null) {
                    view3.setVisibility(8);
                    View view4 = this.A01;
                    if (view4 instanceof C5344O4) {
                        ((C5344O4) view4).A04();
                    } else {
                        ((C4804F9) view4).setAdapter(null);
                    }
                }
                bringChildToFront(this.A05);
                this.A05.setNativeAd(nativeAd);
                ((C42335L) this.A05.getMediaViewVideoRendererApi()).A04(nativeAd);
                this.A05.setVisibility(0);
                if (A0L.getAdCoverImage() != null) {
                    new AsyncTaskC5652T3(this.A03, this.A07).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new C6183bg(this, A0L)).A07(A0L.getAdCoverImage().getUrl());
                }
                if (BuildConfigApi.isDebug()) {
                    String str = A0G;
                    Log.i(str, A04(292, 9, 44) + ((C42345M) nativeAd.getNativeAdApi()).A02());
                }
                A0A(this.A05, A0L);
                return;
            } else if (nativeAd.getAdCoverImage() == null) {
                return;
            } else {
                A0L.A11().A0D().AEj(EnumC39440c.A07);
                this.A00 = this.A09.getBodyImageView();
                A05();
                this.A05.setVisibility(8);
                this.A05.unsetNativeAd();
                ((C42335L) this.A05.getMediaViewVideoRendererApi()).A03();
                View view5 = this.A01;
                if (view5 != null) {
                    view5.setVisibility(8);
                    View view6 = this.A01;
                    if (view6 instanceof C5344O4) {
                        C5344O4 c5344o42 = (C5344O4) view6;
                        String[] strArr3 = A0F;
                        if (strArr3[5].length() == strArr3[0].length()) {
                            throw new RuntimeException();
                        }
                        String[] strArr4 = A0F;
                        strArr4[4] = "yqBcm6jNekaOStoZQ6HlGjXfWvjo";
                        strArr4[3] = "wDgm0JyWXySbfCdb16XoSedMN32V";
                        c5344o42.A04();
                    } else {
                        C4804F9 c4804f9 = (C4804F9) view6;
                        String[] strArr5 = A0F;
                        if (strArr5[4].length() != strArr5[3].length()) {
                            c4804f9.setAdapter(null);
                        } else {
                            A0F[1] = "WgZqidqfP4WcIOVybwW8feV31RK292EI";
                            c4804f9.setAdapter(null);
                        }
                    }
                }
                bringChildToFront(this.A09);
                this.A09.setVisibility(0);
                new AsyncTaskC5652T3(this.A09, this.A07).A05(this.A03.getHeight(), this.A03.getWidth()).A06(new C6182bf(this, A0L)).A07(A0L.getAdCoverImage().getUrl());
                A0A(this.A09, A0L);
                return;
            }
        }
        A0L.A11().A0D().AEj(EnumC39440c.A03);
        boolean z = A0L.A17() == EnumC5107K8.A0B;
        if (!C5064JR.A22(this.A07) || z) {
            this.A01 = this.A08;
            ((C39771A) this.A01).setCurrentPosition(0);
            ((C39771A) this.A01).setShowTextInCarousel(z);
            if (!z) {
                viewAdapter = new C4822FR((C39771A) this.A01, A0L.A1H(), this.A07);
            } else {
                viewAdapter = new C4828FX(this.A07, (C39771A) this.A01, A0L.A1H(), A0L.A16());
            }
            viewAdapter.A0G(new C6184bh(this, A0L));
            ((C4804F9) this.A01).setAdapter(viewAdapter);
        } else {
            A01(false);
            int width = this.A03.getWidth();
            for (ViewGroup viewGroup = (ViewGroup) this.A03.getParent(); width == 0 && viewGroup != null; viewGroup = (ViewGroup) viewGroup.getParent()) {
                width = viewGroup.getWidth();
            }
            C5245MS.A0J(this.A01);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(13);
            this.A01 = new C5344O4(this.A07);
            this.A03.addView(this.A01, layoutParams2);
            ((C5344O4) this.A01).A05(A0L, width);
            C5245MS.A0K(this.A01);
            A01(true);
        }
        this.A00 = this.A01;
        A05();
        C5353OD c5353od = this.A09;
        String[] strArr6 = A0F;
        if (strArr6[4].length() == strArr6[3].length()) {
            A0F[7] = "vPdWlOkx37ezmD0GPDFfrvR6XxeFyYC2";
            c5353od.setVisibility(8);
            this.A09.setImage(null, null);
            this.A05.setVisibility(8);
            this.A05.unsetNativeAd();
            ((C42335L) this.A05.getMediaViewVideoRendererApi()).A03();
            bringChildToFront(this.A01);
            this.A01.setVisibility(0);
            A0A(this.A01, A0L);
            return;
        }
        throw new RuntimeException();
    }

    public final void A0M(NativeAdBaseApi nativeAdBaseApi, boolean z) {
        C5953Xy A11 = ((C5721UB) nativeAdBaseApi).A11();
        this.A07.A0F(A11);
        A11.A0G(this);
        this.A0D = true;
        C5721UB A0L = C5721UB.A0L(nativeAdBaseApi);
        A0L.A1P(this.A03);
        this.A09.setVisibility(8);
        this.A09.setImage(null, null);
        this.A05.setVisibility(8);
        this.A05.unsetNativeAd();
        ((C42335L) this.A05.getMediaViewVideoRendererApi()).A03();
        View view = this.A01;
        if (view != null) {
            view.setVisibility(8);
            View view2 = this.A01;
            if (view2 instanceof C5344O4) {
                ((C5344O4) view2).A04();
            } else {
                ((C4804F9) view2).setAdapter(null);
            }
        }
        this.A02.setVisibility(0);
        bringChildToFront(this.A02);
        this.A00 = this.A02;
        C5104K5 adIcon = A0L.getAdIcon();
        if (adIcon != null) {
            Bitmap A0M = A0L.A10().A0M(adIcon.getUrl());
            if (A0M != null) {
                this.A02.setImageBitmap(A0M);
                if (z) {
                    this.A03.post(new C6188bl(this, A0L));
                }
            } else {
                A0G(A0L, z, adIcon);
            }
        } else {
            InterfaceC5720UA A15 = A0L.A15();
            AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
            A11.A0D().A2a(A0L.A0x(), adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
            if (A15 != null) {
                A15.AAi(C5115KH.A00(adErrorType));
            }
            Log.e(A04(46, 17, 115), adErrorType.getDefaultErrorMessage());
            if (nativeAdBaseApi.isAdLoaded()) {
                this.A07.A06().A8y(A04(258, 3, 84), C44458z.A0W, new C444690(A04(192, 23, 96)));
            }
        }
        A0A(this.A02, A0L);
    }

    public final boolean A0N() {
        View view = this.A01;
        return view != null && view.getVisibility() == 0;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC44128S
    public final C5953Xy A5b() {
        return this.A07;
    }

    @Override // com.facebook.ads.redexgen.p036X.C42265E, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void bringChildToFront(View view) {
        if (view == this.A01 || view == this.A05 || view == this.A09 || view == this.A02) {
            this.A06.bringChildToFront(view);
            C5445Pi c5445Pi = this.A0B;
            if (c5445Pi != null) {
                this.A06.bringChildToFront(c5445Pi);
            }
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void destroy() {
        this.A05.pause(false);
        this.A05.getMediaViewVideoRendererApi().destroy();
    }

    @Override // com.facebook.ads.internal.api.AdComponentViewApiProvider
    public final AdComponentViewApi getAdComponentViewApi() {
        return this;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final View getAdContentsView() {
        return this.A00;
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaHeight() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageHeight();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getHeight();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getHeight();
        }
        if (A0F[1].charAt(24) != 't') {
            A0F[7] = "3C5Zne3gt6SFfa7y1AnuQltffgpI3Oh8";
            return 0;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final int getMediaWidth() {
        if (this.A09.getVisibility() == 0) {
            return this.A09.getImageWidth();
        }
        if (this.A05.getVisibility() == 0) {
            return this.A05.getMediaViewVideoRendererApi().getVideoView().getWidth();
        }
        if (this.A03.getVisibility() == 0) {
            return this.A03.getWidth();
        }
        String[] strArr = A0F;
        if (strArr[6].charAt(12) != strArr[2].charAt(12)) {
            String[] strArr2 = A0F;
            strArr2[5] = "pFreRfYdfw1";
            strArr2[0] = "pVUprXCJsnglf8IlGtX2XFBaJ";
            return 0;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void initialize(AdViewConstructorParams adViewConstructorParams, MediaView mediaView) {
        Context context = adViewConstructorParams.getContext();
        if (context instanceof C5953Xy) {
            this.A07 = (C5953Xy) context;
        } else {
            this.A07 = C42285G.A02(context);
        }
        this.A07.A0G(this);
        int initializationType = adViewConstructorParams.getInitializationType();
        if (initializationType == 0) {
            A0F(this.A07, mediaView);
        } else if (initializationType == 1) {
            A0E(this.A07, adViewConstructorParams.getAttributeSet(), mediaView);
        } else if (initializationType == 2) {
            A0D(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), mediaView);
        } else if (initializationType == 3) {
            A0C(this.A07, adViewConstructorParams.getAttributeSet(), adViewConstructorParams.getDefStyleAttr(), adViewConstructorParams.getDefStyleRes(), mediaView);
        } else {
            throw new IllegalArgumentException(A04(155, 37, 116));
        }
        A01(true);
    }

    @Override // com.facebook.ads.redexgen.p036X.C42265E, com.facebook.ads.internal.api.AdComponentViewApi
    public final void onAttachedToView(AdComponentView adComponentView, AdComponentViewParentApi adComponentViewParentApi) {
        super.onAttachedToView(adComponentView, adComponentViewParentApi);
        this.A06 = adComponentViewParentApi;
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        int width = this.A03.getWidth();
        int height = this.A03.getHeight();
        if (width > 0 && height > 0) {
            this.A03.repair(th);
            this.A03.getLayoutParams().width = width;
            MediaView mediaView = this.A03;
            if (A0F[1].charAt(24) == 't') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[5] = "Mgb6bOJjyiN";
            strArr[0] = "MTEeDXbdwkPsq4eW7ABfM3WBi";
            mediaView.getLayoutParams().height = height;
            this.A03.setBackgroundColor(-3355444);
            return;
        }
        this.A03.repair(th);
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setListener(MediaViewListener mediaViewListener) {
        this.A04 = mediaViewListener;
        if (mediaViewListener == null) {
            ((C42335L) this.A05.getMediaViewVideoRendererApi()).A07(null);
        } else {
            ((C42335L) this.A05.getMediaViewVideoRendererApi()).A07(new C6181be(this, mediaViewListener));
        }
    }

    @Override // com.facebook.ads.internal.api.MediaViewApi
    public final void setVideoRenderer(MediaViewVideoRenderer mediaViewVideoRenderer) {
        if (!this.A0D) {
            MediaViewVideoRenderer mediaViewVideoRenderer2 = this.A05;
            if (A0F[7].charAt(21) == 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[6] = "ifAS5bhxfK6Gg4eu5Yemnhg9EBEfp9jT";
            strArr[2] = "R5YDbsM1msNnvJcIFydw3DY2O0brJ9d9";
            if (mediaViewVideoRenderer2 != null) {
                this.A03.removeView(mediaViewVideoRenderer2);
                this.A05.getMediaViewVideoRendererApi().destroy();
            }
            ((C42335L) mediaViewVideoRenderer.getMediaViewVideoRendererApi()).A05(this.A07.A08());
            mediaViewVideoRenderer.setVisibility(8);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            ((C6180bd) this.A03.getMediaViewApi()).A09(mediaViewVideoRenderer, layoutParams);
            this.A05 = mediaViewVideoRenderer;
            this.A0C = !(this.A05 instanceof DefaultMediaViewVideoRenderer);
            mediaViewVideoRenderer.setId(C5245MS.A00());
            return;
        }
        throw new IllegalStateException(A04(215, 43, 114));
    }
}
