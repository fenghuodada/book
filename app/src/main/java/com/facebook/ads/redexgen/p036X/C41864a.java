package com.facebook.ads.redexgen.p036X;

import android.util.SparseArray;
import java.util.ArrayList;

/* renamed from: com.facebook.ads.redexgen.X.4a */
/* loaded from: assets/audience_network.dex */
public class C41864a {
    public static String[] A02 = {"hO0SXlIn7n5HXEBLx", "jESNVpuYnHPlnh4DZ", "CDLwN7DwmtArlNd144q1QIOvLDqs4yZF", "JntNhgZ58kYFXbwiJ6hzeVdvPNGn00kF", "yTsWpbzmHeCmcQEDkb0QkT5J3TV6CkfD", "Lh9pded4Clz2", "gnDNjs3GBImfOnnM5uEQWokXBd1c", "C4tnEN178k9sL9bIxtVolUttiI5dEdE5"};
    public SparseArray<C41854Z> A00 = new SparseArray<>();
    public int A01 = 0;

    private final long A00(long j, long j2) {
        if (j == 0) {
            return j2;
        }
        long j3 = j / 4;
        String[] strArr = A02;
        if (strArr[3].charAt(9) != strArr[7].charAt(9)) {
            throw new RuntimeException();
        }
        A02[4] = "GTVZcsVJP0WVKaHbsMtSVk9gu6Gyk4Ss";
        return (j3 * 3) + (j2 / 4);
    }

    private C41854Z A01(int i) {
        C41854Z c41854z = this.A00.get(i);
        if (c41854z == null) {
            C41854Z c41854z2 = new C41854Z();
            this.A00.put(i, c41854z2);
            return c41854z2;
        }
        return c41854z;
    }

    private final void A02() {
        for (int i = 0; i < this.A00.size(); i++) {
            this.A00.valueAt(i).A03.clear();
        }
    }

    public final AbstractC41974l A03(int i) {
        C41854Z c41854z = this.A00.get(i);
        if (c41854z != null && !c41854z.A03.isEmpty()) {
            ArrayList<AbstractC41974l> arrayList = c41854z.A03;
            if (A02[4].charAt(1) != 'T') {
                throw new RuntimeException();
            }
            A02[6] = "6zOEmNGiTAHU1v9SGa3";
            return arrayList.remove(arrayList.size() - 1);
        }
        return null;
    }

    public final void A04() {
        this.A01--;
    }

    public final void A05(int i, long j) {
        C41854Z A01 = A01(i);
        A01.A01 = A00(A01.A01, j);
    }

    public final void A06(int i, long j) {
        C41854Z A01 = A01(i);
        A01.A02 = A00(A01.A02, j);
    }

    public final void A07(AbstractC41674H abstractC41674H) {
        this.A01++;
    }

    public final void A08(AbstractC41674H abstractC41674H, AbstractC41674H abstractC41674H2, boolean z) {
        if (abstractC41674H != null) {
            A04();
        }
        if (!z && this.A01 == 0) {
            A02();
        }
        if (abstractC41674H2 != null) {
            A07(abstractC41674H2);
        }
    }

    public final void A09(AbstractC41974l abstractC41974l) {
        int A0H = abstractC41974l.A0H();
        ArrayList<AbstractC41974l> arrayList = A01(A0H).A03;
        if (this.A00.get(A0H).A00 <= arrayList.size()) {
            return;
        }
        abstractC41974l.A0Q();
        String[] strArr = A02;
        if (strArr[3].charAt(9) != strArr[7].charAt(9)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "TnDeXYrDbfmyODeGX";
        strArr2[5] = "ziritv0xfrad";
        arrayList.add(abstractC41974l);
    }

    public final boolean A0A(int i, long j, long j2) {
        long j3 = A01(i).A01;
        return j3 == 0 || j + j3 < j2;
    }

    public final boolean A0B(int i, long j, long j2) {
        long j3 = A01(i).A02;
        return j3 == 0 || j + j3 < j2;
    }
}
