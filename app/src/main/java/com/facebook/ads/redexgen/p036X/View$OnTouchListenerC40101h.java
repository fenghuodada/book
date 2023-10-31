package com.facebook.ads.redexgen.p036X;

import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.1h */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC40101h extends C4804F9 implements View.OnTouchListener {
    public static byte[] A07;
    public static String[] A08 = {"y4Urxqcv9RCHCbRsxOihNkmZ9cqKDFdZ", "LGqXjwU2H5uaBf0UptGCT7ZDInUwl5IV", "fkBbKznr2zH2OwfKJXQ1DdYWN1N", "HFNULQ3MobNCNeOVkX9dtbi8574Dr14V", "KPqvTm6ScHx6bbBibk9kuRT9nwj9YcDc", "WIY3Unb14PjE3ayNyWd6XWPIVw0Az9uS", "ZZL8YXP6wYj9", "tbuIO4j0iRDkkCNXzrivmX4Au5offJfR"};
    public int A00;
    public C6213cB A01;
    public InterfaceC5434PX A02;
    public boolean A03;
    public boolean A04;
    public int A05;
    public final int A06;

    public static String A09(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 62);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{-53, -26, -39, -24, -54, -35, -37, -15, -37, -28, -35, -22, -50, -31, -35, -17, -104, -25, -26, -28, -15, -104, -21, -19, -24, -24, -25, -22, -20, -21, -104, -60, -31, -26, -35, -39, -22, -60, -39, -15, -25, -19, -20, -59, -39, -26, -39, -33, -35, -22};
    }

    static {
        A0A();
    }

    public View$OnTouchListenerC40101h(C5953Xy c5953Xy) {
        super(c5953Xy);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    public View$OnTouchListenerC40101h(C5953Xy c5953Xy, AttributeSet attributeSet) {
        super(c5953Xy, attributeSet);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    public View$OnTouchListenerC40101h(C5953Xy c5953Xy, AttributeSet attributeSet, int i) {
        super(c5953Xy, attributeSet, i);
        this.A05 = 0;
        this.A00 = 0;
        this.A03 = true;
        this.A04 = false;
        this.A06 = A05();
        setOnTouchListener(this);
    }

    private int A05() {
        return ((int) getContext().getResources().getDisplayMetrics().density) * 10;
    }

    private int A06(int i) {
        int i2 = this.A00 - i;
        int A7G = this.A02.A7G(i2);
        int i3 = this.A06;
        if (i2 > i3) {
            return A08(this.A05, A7G);
        }
        if (i2 < (-i3)) {
            return A07(this.A05, A7G);
        }
        return this.A05;
    }

    private int A07(int i, int i2) {
        return Math.max(i - i2, 0);
    }

    private int A08(int i, int i2) {
        return Math.min(i + i2, getItemCount() - 1);
    }

    public void A22(int i, boolean z) {
        if (getAdapter() == null) {
            return;
        }
        this.A05 = i;
        if (z) {
            A1W(i);
        } else {
            A1V(i);
        }
    }

    public int getCurrentPosition() {
        return this.A05;
    }

    private int getItemCount() {
        if (getAdapter() == null) {
            return 0;
        }
        return getAdapter().A0D();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int rawX = (int) motionEvent.getRawX();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6 || actionMasked == 3 || actionMasked == 4) {
            if (this.A04) {
                A22(A06(rawX), true);
            }
            this.A03 = true;
            this.A04 = false;
            return true;
        }
        if (actionMasked == 0 || actionMasked == 5 || (this.A03 && actionMasked == 2)) {
            this.A00 = rawX;
            String[] strArr = A08;
            if (strArr[5].charAt(14) == strArr[4].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[5] = "MxKeEan5PHYt2nmJnSz3xsZ38eI3mGgL";
            strArr2[4] = "utg9fSYK4sdWKYxBX5KGIJ2pCeKuK2tx";
            if (this.A03) {
                this.A03 = false;
            }
            this.A04 = true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.p036X.C4804F9
    public void setLayoutManager(AbstractC41794T abstractC41794T) {
        if (abstractC41794T instanceof C6213cB) {
            super.setLayoutManager(abstractC41794T);
            this.A01 = (C6213cB) abstractC41794T;
            return;
        }
        throw new IllegalArgumentException(A09(0, 50, 58));
    }

    public void setSnapDelegate(InterfaceC5434PX interfaceC5434PX) {
        this.A02 = interfaceC5434PX;
    }
}
