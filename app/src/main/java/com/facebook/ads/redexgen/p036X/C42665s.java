package com.facebook.ads.redexgen.p036X;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.5s */
/* loaded from: assets/audience_network.dex */
public final class C42665s {
    public static byte[] A00;
    public static String[] A01 = {"zJ7sRo3sU3MwvYkxVq5sKXU", "uwqdBBQkb", "sk1pAaPClwmr1DZFuM4XEVJDjMgj4luU", "2DEAuAVf", "LM1sVeBw6DNfIdZzIYsj5hqYQDPEhJFy", "hYSBjzGCwuKpFZFqojmwIwdxMJLMCyYz", "BWOi5Qn34m6VEGTMmYfzcDYeX0GTjOOy", "rscTiGR64sMWr7IEiXLU0M2EjoTwZlLg"};
    public static final AtomicReference<C42645q> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-98, -90, -95, -100, -84, -77, -94, -81, -81, -90, -95, -94, -95, -97, -88, -97, -84, -93, -99, -20, -25, -23, -28, -30, -14, -7, -24, -11, -11, -20, -25, -24};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 68));
    }

    public static C42645q A00() {
        C42645q c42645q = A02.get();
        if (A01[6].charAt(15) == 'M') {
            String[] strArr = A01;
            strArr[3] = "GQnQs3ZS";
            strArr[1] = "yTwJu7KeR";
            C42645q c42645q2 = c42645q;
            if (c42645q2 == null) {
                C42645q A002 = C42645q.A00();
                String[] strArr2 = A01;
                if (strArr2[3].length() != strArr2[1].length()) {
                    A01[0] = "yvynwBtI7EoQ7kGRkYf58OE";
                    return A002;
                }
            } else {
                return c42645q2;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L2;
     */
    @androidx.annotation.Nullable
    @android.annotation.SuppressLint({"CatchGeneralException"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.p036X.C42645q A01(com.facebook.ads.redexgen.p036X.C44148U r5, com.facebook.ads.redexgen.p036X.C42645q r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L28
        Lc:
            com.facebook.ads.redexgen.X.5q r0 = com.facebook.ads.redexgen.p036X.C42715y.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.8y r5 = r5.A06()
            int r4 = com.facebook.ads.redexgen.p036X.C44458z.A1Q
            com.facebook.ads.redexgen.X.90 r3 = new com.facebook.ads.redexgen.X.90
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 6
            java.lang.String r0 = A04(r2, r1, r0)
            r5.A8y(r0, r4, r3)
        L28:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C42665s.A01(com.facebook.ads.redexgen.X.8U, com.facebook.ads.redexgen.X.5q):com.facebook.ads.redexgen.X.5q");
    }

    @Nullable
    @SuppressLint({"CatchGeneralException"})
    public static C42645q A02(C44148U c44148u, C42645q c42645q, C42655r c42655r) {
        C42675t c42675t = null;
        try {
            if (C5063JQ.A06(c44148u) && (c42645q == null || TextUtils.isEmpty(c42645q.A03()))) {
                c42675t = C42685u.A00(c44148u.getContentResolver());
            }
        } catch (Throwable th) {
            c44148u.A06().A8y(A04(12, 7, 6), C44458z.A1S, new C444690(th));
        }
        if (c42675t != null && c42675t.A01 != null) {
            A03.set(c42675t.A01);
            c42655r.A05(c42675t.A01);
        }
        if (c42645q == null && c42675t != null && !TextUtils.isEmpty(c42675t.A00)) {
            return new C42645q(c42675t.A00, c42675t.A02, EnumC42635p.A05);
        }
        return c42645q;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 68);
        }
        return attributionId;
    }

    public static void A06(C42655r c42655r) {
        A02.set(c42655r.A02());
        A03.set(c42655r.A03());
    }

    @SuppressLint({"CatchGeneralException"})
    public static void A07(C44148U c44148u) {
        long j;
        C42645q upToDateAdInfo;
        try {
            C42655r c42655r = new C42655r(c44148u);
            A06(c42655r);
            if (A08()) {
                return;
            }
            C42645q c42645q = A02.get();
            if (c42645q != null && !TextUtils.isEmpty(c42645q.A03())) {
                j = c42645q.A01();
            } else {
                j = -1;
            }
            if (j > 0 && System.currentTimeMillis() - j < C5063JQ.A00(c44148u)) {
                return;
            }
            if (C5063JQ.A07(c44148u)) {
                upToDateAdInfo = A01(c44148u, A02(c44148u, null, c42655r));
            } else {
                upToDateAdInfo = A02(c44148u, A01(c44148u, null), c42655r);
            }
            if (upToDateAdInfo != null && !TextUtils.isEmpty(upToDateAdInfo.A03())) {
                A02.set(upToDateAdInfo);
                c42655r.A04(upToDateAdInfo);
            }
        } catch (Throwable th) {
            c44148u.A06().A8y(A04(12, 7, 6), C44458z.A1R, new C444690(th));
        }
    }

    public static boolean A08() {
        boolean updated = false;
        if (C5193Lc.A04()) {
            if (A01[0].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "OqjdKmMb";
            strArr[1] = "Sbvi0a9C0";
            String A04 = A04(0, 12, 9);
            if (C5193Lc.A05(A04)) {
                A03.set(C5193Lc.A01(A04));
                updated = true;
            }
        }
        boolean A042 = C5193Lc.A04();
        String[] strArr2 = A01;
        if (strArr2[5].charAt(29) != strArr2[4].charAt(29)) {
            A01[6] = "1QSggKSi3jrfAw1MbHCsavUz8mNGSj1M";
            if (!A042) {
                return updated;
            }
        } else {
            A01[6] = "SqTb5lTJEle7YRZML8ItyxwGEN07wws1";
            if (!A042) {
                return updated;
            }
        }
        String A043 = A04(19, 13, 79);
        if (C5193Lc.A05(A043)) {
            String A012 = C5193Lc.A01(A043);
            AtomicReference<C42645q> atomicReference = A02;
            if (A012 == null) {
                A012 = A04(0, 0, 68);
            }
            atomicReference.set(new C42645q(A012, false, EnumC42635p.A04));
            return true;
        }
        return updated;
    }
}
