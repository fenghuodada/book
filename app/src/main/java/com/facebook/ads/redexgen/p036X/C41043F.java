package com.facebook.ads.redexgen.p036X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: com.facebook.ads.redexgen.X.3F */
/* loaded from: assets/audience_network.dex */
public class C41043F extends ViewGroup.LayoutParams {
    public float A00;
    public int A01;
    public int A02;
    public boolean A03;
    public int A04;
    public boolean A05;

    public C41043F() {
        super(-1, -1);
        this.A00 = 0.0f;
    }

    public C41043F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C41113M.A0w);
        this.A04 = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
