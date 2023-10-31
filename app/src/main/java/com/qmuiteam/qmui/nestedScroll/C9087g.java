package com.qmuiteam.qmui.nestedScroll;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;
import com.qmuiteam.qmui.util.C9141b;
import com.qmuiteam.qmui.util.C9143d;
import java.util.WeakHashMap;

/* renamed from: com.qmuiteam.qmui.nestedScroll.g */
/* loaded from: classes3.dex */
public final class C9087g extends View {

    /* renamed from: a */
    public final int[] f17439a;

    /* renamed from: b */
    public final int[] f17440b;

    /* renamed from: c */
    public Drawable f17441c;

    /* renamed from: d */
    public int f17442d;

    /* renamed from: e */
    public int f17443e;

    /* renamed from: f */
    public long f17444f;

    /* renamed from: g */
    public float f17445g;

    /* renamed from: h */
    public float f17446h;

    /* renamed from: i */
    public final RunnableC9088a f17447i;

    /* renamed from: j */
    public boolean f17448j;

    /* renamed from: k */
    public InterfaceC9089b f17449k;

    /* renamed from: l */
    public int f17450l;

    /* renamed from: m */
    public float f17451m;

    /* renamed from: n */
    public final int f17452n;

    /* renamed from: o */
    public final int f17453o;

    /* renamed from: p */
    public boolean f17454p;

    /* renamed from: q */
    public boolean f17455q;

    /* renamed from: com.qmuiteam.qmui.nestedScroll.g$a */
    /* loaded from: classes3.dex */
    public class RunnableC9088a implements Runnable {
        public RunnableC9088a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C9087g.this.invalidate();
        }
    }

    /* renamed from: com.qmuiteam.qmui.nestedScroll.g$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9089b {
    }

    public C9087g(Context context) {
        super(context, null);
        this.f17439a = new int[]{16842919};
        this.f17440b = new int[0];
        this.f17442d = 800;
        this.f17443e = 100;
        this.f17444f = 0L;
        this.f17445g = 0.0f;
        this.f17446h = 0.0f;
        this.f17447i = new RunnableC9088a();
        this.f17448j = false;
        this.f17450l = -1;
        this.f17451m = 0.0f;
        this.f17452n = C9141b.m2646a(getContext(), 20);
        this.f17453o = C9141b.m2646a(getContext(), 4);
        this.f17454p = true;
        this.f17455q = true;
    }

    private void setPercentInternal(float f) {
        this.f17446h = f;
        invalidate();
    }

    /* renamed from: a */
    public final void m2708a() {
        if (this.f17441c == null) {
            Context context = getContext();
            Object obj = ContextCompat.f2323a;
            this.f17441c = ContextCompat.C0651c.m12032b(context, R.drawable.qmui_icon_scroll_bar);
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i = this.f17443e;
        if (currentTimeMillis - this.f17444f > i) {
            this.f17444f = currentTimeMillis - i;
        }
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        ViewCompat.C0814d.m11754k(this);
    }

    /* renamed from: b */
    public final void m2707b(Drawable drawable, float f) {
        float m2644a = C9143d.m2644a(((f - getScrollBarTopMargin()) - this.f17451m) / (((getHeight() - getScrollBarBottomMargin()) - getScrollBarTopMargin()) - drawable.getIntrinsicHeight()));
        InterfaceC9089b interfaceC9089b = this.f17449k;
        if (interfaceC9089b != null) {
            C9084d c9084d = (C9084d) interfaceC9089b;
            c9084d.getScrollRange();
            c9084d.getCurrentScroll();
        }
        setPercentInternal(m2644a);
    }

    public int getScrollBarBottomMargin() {
        return 0;
    }

    public int getScrollBarTopMargin() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onDraw(android.graphics.Canvas r16) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qmuiteam.qmui.nestedScroll.C9087g.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Drawable drawable = this.f17441c;
        if (drawable == null) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(drawable.getIntrinsicWidth(), 1073741824), i2);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Drawable drawable = this.f17441c;
        if (drawable == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            this.f17448j = false;
            if (this.f17445g > 0.0f && x > getWidth() - drawable.getIntrinsicWidth()) {
                int i = this.f17450l;
                if (y >= i && y <= drawable.getIntrinsicHeight() + i) {
                    this.f17451m = y - this.f17450l;
                    getParent().requestDisallowInterceptTouchEvent(true);
                    this.f17448j = true;
                    InterfaceC9089b interfaceC9089b = this.f17449k;
                    if (interfaceC9089b != null) {
                        interfaceC9089b.getClass();
                        this.f17441c.setState(this.f17439a);
                    }
                }
            }
        } else if (action == 2) {
            if (this.f17448j) {
                getParent().requestDisallowInterceptTouchEvent(true);
                m2707b(drawable, y);
            }
        } else if ((action == 1 || action == 3) && this.f17448j) {
            this.f17448j = false;
            m2707b(drawable, y);
            InterfaceC9089b interfaceC9089b2 = this.f17449k;
            if (interfaceC9089b2 != null) {
                interfaceC9089b2.getClass();
                this.f17441c.setState(this.f17440b);
            }
        }
        return this.f17448j;
    }

    public void setAdjustDistanceWithAnimation(boolean z) {
        this.f17454p = z;
    }

    public void setCallback(InterfaceC9089b interfaceC9089b) {
        this.f17449k = interfaceC9089b;
    }

    public void setDragDrawable(Drawable drawable) {
        this.f17441c = drawable.mutate();
        invalidate();
    }

    public void setEnableFadeInAndOut(boolean z) {
        this.f17455q = z;
    }

    public void setKeepShownTime(int i) {
        this.f17442d = i;
    }

    public void setPercent(float f) {
        if (this.f17448j) {
            return;
        }
        setPercentInternal(f);
    }

    public void setTransitionDuration(int i) {
        this.f17443e = i;
    }
}
