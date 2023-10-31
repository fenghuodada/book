package com.qmuiteam.qmui.widget;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.collection.C0482i;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.skin.C9106f;
import com.qmuiteam.qmui.skin.C9135i;
import com.qmuiteam.qmui.skin.defaultAttr.InterfaceC9103a;
import com.qmuiteam.qmui.util.C9143d;
import com.qmuiteam.qmui.util.C9148i;
import com.qmuiteam.qmui.widget.pullRefreshLayout.C9233b;

/* renamed from: com.qmuiteam.qmui.widget.g */
/* loaded from: classes3.dex */
public final class C9210g extends FrameLayout implements InterfaceC9103a {

    /* renamed from: m */
    public static final C0482i<String, Integer> f17808m;

    /* renamed from: a */
    public int f17809a;

    /* renamed from: b */
    public int f17810b;

    /* renamed from: c */
    public int f17811c;

    /* renamed from: d */
    public int f17812d;

    /* renamed from: e */
    public boolean f17813e;

    /* renamed from: f */
    public int f17814f;

    /* renamed from: g */
    public int f17815g;

    /* renamed from: h */
    public boolean f17816h;

    /* renamed from: i */
    public boolean f17817i;

    /* renamed from: j */
    public int f17818j;

    /* renamed from: k */
    public int f17819k;

    /* renamed from: l */
    public boolean f17820l;

    /* renamed from: com.qmuiteam.qmui.widget.g$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC9211a {
    }

    /* renamed from: com.qmuiteam.qmui.widget.g$b */
    /* loaded from: classes3.dex */
    public static class C9212b extends View implements InterfaceC9103a {

        /* renamed from: a */
        public static final C0482i<String, Integer> f17821a;

        static {
            C0482i<String, Integer> c0482i = new C0482i<>(2);
            f17821a = c0482i;
            c0482i.put("background", Integer.valueOf((int) R.attr.qmui_skin_support_slider_thumb_bg_color));
            c0482i.put("border", Integer.valueOf((int) R.attr.qmui_skin_support_slider_thumb_border_color));
        }

        @Override // android.view.View
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            getWidth();
            getHeight();
            throw null;
        }

        @Override // com.qmuiteam.qmui.skin.defaultAttr.InterfaceC9103a
        public C0482i<String, Integer> getDefaultSkinAttrs() {
            return f17821a;
        }

        public int getLeftRightMargin() {
            return 0;
        }

        @Override // android.view.View
        public final void onMeasure(int i, int i2) {
            setMeasuredDimension(0, 0);
        }

        public void setBorderColor(int i) {
            throw null;
        }

        public void setPress(boolean z) {
        }
    }

    static {
        C0482i<String, Integer> c0482i = new C0482i<>(2);
        f17808m = c0482i;
        c0482i.put("background", Integer.valueOf((int) R.attr.qmui_skin_support_slider_bar_bg_color));
        c0482i.put("progressColor", Integer.valueOf((int) R.attr.qmui_skin_support_slider_bar_progress_color));
        c0482i.put("hintColor", Integer.valueOf((int) R.attr.qmui_skin_support_slider_record_progress_color));
    }

    private int getMaxThumbOffset() {
        getWidth();
        getPaddingLeft();
        getPaddingRight();
        throw null;
    }

    public int getBarHeight() {
        return this.f17809a;
    }

    public int getBarNormalColor() {
        return this.f17810b;
    }

    public int getBarProgressColor() {
        return this.f17811c;
    }

    public int getCurrentProgress() {
        return this.f17815g;
    }

    @Override // com.qmuiteam.qmui.skin.defaultAttr.InterfaceC9103a
    public C0482i<String, Integer> getDefaultSkinAttrs() {
        return f17808m;
    }

    public int getRecordProgress() {
        return this.f17818j;
    }

    public int getRecordProgressColor() {
        return this.f17812d;
    }

    public int getTickCount() {
        return this.f17814f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getPaddingLeft();
        getWidth();
        getPaddingRight();
        getPaddingTop();
        int height = (((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.f17809a) / 2;
        throw null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        getPaddingTop();
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        int i3 = this.f17809a;
        if (measuredHeight < i3) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + i3, 1073741824));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2) {
                motionEvent.getX();
                if (this.f17820l) {
                    int i = C9148i.f17583a;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        for (ViewParent viewParent = parent; viewParent != null; viewParent = viewParent.getParent()) {
                            if (viewParent instanceof C9233b) {
                                ((C9233b) viewParent).f17933r = true;
                            }
                        }
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    getMaxThumbOffset();
                    if (!this.f17813e) {
                        throw null;
                    }
                    invalidate();
                }
                return true;
            }
            if (action != 1 && action != 3) {
                removeCallbacks(null);
            } else {
                removeCallbacks(null);
                int i2 = C9148i.f17583a;
                ViewParent parent2 = getParent();
                if (parent2 != null) {
                    for (ViewParent viewParent2 = parent2; viewParent2 != null; viewParent2 = viewParent2.getParent()) {
                        if (viewParent2 instanceof C9233b) {
                            ((C9233b) viewParent2).f17933r = true;
                        }
                    }
                    parent2.requestDisallowInterceptTouchEvent(false);
                }
                if (this.f17820l) {
                    this.f17820l = false;
                }
                if (action == 1) {
                    int x = (int) motionEvent.getX();
                    if (this.f17818j == -1) {
                        if (Math.abs(x - this.f17819k) < 0 && this.f17817i) {
                            getMaxThumbOffset();
                            invalidate();
                        }
                    } else {
                        getWidth();
                        getPaddingLeft();
                        getPaddingRight();
                        throw null;
                    }
                }
            }
            return true;
        }
        this.f17819k = (int) motionEvent.getX();
        motionEvent.getX();
        motionEvent.getY();
        throw null;
    }

    public void setBarHeight(int i) {
        if (this.f17809a != i) {
            this.f17809a = i;
            requestLayout();
        }
    }

    public void setBarNormalColor(int i) {
        if (this.f17810b != i) {
            this.f17810b = i;
            invalidate();
        }
    }

    public void setBarProgressColor(int i) {
        if (this.f17811c != i) {
            this.f17811c = i;
            invalidate();
        }
    }

    public void setCallback(InterfaceC9211a interfaceC9211a) {
    }

    public void setClickToChangeProgress(boolean z) {
        this.f17817i = z;
    }

    public void setConstraintThumbInMoving(boolean z) {
        this.f17813e = z;
    }

    public void setCurrentProgress(int i) {
        if (!this.f17820l) {
            int m2643b = C9143d.m2643b(i, 0, this.f17814f);
            if (this.f17815g != m2643b || !this.f17816h) {
                this.f17816h = true;
                this.f17815g = m2643b;
                throw null;
            }
        }
    }

    public void setLongTouchToChangeProgress(boolean z) {
    }

    public void setRecordProgress(int i) {
        if (i != this.f17818j) {
            if (i != -1) {
                i = C9143d.m2643b(i, 0, this.f17814f);
            }
            this.f17818j = i;
            invalidate();
        }
    }

    public void setRecordProgressColor(int i) {
        if (this.f17812d != i) {
            this.f17812d = i;
            invalidate();
        }
    }

    public void setThumbSkin(C9135i c9135i) {
        int i = C9106f.f17535a;
        C9106f.m2677c(null, c9135i.m2655c());
        throw null;
    }

    public void setTickCount(int i) {
        if (this.f17814f == i) {
            return;
        }
        this.f17814f = i;
        setCurrentProgress(C9143d.m2643b(this.f17815g, 0, i));
        throw null;
    }
}
