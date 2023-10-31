package com.facebook.ads.redexgen.p036X;

import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.metadata.Metadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.WS */
/* loaded from: assets/audience_network.dex */
public final class C5859WS implements InterfaceC4658Cc, InterfaceC4667Cl {
    public static byte[] A0J;
    public static String[] A0K = {"0jSfxoXEMfCjtmnyDugkNcQJRjSOySMa", "bnCyjA5DcUmWUqivzOXdDI", "awYt8cnKxKdhDKIItvFTiUYUED9yM0q1", "Luabopmg5NHaS5SoCXeHIbwAQFsLRvJ0", "odfzLqPoxtdmNhQ8QVXSS2", "Wo8IxRBaFRXe4oQbEdt7BomqryNllMGC", "1wQy", "sEQm6Nsu4XqoPKwwi3EdYrJfunZcOKFC"};
    public static final InterfaceC4661Cf A0L;
    public static final int A0M;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public InterfaceC4660Ce A09;
    public C5022Ij A0A;
    public boolean A0B;
    public C4693DI[] A0C;
    public long[][] A0D;
    public final int A0E;
    public final C5022Ij A0F;
    public final C5022Ij A0G;
    public final C5022Ij A0H;
    public final ArrayDeque<C5867Wa> A0I;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0J = new byte[]{57, 12, 23, 21, 88, 11, 17, 2, 29, 88, 20, 29, 11, 11, 88, 12, 16, 25, 22, 88, 16, 29, 25, 28, 29, 10, 88, 20, 29, 22, 31, 12, 16, 88, 80, 13, 22, 11, 13, 8, 8, 23, 10, 12, 29, 28, 81, 86, 4, 1, 85, 85};
    }

    static {
        A07();
        A0L = new C5860WT();
        A0M = C5038Iz.A08(A04(48, 4, 105));
    }

    public C5859WS() {
        this(0);
    }

    public C5859WS(int i) {
        this.A0E = i;
        this.A0F = new C5022Ij(16);
        this.A0I = new ArrayDeque<>();
        this.A0H = new C5022Ij(C5018If.A03);
        this.A0G = new C5022Ij(4);
        this.A06 = -1;
    }

    private int A00(long preferredSkipAmount) {
        long j = Long.MAX_VALUE;
        int i = 1;
        int i2 = -1;
        long j2 = Long.MAX_VALUE;
        long j3 = Long.MAX_VALUE;
        int trackIndex = 1;
        int sampleIndex = -1;
        int i3 = 0;
        while (true) {
            C4693DI[] c4693diArr = this.A0C;
            if (i3 >= c4693diArr.length) {
                break;
            }
            C4693DI c4693di = c4693diArr[i3];
            int i4 = c4693di.A00;
            if (i4 != c4693di.A03.A01) {
                long j4 = c4693di.A03.A06[i4];
                long j5 = this.A0D[i3][i4];
                long j6 = j4 - preferredSkipAmount;
                int i5 = (j6 < 0 || j6 >= 262144) ? 1 : 0;
                if ((i5 == 0 && i != 0) || (i5 == i && j6 < j)) {
                    i = i5;
                    j = j6;
                    i2 = i3;
                    j2 = j5;
                }
                if (j5 < j3) {
                    j3 = j5;
                    trackIndex = i5;
                    sampleIndex = i3;
                }
            }
            i3++;
        }
        int i6 = (j3 > Long.MAX_VALUE ? 1 : (j3 == Long.MAX_VALUE ? 0 : -1));
        if (A0K[5].charAt(28) != 'l') {
            throw new RuntimeException();
        }
        String[] strArr = A0K;
        strArr[7] = "2rf3IkD44HipF2iEZWYVpECLVHr0uALb";
        strArr[0] = "2zlrhAiZVnIklu1FhIrlCsqVaSaq97eM";
        if (i6 == 0 || trackIndex == 0) {
            return i2;
        }
        long sampleOffset = 10485760 + j3;
        if (j2 < sampleOffset) {
            return i2;
        }
        return sampleIndex;
    }

    private int A01(InterfaceC4659Cd interfaceC4659Cd, C4665Cj c4665Cj) throws IOException, InterruptedException {
        int i;
        long A7F = interfaceC4659Cd.A7F();
        if (this.A06 == -1) {
            this.A06 = A00(A7F);
            if (this.A06 == -1) {
                return -1;
            }
        }
        C4693DI c4693di = this.A0C[this.A06];
        InterfaceC4670Co interfaceC4670Co = c4693di.A01;
        int i2 = c4693di.A00;
        long j = c4693di.A03.A06[i2];
        int i3 = c4693di.A03.A05[i2];
        long inputPosition = j - A7F;
        long position = inputPosition + this.A04;
        int sampleSize = (position > 0L ? 1 : (position == 0L ? 0 : -1));
        if (sampleSize >= 0) {
            int sampleSize2 = (position > 262144L ? 1 : (position == 262144L ? 0 : -1));
            if (sampleSize2 < 0) {
                if (c4693di.A02.A02 == 1) {
                    position += 8;
                    i3 -= 8;
                }
                interfaceC4659Cd.AEt((int) position);
                if (c4693di.A02.A01 != 0) {
                    byte[] bArr = this.A0G.A00;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i4 = c4693di.A02.A01;
                    int i5 = 4 - c4693di.A02.A01;
                    while (this.A04 < i3) {
                        int i6 = this.A05;
                        if (i6 == 0) {
                            byte[] nalLengthData = this.A0G.A00;
                            interfaceC4659Cd.readFully(nalLengthData, i5, i4);
                            this.A0G.A0Y(0);
                            this.A05 = this.A0G.A0H();
                            this.A0H.A0Y(0);
                            interfaceC4670Co.AEG(this.A0H, 4);
                            this.A04 += 4;
                            i3 += i5;
                        } else {
                            int writtenBytes = interfaceC4670Co.AEF(interfaceC4659Cd, i6, false);
                            this.A04 += writtenBytes;
                            this.A05 -= writtenBytes;
                        }
                    }
                    i = 0;
                } else {
                    while (true) {
                        int i7 = this.A04;
                        if (i7 >= i3) {
                            break;
                        }
                        int AEF = interfaceC4670Co.AEF(interfaceC4659Cd, i3 - i7, false);
                        int writtenBytes2 = this.A04;
                        this.A04 = writtenBytes2 + AEF;
                        int writtenBytes3 = this.A05;
                        this.A05 = writtenBytes3 - AEF;
                    }
                    i = 0;
                }
                interfaceC4670Co.AEH(c4693di.A03.A07[i2], c4693di.A03.A04[i2], i3, 0, null);
                c4693di.A00++;
                this.A06 = -1;
                this.A04 = i;
                this.A05 = i;
                return i;
            }
        }
        c4665Cj.A00 = j;
        return 1;
    }

    public static int A02(C4702DR c4702dr, long j) {
        int A00 = c4702dr.A00(j);
        if (A00 == -1) {
            return c4702dr.A01(j);
        }
        return A00;
    }

    public static long A03(C4702DR c4702dr, long j, long j2) {
        int A02 = A02(c4702dr, j);
        if (A02 == -1) {
            return j2;
        }
        return Math.min(c4702dr.A06[A02], j2);
    }

    private ArrayList<C4702DR> A05(C5867Wa c5867Wa, C4662Cg c4662Cg, boolean z) throws C4547Af {
        C4699DO A0C;
        ArrayList<C4702DR> arrayList = new ArrayList<>();
        int i = 0;
        while (true) {
            int size = c5867Wa.A01.size();
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "cCqXKTxpaVHnB5xhxhubewm2proDizNi";
            strArr2[0] = "XNMFZPcuybbaYtAFLaJvO7GLnY5oO3YZ";
            if (i < size) {
                C5867Wa c5867Wa2 = c5867Wa.A01.get(i);
                if (((AbstractC4680D3) c5867Wa2).A00 == AbstractC4680D3.A1L && (A0C = C4685D8.A0C(c5867Wa2, c5867Wa.A07(AbstractC4680D3.A0n), -9223372036854775807L, null, z, this.A0B)) != null) {
                    C4702DR A0E = C4685D8.A0E(A0C, c5867Wa2.A06(AbstractC4680D3.A0d).A06(AbstractC4680D3.A0h).A06(AbstractC4680D3.A16), c4662Cg);
                    if (A0E.A01 != 0) {
                        arrayList.add(A0E);
                    }
                }
                i++;
            } else {
                return arrayList;
            }
        }
    }

    private void A06() {
        this.A03 = 0;
        this.A00 = 0;
    }

    private void A08(long j) throws C4547Af {
        while (!this.A0I.isEmpty() && this.A0I.peek().A00 == j) {
            C5867Wa pop = this.A0I.pop();
            if (((AbstractC4680D3) pop).A00 == AbstractC4680D3.A0j) {
                A0A(pop);
                this.A0I.clear();
                this.A03 = 2;
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A08(pop);
            }
        }
        if (this.A03 != 2) {
            A06();
        }
    }

    private void A09(long j) {
        C4693DI[] c4693diArr;
        for (C4693DI c4693di : this.A0C) {
            C4702DR c4702dr = c4693di.A03;
            int A00 = c4702dr.A00(j);
            if (A00 == -1) {
                A00 = c4702dr.A01(j);
            }
            c4693di.A00 = A00;
        }
    }

    private void A0A(C5867Wa c5867Wa) throws C4547Af {
        ArrayList<C4702DR> A05;
        int i = -1;
        long j = -9223372036854775807L;
        ArrayList arrayList = new ArrayList();
        Metadata metadata = null;
        C4662Cg c4662Cg = new C4662Cg();
        C5866WZ A07 = c5867Wa.A07(AbstractC4680D3.A1P);
        if (A07 != null && (metadata = C4685D8.A0F(A07, this.A0B)) != null) {
            c4662Cg.A05(metadata);
        }
        boolean ignoreEditLists = (this.A0E & 1) != 0;
        try {
            A05 = A05(c5867Wa, c4662Cg, ignoreEditLists);
        } catch (C5863WW unused) {
            c4662Cg = new C4662Cg();
            A05 = A05(c5867Wa, c4662Cg, true);
        }
        int size = A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            C4702DR c4702dr = A05.get(i2);
            C4699DO c4699do = c4702dr.A03;
            C4693DI c4693di = new C4693DI(c4699do, c4702dr, this.A09.AFD(i2, c4699do.A03));
            int trackCount = c4702dr.A00 + 30;
            Format A0F = c4699do.A07.A0F(trackCount);
            if (c4699do.A03 == 1) {
                if (c4662Cg.A03()) {
                    A0F = A0F.A0G(c4662Cg.A00, c4662Cg.A01);
                }
                if (metadata != null) {
                    A0F = A0F.A0J(metadata);
                }
            }
            c4693di.A01.A5V(A0F);
            j = Math.max(j, c4699do.A04 != -9223372036854775807L ? c4699do.A04 : c4702dr.A02);
            int maxInputSize = c4699do.A03;
            if (maxInputSize == 2 && i == -1) {
                i = arrayList.size();
            }
            arrayList.add(c4693di);
        }
        this.A02 = i;
        this.A08 = j;
        this.A0C = (C4693DI[]) arrayList.toArray(new C4693DI[arrayList.size()]);
        this.A0D = A0G(this.A0C);
        this.A09.A5D();
        this.A09.AEM(this);
    }

    public static boolean A0B(int i) {
        if (i != AbstractC4680D3.A0j) {
            int i2 = AbstractC4680D3.A1L;
            String[] strArr = A0K;
            if (strArr[4].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[2] = "xHWkCkmm9lwx55Xb6ilKRbCBaMi3tx91";
            strArr2[3] = "ufwmFaOIh4ETn2yFiF4b2v05oMaexVS8";
            if (i != i2 && i != AbstractC4680D3.A0d && i != AbstractC4680D3.A0h && i != AbstractC4680D3.A16 && i != AbstractC4680D3.A0N) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0C(int i) {
        if (i != AbstractC4680D3.A0c && i != AbstractC4680D3.A0n && i != AbstractC4680D3.A0V && i != AbstractC4680D3.A1A && i != AbstractC4680D3.A1D && i != AbstractC4680D3.A1B) {
            int i2 = AbstractC4680D3.A0C;
            if (A0K[1].length() != 22) {
                throw new RuntimeException();
            }
            A0K[1] = "WjfYMB7jPbcUwDvfNOpuH1";
            if (i != i2 && i != AbstractC4680D3.A0O && i != AbstractC4680D3.A19 && i != AbstractC4680D3.A1C && i != AbstractC4680D3.A1E && i != AbstractC4680D3.A17 && i != AbstractC4680D3.A0B && i != AbstractC4680D3.A1J && i != AbstractC4680D3.A0U && i != AbstractC4680D3.A1P) {
                return false;
            }
        }
        return true;
    }

    private boolean A0D(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        if (this.A00 == 0) {
            if (!interfaceC4659Cd.ADc(this.A0F.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0F.A0Y(0);
            this.A07 = this.A0F.A0M();
            this.A01 = this.A0F.A08();
        }
        long j = this.A07;
        if (j == 1) {
            interfaceC4659Cd.readFully(this.A0F.A00, 8, 8);
            this.A00 += 8;
            this.A07 = this.A0F.A0N();
        } else if (j == 0) {
            long A6t = interfaceC4659Cd.A6t();
            if (A6t == -1 && !this.A0I.isEmpty()) {
                A6t = this.A0I.peek().A00;
            }
            if (A6t != -1) {
                this.A07 = (A6t - interfaceC4659Cd.A7F()) + this.A00;
            }
        }
        if (this.A07 >= this.A00) {
            if (A0B(this.A01)) {
                long A7F = (interfaceC4659Cd.A7F() + this.A07) - this.A00;
                this.A0I.push(new C5867Wa(this.A01, A7F));
                if (this.A07 == this.A00) {
                    A08(A7F);
                } else {
                    A06();
                }
            } else if (A0C(this.A01)) {
                C4997IK.A04(this.A00 == 8);
                C4997IK.A04(this.A07 <= 2147483647L);
                this.A0A = new C5022Ij((int) this.A07);
                System.arraycopy(this.A0F.A00, 0, this.A0A.A00, 0, 8);
                this.A03 = 1;
            } else {
                this.A0A = null;
                this.A03 = 1;
            }
            return true;
        }
        throw new C4547Af(A04(0, 48, 100));
    }

    private boolean A0E(InterfaceC4659Cd interfaceC4659Cd, C4665Cj c4665Cj) throws IOException, InterruptedException {
        long j = this.A07 - this.A00;
        long A7F = interfaceC4659Cd.A7F() + j;
        boolean z = false;
        C5022Ij c5022Ij = this.A0A;
        if (c5022Ij != null) {
            interfaceC4659Cd.readFully(c5022Ij.A00, this.A00, (int) j);
            if (this.A01 == AbstractC4680D3.A0U) {
                this.A0B = A0F(this.A0A);
            } else if (!this.A0I.isEmpty()) {
                this.A0I.peek().A09(new C5866WZ(this.A01, this.A0A));
            }
        } else if (j < 262144) {
            interfaceC4659Cd.AEt((int) j);
        } else {
            c4665Cj.A00 = interfaceC4659Cd.A7F() + j;
            z = true;
        }
        A08(A7F);
        return z && this.A03 != 2;
    }

    public static boolean A0F(C5022Ij c5022Ij) {
        c5022Ij.A0Y(8);
        if (c5022Ij.A08() == A0M) {
            return true;
        }
        c5022Ij.A0Z(4);
        while (c5022Ij.A04() > 0) {
            if (c5022Ij.A08() == A0M) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:11:0x0036 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static long[][] A0G(com.facebook.ads.redexgen.p036X.C4693DI[] r14) {
        /*
            int r0 = r14.length
            long[][] r6 = new long[r0]
            int r0 = r14.length
            int[] r5 = new int[r0]
            int r0 = r14.length
            long[] r4 = new long[r0]
            int r0 = r14.length
            boolean[] r3 = new boolean[r0]
            r2 = 0
        Ld:
            int r0 = r14.length
            if (r2 >= r0) goto L28
            r0 = r14[r2]
            com.facebook.ads.redexgen.X.DR r0 = r0.A03
            int r0 = r0.A01
            long[] r0 = new long[r0]
            r6[r2] = r0
            r0 = r14[r2]
            com.facebook.ads.redexgen.X.DR r0 = r0.A03
            long[] r1 = r0.A07
            r0 = 0
            r0 = r1[r0]
            r4[r2] = r0
            int r2 = r2 + 1
            goto Ld
        L28:
            r12 = 0
            r2 = 0
        L2b:
            int r0 = r14.length
            if (r2 >= r0) goto L71
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = -1
            r1 = 0
        L35:
            int r0 = r14.length
            if (r1 >= r0) goto L48
            boolean r0 = r3[r1]
            if (r0 != 0) goto L45
            r7 = r4[r1]
            int r0 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r0 > 0) goto L45
            r9 = r1
            r10 = r4[r1]
        L45:
            int r1 = r1 + 1
            goto L35
        L48:
            r7 = r5[r9]
            r0 = r6[r9]
            r0[r7] = r12
            r0 = r14[r9]
            com.facebook.ads.redexgen.X.DR r0 = r0.A03
            int[] r0 = r0.A05
            r0 = r0[r7]
            long r0 = (long) r0
            long r12 = r12 + r0
            r1 = 1
            int r7 = r7 + r1
            r5[r9] = r7
            r0 = r6[r9]
            int r0 = r0.length
            if (r7 >= r0) goto L6c
            r0 = r14[r9]
            com.facebook.ads.redexgen.X.DR r0 = r0.A03
            long[] r0 = r0.A07
            r0 = r0[r7]
            r4[r9] = r0
            goto L2b
        L6c:
            r3[r9] = r1
            int r2 = r2 + 1
            goto L2b
        L71:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5859WS.A0G(com.facebook.ads.redexgen.X.DI[]):long[][]");
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final long A6S() {
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final C4666Ck A7O(long secondTimeUs) {
        long j;
        long j2;
        int A01;
        C4693DI[] c4693diArr = this.A0C;
        if (c4693diArr.length == 0) {
            return new C4666Ck(C4668Cm.A04);
        }
        long j3 = -9223372036854775807L;
        long j4 = -1;
        int i = this.A02;
        if (i != -1) {
            C4702DR c4702dr = c4693diArr[i].A03;
            int A02 = A02(c4702dr, secondTimeUs);
            if (A02 == -1) {
                return new C4666Ck(C4668Cm.A04);
            }
            j = c4702dr.A07[A02];
            j2 = c4702dr.A06[A02];
            if (A0K[5].charAt(28) == 'l') {
                String[] strArr = A0K;
                strArr[4] = "wZC6PUUkwbL39FGS7qgHi4";
                strArr[6] = "ISWp";
                if (j < secondTimeUs && A02 < c4702dr.A01 - 1 && (A01 = c4702dr.A01(secondTimeUs)) != -1 && A01 != A02) {
                    j3 = c4702dr.A07[A01];
                    j4 = c4702dr.A06[A01];
                }
            }
            throw new RuntimeException();
        }
        j = secondTimeUs;
        j2 = Long.MAX_VALUE;
        int i2 = 0;
        while (true) {
            C4693DI[] c4693diArr2 = this.A0C;
            if (A0K[5].charAt(28) != 'l') {
                break;
            }
            String[] strArr2 = A0K;
            strArr2[2] = "HuKpkwhwNffVsg1qOYm34WvQGcpzf7CA";
            strArr2[3] = "OpSxQ7AB5KpfVVm82hohcPrOWAs1xSas";
            if (i2 < c4693diArr2.length) {
                if (i2 != this.A02) {
                    C4702DR c4702dr2 = c4693diArr2[i2].A03;
                    j2 = A03(c4702dr2, j, j2);
                    if (j3 != -9223372036854775807L) {
                        j4 = A03(c4702dr2, j3, j4);
                    }
                }
                i2++;
            } else {
                C4668Cm c4668Cm = new C4668Cm(j, j2);
                if (j3 == -9223372036854775807L) {
                    return new C4666Ck(c4668Cm);
                }
                return new C4666Ck(c4668Cm, new C4668Cm(j3, j4));
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final void A8I(InterfaceC4660Ce interfaceC4660Ce) {
        this.A09 = interfaceC4660Ce;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4667Cl
    public final boolean A8g() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final int ADX(InterfaceC4659Cd interfaceC4659Cd, C4665Cj c4665Cj) throws IOException, InterruptedException {
        while (true) {
            int i = this.A03;
            String[] strArr = A0K;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0K;
            strArr2[7] = "qJxbwGisfZf9YKIw0pjhTsx78598m8MK";
            strArr2[0] = "kX2rligkfJBBB9teOSCW5LaSmFhGBJWo";
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        return A01(interfaceC4659Cd, c4665Cj);
                    }
                    throw new IllegalStateException();
                } else if (A0E(interfaceC4659Cd, c4665Cj)) {
                    return 1;
                }
            } else if (!A0D(interfaceC4659Cd)) {
                return -1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final void AEL(long j, long j2) {
        this.A0I.clear();
        this.A00 = 0;
        this.A06 = -1;
        this.A04 = 0;
        this.A05 = 0;
        if (j == 0) {
            A06();
        } else if (this.A0C == null) {
        } else {
            A09(j2);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4658Cc
    public final boolean AEv(InterfaceC4659Cd interfaceC4659Cd) throws IOException, InterruptedException {
        return C4697DM.A04(interfaceC4659Cd);
    }
}
