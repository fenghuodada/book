package com.facebook.ads.redexgen.p036X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Wu */
/* loaded from: assets/audience_network.dex */
public final class C5887Wu implements InterfaceC4659Cd {
    public int A00;
    public int A01;
    public long A02;
    public final long A04;
    public final InterfaceC4955He A05;
    public byte[] A03 = new byte[65536];
    public final byte[] A06 = new byte[4096];

    public C5887Wu(InterfaceC4955He interfaceC4955He, long j, long j2) {
        this.A05 = interfaceC4955He;
        this.A02 = j;
        this.A04 = j2;
    }

    private int A00(int i) {
        int min = Math.min(this.A00, i);
        A05(min);
        return min;
    }

    private int A01(byte[] bArr, int i, int i2) {
        int i3 = this.A00;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.A03, 0, bArr, i, min);
        A05(min);
        return min;
    }

    private int A02(byte[] bArr, int i, int i2, int i3, boolean z) throws InterruptedException, IOException {
        if (!Thread.interrupted()) {
            int read = this.A05.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + read;
        }
        throw new InterruptedException();
    }

    private void A03(int i) {
        if (i != -1) {
            this.A02 += i;
        }
    }

    private void A04(int i) {
        int i2 = this.A01 + i;
        byte[] bArr = this.A03;
        if (i2 > bArr.length) {
            this.A03 = Arrays.copyOf(this.A03, C5038Iz.A06(bArr.length * 2, 65536 + i2, 524288 + i2));
        }
    }

    private void A05(int i) {
        this.A00 -= i;
        this.A01 = 0;
        byte[] bArr = this.A03;
        int i2 = this.A00;
        if (i2 < this.A03.length - 524288) {
            bArr = new byte[i2 + 65536];
        }
        System.arraycopy(this.A03, i, bArr, 0, this.A00);
        this.A03 = bArr;
    }

    public final boolean A06(int i, boolean z) throws IOException, InterruptedException {
        A04(i);
        int min = Math.min(this.A00 - this.A01, i);
        while (min < i) {
            min = A02(this.A03, this.A01, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        this.A01 += i;
        this.A00 = Math.max(this.A00, this.A01);
        return true;
    }

    public final boolean A07(int i, boolean z) throws IOException, InterruptedException {
        int A00 = A00(i);
        while (A00 < i && A00 != -1) {
            A00 = A02(this.A06, -A00, Math.min(i, this.A06.length + A00), A00, z);
        }
        A03(A00);
        return A00 != -1;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4659Cd
    public final void A3K(int i) throws IOException, InterruptedException {
        A06(i, false);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4659Cd
    public final long A6t() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4659Cd
    public final long A7A() {
        return this.A02 + this.A01;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4659Cd
    public final long A7F() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4659Cd
    public final void AD7(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        AD8(bArr, i, i2, false);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4659Cd
    public final boolean AD8(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        if (!A06(i2, z)) {
            return false;
        }
        System.arraycopy(this.A03, this.A01 - i2, bArr, i, i2);
        return true;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4659Cd
    public final boolean ADc(byte[] bArr, int i, int i2, boolean z) throws IOException, InterruptedException {
        int A01 = A01(bArr, i, i2);
        while (A01 < i2 && A01 != -1) {
            A01 = A02(bArr, i, i2, A01, z);
        }
        A03(A01);
        return A01 != -1;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4659Cd
    public final void AEB() {
        this.A01 = 0;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4659Cd
    public final int AEq(int i) throws IOException, InterruptedException {
        int A00 = A00(i);
        if (A00 == 0) {
            byte[] bArr = this.A06;
            A00 = A02(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        A03(A00);
        return A00;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4659Cd
    public final void AEt(int i) throws IOException, InterruptedException {
        A07(i, false);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4659Cd
    public final int read(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        int A01 = A01(bArr, i, i2);
        if (A01 == 0) {
            A01 = A02(bArr, i, i2, 0, true);
        }
        A03(A01);
        return A01;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4659Cd
    public final void readFully(byte[] bArr, int i, int i2) throws IOException, InterruptedException {
        ADc(bArr, i, i2, false);
    }
}
