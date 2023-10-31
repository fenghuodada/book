package com.facebook.ads.redexgen.p036X;

import android.util.Pair;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Ae */
/* loaded from: assets/audience_network.dex */
public final class C4546Ae {
    public static String[] A0C = {"L0u3smBC6U6OaYtXppAd31iOC3v5Qhxz", "mD", "DMmTpdJrujAgbmCwwmXMokmpSOB8XVVu", "Fa0SCWKpXCwAFqaC3HE", "LFAAfAeIJjtENyizMXbJJCIXxkMYQ2BS", "EOXOixXcPNGoqbhwUMphXmxbz6TL9K", "ydRMenJrqCbsHYuDZ17G4nGASKkEf2si", "4zZeHgY0eMzISLpxtPc37pmrQXWGSxn"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public C4544Ac A04;
    public C4544Ac A05;
    public C4544Ac A06;
    public AbstractC4569B1 A07;
    public Object A08;
    public boolean A09;
    public final C4567Az A0A = new C4567Az();
    public final C4568B0 A0B = new C4568B0();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C4545Ad A02(int i, long j, long j2) {
        C4829FY c4829fy = new C4829FY(i, j2);
        this.A07.A09(c4829fy.A02, this.A0A);
        int A04 = this.A0A.A04(j);
        long A09 = A04 == -1 ? Long.MIN_VALUE : this.A0A.A09(A04);
        boolean A0A = A0A(c4829fy, A09);
        return new C4545Ad(c4829fy, j, A09, -9223372036854775807L, A09 == Long.MIN_VALUE ? this.A0A.A07() : A09, A0A, A0B(c4829fy, A0A));
    }

    private long A00(int i) {
        int oldFrontPeriodIndex;
        Object obj = this.A07.A0A(i, this.A0A, true).A03;
        int i2 = this.A0A.A00;
        Object obj2 = this.A08;
        if (obj2 != null && (oldFrontPeriodIndex = this.A07.A04(obj2)) != -1) {
            int oldFrontWindowIndex = this.A07.A09(oldFrontPeriodIndex, this.A0A).A00;
            if (oldFrontWindowIndex == i2) {
                return this.A03;
            }
        }
        for (C4544Ac A0E = A0E(); A0E != null; A0E = A0E.A01) {
            if (A0E.A09.equals(obj)) {
                return A0E.A02.A04.A03;
            }
        }
        for (C4544Ac A0E2 = A0E(); A0E2 != null; A0E2 = A0E2.A01) {
            int A04 = this.A07.A04(A0E2.A09);
            if (A04 != -1) {
                int holderWindowIndex = this.A07.A09(A04, this.A0A).A00;
                if (holderWindowIndex == i2) {
                    return A0E2.A02.A04.A03;
                }
            }
        }
        long j = this.A02;
        this.A02 = 1 + j;
        return j;
    }

    private C4545Ad A01(int i, int i2, int i3, long durationUs, long j) {
        long j2;
        C4829FY c4829fy = new C4829FY(i, i2, i3, j);
        boolean A0A = A0A(c4829fy, Long.MIN_VALUE);
        boolean A0B = A0B(c4829fy, A0A);
        long A0A2 = this.A07.A09(c4829fy.A02, this.A0A).A0A(c4829fy.A00, c4829fy.A01);
        if (i3 == this.A0A.A02(i2)) {
            j2 = this.A0A.A06();
        } else {
            j2 = 0;
        }
        return new C4545Ad(c4829fy, j2, Long.MIN_VALUE, durationUs, A0A2, A0A, A0B);
    }

    @Nullable
    private C4545Ad A03(C4544Ac c4544Ac, long j) {
        long j2;
        C4545Ad c4545Ad = c4544Ac.A02;
        if (c4545Ad.A06) {
            int A03 = this.A07.A03(c4545Ad.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            if (A03 == -1) {
                return null;
            }
            int i = this.A07.A0A(A03, this.A0A, true).A00;
            Object obj = this.A0A.A03;
            long j3 = c4545Ad.A04.A03;
            if (this.A07.A0B(i, this.A0B).A00 == A03) {
                long windowSequenceNumber = c4544Ac.A07();
                Pair<Integer, Long> A08 = this.A07.A08(this.A0B, this.A0A, i, -9223372036854775807L, Math.max(0L, (windowSequenceNumber + c4545Ad.A01) - j));
                if (A08 == null) {
                    return null;
                }
                Object nextPeriodUid = A08.first;
                A03 = ((Integer) nextPeriodUid).intValue();
                Object nextPeriodUid2 = A08.second;
                j2 = ((Long) nextPeriodUid2).longValue();
                Object nextPeriodUid3 = c4544Ac.A01;
                if (nextPeriodUid3 != null && c4544Ac.A01.A09.equals(obj)) {
                    j3 = c4544Ac.A01.A02.A04.A03;
                } else {
                    j3 = this.A02;
                    long startPositionUs = j3 + 1;
                    this.A02 = startPositionUs;
                }
            } else {
                j2 = 0;
            }
            return A06(A07(A03, j2, j3), j2, j2);
        }
        C4829FY currentPeriodId = c4545Ad.A04;
        this.A07.A09(currentPeriodId.A02, this.A0A);
        if (currentPeriodId.A01()) {
            int adGroupIndex = currentPeriodId.A00;
            int A01 = this.A0A.A01(adGroupIndex);
            if (A01 == -1) {
                return null;
            }
            int adCountInCurrentAdGroup = this.A0A.A03(adGroupIndex, currentPeriodId.A01);
            if (adCountInCurrentAdGroup < A01) {
                if (!this.A0A.A0E(adGroupIndex, adCountInCurrentAdGroup)) {
                    return null;
                }
                return A01(currentPeriodId.A02, adGroupIndex, adCountInCurrentAdGroup, c4545Ad.A00, currentPeriodId.A03);
            }
            return A02(currentPeriodId.A02, c4545Ad.A00, currentPeriodId.A03);
        }
        long j4 = c4545Ad.A02;
        if (A0C[6].charAt(23) != 'A') {
            throw new RuntimeException();
        }
        A0C[1] = "6G";
        if (j4 != Long.MIN_VALUE) {
            int A05 = this.A0A.A05(c4545Ad.A02);
            if (A05 == -1) {
                return A02(currentPeriodId.A02, c4545Ad.A02, currentPeriodId.A03);
            }
            int A02 = this.A0A.A02(A05);
            if (!this.A0A.A0E(A05, A02)) {
                return null;
            }
            return A01(currentPeriodId.A02, A05, A02, c4545Ad.A02, currentPeriodId.A03);
        }
        int A00 = this.A0A.A00();
        if (A00 == 0) {
            return null;
        }
        int i2 = A00 - 1;
        if (this.A0A.A09(i2) != Long.MIN_VALUE || this.A0A.A0D(i2)) {
            return null;
        }
        int adGroupCount = this.A0A.A02(i2);
        if (!this.A0A.A0E(i2, adGroupCount)) {
            return null;
        }
        long A07 = this.A0A.A07();
        int i3 = currentPeriodId.A02;
        long contentDurationUs = currentPeriodId.A03;
        return A01(i3, i2, adGroupCount, A07, contentDurationUs);
    }

    private C4545Ad A04(C4545Ad c4545Ad, C4829FY c4829fy) {
        long A07;
        long j = c4545Ad.A03;
        long endPositionUs = c4545Ad.A02;
        boolean A0A = A0A(c4829fy, endPositionUs);
        boolean A0B = A0B(c4829fy, A0A);
        this.A07.A09(c4829fy.A02, this.A0A);
        boolean isLastInPeriod = c4829fy.A01();
        if (isLastInPeriod) {
            A07 = this.A0A.A0A(c4829fy.A00, c4829fy.A01);
        } else if (A0C[2].charAt(30) != 'V') {
            throw new RuntimeException();
        } else {
            A0C[2] = "zTzAUiYM1BrQqeObFTyCKDEgqKKR2HVC";
            A07 = endPositionUs == Long.MIN_VALUE ? this.A0A.A07() : endPositionUs;
        }
        return new C4545Ad(c4829fy, j, endPositionUs, c4545Ad.A00, A07, A0A, A0B);
    }

    private C4545Ad A05(C4548Ag c4548Ag) {
        return A06(c4548Ag.A04, c4548Ag.A01, c4548Ag.A02);
    }

    private C4545Ad A06(C4829FY c4829fy, long j, long j2) {
        this.A07.A09(c4829fy.A02, this.A0A);
        if (c4829fy.A01()) {
            if (!this.A0A.A0E(c4829fy.A00, c4829fy.A01)) {
                return null;
            }
            return A01(c4829fy.A02, c4829fy.A00, c4829fy.A01, j, c4829fy.A03);
        }
        return A02(c4829fy.A02, j2, c4829fy.A03);
    }

    private C4829FY A07(int i, long j, long j2) {
        this.A07.A09(i, this.A0A);
        int A05 = this.A0A.A05(j);
        if (A05 == -1) {
            return new C4829FY(i, j2);
        }
        return new C4829FY(i, A05, this.A0A.A02(A05), j2);
    }

    private boolean A08() {
        C4544Ac A0E = A0E();
        if (A0E == null) {
            return true;
        }
        while (true) {
            int A03 = this.A07.A03(A0E.A02.A04.A02, this.A0A, this.A0B, this.A01, this.A09);
            while (A0E.A01 != null && !A0E.A02.A06) {
                A0E = A0E.A01;
            }
            if (A03 == -1 || A0E.A01 == null || A0E.A01.A02.A04.A02 != A03) {
                break;
            }
            A0E = A0E.A01;
        }
        boolean A0S = A0S(A0E);
        A0E.A02 = A04(A0E.A02, A0E.A02.A04);
        if (A0S) {
            boolean A0P = A0P();
            if (A0C[7].length() != 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0C;
            strArr[3] = "GuDKwHudSgXHMcEdzJg";
            strArr[5] = "TrxgVcYEVqGsLQMDNrMk5TDxlvQhmk";
            return !A0P;
        }
        return true;
    }

    private boolean A09(C4544Ac c4544Ac, C4545Ad c4545Ad) {
        C4545Ad c4545Ad2 = c4544Ac.A02;
        return c4545Ad2.A03 == c4545Ad.A03 && c4545Ad2.A02 == c4545Ad.A02 && c4545Ad2.A04.equals(c4545Ad.A04);
    }

    private boolean A0A(C4829FY c4829fy, long j) {
        int A00 = this.A07.A09(c4829fy.A02, this.A0A).A00();
        if (A00 == 0) {
            return true;
        }
        int i = A00 - 1;
        boolean A01 = c4829fy.A01();
        if (this.A0A.A09(i) != Long.MIN_VALUE) {
            return !A01 && j == Long.MIN_VALUE;
        }
        int postrollAdCount = this.A0A.A01(i);
        if (postrollAdCount == -1) {
            return false;
        }
        if (A01 && c4829fy.A00 == i && c4829fy.A01 == postrollAdCount + (-1)) {
            return true;
        }
        return !A01 && this.A0A.A02(i) == postrollAdCount;
    }

    private boolean A0B(C4829FY c4829fy, boolean z) {
        return !this.A07.A0B(this.A07.A09(c4829fy.A02, this.A0A).A00, this.A0B).A08 && this.A07.A0F(c4829fy.A02, this.A0A, this.A0B, this.A01, this.A09) && z;
    }

    public final C4544Ac A0C() {
        C4544Ac c4544Ac = this.A05;
        if (c4544Ac != null) {
            if (c4544Ac == this.A06) {
                this.A06 = c4544Ac.A01;
            }
            this.A05.A0D();
            this.A00--;
            if (this.A00 == 0) {
                this.A04 = null;
                this.A08 = this.A05.A09;
                this.A03 = this.A05.A02.A04.A03;
            }
            this.A05 = this.A05.A01;
        } else {
            C4544Ac c4544Ac2 = this.A04;
            this.A05 = c4544Ac2;
            this.A06 = c4544Ac2;
        }
        return this.A05;
    }

    public final C4544Ac A0D() {
        C4544Ac c4544Ac = this.A06;
        C4997IK.A04((c4544Ac == null || c4544Ac.A01 == null) ? false : true);
        if (A0C[7].length() != 31) {
            throw new RuntimeException();
        }
        String[] strArr = A0C;
        strArr[4] = "7koWfuH1ta1EVLUWQFGgmnLKJoN2uwxl";
        strArr[0] = "1LlHzPavDhI1SmiN1gPMgWkfsuEkohyV";
        this.A06 = this.A06.A01;
        return this.A06;
    }

    public final C4544Ac A0E() {
        return A0P() ? this.A05 : this.A04;
    }

    public final C4544Ac A0F() {
        return this.A04;
    }

    public final C4544Ac A0G() {
        return this.A05;
    }

    public final C4544Ac A0H() {
        return this.A06;
    }

    @Nullable
    public final C4545Ad A0I(long j, C4548Ag c4548Ag) {
        C4544Ac c4544Ac = this.A04;
        if (c4544Ac == null) {
            return A05(c4548Ag);
        }
        return A03(c4544Ac, j);
    }

    public final C4545Ad A0J(C4545Ad c4545Ad, int i) {
        return A04(c4545Ad, c4545Ad.A04.A00(i));
    }

    public final InterfaceC5804VW A0K(InterfaceC4562Au[] interfaceC4562AuArr, AbstractC4944HT abstractC4944HT, InterfaceC4947HW interfaceC4947HW, InterfaceC4831Fa interfaceC4831Fa, Object obj, C4545Ad c4545Ad) {
        long A07;
        C4544Ac c4544Ac = this.A04;
        if (c4544Ac != null) {
            A07 = c4544Ac.A07() + this.A04.A02.A01;
        } else {
            A07 = c4545Ad.A03;
        }
        C4544Ac c4544Ac2 = new C4544Ac(interfaceC4562AuArr, A07, abstractC4944HT, interfaceC4947HW, interfaceC4831Fa, obj, c4545Ad);
        if (this.A04 != null) {
            C4997IK.A04(A0P());
            this.A04.A01 = c4544Ac2;
        }
        this.A08 = null;
        this.A04 = c4544Ac2;
        this.A00++;
        return c4544Ac2.A08;
    }

    public final C4829FY A0L(int i, long j) {
        return A07(i, j, A00(i));
    }

    public final void A0M(long j) {
        C4544Ac c4544Ac = this.A04;
        if (c4544Ac != null) {
            c4544Ac.A0G(j);
        }
    }

    public final void A0N(AbstractC4569B1 abstractC4569B1) {
        this.A07 = abstractC4569B1;
    }

    public final void A0O(boolean z) {
        C4544Ac A0E = A0E();
        if (A0E != null) {
            this.A08 = z ? A0E.A09 : null;
            this.A03 = A0E.A02.A04.A03;
            A0E.A0D();
            A0S(A0E);
        } else if (!z) {
            this.A08 = null;
        }
        this.A05 = null;
        this.A04 = null;
        this.A06 = null;
        this.A00 = 0;
    }

    public final boolean A0P() {
        return this.A05 != null;
    }

    public final boolean A0Q() {
        C4544Ac c4544Ac = this.A04;
        return c4544Ac == null || (!c4544Ac.A02.A05 && this.A04.A0H() && this.A04.A02.A01 != -9223372036854775807L && this.A00 < 100);
    }

    public final boolean A0R(int i) {
        this.A01 = i;
        return A08();
    }

    public final boolean A0S(C4544Ac c4544Ac) {
        C4997IK.A04(c4544Ac != null);
        boolean z = false;
        this.A04 = c4544Ac;
        while (c4544Ac.A01 != null) {
            c4544Ac = c4544Ac.A01;
            if (c4544Ac == this.A06) {
                this.A06 = this.A05;
                z = true;
            }
            c4544Ac.A0D();
            this.A00--;
        }
        this.A04.A01 = null;
        return z;
    }

    public final boolean A0T(InterfaceC5804VW interfaceC5804VW) {
        C4544Ac c4544Ac = this.A04;
        return c4544Ac != null && c4544Ac.A08 == interfaceC5804VW;
    }

    public final boolean A0U(C4829FY c4829fy, long j) {
        int i = c4829fy.A02;
        C4544Ac c4544Ac = null;
        for (C4544Ac A0E = A0E(); A0E != null; A0E = A0E.A01) {
            if (c4544Ac == null) {
                A0E.A02 = A0J(A0E.A02, i);
            } else {
                if (i != -1) {
                    Object obj = A0E.A09;
                    if (A0C[2].charAt(30) != 'V') {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0C;
                    strArr[4] = "cRCq0i1JCmFgPvSHr0NI30IAvGtOkPUO";
                    strArr[0] = "aqPjT6JpLbsnsfh6iIpVbm4IivKwupA2";
                    if (obj.equals(this.A07.A0A(i, this.A0A, true).A03)) {
                        C4545Ad A03 = A03(c4544Ac, j);
                        if (A03 == null) {
                            return true ^ A0S(c4544Ac);
                        }
                        A0E.A02 = A0J(A0E.A02, i);
                        if (!A09(A0E, A03)) {
                            return true ^ A0S(c4544Ac);
                        }
                    }
                }
                return true ^ A0S(c4544Ac);
            }
            if (A0E.A02.A06) {
                i = this.A07.A03(i, this.A0A, this.A0B, this.A01, this.A09);
            }
            c4544Ac = A0E;
        }
        return true;
    }

    public final boolean A0V(boolean z) {
        this.A09 = z;
        return A08();
    }
}
