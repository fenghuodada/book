package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import okio.Utf8;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.U1 */
/* loaded from: assets/audience_network.dex */
public class C5711U1 implements InterfaceC5528R3 {
    public static byte[] A03;
    public final /* synthetic */ long A00;
    public final /* synthetic */ C5140Kh A01;
    public final /* synthetic */ C5143Kk A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{98, 98, 97, 99, 104, 104, 105, 54, 19, 66, 65, 30, 18, 18, 66, 18, 1, 24, 4, 5, 14, 51, 40, 46, 59, Utf8.REPLACEMENT_BYTE, 34, 36, 37, 113, 107, 108, 90, 77, 73, 90, 77, 31, 90, 77, 77, 80, 77, 31, 80, 92, 92, 74, 77, 77, 90, 91, 75, 125, 106, 110, 125, 106, 56, 106, 125, 104, 116, 113, 125, 124, 56, 107, 109, 123, 123, 125, 107, 107, 126, 109, 116, 116, 97, 75, 74, 103, 75, 73, 84, 72, 65, 80, 65, 95, 94, 117, 66, 66, 95, 66};
    }

    public C5711U1(C5143Kk c5143Kk, C5140Kh c5140Kh, long j) {
        this.A02 = c5143Kk;
        this.A01 = c5140Kh;
        this.A00 = j;
    }

    private final void A02(C5540RF c5540rf) {
        C5953Xy c5953Xy;
        long j;
        C5953Xy c5953Xy2;
        long j2;
        C5144Kl c5144Kl;
        C5953Xy c5953Xy3;
        C5953Xy c5953Xy4;
        long j3;
        C5139Kg.A06(this.A01);
        try {
            InterfaceC5526R1 A00 = c5540rf.A00();
            if (A00 != null) {
                String errorMsg = A00.A5p();
                c5144Kl = this.A02.A05;
                c5953Xy3 = this.A02.A04;
                C5146Kn A06 = c5144Kl.A06(c5953Xy3, errorMsg, this.A00);
                if (A06.A01() == EnumC5145Km.A03) {
                    C5707Tx c5707Tx = (C5707Tx) A06;
                    String finalErrMessage = c5707Tx.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c5707Tx.A03(), AdErrorType.ERROR_MESSAGE);
                    if (finalErrMessage != null) {
                        errorMsg = finalErrMessage;
                    }
                    c5953Xy4 = this.A02.A04;
                    InterfaceC39330R A0D = c5953Xy4.A0D();
                    j3 = this.A02.A00;
                    A0D.A2j(C5236MJ.A01(j3), adErrorTypeFromCode.getErrorCode(), errorMsg, adErrorTypeFromCode.isPublicError());
                    this.A02.A0D(C5115KH.A01(adErrorTypeFromCode, errorMsg));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String message = c5540rf.getMessage();
            c5953Xy2 = this.A02.A04;
            InterfaceC39330R A0D2 = c5953Xy2.A0D();
            j2 = this.A02.A00;
            A0D2.A2j(C5236MJ.A01(j2), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
            this.A02.A0D(C5115KH.A01(adErrorType, message));
        } catch (JSONException e) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String message2 = c5540rf.getMessage();
            c5953Xy = this.A02.A04;
            InterfaceC39330R A0D3 = c5953Xy.A0D();
            j = this.A02.A00;
            long A01 = C5236MJ.A01(j);
            int errorCode = adErrorType2.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String errorMessage = A00(16, 15, 65);
            sb.append(errorMessage);
            String errorMessage2 = e.getMessage();
            sb.append(errorMessage2);
            A0D3.A2j(A01, errorCode, sb.toString(), adErrorType2.isPublicError());
            this.A02.A0D(C5115KH.A01(adErrorType2, message2));
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5528R3
    public final void AAM(InterfaceC5526R1 interfaceC5526R1) {
        C5128KV.A05(A00(79, 10, 46), A00(52, 27, 18), A00(8, 8, 45));
        if (interfaceC5526R1 != null) {
            String A5p = interfaceC5526R1.A5p();
            C5139Kg.A06(this.A01);
            this.A02.A0N(A5p, this.A00, this.A01);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5528R3
    public final void AAj(Exception exc) {
        C5953Xy c5953Xy;
        long j;
        C5128KV.A05(A00(89, 7, 58), A00(31, 21, 53), A00(0, 8, 90));
        if (C5540RF.class.equals(exc.getClass())) {
            A02((C5540RF) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String message = exc.getMessage();
        c5953Xy = this.A02.A04;
        InterfaceC39330R A0D = c5953Xy.A0D();
        j = this.A02.A00;
        A0D.A2j(C5236MJ.A01(j), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
        this.A02.A0D(C5115KH.A01(adErrorType, message));
    }
}
