package com.qmuiteam.qmui.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.view.View;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import com.qmuiteam.qmui.util.C9141b;
import java.util.WeakHashMap;

/* renamed from: com.qmuiteam.qmui.widget.e */
/* loaded from: classes3.dex */
public final class C9206e extends View {

    /* renamed from: a */
    public RectF f17774a;

    /* renamed from: b */
    public RectF f17775b;

    /* renamed from: c */
    public int f17776c;

    /* renamed from: d */
    public int f17777d;

    /* renamed from: e */
    public int f17778e;

    /* renamed from: f */
    public int f17779f;

    /* renamed from: g */
    public int f17780g;

    /* renamed from: h */
    public int f17781h;

    /* renamed from: i */
    public long f17782i;

    /* renamed from: j */
    public int f17783j;

    /* renamed from: k */
    public int f17784k;

    /* renamed from: l */
    public int f17785l;

    /* renamed from: m */
    public float f17786m;

    /* renamed from: n */
    public Point f17787n;

    /* renamed from: com.qmuiteam.qmui.widget.e$a */
    /* loaded from: classes3.dex */
    public interface InterfaceC9207a {
    }

    /* renamed from: com.qmuiteam.qmui.widget.e$b */
    /* loaded from: classes3.dex */
    public interface InterfaceC9208b {
    }

    static {
        int i = C9141b.f17577a;
    }

    /* renamed from: a */
    public final void m2577a() {
        int i = this.f17778e;
        if (i != 0 && i != 1) {
            this.f17786m = ((Math.min(this.f17776c, this.f17777d) - this.f17785l) / 2.0f) - 0.5f;
            this.f17787n = new Point(this.f17776c / 2, this.f17777d / 2);
            return;
        }
        this.f17774a = new RectF(getPaddingLeft(), getPaddingTop(), getPaddingLeft() + this.f17776c, getPaddingTop() + this.f17777d);
        this.f17775b = new RectF();
    }

    public int getMaxValue() {
        return this.f17779f;
    }

    public int getProgress() {
        return this.f17780g;
    }

    public InterfaceC9208b getQMUIProgressBarTextGenerator() {
        return null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.f17781h != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f17782i;
            int i = this.f17784k;
            if (currentTimeMillis >= i) {
                this.f17780g = this.f17781h;
                post(null);
                this.f17781h = -1;
            } else {
                this.f17780g = (int) (this.f17781h - ((1.0f - (((float) currentTimeMillis) / i)) * this.f17783j));
                post(null);
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ViewCompat.C0814d.m11754k(this);
            }
        }
        int i2 = this.f17778e;
        if (((i2 == 0 || i2 == 1) && this.f17774a == null) || ((i2 == 2 || i2 == 3) && this.f17787n == null)) {
            m2577a();
        }
        int i3 = this.f17778e;
        if (i3 == 0) {
            canvas.drawRect(this.f17774a, (Paint) null);
            this.f17775b.set(getPaddingLeft(), getPaddingTop(), ((this.f17776c * this.f17780g) / this.f17779f) + getPaddingLeft(), getPaddingTop() + this.f17777d);
            canvas.drawRect(this.f17775b, (Paint) null);
        } else if (i3 == 1) {
            float f = this.f17777d / 2.0f;
            canvas.drawRoundRect(this.f17774a, f, f, null);
            this.f17775b.set(getPaddingLeft(), getPaddingTop(), ((this.f17776c * this.f17780g) / this.f17779f) + getPaddingLeft(), getPaddingTop() + this.f17777d);
            canvas.drawRoundRect(this.f17775b, f, f, null);
        } else {
            Point point = this.f17787n;
            canvas.drawCircle(point.x, point.y, this.f17786m, null);
            int i4 = this.f17787n.x;
            throw null;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f17776c = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        this.f17777d = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        m2577a();
        setMeasuredDimension(this.f17776c, this.f17777d);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        throw null;
    }

    public void setMaxValue(int i) {
        this.f17779f = i;
    }

    public void setOnProgressChangeListener(InterfaceC9207a interfaceC9207a) {
    }

    public void setProgress(int i) {
        int i2 = this.f17779f;
        if (i > i2 || i < 0) {
            return;
        }
        int i3 = this.f17781h;
        if (i3 == -1 && this.f17780g == i) {
            return;
        }
        if (i3 == -1 || i3 != i) {
            this.f17784k = Math.abs((int) (((this.f17780g - i) * 1000) / i2));
            this.f17782i = System.currentTimeMillis();
            this.f17783j = i - this.f17780g;
            this.f17781h = i;
            invalidate();
        }
    }

    public void setProgressColor(int i) {
        throw null;
    }

    public void setQMUIProgressBarTextGenerator(InterfaceC9208b interfaceC9208b) {
    }

    public void setStrokeRoundCap(boolean z) {
        if (z) {
            Paint.Cap cap = Paint.Cap.ROUND;
        } else {
            Paint.Cap cap2 = Paint.Cap.BUTT;
        }
        throw null;
    }

    public void setStrokeWidth(int i) {
        if (this.f17785l != i) {
            this.f17785l = i;
            if (this.f17776c > 0) {
                m2577a();
            }
            throw null;
        }
    }

    public void setTextColor(int i) {
        throw null;
    }

    public void setTextSize(int i) {
        throw null;
    }

    public void setType(int i) {
        this.f17778e = i;
        throw null;
    }
}
