package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Px */
/* loaded from: assets/audience_network.dex */
public final class C5460Px {
    public static byte[] A09;
    public static String[] A0A = {"gG8B5BBzXX0tXn8mAXm3GrlCsmKREgEL", "fszKDaGs6AGUXXOQg2WnNIBtS95Yz1Wh", "pnaE4meNhzrzHKSDh8PgaIlwU76aGgw8", "2ARCPk0NRRRG", "SMbVAXo8eG5PUWUAvoNRrVLTO99Zprm", "yA01QlsAfT3JJVyfy2ZKp77MLzjsBWHz", "Xgpz8alFBhAPNTQJpcXFzk4NTQQyuYWJ", "Svb9BuXOcdwLltO0M440Yd8RGfHrN1wk"};
    public final C5953Xy A00;
    public final InterfaceC5080Jh A01;
    public final C5483QK A02;
    public final C5602SF A06;
    public final String A07;
    @Nullable
    public final Map<String, String> A08;
    public final AbstractC5282N3 A04 = new AbstractC5282N3() { // from class: com.facebook.ads.redexgen.X.8I
        public static String[] A01 = {"m3H5fDZT", "tfUidThth72U8se7Apa4PT2ZGwk9ZGOU", "C7sqCneijRx2oiAJ7jgCjnbvSplD6Hvu", "CUEN1UWJGCJ8qOG4MMTMPK9Ub", "uwIe", "I7QxkSDWYBotgEGySbiUy5NvkBUV0QEh", "dizwBFytggLGpocgnk6CXcKxg", "vsUFvcPPfrfWhSaT8AiBmEZ9b5CjjyAT"};

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
        /* renamed from: A00 */
        public final void A03(C439686 c439686) {
            String str;
            C5602SF c5602sf;
            str = C5460Px.this.A07;
            C5603SG c5603sg = new C5603SG(str, c439686.A03(), c439686.A01(), c439686.A02());
            if (c439686.A00() >= 0.05d) {
                c5603sg.A05(c439686.A01());
            }
            c5602sf = C5460Px.this.A06;
            c5602sf.A0B(c5603sg);
            String[] strArr = A01;
            if (strArr[6].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "q64iGrGvaw5ijPmr6ZKPys7vT4QnDerr";
            strArr2[5] = "OAtIhinrRl4iSEKbz1e7g3lvuawk4XhB";
        }
    };
    public final AbstractC5216Lz A05 = new AbstractC5216Lz() { // from class: com.facebook.ads.redexgen.X.8G
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
        /* renamed from: A00 */
        public final void A03(C439585 c439585) {
            C5460Px.this.A09();
        }
    };
    public final AbstractC5285N6 A03 = new AbstractC5285N6() { // from class: com.facebook.ads.redexgen.X.8F
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.p036X.AbstractC44839c
        /* renamed from: A00 */
        public final void A03(C439788 c439788) {
            C5460Px.this.A09();
        }
    };

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 96);
        }
        return new String(copyOfRange);
    }

    public static void A08() {
        A09 = new byte[]{62, 42, 57, 53, 61, 43};
    }

    static {
        A08();
    }

    public C5460Px(C5953Xy c5953Xy, InterfaceC5080Jh interfaceC5080Jh, C5483QK c5483qk, String str, @Nullable Map<String, String> map) {
        this.A00 = c5953Xy;
        this.A01 = interfaceC5080Jh;
        this.A07 = str;
        this.A08 = map;
        this.A02 = c5483qk;
        this.A06 = new C5602SF(this.A07);
        this.A02.getEventBus().A03(this.A04, this.A05, this.A03);
    }

    private Map<String, String> A07(String str) {
        HashMap hashMap = new HashMap();
        Map<String, String> map = this.A08;
        if (map != null) {
            hashMap.putAll(map);
        }
        hashMap.put(A05(0, 6, 56), str);
        return hashMap;
    }

    public final void A09() {
        String A04 = C5602SF.A04(this.A06.A0A());
        if (A04 != null) {
            InterfaceC5080Jh interfaceC5080Jh = this.A01;
            String encodedFrameData = A0A[4];
            if (encodedFrameData.length() == 13) {
                throw new RuntimeException();
            }
            A0A[3] = "qc6G14080U";
            interfaceC5080Jh.A9H(this.A07, A07(A04));
        }
    }

    public final void A0A() {
        C5576Rp c5576Rp = new C5576Rp(this);
        if (this.A02.A0l()) {
            ExecutorC5239MM.A00(c5576Rp);
        } else {
            this.A02.getStateHandler().post(c5576Rp);
        }
    }
}
