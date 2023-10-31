package com.facebook.ads.redexgen.p036X;

import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.exoplayer2.Format;
import com.facebook.ads.internal.exoplayer2.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.CE */
/* loaded from: assets/audience_network.dex */
public final class C4644CE implements InterfaceC5804VW, InterfaceC4660Ce, InterfaceC4967Hq<C5808Va>, InterfaceC4970Ht, InterfaceC4851Fu {
    public static byte[] A0c;
    public static String[] A0d = {"iI0ZOGUFhjVKOFZqbUjTJbzZriBk", "wCM5SpVnQk8vEGvx3xuFkFQnwN8gnHkn", "CC", "sZUrtXRAji2vfBWVwphN9cenOJ8FQWpp", "F506DqgxlNyYyNAR0eHuGAxqIBb0RwxX", "mj8nEZtHpBznvwUNQKJPsV2u1H4", "sYtV3FATfn8NsU7nH3", "hZDPske6mXbyt4vhVom9Ng"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public InterfaceC4667Cl A07;
    @Nullable
    public InterfaceC5805VX A08;
    public TrackGroupArray A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean[] A0L;
    public boolean[] A0M;
    public boolean[] A0N;
    public final int A0O;
    public final long A0P;
    public final Uri A0Q;
    public final C4825FU A0S;
    public final InterfaceC4826FV A0T;
    public final C4842Fl A0U;
    public final InterfaceC4947HW A0V;
    public final InterfaceC4955He A0W;
    @Nullable
    public final String A0b;
    public final C5768Uw A0X = new C5768Uw(A07(0, 27, 82));
    public final C5003IQ A0Y = new C5003IQ();
    public final Runnable A0Z = new RunnableC4823FS(this);
    public final Runnable A0a = new RunnableC4824FT(this);
    public final Handler A0R = new Handler();
    public int[] A0J = new int[0];
    public C5803VV[] A0K = new C5803VV[0];
    public long A06 = -9223372036854775807L;
    public long A05 = -1;
    public long A03 = -9223372036854775807L;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0c, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A0d[7].length() != 22) {
                throw new RuntimeException();
            }
            A0d[2] = "Up";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
            i4++;
        }
    }

    public static void A0B() {
        A0c = new byte[]{102, 69, 75, 78, 79, 88, 16, 111, 82, 94, 88, 75, 73, 94, 69, 88, 103, 79, 78, 67, 75, 122, 79, 88, 67, 69, 78};
    }

    static {
        A0B();
    }

    public C4644CE(Uri uri, InterfaceC4955He interfaceC4955He, InterfaceC4658Cc[] interfaceC4658CcArr, int i, C4842Fl c4842Fl, InterfaceC4826FV interfaceC4826FV, InterfaceC4947HW interfaceC4947HW, @Nullable String str, int i2) {
        this.A0Q = uri;
        this.A0W = interfaceC4955He;
        this.A0O = i;
        this.A0U = c4842Fl;
        this.A0T = interfaceC4826FV;
        this.A0V = interfaceC4947HW;
        this.A0b = str;
        this.A0P = i2;
        this.A0S = new C4825FU(interfaceC4658CcArr, this);
        this.A00 = i == -1 ? 3 : i;
        c4842Fl.A03();
    }

    private int A00() {
        C5803VV[] c5803vvArr;
        int i = 0;
        for (C5803VV c5803vv : this.A0K) {
            String[] strArr = A0d;
            if (strArr[5].length() == strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[3] = "qSOUgbz3JlJaX9UdXA1gn9agrJ83m9Y6";
            strArr2[1] = "wkCF1xtIBevCyUX610AjJpYT598Om9ct";
            i += c5803vv.A0C();
        }
        return i;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4967Hq
    /* renamed from: A01 */
    public final int ABI(C5808Va c5808Va, long j, long j2, IOException iOException) {
        C4959Hi c4959Hi;
        long j3;
        long j4;
        boolean isErrorFatal = A0N(iOException);
        C4842Fl c4842Fl = this.A0U;
        c4959Hi = c5808Va.A03;
        j3 = c5808Va.A02;
        long j5 = this.A03;
        j4 = c5808Va.A00;
        c4842Fl.A0H(c4959Hi, 1, -1, null, 0, null, j3, j5, j, j2, j4, iOException, isErrorFatal);
        A0E(c5808Va);
        if (isErrorFatal) {
            return 3;
        }
        int A00 = A00();
        boolean z = A00 > this.A02;
        if (A0L(c5808Va, A00)) {
            return z ? 1 : 0;
        }
        return 2;
    }

    private long A02() {
        C5803VV[] c5803vvArr;
        long j = Long.MIN_VALUE;
        for (C5803VV c5803vv : this.A0K) {
            if (A0d[6].length() != 18) {
                throw new RuntimeException();
            }
            A0d[6] = "ZyGj31aUIwj7oXhThZ";
            j = Math.max(j, c5803vv.A0F());
        }
        return j;
    }

    public void A09() {
        C5803VV[] c5803vvArr;
        if (this.A0G || this.A0F || this.A07 == null || !this.A0H) {
            return;
        }
        for (C5803VV sampleQueue : this.A0K) {
            if (sampleQueue.A0G() == null) {
                return;
            }
        }
        this.A0Y.A01();
        int length = this.A0K.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        this.A0N = new boolean[length];
        this.A0L = new boolean[length];
        this.A0M = new boolean[length];
        this.A03 = this.A07.A6S();
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                Format A0G = this.A0K[i].A0G();
                trackGroupArr[i] = new TrackGroup(A0G);
                String str = A0G.A0O;
                if (!C5015Ic.A0B(str)) {
                    boolean A09 = C5015Ic.A09(str);
                    if (A0d[7].length() != 22) {
                        throw new RuntimeException();
                    }
                    A0d[4] = "sORkCePcQUNrHwPTmIu9z8sBJIN6eDJt";
                    if (!A09) {
                        z = false;
                    }
                }
                this.A0N[i] = z;
                boolean isAudioVideo = this.A0A;
                this.A0A = isAudioVideo | z;
                i++;
            } else {
                this.A09 = new TrackGroupArray(trackGroupArr);
                if (this.A0O == -1 && this.A05 == -1 && this.A07.A6S() == -9223372036854775807L) {
                    this.A00 = 6;
                }
                this.A0F = true;
                this.A0T.ACL(this.A03, this.A07.A8g());
                this.A08.ABw(this);
                return;
            }
        }
    }

    private void A0A() {
        C4959Hi c4959Hi;
        long j;
        C5808Va c5808Va = new C5808Va(this, this.A0Q, this.A0W, this.A0S, this.A0Y);
        if (this.A0F) {
            C4997IK.A04(A0I());
            long j2 = this.A03;
            if (j2 != -9223372036854775807L && this.A06 >= j2) {
                this.A0B = true;
                this.A06 = -9223372036854775807L;
                return;
            }
            c5808Va.A04(this.A07.A7O(this.A06).A00.A00, this.A06);
            this.A06 = -9223372036854775807L;
        }
        this.A02 = A00();
        long A04 = this.A0X.A04(c5808Va, this, this.A00);
        C4842Fl c4842Fl = this.A0U;
        c4959Hi = c5808Va.A03;
        j = c5808Va.A02;
        c4842Fl.A0E(c4959Hi, 1, -1, null, 0, null, j, this.A03, A04);
    }

    private void A0C(int i) {
        if (!this.A0M[i]) {
            Format A01 = this.A09.A01(i).A01(0);
            this.A0U.A06(C5015Ic.A01(A01.A0O), A01, 0, null, this.A04);
            this.A0M[i] = true;
        }
    }

    private void A0D(int i) {
        C5803VV[] c5803vvArr;
        if (!this.A0E || !this.A0N[i] || this.A0K[i].A0M()) {
            return;
        }
        this.A06 = 0L;
        this.A0E = false;
        this.A0D = true;
        this.A04 = 0L;
        this.A02 = 0;
        for (C5803VV sampleQueue : this.A0K) {
            sampleQueue.A0I();
        }
        this.A08.AAP(this);
    }

    private void A0E(C5808Va c5808Va) {
        long j;
        if (this.A05 != -1) {
            return;
        }
        j = c5808Va.A01;
        this.A05 = j;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4967Hq
    /* renamed from: A0F */
    public final void ABH(C5808Va c5808Va, long j, long j2) {
        C4959Hi c4959Hi;
        long j3;
        long j4;
        long largestQueuedTimestampUs;
        if (this.A03 == -9223372036854775807L) {
            long A02 = A02();
            if (A02 == Long.MIN_VALUE) {
                largestQueuedTimestampUs = 0;
            } else {
                largestQueuedTimestampUs = 10000 + A02;
            }
            this.A03 = largestQueuedTimestampUs;
            this.A0T.ACL(this.A03, this.A07.A8g());
        }
        C4842Fl c4842Fl = this.A0U;
        c4959Hi = c5808Va.A03;
        j3 = c5808Va.A02;
        long j5 = this.A03;
        j4 = c5808Va.A00;
        c4842Fl.A0G(c4959Hi, 1, -1, null, 0, null, j3, j5, j, j2, j4);
        A0E(c5808Va);
        this.A0B = true;
        this.A08.AAP(this);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4967Hq
    /* renamed from: A0G */
    public final void ABF(C5808Va c5808Va, long j, long j2, boolean z) {
        C4959Hi c4959Hi;
        long j3;
        long j4;
        C4842Fl c4842Fl = this.A0U;
        c4959Hi = c5808Va.A03;
        j3 = c5808Va.A02;
        long j5 = this.A03;
        j4 = c5808Va.A00;
        c4842Fl.A0F(c4959Hi, 1, -1, null, 0, null, j3, j5, j, j2, j4);
        if (!z) {
            A0E(c5808Va);
            for (C5803VV c5803vv : this.A0K) {
                c5803vv.A0I();
            }
            if (this.A01 > 0) {
                this.A08.AAP(this);
            }
        }
    }

    private boolean A0I() {
        return this.A06 != -9223372036854775807L;
    }

    private boolean A0J() {
        if (!this.A0D) {
            boolean A0I = A0I();
            if (A0d[4].charAt(6) == 'Y') {
                throw new RuntimeException();
            }
            A0d[7] = "wEe5Kid34hKwvsAXbAWEFW";
            if (!A0I) {
                return false;
            }
        }
        return true;
    }

    private boolean A0K(long j) {
        int length = this.A0K.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                return true;
            }
            C5803VV sampleQueue = this.A0K[i];
            sampleQueue.A0J();
            if ((sampleQueue.A0D(j, true, false) != -1) || (!this.A0N[i] && this.A0A)) {
                i++;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0031, code lost:
        if (r7 != (-9223372036854775807L)) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0L(com.facebook.ads.redexgen.p036X.C5808Va r10, int r11) {
        /*
            r9 = this;
            long r1 = r9.A05
            r6 = 1
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L33
            com.facebook.ads.redexgen.X.Cl r0 = r9.A07
            if (r0 == 0) goto L3c
            long r7 = r0.A6S()
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C4644CE.A0d
            r0 = 5
            r1 = r2[r0]
            r0 = 0
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L36
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C4644CE.A0d
            java.lang.String r1 = "Q0rpoNhjqPePbxzXOOIqRvZr1JNrttpQ"
            r0 = 4
            r2[r0] = r1
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto L3c
        L33:
            r9.A02 = r11
            return r6
        L36:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L3c:
            boolean r0 = r9.A0F
            r5 = 0
            if (r0 == 0) goto L65
            boolean r0 = r9.A0J()
            if (r0 != 0) goto L65
            r9.A0E = r6
            java.lang.String[] r1 = com.facebook.ads.redexgen.p036X.C4644CE.A0d
            r0 = 4
            r1 = r1[r0]
            r0 = 6
            char r1 = r1.charAt(r0)
            r0 = 89
            if (r1 == r0) goto L5f
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C4644CE.A0d
            java.lang.String r1 = "yM"
            r0 = 2
            r2[r0] = r1
            return r5
        L5f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L65:
            boolean r0 = r9.A0F
            r9.A0D = r0
            r2 = 0
            r9.A04 = r2
            r9.A02 = r5
            com.facebook.ads.redexgen.X.VV[] r4 = r9.A0K
            int r1 = r4.length
        L72:
            if (r5 >= r1) goto L7c
            r0 = r4[r5]
            r0.A0I()
            int r5 = r5 + 1
            goto L72
        L7c:
            r10.A04(r2, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4644CE.A0L(com.facebook.ads.redexgen.X.Va, int):boolean");
    }

    public static boolean A0N(IOException iOException) {
        return iOException instanceof C5801VT;
    }

    public final int A0O(int skipCount, long j) {
        int A0D;
        if (A0J()) {
            return 0;
        }
        C5803VV c5803vv = this.A0K[skipCount];
        if (this.A0B && j > c5803vv.A0F()) {
            A0D = c5803vv.A0A();
        } else {
            A0D = c5803vv.A0D(j, true, true);
            if (A0D == -1) {
                A0D = 0;
            }
        }
        if (A0D > 0) {
            A0C(skipCount);
        } else {
            A0D(skipCount);
        }
        return A0D;
    }

    public final int A0P(int i, C4541AZ c4541az, C5895X2 c5895x2, boolean z) {
        if (A0J()) {
            return -3;
        }
        C5803VV c5803vv = this.A0K[i];
        boolean z2 = this.A0B;
        long j = this.A04;
        if (A0d[6].length() != 18) {
            throw new RuntimeException();
        }
        A0d[4] = "BZZhA5HnQ267vlJC28K7sY9wv6QGzHwf";
        int A0E = c5803vv.A0E(c4541az, c5895x2, z, z2, j);
        if (A0E == -4) {
            A0C(i);
        } else if (A0E == -3) {
            A0D(i);
        }
        return A0E;
    }

    public final void A0Q() throws IOException {
        this.A0X.A06(this.A00);
    }

    public final void A0R() {
        if (this.A0F) {
            for (C5803VV c5803vv : this.A0K) {
                c5803vv.A0H();
            }
        }
        this.A0X.A07(this);
        this.A0R.removeCallbacksAndMessages(null);
        this.A08 = null;
        this.A0G = true;
        this.A0U.A04();
    }

    public final boolean A0S(int i) {
        return !A0J() && (this.A0B || this.A0K[i].A0M());
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5804VW
    public final boolean A4A(long j) {
        if (this.A0B || this.A0E) {
            return false;
        }
        if (this.A0F) {
            int i = this.A01;
            if (A0d[4].charAt(6) == 'Y') {
                throw new RuntimeException();
            }
            A0d[4] = "7rVHsGRdVZCry1KpVG9eopTEFKGRMHdR";
            if (i == 0) {
                return false;
            }
        }
        boolean A02 = this.A0Y.A02();
        if (!this.A0X.A08()) {
            A0A();
            String[] strArr = A0d;
            if (strArr[5].length() != strArr[0].length()) {
                A0d[4] = "GZZ8Yg3MT0LKLUTCQO9quz1OXrB3914Q";
                return true;
            }
            A0d[4] = "KAHjzw5ailzTQNPlHwAo2zZrrjfyTj4F";
            return false;
        }
        return A02;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5804VW
    public final void A4p(long j, boolean z) {
        int length = this.A0K.length;
        for (int i = 0; i < length; i++) {
            this.A0K[i].A0K(j, z, this.A0L[i]);
        }
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4660Ce
    public final void A5D() {
        this.A0H = true;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5804VW
    public final long A5e(long j, C4565Ax c4565Ax) {
        if (!this.A07.A8g()) {
            return 0L;
        }
        C4666Ck A7O = this.A07.A7O(j);
        return C5038Iz.A0I(j, c4565Ax, A7O.A00.A01, A7O.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5804VW
    public final long A5t() {
        long A02;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        if (A0I()) {
            long j = this.A06;
            if (A0d[6].length() == 18) {
                A0d[4] = "v1DtQTmxA3FTsqocwnKPSJWZapJDPMlv";
                return j;
            }
        } else {
            if (this.A0A) {
                A02 = Long.MAX_VALUE;
                if (A0d[6].length() == 18) {
                    A0d[7] = "vaKypmx8P8ApWe5d9yUSyn";
                    int length = this.A0K.length;
                    for (int i = 0; i < length; i++) {
                        if (this.A0N[i]) {
                            C5803VV c5803vv = this.A0K[i];
                            String[] strArr = A0d;
                            if (strArr[5].length() == strArr[0].length()) {
                                throw new RuntimeException();
                            }
                            A0d[7] = "ClOx81htkGLxdwhy5PY2qE";
                            A02 = Math.min(A02, c5803vv.A0F());
                        }
                    }
                }
            } else {
                A02 = A02();
            }
            if (A02 == Long.MIN_VALUE) {
                return this.A04;
            }
            return A02;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5804VW
    public final long A71() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A5t();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5804VW
    public final TrackGroupArray A7h() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5804VW
    public final void A9Y() throws IOException {
        A0Q();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4970Ht
    public final void ABM() {
        for (C5803VV c5803vv : this.A0K) {
            c5803vv.A0I();
        }
        this.A0S.A03();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4851Fu
    public final void ACe(Format format) {
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5804VW
    public final void ADG(InterfaceC5805VX interfaceC5805VX, long j) {
        this.A08 = interfaceC5805VX;
        this.A0Y.A02();
        A0A();
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5804VW
    public final long ADb() {
        if (!this.A0C) {
            this.A0U.A05();
            this.A0C = true;
        }
        if (this.A0D) {
            if (this.A0B || A00() > this.A02) {
                this.A0D = false;
                return this.A04;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5804VW
    public final void ADi(long j) {
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4660Ce
    public final void AEM(InterfaceC4667Cl interfaceC4667Cl) {
        this.A07 = interfaceC4667Cl;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5804VW
    public final long AEP(long j) {
        C5803VV[] c5803vvArr;
        if (!this.A07.A8g()) {
            j = 0;
        }
        this.A04 = j;
        this.A0D = false;
        if (!A0I() && A0K(j)) {
            return j;
        }
        this.A0E = false;
        this.A06 = j;
        this.A0B = false;
        if (this.A0X.A08()) {
            this.A0X.A05();
        } else {
            for (C5803VV sampleQueue : this.A0K) {
                sampleQueue.A0I();
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x0108, code lost:
        if (r8.A08() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x010a, code lost:
        r4 = r12.A0K;
        r3 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x010d, code lost:
        if (r7 >= r3) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x010f, code lost:
        r4[r7].A0H();
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0122, code lost:
        if (r8.A08() != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0125, code lost:
        r4 = r12.A0K;
        r3 = r4.length;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0128, code lost:
        if (r7 >= r3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x012a, code lost:
        r4[r7].A0I();
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x015e, code lost:
        r12.A0X.A05();
     */
    @Override // com.facebook.ads.redexgen.p036X.InterfaceC5804VW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long AEQ(com.facebook.ads.redexgen.p036X.InterfaceC4941HQ[] r13, boolean[] r14, com.facebook.ads.redexgen.p036X.InterfaceC4852Fv[] r15, boolean[] r16, long r17) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4644CE.AEQ(com.facebook.ads.redexgen.X.HQ[], boolean[], com.facebook.ads.redexgen.X.Fv[], boolean[], long):long");
    }

    @Override // com.facebook.ads.redexgen.p036X.InterfaceC4660Ce
    public final InterfaceC4670Co AFD(int i, int i2) {
        int length = this.A0K.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (this.A0J[i3] == i) {
                return this.A0K[i3];
            }
        }
        C5803VV c5803vv = new C5803VV(this.A0V);
        c5803vv.A0L(this);
        this.A0J = Arrays.copyOf(this.A0J, length + 1);
        this.A0J[length] = i;
        this.A0K = (C5803VV[]) Arrays.copyOf(this.A0K, length + 1);
        this.A0K[length] = c5803vv;
        return c5803vv;
    }
}
