package com.facebook.ads.redexgen.p036X;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.FA */
/* loaded from: assets/audience_network.dex */
public final class C4805FA extends AbstractC6198bv {
    public static String[] A02 = {"C44Ajl3kvJruV1G0pt7gVRuztfjSJyFq", "J5x5lFquh7whloqA7FngbvBzLsCb", "NWBvU5bW0Pue", "3", "BTAVkHunqM91yRRN2KcoYuZCergWfboL", "2NY5ANPTvwBPWrnTgdotgLNYCmp8", "bg7eF9CjngMlwdFplTojabi", "lLeEucKPPYu6Z0yxrpg2o1MG4v3W39r2"};
    @Nullable
    public AbstractC41634D A00;
    @Nullable
    public AbstractC41634D A01;

    private int A00(@NonNull AbstractC41794T abstractC41794T, @NonNull View view, AbstractC41634D abstractC41634D) {
        int A06;
        int A0F = abstractC41634D.A0F(view) + (abstractC41634D.A0D(view) / 2);
        if (abstractC41794T.A1X()) {
            A06 = abstractC41634D.A0A() + (abstractC41634D.A0B() / 2);
        } else {
            A06 = abstractC41634D.A06() / 2;
        }
        return A0F - A06;
    }

    @Nullable
    private View A01(AbstractC41794T abstractC41794T, AbstractC41634D abstractC41634D) {
        int A06;
        int absClosest = abstractC41794T.A0W();
        if (absClosest == 0) {
            return null;
        }
        View child = null;
        if (abstractC41794T.A1X()) {
            int A0A = abstractC41634D.A0A();
            int A0B = abstractC41634D.A0B();
            if (A02[3].length() != 1) {
                throw new RuntimeException();
            }
            A02[4] = "QSrTWOl4jyYASaYHeqwJw7nAVlZS9nVf";
            A06 = A0A + (A0B / 2);
        } else {
            A06 = abstractC41634D.A06() / 2;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < absClosest; i2++) {
            View A0t = abstractC41794T.A0t(i2);
            int A0F = abstractC41634D.A0F(A0t);
            int i3 = abstractC41634D.A0D(A0t);
            int childCenter = Math.abs((A0F + (i3 / 2)) - A06);
            if (childCenter < i) {
                i = childCenter;
                child = A0t;
            }
        }
        return child;
    }

