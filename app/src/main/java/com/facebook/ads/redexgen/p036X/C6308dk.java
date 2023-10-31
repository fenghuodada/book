package com.facebook.ads.redexgen.p036X;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.dk */
/* loaded from: assets/audience_network.dex */
public class C6308dk extends AbstractRunnableC5165L8 {
    public static byte[] A02;
    public static String[] A03 = {"CdCLIQRd", "Gozok8EGiq89CC7S8QZsNr", "pl5lQHAXyLio1ost", "M44cRouQCRL7K0vypo2P04DU", "Y2GzUIW8g3L", "Bs9wehYqNd3BdGUVOwkaAN", "ajmsB695tQiR2xtfKUGvlSwazulcZzs7", "Sy9bhDNhoUd7kDt0yrvFBLns12VVbk64"};
    public final /* synthetic */ C39610u A00;
    public final /* synthetic */ String A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 47;
            if (A03[6].charAt(27) != 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "CuQnTMvQt2iEBPylhK7T15";
            strArr[1] = "FSZFy24WJ9CShZHmahty6u";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A03[6].charAt(27) != 'c') {
            throw new RuntimeException();
        }
        A03[3] = "LuOw";
        A02 = new byte[]{-99, -87, -100, -88, -84, -100, -91, -102, -80, -106, -102, -104, -89, -89, -96, -91, -98};
    }

    static {
        A02();
    }

    public C6308dk(C39610u c39610u, String str) {
        this.A00 = c39610u;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractRunnableC5165L8
    public final void A06() {
        C44148U c44148u;
        C44148U c44148u2;
        CountDownLatch countDownLatch;
        C39600t c39600t;
        C39600t c39600t2;
        C39600t c39600t3;
        boolean A0J;
        C39600t c39600t4;
        try {
            countDownLatch = this.A00.A06;
            countDownLatch.await();
            c39600t = this.A00.A02;
            synchronized (c39600t) {
                c39600t2 = this.A00.A02;
                Iterator<String> keys = c39600t2.A05().keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    C39610u c39610u = this.A00;
                    String encryptedId = this.A01;
                    A0J = c39610u.A0J(encryptedId);
                    if (A0J) {
                        C39610u c39610u2 = this.A00;
                        c39600t4 = this.A00.A02;
                        String encryptedId2 = this.A01;
                        c39610u2.A0E((C39911O) c39600t4.A05().get(next), next, next.equals(encryptedId2));
                    }
                }
                c39600t3 = this.A00.A02;
                c39600t3.A06();
                this.A00.A08();
            }
        } catch (InterruptedException e) {
            c44148u2 = this.A00.A03;
            c44148u2.A06().A8y(A00(0, 17, 8), C44458z.A1B, new C444690(e));
        } catch (JSONException e2) {
            this.A00.A0M();
            c44148u = this.A00.A03;
            c44148u.A06().A8y(A00(0, 17, 8), C44458z.A1A, new C444690(e2));
        }
    }
}
