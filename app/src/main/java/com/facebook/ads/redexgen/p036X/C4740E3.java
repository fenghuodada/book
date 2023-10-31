package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.E3 */
/* loaded from: assets/audience_network.dex */
public final class C4740E3 implements InterfaceC5910XH {
    public static byte[] A0M;
    public static String[] A0N = {"FdQu0fmyjo2y", "53g7H5tUmq98heWq", "c", "OWB4F6Jbct6Ly4JY", "NHyc4CVBcI41", "VuRuzyUBfoaB1KqcrIY9ro", "m", "Ea4pNsdJDJP"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    @Nullable
    public C4529AM A05;
    public C4548Ag A06;
    public C4549Ah A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Handler A0D;
    public final C4738E1 A0E;
    public final C4567Az A0F;
    public final C4568B0 A0G;
    public final AbstractC4944HT A0H;
    public final C4945HU A0I;
    public final ArrayDeque<C4533AQ> A0J;
    public final CopyOnWriteArraySet<InterfaceC4552Ak> A0K;
    public final InterfaceC5909XG[] A0L;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0N[7].length() == 1) {
                throw new RuntimeException();
            }
            A0N[7] = "NVWBbKH";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 75);
            i4++;
        }
    }

    public static void A03() {
        A0M = new byte[]{108, 23, 126, 67, 84, 107, 87, 90, 66, 94, 73, 114, 86, 75, 87, 64, 125, 106, 85, 105, 100, 124, 96, 119, 73, 108, 103, 42, 55, 43, 61, 43, 49, 54, 17, 22, 11, 95, 27, 44, 37, 44, 40, 58, 44, 105, 64, 72, 53, 78, 50, 36, 36, 42, 21, 46, 97, 40, 38, 47, 46, 51, 36, 37, 97, 35, 36, 34, 32, 52, 50, 36, 97, 32, 47, 97, 32, 37, 97, 40, 50, 97, 49, 45, 32, 56, 40, 47, 38};
    }

    static {
        A03();
    }

    @SuppressLint({"HandlerLeak"})
    public C4740E3(InterfaceC5909XG[] interfaceC5909XGArr, AbstractC4944HT abstractC4944HT, InterfaceC4543Ab interfaceC4543Ab, InterfaceC5000IN interfaceC5000IN) {
        Log.i(A02(2, 13, 112), A02(33, 5, 52) + Integer.toHexString(System.identityHashCode(this)) + A02(0, 2, 7) + A02(15, 18, 78) + A02(47, 3, 94) + C5038Iz.A04 + A02(46, 1, 86));
        C4997IK.A04(interfaceC5909XGArr.length > 0);
        this.A0L = (InterfaceC5909XG[]) C4997IK.A01(interfaceC5909XGArr);
        this.A0H = (AbstractC4944HT) C4997IK.A01(abstractC4944HT);
        this.A0A = false;
        this.A03 = 0;
        this.A0B = false;
        this.A0K = new CopyOnWriteArraySet<>();
        this.A0I = new C4945HU(new C4563Av[interfaceC5909XGArr.length], new InterfaceC4941HQ[interfaceC5909XGArr.length], null);
        this.A0G = new C4568B0();
        this.A0F = new C4567Az();
        this.A07 = C4549Ah.A04;
        this.A0C = new HandlerC4532AP(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.A06 = new C4548Ag(AbstractC4569B1.A01, 0L, TrackGroupArray.A04, this.A0I);
        this.A0J = new ArrayDeque<>();
        this.A0E = new C4738E1(interfaceC5909XGArr, abstractC4944HT, this.A0I, interfaceC4543Ab, this.A0A, this.A03, this.A0B, this.A0C, this, interfaceC5000IN);
        this.A0D = new Handler(this.A0E.A0w());
    }

    private long A00(long j) {
        long A01 = C4523AG.A01(j);
        if (!this.A06.A04.A01()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            return A01 + this.A0F.A08();
        }
        return A01;
    }

    private C4548Ag A01(boolean z, boolean z2, int i) {
        if (z) {
            this.A01 = 0;
            this.A00 = 0;
            this.A04 = 0L;
        } else {
            this.A01 = A6I();
            this.A00 = A07();
            this.A04 = A6F();
        }
        C4548Ag c4548Ag = new C4548Ag(z2 ? AbstractC4569B1.A01 : this.A06.A03, z2 ? null : this.A06.A07, this.A06.A04, this.A06.A02, this.A06.A01, i, false, z2 ? TrackGroupArray.A04 : this.A06.A05, z2 ? this.A0I : this.A06.A06);
        String[] strArr = A0N;
        if (strArr[6].length() != strArr[2].length()) {
            throw new RuntimeException();
        }
        A0N[7] = "Xqr2ExcYOBi8j1Q";
        return c4548Ag;
    }

    private void A04(C4548Ag c4548Ag, int i, boolean z, int timelineChangeReason) {
        int i2;
        C4548Ag c4548Ag2 = c4548Ag;
        this.A02 -= i;
        if (this.A02 == 0) {
            if (c4548Ag2.A02 == -9223372036854775807L) {
                c4548Ag2 = c4548Ag2.A04(c4548Ag2.A04, 0L, c4548Ag2.A01);
            }
            if (!this.A06.A03.A0E() || this.A08) {
                AbstractC4569B1 abstractC4569B1 = c4548Ag2.A03;
                String[] strArr = A0N;
                if (strArr[1].length() == strArr[3].length()) {
                    A0N[7] = "oGDG41JiAsT7PCq0";
                    if (abstractC4569B1.A0E()) {
                        this.A00 = 0;
                        this.A01 = 0;
                        String[] strArr2 = A0N;
                        if (strArr2[6].length() == strArr2[2].length()) {
                            String[] strArr3 = A0N;
                            strArr3[1] = "vrOcQin3pszluGLq";
                            strArr3[3] = "REI4M31lEJcbEC2a";
                            this.A04 = 0L;
                        }
                    }
                }
                throw new RuntimeException();
            }
            if (this.A08) {
                i2 = 0;
            } else {
                i2 = 2;
            }
            boolean z2 = this.A09;
            this.A08 = false;
            this.A09 = false;
            A05(c4548Ag2, z, timelineChangeReason, i2, z2, false);
        }
    }

    private void A05(C4548Ag c4548Ag, boolean z, int i, int i2, boolean z2, boolean z3) {
        boolean z4 = !this.A0J.isEmpty();
        this.A0J.addLast(new C4533AQ(c4548Ag, this.A06, this.A0K, this.A0H, z, i, i2, z2, this.A0A, z3));
        this.A06 = c4548Ag;
        if (z4) {
            return;
        }
        while (!this.A0J.isEmpty()) {
            this.A0J.peekFirst().A00();
            this.A0J.removeFirst();
        }
    }

    private boolean A06() {
        return this.A06.A03.A0E() || this.A02 > 0;
    }

    public final int A07() {
        if (A06()) {
            return this.A00;
        }
        return this.A06.A04.A02;
    }

    public final void A08(int i) {
        A09(i, -9223372036854775807L);
    }

    public final void A09(int i, long j) {
        long A00;
        AbstractC4569B1 abstractC4569B1 = this.A06.A03;
        if (i >= 0) {
            boolean A0E = abstractC4569B1.A0E();
            if (A0N[5].length() == 22) {
                String[] strArr = A0N;
                strArr[6] = "k";
                strArr[2] = "F";
                if (A0E || i < abstractC4569B1.A01()) {
                    this.A09 = true;
                    this.A02++;
                    boolean A0B = A0B();
                    if (A0N[7].length() != 1) {
                        String[] strArr2 = A0N;
                        strArr2[1] = "iOLxdGxzjtj8VTTv";
                        strArr2[3] = "k2rTYfByBhCiNj1b";
                        if (A0B) {
                            String A02 = A02(2, 13, 112);
                            String[] strArr3 = A0N;
                            if (strArr3[4].length() == strArr3[0].length()) {
                                A0N[7] = "fs0FIhTd6T569fWM98lB5KOUS";
                                Log.w(A02, A02(50, 39, 10));
                                this.A0C.obtainMessage(0, 1, -1, this.A06).sendToTarget();
                                return;
                            }
                        } else {
                            this.A01 = i;
                            if (abstractC4569B1.A0E()) {
                                int i2 = (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1));
                                if (A0N[7].length() == 1) {
                                    throw new RuntimeException();
                                }
                                A0N[5] = "dOqGbPzaS7jKfyvdUFqkQf";
                                this.A04 = i2 == 0 ? 0L : j;
                                this.A00 = 0;
                            } else {
                                if (j == -9223372036854775807L) {
                                    A00 = abstractC4569B1.A0B(i, this.A0G).A01();
                                } else {
                                    A00 = C4523AG.A00(j);
                                }
                                Pair<Integer, Long> A07 = abstractC4569B1.A07(this.A0G, this.A0F, i, A00);
                                this.A04 = C4523AG.A01(A00);
                                this.A00 = ((Integer) A07.first).intValue();
                            }
                            this.A0E.A0y(abstractC4569B1, i, C4523AG.A00(j));
                            Iterator<InterfaceC4552Ak> it = this.A0K.iterator();
                            while (it.hasNext()) {
                                InterfaceC4552Ak next = it.next();
                                String[] strArr4 = A0N;
                                if (strArr4[4].length() != strArr4[0].length()) {
                                    throw new RuntimeException();
                                }
                                String[] strArr5 = A0N;
                                strArr5[1] = "l5NWk5x9vooO50uu";
                                strArr5[3] = "FcAzQ8glamB386Jq";
                                next.ABu(1);
                            }
                            return;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        throw new C4542Aa(abstractC4569B1, i, j);
    }

    public final void A0A(Message message) {
        int i = message.what;
        if (i == 0) {
            A04((C4548Ag) message.obj, message.arg1, message.arg2 != -1, message.arg2);
            return;
        }
        if (i != 1) {
            String[] strArr = A0N;
            if (strArr[4].length() == strArr[0].length()) {
                A0N[5] = "7KT5lT3IIkvardi0cOE285";
                if (i == 2) {
                    C4529AM c4529am = (C4529AM) message.obj;
                    this.A05 = c4529am;
                    Iterator<InterfaceC4552Ak> it = this.A0K.iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        String[] strArr2 = A0N;
                        if (strArr2[4].length() != strArr2[0].length()) {
                            throw new RuntimeException();
                        }
                        A0N[7] = "lr70Wm3MPuK1";
                        if (hasNext) {
                            it.next().ABq(c4529am);
                        } else {
                            return;
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        } else {
            C4549Ah c4549Ah = (C4549Ah) message.obj;
            if (!this.A07.equals(c4549Ah)) {
                this.A07 = c4549Ah;
                CopyOnWriteArraySet<InterfaceC4552Ak> copyOnWriteArraySet = this.A0K;
                String[] strArr3 = A0N;
                if (strArr3[6].length() == strArr3[2].length()) {
                    String[] strArr4 = A0N;
                    strArr4[1] = "XPkhdR3hZ8JGZkbg";
                    strArr4[3] = "HitM1md97HqEAHyx";
                    Iterator<InterfaceC4552Ak> it2 = copyOnWriteArraySet.iterator();
                    while (it2.hasNext()) {
                        it2.next().ABo(c4549Ah);
                    }
                    return;
                }
            } else {
                return;
            }
        }
        throw new RuntimeException();
    }

    public final boolean A0B() {
        return !A06() && this.A06.A04.A01();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final void A3E(InterfaceC4552Ak interfaceC4552Ak) {
        this.A0K.add(interfaceC4552Ak);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5910XH
    public final C4560As A4L(InterfaceC4559Ar interfaceC4559Ar) {
        return new C4560As(this.A0E, interfaceC4559Ar, this.A06.A03, A6I(), this.A0D);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final int A5r() {
        long A5s = A5s();
        long A6R = A6R();
        if (A5s != -9223372036854775807L) {
            int i = (A6R > (-9223372036854775807L) ? 1 : (A6R == (-9223372036854775807L) ? 0 : -1));
            String[] strArr = A0N;
            if (strArr[6].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0N;
            strArr2[6] = "7";
            strArr2[2] = "n";
            if (i != 0) {
                String[] strArr3 = A0N;
                if (strArr3[4].length() != strArr3[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr4 = A0N;
                strArr4[6] = "w";
                strArr4[2] = "D";
                if (A6R == 0) {
                    return 100;
                }
                return C5038Iz.A06((int) ((100 * A5s) / A6R), 0, 100);
            }
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final long A5s() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A09);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final long A6A() {
        if (A0B()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            return this.A0F.A08() + C4523AG.A01(this.A06.A01);
        }
        return A6F();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final int A6C() {
        if (A0B()) {
            return this.A06.A04.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final int A6D() {
        if (A0B()) {
            return this.A06.A04.A01;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final long A6F() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A0A);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final AbstractC4569B1 A6H() {
        return this.A06.A03;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final int A6I() {
        if (A06()) {
            return this.A01;
        }
        return this.A06.A03.A09(this.A06.A04.A02, this.A0F).A00;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final long A6R() {
        AbstractC4569B1 abstractC4569B1 = this.A06.A03;
        if (abstractC4569B1.A0E()) {
            return -9223372036854775807L;
        }
        if (A0B()) {
            C4829FY c4829fy = this.A06.A04;
            abstractC4569B1.A09(c4829fy.A02, this.A0F);
            return C4523AG.A01(this.A0F.A0A(c4829fy.A00, c4829fy.A01));
        }
        return abstractC4569B1.A0B(A6I(), this.A0G).A02();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final boolean A7D() {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5910XH
    public final void ADH(InterfaceC4831Fa interfaceC4831Fa, boolean z, boolean z2) {
        this.A05 = null;
        C4548Ag A01 = A01(z, z2, 2);
        this.A08 = true;
        this.A02++;
        this.A0E.A0z(interfaceC4831Fa, z, z2);
        A05(A01, false, 4, 1, false, false);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final void ADm() {
        StringBuilder sb = new StringBuilder();
        sb.append(A02(38, 8, 2));
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(A02(0, 2, 7));
        sb.append(A02(15, 18, 78));
        String A02 = A02(47, 3, 94);
        sb.append(A02);
        sb.append(C5038Iz.A04);
        sb.append(A02);
        sb.append(C4539AW.A00());
        sb.append(A02(46, 1, 86));
        Log.i(A02(2, 13, 112), sb.toString());
        this.A0E.A0x();
        this.A0C.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final void AEN(long j) {
        A09(A6I(), j);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final void AEO() {
        A08(A6I());
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final void AEe(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            this.A0E.A10(z);
            A05(this.A06, false, 4, 1, false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4557Ap
    public final void AF4(boolean z) {
        if (z) {
            this.A05 = null;
        }
        C4548Ag A01 = A01(z, z, 1);
        this.A02++;
        this.A0E.A11(z);
        A05(A01, false, 4, 1, false, false);
    }
}
