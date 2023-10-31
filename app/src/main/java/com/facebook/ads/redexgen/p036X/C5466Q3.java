package com.facebook.ads.redexgen.p036X;

import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Q3 */
/* loaded from: assets/audience_network.dex */
public final class C5466Q3 extends RelativeLayout {
    public static String[] A03 = {"Z7YDROQZDOzGgLZ6JRzm0VB6SZj4zDor", "PEDxZ1hmcJv2HtokqPZuboN03zqPqfuu", "ZN3aiXgGzfL", "UoQOzdqMFdmvRVk6jZTbQbhJ01APWmUd", "BWydKlRDXGFiivyHlYlBLR13h8bygoZy", "calSGpe10AH6YV6oPZJsWkhcYoOFDSm8", "CqyCvSup05V", "6oqVw1T1HmkJfSZKyFG8rr7XXeYSScI0"};
    @Nullable
    public C43797m A00;
    public WeakReference<InterfaceC5465Q2> A01;
    public final InterfaceC5516Qr A02;

    public C5466Q3(C5953Xy c5953Xy, InterfaceC5516Qr interfaceC5516Qr) {
        super(c5953Xy);
        this.A02 = interfaceC5516Qr;
        C5245MS.A0J((View) this.A02);
        addView(this.A02.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }

    public final void A00(AbstractC5304NQ abstractC5304NQ) {
        addView(abstractC5304NQ, new RelativeLayout.LayoutParams(-1, -1));
        this.A00 = (C43797m) abstractC5304NQ;
    }

    public final void A01(AbstractC5304NQ abstractC5304NQ) {
        C5245MS.A0J(abstractC5304NQ);
        this.A00 = null;
    }

    public final boolean A02() {
        return this.A02.A86();
    }

    public int getCurrentPosition() {
        return this.A02.getCurrentPosition();
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ((View) this.A02).layout(0, 0, getWidth(), getHeight());
        C43797m c43797m = this.A00;
        if (c43797m != null) {
            c43797m.layout(0, 0, getWidth(), getHeight());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
        if (r6 > r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a6, code lost:
        r4 = (r0 * r8) / r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
        if (r6 > r5) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
        if (r5 == Integer.MIN_VALUE) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e2, code lost:
        if (r0 <= r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e4, code lost:
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e7, code lost:
        if (r5 == Integer.MIN_VALUE) goto L29;
     */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r12, int r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p036X.C5466Q3.onMeasure(int, int):void");
    }

    public void setViewImplInflationListener(InterfaceC5465Q2 interfaceC5465Q2) {
        this.A01 = new WeakReference<>(interfaceC5465Q2);
    }
}
