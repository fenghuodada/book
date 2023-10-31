package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.facebook.ads.internal.view.dynamiclayout.DynamicWebViewController$AdFormatType;
import java.util.Arrays;
import java.util.HashMap;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.facebook.ads.redexgen.X.A1 */
/* loaded from: assets/audience_network.dex */
public final class C4508A1 extends FrameLayout implements InterfaceC5619SW {
    public static byte[] A0A;
    public static String[] A0B = {"gR8VXB3ia", "OJTiurBFiCqcREvzh7o4PkhSqDGudpIq", "iaBHwIBC1utH6CwOSIC2yyAu4ZYXfJ61", "YdU4", "YcTfP9iPeB3iMp", "vsmHP1kkKyGC9kag", "2EZKw0n31g6TC4", "KAWIkc2sX"};
    public C5521Qw A00;
    @DynamicWebViewController$AdFormatType
    public final int A01;
    public final AbstractC397518 A02;
    public final C5953Xy A03;
    public final InterfaceC5080Jh A04;
    public final C5237MK A05;
    public final InterfaceC5401Oz A06;
    public final C5411PA A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{118, 84, 91, 18, 65, 21, 70, 65, 84, 71, 65, 21, 116, 64, 81, 92, 80, 91, 86, 80, 123, 80, 65, 66, 90, 71, 94, 116, 86, 65, 92, 67, 92, 65, 76, 27, 21, 120, 84, 94, 80, 21, 70, 64, 71, 80, 21, 65, 93, 84, 65, 21, 92, 65, 18, 70, 21, 92, 91, 21, 76, 90, 64, 71, 21, 116, 91, 81, 71, 90, 92, 81, 120, 84, 91, 92, 83, 80, 70, 65, 27, 77, 88, 89, 21, 83, 92, 89, 80, 27, 30, 26, 25, 45, 60, 49, 61, 54, 59, 61, 22, 61, 44, 47, 55, 42, 51, 54, 57, 8, 54, 52, 35, 62, 33, 62, 35, 46, 64, 79, 90, 71, 88, 75, 111, 74, 106, 79, 90, 79, 108, 91, 64, 74, 66, 75, 47, 48, 60, 46, 13, 32, 41, 60};
    }

    static {
        A02();
    }

    public C4508A1(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, AbstractC397518 abstractC397518, String str, @DynamicWebViewController$AdFormatType int i) {
        this(c5953Xy, interfaceC5080Jh, null, abstractC397518, str, i, null);
    }

    public C4508A1(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, InterfaceC5401Oz interfaceC5401Oz, AbstractC397518 abstractC397518, String str, @DynamicWebViewController$AdFormatType int i, C5237MK c5237mk) {
        super(c5953Xy);
        this.A03 = c5953Xy;
        this.A04 = interfaceC5080Jh;
        this.A02 = abstractC397518;
        this.A08 = str;
        this.A06 = interfaceC5401Oz;
        this.A01 = i;
        if (this.A01 == 3) {
            this.A07 = new C5411PA(this.A03, abstractC397518, interfaceC5080Jh, i);
            this.A09 = false;
        } else {
            C5411PA A02 = C5412PB.A02(abstractC397518.A0Z());
            if (A02 != null) {
                this.A07 = A02;
                this.A09 = true;
            } else {
                this.A07 = new C5411PA(this.A03, abstractC397518, interfaceC5080Jh, i);
                C5412PB.A03(abstractC397518, this.A07);
                this.A09 = false;
            }
        }
        if (c5237mk != null) {
            this.A05 = c5237mk;
            this.A07.A0Z(c5237mk);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new C5626Sd(this));
        this.A07.A0a(interfaceC5401Oz);
        EnumC5213Lw.A04(this, EnumC5213Lw.A0A);
        if (C5064JR.A1I(c5953Xy)) {
            c5953Xy.A09().AFR(this.A07.A0O(), abstractC397518.A0U(), false, false, true);
        }
        A04();
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0D().A4w();
            this.A07.A0X();
        } else {
            this.A03.A0D().A4x();
            String[] strArr = A0B;
            if (strArr[6].length() != strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[6] = "EW3rEVX7vA8fzU";
            strArr2[4] = "ztAtYR2DvpL08d";
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    InterfaceC5401Oz interfaceC5401Oz = this.A06;
                    if (interfaceC5401Oz != null) {
                        interfaceC5401Oz.AAf(this);
                    }
                    if (C5064JR.A1I(this.A03)) {
                        this.A03.A09().AAT();
                    }
                } else {
                    AF2();
                }
            }
        }
        A08();
    }

    private final void A04() {
        C5411PA.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AbstractC397518 abstractC397518) {
        intent.putExtra(A01(136, 8, 40), EnumC5149Kq.A04);
        intent.putExtra(A01(118, 18, 95), abstractC397518);
        intent.addFlags(268435456);
    }

    @SuppressLint({"CatchGeneralException"})
    private final void A06(AbstractC397518 abstractC397518) {
        AdActivityIntent A04 = C5180LN.A04(this.A03);
        A05(A04, abstractC397518);
        try {
            C5180LN.A09(this.A03, A04);
        } catch (Exception e) {
            this.A03.A06().A8y(A01(107, 11, 38), C44458z.A0D, new C444690(e));
            Log.e(A01(90, 17, 41), A01(0, 90, 68), e);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        new C5363ON(this.A03, this.A08, this.A00, this.A05, this.A04).A08(this.A02.A0U(), str, new HashMap());
    }

    public final void A08() {
        C5245MS.A0J(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void A7w() {
        A07(this.A02.A0O().A0F().A05());
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void A7x(String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void A81() {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void A8h() {
        new Handler(Looper.getMainLooper()).post(new C5625Sc(this));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void AAr() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void AAv() {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void ABZ(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void ACK() {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void ACn(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void ACp(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void AD2(String str) {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void AF2() {
        InterfaceC5401Oz interfaceC5401Oz = this.A06;
        if (interfaceC5401Oz != null) {
            interfaceC5401Oz.AAf(this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5619SW
    public final void close() {
    }

    public InterfaceC5080Jh getAdEventManager() {
        return this.A04;
    }

    public C5411PA getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(C5521Qw c5521Qw) {
        this.A00 = c5521Qw;
        this.A07.A0e(c5521Qw);
    }
}
