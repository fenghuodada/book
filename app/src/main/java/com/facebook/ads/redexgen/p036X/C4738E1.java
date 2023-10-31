package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import okio.Utf8;

/* renamed from: com.facebook.ads.redexgen.X.E1 */
/* loaded from: assets/audience_network.dex */
public final class C4738E1 implements Handler.Callback, InterfaceC5805VX, InterfaceC4943HS, InterfaceC4830FZ, InterfaceC4526AJ, InterfaceC4558Aq {
    public static byte[] A0V;
    public static String[] A0W = {"86glHvEVsTHsOarjgO3yrK", "TuAJpp7uzbfmMtpdLTRiZnKK78MiZtWb", "2J1ujHTPZohQZteX1j6kCS7zhajZ8mZI", "eCxkC7v7XtRVNueTNXvbthBaIEqCwNNl", "l3Yyub2xLFiYeWCCac", "TG0XkoHYQCfebcNj4J", "6SVWI1Jvh0Z3jrcRBB9hLc8AjjQAtTry", "lVbeqNrXIfO7zu9EZv7JtI"};
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public C4538AV A04;
    public C4548Ag A05;
    public InterfaceC4831Fa A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public InterfaceC5909XG[] A0C;
    public final long A0D;
    public final Handler A0E;
    public final HandlerThread A0F;
    public final C5912XJ A0G;
    public final InterfaceC5910XH A0H;
    public final InterfaceC4543Ab A0J;
    public final C4567Az A0L;
    public final C4568B0 A0M;
    public final AbstractC4944HT A0N;
    public final C4945HU A0O;
    public final InterfaceC5000IN A0P;
    public final InterfaceC5010IX A0Q;
    public final ArrayList<C4536AT> A0R;
    public final boolean A0S;
    public final InterfaceC5909XG[] A0T;
    public final InterfaceC4562Au[] A0U;
    public final C4546Ae A0K = new C4546Ae();
    public C4565Ax A06 = C4565Ax.A03;
    public final C4537AU A0I = new C4537AU(null);

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0V, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new String(copyOfRange);
    }

    public static void A0K() {
        A0V = new byte[]{40, 21, 2, 61, 1, 12, 20, 8, 31, 36, 0, 29, 1, 36, 3, 25, 8, 31, 3, 12, 1, 40, 21, 2, 61, 1, 12, 20, 8, 31, 36, 0, 29, 1, 36, 3, 25, 8, 31, 3, 12, 1, 87, 37, 12, 3, 9, 1, 8, 31, 25, 55, 62, Utf8.REPLACEMENT_BYTE, 34, 57, 62, 55, 112, 61, 53, 35, 35, 49, 55, 53, 35, 112, 35, 53, 62, 36, 112, 49, 54, 36, 53, 34, 112, 34, 53, 60, 53, 49, 35, 53, 126, 71, 96, 122, 107, 124, 96, 111, 98, 46, 124, 123, 96, 122, 103, 99, 107, 46, 107, 124, 124, 97, 124, 32, 50, 14, 3, 27, 0, 3, 1, 9, 66, 7, 16, 16, 13, 16, 76, 102, 90, 64, 71, 86, 80, 21, 80, 71, 71, 90, 71, 27, 74, 109, 118, 105, 57, Byte.MAX_VALUE, 120, 112, 117, 124, 125, 55, 119, 124, 64, 124, 126, 118, 68, 124, 97, 120};
    }

    static {
        A0K();
    }

    public C4738E1(InterfaceC5909XG[] interfaceC5909XGArr, AbstractC4944HT abstractC4944HT, C4945HU c4945hu, InterfaceC4543Ab interfaceC4543Ab, boolean z, int i, boolean z2, Handler handler, InterfaceC5910XH interfaceC5910XH, InterfaceC5000IN interfaceC5000IN) {
        this.A0T = interfaceC5909XGArr;
        this.A0N = abstractC4944HT;
        this.A0O = c4945hu;
        this.A0J = interfaceC4543Ab;
        this.A08 = z;
        this.A02 = i;
        this.A0B = z2;
        this.A0E = handler;
        this.A0H = interfaceC5910XH;
        this.A0P = interfaceC5000IN;
        this.A0D = interfaceC4543Ab.A5m();
        this.A0S = interfaceC4543Ab.AED();
        this.A05 = new C4548Ag(AbstractC4569B1.A01, -9223372036854775807L, TrackGroupArray.A04, c4945hu);
        this.A0U = new InterfaceC4562Au[interfaceC5909XGArr.length];
        for (int i2 = 0; i2 < interfaceC5909XGArr.length; i2++) {
            interfaceC5909XGArr[i2].AEZ(i2);
            this.A0U[i2] = interfaceC5909XGArr[i2].A5y();
        }
        this.A0G = new C5912XJ(this, interfaceC5000IN);
        this.A0R = new ArrayList<>();
        this.A0C = new InterfaceC5909XG[0];
        this.A0M = new C4568B0();
        this.A0L = new C4567Az();
        abstractC4944HT.A00(this);
        this.A0F = new HandlerThread(A06(21, 29, 15), -16);
        this.A0F.start();
        this.A0Q = interfaceC5000IN.A4J(this.A0F.getLooper(), this);
    }

    private int A00() {
        AbstractC4569B1 abstractC4569B1 = this.A05.A03;
        if (abstractC4569B1.A0E()) {
            return 0;
        }
        return abstractC4569B1.A0B(abstractC4569B1.A05(this.A0B), this.A0M).A00;
    }

    private int A01(int i, AbstractC4569B1 abstractC4569B1, AbstractC4569B1 abstractC4569B12) {
        int maxIterations = i;
        int i2 = -1;
        int A00 = abstractC4569B1.A00();
        for (int i3 = 0; i3 < A00 && i2 == -1; i3++) {
            maxIterations = abstractC4569B1.A03(maxIterations, this.A0L, this.A0M, this.A02, this.A0B);
            if (maxIterations == -1) {
                break;
            }
            i2 = abstractC4569B12.A04(abstractC4569B1.A0A(maxIterations, this.A0L, true).A03);
        }
        return i2;
    }

    private long A02(C4829FY c4829fy, long j) throws C4529AM {
        return A03(c4829fy, j, this.A0K.A0G() != this.A0K.A0H());
    }

    private long A03(C4829FY c4829fy, long j, boolean z) throws C4529AM {
        A0H();
        this.A09 = false;
        A0N(2);
        C4544Ac A0G = this.A0K.A0G();
        C4544Ac newPlayingPeriodHolder = A0G;
        while (true) {
            if (newPlayingPeriodHolder == null) {
                break;
            } else if (A0t(c4829fy, j, newPlayingPeriodHolder)) {
                this.A0K.A0S(newPlayingPeriodHolder);
                break;
            } else {
                newPlayingPeriodHolder = this.A0K.A0C();
            }
        }
        if (A0G != newPlayingPeriodHolder || z) {
            InterfaceC5909XG[] interfaceC5909XGArr = this.A0C;
            if (A0W[5].length() == 18) {
                A0W[4] = "MfZ5b0v7S5HL";
                for (InterfaceC5909XG interfaceC5909XG : interfaceC5909XGArr) {
                    if (A0W[6].charAt(23) == 'j') {
                        break;
                    }
                    A0W[4] = "gre2iAEzIfwakAGQE6Y0w4gvRDGAgj";
                    A0b(interfaceC5909XG);
                }
                this.A0C = new InterfaceC5909XG[0];
                A0G = null;
            }
            throw new RuntimeException();
        }
        if (newPlayingPeriodHolder != null) {
            A0V(A0G);
            boolean z2 = newPlayingPeriodHolder.A05;
            String[] strArr = A0W;
            if (strArr[1].charAt(27) != strArr[2].charAt(27)) {
                A0W[5] = "xpv6IUpjcorvZnU437";
                if (z2) {
                    j = newPlayingPeriodHolder.A08.AEP(j);
                    newPlayingPeriodHolder.A08.A4p(j - this.A0D, this.A0S);
                }
                A0P(j);
                A09();
            }
            throw new RuntimeException();
        }
        this.A0K.A0O(true);
        A0P(j);
        this.A0Q.AER(2);
        return j;
    }

    private Pair<Integer, Long> A04(C4538AV c4538av, boolean z) {
        int A01;
        AbstractC4569B1 abstractC4569B1 = this.A05.A03;
        AbstractC4569B1 abstractC4569B12 = c4538av.A02;
        if (abstractC4569B1.A0E()) {
            return null;
        }
        if (abstractC4569B12.A0E()) {
            abstractC4569B12 = abstractC4569B1;
        }
        try {
            Pair<Integer, Long> A07 = abstractC4569B12.A07(this.A0M, this.A0L, c4538av.A00, c4538av.A01);
            if (abstractC4569B1 == abstractC4569B12) {
                return A07;
            }
            int A04 = abstractC4569B1.A04(abstractC4569B12.A0A(((Integer) A07.first).intValue(), this.A0L, true).A03);
            if (A04 != -1) {
                Integer valueOf = Integer.valueOf(A04);
                Object obj = A07.second;
                if (A0W[5].length() != 18) {
                    throw new RuntimeException();
                }
                A0W[4] = "NzmvKaw5D7qN";
                return Pair.create(valueOf, (Long) obj);
            } else if (!z || (A01 = A01(((Integer) A07.first).intValue(), abstractC4569B12, abstractC4569B1)) == -1) {
                return null;
            } else {
                int i = abstractC4569B1.A09(A01, this.A0L).A00;
                String[] strArr = A0W;
                if (strArr[1].charAt(27) != strArr[2].charAt(27)) {
                    A0W[4] = "Yw40DLhiFndXC7wfBusX4OUMnHZHVu";
                    return A05(abstractC4569B1, i, -9223372036854775807L);
                }
                return A05(abstractC4569B1, i, -9223372036854775807L);
            }
        } catch (IndexOutOfBoundsException unused) {
            throw new C4542Aa(abstractC4569B1, c4538av.A00, c4538av.A01);
        }
    }

    private Pair<Integer, Long> A05(AbstractC4569B1 abstractC4569B1, int i, long j) {
        return abstractC4569B1.A07(this.A0M, this.A0L, i, j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0196, code lost:
        if (r8 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019c, code lost:
        if (r16.A05.A00 == 3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a2, code lost:
        if (r16.A05.A00 != 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01a4, code lost:
        A0R(r2, 10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a9, code lost:
        com.facebook.ads.redexgen.p036X.C5035Iw.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ac, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01b0, code lost:
        if (r16.A0C.length == 0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01b6, code lost:
        if (r16.A05.A00 == 4) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b8, code lost:
        A0R(r2, 1000);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01be, code lost:
        r16.A0Q.ADw(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d0, code lost:
        if (r8 != false) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A07() throws com.facebook.ads.redexgen.p036X.C4529AM, java.io.IOException {
        /*
            Method dump skipped, instructions count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4738E1.A07():void");
    }

    private void A08() {
        A0N(4);
        A0o(false, true, false);
    }

    private void A09() {
        C4544Ac A0F = this.A0K.A0F();
        long A06 = A0F.A06();
        if (A06 == Long.MIN_VALUE) {
            A0k(false);
            return;
        }
        long bufferedDurationUs = A06 - A0F.A08(this.A03);
        boolean AEl = this.A0J.AEl(bufferedDurationUs, this.A0G.A7E().A01);
        A0k(AEl);
        if (AEl) {
            long nextLoadPositionUs = this.A03;
            A0F.A0F(nextLoadPositionUs);
        }
    }

    private void A0A() {
        int i;
        if (this.A0I.A06(this.A05)) {
            Handler handler = this.A0E;
            int A00 = C4537AU.A00(this.A0I);
            if (C4537AU.A02(this.A0I)) {
                i = C4537AU.A01(this.A0I);
            } else {
                i = -1;
            }
            handler.obtainMessage(0, A00, i, this.A05).sendToTarget();
            this.A0I.A05(this.A05);
        }
    }

    private void A0B() throws IOException {
        InterfaceC5909XG[] interfaceC5909XGArr;
        C4544Ac A0F = this.A0K.A0F();
        C4544Ac A0H = this.A0K.A0H();
        if (A0F != null && !A0F.A06) {
            if (A0H != null) {
                C4544Ac readingPeriodHolder = A0H.A01;
                if (readingPeriodHolder != A0F) {
                    return;
                }
            }
            for (InterfaceC5909XG renderer : this.A0C) {
                if (!renderer.A84()) {
                    return;
                }
            }
            A0F.A08.A9Y();
        }
    }

    private void A0C() throws IOException {
        this.A0K.A0M(this.A03);
        if (this.A0K.A0Q()) {
            C4545Ad A0I = this.A0K.A0I(this.A03, this.A05);
            if (A0I == null) {
                this.A07.A9Z();
                return;
            }
            this.A0K.A0K(this.A0U, this.A0N, this.A0J.A5h(), this.A07, this.A05.A03.A0A(A0I.A04.A02, this.A0L, true).A03, A0I).ADG(this, A0I.A03);
            A0k(true);
        }
    }

    private void A0D() {
        A0o(true, true, true);
        this.A0J.AC5();
        A0N(1);
        this.A0F.quit();
        synchronized (this) {
            this.A0A = true;
            notifyAll();
        }
    }

    private void A0E() throws C4529AM {
        if (!this.A0K.A0P()) {
            return;
        }
        float f = this.A0G.A7E().A01;
        C4544Ac A0H = this.A0K.A0H();
        boolean z = true;
        for (C4544Ac A0G = this.A0K.A0G(); A0G != null; A0G = A0G.A01) {
            boolean selectionsChangedForReadPeriod = A0G.A06;
            if (!selectionsChangedForReadPeriod) {
                return;
            }
            if (!A0G.A0I(f)) {
                if (A0G == A0H) {
                    z = false;
                }
            } else {
                if (z) {
                    C4544Ac A0G2 = this.A0K.A0G();
                    boolean A0S = this.A0K.A0S(A0G2);
                    boolean[] zArr = new boolean[this.A0T.length];
                    long A0B = A0G2.A0B(this.A05.A0A, A0S, zArr);
                    A0i(A0G2.A03, A0G2.A04);
                    if (this.A05.A00 != 4 && A0B != this.A05.A0A) {
                        C4548Ag c4548Ag = this.A05;
                        this.A05 = c4548Ag.A04(c4548Ag.A04, A0B, this.A05.A01);
                        this.A0I.A04(4);
                        A0P(A0B);
                    }
                    int i = 0;
                    int enabledRendererCount = this.A0T.length;
                    boolean[] zArr2 = new boolean[enabledRendererCount];
                    int i2 = 0;
                    while (true) {
                        InterfaceC5909XG[] interfaceC5909XGArr = this.A0T;
                        if (i2 >= interfaceC5909XGArr.length) {
                            this.A05 = this.A05.A05(A0G2.A03, A0G2.A04);
                            A0p(zArr2, i);
                            break;
                        }
                        InterfaceC5909XG interfaceC5909XG = interfaceC5909XGArr[i2];
                        zArr2[i2] = interfaceC5909XG.A7W() != 0;
                        InterfaceC4852Fv interfaceC4852Fv = A0G2.A0A[i2];
                        if (interfaceC4852Fv != null) {
                            i++;
                        }
                        if (zArr2[i2]) {
                            InterfaceC4852Fv A7b = interfaceC5909XG.A7b();
                            if (A0W[4].length() == 29) {
                                throw new RuntimeException();
                            }
                            A0W[4] = "CIOLNyaJNw";
                            if (interfaceC4852Fv != A7b) {
                                A0b(interfaceC5909XG);
                            } else if (zArr[i2]) {
                                interfaceC5909XG.AEC(this.A03);
                            }
                        }
                        i2++;
                    }
                } else {
                    this.A0K.A0S(A0G);
                    if (A0G.A06) {
                        A0G.A0A(Math.max(A0G.A02.A03, A0G.A08(this.A03)), false);
                        A0i(A0G.A03, A0G.A04);
                    }
                }
                if (this.A05.A00 != 4) {
                    A09();
                    A0J();
                    this.A0Q.AER(2);
                    return;
                }
                return;
            }
        }
    }

    private void A0F() {
        for (int size = this.A0R.size() - 1; size >= 0; size--) {
            if (!A0r(this.A0R.get(size))) {
                this.A0R.get(size).A03.A0A(false);
                this.A0R.remove(size);
            }
        }
        Collections.sort(this.A0R);
    }

    private void A0G() throws C4529AM {
        this.A09 = false;
        this.A0G.A05();
        for (InterfaceC5909XG interfaceC5909XG : this.A0C) {
            interfaceC5909XG.start();
        }
    }

    private void A0H() throws C4529AM {
        this.A0G.A06();
        for (InterfaceC5909XG interfaceC5909XG : this.A0C) {
            A0c(interfaceC5909XG);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01d6, code lost:
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01de, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01e4, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e5, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
        if (r4.A02.A05 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
        r2 = r1.A0T;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ae, code lost:
        if (r5 >= r2.length) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
        r3 = r2[r5];
        r2 = r4.A0A[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b6, code lost:
        if (r2 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b8, code lost:
        r0 = r3.A7b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
        if (r0 != r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c2, code lost:
        if (r3.A84() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c4, code lost:
        r3.AEX();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c7, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ca, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cd, code lost:
        if (r4.A01 == null) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d3, code lost:
        if (r4.A01.A06 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d5, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d6, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d7, code lost:
        r7 = r1.A0T;
        r6 = r7.length;
        r2 = com.facebook.ads.redexgen.p036X.C4738E1.A0W[3].charAt(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e6, code lost:
        if (r2 == 99) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e8, code lost:
        com.facebook.ads.redexgen.p036X.C4738E1.A0W[4] = "ghsgso7PHHKUfGJDBRDWa58h1rLx";
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ef, code lost:
        if (r5 >= r6) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f1, code lost:
        r3 = r7[r5];
        r2 = r4.A0A[r5];
        r0 = r3.A7b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fb, code lost:
        if (r0 != r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00fd, code lost:
        if (r2 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0103, code lost:
        if (r3.A84() != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0105, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0106, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0109, code lost:
        r3 = com.facebook.ads.redexgen.p036X.C4738E1.A0W;
        r3[1] = "W3Zxvi1uQeiwcOM1a3uIixoX4KFWrQEX";
        r3[2] = "hMjrL9hJ9zdobOz7Vqnbeo3Jken9e002";
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0115, code lost:
        if (r5 >= r6) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0118, code lost:
        r8 = r4.A04;
        r7 = r1.A0K.A0D();
        r6 = r7.A04;
        r4 = (r7.A08.ADb() > (-9223372036854775807L) ? 1 : (r7.A08.ADb() == (-9223372036854775807L) ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013a, code lost:
        if (com.facebook.ads.redexgen.p036X.C4738E1.A0W[4].length() == 29) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013c, code lost:
        com.facebook.ads.redexgen.p036X.C4738E1.A0W[6] = "vjt4oSs9hMr9NwWN4mwojUjVUYrN8cQ6";
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0143, code lost:
        if (r4 == 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0145, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0146, code lost:
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0147, code lost:
        r2 = r1.A0T;
        r0 = r2.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x014a, code lost:
        if (r5 >= r0) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014c, code lost:
        r4 = r2[r5];
        r0 = r8.A00(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0152, code lost:
        if (r0 != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0154, code lost:
        r5 = r5 + 1;
        r1 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0158, code lost:
        if (r13 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015a, code lost:
        r4.AEX();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0162, code lost:
        if (r4.A8O() != false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0164, code lost:
        r12 = r6.A01.A00(r5);
        r11 = r6.A00(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0177, code lost:
        if (r1.A0U[r5].A7i() != 5) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0179, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x017a, code lost:
        r3 = r8.A03[r5];
        r9 = r6.A03;
        r2 = com.facebook.ads.redexgen.p036X.C4738E1.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0192, code lost:
        if (r2[1].charAt(27) == r2[2].charAt(27)) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0194, code lost:
        com.facebook.ads.redexgen.p036X.C4738E1.A0W[5] = "Ap10Ra2l8gLZ0YRne2";
        r0 = r9[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019d, code lost:
        if (r11 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a3, code lost:
        if (r0.equals(r3) == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01a5, code lost:
        if (r10 != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a7, code lost:
        r3 = A0v(r12);
        r9 = r7.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b9, code lost:
        if (com.facebook.ads.redexgen.p036X.C4738E1.A0W[3].charAt(0) == 'c') goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01bb, code lost:
        com.facebook.ads.redexgen.p036X.C4738E1.A0W[5] = "P6QWonkpaKbLAx4pgk";
        r4.AE1(r3, r9[r5], r7.A07());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01cc, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ce, code lost:
        r4.AEX();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d2, code lost:
        if (r4 == 0) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0I() throws com.facebook.ads.redexgen.p036X.C4529AM, java.io.IOException {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4738E1.A0I():void");
    }

    private void A0J() throws C4529AM {
        long A0C;
        if (!this.A0K.A0P()) {
            return;
        }
        C4544Ac A0G = this.A0K.A0G();
        long ADb = A0G.A08.ADb();
        if (ADb != -9223372036854775807L) {
            A0P(ADb);
            long periodPositionUs = this.A05.A0A;
            if (ADb != periodPositionUs) {
                C4548Ag c4548Ag = this.A05;
                this.A05 = c4548Ag.A04(c4548Ag.A04, ADb, this.A05.A01);
                this.A0I.A04(4);
            }
        } else {
            this.A03 = this.A0G.A04();
            long A08 = A0G.A08(this.A03);
            A0Q(this.A05.A0A, A08);
            this.A05.A0A = A08;
        }
        C4548Ag c4548Ag2 = this.A05;
        if (this.A0C.length == 0) {
            A0C = A0G.A02.A01;
        } else {
            A0C = A0G.A0C(true);
        }
        c4548Ag2.A09 = A0C;
    }

    private void A0L(float f) {
        InterfaceC4941HQ[] A01;
        for (C4544Ac A0E = this.A0K.A0E(); A0E != null; A0E = A0E.A01) {
            if (A0E.A04 != null) {
                for (InterfaceC4941HQ trackSelection : A0E.A04.A01.A01()) {
                    if (trackSelection != null) {
                        trackSelection.ABp(f);
                    }
                }
            }
        }
    }

    private void A0M(int i) throws C4529AM {
        this.A02 = i;
        if (!this.A0K.A0R(i)) {
            A0j(true);
        }
    }

    private void A0N(int i) {
        if (this.A05.A00 != i) {
            this.A05 = this.A05.A02(i);
        }
    }

    private void A0O(int i, boolean z, int i2) throws C4529AM {
        C4544Ac A0G = this.A0K.A0G();
        InterfaceC5909XG interfaceC5909XG = this.A0T[i];
        this.A0C[i2] = interfaceC5909XG;
        if (interfaceC5909XG.A7W() == 0) {
            C4563Av c4563Av = A0G.A04.A03[i];
            Format[] A0v = A0v(A0G.A04.A01.A00(i));
            boolean z2 = this.A08 && this.A05.A00 == 3;
            interfaceC5909XG.A5A(c4563Av, A0v, A0G.A0A[i], this.A03, !z && z2, A0G.A07());
            this.A0G.A09(interfaceC5909XG);
            if (z2) {
                interfaceC5909XG.start();
            }
        }
    }

    private void A0P(long j) throws C4529AM {
        if (this.A0K.A0P()) {
            C4544Ac A0G = this.A0K.A0G();
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[0] = "3Dp2X759xi1gKy2gc8ykMJ";
            strArr[7] = "GcHSrS1OF4oxjH6XmPjhKR";
            j = A0G.A09(j);
        }
        this.A03 = j;
        this.A0G.A07(this.A03);
        for (InterfaceC5909XG interfaceC5909XG : this.A0C) {
            interfaceC5909XG.AEC(this.A03);
        }
    }

    private void A0Q(long j, long j2) throws C4529AM {
        C4536AT c4536at;
        if (this.A0R.isEmpty() || this.A05.A04.A01()) {
            return;
        }
        if (this.A05.A02 == j) {
            j--;
        }
        int i = this.A05.A04.A02;
        int i2 = this.A00;
        C4536AT c4536at2 = i2 > 0 ? this.A0R.get(i2 - 1) : null;
        while (c4536at2 != null) {
            if (c4536at2.A00 <= i) {
                int i3 = c4536at2.A00;
                if (A0W[3].charAt(0) == 'c') {
                    throw new RuntimeException();
                }
                String[] strArr = A0W;
                strArr[0] = "ZbbXGQ7fBHqOH9bFx5EieA";
                strArr[7] = "wqQaVgv9yDX8FIaCovLxd4";
                if (i3 == i) {
                    if (c4536at2.A01 <= j) {
                        break;
                    }
                } else {
                    break;
                }
            }
            this.A00--;
            int i4 = this.A00;
            c4536at2 = i4 > 0 ? this.A0R.get(i4 - 1) : null;
        }
        if (this.A00 < this.A0R.size()) {
            c4536at = this.A0R.get(this.A00);
        } else {
            c4536at = null;
        }
        while (c4536at != null && c4536at.A02 != null && (c4536at.A00 < i || (c4536at.A00 == i && c4536at.A01 <= j))) {
            this.A00++;
            if (this.A00 < this.A0R.size()) {
                c4536at = this.A0R.get(this.A00);
            } else {
                c4536at = null;
            }
        }
        while (c4536at != null && c4536at.A02 != null && c4536at.A00 == i && c4536at.A01 > j && c4536at.A01 <= j2) {
            A0Z(c4536at.A03);
            if (c4536at.A03.A0B() || c4536at.A03.A0D()) {
                this.A0R.remove(this.A00);
            } else {
                this.A00++;
            }
            if (this.A00 < this.A0R.size()) {
                c4536at = this.A0R.get(this.A00);
            } else {
                c4536at = null;
            }
        }
    }

    private void A0R(long j, long j2) {
        this.A0Q.ADw(2);
        this.A0Q.AES(2, j + j2);
    }

    private void A0S(C4535AS c4535as) throws C4529AM {
        Object playingPeriodUid;
        if (c4535as.A01 != this.A07) {
            return;
        }
        AbstractC4569B1 abstractC4569B1 = this.A05.A03;
        AbstractC4569B1 abstractC4569B12 = c4535as.A00;
        Object manifest = c4535as.A02;
        this.A0K.A0N(abstractC4569B12);
        this.A05 = this.A05.A03(abstractC4569B12, manifest);
        A0F();
        int i = this.A01;
        if (i > 0) {
            this.A0I.A03(i);
            this.A01 = 0;
            C4538AV c4538av = this.A04;
            if (c4538av != null) {
                Pair<Integer, Long> A04 = A04(c4538av, true);
                this.A04 = null;
                if (A04 == null) {
                    A08();
                    return;
                }
                int intValue = ((Integer) A04.first).intValue();
                long longValue = ((Long) A04.second).longValue();
                C4829FY A0L = this.A0K.A0L(intValue, longValue);
                this.A05 = this.A05.A04(A0L, A0L.A01() ? 0L : longValue, longValue);
                return;
            } else if (this.A05.A02 != -9223372036854775807L) {
                return;
            } else {
                boolean A0E = abstractC4569B12.A0E();
                String[] strArr = A0W;
                if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
                    throw new RuntimeException();
                }
                A0W[4] = "lH2oXw2RUPBHBuRA0";
                if (A0E) {
                    A08();
                    return;
                }
                Pair<Integer, Long> A05 = A05(abstractC4569B12, abstractC4569B12.A05(this.A0B), -9223372036854775807L);
                int intValue2 = ((Integer) A05.first).intValue();
                long longValue2 = ((Long) A05.second).longValue();
                C4829FY A0L2 = this.A0K.A0L(intValue2, longValue2);
                this.A05 = this.A05.A04(A0L2, A0L2.A01() ? 0L : longValue2, longValue2);
                return;
            }
        }
        int i2 = this.A05.A04.A02;
        long j = this.A05.A01;
        if (abstractC4569B1.A0E()) {
            if (!abstractC4569B12.A0E()) {
                C4829FY A0L3 = this.A0K.A0L(i2, j);
                C4548Ag c4548Ag = this.A05;
                long startPositionUs = A0L3.A01() ? 0L : j;
                this.A05 = c4548Ag.A04(A0L3, startPositionUs, j);
                return;
            }
            return;
        }
        C4544Ac A0E2 = this.A0K.A0E();
        if (A0E2 == null) {
            C4567Az c4567Az = this.A0L;
            if (A0W[3].charAt(0) != 'c') {
                String[] strArr2 = A0W;
                strArr2[0] = "AIgzGczszMkheYOO0l2WDA";
                strArr2[7] = "AQm6fITMTu1q9a2hy8bL0W";
                playingPeriodUid = abstractC4569B1.A0A(i2, c4567Az, true).A03;
            } else {
                A0W[6] = "kxPd1uECtZJZCmNWUxsBgkB7loYAAl3C";
                playingPeriodUid = abstractC4569B1.A0A(i2, c4567Az, true).A03;
            }
        } else {
            playingPeriodUid = A0E2.A09;
        }
        int A042 = abstractC4569B12.A04(playingPeriodUid);
        if (A042 == -1) {
            int A01 = A01(i2, abstractC4569B1, abstractC4569B12);
            if (A01 == -1) {
                A08();
                return;
            }
            Pair<Integer, Long> A052 = A05(abstractC4569B12, abstractC4569B12.A09(A01, this.A0L).A00, -9223372036854775807L);
            int intValue3 = ((Integer) A052.first).intValue();
            long longValue3 = ((Long) A052.second).longValue();
            C4829FY A0L4 = this.A0K.A0L(intValue3, longValue3);
            abstractC4569B12.A0A(intValue3, this.A0L, true);
            if (A0E2 != null) {
                Object obj = this.A0L.A03;
                A0E2.A02 = A0E2.A02.A00(-1);
                while (A0E2.A01 != null) {
                    A0E2 = A0E2.A01;
                    if (A0E2.A09.equals(obj)) {
                        A0E2.A02 = this.A0K.A0J(A0E2.A02, intValue3);
                    } else {
                        A0E2.A02 = A0E2.A02.A00(-1);
                    }
                }
            }
            this.A05 = this.A05.A04(A0L4, A02(A0L4, A0L4.A01() ? 0L : longValue3), longValue3);
            return;
        }
        if (A042 != i2) {
            C4548Ag A012 = this.A05.A01(A042);
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            A0W[4] = "bxSLNYRWzgoGTszax8Z4I";
            this.A05 = A012;
        }
        C4829FY c4829fy = this.A05.A04;
        if (c4829fy.A01()) {
            C4829FY A0L5 = this.A0K.A0L(A042, j);
            if (!A0L5.equals(c4829fy)) {
                this.A05 = this.A05.A04(A0L5, A02(A0L5, A0L5.A01() ? 0L : j), j);
                return;
            }
        }
        if (!this.A0K.A0U(c4829fy, this.A03)) {
            A0j(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0T(com.facebook.ads.redexgen.p036X.C4538AV r20) throws com.facebook.ads.redexgen.p036X.C4529AM {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4738E1.A0T(com.facebook.ads.redexgen.X.AV):void");
    }

    private void A0V(@Nullable C4544Ac c4544Ac) throws C4529AM {
        C4544Ac A0G = this.A0K.A0G();
        if (A0G == null || c4544Ac == A0G) {
            return;
        }
        int i = 0;
        boolean[] zArr = new boolean[this.A0T.length];
        int i2 = 0;
        while (true) {
            InterfaceC5909XG[] interfaceC5909XGArr = this.A0T;
            if (i2 >= interfaceC5909XGArr.length) {
                break;
            }
            InterfaceC5909XG interfaceC5909XG = interfaceC5909XGArr[i2];
            zArr[i2] = interfaceC5909XG.A7W() != 0;
            if (A0G.A04.A00(i2)) {
                i++;
            }
            if (zArr[i2] && (!A0G.A04.A00(i2) || (interfaceC5909XG.A8O() && interfaceC5909XG.A7b() == c4544Ac.A0A[i2]))) {
                A0b(interfaceC5909XG);
            }
            i2++;
        }
        C4548Ag c4548Ag = this.A05;
        if (A0W[6].charAt(23) == 'j') {
            throw new RuntimeException();
        }
        String[] strArr = A0W;
        strArr[0] = "YeyTuc4hJN2cviDoFTSuVw";
        strArr[7] = "y3cCzPpceybwtUTWhAu8hu";
        this.A05 = c4548Ag.A05(A0G.A03, A0G.A04);
        A0p(zArr, i);
    }

    private void A0W(C4549Ah c4549Ah) {
        this.A0G.AEf(c4549Ah);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(C4560As c4560As) throws C4529AM {
        if (c4560As.A0D()) {
            return;
        }
        try {
            c4560As.A04().A7z(c4560As.A00(), c4560As.A09());
        } finally {
            c4560As.A0A(true);
        }
    }

    private void A0Y(C4560As c4560As) throws C4529AM {
        if (c4560As.A02() == -9223372036854775807L) {
            A0Z(c4560As);
        } else if (this.A07 == null || this.A01 > 0) {
            this.A0R.add(new C4536AT(c4560As));
        } else {
            C4536AT c4536at = new C4536AT(c4560As);
            if (A0r(c4536at)) {
                ArrayList<C4536AT> arrayList = this.A0R;
                String[] strArr = A0W;
                if (strArr[0].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                A0W[6] = "bdowkwDe22b4JBVUMCxt2Emm6YTTpUJh";
                arrayList.add(c4536at);
                Collections.sort(this.A0R);
                return;
            }
            c4560As.A0A(false);
        }
    }

    private void A0Z(C4560As c4560As) throws C4529AM {
        if (c4560As.A03().getLooper() == this.A0Q.A6v()) {
            A0X(c4560As);
            if (this.A05.A00 == 3 || this.A05.A00 == 2) {
                this.A0Q.AER(2);
                return;
            }
            return;
        }
        this.A0Q.A9m(15, c4560As).sendToTarget();
    }

    private void A0a(C4560As c4560As) {
        c4560As.A03().post(new RunnableC4534AR(this, c4560As));
    }

    private void A0b(InterfaceC5909XG interfaceC5909XG) throws C4529AM {
        this.A0G.A08(interfaceC5909XG);
        A0c(interfaceC5909XG);
        interfaceC5909XG.A4n();
    }

    private void A0c(InterfaceC5909XG interfaceC5909XG) throws C4529AM {
        if (interfaceC5909XG.A7W() == 2) {
            interfaceC5909XG.stop();
        }
    }

    private void A0d(C4565Ax c4565Ax) {
        this.A06 = c4565Ax;
    }

    private void A0e(InterfaceC5804VW interfaceC5804VW) {
        if (!this.A0K.A0T(interfaceC5804VW)) {
            return;
        }
        this.A0K.A0M(this.A03);
        A09();
    }

    private void A0f(InterfaceC5804VW interfaceC5804VW) throws C4529AM {
        if (!this.A0K.A0T(interfaceC5804VW)) {
            return;
        }
        C4544Ac A0F = this.A0K.A0F();
        A0F.A0E(this.A0G.A7E().A01);
        A0i(A0F.A03, A0F.A04);
        if (!this.A0K.A0P()) {
            A0P(this.A0K.A0C().A02.A03);
            A0V(null);
        }
        A09();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4853Fw
    /* renamed from: A0g */
    public final void AAP(InterfaceC5804VW interfaceC5804VW) {
        this.A0Q.A9m(10, interfaceC5804VW).sendToTarget();
    }

    private void A0h(InterfaceC4831Fa interfaceC4831Fa, boolean z, boolean z2) {
        this.A01++;
        A0o(true, z, z2);
        this.A0J.onPrepared();
        this.A07 = interfaceC4831Fa;
        A0N(2);
        interfaceC4831Fa.ADJ(this.A0H, true, this);
        this.A0Q.AER(2);
    }

    private void A0i(TrackGroupArray trackGroupArray, C4945HU c4945hu) {
        this.A0J.ACZ(this.A0T, trackGroupArray, c4945hu.A01);
    }

    private void A0j(boolean z) throws C4529AM {
        C4829FY c4829fy = this.A0K.A0G().A02.A04;
        long A03 = A03(c4829fy, this.A05.A0A, true);
        long newPositionUs = this.A05.A0A;
        if (A03 != newPositionUs) {
            C4548Ag c4548Ag = this.A05;
            this.A05 = c4548Ag.A04(c4829fy, A03, c4548Ag.A01);
            if (z) {
                this.A0I.A04(4);
            }
        }
    }

    private void A0k(boolean z) {
        if (this.A05.A08 != z) {
            this.A05 = this.A05.A06(z);
        }
    }

    private void A0l(boolean z) throws C4529AM {
        this.A09 = false;
        this.A08 = z;
        if (!z) {
            A0H();
            A0J();
        } else if (this.A05.A00 == 3) {
            A0G();
            if (A0W[4].length() == 29) {
                throw new RuntimeException();
            }
            A0W[6] = "X2QfJ1e23pCpGilE5nvaFXYxLnWx3Vax";
            this.A0Q.AER(2);
        } else if (this.A05.A00 != 2) {
        } else {
            this.A0Q.AER(2);
        }
    }

    private void A0m(boolean z) throws C4529AM {
        this.A0B = z;
        if (!this.A0K.A0V(z)) {
            A0j(true);
        }
    }

    private void A0n(boolean z, boolean z2) {
        A0o(true, z, z);
        this.A0I.A03(this.A01 + (z2 ? 1 : 0));
        this.A01 = 0;
        this.A0J.ACR();
        A0N(1);
    }

    private void A0o(boolean z, boolean z2, boolean z3) {
        InterfaceC5909XG[] interfaceC5909XGArr;
        Object obj;
        long j;
        TrackGroupArray trackGroupArray;
        C4945HU c4945hu;
        InterfaceC4831Fa interfaceC4831Fa;
        this.A0Q.ADw(2);
        this.A09 = false;
        this.A0G.A06();
        this.A03 = 0L;
        for (InterfaceC5909XG renderer : this.A0C) {
            try {
                A0b(renderer);
            } catch (C4529AM | RuntimeException e) {
                Log.e(A06(0, 21, 15), A06(138, 12, 123), e);
            }
        }
        this.A0C = new InterfaceC5909XG[0];
        C4546Ae c4546Ae = this.A0K;
        String[] strArr = A0W;
        if (strArr[1].charAt(27) == strArr[2].charAt(27)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0W;
        strArr2[0] = "2WNzaDjkqcOaPFAy0QOPwI";
        strArr2[7] = "unAKX8spYNQMyMddShLfR5";
        c4546Ae.A0O(!z2);
        A0k(false);
        if (z2) {
            this.A04 = null;
        }
        if (z3) {
            this.A0K.A0N(AbstractC4569B1.A01);
            Iterator<C4536AT> it = this.A0R.iterator();
            while (it.hasNext()) {
                C4536AT next = it.next();
                if (A0W[5].length() != 18) {
                    throw new RuntimeException();
                }
                A0W[6] = "oYGfQB8mGDj6jmVX6XAe4nZE0DoRm7Og";
                next.A03.A0A(false);
            }
            this.A0R.clear();
            this.A00 = 0;
        }
        AbstractC4569B1 abstractC4569B1 = z3 ? AbstractC4569B1.A01 : this.A05.A03;
        if (z3) {
            obj = null;
        } else {
            obj = this.A05.A07;
        }
        C4829FY c4829fy = z2 ? new C4829FY(A00()) : this.A05.A04;
        long j2 = -9223372036854775807L;
        if (z2) {
            j = -9223372036854775807L;
        } else {
            j = this.A05.A0A;
        }
        if (!z2) {
            j2 = this.A05.A01;
        }
        int i = this.A05.A00;
        if (z3) {
            trackGroupArray = TrackGroupArray.A04;
        } else {
            C4548Ag c4548Ag = this.A05;
            if (A0W[5].length() != 18) {
                trackGroupArray = c4548Ag.A05;
            } else {
                String[] strArr3 = A0W;
                strArr3[1] = "udHBd6VluCWpjwypGpbQkm44C5lEXr7W";
                strArr3[2] = "ikIjUWR3chEMULYYaopllYxVSgtPleKx";
                trackGroupArray = c4548Ag.A05;
            }
        }
        if (z3) {
            c4945hu = this.A0O;
        } else {
            c4945hu = this.A05.A06;
        }
        this.A05 = new C4548Ag(abstractC4569B1, obj, c4829fy, j, j2, i, false, trackGroupArray, c4945hu);
        if (z && (interfaceC4831Fa = this.A07) != null) {
            interfaceC4831Fa.ADt(this);
            this.A07 = null;
        }
    }

    private void A0p(boolean[] zArr, int i) throws C4529AM {
        this.A0C = new InterfaceC5909XG[i];
        int enabledRendererCount = 0;
        C4544Ac A0G = this.A0K.A0G();
        for (int i2 = 0; i2 < this.A0T.length; i2++) {
            if (A0G.A04.A00(i2)) {
                A0O(i2, zArr[i2], enabledRendererCount);
                enabledRendererCount++;
            }
        }
    }

    private boolean A0q() {
        C4544Ac A0G = this.A0K.A0G();
        long j = A0G.A02.A01;
        return j == -9223372036854775807L || this.A05.A0A < j || (A0G.A01 != null && (A0G.A01.A06 || A0G.A01.A02.A04.A01()));
    }

    private boolean A0r(C4536AT c4536at) {
        if (c4536at.A02 == null) {
            Pair<Integer, Long> A04 = A04(new C4538AV(c4536at.A03.A08(), c4536at.A03.A01(), C4523AG.A00(c4536at.A03.A02())), false);
            if (A04 == null) {
                return false;
            }
            c4536at.A01(((Integer) A04.first).intValue(), ((Long) A04.second).longValue(), this.A05.A03.A0A(((Integer) A04.first).intValue(), this.A0L, true).A03);
        } else {
            int A042 = this.A05.A03.A04(c4536at.A02);
            if (A042 == -1) {
                return false;
            }
            c4536at.A00 = A042;
        }
        return true;
    }

    private boolean A0s(InterfaceC5909XG interfaceC5909XG) {
        C4544Ac A0H = this.A0K.A0H();
        return A0H.A01 != null && A0H.A01.A06 && interfaceC5909XG.A84();
    }

    private boolean A0t(C4829FY c4829fy, long j, C4544Ac c4544Ac) {
        if (c4829fy.equals(c4544Ac.A02.A04) && c4544Ac.A06) {
            this.A05.A03.A09(c4544Ac.A02.A04.A02, this.A0L);
            int A04 = this.A0L.A04(j);
            if (A04 == -1 || this.A0L.A09(A04) == c4544Ac.A02.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r3 != Long.MIN_VALUE) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
        r2 = r7.A0J;
        r0 = r7.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0081, code lost:
        if (r2.AEo(r3 - r5.A08(r0), r7.A0G.A7E().A01, r7.A09) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009e, code lost:
        if (r3 != Long.MIN_VALUE) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0u(boolean r8) {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.XG[] r0 = r7.A0C
            int r0 = r0.length
            if (r0 != 0) goto La
            boolean r0 = r7.A0q()
            return r0
        La:
            r6 = 0
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C4738E1.A0W
            r0 = 0
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L23
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L23:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C4738E1.A0W
            java.lang.String r1 = "XitCw2lYTMNoWfZ3MNfhmS"
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = "pjSmPGutCkFid20LDJR8Tk"
            r0 = 7
            r2[r0] = r1
            if (r8 != 0) goto L32
            return r6
        L32:
            com.facebook.ads.redexgen.X.Ag r0 = r7.A05
            boolean r0 = r0.A08
            r3 = 1
            if (r0 != 0) goto L3a
            return r3
        L3a:
            com.facebook.ads.redexgen.X.Ae r0 = r7.A0K
            com.facebook.ads.redexgen.X.Ac r5 = r0.A0F()
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C4738E1.A0W
            r0 = 1
            r1 = r2[r0]
            r0 = 2
            r2 = r2[r0]
            r0 = 27
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L85
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C4738E1.A0W
            java.lang.String r1 = "c9QtbAseiMx42ehTAZ"
            r0 = 5
            r2[r0] = r1
            com.facebook.ads.redexgen.X.Ad r0 = r5.A02
            boolean r0 = r0.A05
            r0 = r0 ^ r3
            long r3 = r5.A0C(r0)
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L83
        L6a:
            com.facebook.ads.redexgen.X.Ab r2 = r7.A0J
            long r0 = r7.A03
            long r0 = r5.A08(r0)
            long r3 = r3 - r0
            com.facebook.ads.redexgen.X.XJ r0 = r7.A0G
            com.facebook.ads.redexgen.X.Ah r0 = r0.A7E()
            float r1 = r0.A01
            boolean r0 = r7.A09
            boolean r0 = r2.AEo(r3, r1, r0)
            if (r0 == 0) goto L84
        L83:
            r6 = 1
        L84:
            return r6
        L85:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C4738E1.A0W
            java.lang.String r1 = "5BPuibQqZ5NKjWZyuTION1z1lHkA3o6b"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "lue4BzZmQF8ChJf2GK4Pk4NwU097v1o6"
            r0 = 2
            r2[r0] = r1
            com.facebook.ads.redexgen.X.Ad r0 = r5.A02
            boolean r0 = r0.A05
            r0 = r0 ^ r3
            long r3 = r5.A0C(r0)
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L83
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4738E1.A0u(boolean):boolean");
    }

    @NonNull
    public static Format[] A0v(InterfaceC4941HQ interfaceC4941HQ) {
        int length = interfaceC4941HQ != null ? interfaceC4941HQ.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i = 0; i < length; i++) {
            formatArr[i] = interfaceC4941HQ.A6h(i);
            if (A0W[3].charAt(0) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A0W;
            strArr[1] = "cHoAaTwhCyKnC5gIlgOheFkD17ImOLE4";
            strArr[2] = "NdVO49IoL7wvUQC4on3mokgCd3AJvc50";
        }
        return formatArr;
    }

    public final Looper A0w() {
        return this.A0F.getLooper();
    }

    public final synchronized void A0x() {
        if (this.A0A) {
            return;
        }
        this.A0Q.AER(7);
        boolean z = false;
        while (!this.A0A) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final void A0y(AbstractC4569B1 abstractC4569B1, int i, long j) {
        this.A0Q.A9m(3, new C4538AV(abstractC4569B1, i, j)).sendToTarget();
    }

    public final void A0z(InterfaceC4831Fa interfaceC4831Fa, boolean z, boolean z2) {
        this.A0Q.A9l(0, z ? 1 : 0, z2 ? 1 : 0, interfaceC4831Fa).sendToTarget();
    }

    public final void A10(boolean z) {
        this.A0Q.A9k(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void A11(boolean z) {
        this.A0Q.A9k(6, z ? 1 : 0, 0).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4526AJ
    public final void ABo(C4549Ah c4549Ah) {
        this.A0E.obtainMessage(1, c4549Ah).sendToTarget();
        A0L(c4549Ah.A01);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5805VX
    public final void ABw(InterfaceC5804VW interfaceC5804VW) {
        this.A0Q.A9m(9, interfaceC5804VW).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4830FZ
    public final void ACM(InterfaceC4831Fa interfaceC4831Fa, AbstractC4569B1 abstractC4569B1, Object obj) {
        this.A0Q.A9m(8, new C4535AS(interfaceC4831Fa, abstractC4569B1, obj)).sendToTarget();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4558Aq
    public final synchronized void AET(C4560As c4560As) {
        if (this.A0A) {
            Log.w(A06(0, 21, 15), A06(50, 37, 50));
            c4560As.A0A(false);
            return;
        }
        this.A0Q.A9m(14, c4560As).sendToTarget();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        String A06 = A06(0, 21, 15);
        try {
            switch (message.what) {
                case 0:
                    A0h((InterfaceC4831Fa) message.obj, message.arg1 != 0, message.arg2 != 0);
                    break;
                case 1:
                    A0l(message.arg1 != 0);
                    break;
                case 2:
                    A07();
                    break;
                case 3:
                    A0T((C4538AV) message.obj);
                    break;
                case 4:
                    A0W((C4549Ah) message.obj);
                    break;
                case 5:
                    A0d((C4565Ax) message.obj);
                    break;
                case 6:
                    A0n(message.arg1 != 0, true);
                    break;
                case 7:
                    A0D();
                    return true;
                case 8:
                    A0S((C4535AS) message.obj);
                    break;
                case 9:
                    A0f((InterfaceC5804VW) message.obj);
                    break;
                case 10:
                    A0e((InterfaceC5804VW) message.obj);
                    break;
                case 11:
                    A0E();
                    break;
                case 12:
                    A0M(message.arg1);
                    break;
                case 13:
                    A0m(message.arg1 != 0);
                    break;
                case 14:
                    A0Y((C4560As) message.obj);
                    break;
                case 15:
                    A0a((C4560As) message.obj);
                    break;
                default:
                    return false;
            }
            A0A();
        } catch (C4529AM e) {
            Log.e(A06, A06(110, 15, 0), e);
            A0n(false, false);
            this.A0E.obtainMessage(2, e).sendToTarget();
            A0A();
        } catch (IOException e2) {
            Log.e(A06, A06(125, 13, 87), e2);
            A0n(false, false);
            this.A0E.obtainMessage(2, C4529AM.A00(e2)).sendToTarget();
            if (A0W[6].charAt(23) != 'j') {
                A0W[5] = "BLVAUEtDSJNWXrvjpr";
                A0A();
            } else {
                throw new RuntimeException();
            }
        } catch (RuntimeException e3) {
            Log.e(A06, A06(87, 23, 108), e3);
            A0n(false, false);
            this.A0E.obtainMessage(2, C4529AM.A02(e3)).sendToTarget();
            A0A();
        }
        return true;
    }
}
