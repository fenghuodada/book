package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.cz */
/* loaded from: assets/audience_network.dex */
public class C6261cz extends AbstractRunnableC5165L8 {
    public static byte[] A05;
    public static String[] A06 = {"Gpv8eHHTEOtePQmo1OD6muRo415gTvmp", "m8VLVbL9uinkegCEMoYL3DBV4Qd", "9DesmfPYImwpHbFMCkN8D4N2A0eEtTnA", "p6qK7niiHhY9MGJ6cPP69YBKuDETC8Y4", "5iURk91XNbuPvrJWt8OL2zSUhjl2Moa0", "44pBDqZwGccZEwpE1ClPCXXxeIB", "3LUdHIp1lrC6CN8jsqyi77AXm4NZ0z", "iLxtTrJV"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ C6298da A01;
    public final /* synthetic */ C40191q A02;
    public final /* synthetic */ C4819FO A03;
    public final /* synthetic */ C44619F A04;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A06;
            if (strArr[1].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A06[2] = "zvIoaGxek6NRisBEUIKkM8UdU9N5bmYn";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 50);
            i4++;
        }
    }

    public static void A02() {
        A05 = new byte[]{33, 61, 19, 54, 51, 34, 38, 55, 32, 114, 38, 59, Utf8.REPLACEMENT_BYTE, 55, 61, 39, 38, 124, 90, 77, 77, 80, 77, 36, 58, 46, 119, 106, 110, 102, 108, 118, 119};
        if (A06[4].charAt(21) == 'x') {
            throw new RuntimeException();
        }
        A06[2] = "OuAVUMSSWbttlxL4z5HkeS5T535dgvDy";
    }

    static {
        A02();
    }

    public C6261cz(C4819FO c4819fo, C40191q c40191q, C6298da c6298da, long j, C44619F c44619f) {
        this.A03 = c4819fo;
        this.A02 = c40191q;
        this.A01 = c6298da;
        this.A00 = j;
        this.A04 = c44619f;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        Map A01;
        this.A03.A0N(this.A02);
        this.A03.A0K(this.A01);
        A01 = this.A03.A01(this.A00);
        A01.put(A00(18, 5, 13), A00(0, 2, 62));
        A01.put(A00(23, 3, 123), A00(26, 7, 49));
        this.A03.A05(this.A04.A03(EnumC44659J.A05), A01);
        this.A03.AAi(new C5115KH(AdErrorType.NETWORK_ERROR, A00(2, 16, 96)));
    }
}
