package com.qmuiteam.qmui.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.qmuiteam.qmui.C9056b;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.qmuiteam.qmui.layout.i */
/* loaded from: classes3.dex */
public class C9065i extends C9064h {

    /* renamed from: c */
    public final ArrayList<View> f17377c;

    /* renamed from: d */
    public final ArrayList<View> f17378d;

    /* renamed from: com.qmuiteam.qmui.layout.i$a */
    /* loaded from: classes3.dex */
    public static class C9066a extends LinearLayout.LayoutParams {

        /* renamed from: a */
        public int f17379a;

        /* renamed from: b */
        public final int f17380b;

        /* renamed from: c */
        public int f17381c;

        /* renamed from: d */
        public int f17382d;

        /* renamed from: e */
        public int f17383e;

        /* renamed from: f */
        public int f17384f;

        /* renamed from: g */
        public int f17385g;

        /* renamed from: h */
        public int f17386h;

        public C9066a(int i) {
            super(-1, i);
            this.f17379a = 2;
            this.f17380b = 0;
            this.f17381c = Integer.MIN_VALUE;
            this.f17382d = Integer.MIN_VALUE;
            this.f17383e = 0;
            this.f17384f = 0;
            this.f17385g = 0;
            this.f17386h = 0;
        }

        public C9066a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f17379a = 2;
            this.f17380b = 0;
            this.f17381c = Integer.MIN_VALUE;
            this.f17382d = Integer.MIN_VALUE;
            this.f17383e = 0;
            this.f17384f = 0;
            this.f17385g = 0;
            this.f17386h = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9056b.f17320o);
            this.f17379a = obtainStyledAttributes.getInteger(1, 2);
            this.f17380b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C9066a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f17379a = 2;
            this.f17380b = 0;
            this.f17381c = Integer.MIN_VALUE;
            this.f17382d = Integer.MIN_VALUE;
            this.f17383e = 0;
            this.f17384f = 0;
            this.f17385g = 0;
            this.f17386h = 0;
        }
    }

    public C9065i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17377c = new ArrayList<>();
        this.f17378d = new ArrayList<>();
    }

    private int getVisibleChildCount() {
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            if (getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C9066a) && super.checkLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public final void m2739d(ArrayList<View> arrayList, int i, int i2, int i3) {
        int measuredWidth;
        Iterator<View> it = arrayList.iterator();
        while (it.hasNext()) {
            View next = it.next();
            C9066a c9066a = (C9066a) next.getLayoutParams();
            if (getOrientation() == 0) {
                if (i3 <= 0) {
                    ((LinearLayout.LayoutParams) c9066a).leftMargin = 0;
                    ((LinearLayout.LayoutParams) c9066a).rightMargin = 0;
                    ((LinearLayout.LayoutParams) c9066a).width = 0;
                }
                i3 -= ((LinearLayout.LayoutParams) c9066a).leftMargin - ((LinearLayout.LayoutParams) c9066a).rightMargin;
                if (i3 > 0) {
                    next.measure(View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE), ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop(), ((LinearLayout.LayoutParams) c9066a).height));
                    if (next.getMeasuredWidth() >= i3) {
                        ((LinearLayout.LayoutParams) c9066a).width = i3;
                        i3 = 0;
                    } else {
                        measuredWidth = next.getMeasuredWidth();
                        i3 -= measuredWidth;
                    }
                } else {
                    ((LinearLayout.LayoutParams) c9066a).leftMargin = 0;
                    ((LinearLayout.LayoutParams) c9066a).rightMargin = 0;
                    ((LinearLayout.LayoutParams) c9066a).width = 0;
                }
            } else {
                if (i3 <= 0) {
                    ((LinearLayout.LayoutParams) c9066a).topMargin = 0;
                    ((LinearLayout.LayoutParams) c9066a).bottomMargin = 0;
                    ((LinearLayout.LayoutParams) c9066a).height = 0;
                }
                i3 -= ((LinearLayout.LayoutParams) c9066a).topMargin - ((LinearLayout.LayoutParams) c9066a).bottomMargin;
                if (i3 > 0) {
                    next.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), ((LinearLayout.LayoutParams) c9066a).width), View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE));
                    if (next.getMeasuredHeight() >= i3) {
                        ((LinearLayout.LayoutParams) c9066a).height = i3;
                        i3 = 0;
                    } else {
                        measuredWidth = next.getMeasuredHeight();
                        i3 -= measuredWidth;
                    }
                } else {
                    ((LinearLayout.LayoutParams) c9066a).topMargin = 0;
                    ((LinearLayout.LayoutParams) c9066a).bottomMargin = 0;
                    ((LinearLayout.LayoutParams) c9066a).height = 0;
                }
            }
        }
    }

    /* renamed from: f */
    public final void m2738f(ArrayList<View> arrayList, int i, int i2) {
        int i3 = i2 - i;
        if (i3 > 0) {
            Iterator<View> it = arrayList.iterator();
            while (it.hasNext()) {
                View next = it.next();
                C9066a c9066a = (C9066a) next.getLayoutParams();
                if (getOrientation() == 0) {
                    ((LinearLayout.LayoutParams) c9066a).width = Math.max(0, (int) (next.getMeasuredWidth() - (i3 * ((((next.getMeasuredWidth() + ((LinearLayout.LayoutParams) c9066a).leftMargin) + ((LinearLayout.LayoutParams) c9066a).rightMargin) * 1.0f) / i2))));
                } else {
                    ((LinearLayout.LayoutParams) c9066a).height = Math.max(0, (int) (next.getMeasuredHeight() - (i3 * ((((next.getMeasuredHeight() + ((LinearLayout.LayoutParams) c9066a).topMargin) + ((LinearLayout.LayoutParams) c9066a).bottomMargin) * 1.0f) / i2))));
                }
            }
        }
    }

    @Override // com.qmuiteam.qmui.alpha.C9003e, android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C9066a(getContext(), attributeSet);
    }

    @Override // com.qmuiteam.qmui.alpha.C9003e, android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C9066a(layoutParams);
    }

    /* renamed from: j */
    public final int m2737j(int i, int i2) {
        int i3;
        int i4;
        int measuredHeight;
        int i5;
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
        ArrayList<View> arrayList = this.f17377c;
        arrayList.clear();
        ArrayList<View> arrayList2 = this.f17378d;
        arrayList2.clear();
        int orientation = getOrientation();
        int i6 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                C9066a c9066a = (C9066a) childAt.getLayoutParams();
                int i8 = c9066a.f17381c;
                if (i8 == Integer.MIN_VALUE) {
                    c9066a.f17381c = ((LinearLayout.LayoutParams) c9066a).width;
                    c9066a.f17383e = ((LinearLayout.LayoutParams) c9066a).leftMargin;
                    c9066a.f17384f = ((LinearLayout.LayoutParams) c9066a).rightMargin;
                } else {
                    ((LinearLayout.LayoutParams) c9066a).width = i8;
                    ((LinearLayout.LayoutParams) c9066a).leftMargin = c9066a.f17383e;
                    ((LinearLayout.LayoutParams) c9066a).rightMargin = c9066a.f17384f;
                }
                int i9 = c9066a.f17382d;
                if (i9 == Integer.MIN_VALUE) {
                    c9066a.f17382d = ((LinearLayout.LayoutParams) c9066a).height;
                    c9066a.f17385g = ((LinearLayout.LayoutParams) c9066a).topMargin;
                    c9066a.f17386h = ((LinearLayout.LayoutParams) c9066a).bottomMargin;
                } else {
                    ((LinearLayout.LayoutParams) c9066a).height = i9;
                    ((LinearLayout.LayoutParams) c9066a).topMargin = c9066a.f17385g;
                    ((LinearLayout.LayoutParams) c9066a).bottomMargin = c9066a.f17386h;
                }
                float f = ((LinearLayout.LayoutParams) c9066a).weight;
                if (f > 0.0f) {
                    i3 = 1;
                } else if (orientation != 0 ? ((LinearLayout.LayoutParams) c9066a).height >= 0 : ((LinearLayout.LayoutParams) c9066a).width >= 0) {
                    i3 = 3;
                } else {
                    i3 = c9066a.f17379a;
                }
                if (orientation == 0) {
                    i4 = ((LinearLayout.LayoutParams) c9066a).leftMargin + ((LinearLayout.LayoutParams) c9066a).rightMargin;
                } else {
                    i4 = ((LinearLayout.LayoutParams) c9066a).bottomMargin + ((LinearLayout.LayoutParams) c9066a).topMargin;
                }
                if (i3 == 3) {
                    if (orientation == 0) {
                        int i10 = ((LinearLayout.LayoutParams) c9066a).width;
                        if (i10 >= 0) {
                            i5 = i10 + i4 + i6;
                            i6 = i5;
                        } else {
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
                            measuredHeight = childAt.getMeasuredWidth() + i4 + i6;
                            i6 = measuredHeight;
                        }
                    } else {
                        int i11 = ((LinearLayout.LayoutParams) c9066a).height;
                        if (i11 >= 0) {
                            i5 = i11 + i4 + i6;
                            i6 = i5;
                        } else {
                            childAt.measure(i, View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                            measuredHeight = childAt.getMeasuredHeight() + i4 + i6;
                            i6 = measuredHeight;
                        }
                    }
                } else if (i3 == 2) {
                    arrayList.add(childAt);
                } else if (f == 0.0f) {
                    arrayList2.add(childAt);
                }
            }
        }
        return i6;
    }

    @Override // com.qmuiteam.qmui.layout.C9064h, android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int orientation = getOrientation();
        ArrayList<View> arrayList = this.f17377c;
        ArrayList<View> arrayList2 = this.f17378d;
        if (orientation == 0) {
            int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
            int mode = View.MeasureSpec.getMode(i);
            int visibleChildCount = getVisibleChildCount();
            if (mode != 0 && visibleChildCount != 0 && size > 0) {
                int m2737j = m2737j(i, i2);
                if (m2737j >= size) {
                    Iterator<View> it = arrayList.iterator();
                    while (it.hasNext()) {
                        View next = it.next();
                        C9066a c9066a = (C9066a) next.getLayoutParams();
                        next.measure(View.MeasureSpec.makeMeasureSpec(c9066a.f17380b, Integer.MIN_VALUE), i2);
                        ((LinearLayout.LayoutParams) c9066a).width = next.getMeasuredWidth();
                    }
                    Iterator<View> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        C9066a c9066a2 = (C9066a) it2.next().getLayoutParams();
                        ((LinearLayout.LayoutParams) c9066a2).width = 0;
                        ((LinearLayout.LayoutParams) c9066a2).leftMargin = 0;
                        ((LinearLayout.LayoutParams) c9066a2).rightMargin = 0;
                    }
                } else {
                    int i3 = size - m2737j;
                    Iterator<View> it3 = arrayList.iterator();
                    int i4 = 0;
                    int i5 = 0;
                    while (it3.hasNext()) {
                        View next2 = it3.next();
                        C9066a c9066a3 = (C9066a) next2.getLayoutParams();
                        next2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), i2);
                        int i6 = ((LinearLayout.LayoutParams) c9066a3).leftMargin + ((LinearLayout.LayoutParams) c9066a3).rightMargin;
                        i5 += next2.getMeasuredWidth() + i6;
                        i4 += Math.min(next2.getMeasuredWidth(), c9066a3.f17380b) + i6;
                    }
                    if (i4 >= i3) {
                        Iterator<View> it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            View next3 = it4.next();
                            C9066a c9066a4 = (C9066a) next3.getLayoutParams();
                            ((LinearLayout.LayoutParams) c9066a4).width = Math.min(next3.getMeasuredWidth(), c9066a4.f17380b);
                        }
                        Iterator<View> it5 = arrayList2.iterator();
                        while (it5.hasNext()) {
                            C9066a c9066a5 = (C9066a) it5.next().getLayoutParams();
                            ((LinearLayout.LayoutParams) c9066a5).width = 0;
                            ((LinearLayout.LayoutParams) c9066a5).leftMargin = 0;
                            ((LinearLayout.LayoutParams) c9066a5).rightMargin = 0;
                        }
                    } else if (i5 < i3) {
                        if (!arrayList2.isEmpty()) {
                            m2739d(arrayList2, i, i2, i3 - i5);
                        }
                    } else {
                        Iterator<View> it6 = arrayList2.iterator();
                        while (it6.hasNext()) {
                            C9066a c9066a6 = (C9066a) it6.next().getLayoutParams();
                            ((LinearLayout.LayoutParams) c9066a6).width = 0;
                            ((LinearLayout.LayoutParams) c9066a6).leftMargin = 0;
                            ((LinearLayout.LayoutParams) c9066a6).rightMargin = 0;
                        }
                        if (i3 < i5 && !arrayList.isEmpty()) {
                            m2738f(arrayList, i3, i5);
                        }
                    }
                }
            }
        } else {
            int size2 = (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom();
            int mode2 = View.MeasureSpec.getMode(i2);
            int visibleChildCount2 = getVisibleChildCount();
            if (mode2 != 0 && visibleChildCount2 != 0 && size2 > 0) {
                int m2737j2 = m2737j(i, i2);
                if (m2737j2 >= size2) {
                    Iterator<View> it7 = arrayList.iterator();
                    while (it7.hasNext()) {
                        View next4 = it7.next();
                        C9066a c9066a7 = (C9066a) next4.getLayoutParams();
                        next4.measure(i, View.MeasureSpec.makeMeasureSpec(c9066a7.f17380b, Integer.MIN_VALUE));
                        ((LinearLayout.LayoutParams) c9066a7).height = next4.getMeasuredHeight();
                    }
                    Iterator<View> it8 = arrayList2.iterator();
                    while (it8.hasNext()) {
                        C9066a c9066a8 = (C9066a) it8.next().getLayoutParams();
                        ((LinearLayout.LayoutParams) c9066a8).height = 0;
                        ((LinearLayout.LayoutParams) c9066a8).topMargin = 0;
                        ((LinearLayout.LayoutParams) c9066a8).bottomMargin = 0;
                    }
                } else {
                    int i7 = size2 - m2737j2;
                    Iterator<View> it9 = arrayList.iterator();
                    int i8 = 0;
                    int i9 = 0;
                    while (it9.hasNext()) {
                        View next5 = it9.next();
                        C9066a c9066a9 = (C9066a) next5.getLayoutParams();
                        next5.measure(i, View.MeasureSpec.makeMeasureSpec(size2, Integer.MIN_VALUE));
                        int i10 = ((LinearLayout.LayoutParams) c9066a9).topMargin + ((LinearLayout.LayoutParams) c9066a9).bottomMargin;
                        i9 += next5.getMeasuredHeight() + i10;
                        i8 += Math.min(next5.getMeasuredHeight(), c9066a9.f17380b) + i10;
                    }
                    if (i8 >= i7) {
                        Iterator<View> it10 = arrayList.iterator();
                        while (it10.hasNext()) {
                            View next6 = it10.next();
                            C9066a c9066a10 = (C9066a) next6.getLayoutParams();
                            ((LinearLayout.LayoutParams) c9066a10).height = Math.min(next6.getMeasuredHeight(), c9066a10.f17380b);
                        }
                        Iterator<View> it11 = arrayList2.iterator();
                        while (it11.hasNext()) {
                            C9066a c9066a11 = (C9066a) it11.next().getLayoutParams();
                            ((LinearLayout.LayoutParams) c9066a11).height = 0;
                            ((LinearLayout.LayoutParams) c9066a11).topMargin = 0;
                            ((LinearLayout.LayoutParams) c9066a11).bottomMargin = 0;
                        }
                    } else if (i9 < i7) {
                        if (!arrayList2.isEmpty()) {
                            m2739d(arrayList2, i, i2, i7 - i9);
                        }
                    } else {
                        Iterator<View> it12 = arrayList2.iterator();
                        while (it12.hasNext()) {
                            C9066a c9066a12 = (C9066a) it12.next().getLayoutParams();
                            ((LinearLayout.LayoutParams) c9066a12).height = 0;
                            ((LinearLayout.LayoutParams) c9066a12).topMargin = 0;
                            ((LinearLayout.LayoutParams) c9066a12).bottomMargin = 0;
                        }
                        if (i7 < i9 && !arrayList.isEmpty()) {
                            m2738f(arrayList, i7, i9);
                        }
                    }
                }
            }
        }
        super.onMeasure(i, i2);
    }
}
