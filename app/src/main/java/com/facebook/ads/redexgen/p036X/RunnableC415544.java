package com.facebook.ads.redexgen.p036X;

import android.view.View;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.ads.redexgen.X.44 */
/* loaded from: assets/audience_network.dex */
public final class RunnableC415544 implements Runnable {
    public static Comparator<C415443> A04;
    public static byte[] A05;
    public static String[] A06 = {"C", "g", "thIgEQWd9nx", "UJ", "nKFIv9xSQBz", "WKzZJ6F0j2u08DpGCnjDR9E", "2Nt4JwZoKXCf4OpJNcF1oxTto7W5gJbD", "RW"};
    public static final ThreadLocal<RunnableC415544> A07;
    public long A00;
    public long A01;
    public ArrayList<C4804F9> A02 = new ArrayList<>();
    public ArrayList<C415443> A03 = new ArrayList<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 8);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A05 = new byte[]{97, 101, 47, 93, 116, -126, -125, 116, 115, 47, 95, -127, 116, 117, 116, -125, 114, 119, 92, 96, 42, 90, 124, 111, 112, 111, 126, 109, 114};
    }

    static {
        A03();
        A07 = new ThreadLocal<>();
        A04 = new Comparator<C415443>() { // from class: com.facebook.ads.redexgen.X.42
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.Comparator
            /* renamed from: A00 */
            public final int compare(C415443 c415443, C415443 c4154432) {
                if ((c415443.A03 == null) != (c4154432.A03 == null)) {
                    return c415443.A03 == null ? 1 : -1;
                } else if (c415443.A04 != c4154432.A04) {
                    return c415443.A04 ? -1 : 1;
                } else {
                    int i = c4154432.A02 - c415443.A02;
                    if (i != 0) {
                        return i;
                    }
                    int i2 = c415443.A00 - c4154432.A00;
                    if (i2 != 0) {
                        return i2;
                    }
                    return 0;
                }
            }
        };
    }

    private AbstractC41974l A00(C4804F9 c4804f9, int i, long j) {
        if (A08(c4804f9, i)) {
            return null;
        }
        C41874b c41874b = c4804f9.A0r;
        try {
            c4804f9.A1L();
            AbstractC41974l A0I = c41874b.A0I(i, false, j);
            if (A0I != null) {
                if (A0I.A0a() && !A0I.A0b()) {
                    c41874b.A0X(A0I.A0H);
                } else {
                    c41874b.A0d(A0I, false);
                }
            }
            return A0I;
        } finally {
            c4804f9.A1q(false);
        }
    }

    private void A02() {
        C415443 task;
        int i = this.A02.size();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            C4804F9 c4804f9 = this.A02.get(i3);
            int totalTaskCount = c4804f9.getWindowVisibility();
            if (totalTaskCount == 0) {
                c4804f9.A02.A04(c4804f9, false);
                int totalTaskCount2 = c4804f9.A02.A00;
                i2 += totalTaskCount2;
            }
        }
        this.A03.ensureCapacity(i2);
        int i4 = 0;
        String[] strArr = A06;
        String str = strArr[3];
        String str2 = strArr[7];
        int length = str.length();
        int totalTaskCount3 = str2.length();
        if (length != totalTaskCount3) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[3] = "OH";
        strArr2[7] = "7S";
        for (int i5 = 0; i5 < i; i5++) {
            C4804F9 c4804f92 = this.A02.get(i5);
            int totalTaskCount4 = c4804f92.getWindowVisibility();
            if (totalTaskCount4 == 0) {
                C6214cC c6214cC = c4804f92.A02;
                int abs = Math.abs(c6214cC.A01) + Math.abs(c6214cC.A02);
                for (int i6 = 0; i6 < c6214cC.A00 * 2; i6 += 2) {
                    if (i4 >= this.A03.size()) {
                        task = new C415443();
                        this.A03.add(task);
                    } else {
                        task = this.A03.get(i4);
                    }
                    int j = i6 + 1;
                    int i7 = c6214cC.A03[j];
                    task.A04 = i7 <= abs;
                    task.A02 = abs;
                    task.A00 = i7;
                    task.A03 = c4804f92;
                    int j2 = c6214cC.A03[i6];
                    task.A01 = j2;
                    i4++;
                }
            }
        }
        Collections.sort(this.A03, A04);
    }

    private void A04(long j) {
        for (int i = 0; i < this.A03.size(); i++) {
            C415443 c415443 = this.A03.get(i);
            if (c415443.A03 == null) {
                return;
            }
            A06(c415443, j);
            c415443.A00();
        }
    }

    private final void A05(long j) {
        A02();
        A04(j);
    }

    private void A06(C415443 c415443, long j) {
        AbstractC41974l A00 = A00(c415443.A03, c415443.A01, c415443.A04 ? Long.MAX_VALUE : j);
        if (A00 != null && A00.A09 != null && A00.A0a() && !A00.A0b()) {
            A07(A00.A09.get(), j);
        }
    }

    private void A07(@Nullable C4804F9 c4804f9, long j) {
        if (c4804f9 == null) {
            return;
        }
        if (c4804f9.A0C) {
            C41423r c41423r = c4804f9.A01;
            if (A06[5].length() != 17) {
                A06[6] = "t2x0aSlbBonOFe0N5m1ttILNz4IaYpUW";
                if (c41423r.A06() != 0) {
                    c4804f9.A1O();
                }
            }
            throw new RuntimeException();
        }
        C6214cC c6214cC = c4804f9.A02;
        c6214cC.A04(c4804f9, true);
        if (c6214cC.A00 != 0) {
            try {
                C40602V.A01(A01(0, 18, 7));
                c4804f9.A0s.A05(c4804f9.A04);
                int i = 0;
                while (true) {
                    int i2 = c6214cC.A00 * 2;
                    if (A06[6].charAt(8) == 'I') {
                        break;
                    }
                    String[] strArr = A06;
                    strArr[3] = "nG";
                    strArr[7] = "TD";
                    if (i < i2) {
                        A00(c4804f9, c6214cC.A03[i], j);
                        i += 2;
                    } else {
                        return;
                    }
                }
                throw new RuntimeException();
            } finally {
                C40602V.A00();
            }
        }
    }

    public static boolean A08(C4804F9 c4804f9, int i) {
        int A062 = c4804f9.A01.A06();
        for (int i2 = 0; i2 < A062; i2++) {
            View attachedView = c4804f9.A01.A0A(i2);
            AbstractC41974l A0G = C4804F9.A0G(attachedView);
            if (A0G.A03 == i && !A0G.A0b()) {
                return true;
            }
        }
        return false;
    }

    public final void A09(C4804F9 c4804f9) {
        this.A02.add(c4804f9);
    }

    public final void A0A(C4804F9 c4804f9) {
        this.A02.remove(c4804f9);
    }

    public final void A0B(C4804F9 c4804f9, int i, int i2) {
        if (c4804f9.isAttachedToWindow() && this.A01 == 0) {
            this.A01 = c4804f9.getNanoTime();
            c4804f9.post(this);
        }
        c4804f9.A02.A03(i, i2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            C40602V.A01(A01(18, 11, 2));
            if (this.A02.isEmpty()) {
                return;
            }
            int size = this.A02.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                C4804F9 c4804f9 = this.A02.get(i);
                int i2 = c4804f9.getWindowVisibility();
                if (i2 == 0) {
                    j = Math.max(c4804f9.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.A01 = 0L;
                if (A06[5].length() == 17) {
                    throw new RuntimeException();
                }
                A06[5] = "H4nD1dOrFb1";
                C40602V.A00();
                return;
            }
            long latestFrameVsyncMs = TimeUnit.MILLISECONDS.toNanos(j);
            A05(latestFrameVsyncMs + this.A00);
        } finally {
            this.A01 = 0L;
            C40602V.A00();
        }
    }
}
