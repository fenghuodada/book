package com.facebook.ads.redexgen.p036X;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.facebook.ads.redexgen.X.Xz */
/* loaded from: assets/audience_network.dex */
public class C5954Xz implements InterfaceC5508Qj {
    public static byte[] A04;
    public static String[] A05 = {"YemVV2CAzinSYko79pvdFyiaYh6Ax0NW", "FtFCRkuseyQck6qipAKyAgz81MNc63Vq", "zQJLp3VKHBLQ3ByylDAuuS44tkTO3MMG", "42Yp5AyXW20j54q75pN0MZ83oMgNP5AR", "H6ih9Bh2z", "6YmusGfII7QcqEjcRVkg771Wm5bkMvFZ", "MrQdRQonl4dLBaJwcA8", "V6zsFfxQuHmo6VBO3CkkHMQL74uZQLm4"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ CallableC43607P A02;
    public final /* synthetic */ C43617Q A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 94);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{24, 3, 6, 3, 2, 26, 3, 62, 33, 44, 45, 39};
    }

    static {
        A01();
    }

    public C5954Xz(CallableC43607P callableC43607P, C43617Q c43617q, long j, long j2) {
        this.A02 = callableC43607P;
        this.A03 = c43617q;
        this.A00 = j;
        this.A01 = j2;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5508Qj
    public final void AAY(boolean z) {
        C44148U c44148u;
        BlockingQueue blockingQueue;
        C44148U c44148u2;
        Map map;
        C44148U c44148u3;
        c44148u = this.A02.A01.A04;
        if (C43687X.A06(c44148u)) {
            C43677W c43677w = new C43677W(this.A03.A06, this.A03.A07, A00(7, 5, 22), this.A03.A02, this.A03.A08);
            c44148u2 = this.A02.A01.A04;
            C43687X.A04(c44148u2, c43677w, z);
            if (!z) {
                c44148u3 = this.A02.A01.A04;
                C43687X.A05(c44148u3, this.A03.A06, this.A03.A07, this.A03.A08, A00(7, 5, 22), this.A03.A02, 2112, null, Long.valueOf(this.A00), Long.valueOf(System.currentTimeMillis() - this.A01), null);
            }
            map = C43657U.A0G;
            if (A05[1].charAt(13) == 'O') {
                throw new RuntimeException();
            }
            A05[1] = "tpujksKgYg5a3fdXCIDkrfoMaur1s0eW";
            map.put(c43677w.A04, c43677w);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(true);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5508Qj
    public final void AAk(@Nullable Throwable th) {
        C44148U c44148u;
        BlockingQueue blockingQueue;
        C44148U c44148u2;
        c44148u = this.A02.A01.A04;
        if (C43687X.A06(c44148u)) {
            c44148u2 = this.A02.A01.A04;
            String str = this.A03.A06;
            String str2 = this.A03.A07;
            String str3 = this.A03.A08;
            String str4 = this.A03.A02;
            String th2 = th != null ? th.toString() : A00(0, 7, 51);
            Long valueOf = Long.valueOf(System.currentTimeMillis() - this.A01);
            String[] strArr = A05;
            if (strArr[3].charAt(20) == strArr[0].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "AayJnSlXKOYoed0ZHJ3UlPrg44Go7inE";
            strArr2[7] = "t2uUu9WqhkybHrBNVhVVT1YnAGopOKs6";
            C43687X.A05(c44148u2, str, str2, str3, A00(7, 5, 22), str4, 2119, th2, null, valueOf, null);
        }
        try {
            blockingQueue = this.A02.A00;
            blockingQueue.put(false);
        } catch (InterruptedException unused) {
        }
    }
}
