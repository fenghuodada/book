package com.kongzue.dialogx.util.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import com.ambrose.overwall.R;
import com.google.android.material.C7582b;
import com.kongzue.dialogx.C8877a;
import com.kongzue.dialogx.style.C8941a;

/* loaded from: classes3.dex */
public class MaxRelativeLayout extends RelativeLayout {

    /* renamed from: k */
    public static final /* synthetic */ int f17084k = 0;

    /* renamed from: a */
    public int f17085a;

    /* renamed from: b */
    public int f17086b;

    /* renamed from: c */
    public int f17087c;

    /* renamed from: d */
    public int f17088d;

    /* renamed from: e */
    public boolean f17089e;

    /* renamed from: f */
    public View f17090f;

    /* renamed from: g */
    public int f17091g;

    /* renamed from: h */
    public int f17092h;

    /* renamed from: i */
    public View.OnTouchListener f17093i;

    /* renamed from: j */
    public boolean f17094j;

    /* renamed from: com.kongzue.dialogx.util.views.MaxRelativeLayout$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC8953a {
    }

    public MaxRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17091g = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7582b.f14378b);
            this.f17085a = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.f17086b = obtainStyledAttributes.getDimensionPixelSize(2, 0);
            this.f17087c = obtainStyledAttributes.getDimensionPixelSize(5, 0);
            this.f17088d = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.f17089e = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        }
        int i = this.f17087c;
        this.f17087c = i == 0 ? getMinimumWidth() : i;
        int i2 = this.f17088d;
        this.f17088d = i2 == 0 ? getMinimumHeight() : i2;
        if (!isInEditMode()) {
            animate().setUpdateListener(new C8954a(this));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f17093i;
        if (onTouchListener != null) {
            this.f17094j = onTouchListener.onTouch(this, motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public InterfaceC8953a getOnYChanged() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f17092h != 0) {
            C8941a c8941a = C8877a.f16910a;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f17094j;
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredHeight;
        View view;
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        if (this.f17091g == -1 && size2 != 0) {
            this.f17091g = size2;
        }
        if (this.f17089e) {
            this.f17085a = Math.min(this.f17085a, Math.min(size2, this.f17091g));
        }
        int i3 = this.f17086b;
        if (size > i3 && i3 != 0) {
            size = i3;
        }
        int i4 = this.f17085a;
        if (size2 > i4 && i4 != 0) {
            size2 = i4;
        }
        View findViewWithTag = findViewWithTag("blurView");
        View view2 = this.f17090f;
        if (view2 == null) {
            int i5 = 0;
            while (true) {
                if (i5 < getChildCount()) {
                    if (!"blurView".equals(getChildAt(i5).getTag())) {
                        view = getChildAt(i5);
                        break;
                    }
                    i5++;
                } else {
                    view = null;
                    break;
                }
            }
            view2 = view;
        }
        if (view2 != null && findViewWithTag != null) {
            if (view2.getMeasuredWidth() == 0) {
                measuredWidth = getMeasuredWidth();
            } else {
                measuredWidth = view2.getMeasuredWidth();
            }
            if (view2.getMeasuredHeight() == 0) {
                measuredHeight = getMeasuredHeight();
            } else {
                measuredHeight = view2.getMeasuredHeight();
            }
            int i6 = this.f17087c;
            if (measuredWidth < i6) {
                measuredWidth = i6;
            }
            int i7 = this.f17088d;
            if (measuredHeight < i7) {
                measuredHeight = i7;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) findViewWithTag.getLayoutParams();
            layoutParams.addRule(13);
            layoutParams.width = measuredWidth;
            layoutParams.height = measuredHeight;
            findViewWithTag.setLayoutParams(layoutParams);
        } else if (findViewWithTag != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) findViewWithTag.getLayoutParams();
            layoutParams2.width = getMeasuredWidth();
            layoutParams2.height = getMeasuredHeight();
            findViewWithTag.setLayoutParams(layoutParams2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, mode2), View.MeasureSpec.makeMeasureSpec(size, mode));
        ScrollView scrollView = (ScrollView) findViewById(R.id.scrollView);
    }

    public void setContentView(View view) {
        this.f17090f = view;
    }

    public void setMinHeight(int i) {
        if (i > 0) {
            this.f17088d = i;
        }
    }

    public void setMinWidth(int i) {
        if (i > 0) {
            this.f17087c = i;
        }
    }

    public void setNavBarHeight(int i) {
        this.f17092h = i;
        invalidate();
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f17093i = onTouchListener;
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
    }

    @Override // android.view.View
    public void setY(float f) {
        super.setY(f);
    }
}
