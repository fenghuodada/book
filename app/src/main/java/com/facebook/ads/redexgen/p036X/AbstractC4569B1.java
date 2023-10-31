package com.facebook.ads.redexgen.p036X;

import android.util.Pair;

/* renamed from: com.facebook.ads.redexgen.X.B1 */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC4569B1 {
    public static String[] A00 = {"jU13W9NSebta1ZmimveRwiImSwvynw8G", "bR9yhpeYgYLfxjGn405sIF1CLUaNKRNv", "y6GS60dgSiOKDJGhj3wt9T6pcdF3KRzS", "kAdv6lw0fV2hZ8Ef8nLl5eDcrpXJ", "gDoO0sRHxUPo6SrSL989dqr7yWBZykVP", "xoqdGlgoaRmw7wZuwViSR5WxyeJjGGpo", "tn8QhSSQsmhaZqBgPW05rXLjjsf9pF2E", "LT5aPkpwV7"};
    public static final AbstractC4569B1 A01 = new C5907XE();

    public abstract int A00();

    public abstract int A01();

    public abstract int A04(Object obj);

    public abstract C4567Az A0A(int i, C4567Az c4567Az, boolean z);

    public abstract C4568B0 A0D(int i, C4568B0 c4568b0, boolean z, long j);

    public int A02(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == A06(z)) {
                return -1;
            }
            return i + 1;
        } else if (i2 != 1) {
            if (i2 == 2) {
                if (i == A06(z)) {
                    return A05(z);
                }
                return i + 1;
            }
            throw new IllegalStateException();
        } else {
            return i;
        }
    }

    public final int A03(int nextWindowIndex, C4567Az c4567Az, C4568B0 c4568b0, int i, boolean z) {
        int i2 = A09(nextWindowIndex, c4567Az).A00;
        if (A0B(i2, c4568b0).A01 == nextWindowIndex) {
            int A02 = A02(i2, i, z);
            if (A02 == -1) {
                return -1;
            }
            return A0B(A02, c4568b0).A00;
        }
        return nextWindowIndex + 1;
    }

    public int A05(boolean z) {
        return A0E() ? -1 : 0;
    }

    public int A06(boolean z) {
        if (A0E()) {
            return -1;
        }
        return A01() - 1;
    }

    public final Pair<Integer, Long> A07(C4568B0 c4568b0, C4567Az c4567Az, int i, long j) {
        return A08(c4568b0, c4567Az, i, j, 0L);
    }

    public final Pair<Integer, Long> A08(C4568B0 c4568b0, C4567Az c4567Az, int i, long j, long j2) {
        C4997IK.A00(i, 0, A01());
        A0D(i, c4568b0, false, j2);
        if (j == -9223372036854775807L) {
            j = c4568b0.A01();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = c4568b0.A00;
        long A03 = c4568b0.A03() + j;
        long A07 = A09(i2, c4567Az).A07();
        while (A07 != -9223372036854775807L) {
            int i3 = (A03 > A07 ? 1 : (A03 == A07 ? 0 : -1));
            if (A00[7].length() == 24) {
                throw new RuntimeException();
            }
            A00[7] = "t4u2YUU8OEdoMFYJ2jQWzxX4wha";
            if (i3 < 0 || i2 >= c4568b0.A01) {
                break;
            }
            A03 -= A07;
            i2++;
            A07 = A09(i2, c4567Az).A07();
        }
        return Pair.create(Integer.valueOf(i2), Long.valueOf(A03));
    }

    public final C4567Az A09(int i, C4567Az c4567Az) {
        return A0A(i, c4567Az, false);
    }

    public final C4568B0 A0B(int i, C4568B0 c4568b0) {
        return A0C(i, c4568b0, false);
    }

    public final C4568B0 A0C(int i, C4568B0 c4568b0, boolean z) {
        return A0D(i, c4568b0, z, 0L);
    }

    public final boolean A0E() {
        return A01() == 0;
    }

    public final boolean A0F(int i, C4567Az c4567Az, C4568B0 c4568b0, int i2, boolean z) {
        return A03(i, c4567Az, c4568b0, i2, z) == -1;
    }
}
