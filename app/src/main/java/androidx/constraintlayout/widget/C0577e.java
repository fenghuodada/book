package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0570d;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;

/* renamed from: androidx.constraintlayout.widget.e */
/* loaded from: classes.dex */
public final class C0577e extends ViewGroup {

    /* renamed from: a */
    public C0570d f2156a;

    /* renamed from: androidx.constraintlayout.widget.e$a */
    /* loaded from: classes.dex */
    public static class C0578a extends ConstraintLayout.C0562a {

        /* renamed from: A0 */
        public final float f2157A0;

        /* renamed from: B0 */
        public final float f2158B0;

        /* renamed from: C0 */
        public final float f2159C0;

        /* renamed from: D0 */
        public final float f2160D0;

        /* renamed from: r0 */
        public final float f2161r0;

        /* renamed from: s0 */
        public final boolean f2162s0;

        /* renamed from: t0 */
        public final float f2163t0;

        /* renamed from: u0 */
        public final float f2164u0;

        /* renamed from: v0 */
        public final float f2165v0;

        /* renamed from: w0 */
        public final float f2166w0;

        /* renamed from: x0 */
        public final float f2167x0;

        /* renamed from: y0 */
        public final float f2168y0;

        /* renamed from: z0 */
        public final float f2169z0;

        public C0578a() {
            super(-2, -2);
            this.f2161r0 = 1.0f;
            this.f2162s0 = false;
            this.f2163t0 = 0.0f;
            this.f2164u0 = 0.0f;
            this.f2165v0 = 0.0f;
            this.f2166w0 = 0.0f;
            this.f2167x0 = 1.0f;
            this.f2168y0 = 1.0f;
            this.f2169z0 = 0.0f;
            this.f2157A0 = 0.0f;
            this.f2158B0 = 0.0f;
            this.f2159C0 = 0.0f;
            this.f2160D0 = 0.0f;
        }

        public C0578a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f2161r0 = 1.0f;
            this.f2162s0 = false;
            this.f2163t0 = 0.0f;
            this.f2164u0 = 0.0f;
            this.f2165v0 = 0.0f;
            this.f2166w0 = 0.0f;
            this.f2167x0 = 1.0f;
            this.f2168y0 = 1.0f;
            this.f2169z0 = 0.0f;
            this.f2157A0 = 0.0f;
            this.f2158B0 = 0.0f;
            this.f2159C0 = 0.0f;
            this.f2160D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0582i.f2176d);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 15) {
                    this.f2161r0 = obtainStyledAttributes.getFloat(index, this.f2161r0);
                } else if (index == 28) {
                    this.f2163t0 = obtainStyledAttributes.getFloat(index, this.f2163t0);
                    this.f2162s0 = true;
                } else if (index == 23) {
                    this.f2165v0 = obtainStyledAttributes.getFloat(index, this.f2165v0);
                } else if (index == 24) {
                    this.f2166w0 = obtainStyledAttributes.getFloat(index, this.f2166w0);
                } else if (index == 22) {
                    this.f2164u0 = obtainStyledAttributes.getFloat(index, this.f2164u0);
                } else if (index == 20) {
                    this.f2167x0 = obtainStyledAttributes.getFloat(index, this.f2167x0);
                } else if (index == 21) {
                    this.f2168y0 = obtainStyledAttributes.getFloat(index, this.f2168y0);
                } else if (index == 16) {
                    this.f2169z0 = obtainStyledAttributes.getFloat(index, this.f2169z0);
                } else if (index == 17) {
                    this.f2157A0 = obtainStyledAttributes.getFloat(index, this.f2157A0);
                } else if (index == 18) {
                    this.f2158B0 = obtainStyledAttributes.getFloat(index, this.f2158B0);
                } else if (index == 19) {
                    this.f2159C0 = obtainStyledAttributes.getFloat(index, this.f2159C0);
                } else if (index == 27) {
                    this.f2160D0 = obtainStyledAttributes.getFloat(index, this.f2160D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0578a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0578a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0562a(layoutParams);
    }

    public C0570d getConstraintSet() {
        if (this.f2156a == null) {
            this.f2156a = new C0570d();
        }
        C0570d c0570d = this.f2156a;
        c0570d.getClass();
        int childCount = getChildCount();
        HashMap<Integer, C0570d.C0571a> hashMap = c0570d.f2041c;
        hashMap.clear();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            C0578a c0578a = (C0578a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (c0570d.f2040b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!hashMap.containsKey(Integer.valueOf(id))) {
                hashMap.put(Integer.valueOf(id), new C0570d.C0571a());
            }
            C0570d.C0571a c0571a = hashMap.get(Integer.valueOf(id));
            if (c0571a != null) {
                if (childAt instanceof AbstractC0566b) {
                    AbstractC0566b abstractC0566b = (AbstractC0566b) childAt;
                    c0571a.m12143c(id, c0578a);
                    if (abstractC0566b instanceof Barrier) {
                        C0570d.C0573b c0573b = c0571a.f2045d;
                        c0573b.f2102h0 = 1;
                        Barrier barrier = (Barrier) abstractC0566b;
                        c0573b.f2098f0 = barrier.getType();
                        c0573b.f2104i0 = barrier.getReferencedIds();
                        c0573b.f2100g0 = barrier.getMargin();
                    }
                }
                c0571a.m12143c(id, c0578a);
            }
        }
        return this.f2156a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
