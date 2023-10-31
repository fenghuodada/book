package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.dl */
/* loaded from: assets/audience_network.dex */
public class C6309dl extends AbstractRunnableC5165L8 {
    public static byte[] A02;
    public final /* synthetic */ C39610u A00;
    public final /* synthetic */ JSONObject A01;

    static {
        A02();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 21);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{7, 19, 4, 16, 20, 4, 15, 2, 24, 62, 2, 0, 17, 17, 8, 15, 6};
    }

    public C6309dl(C39610u c39610u, JSONObject jSONObject) {
        this.A00 = c39610u;
        this.A01 = jSONObject;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C44148U c44148u;
        C44148U c44148u2;
        CountDownLatch countDownLatch;
        C39600t c39600t;
        C39600t c39600t2;
        CountDownLatch countDownLatch2;
        try {
            countDownLatch = this.A00.A05;
            countDownLatch.await();
            c39600t = this.A00.A02;
            synchronized (c39600t) {
                c39600t2 = this.A00.A02;
                c39600t2.A0B(this.A01);
                countDownLatch2 = this.A00.A06;
                countDownLatch2.countDown();
            }
        } catch (InterruptedException e) {
            c44148u2 = this.A00.A03;
            c44148u2.A06().A8y(A00(0, 17, 116), C44458z.A1B, new C444690(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            c44148u = this.A00.A03;
            c44148u.A06().A8y(A00(0, 17, 116), C44458z.A1A, new C444690(e2));
        }
    }
}
