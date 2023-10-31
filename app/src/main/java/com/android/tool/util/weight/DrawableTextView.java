package com.android.tool.util.weight;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0383m0;
import androidx.collection.C0473e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class DrawableTextView extends C0383m0 {

    /* renamed from: h */
    public final Drawable[] f6123h;

    /* renamed from: i */
    public final int[] f6124i;

    /* renamed from: j */
    public final int[] f6125j;

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface DrawGravity {
    }

    public DrawableTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16842884);
        this.f6123h = r1;
        this.f6124i = r2;
        this.f6125j = r3;
        setGravity(17);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0473e.f1504c);
        Drawable[] drawableArr = {obtainStyledAttributes.getDrawable(3), obtainStyledAttributes.getDrawable(9), obtainStyledAttributes.getDrawable(6), obtainStyledAttributes.getDrawable(0)};
        int[] iArr = {obtainStyledAttributes.getDimensionPixelSize(5, 0), obtainStyledAttributes.getDimensionPixelSize(11, 0), obtainStyledAttributes.getDimensionPixelSize(8, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0)};
        int[] iArr2 = {obtainStyledAttributes.getDimensionPixelSize(4, 0), obtainStyledAttributes.getDimensionPixelSize(10, 0), obtainStyledAttributes.getDimensionPixelSize(7, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0)};
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r17) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.tool.util.weight.DrawableTextView.onDraw(android.graphics.Canvas):void");
    }
}
