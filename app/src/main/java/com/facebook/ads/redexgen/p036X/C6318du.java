package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.du */
/* loaded from: assets/audience_network.dex */
public class C6318du implements InterfaceC39330R {
    public static byte[] A07;
    public static String[] A08 = {"nHMpSWMsnsV7ze4k7TMdpo8w7eAhh5yl", "NZIGXtqvLJqJvnsqDFZQPtZx", "Ad1TvQCscaWcF7stMWLl9lRlqQAvL", "Ujq4dS9mEeqxvShJwD8UISSMYbM", "6D9", "oL3lqgBhSNj2gXyheQdgS3kbnnn96fNg", "3X2AVVUyUAfxSvaFg1Rh03BQkiDduKF9", "x5OfLFoNyht1tsSSgvPC5bYcCNR"};
    public final C6316ds A00;
    public final AtomicReference<String> A05 = new AtomicReference<>();
    public final AtomicReference<String> A04 = new AtomicReference<>();
    public final AtomicReference<String> A03 = new AtomicReference<>();
    public final AtomicReference<EnumC39440c> A06 = new AtomicReference<>();
    public final UUID A01 = UUID.randomUUID();
    public final AtomicInteger A02 = new AtomicInteger(1);

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{5, 22, 13, 13, 6, 15, 60, 109, 126, 101, 101, 110, 103, 84, 120, 110, 122};
        String[] strArr = A08;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        A08[2] = "yQ17NavN7ZSoq7zHySEgN4tR7loqT";
    }

    static {
        A01();
    }

    public C6318du(C6316ds c6316ds) {
        this.A00 = c6316ds;
    }

    private void A02(int i, String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(0, 7, 60) + InterfaceC39390X.A0N.getName(), str);
            } catch (JSONException unused) {
            }
            A03(jSONObject);
            this.A00.A00().A9D(i, jSONObject);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    private final void A03(JSONObject jSONObject) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            try {
                jSONObject.put(A00(7, 10, 84), this.A02.getAndIncrement());
            } catch (Throwable th) {
                String placementType = A08[2];
                if (placementType.length() != 29) {
                    throw new RuntimeException();
                }
                String[] strArr = A08;
                strArr[7] = "UnqhnC2RP1s6q9DMOMPvS7zFM4J";
                strArr[3] = "fX0qBiaLsOBwY7ffp1ojH1RHxSy";
                C5158L0.A00(th, this);
                return;
            }
        } catch (JSONException unused) {
        }
        InterfaceC39390X.A0E.A04(this.A01).A02(jSONObject);
        String str = this.A05.get();
        if (!TextUtils.isEmpty(str)) {
            InterfaceC39390X.A0Q.A04(str).A02(jSONObject);
        }
        String str2 = this.A04.get();
        if (!TextUtils.isEmpty(str2)) {
            InterfaceC39390X.A0P.A04(str2).A02(jSONObject);
        }
        String str3 = this.A03.get();
        if (!TextUtils.isEmpty(str3)) {
            InterfaceC39390X.A0O.A04(str3).A02(jSONObject);
        }
        EnumC39440c enumC39440c = this.A06.get();
        if (enumC39440c != null) {
            InterfaceC39390X.A0D.A04(enumC39440c).A02(jSONObject);
        }
    }

    public final void A04(EnumC39350T enumC39350T, C39380W... c39380wArr) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (C39380W c39380w : c39380wArr) {
                c39380w.A02(jSONObject);
            }
            A03(jSONObject);
            this.A00.A00().A90(enumC39350T, jSONObject);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2Q(String str, int i) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0R, InterfaceC39390X.A0G.A04(Integer.valueOf(i)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2R(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0S, InterfaceC39390X.A0K.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2S(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0T, InterfaceC39390X.A0K.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2T(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0U, InterfaceC39390X.A0K.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2U(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0V, InterfaceC39390X.A0K.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2V(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0W, InterfaceC39390X.A0K.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2W(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0X, InterfaceC39390X.A0K.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2X() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0i, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2Y() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0v, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2Z(boolean z) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0Z, InterfaceC39390X.A01.A04(Boolean.valueOf(z)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2a(long j, int i, String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0x, InterfaceC39390X.A0F.A04(Integer.valueOf(i)), InterfaceC39390X.A0L.A04(str), InterfaceC39390X.A0J.A04(Long.valueOf(j)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2b() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0z, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2c() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0y, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2d() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A10, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2e(long j) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A11, InterfaceC39390X.A0J.A04(Long.valueOf(j)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2f(EnumC39320Q enumC39320Q) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A25, InterfaceC39390X.A00.A04(enumC39320Q));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2g(String str, String str2) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A04.set(str);
            this.A03.set(str2);
            A04(EnumC39350T.A0a, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2h() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0b, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2i() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0c, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2j(long j, int i, @Nullable String str, boolean z) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0d, InterfaceC39390X.A0J.A04(Long.valueOf(j)), InterfaceC39390X.A0F.A04(Integer.valueOf(i)), InterfaceC39390X.A0L.A04(str), InterfaceC39390X.A09.A04(Boolean.valueOf(z)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2k(long j) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0e, InterfaceC39390X.A0J.A04(Long.valueOf(j)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2l(boolean z) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A18, InterfaceC39390X.A0C.A04(Boolean.valueOf(z)));
        } catch (Throwable th) {
            String[] strArr = A08;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A08[6] = "gK8mXYwR0ckPpFtcTSNh6868pPwacmBZ";
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2m() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A19, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2n(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1D, InterfaceC39390X.A0L.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2o() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1E, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2p() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1F, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2q() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1G, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2r(int i) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1H, InterfaceC39390X.A0G.A04(Integer.valueOf(i)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2s() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1I, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2t() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1L, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2u() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1J, new C39380W[0]);
        } catch (Throwable th) {
            if (A08[6].charAt(19) != 'h') {
                throw new RuntimeException();
            }
            A08[6] = "TXE2cMU86vxtF7wI18ThzZXaU0uTRMLS";
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2v(int i) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1K, InterfaceC39390X.A0G.A04(Integer.valueOf(i)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2w() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1M, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2x(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1N, InterfaceC39390X.A0N.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2y() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1O, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A2z() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1P, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A30() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1Q, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A31() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1R, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A32(int i) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1S, InterfaceC39390X.A0G.A04(Integer.valueOf(i)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A33() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1T, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A34(int i) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1U, InterfaceC39390X.A0G.A04(Integer.valueOf(i)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A35() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A27, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            if (A08[4].length() != 3) {
                throw new RuntimeException();
            }
            A08[6] = "VZoNBueTz9dHgRCK2oHhqd2tucTd08Xg";
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A36() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A28, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A37(EnumC39320Q enumC39320Q) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A24, InterfaceC39390X.A00.A04(enumC39320Q));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A38(int i) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A26, InterfaceC39390X.A0H.A04(Integer.valueOf(i)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A39() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A29, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A3v(long j) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0g, InterfaceC39390X.A0J.A04(Long.valueOf(j)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            if (A08[0].charAt(15) != 'k') {
                throw new RuntimeException();
            }
            A08[1] = "iGvSb1Hz3BIwYRP6JXvlZVW4";
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A3w(long j) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0h, InterfaceC39390X.A0J.A04(Long.valueOf(j)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A41() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0j, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A4W() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0k, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A4X() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0o, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A4Y(boolean z) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0f, InterfaceC39390X.A08.A04(Boolean.valueOf(z)));
        } catch (Throwable th) {
            if (A08[1].length() == 19) {
                throw new RuntimeException();
            }
            A08[5] = "sws4bQbg9GprWoTPEe05ZlT1gMn94mHS";
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A4Z(int i, String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0p, InterfaceC39390X.A0F.A04(Integer.valueOf(i)), InterfaceC39390X.A0L.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A4a(boolean z) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0n, InterfaceC39390X.A03.A04(Boolean.valueOf(z)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A4b() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0r, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A4c() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0s, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A4d() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0t, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A4e() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A0u, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A4u() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1Y, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A4v(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1Z, InterfaceC39390X.A0N.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A4w() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1a, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A4x() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1b, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A4y() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1c, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A4z(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1d, InterfaceC39390X.A0L.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A50(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1e, InterfaceC39390X.A0L.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A51(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1f, InterfaceC39390X.A0N.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A52(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1h, InterfaceC39390X.A0L.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A53() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1i, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A54(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1j, InterfaceC39390X.A0L.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A55(long j) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1k, InterfaceC39390X.A0J.A04(Long.valueOf(j)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A56(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1l, InterfaceC39390X.A0L.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A88() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1m, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A89(boolean z) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1n, InterfaceC39390X.A07.A04(Boolean.valueOf(z)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A8A() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1o, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A8B(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1p, InterfaceC39390X.A0L.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A8C() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1q, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A8D() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1r, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A8E(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1s, InterfaceC39390X.A0M.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A8w(int i, String str) {
        if (C5158L0.A02(this) || i < 11000 || i > 11099) {
            return;
        }
        try {
            A02(i, str);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A9c(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A12, InterfaceC39390X.A0L.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A9d(int i) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A13, InterfaceC39390X.A0H.A04(Integer.valueOf(i)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            if (A08[4].length() != 3) {
                throw new RuntimeException();
            }
            A08[1] = "n4mJfQKCjkVGyNTXc44lq1NfZCr";
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A9e() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1v, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A9f() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1w, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A9g() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1x, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void A9i() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A14, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            if (A08[5].charAt(28) == 'u') {
                throw new RuntimeException();
            }
            A08[0] = "A3lONLTCXWx4KhpkbRCT5RNlo5C8otzX";
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void ADk(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A16, InterfaceC39390X.A0L.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void ADl() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A17, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AEh(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A05.set(str);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AEj(EnumC39440c enumC39440c) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            this.A06.set(enumC39440c);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFN() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1B, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFO() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1V, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFS() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A2A, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFT(int i, String str) {
        if (C5158L0.A02(this) || i < 12000 || i > 12099) {
            return;
        }
        try {
            A02(i, str);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFU() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A2B, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFV() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A2C, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFW() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A2D, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFX(boolean z) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A2E, InterfaceC39390X.A02.A04(Boolean.valueOf(z)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFY() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A2F, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFZ() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A2G, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFa(int i, @Nullable String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A2H, InterfaceC39390X.A0F.A04(Integer.valueOf(i)), InterfaceC39390X.A0L.A04(str));
        } catch (Throwable th) {
            if (A08[0].charAt(15) != 'k') {
                throw new RuntimeException();
            }
            A08[2] = "2PKYVe8Qgwv7j3CDJ6bxblARvZgyh";
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFb(boolean z) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A2I, InterfaceC39390X.A06.A04(Boolean.valueOf(z)));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFc() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A2J, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFd(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A2K, InterfaceC39390X.A0L.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFe(int i, String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A2L, InterfaceC39390X.A0L.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            if (A08[6].charAt(19) != 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[7] = "5qwGvT3tjlGxlYjcZrXYRuOycIv";
            strArr[3] = "UEyDz1QZjBltnQnS2IeC3S3ns7y";
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFf() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A2M, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFg(int i) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A2N, InterfaceC39390X.A0I.A04(Integer.valueOf(i)));
        } catch (Throwable th) {
            String[] strArr = A08;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A08[2] = "bm6dbMytZvpqzg8D3QKVLEJHQj3Ec";
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFl(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1W, InterfaceC39390X.A0L.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void AFm(String str) {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1X, InterfaceC39390X.A0L.A04(str));
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            if (A08[1].length() == 19) {
                throw new RuntimeException();
            }
            A08[5] = "ivuB5Sydf2jbsPKu7So7nbx7xRGWOHbH";
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final String getId() {
        if (C5158L0.A02(this)) {
            return null;
        }
        try {
            return this.A01.toString();
        } catch (Throwable th) {
            C5158L0.A00(th, this);
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC39330R
    public final void unregisterView() {
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            A04(EnumC39350T.A1A, new C39380W[0]);
        } catch (Throwable th) {
            C5158L0.A00(th, this);
        }
    }
}
