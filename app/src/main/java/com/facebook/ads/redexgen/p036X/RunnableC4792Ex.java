package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.offline.DownloadAction;
import java.io.IOException;
import java.util.Arrays;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.Ex */
/* loaded from: assets/audience_network.dex */
public final class RunnableC4792Ex implements Runnable {
    public static byte[] A08;
    public static String[] A09 = {"KOAWbsFFbfk0jNgDY62WpIsFaQMswz1L", "pC7XDjTrGSoCHMQrO1sG15bqJEuDqJQJ", "uN2VaEj4rnuk1e19MnznGB1XwQ8yCVfE", "6JBJvnr9DSzDH8E8QP73ZcoxgSr1ahx0", "ultRdxrvkIUuntIMLaCfX8e7z", "lHTnNhXeBOI0IY3AJtGeZO2cjDNAOeyF", "OUHreehzciBJFgJNDowFbwPiXi5p615H", "Ps2SQ7luP6kIA6gbjSFjdYKTtXuPzT18"};
    public Thread A00;
    public Throwable A01;
    public final int A02;
    public final int A03;
    public final DownloadAction A04;
    public final C4795F0 A05;
    public volatile int A06;
    public volatile InterfaceC4799F4 A07;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A09[2].charAt(18) == 'Y') {
                throw new RuntimeException();
            }
            A09[4] = "noItpERo7CNNkHWI";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 26);
            i4++;
        }
    }

    public static void A0B() {
        A08 = new byte[]{74, 97, 121, 96, 98, 97, 111, 106, 46, 107, 124, 124, 97, 124, 32, 46, 92, 107, 122, 124, 119, 46, 20, 35, 53, 35, 50, 102, 35, 52, 52, 41, 52, 102, 37, 41, 51, 40, 50, 104, 102, 34, 41, 49, 40, 42, 41, 39, 34, 35, 34, 4, Utf8.REPLACEMENT_BYTE, 50, 35, 53, 102, 123, 102, 120, 77, 95, 71, 12, 69, 95, 12, 95, 88, 77, 94, 88, 73, 72};
    }

    static {
        A0B();
    }

    public RunnableC4792Ex(int i, C4795F0 c4795f0, DownloadAction downloadAction, int i2) {
        this.A02 = i;
        this.A05 = c4795f0;
        this.A04 = downloadAction;
        this.A06 = 0;
        this.A03 = i2;
    }

    public /* synthetic */ RunnableC4792Ex(int i, C4795F0 c4795f0, DownloadAction downloadAction, int i2, RunnableC4784Ep runnableC4784Ep) {
        this(i, c4795f0, downloadAction, i2);
    }

    private final float A00() {
        if (this.A07 != null) {
            return this.A07.A6P();
        }
        return -1.0f;
    }

    private int A01() {
        int i = this.A06;
        if (i == 5) {
            if (A09[2].charAt(18) != 'Y') {
                String[] strArr = A09;
                strArr[7] = "PDzOFNAaWMsAK9ucradbIEZZH9uUUiPx";
                strArr[1] = "5zRQ9og93WQ9CsswYkuffD8bWtu0S7Rl";
                return 0;
            }
            throw new RuntimeException();
        }
        String[] strArr2 = A09;
        if (strArr2[7].charAt(26) != strArr2[1].charAt(26)) {
            throw new RuntimeException();
        }
        String[] strArr3 = A09;
        strArr3[6] = "vqOmrLNCQqkZmFNmkdUDZ8pThcmdYove";
        strArr3[3] = "yFowKLjp7WUTebccThRrdi4MGh2wopLF";
        if (i != 6 && i != 7) {
            return this.A06;
        }
        return 1;
    }

    private int A02(int i) {
        return Math.min((i - 1) * 1000, 5000);
    }

    private final long A05() {
        if (this.A07 != null) {
            return this.A07.A6Q();
        }
        return 0L;
    }

    public void A08() {
        Handler handler;
        if (!A0F(0, 5)) {
            if (!A0F(1, 6)) {
                return;
            }
            A09();
            return;
        }
        handler = this.A05.A07;
        handler.post(new RunnableC4789Eu(this));
    }

    private void A09() {
        if (this.A07 != null) {
            this.A07.cancel();
        }
        this.A00.interrupt();
    }

    public void A0A() {
        if (A0F(0, 1)) {
            this.A00 = new Thread(this);
            this.A00.start();
        }
    }

    public boolean A0E() {
        return this.A06 == 0;
    }

    public boolean A0F(int i, int i2) {
        return A0G(i, i2, null);
    }

    public boolean A0G(int i, int i2, Throwable th) {
        if (this.A06 != i) {
            return false;
        }
        this.A06 = i2;
        this.A01 = th;
        if (!(this.A06 != A01())) {
            this.A05.A0E(this);
        }
        return true;
    }

    public final C4794Ez A0K() {
        return new C4794Ez(this.A02, this.A04, A01(), A00(), A05(), this.A01, null);
    }

    public final boolean A0L() {
        return this.A06 == 5 || this.A06 == 1 || this.A06 == 7 || this.A06 == 6;
    }

    public final boolean A0M() {
        return this.A06 == 4 || this.A06 == 2 || this.A06 == 3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        C4800F5 c4800f5;
        if (C5158L0.A02(this)) {
            return;
        }
        try {
            C4795F0.A0J(A07(59, 15, 54), this);
            Throwable th = null;
            try {
                DownloadAction downloadAction = this.A04;
                c4800f5 = this.A05.A0A;
                this.A07 = downloadAction.A07(c4800f5);
                if (this.A04.A03) {
                    this.A07.remove();
                } else {
                    int i = 0;
                    long j = -1;
                    while (!Thread.interrupted()) {
                        try {
                            this.A07.A4t();
                            break;
                        } catch (IOException e) {
                            long A6Q = this.A07.A6Q();
                            if (A6Q != j) {
                                C4795F0.A0J(A07(22, 37, 92) + A6Q, this);
                                j = A6Q;
                                i = 0;
                            }
                            if (this.A06 == 1 && (i = i + 1) <= this.A03) {
                                C4795F0.A0J(A07(0, 22, 20) + i, this);
                                long downloadedBytes = (long) A02(i);
                                Thread.sleep(downloadedBytes);
                            } else {
                                throw e;
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
            handler = this.A05.A07;
            handler.post(new RunnableC4790Ev(this, th));
        } catch (Throwable th3) {
            C5158L0.A00(th3, this);
        }
    }

    public final String toString() {
        return super.toString();
    }
}
