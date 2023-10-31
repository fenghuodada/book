package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.UX */
/* loaded from: assets/audience_network.dex */
public final class C5743UX implements InterfaceC5080Jh {
    @Nullable
    @SuppressLint({"StaticFieldLeak"})
    public static InterfaceC5080Jh A03;
    public static byte[] A04;
    public static final String A05;
    public static volatile boolean A06;
    public final C5952Xx A00;
    public final InterfaceC44879g A01;
    public final InterfaceC5079Jg A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 79);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{-90, -21, -4, -21, -12, -6, -76, -88, -37, -37, -52, -44, -41, -37, -48, -43, -50, -121, -37, -42, -121, -45, -42, -50, -121, -56, -43, -121, -48, -43, -35, -56, -45, -48, -53, -121, -43, -13, -30, -28, -26, -24, -26, -17, -26, -13, -22, -28, 46, 51, 42, 31};
    }

    static {
        A03();
        A05 = C5743UX.class.getSimpleName();
        A06 = false;
    }

    public C5743UX(C5952Xx c5952Xx) {
        InterfaceC5078Jf A00;
        this.A00 = c5952Xx;
        if (C5066JT.A0T(c5952Xx)) {
            this.A01 = C44859e.A00(c5952Xx);
            A00 = C5085Jm.A01(c5952Xx, this.A01);
        } else {
            C4742E5 A01 = C44859e.A01(c5952Xx);
            A00 = C5085Jm.A00(c5952Xx, A01);
            this.A01 = A01;
        }
        this.A02 = new C5746Ua(c5952Xx, A00);
        ExecutorC5250MX.A08.execute(new C5745UZ(this));
        A04(c5952Xx);
    }

    public static synchronized InterfaceC5080Jh A01(C5952Xx c5952Xx) {
        InterfaceC5080Jh interfaceC5080Jh;
        synchronized (C5743UX.class) {
            if (A03 == null) {
                A03 = new C5743UX(c5952Xx);
            }
            interfaceC5080Jh = A03;
        }
        return interfaceC5080Jh;
    }

    public static synchronized void A04(C5952Xx c5952Xx) {
        synchronized (C5743UX.class) {
            if (A06) {
                return;
            }
            c5952Xx.A02().A9t();
            A06 = true;
        }
    }

    private void A05(C5077Je c5077Je) {
        if (!c5077Je.A0A()) {
            String str = A05;
            Log.e(str, A02(7, 29, 24) + c5077Je.A06() + A02(0, 7, 55));
            return;
        }
        A06(c5077Je);
        this.A01.AFi(c5077Je, new C5744UY(this, c5077Je));
    }

    @SuppressLint({"ThrowException"})
    private void A06(C5077Je c5077Je) {
        switch (C5081Ji.A00[c5077Je.A06().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                C444690 c444690 = new C444690(new Exception(A02(36, 5, 50)));
                c444690.A03(1);
                try {
                    c444690.A05(new JSONObject().put(A02(48, 4, 107), c5077Je.A06().toString()));
                } catch (JSONException unused) {
                }
                this.A00.A06().A8z(A02(41, 7, 50), C44458z.A1H, c444690);
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A8q(String str, Map<String, String> map) {
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A04).A02(EnumC5083Jk.A04).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A8t(String str, Map<String, String> map) {
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A04).A02(EnumC5083Jk.A06).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A8u(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A04).A02(EnumC5083Jk.A07).A06(C5090Jr.A0A(str, EnumC5087Jo.A0I)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A8v(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A04).A02(EnumC5083Jk.A08).A06(C5090Jr.A0A(str, EnumC5087Jo.A06)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A8x(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A04).A02(EnumC5083Jk.A0B).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A91(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A04).A02(EnumC5083Jk.A0C).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A93(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A05).A02(EnumC5083Jk.A0D).A06(C5090Jr.A0A(str, EnumC5087Jo.A0T)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A94(String str, @Nullable Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A05).A02(EnumC5083Jk.A0E).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A95(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A05).A02(EnumC5083Jk.A0F).A06(C5090Jr.A0A(str, EnumC5087Jo.A0V)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A96(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A05).A02(EnumC5083Jk.A0K).A06(C5090Jr.A0A(str, EnumC5087Jo.A0W)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A97(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A05).A02(EnumC5083Jk.A0H).A06(C5090Jr.A0A(str, EnumC5087Jo.A0X)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A99(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A04).A02(EnumC5083Jk.A0J).A06(C5090Jr.A0A(str, EnumC5087Jo.A0Y)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A9B(String str, Map<String, String> map, String str2, EnumC5082Jj enumC5082Jj) {
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(enumC5082Jj).A02(EnumC5083Jk.A00(str2)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A9C(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A04).A02(EnumC5083Jk.A0L).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A9G(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A05).A02(EnumC5083Jk.A0N).A06(C5090Jr.A0A(str, EnumC5087Jo.A0a)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A9H(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A05).A02(EnumC5083Jk.A0O).A06(C5090Jr.A0A(str, EnumC5087Jo.A0b)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A9J(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A01(EnumC5082Jj.A04).A02(EnumC5083Jk.A0P).A06(C5090Jr.A0A(str, EnumC5087Jo.A0c)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A9L(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A04).A02(EnumC5083Jk.A0G).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A9M(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A05).A02(EnumC5083Jk.A0Q).A06(C5090Jr.A0A(str, EnumC5087Jo.A0g)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A9N(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A04).A02(EnumC5083Jk.A0U).A06(C5090Jr.A0A(str, EnumC5087Jo.A0i)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A9O(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A04).A02(EnumC5083Jk.A0T).A06(C5090Jr.A0A(str, EnumC5087Jo.A0j)).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A9P(String str, Map<String, String> map) {
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A05).A02(EnumC5083Jk.A0V).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void A9R(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        A05(new C5076Jd().A04(str).A00(this.A00.A07().A01()).A03(this.A00.A07().A02()).A05(map).A01(EnumC5082Jj.A05).A02(EnumC5083Jk.A0W).A07(this.A00));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5080Jh
    public final void ADD(String str) {
        new AsyncTaskC5547RM(this.A00).execute(str);
    }
}
