package com.facebook.ads.redexgen.p036X;

import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.GW */
/* loaded from: assets/audience_network.dex */
public final class C4887GW implements InterfaceC5558RX {
    @VisibleForTesting
    public static boolean A04;
    public static byte[] A05;
    public static final InterfaceC5556RV A06;
    public static final String A07;
    public long A00 = 0;
    @VisibleForTesting
    public final InterfaceC5560RZ A01;
    public final InterfaceC5557RW A02;
    public final InterfaceC5563Rc A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{Byte.MAX_VALUE, -88, -85, -100, -94, -89, -96, 89, -89, -98, -79, -83, 89, -84, -78, -89, -100, 89, -102, -83, 89, -77, -57, -40, -47, -122, -57, -39, -122, -44, -43, -122, -39, -33, -44, -55, -50, -40, -43, -44, -49, -32, -57, -38, -49, -43, -44, -122, -39, -55, -50, -53, -54, -37, -46, -53, -54, -108, -122, -78, -57, -39, -38, -122, -39, -33, -44, -55, -122, -57, -38, -122, -117, -54, -108, -122, -76, -53, -34, -38, -122, -39, -33, -44, -55, -122, -57, -38, -122, -117, -54, -108, -51, -26, -33, -33, -22, -102, -32, -23, -20, -102, -97, -34, -102, -25, -29, -26, -26, -29, -19, -88, -14, -15, -43, -8, -15, -55, -20, -15, -20, -10, -21, -24, -25};
    }

    static {
        A02();
        A07 = C4887GW.class.getSimpleName();
        A06 = new C4893Gc();
        A04 = false;
    }

    public C4887GW(InterfaceC5557RW interfaceC5557RW, InterfaceC5563Rc interfaceC5563Rc) {
        this.A02 = interfaceC5557RW;
        this.A03 = interfaceC5563Rc;
        new Thread(new RunnableC5559RY(this)).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A01() {
        while (true) {
            synchronized (this) {
                if (this.A00 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } else {
                    long A4f = this.A03.A4f();
                    if (A4f < this.A00) {
                        int i = (int) ((this.A00 - A4f) / 1000000);
                        int millisToSleep = (i > 1L ? 1 : (i == 1L ? 0 : -1));
                        if (millisToSleep >= 0) {
                            String.format(Locale.US, A00(92, 20, 69), Integer.valueOf(i));
                            try {
                                this.A03.AEu(this, i);
                            } catch (InterruptedException unused2) {
                            }
                        }
                    }
                    this.A00 = 0L;
                    this.A02.AEE();
                    long A4f2 = this.A03.A4f();
                    if (this.A01 != null) {
                        break;
                    }
                    synchronized (this) {
                        int millisToSleep2 = (this.A00 > A4f2 ? 1 : (this.A00 == A4f2 ? 0 : -1));
                        if (millisToSleep2 < 0) {
                            String.format(Locale.US, A00(21, 71, 49), Long.valueOf(A4f2), Long.valueOf(this.A00));
                            this.A00 = 0L;
                        }
                    }
                }
            }
        }
        throw new NullPointerException(A00(112, 13, 78));
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5558RX
    public final synchronized void A5S(int i) {
        long A4f = this.A03.A4f() + (i * 1000000 * (A04 ? 1 : 1000));
        long requestedNextSync = this.A00;
        if (requestedNextSync == 0 || this.A00 > A4f) {
            this.A00 = A4f;
            notifyAll();
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5558RX
    public final synchronized void A5T() {
        this.A00 = this.A03.A4f();
        String str = A00(0, 21, 4) + this.A00;
        notifyAll();
    }
}
