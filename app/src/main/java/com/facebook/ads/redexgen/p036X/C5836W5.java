package com.facebook.ads.redexgen.p036X;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.W5 */
/* loaded from: assets/audience_network.dex */
public final class C5836W5 implements InterfaceC4719Di {
    public static byte[] A0K;
    public static String[] A0L = {"hgUALiBHRBx3rc9PT3qyJLJuKriNjQIA", "JcSPF8dLSzFIe8gapkYyYGiPDe1iVZ7T", "a8IrrF5hi8IFjeZ2lIy6xY1armnYmb5o", "dI536DedIqR9AIwKwKzHAZoNzdw0gd0o", "spoCU0rWYssiPe95xKAIpCDVtAt9VbvV", "ZT5oGWr6FGwuE", "k3I4LHvMKlhfRum43HVkkWOAjRBPWhRl", "GOwjxx90kdElmS0"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public long A09;
    public long A0A;
    public long A0B;
    public Format A0C;
    public InterfaceC4670Co A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public final String A0J;
    public final C5022Ij A0I = new C5022Ij(1024);
    public final C5021Ii A0H = new C5021Ii(this.A0I.A00);

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0K, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 35;
            String[] strArr = A0L;
            if (strArr[1].charAt(19) != strArr[0].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0L;
            strArr2[3] = "gooppkWHFs0OH8ZO7KHmI5JoYki0niEb";
            strArr2[4] = "gQ32BKgMXcn7uGYeyK4g8BO1uII782R4";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0K = new byte[]{-87, -67, -84, -79, -73, 119, -75, -72, 124, -87, 117, -76, -87, -68, -75};
    }

    static {
        A04();
    }

    public C5836W5(@Nullable String str) {
        this.A0J = str;
    }

    private int A00(C5021Ii c5021Ii) throws C4547Af {
        int A01 = c5021Ii.A01();
        Pair<Integer, Integer> A02 = C5001IO.A02(c5021Ii, true);
        this.A05 = ((Integer) A02.first).intValue();
        this.A02 = ((Integer) A02.second).intValue();
        return A01 - c5021Ii.A01();
    }

    private int A01(C5021Ii c5021Ii) throws C4547Af {
        int A04;
        int i = 0;
        if (this.A03 == 0) {
            do {
                A04 = c5021Ii.A04(8);
                i += A04;
            } while (A04 == 255);
            return i;
        }
        throw new C4547Af();
    }

    public static long A02(C5021Ii c5021Ii) {
        return c5021Ii.A04((c5021Ii.A04(2) + 1) * 8);
    }

    private void A05(int i) {
        this.A0I.A0W(i);
        this.A0H.A0B(this.A0I.A00);
    }

    private void A06(C5021Ii c5021Ii) throws C4547Af {
        if (!c5021Ii.A0F()) {
            this.A0G = true;
            A08(c5021Ii);
        } else if (!this.A0G) {
            return;
        }
        if (this.A00 == 0) {
            if (this.A04 == 0) {
                A09(c5021Ii, A01(c5021Ii));
                if (this.A0F) {
                    c5021Ii.A08((int) this.A09);
                    return;
                }
                return;
            }
            throw new C4547Af();
        }
        throw new C4547Af();
    }

    private void A07(C5021Ii c5021Ii) {
        this.A03 = c5021Ii.A04(3);
        int i = this.A03;
        if (i == 0) {
            c5021Ii.A08(8);
        } else if (i != 1) {
            if (i == 3 || i == 4 || i == 5) {
                c5021Ii.A08(6);
                return;
            }
            if (i != 6) {
                if (A0L[7].length() != 15) {
                    throw new RuntimeException();
                }
                String[] strArr = A0L;
                strArr[1] = "QJhjenmrzPYVr6mrKS1ywIZfks2sEqmv";
                strArr[0] = "rtM7Stfru76sVtn814uyI2mxrEEn9Ydu";
                if (i != 7) {
                    return;
                }
            }
            c5021Ii.A08(1);
        } else {
            c5021Ii.A08(9);
        }
    }

    private void A08(C5021Ii c5021Ii) throws C4547Af {
        boolean A0F;
        int numProgram = c5021Ii.A04(1);
        int bitsRead = numProgram == 1 ? c5021Ii.A04(1) : 0;
        this.A00 = bitsRead;
        if (this.A00 == 0) {
            if (numProgram == 1) {
                A02(c5021Ii);
            }
            if (c5021Ii.A0F()) {
                this.A04 = c5021Ii.A04(6);
                int A04 = c5021Ii.A04(4);
                int A042 = c5021Ii.A04(3);
                if (A04 == 0 && A042 == 0) {
                    if (numProgram == 0) {
                        int readBits = c5021Ii.A03();
                        int A00 = A00(c5021Ii);
                        c5021Ii.A07(readBits);
                        int readBits2 = A00 + 7;
                        byte[] initData = new byte[readBits2 / 8];
                        c5021Ii.A0D(initData, 0, A00);
                        Format A07 = Format.A07(this.A0E, A03(0, 15, 37), null, -1, -1, this.A02, this.A05, Collections.singletonList(initData), null, 0, this.A0J);
                        if (!A07.equals(this.A0C)) {
                            this.A0C = A07;
                            this.A0A = 1024000000 / A07.A0C;
                            this.A0D.A5V(A07);
                        }
                    } else {
                        int A02 = (int) A02(c5021Ii);
                        int bitsRead2 = A00(c5021Ii);
                        c5021Ii.A08(A02 - bitsRead2);
                    }
                    A07(c5021Ii);
                    this.A0F = c5021Ii.A0F();
                    this.A09 = 0L;
                    if (this.A0F) {
                        if (numProgram == 1) {
                            this.A09 = A02(c5021Ii);
                        } else {
                            do {
                                A0F = c5021Ii.A0F();
                                this.A09 = (this.A09 << 8) + c5021Ii.A04(8);
                            } while (A0F);
                        }
                    }
                    if (c5021Ii.A0F()) {
                        c5021Ii.A08(8);
                        return;
                    }
                    return;
                }
                throw new C4547Af();
            }
            throw new C4547Af();
        }
        throw new C4547Af();
    }

    private void A09(C5021Ii c5021Ii, int i) {
        int A03 = c5021Ii.A03();
        if ((A03 & 7) == 0) {
            this.A0I.A0Y(A03 >> 3);
        } else {
            c5021Ii.A0D(this.A0I.A00, 0, i * 8);
            this.A0I.A0Y(0);
        }
        this.A0D.AEG(this.A0I, i);
        this.A0D.AEH(this.A0B, 1, i, 0, null);
        this.A0B += this.A0A;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void A48(C5022Ij c5022Ij) throws C4547Af {
        while (c5022Ij.A04() > 0) {
            int i = this.A08;
            if (i != 0) {
                if (i == 1) {
                    int A0E = c5022Ij.A0E();
                    if ((A0E & 224) == 224) {
                        this.A07 = A0E;
                        this.A08 = 2;
                    } else if (A0E != 86) {
                        this.A08 = 0;
                    }
                } else if (A0L[7].length() != 15) {
                    throw new RuntimeException();
                } else {
                    String[] strArr = A0L;
                    strArr[3] = "eXMY6UfuU8mptnxKZK3KjbCMiU1pAKNs";
                    strArr[4] = "BrFOrdIatggcu5HdAKqvOHyOVIidANWA";
                    if (i == 2) {
                        this.A06 = ((this.A07 & (-225)) << 8) | c5022Ij.A0E();
                        if (this.A06 > this.A0I.A00.length) {
                            A05(this.A06);
                        }
                        this.A01 = 0;
                        this.A08 = 3;
                    } else if (i == 3) {
                        int min = Math.min(c5022Ij.A04(), this.A06 - this.A01);
                        c5022Ij.A0c(this.A0H.A00, this.A01, min);
                        this.A01 += min;
                        if (this.A01 == this.A06) {
                            this.A0H.A07(0);
                            A06(this.A0H);
                            this.A08 = 0;
                        }
                    }
                }
            } else if (c5022Ij.A0E() == 86) {
                this.A08 = 1;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void A4V(InterfaceC4660Ce interfaceC4660Ce, C4733Dw c4733Dw) {
        c4733Dw.A05();
        this.A0D = interfaceC4660Ce.AFD(c4733Dw.A03(), 1);
        this.A0E = c4733Dw.A04();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AD3() {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AD4(long j, boolean z) {
        this.A0B = j;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4719Di
    public final void AEK() {
        this.A08 = 0;
        this.A0G = false;
    }
}
