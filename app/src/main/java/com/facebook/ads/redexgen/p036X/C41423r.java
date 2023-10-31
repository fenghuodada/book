package com.facebook.ads.redexgen.p036X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.3r */
/* loaded from: assets/audience_network.dex */
public final class C41423r {
    public static byte[] A03;
    public static String[] A04 = {"QoGKHhEqLDc7cPbroRD", "LQzzwNJ4o6QHlfYkxXGOUA5ejYw8qpDj", "6ipC3ASGLl4rMOedI", "OPBJh0aCf", "l4bQelOwEyQeTpTSi", "DWBJmVB67PV4ItRyT2e9caL16z1NK91I", "0G1mJvoVA", "nRnK55wdJbrp31Rh0MWe0TNMbF4aeg8Y"};
    public final InterfaceC41413q A01;
    public final C41403p A00 = new C41403p();
    public final List<View> A02 = new ArrayList();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 78);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        if (A04[5].charAt(2) != 'B') {
            throw new RuntimeException();
        }
        A04[1] = "YzFnrN17WwgSKMGcQI3u7PJ5Pdf81qGi";
        A03 = new byte[]{-81, -93, -21, -20, -25, -25, -24, -15, -93, -17, -20, -10, -9, -67, -23, -25, -18, -34, -29, -36, -107, -23, -28, -107, -22, -29, -35, -34, -39, -38, -107, -42, -107, -21, -34, -38, -20, -107, -23, -35, -42, -23, -107, -20, -42, -24, -107, -29, -28, -23, -107, -35, -34, -39, -39, -38, -29, -35, -48, -52, -34, -121, -48, -38, -121, -43, -42, -37, -121, -56, -121, -54, -49, -48, -45, -53, -109, -121, -54, -56, -43, -43, -42, -37, -121, -49, -48, -53, -52, -121};
    }

    static {
        A02();
    }

    public C41423r(InterfaceC41413q interfaceC41413q) {
        this.A01 = interfaceC41413q;
    }

    private int A00(int limit) {
        if (limit < 0) {
            return -1;
        }
        int A60 = this.A01.A60();
        int i = limit;
        while (i < A60) {
            int removedBefore = limit - (i - this.A00.A03(i));
            if (removedBefore == 0) {
                while (this.A00.A08(i)) {
                    i++;
                }
                return i;
            }
            i += removedBefore;
        }
        return -1;
    }

    private void A03(View view) {
        this.A02.add(view);
        this.A01.AAh(view);
    }

    private boolean A04(View view) {
        if (this.A02.remove(view)) {
            this.A01.ABD(view);
            return true;
        }
        return false;
    }

    public final int A05() {
        return this.A01.A60() - this.A02.size();
    }

    public final int A06() {
        return this.A01.A60();
    }

    public final int A07(View view) {
        int A8H = this.A01.A8H(view);
        if (A8H == -1 || this.A00.A08(A8H)) {
            return -1;
        }
        return A8H - this.A00.A03(A8H);
    }

    public final View A08(int i) {
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.A02.get(i2);
            AbstractC41974l A63 = this.A01.A63(view);
            if (A63.A0I() == i && !A63.A0b() && !A63.A0c()) {
                return view;
            }
        }
        return null;
    }

    public final View A09(int i) {
        return this.A01.A5z(A00(i));
    }

    public final View A0A(int i) {
        return this.A01.A5z(i);
    }

    public final void A0B() {
        this.A00.A04();
        for (int size = this.A02.size() - 1; size >= 0; size--) {
            this.A01.ABD(this.A02.get(size));
            this.A02.remove(size);
        }
        this.A01.ADu();
    }

    public final void A0C(int i) {
        int A00 = A00(i);
        this.A00.A09(A00);
        this.A01.A4m(A00);
    }

    public final void A0D(int i) {
        int A00 = A00(i);
        View A5z = this.A01.A5z(A00);
        if (A5z == null) {
            return;
        }
        if (this.A00.A09(A00)) {
            A04(A5z);
        }
        this.A01.ADy(A00);
        if (A04[4].length() == 16) {
            throw new RuntimeException();
        }
        A04[7] = "KJlsfCUfVwwQNNRDjM0AzdkkAy1m1QjD";
    }

    public final void A0E(View view) {
        int A8H = this.A01.A8H(view);
        if (A8H >= 0) {
            this.A00.A06(A8H);
            A03(view);
            return;
        }
        throw new IllegalArgumentException(A01(57, 33, 25) + view);
    }

    public final void A0F(View view) {
        int A8H = this.A01.A8H(view);
        if (A8H < 0) {
            return;
        }
        if (this.A00.A09(A8H)) {
            A04(view);
        }
        this.A01.ADy(A8H);
    }

    public final void A0G(View view) {
        int A8H = this.A01.A8H(view);
        if (A8H >= 0) {
            if (this.A00.A08(A8H)) {
                this.A00.A05(A8H);
                A04(view);
                return;
            }
            throw new RuntimeException(A01(14, 43, 39) + view);
        }
        throw new IllegalArgumentException(A01(57, 33, 25) + view);
    }

    public final void A0H(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int A00;
        if (i < 0) {
            A00 = this.A01.A60();
        } else {
            A00 = A00(i);
        }
        C41403p c41403p = this.A00;
        if (A04[5].charAt(2) != 'B') {
            throw new RuntimeException();
        }
        A04[1] = "KHr0McsaN13zWmBdzhmfm62h5mt8zSB0";
        c41403p.A07(A00, z);
        if (z) {
            A03(view);
        }
        this.A01.A3T(view, A00, layoutParams);
    }

    public final void A0I(View view, int i, boolean z) {
        int A00;
        if (i < 0) {
            A00 = this.A01.A60();
        } else {
            A00 = A00(i);
        }
        this.A00.A07(A00, z);
        if (z) {
            A03(view);
        }
        this.A01.addView(view, A00);
    }

    public final void A0J(View view, boolean z) {
        A0I(view, -1, z);
    }

    public final boolean A0K(View view) {
        return this.A02.contains(view);
    }

    public final boolean A0L(View view) {
        int A8H = this.A01.A8H(view);
        if (A8H == -1) {
            A04(view);
            if (A04[5].charAt(2) != 'B') {
                throw new RuntimeException();
            }
            A04[0] = "HipCYWSrBpzIS13Odtj";
            return true;
        } else if (this.A00.A08(A8H)) {
            this.A00.A09(A8H);
            A04(view);
            this.A01.ADy(A8H);
            return true;
        } else {
            return false;
        }
    }

    public final String toString() {
        return this.A00.toString() + A01(0, 14, 53) + this.A02.size();
    }
}
