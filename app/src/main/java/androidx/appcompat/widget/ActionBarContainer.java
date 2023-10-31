package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0157c;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a */
    public boolean f792a;

    /* renamed from: b */
    public C0396n1 f793b;

    /* renamed from: c */
    public View f794c;

    /* renamed from: d */
    public View f795d;

    /* renamed from: e */
    public Drawable f796e;

    /* renamed from: f */
    public Drawable f797f;

    /* renamed from: g */
    public Drawable f798g;

    /* renamed from: h */
    public final boolean f799h;

    /* renamed from: i */
    public boolean f800i;

    /* renamed from: j */
    public final int f801j;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0302b c0302b = new C0302b(this);
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0814d.m11748q(this, c0302b);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0157c.f410a);
        boolean z = false;
        this.f796e = obtainStyledAttributes.getDrawable(0);
        this.f797f = obtainStyledAttributes.getDrawable(2);
        this.f801j = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f799h = true;
            this.f798g = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f799h ? !(this.f796e != null || this.f797f != null) : this.f798g == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    /* renamed from: a */
    public static int m12807a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f796e;
        if (drawable != null && drawable.isStateful()) {
            this.f796e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f797f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f797f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f798g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f798g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f793b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f796e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f797f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f798g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f794c = findViewById(R.id.action_bar);
        this.f795d = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f792a || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        Drawable drawable2;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        C0396n1 c0396n1 = this.f793b;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (c0396n1 == null || c0396n1.getVisibility() == 8) ? false : true;
        if (c0396n1 != null && c0396n1.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            int i5 = ((FrameLayout.LayoutParams) c0396n1.getLayoutParams()).bottomMargin;
            c0396n1.layout(i, (measuredHeight - c0396n1.getMeasuredHeight()) - i5, i3, measuredHeight - i5);
        }
        if (this.f799h) {
            Drawable drawable3 = this.f798g;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z2 = z3;
        } else {
            if (this.f796e != null) {
                if (this.f794c.getVisibility() == 0) {
                    drawable2 = this.f796e;
                    left = this.f794c.getLeft();
                    top = this.f794c.getTop();
                    right = this.f794c.getRight();
                    view = this.f794c;
                } else {
                    View view2 = this.f795d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f796e.setBounds(0, 0, 0, 0);
                        z3 = true;
                    } else {
                        drawable2 = this.f796e;
                        left = this.f795d.getLeft();
                        top = this.f795d.getTop();
                        right = this.f795d.getRight();
                        view = this.f795d;
                    }
                }
                drawable2.setBounds(left, top, right, view.getBottom());
                z3 = true;
            }
            this.f800i = z4;
            if (z4 && (drawable = this.f797f) != null) {
                drawable.setBounds(c0396n1.getLeft(), c0396n1.getTop(), c0396n1.getRight(), c0396n1.getBottom());
            }
            z2 = z3;
        }
        if (z2) {
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.view.View r0 = r6.f794c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != 0) goto L1c
            int r0 = android.view.View.MeasureSpec.getMode(r8)
            if (r0 != r1) goto L1c
            int r0 = r6.f801j
            if (r0 < 0) goto L1c
            int r8 = android.view.View.MeasureSpec.getSize(r8)
            int r8 = java.lang.Math.min(r0, r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
        L1c:
            super.onMeasure(r7, r8)
            android.view.View r7 = r6.f794c
            if (r7 != 0) goto L24
            return
        L24:
            int r7 = android.view.View.MeasureSpec.getMode(r8)
            androidx.appcompat.widget.n1 r0 = r6.f793b
            if (r0 == 0) goto L89
            int r0 = r0.getVisibility()
            r2 = 8
            if (r0 == r2) goto L89
            r0 = 1073741824(0x40000000, float:2.0)
            if (r7 == r0) goto L89
            android.view.View r0 = r6.f794c
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L4d
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L4d
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L4b
            goto L4d
        L4b:
            r0 = r4
            goto L4e
        L4d:
            r0 = r3
        L4e:
            if (r0 != 0) goto L53
            android.view.View r0 = r6.f794c
            goto L69
        L53:
            android.view.View r0 = r6.f795d
            if (r0 == 0) goto L65
            int r5 = r0.getVisibility()
            if (r5 == r2) goto L65
            int r0 = r0.getMeasuredHeight()
            if (r0 != 0) goto L64
            goto L65
        L64:
            r3 = r4
        L65:
            if (r3 != 0) goto L6d
            android.view.View r0 = r6.f795d
        L69:
            int r4 = m12807a(r0)
        L6d:
            if (r7 != r1) goto L74
            int r7 = android.view.View.MeasureSpec.getSize(r8)
            goto L77
        L74:
            r7 = 2147483647(0x7fffffff, float:NaN)
        L77:
            int r8 = r6.getMeasuredWidth()
            androidx.appcompat.widget.n1 r0 = r6.f793b
            int r0 = m12807a(r0)
            int r0 = r0 + r4
            int r7 = java.lang.Math.min(r0, r7)
            r6.setMeasuredDimension(r8, r7)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f796e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f796e);
        }
        this.f796e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f794c;
            if (view != null) {
                this.f796e.setBounds(view.getLeft(), this.f794c.getTop(), this.f794c.getRight(), this.f794c.getBottom());
            }
        }
        boolean z = true;
        if (!this.f799h ? this.f796e != null || this.f797f != null : this.f798g != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f798g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f798g);
        }
        this.f798g = drawable;
        boolean z = this.f799h;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f798g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f796e != null || this.f797f != null) : this.f798g == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2;
        Drawable drawable3 = this.f797f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f797f);
        }
        this.f797f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f800i && (drawable2 = this.f797f) != null) {
                drawable2.setBounds(this.f793b.getLeft(), this.f793b.getTop(), this.f793b.getRight(), this.f793b.getBottom());
            }
        }
        if (!this.f799h ? !(this.f796e != null || this.f797f != null) : this.f798g == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(C0396n1 c0396n1) {
        C0396n1 c0396n12 = this.f793b;
        if (c0396n12 != null) {
            removeView(c0396n12);
        }
        this.f793b = c0396n1;
        if (c0396n1 != null) {
            addView(c0396n1);
            ViewGroup.LayoutParams layoutParams = c0396n1.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            c0396n1.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.f792a = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f796e;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f797f;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f798g;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f796e;
        boolean z = this.f799h;
        return (drawable == drawable2 && !z) || (drawable == this.f797f && this.f800i) || ((drawable == this.f798g && z) || super.verifyDrawable(drawable));
    }
}
