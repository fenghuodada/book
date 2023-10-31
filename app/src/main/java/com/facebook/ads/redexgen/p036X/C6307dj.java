package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.dj */
/* loaded from: assets/audience_network.dex */
public class C6307dj extends AbstractRunnableC5165L8 {
    public static byte[] A02;
    public static String[] A03 = {"oskFp91e5pmXbfqncEKHUOJlooKh56jY", "lReJ4EGI0ZfzcS4beAfFSCPJefxJWm51", "X9zy5AMUM8AKtatrcfePQZWL0uWUICrn", "wxwSRA3odXIdIsY7f5yZfv3v7", "O6Pxh8VVn00f1EJnP312TgPdEktEk3X8", "2QJh3yF6", "0YwPA87fpumxZ406JTpoKHsZ368w", "aJIZZEX98MAeULDgBorQq277OQTM9IaN"};
    public final /* synthetic */ C39610u A00;
    public final /* synthetic */ String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 67);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {29, 41, 28, 40, 44, 28, 37, 26, 48, 22, 26, 24, 39, 39, 32, 37, 30};
        String[] strArr = A03;
        if (strArr[2].charAt(10) != strArr[7].charAt(10)) {
            throw new RuntimeException();
        }
        A03[5] = "QkfkB";
        A02 = bArr;
    }

    static {
        A02();
    }

    public C6307dj(C39610u c39610u, String str) {
        this.A00 = c39610u;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C44148U c44148u;
        C44148U c44148u2;
        CountDownLatch countDownLatch;
        boolean A0J;
        C39600t c39600t;
        C39600t c39600t2;
        C39600t c39600t3;
        String A00 = A00(0, 17, 116);
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            A0J = this.A00.A0J(this.A01);
            if (A0J) {
                c39600t = this.A00.A02;
                ((C39911O) c39600t.A05().get(this.A01)).A04((int) (System.currentTimeMillis() / 1000));
                c39600t2 = this.A00.A02;
                c39600t2.A07(this.A01);
                c39600t3 = this.A00.A02;
                c39600t3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e) {
            c44148u2 = this.A00.A03;
            c44148u2.A06().A8y(A00, C44458z.A1B, new C444690(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            c44148u = this.A00.A03;
            c44148u.A06().A8y(A00, C44458z.A1A, new C444690(e2));
        }
    }
}
