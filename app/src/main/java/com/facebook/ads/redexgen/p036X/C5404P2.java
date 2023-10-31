package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.P2 */
/* loaded from: assets/audience_network.dex */
public final class C5404P2 extends FrameLayout {
    public static byte[] A0L;
    public static String[] A0M = {"tg98T7YqorVxljyy5rC9rRviyjZQ3PWt", "vfHBQfbeXMWpx0Lt9J2p4bolhXFdVoUD", "nuD8gLvjahybAxP4K7AI7EnQPexhi40p", "Mle9DIn2BhVQrDGkT0Ym6c4cXgC65WVc", "K7R1lop0AG70QQAdOPTNlaEDkQeUTiOI", "yRh0uKXr8zSd48KJrOgjFYKLFGGCRN1w", "QQOq4rDYvkiUVU0ErOwgNbjJJCuazTiH", "YmsKh0Z7MVbEzdUA2tq2qo4jdnYDOoVM"};
    @Nullable
    public EnumC5469Q6 A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final AbstractC397518 A05;
    public final C43657U A06;
    public final C5953Xy A07;
    public final C5088Jp A08;
    public final InterfaceC5269Mq A09;
    public final InterfaceC5296NI A0A;
    public final InterfaceC5403P1 A0B;
    public final C5460Px A0C;
    public final C5483QK A0D;
    public final C439889 A0E;
    public final AbstractC5285N6 A0F;
    public final AbstractC5283N4 A0G;
    public final AbstractC5216Lz A0H;
    public final AbstractC5200Lj A0I;
    public final AbstractC5161L4 A0J;
    public final AbstractC5160L3 A0K;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 38);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0L = new byte[]{5, 19, 20, 20, 3, 8, 18, 50, 15, 11, 3, 78, 95, 88, 75, 94, 67, 69, 68, 95, 71, 70, 87, 86, 98, 115, 103, 97, 119, 118, 80, 107, 71, 97, 119, 96, 38, 36, 57, 49, 36, 51, 37, 37};
    }

    static {
        A0C();
    }

    public C5404P2(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, AbstractC397518 abstractC397518, C43657U c43657u, C5088Jp c5088Jp, InterfaceC5269Mq interfaceC5269Mq, InterfaceC5296NI interfaceC5296NI, InterfaceC5403P1 interfaceC5403P1) {
        super(c5953Xy);
        this.A0J = new AbstractC5161L4() { // from class: com.facebook.ads.redexgen.X.9z
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 5);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{16, 18, 5, 16, 1, 18, 5, 4};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A02 */
            public final void A03(C5173LG c5173lg) {
                InterfaceC5403P1 interfaceC5403P12;
                JSONObject A03;
                C5404P2.this.A03 = true;
                interfaceC5403P12 = C5404P2.this.A0B;
                A03 = C5404P2.this.A03();
                interfaceC5403P12.ACj(A00(0, 8, 101), A03);
            }
        };
        this.A0I = new AbstractC5200Lj() { // from class: com.facebook.ads.redexgen.X.9s
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{65, 93, 80, 72};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A02 */
            public final void A03(C5215Ly c5215Ly) {
                InterfaceC5403P1 interfaceC5403P12;
                JSONObject A03;
                C5404P2.this.A04 = true;
                interfaceC5403P12 = C5404P2.this.A0B;
                A03 = C5404P2.this.A03();
                interfaceC5403P12.ACj(A00(0, 4, 62), A03);
            }
        };
        this.A0H = new AbstractC5216Lz() { // from class: com.facebook.ads.redexgen.X.9n
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{28, 13, 25, 31, 9};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A02 */
            public final void A03(C439585 c439585) {
                InterfaceC5403P1 interfaceC5403P12;
                JSONObject A03;
                interfaceC5403P12 = C5404P2.this.A0B;
                A03 = C5404P2.this.A03();
                interfaceC5403P12.ACj(A00(0, 5, 49), A03);
            }
        };
        this.A0K = new AbstractC5160L3() { // from class: com.facebook.ads.redexgen.X.9Z
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A00 */
            public final void A03(C439484 c439484) {
                C5404P2.this.A0H(c439484);
                C5404P2.this.A0A();
            }
        };
        this.A0F = new AbstractC5285N6() { // from class: com.facebook.ads.redexgen.X.9G
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 77);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{20, 32, 30, 33, 29, 22, 37, 22, 21};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
            /* renamed from: A02 */
            public final void A03(C439788 c439788) {
                InterfaceC5403P1 interfaceC5403P12;
                C5483QK c5483qk;
                JSONObject A04;
                C5404P2.this.A07();
                interfaceC5403P12 = C5404P2.this.A0B;
                C5404P2 c5404p2 = C5404P2.this;
                c5483qk = c5404p2.A0D;
                A04 = c5404p2.A04(c5483qk.getDuration());
                interfaceC5403P12.ACj(A00(0, 9, 100), A04);
            }
        };
        this.A0G = new C44609E(this);
        this.A03 = false;
        this.A04 = false;
        this.A02 = false;
        this.A01 = false;
        this.A07 = c5953Xy;
        this.A05 = abstractC397518;
        this.A06 = c43657u;
        this.A08 = c5088Jp;
        this.A09 = interfaceC5269Mq;
        this.A0A = interfaceC5296NI;
        this.A0D = new C5483QK(c5953Xy);
        this.A0B = interfaceC5403P1;
        this.A0D.setFunnelLoggingHandler(c5088Jp);
        this.A0D.getEventBus().A03(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
        this.A0E = new C439889(c5953Xy, interfaceC5080Jh, this.A0D, abstractC397518.A0U());
        if (C5064JR.A1J(this.A07)) {
            this.A0C = new C5460Px(c5953Xy, interfaceC5080Jh, this.A0D, abstractC397518.A0U(), null);
        } else {
            this.A0C = null;
        }
        A0B();
        this.A0D.setVideoURI(this.A06.A0S(this.A05.A0O().A0D().A08()));
        A09();
        C5245MS.A0M(this, this.A05.A0N().A01().A07(true));
        String A07 = abstractC397518.A0O().A0D().A07();
        if (!TextUtils.isEmpty(A07)) {
            C5379Od.A00(c5953Xy, this, A07);
        }
        addView(this.A0D, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A03() {
        return A04(this.A0D.getCurrentPositionInMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject A04(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(A02(0, 11, 64), i);
            jSONObject.put(A02(11, 8, 12), this.A0D.getDuration());
            jSONObject.put(A02(19, 5, 20), this.A0D.A0h());
            jSONObject.put(A02(24, 12, 52), this.A0D.A0j());
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A02) {
            return;
        }
        if (A0M[4].charAt(2) == 'n') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[2] = "wYD5NcGpzh0isOAoVzlYli3P4mnoyMgF";
        strArr[3] = "lJUNZHbcIhPOnD8CvxzjDicpi9xwJBJa";
        this.A02 = true;
    }

    private void A08() {
        this.A0D.postDelayed(new C5623Sa(this), C5064JR.A0I(this.A07));
    }

    private void A09() {
        this.A0D.postDelayed(new C5622SZ(this), C5064JR.A0J(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        this.A0B.ACj(A02(36, 8, 112), A03());
    }

    private void A0B() {
        if (!TextUtils.isEmpty(this.A05.A0O().A0D().A07())) {
            C43797m c43797m = new C43797m(this.A07);
            this.A0D.A0c(c43797m);
            c43797m.setImage(this.A05.A0O().A0D().A07());
        }
        C43246p c43246p = new C43246p(this.A07, true, this.A08);
        this.A0D.A0c(c43246p);
        this.A0D.A0c(new C5126KT(c43246p, EnumC5482QJ.A03, true));
        this.A0D.A0c(new C43737c(this.A07));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H(C439484 c439484) {
        if (this.A0D.getState() == EnumC5518Qt.A02 && C5064JR.A11(this.A07)) {
            this.A0D.postDelayed(new C5621SY(this, c439484), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(String str) {
        this.A07.A0D().A2n(str);
        if (C5064JR.A12(this.A07)) {
            A07();
            return;
        }
        InterfaceC5269Mq interfaceC5269Mq = this.A09;
        InterfaceC5296NI interfaceC5296NI = this.A0A;
        String[] strArr = A0M;
        if (strArr[5].charAt(16) != strArr[6].charAt(16)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0M;
        strArr2[2] = "EBONCaOY6he3EVwrjSVJVgPSsddIWnnf";
        strArr2[3] = "quoo3J1Esh1kTLqYeLvwyhMYZuOues3Q";
        interfaceC5269Mq.A3s(interfaceC5296NI.A6Z());
        this.A09.A3s(this.A0A.A6U());
    }

    public final void A0N() {
        this.A0D.setVolume(this.A05.A0O().A0D().A09() ? 0.0f : 1.0f);
        this.A0D.A0b(EnumC5469Q6.A02, 26);
        A08();
    }

    public final void A0O() {
        C5483QK c5483qk = this.A0D;
        if (c5483qk != null) {
            if (!this.A02) {
                c5483qk.A0a(EnumC5464Q1.A03);
            }
            this.A0D.getEventBus().A04(this.A0J, this.A0I, this.A0H, this.A0K, this.A0F, this.A0G);
            this.A0D.A0V();
        }
        C5460Px c5460Px = this.A0C;
        if (c5460Px != null) {
            c5460Px.A0A();
        }
        this.A0E.A0g();
    }

    public final void A0P() {
        this.A0D.A0Z(9);
        C5245MS.A0T(this);
        C5245MS.A0H(this.A0D);
        C5245MS.A0Z(this.A0D);
    }

    public final void A0Q() {
        this.A0D.A0a(EnumC5464Q1.A04);
    }

    public final void A0R(boolean z) {
        if (z) {
            this.A0D.setVolume(0.0f);
        } else {
            this.A0D.setVolume(1.0f);
        }
        A0A();
        if (A0M[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        A0M[4] = "yn69DofMHsLSVfdL7HK9OU5c1k1rZYJH";
    }

    public final void A0S(boolean z) {
        if (this.A0D.A0i()) {
            return;
        }
        this.A00 = this.A0D.getVideoStartReason();
        this.A01 = z;
        this.A0D.A0e(false, 19);
    }

    public final void A0T(boolean z) {
        if (this.A0D.A0j() || this.A02 || this.A0D.getState() == EnumC5518Qt.A06 || this.A00 == null) {
            return;
        }
        boolean z2 = this.A01;
        if (A0M[7].charAt(5) == 'u') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[1] = "icjW3n8vZZxsaCmttUmjcTI7CQu2m51p";
        strArr[0] = "kS3lp82K2YolC4kFtdcvtTBENFWE8ibh";
        if (!z2 || z) {
            this.A0D.A0b(this.A00, 27);
        }
    }

    public final void A0U(boolean z) {
        this.A0D.A0e(z, 18);
    }

    public final void A0V(boolean z) {
        this.A0D.A0b(EnumC5469Q6.A04, 25);
    }
}
