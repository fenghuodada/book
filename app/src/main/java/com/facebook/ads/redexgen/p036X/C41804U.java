package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.4U */
/* loaded from: assets/audience_network.dex */
public class C41804U extends ViewGroup.MarginLayoutParams {
    public AbstractC41974l A00;
    public boolean A01;
    public boolean A02;
    public final Rect A03;

    public C41804U(int i, int i2) {
        super(i, i2);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C41804U(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C41804U(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C41804U(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public C41804U(C41804U c41804u) {
        super((ViewGroup.LayoutParams) c41804u);
        this.A03 = new Rect();
        this.A01 = true;
        this.A02 = false;
    }

    public final int A00() {
        return this.A00.A0I();
    }

    public final boolean A01() {
        return this.A00.A0f();
    }

    public final boolean A02() {
        return this.A00.A0c();
    }

    public final boolean A03() {
        return this.A00.A0b();
    }
}
