package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0157c;
import androidx.appcompat.content.res.C0158a;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: a */
    public boolean f883a;

    /* renamed from: b */
    public int f884b;

    /* renamed from: c */
    public int f885c;

    /* renamed from: d */
    public int f886d;

    /* renamed from: e */
    public int f887e;

    /* renamed from: f */
    public int f888f;

    /* renamed from: g */
    public float f889g;

    /* renamed from: h */
    public boolean f890h;

    /* renamed from: i */
    public int[] f891i;

    /* renamed from: j */
    public int[] f892j;

    /* renamed from: k */
    public Drawable f893k;

    /* renamed from: l */
    public int f894l;

    /* renamed from: m */
    public int f895m;

    /* renamed from: n */
    public int f896n;

    /* renamed from: o */
    public int f897o;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface DividerMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface OrientationMode {
    }

    /* renamed from: androidx.appcompat.widget.LinearLayoutCompat$a */
    /* loaded from: classes.dex */
    public static class C0250a extends LinearLayout.LayoutParams {
        public C0250a(int i, int i2) {
            super(i, i2);
        }

        public C0250a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0250a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public LinearLayoutCompat(@NonNull Context context) {
        this(context, null);
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        int resourceId;
        this.f883a = true;
        this.f884b = -1;
        this.f885c = 0;
        this.f887e = 8388659;
        int[] iArr = C0157c.f423n;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ViewCompat.m11772m(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        int i2 = obtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(0, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = obtainStyledAttributes.getBoolean(2, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f889g = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f884b = obtainStyledAttributes.getInt(3, -1);
        this.f890h = obtainStyledAttributes.getBoolean(7, false);
        if (obtainStyledAttributes.hasValue(5) && (resourceId = obtainStyledAttributes.getResourceId(5, 0)) != 0) {
            drawable = C0158a.m12920a(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(5);
        }
        setDividerDrawable(drawable);
        this.f896n = obtainStyledAttributes.getInt(8, 0);
        this.f897o = obtainStyledAttributes.getDimensionPixelSize(6, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: c */
    public final void m12795c(int i, Canvas canvas) {
        this.f893k.setBounds(getPaddingLeft() + this.f897o, i, (getWidth() - getPaddingRight()) - this.f897o, this.f895m + i);
        this.f893k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0250a;
    }

    /* renamed from: d */
    public final void m12794d(int i, Canvas canvas) {
        this.f893k.setBounds(i, getPaddingTop() + this.f897o, this.f894l + i, (getHeight() - getPaddingBottom()) - this.f897o);
        this.f893k.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: e */
    public C0250a generateDefaultLayoutParams() {
        int i = this.f886d;
        if (i == 0) {
            return new C0250a(-2, -2);
        }
        if (i == 1) {
            return new C0250a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: f */
    public C0250a generateLayoutParams(AttributeSet attributeSet) {
        return new C0250a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: g */
    public C0250a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0250a(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f884b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f884b;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f884b == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.f885c;
            if (this.f886d == 1 && (i = this.f887e & 112) != 48) {
                if (i == 16) {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f888f) / 2;
                } else if (i == 80) {
                    i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f888f;
                }
            }
            return i3 + ((LinearLayout.LayoutParams) ((C0250a) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f884b;
    }

    public Drawable getDividerDrawable() {
        return this.f893k;
    }

    public int getDividerPadding() {
        return this.f897o;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.f894l;
    }

    @GravityInt
    public int getGravity() {
        return this.f887e;
    }

    public int getOrientation() {
        return this.f886d;
    }

    public int getShowDividers() {
        return this.f896n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f889g;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
    /* renamed from: h */
    public final boolean m12790h(int i) {
        if (i == 0) {
            return (this.f896n & 1) != 0;
        } else if (i == getChildCount()) {
            return (this.f896n & 4) != 0;
        } else if ((this.f896n & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.f893k == null) {
            return;
        }
        int i2 = 0;
        if (this.f886d == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && m12790h(i2)) {
                    m12795c((childAt.getTop() - ((LinearLayout.LayoutParams) ((C0250a) childAt.getLayoutParams())).topMargin) - this.f895m, canvas);
                }
                i2++;
            }
            if (m12790h(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.f895m;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((C0250a) childAt2.getLayoutParams())).bottomMargin;
                }
                m12795c(bottom, canvas);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean m12616a = C0362i2.m12616a(this);
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && m12790h(i2)) {
                C0250a c0250a = (C0250a) childAt3.getLayoutParams();
                if (m12616a) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) c0250a).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) c0250a).leftMargin) - this.f894l;
                }
                m12794d(left2, canvas);
            }
            i2++;
        }
        if (m12790h(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (m12616a) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth();
                    i = getPaddingRight();
                    right = (left - i) - this.f894l;
                }
            } else {
                C0250a c0250a2 = (C0250a) childAt4.getLayoutParams();
                if (m12616a) {
                    left = childAt4.getLeft();
                    i = ((LinearLayout.LayoutParams) c0250a2).leftMargin;
                    right = (left - i) - this.f894l;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) c0250a2).rightMargin;
                }
            }
            m12794d(right, canvas);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b0, code lost:
        if (r13 < 0) goto L164;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f883a = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f884b = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f893k) {
            return;
        }
        this.f893k = drawable;
        if (drawable != null) {
            this.f894l = drawable.getIntrinsicWidth();
            this.f895m = drawable.getIntrinsicHeight();
        } else {
            this.f894l = 0;
            this.f895m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f897o = i;
    }

    public void setGravity(@GravityInt int i) {
        if (this.f887e != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f887e = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f887e;
        if ((8388615 & i3) != i2) {
            this.f887e = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f890h = z;
    }

    public void setOrientation(int i) {
        if (this.f886d != i) {
            this.f886d = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f896n) {
            requestLayout();
        }
        this.f896n = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f887e;
        if ((i3 & 112) != i2) {
            this.f887e = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f889g = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
