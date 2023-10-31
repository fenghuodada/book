package com.facebook.ads.redexgen.p036X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import okio.Utf8;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Xp */
/* loaded from: assets/audience_network.dex */
public class C5944Xp extends AbstractRunnableC5165L8 {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C44148U A01;
    public final /* synthetic */ InterfaceC44388s A02;
    public final /* synthetic */ C444690 A03;
    public final /* synthetic */ String A04;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 120);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{-37, -3, 30, 27, 46, 32, -39, 28, 43, 26, 44, 33, -39, 27, 30, 28, 26, 46, 44, 30, -39, 44, -2, 39, 47, 34, 43, 40, 39, 38, 30, 39, 45, -3, 26, 45, 26, 9, 43, 40, 47, 34, 29, 30, 43, -39, 39, 40, 45, -39, 34, 39, 35, 30, 28, 45, 30, 29, -46, -24, -19, -22, -97, -24, -14, -97, -19, -12, -21, -21, -96, 30, 33, 33, 38, 49, 38, 44, 43, 30, 41, 28, 38, 43, 35, 44, 45, 66, 45, 53, 56, 45, 46, 56, 49, 43, 48, 53, Utf8.REPLACEMENT_BYTE, 55, 43, Utf8.REPLACEMENT_BYTE, 60, 45, 47, 49, 62, 60, 62, 67, 64, 104, 91, 89, 101, 104, 90, 85, 90, 87, 106, 87, 88, 87, 105, 91, -18, -31, -19, -15, -31, -17, -16, -37, -27, -32, 44, 46, 27, 45, 50, 41, 30, 49, 51, 32, 50, 55, 46, 35, 29, 33, 45, 34, 35};
    }

    public C5944Xp(C44148U c44148u, String str, int i, C444690 c444690, InterfaceC44388s interfaceC44388s) {
        this.A01 = c44148u;
        this.A04 = str;
        this.A00 = i;
        this.A03 = c444690;
        this.A02 = interfaceC44388s;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        String stackTrace;
        Map<String, String> A4T;
        String A6q;
        AtomicReference atomicReference;
        try {
            if (C44398t.A0J(this.A01, this.A04, this.A00, this.A03)) {
                return;
            }
            C5091Js.A08(this.A01, EnumC5083Jk.A0A.toString() + A00(0, 1, 41) + this.A04);
            Throwable cause = this.A03.getCause();
            if (cause != null) {
                stackTrace = C5227MA.A03(this.A01, cause);
            } else if (C5066JT.A0R(this.A01)) {
                stackTrace = C5227MA.A03(this.A01, this.A03);
            } else {
                stackTrace = A00(0, 0, 106) + this.A03.getMessage();
            }
            if (C5066JT.A0V(this.A01)) {
                A4T = this.A01.A02().A4T();
            } else if (this.A02 != null) {
                A4T = this.A02.A6X();
            } else if (C44398t.A02) {
                String message = A00(1, 57, 65);
                C44398t.A0F(new RuntimeException(message, this.A03));
                A4T = new HashMap<>();
            } else {
                A4T = this.A01.A02().A4T();
            }
            A4T.put(A00(136, 7, 65), this.A04);
            A4T.put(A00(143, 12, 70), String.valueOf(this.A00));
            JSONObject A02 = this.A03.A02();
            if (A02 != null) {
                A4T.put(A00(71, 15, 69), A02.toString());
            }
            if ((A00(106, 5, 99).equals(this.A04) || A00(111, 15, 126).equals(this.A04)) && (A6q = this.A01.A02().A6q()) != null) {
                A4T.put(A00(86, 20, 84), A6q);
            }
            String A0A = this.A01.A0A();
            if (A0A != null && !TextUtils.isEmpty(A0A)) {
                A4T.put(A00(126, 10, 4), A0A);
            }
            atomicReference = C44398t.A0A;
            InterfaceC44378r interfaceC44378r = (InterfaceC44378r) atomicReference.get();
            if (interfaceC44378r == null) {
                C44398t.A0F(new RuntimeException(A00(58, 13, 7)));
            } else {
                interfaceC44378r.AFh(stackTrace, A4T, this.A01);
            }
        } catch (Throwable th) {
            C44398t.A0F(th);
        }
    }
}
