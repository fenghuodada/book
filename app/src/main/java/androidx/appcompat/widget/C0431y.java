package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.C0157c;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.view.ViewCompat;
import com.ambrose.overwall.R;

/* renamed from: androidx.appcompat.widget.y */
/* loaded from: classes.dex */
public final class C0431y extends C0411s {

    /* renamed from: d */
    public final SeekBar f1408d;

    /* renamed from: e */
    public Drawable f1409e;

    /* renamed from: f */
    public ColorStateList f1410f;

    /* renamed from: g */
    public PorterDuff.Mode f1411g;

    /* renamed from: h */
    public boolean f1412h;

    /* renamed from: i */
    public boolean f1413i;

    public C0431y(SeekBar seekBar) {
        super(seekBar);
        this.f1410f = null;
        this.f1411g = null;
        this.f1412h = false;
        this.f1413i = false;
        this.f1408d = seekBar;
    }

    @Override // androidx.appcompat.widget.C0411s
    /* renamed from: a */
    public final void mo12463a(AttributeSet attributeSet, int i) {
        super.mo12463a(attributeSet, R.attr.seekBarStyle);
        SeekBar seekBar = this.f1408d;
        Context context = seekBar.getContext();
        int[] iArr = C0157c.f416g;
        C0430x1 m12465m = C0430x1.m12465m(context, attributeSet, iArr, R.attr.seekBarStyle);
        ViewCompat.m11772m(seekBar, seekBar.getContext(), iArr, attributeSet, m12465m.f1406b, R.attr.seekBarStyle);
        Drawable m12472f = m12465m.m12472f(0);
        if (m12472f != null) {
            seekBar.setThumb(m12472f);
        }
        Drawable m12473e = m12465m.m12473e(1);
        Drawable drawable = this.f1409e;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f1409e = m12473e;
        if (m12473e != null) {
            m12473e.setCallback(seekBar);
            C0700a.C0703c.m11921b(m12473e, ViewCompat.C0815e.m11742d(seekBar));
            if (m12473e.isStateful()) {
                m12473e.setState(seekBar.getDrawableState());
            }
            m12462c();
        }
        seekBar.invalidate();
        if (m12465m.m12466l(3)) {
            this.f1411g = C0427x0.m12479c(m12465m.m12470h(3, -1), this.f1411g);
            this.f1413i = true;
        }
        if (m12465m.m12466l(2)) {
            this.f1410f = m12465m.m12476b(2);
            this.f1412h = true;
        }
        m12465m.m12464n();
        m12462c();
    }

    /* renamed from: c */
    public final void m12462c() {
        Drawable drawable = this.f1409e;
        if (drawable != null) {
            if (this.f1412h || this.f1413i) {
                Drawable mutate = drawable.mutate();
                this.f1409e = mutate;
                if (this.f1412h) {
                    C0700a.C0702b.m11924h(mutate, this.f1410f);
                }
                if (this.f1413i) {
                    C0700a.C0702b.m11923i(this.f1409e, this.f1411g);
                }
                if (this.f1409e.isStateful()) {
                    this.f1409e.setState(this.f1408d.getDrawableState());
                }
            }
        }
    }

    /* renamed from: d */
    public final void m12461d(Canvas canvas) {
        if (this.f1409e != null) {
            SeekBar seekBar = this.f1408d;
            int max = seekBar.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f1409e.getIntrinsicWidth();
                int intrinsicHeight = this.f1409e.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f1409e.setBounds(-i, -i2, i, i2);
                float width = ((seekBar.getWidth() - seekBar.getPaddingLeft()) - seekBar.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(seekBar.getPaddingLeft(), seekBar.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1409e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