    @Nullable
    private View A02(AbstractC41794T abstractC41794T, AbstractC41634D abstractC41634D) {
        int i = abstractC41794T.A0W();
        if (i == 0) {
            return null;
        }
        View view = null;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < i; i3++) {
            View A0t = abstractC41794T.A0t(i3);
            int A0F = abstractC41634D.A0F(A0t);
            if (A0F < i2) {
                i2 = A0F;
                int childStart = A02[3].length();
                if (childStart != 1) {
                    throw new RuntimeException();
                }
                A02[3] = "0";
                view = A0t;
            }
        }
        return view;
    }

    @NonNull
    private AbstractC41634D A03(@NonNull AbstractC41794T abstractC41794T) {
        AbstractC41634D abstractC41634D = this.A00;
        if (abstractC41634D == null || abstractC41634D.A02 != abstractC41794T) {
            this.A00 = AbstractC41634D.A00(abstractC41794T);
        }
        return this.A00;
    }

    @NonNull
    private AbstractC41634D A04(@NonNull AbstractC41794T abstractC41794T) {
        AbstractC41634D abstractC41634D = this.A01;
        if (abstractC41634D == null || abstractC41634D.A02 != abstractC41794T) {
            this.A01 = AbstractC41634D.A01(abstractC41794T);
        }
        return this.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
        if (r4 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
        if (r4.x < 0.0f) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        if (r4.y >= 0.0f) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
        r5 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009c, code lost:
        if (r4 != null) goto L23;
     */
    @Override // com.facebook.ads.redexgen.p036X.AbstractC6198bv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A0C(com.facebook.ads.redexgen.p036X.AbstractC41794T r10, int r11, int r12) {
        /*
            r9 = this;
            int r8 = r10.A0Z()
            r4 = -1
            if (r8 != 0) goto L8
            return r4
        L8:
            r1 = 0
            boolean r0 = r10.A25()
            if (r0 == 0) goto L1a
            com.facebook.ads.redexgen.X.4D r0 = r9.A04(r10)
            android.view.View r1 = r9.A02(r10, r0)
        L17:
            if (r1 != 0) goto L42
            return r4
        L1a:
            boolean r0 = r10.A24()
            if (r0 == 0) goto L17
            com.facebook.ads.redexgen.X.4D r3 = r9.A03(r10)
            java.lang.String[] r1 = com.facebook.ads.redexgen.p036X.C4805FA.A02
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L36
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L36:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C4805FA.A02
            java.lang.String r1 = "gb7KateBwDTMhlVKT6fWGE4qrSBelOuo"
            r0 = 4
            r2[r0] = r1
            android.view.View r1 = r9.A02(r10, r3)
            goto L17
        L42:
            int r3 = r10.A0p(r1)
            if (r3 != r4) goto L49
            return r4
        L49:
            boolean r0 = r10.A24()
            r7 = 0
            if (r0 == 0) goto La1
            if (r11 <= 0) goto L9f
            r6 = 1
        L53:
            r5 = 0
            boolean r0 = r10 instanceof com.facebook.ads.redexgen.p036X.InterfaceC41914f
            if (r0 == 0) goto L89
            com.facebook.ads.redexgen.X.4f r10 = (com.facebook.ads.redexgen.p036X.InterfaceC41914f) r10
            int r0 = r8 + (-1)
            android.graphics.PointF r4 = r10.A45(r0)
            java.lang.String[] r1 = com.facebook.ads.redexgen.p036X.C4805FA.A02
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 1
            if (r1 == r0) goto L95
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C4805FA.A02
            java.lang.String r1 = "yuw4mNpzW34AqVSRehlxNeo"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "wkUUhZpWZ02e"
            r0 = 2
            r2[r0] = r1
            if (r4 == 0) goto L89
        L7a:
            float r0 = r4.x
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L87
            float r0 = r4.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L88
        L87:
            r7 = 1
        L88:
            r5 = r7
        L89:
            if (r5 == 0) goto L90
            if (r6 == 0) goto L8f
            int r3 = r3 + (-1)
        L8f:
            return r3
        L90:
            if (r6 == 0) goto L8f
            int r3 = r3 + 1
            goto L8f
        L95:
            java.lang.String[] r2 = com.facebook.ads.redexgen.p036X.C4805FA.A02
            java.lang.String r1 = "mSLQWLSJnMsLfeZB8hd0gvJZQvTgwPgU"
            r0 = 0
            r2[r0] = r1
            if (r4 == 0) goto L89
            goto L7a
        L9f:
            r6 = 0
            goto L53
        La1:
            if (r12 <= 0) goto La5
            r6 = 1
            goto L53
        La5:
            r6 = 0
            goto L53
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C4805FA.A0C(com.facebook.ads.redexgen.X.4T, int, int):int");
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6198bv
    @Nullable
    public final View A0D(AbstractC41794T abstractC41794T) {
        if (abstractC41794T.A25()) {
            return A01(abstractC41794T, A04(abstractC41794T));
        }
        if (abstractC41794T.A24()) {
            return A01(abstractC41794T, A03(abstractC41794T));
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6198bv
    public final C6212cA A0E(AbstractC41794T abstractC41794T) {
        if (!(abstractC41794T instanceof InterfaceC41914f)) {
            return null;
        }
        return new C4806FB(this, super.A00.getContext());
    }

    @Override // com.facebook.ads.redexgen.p036X.AbstractC6198bv
    @Nullable
    public final int[] A0H(@NonNull AbstractC41794T abstractC41794T, @NonNull View view) {
        int[] iArr = new int[2];
        if (abstractC41794T.A24()) {
            iArr[0] = A00(abstractC41794T, view, A03(abstractC41794T));
        } else {
            iArr[0] = 0;
        }
        boolean A25 = abstractC41794T.A25();
        String[] strArr = A02;
        if (strArr[1].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        A02[0] = "E62MX6H1I4NpqQbgkpQnwXfK7jhgOp7C";
        if (A25) {
            iArr[1] = A00(abstractC41794T, view, A04(abstractC41794T));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
