package com.facebook.ads.redexgen.p036X;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* renamed from: com.facebook.ads.redexgen.X.4b */
/* loaded from: assets/audience_network.dex */
public final class C41874b {
    public static byte[] A09;
    public static String[] A0A = {"ulA9tMpXJ0Fgz3L6", "kmBp6JcSqPlb9eogqvbvj6g5ppHVaWSS", "klPqAM4BpBJNr6xIOjiQhoS6UO4TrOHS", "7VyM9GgXJuu8YzSYQI3HrMroeBYRJajD", "jF2bnw6E6wYHKm8plX11kYiLrSAbSJmD", "6pBnRch9VxXRPJwtqH0gd323b09mKXXU", "Clk2oRExhn8z5HC1wWkAqM8aEwWEfAA8", "Myq33IQdIYqIzBMhSJhfspyke76FBM0c"};
    public C41864a A01;
    public AbstractC41954j A04;
    public final /* synthetic */ C4804F9 A08;
    public final ArrayList<AbstractC41974l> A05 = new ArrayList<>();
    public ArrayList<AbstractC41974l> A02 = null;
    public final ArrayList<AbstractC41974l> A06 = new ArrayList<>();
    public final List<AbstractC41974l> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 58);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{-91, -18, -8, -58, -7, -7, -26, -24, -19, -22, -23, -65, -59, -32, 39, 30, 30, 43, 29, 44, -14, -53, -48, -62, -21, 22, 7, 15, -62, 5, 17, 23, 16, 22, -36, -38, -33, 36, 37, 18, 37, 22, -21, -99, -69, -58, -58, -65, -66, 122, -51, -67, -52, -69, -54, 122, -48, -61, -65, -47, 122, -47, -61, -50, -62, 122, -69, -56, 122, -61, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -120, 122, -93, -56, -48, -69, -58, -61, -66, 122, -48, -61, -65, -47, -51, 122, -67, -69, -56, -56, -55, -50, 122, -68, -65, 122, -52, -65, -49, -51, -65, -66, 122, -64, -52, -55, -57, 122, -51, -67, -52, -69, -54, -122, 122, -50, -62, -65, -45, 122, -51, -62, -55, -49, -58, -66, 122, -52, -65, -68, -55, -49, -56, -66, 122, -64, -52, -55, -57, 122, -52, -65, -67, -45, -67, -58, -65, -52, 122, -54, -55, -55, -58, -120, -7, 30, 19, 31, 30, 35, 25, 35, 36, 21, 30, 19, 41, -48, 20, 21, 36, 21, 19, 36, 21, 20, -34, -48, -7, 30, 38, 17, 28, 25, 20, -48, 25, 36, 21, 29, -48, 32, 31, 35, 25, 36, 25, 31, 30, -48, -13, 24, 13, 25, 24, 29, 19, 29, 30, 15, 24, 13, 35, -54, 14, 15, 30, 15, 13, 30, 15, 14, -40, -54, -13, 24, 32, 11, 22, 19, 14, -54, 32, 19, 15, 33, -54, 18, 25, 22, 14, 15, 28, -54, 11, 14, 11, 26, 30, 15, 28, -54, 26, 25, 29, 19, 30, 19, 25, 24, -125, -88, -80, -101, -90, -93, -98, 90, -93, -82, -97, -89, 90, -86, -87, -83, -93, -82, -93, -87, -88, 90, -63, -47, -32, -49, -34, -34, -45, -46, -114, -35, -32, -114, -49, -30, -30, -49, -47, -42, -45, -46, -114, -28, -41, -45, -27, -31, -114, -37, -49, -25, -114, -36, -35, -30, -114, -48, -45, -114, -32, -45, -47, -25, -47, -38, -45, -46, -100, -114, -41, -31, -63, -47, -32, -49, -34, -88, -35, -10, -7, -87, -19, -18, -3, -22, -20, -15, -18, -19, -87, -1, -14, -18, 0, -87, -4, -15, -8, -2, -11, -19, -87, -21, -18, -87, -5, -18, -10, -8, -1, -18, -19, -87, -17, -5, -8, -10, -87, -37, -18, -20, 2, -20, -11, -18, -5, -33, -14, -18, 0, -87, -21, -18, -17, -8, -5, -18, -87, -14, -3, -87, -20, -22, -9, -87, -21, -18, -87, -5, -18, -20, 2, -20, -11, -18, -19, -61, -87, -102, -72, -65, -81, -76, -83, 102, -70, -75, 102, -72, -85, -87, -65, -87, -78, -85, 102, -89, -76, 102, -81, -83, -76, -75, -72, -85, -86, 102, -68, -81, -85, -67, 102, -82, -75, -78, -86, -85, -72, 116, 102, -97, -75, -69, 102, -71, -82, -75, -69, -78, -86, 102, -84, -81, -72, -71, -70, 102, -87, -89, -78, -78, 102, -71, -70, -75, -74, -113, -83, -76, -75, -72, -81, -76, -83, -100, -81, -85, -67, 110, -68, -81, -85, -67, 111, 102, -88, -85, -84, -75, -72, -85, 102, -87, -89, -78, -78, -81, -76, -83, 102, -72, -85, -87, -65, -87, -78, -85, 116, -19, -21, -6, -36, -17, -21, -3, -52, -11, -8, -42, -11, -7, -17, -6, -17, -11, -12, -57, -12, -22, -38, -1, -10, -21, -90, -8, -21, -6, -5, -8, -12, -21, -22, -90, -25, -90, -4, -17, -21, -3, -90, -6, -18, -25, -6, -90, -17, -7, -90, -17, -19, -12, -11, -8, -21, -22, -76, -90, -33, -11, -5, -90, -13, -5, -7, -6, -90, -23, -25, -14, -14, -90, -7, -6, -11, -10, -49, -19, -12, -11, -8, -17, -12, -19, -90, -24, -21, -20, -11, -8, -21, -90, -8, -21, -6, -5, -8, -12, -17, -12, -19, -90, -6, -18, -17, -7, -90, -4, -17, -21, -3, -76, -78, -80, -65, -95, -76, -80, -62, -111, -70, -67, -101, -70, -66, -76, -65, -76, -70, -71, -116, -71, -81, -97, -60, -69, -80, 107, -67, -80, -65, -64, -67, -71, -80, -81, 107, -84, 107, -63, -76, -80, -62, 107, -62, -77, -76, -82, -77, 107, -81, -70, -80, -66, 107, -71, -70, -65, 107, -77, -84, -63, -80, 107, -84, 107, -95, -76, -80, -62, -109, -70, -73, -81, -80, -67, -63, -74, -50, -60, -54, -55, 117, -66, -61, -71, -70, -51, 117, -56, -67, -60, -54, -63, -71, 117, -61, -60, -55, 117, -73, -70, 117, -126, -122, 117, -74, -69, -55, -70, -57, 117, -54, -61, -67, -66, -71, -66, -61, -68, 117, -74, 117, -53, -66, -70, -52, -113, -25, -26, -50, -31, -35, -17, -54, -35, -37, -15, -37, -28, -35, -36};
    }

    static {
        A05();
    }

    public C41874b(C4804F9 c4804f9) {
        this.A08 = c4804f9;
    }

    private final View A00(int i, boolean z) {
        return A0I(i, z, Long.MAX_VALUE).A0H;
    }

    private final AbstractC41974l A01(int i) {
        int size;
        int A0D;
        ArrayList<AbstractC41974l> arrayList = this.A02;
        if (arrayList == null || (size = arrayList.size()) == 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC41974l abstractC41974l = this.A02.get(i2);
            if (!abstractC41974l.A0i() && abstractC41974l.A0I() == i) {
                abstractC41974l.A0T(32);
                return abstractC41974l;
            }
        }
        if (this.A08.A04.A0B() && (A0D = this.A08.A00.A0D(i)) > 0 && A0D < this.A08.A04.A0D()) {
            long A04 = this.A08.A04.A04(A0D);
            for (int i3 = 0; i3 < size; i3++) {
                AbstractC41974l abstractC41974l2 = this.A02.get(i3);
                if (!abstractC41974l2.A0i() && abstractC41974l2.A0K() == A04) {
                    abstractC41974l2.A0T(32);
                    return abstractC41974l2;
                }
            }
        }
        return null;
    }

    private final AbstractC41974l A02(int cacheSize, boolean z) {
        View A08;
        int size = this.A05.size();
        for (int i = 0; i < size; i++) {
            AbstractC41974l abstractC41974l = this.A05.get(i);
            if (!abstractC41974l.A0i() && abstractC41974l.A0I() == cacheSize && !abstractC41974l.A0b() && (this.A08.A0s.A09 || !abstractC41974l.A0c())) {
                abstractC41974l.A0T(32);
                return abstractC41974l;
            }
        }
        if (!z && (A08 = this.A08.A01.A08(cacheSize)) != null) {
            AbstractC41974l A0G = C4804F9.A0G(A08);
            this.A08.A01.A0G(A08);
            int A07 = this.A08.A01.A07(A08);
            if (A07 != -1) {
                this.A08.A01.A0C(A07);
                A0W(A08);
                A0G.A0T(8224);
                return A0G;
            }
            throw new IllegalStateException(A04(727, 52, 27) + A0G + this.A08.A1I());
        }
        int size2 = this.A06.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AbstractC41974l abstractC41974l2 = this.A06.get(i2);
            if (!abstractC41974l2.A0b() && abstractC41974l2.A0I() == cacheSize) {
                if (!z) {
                    this.A06.remove(i2);
                }
                return abstractC41974l2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
        throw new java.lang.RuntimeException();
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.facebook.ads.redexgen.p036X.AbstractC41974l A03(long r8, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C41874b.A03(long, int, boolean):com.facebook.ads.redexgen.X.4l");
    }

    private final void A06() {
        boolean z;
        for (int i = this.A06.size() - 1; i >= 0; i--) {
            A07(i);
        }
        this.A06.clear();
        z = C4804F9.A1E;
        if (z) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i) {
        A0d(this.A06.get(i), true);
        this.A06.remove(i);
    }

    private void A08(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                String[] strArr = A0A;
                if (strArr[7].charAt(8) == strArr[6].charAt(8)) {
                    throw new RuntimeException();
                }
                A0A[4] = "0ZJbYELQTNKw4GYvMFOIJ2JFgvUoupt2";
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
            return;
        }
        int visibility = viewGroup.getVisibility();
        viewGroup.setVisibility(4);
        viewGroup.setVisibility(visibility);
    }

    private void A09(AbstractC41974l abstractC41974l) {
        if (this.A08.A1s()) {
            View view = abstractC41974l.A0H;
            if (C409838.A00(view) == 0) {
                C409838.A09(view, 1);
            }
            if (!C409838.A0F(view)) {
                abstractC41974l.A0T(Http2.INITIAL_MAX_FRAME_SIZE);
                C409838.A0B(view, this.A08.A09.A0A());
            }
        }
    }

    private void A0A(AbstractC41974l abstractC41974l) {
        if (abstractC41974l.A0H instanceof ViewGroup) {
            A08((ViewGroup) abstractC41974l.A0H, false);
        }
    }

    private final void A0B(AbstractC41974l abstractC41974l) {
        if (this.A08.A07 != null) {
            throw new NullPointerException(A04(779, 14, 62));
        }
        AbstractC41674H abstractC41674H = this.A08.A04;
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(abstractC41974l);
        }
    }

    private final boolean A0C(AbstractC41974l abstractC41974l) {
        if (abstractC41974l.A0c()) {
            return this.A08.A0s.A07();
        }
        if (abstractC41974l.A03 >= 0 && abstractC41974l.A03 < this.A08.A04.A0D()) {
            if (this.A08.A0s.A07() || this.A08.A04.A03(abstractC41974l.A03) == abstractC41974l.A0H()) {
                return !this.A08.A04.A0B() || abstractC41974l.A0K() == this.A08.A04.A04(abstractC41974l.A03);
            }
            return false;
        }
        throw new IndexOutOfBoundsException(A04(211, 60, 112) + abstractC41974l + this.A08.A1I());
    }

    private boolean A0D(AbstractC41974l abstractC41974l, int i, int i2, long j) {
        abstractC41974l.A08 = this.A08;
        int A0H = abstractC41974l.A0H();
        long nanoTime = this.A08.getNanoTime();
        if (j != Long.MAX_VALUE) {
            C41864a c41864a = this.A01;
            String[] strArr = A0A;
            if (strArr[5].charAt(0) == strArr[3].charAt(0)) {
                throw new RuntimeException();
            }
            A0A[0] = "We3abAYlnqMpJzTP";
            if (!c41864a.A0A(A0H, nanoTime, j)) {
                return false;
            }
        }
        this.A08.A04.A0A(abstractC41974l, i);
        this.A01.A05(abstractC41974l.A0H(), this.A08.getNanoTime() - nanoTime);
        A09(abstractC41974l);
        if (this.A08.A0s.A07()) {
            abstractC41974l.A04 = i2;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i) {
        return this.A05.get(i).A0H;
    }

    public final View A0G(int i) {
        return A00(i, false);
    }

    public final C41864a A0H() {
        if (this.A01 == null) {
            this.A01 = new C41864a();
        }
        return this.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0245  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.p036X.AbstractC41974l A0I(int r21, boolean r22, long r23) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C41874b.A0I(int, boolean, long):com.facebook.ads.redexgen.X.4l");
    }

    public final List<AbstractC41974l> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A0M();
        }
        int i2 = this.A05.size();
        for (int i3 = 0; i3 < i2; i3++) {
            this.A05.get(i3).A0M();
        }
        ArrayList<AbstractC41974l> arrayList = this.A02;
        String[] strArr = A0A;
        String str = strArr[2];
        String str2 = strArr[1];
        int charAt = str.charAt(0);
        int scrapCount = str2.charAt(0);
        if (charAt != scrapCount) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[7] = "w7WcMXH384MQxArKBWq9tfOfmOANhXYh";
        strArr2[6] = "ji6HgViVTGyvfONq8Vqt8Uaju4D1iJHU";
        if (arrayList != null) {
            int changedScrapCount = arrayList.size();
            for (int i4 = 0; i4 < changedScrapCount; i4++) {
                this.A02.get(i4).A0M();
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        ArrayList<AbstractC41974l> arrayList = this.A02;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public final void A0M() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            C41804U c41804u = (C41804U) this.A06.get(i).A0H.getLayoutParams();
            if (c41804u != null) {
                c41804u.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0B()) {
            int size = this.A06.size();
            for (int i = 0; i < size; i++) {
                AbstractC41974l abstractC41974l = this.A06.get(i);
                if (A0A[0].length() != 16) {
                    throw new RuntimeException();
                }
                String[] strArr = A0A;
                strArr[2] = "kx9etu5Uswf3mlSSd54JM5SDJxoMGNTv";
                strArr[1] = "kxxNK4Rys8aPJuu822sP3fs8sDM7v1G0";
                if (abstractC41974l != null) {
                    abstractC41974l.A0T(6);
                    abstractC41974l.A0Y(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int i;
        if (this.A08.A06 != null) {
            AbstractC41794T abstractC41794T = this.A08.A06;
            if (A0A[0].length() == 16) {
                String[] strArr = A0A;
                strArr[2] = "kSelswvDf1EbxUzrii1mBr6dHJR0d4zj";
                strArr[1] = "kcuGN1lunmBh6z5P1vsNJWvgiUTpOK0Q";
                i = abstractC41794T.A00;
            }
            throw new RuntimeException();
        }
        i = 0;
        this.A00 = this.A03 + i;
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            int size2 = this.A06.size();
            String[] strArr2 = A0A;
            String str = strArr2[2];
            String str2 = strArr2[1];
            int charAt = str.charAt(0);
            int i2 = str2.charAt(0);
            if (charAt != i2) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0A;
            strArr3[2] = "kpxxdOz3cEfo3MLV8RPQuR2Jasv2n6jF";
            strArr3[1] = "kgO1H2GjmHeLX2ZusVi9gFRUJKE1zGI0";
            int i3 = this.A00;
            if (size2 > i3) {
                A07(size);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i) {
        this.A03 = i;
        A0O();
    }

    public final void A0R(int i, int i2) {
        int size = this.A06.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC41974l abstractC41974l = this.A06.get(i3);
            if (abstractC41974l != null && abstractC41974l.A03 >= i) {
                abstractC41974l.A0W(i2, true);
            }
        }
    }

    public final void A0S(int end, int inBetweenOffset) {
        int cachedCount;
        int i;
        int i2;
        if (end < inBetweenOffset) {
            cachedCount = end;
            i = inBetweenOffset;
            i2 = -1;
        } else {
            cachedCount = inBetweenOffset;
            i = end;
            i2 = 1;
        }
        int size = this.A06.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC41974l abstractC41974l = this.A06.get(i3);
            if (abstractC41974l != null && abstractC41974l.A03 >= cachedCount && abstractC41974l.A03 <= i) {
                int i4 = abstractC41974l.A03;
                String[] strArr = A0A;
                if (strArr[5].charAt(0) == strArr[3].charAt(0)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0A;
                strArr2[2] = "kvvW4F2OCwdEIl1qwIuxYVFpmp0ugJY5";
                strArr2[1] = "kzcCp2wTfEGQm2KGuN32b5oIYABnQWPG";
                if (i4 == end) {
                    abstractC41974l.A0W(inBetweenOffset - end, false);
                } else {
                    abstractC41974l.A0W(i2, false);
                }
            }
        }
    }

    public final void A0T(int cachedCount, int i) {
        int pos;
        int i2 = cachedCount + i;
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            AbstractC41974l abstractC41974l = this.A06.get(size);
            if (abstractC41974l != null && (pos = abstractC41974l.A03) >= cachedCount && pos < i2) {
                abstractC41974l.A0T(2);
                A07(size);
            }
        }
    }

    public final void A0U(int cachedCount, int i, boolean z) {
        int i2 = cachedCount + i;
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            AbstractC41974l abstractC41974l = this.A06.get(size);
            if (abstractC41974l != null) {
                if (abstractC41974l.A03 >= i2) {
                    abstractC41974l.A0W(-i, z);
                } else if (abstractC41974l.A03 >= cachedCount) {
                    abstractC41974l.A0T(8);
                    A07(size);
                }
            }
        }
    }

    public final void A0V(View view) {
        AbstractC41974l A0G = C4804F9.A0G(view);
        A0G.A0F = null;
        A0G.A0G = false;
        A0G.A0O();
        A0b(A0G);
    }

    public final void A0W(View view) {
        AbstractC41974l A0G = C4804F9.A0G(view);
        if (A0G.A0k(12) || !A0G.A0f() || this.A08.A20(A0G)) {
            boolean A0b = A0G.A0b();
            if (A0A[0].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A0A;
            strArr[5] = "cscHAR4ImnAFzAxZJ9yqjMNa91RcN8Vb";
            strArr[3] = "pspTzLDNU823NSI2ymIgIumCpfqVQlal";
            if (!A0b || A0G.A0c() || this.A08.A04.A0B()) {
                A0G.A0X(this, false);
                this.A05.add(A0G);
                return;
            }
            throw new IllegalArgumentException(A04(43, 122, 32) + this.A08.A1I());
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        A0G.A0X(this, true);
        this.A02.add(A0G);
    }

    public final void A0X(View view) {
        AbstractC41974l A0G = C4804F9.A0G(view);
        if (A0G.A0e()) {
            this.A08.removeDetachedView(view, false);
        }
        if (A0G.A0d()) {
            A0G.A0S();
        } else if (A0G.A0i()) {
            A0G.A0O();
        }
        A0b(A0G);
    }

    public final void A0Y(AbstractC41674H abstractC41674H, AbstractC41674H abstractC41674H2, boolean z) {
        A0P();
        A0H().A08(abstractC41674H, abstractC41674H2, z);
    }

    public final void A0Z(C41864a c41864a) {
        C41864a c41864a2 = this.A01;
        if (c41864a2 != null) {
            c41864a2.A04();
        }
        this.A01 = c41864a;
        if (c41864a != null) {
            this.A01.A07(this.A08.getAdapter());
        }
    }

    public final void A0a(AbstractC41954j abstractC41954j) {
        this.A04 = abstractC41954j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
        if (r0 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bd, code lost:
        if (r5 > 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
        r0 = r10.A0k(526);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c5, code lost:
        if (r0 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
        r2 = r9.A06.size();
        r0 = r9.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
        if (r2 < r0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
        if (r2 <= 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d3, code lost:
        A07(0);
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
        r0 = com.facebook.ads.redexgen.p036X.C4804F9.A1E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dc, code lost:
        if (r0 == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00de, code lost:
        if (r2 <= 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
        r1 = r9.A08.A02;
        r0 = r10.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ea, code lost:
        if (r1.A05(r0) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ee, code lost:
        if (r2 < 0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0102, code lost:
        if (r9.A08.A02.A05(r9.A06.get(r2).A03) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0104, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0106, code lost:
        r9.A06.add(r2, r10);
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x010c, code lost:
        if (r7 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010e, code lost:
        A0d(r10, true);
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0123, code lost:
        r2 = r2 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
        if (r5 > 0) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0b(com.facebook.ads.redexgen.p036X.AbstractC41974l r10) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C41874b.A0b(com.facebook.ads.redexgen.X.4l):void");
    }

    public final void A0c(AbstractC41974l abstractC41974l) {
        boolean z;
        z = abstractC41974l.A0G;
        if (z) {
            this.A02.remove(abstractC41974l);
        } else {
            this.A05.remove(abstractC41974l);
        }
        abstractC41974l.A0F = null;
        abstractC41974l.A0G = false;
        abstractC41974l.A0O();
    }

    public final void A0d(AbstractC41974l abstractC41974l, boolean z) {
        C4804F9.A0t(abstractC41974l);
        if (abstractC41974l.A0k(Http2.INITIAL_MAX_FRAME_SIZE)) {
            abstractC41974l.A0U(0, Http2.INITIAL_MAX_FRAME_SIZE);
            C409838.A0B(abstractC41974l.A0H, null);
        }
        if (z) {
            A0B(abstractC41974l);
        }
        abstractC41974l.A08 = null;
        A0H().A09(abstractC41974l);
    }
}
