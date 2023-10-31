package com.facebook.ads.redexgen.p036X;

import android.content.res.Resources;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.dd */
/* loaded from: assets/audience_network.dex */
public final class C6301dd<NativeViewabilityLogger> implements InterfaceC39540n {
    public static byte[] A0G;
    public static String[] A0H = {"1VlIdrj3fRAASVh0IRQbA", "AKXoeI10d8PJONEXEmQHjWIEkAB2E", "HfXt1ktTFXNYFvURT1ePpe", "VNbNAjzqH3UXN3t9RrTP5z6I5Qa6gPQJ", "DeawL9PzUIlDumNdtXISYTaSpfy6P3Cj", "KNbO6MhxkLbBAZAqlm1H7U8Ouut8mEhI", "i536pd2CEb7n0lc", "TelURl5RBqiFivFSJRRvco6RCKborqoX"};
    public static final String A0I;
    public InterfaceC39620v A00;
    public C6290dS A01;
    @Nullable
    public C6283dL A02;
    public C4780El A03;
    @Nullable
    public InterfaceC5080Jh A04;
    @Nullable
    @DoNotStrip
    public InterfaceC5349O9 A06;
    @Nullable
    public C5654T5 A07;
    @Nullable
    public C4508A1 A08;
    @DoNotStrip
    public AbstractC5520Qv A09;
    @Nullable
    public C5521Qw A0A;
    public String A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public C5237MK A05 = new C5237MK();
    public Boolean A0B = false;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0G, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 19);
            if (A0H[2].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0H;
            strArr[3] = "viF0h1063r6cbXDqGfnWrC6qPBVBGzAv";
            strArr[7] = "3ywSXssJKLxMazlfVUMLvW6ymO505mlb";
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A0G = new byte[]{-28, -16, -18, -81, -25, -30, -28, -26, -29, -16, -16, -20, -81, -30, -27, -12, -81, -29, -30, -17, -17, -26, -13, -81, -28, -19, -22, -28, -20, -26, -27, -24, -39, -20, -24, -93, -36, -24, -31, -32, -68, -69, -83, 116, Byte.MAX_VALUE};
    }

    static {
        A0A();
        A0I = C6301dd.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A09() {
        C6283dL c6283dL;
        if (this.A00 != null && this.A08 != null && (c6283dL = this.A02) != null && c6283dL.A0r()) {
            this.A00.AAD(this, this.A08);
        }
        if (this.A00 != null && this.A0D) {
            boolean z = this.A0E;
            if (A0H[2].length() == 29) {
                throw new RuntimeException();
            }
            A0H[2] = "DQYu3GBVfiN4Ml";
            if (z || !this.A0F) {
                this.A00.AAD(this, this.A07);
            }
        }
        this.A03.A0D().A3X(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0B(int i, C44649I c44649i) {
        InterfaceC5401Oz nativeDSLListener = new C6304dg(this);
        this.A08 = new C4508A1(this.A03, this.A04, nativeDSLListener, this.A02, A08(0, 31, 110), 2, this.A05);
        this.A09 = new C6303df(this);
        this.A0A = new C5521Qw(this.A08, c44649i.A04(), c44649i.A09(), true, new WeakReference(this.A09), this.A03);
        this.A0A.A0W(this.A02.A0H());
        this.A0A.A0X(this.A02.A0I());
        this.A08.setVisibility(0);
        this.A03.getResources();
        this.A08.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
        this.A08.AF2();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0E(C44649I c44649i, C40191q c40191q) {
        C6292dU A00 = C6292dU.A00(c40191q.A03());
        this.A0C = A00.A65();
        if (C39510j.A03(this.A03, A00, this.A04)) {
            this.A03.A0D().A41();
            this.A00.ABC(this, C5115KH.A00(AdErrorType.NO_FILL));
            return;
        }
        this.A06 = new C4855Fy(this, A00);
        this.A07 = new C5654T5(this.A03, new WeakReference(this.A06), c44649i.A04(), A65());
        this.A07.A0G(c44649i.A07(), c44649i.A08());
        C6302de c6302de = new C6302de(this);
        C4780El c4780El = this.A03;
        InterfaceC5080Jh interfaceC5080Jh = this.A04;
        C5654T5 c5654t5 = this.A07;
        this.A01 = new C6290dS(c4780El, interfaceC5080Jh, c5654t5, c5654t5.getViewabilityChecker(), c6302de);
        this.A01.A08(A00);
        this.A07.loadDataWithBaseURL(C5352OC.A01(AdInternalSettings.getUrlPrefix()), A00.A04(), A08(31, 9, 97), A08(40, 5, 52), null);
        this.A0D = true;
        A09();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0F(EnumC5117KK enumC5117KK, C44649I c44649i) {
        if (this.A02 == null || this.A04 == null) {
            return;
        }
        int A02 = (int) (enumC5117KK.A02() * Resources.getSystem().getDisplayMetrics().density);
        if (!(C5064JR.A1U(this.A03) && C42545g.A0A(this.A02.A0d()))) {
            A0B(A02, c44649i);
        } else {
            new C42545g(new C43657U(this.A03), this.A02.A0d(), this.A02.A0Y(), this.A02.A0Z(), true, new C6306di(this, A02, c44649i, this)).A0B();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public final void A0I(C4780El c4780El, InterfaceC5080Jh interfaceC5080Jh, EnumC5117KK enumC5117KK, InterfaceC39620v interfaceC39620v, C40191q c40191q) {
        c4780El.A0D().A3W();
        this.A03 = c4780El;
        this.A04 = interfaceC5080Jh;
        this.A00 = interfaceC39620v;
        this.A0F = C5064JR.A18(this.A03.getApplicationContext());
        C44649I A01 = c40191q.A01();
        this.A02 = C6283dL.A01(c40191q.A03(), this.A03);
        if (this.A02.A0r()) {
            A0F(enumC5117KK, A01);
        } else {
            A0E(A01, c40191q);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39540n
    public final String A65() {
        return this.A0C;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39540n
    public final AdPlacementType A7B() {
        return AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.dd != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39540n
    public final void onDestroy() {
        this.A03.A0D().A3U(this.A07 != null);
        C5654T5 c5654t5 = this.A07;
        if (c5654t5 != null) {
            c5654t5.destroy();
            this.A07 = null;
            this.A06 = null;
        }
    }
}
