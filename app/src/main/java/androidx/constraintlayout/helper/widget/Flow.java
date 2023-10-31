package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.C0540f;
import androidx.constraintlayout.core.widgets.C0542h;
import androidx.constraintlayout.core.widgets.C0548m;
import androidx.constraintlayout.widget.AbstractC0584k;
import androidx.constraintlayout.widget.C0582i;

/* loaded from: classes.dex */
public class Flow extends AbstractC0584k {

    /* renamed from: k */
    public C0542h f1871k;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0584k, androidx.constraintlayout.widget.AbstractC0566b
    /* renamed from: i */
    public final void mo12133i(AttributeSet attributeSet) {
        super.mo12133i(attributeSet);
        this.f1871k = new C0542h();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0582i.f2174b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f1871k.f1824X0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C0542h c0542h = this.f1871k;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c0542h.f1864u0 = dimensionPixelSize;
                    c0542h.f1865v0 = dimensionPixelSize;
                    c0542h.f1866w0 = dimensionPixelSize;
                    c0542h.f1867x0 = dimensionPixelSize;
                } else if (index == 18) {
                    C0542h c0542h2 = this.f1871k;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c0542h2.f1866w0 = dimensionPixelSize2;
                    c0542h2.f1868y0 = dimensionPixelSize2;
                    c0542h2.f1869z0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f1871k.f1867x0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f1871k.f1868y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f1871k.f1864u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f1871k.f1869z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f1871k.f1865v0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f1871k.f1822V0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f1871k.f1806F0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f1871k.f1807G0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f1871k.f1808H0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f1871k.f1810J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f1871k.f1809I0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f1871k.f1811K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f1871k.f1812L0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f1871k.f1814N0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f1871k.f1816P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f1871k.f1815O0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f1871k.f1817Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f1871k.f1813M0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f1871k.f1820T0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f1871k.f1821U0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f1871k.f1818R0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f1871k.f1819S0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f1871k.f1823W0 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2016d = this.f1871k;
        m12157k();
    }

    @Override // androidx.constraintlayout.widget.AbstractC0566b
    /* renamed from: j */
    public final void mo12158j(C0540f c0540f, boolean z) {
        C0542h c0542h = this.f1871k;
        int i = c0542h.f1866w0;
        if (i > 0 || c0542h.f1867x0 > 0) {
            if (z) {
                c0542h.f1868y0 = c0542h.f1867x0;
                c0542h.f1869z0 = i;
                return;
            }
            c0542h.f1868y0 = i;
            c0542h.f1869z0 = c0542h.f1867x0;
        }
    }

    @Override // androidx.constraintlayout.widget.AbstractC0584k
    /* renamed from: l */
    public final void mo12132l(C0548m c0548m, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c0548m != null) {
            c0548m.mo12201R(mode, size, mode2, size2);
            setMeasuredDimension(c0548m.f1860B0, c0548m.f1861C0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // androidx.constraintlayout.widget.AbstractC0566b, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i, int i2) {
        mo12132l(this.f1871k, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.f1871k.f1814N0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f1871k.f1808H0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.f1871k.f1815O0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f1871k.f1809I0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f1871k.f1820T0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.f1871k.f1812L0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f1871k.f1818R0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f1871k.f1806F0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.f1871k.f1816P0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f1871k.f1810J0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.f1871k.f1817Q0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f1871k.f1811K0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f1871k.f1823W0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f1871k.f1824X0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C0542h c0542h = this.f1871k;
        c0542h.f1864u0 = i;
        c0542h.f1865v0 = i;
        c0542h.f1866w0 = i;
        c0542h.f1867x0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f1871k.f1865v0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f1871k.f1868y0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f1871k.f1869z0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f1871k.f1864u0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f1871k.f1821U0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.f1871k.f1813M0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f1871k.f1819S0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f1871k.f1807G0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f1871k.f1822V0 = i;
        requestLayout();
    }
}
