package com.facebook.ads.redexgen.p036X;

import android.os.SystemClock;
import android.util.Log;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.XA */
/* loaded from: assets/audience_network.dex */
public final class C5903XA implements InterfaceC4606Bc {
    public static byte[] A01;
    public final /* synthetic */ C5902X9 A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{44, 32, 114, 70, 87, 90, 92, 103, 65, 82, 80, 88, 67, 109, 100, 101, 120, 99, 100, 109, 42, 99, 103, 122, 101, 121, 121, 99, 104, 102, 115, 42, 102, 107, 120, 109, 111, 42, 107, Byte.MAX_VALUE, 110, 99, 101, 42, 102, 107, 126, 111, 100, 105, 115, 48, 42, 33, 2, 7, 0, 27, 29, 7, 1, 82, 19, 7, 22, 27, 29, 82, 6, 27, 31, 23, 1, 6, 19, 31, 2, 82, 90, 20, 0, 19, 31, 23, 82, 2, 29, 1, 27, 6, 27, 29, 28, 82, 31, 27, 1, 31, 19, 6, 17, 26, 91, 72, 82, 88, 123, 126, 121, 98, 100, 126, 120, 43, 106, 126, 111, 98, 100, 43, Byte.MAX_VALUE, 98, 102, 110, 120, Byte.MAX_VALUE, 106, 102, 123, 43, 35, 120, 114, 120, Byte.MAX_VALUE, 110, 102, 43, 104, 103, 100, 104, 96, 43, 102, 98, 120, 102, 106, Byte.MAX_VALUE, 104, 99, 34, 49, 43};
    }

    public C5903XA(C5902X9 c5902x9) {
        this.A00 = c5902x9;
    }

    public /* synthetic */ C5903XA(C5902X9 c5902x9, C4609Bf c4609Bf) {
        this(c5902x9);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4606Bc
    public final void ABB(long j) {
        Log.w(A00(2, 10, 37), A00(12, 41, 28) + j);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4606Bc
    public final void ABv(long j, long j2, long j3, long j4) {
        long A03;
        long A04;
        StringBuilder sb = new StringBuilder();
        sb.append(A00(53, 52, 100));
        sb.append(j);
        String A00 = A00(0, 2, 22);
        sb.append(A00);
        sb.append(j2);
        sb.append(A00);
        sb.append(j3);
        sb.append(A00);
        sb.append(j4);
        sb.append(A00);
        A03 = this.A00.A03();
        sb.append(A03);
        sb.append(A00);
        A04 = this.A00.A04();
        sb.append(A04);
        String sb2 = sb.toString();
        if (!C5902X9.A0q) {
            Log.w(A00(2, 10, 37), sb2);
            return;
        }
        throw new C4612Bi(sb2, null);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4606Bc
    public final void ACU(long j, long j2, long j3, long j4) {
        long A03;
        long A04;
        StringBuilder sb = new StringBuilder();
        sb.append(A00(105, 50, 29));
        sb.append(j);
        String A00 = A00(0, 2, 22);
        sb.append(A00);
        sb.append(j2);
        sb.append(A00);
        sb.append(j3);
        sb.append(A00);
        sb.append(j4);
        sb.append(A00);
        A03 = this.A00.A03();
        sb.append(A03);
        sb.append(A00);
        A04 = this.A00.A04();
        sb.append(A04);
        String sb2 = sb.toString();
        if (!C5902X9.A0q) {
            Log.w(A00(2, 10, 37), sb2);
            return;
        }
        throw new C4612Bi(sb2, null);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4606Bc
    public final void ACc(int i, long j) {
        InterfaceC4600BW interfaceC4600BW;
        long j2;
        InterfaceC4600BW interfaceC4600BW2;
        interfaceC4600BW = this.A00.A0R;
        if (interfaceC4600BW != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j2 = this.A00.A0E;
            long j3 = elapsedRealtime - j2;
            interfaceC4600BW2 = this.A00.A0R;
            interfaceC4600BW2.ACd(i, j, j3);
        }
    }
}
