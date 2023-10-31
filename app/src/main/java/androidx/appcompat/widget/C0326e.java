package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.C0157c;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;

/* renamed from: androidx.appcompat.widget.e */
/* loaded from: classes.dex */
public final class C0326e {
    @NonNull

    /* renamed from: a */
    public final View f1170a;

    /* renamed from: d */
    public C0422v1 f1173d;

    /* renamed from: e */
    public C0422v1 f1174e;

    /* renamed from: f */
    public C0422v1 f1175f;

    /* renamed from: c */
    public int f1172c = -1;

    /* renamed from: b */
    public final C0363j f1171b = C0363j.m12615a();

    public C0326e(@NonNull View view) {
        this.f1170a = view;
    }

    /* renamed from: a */
    public final void m12687a() {
        boolean z;
        View view = this.f1170a;
        Drawable background = view.getBackground();
        if (background != null) {
            boolean z2 = false;
            if (this.f1173d != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f1175f == null) {
                    this.f1175f = new C0422v1();
                }
                C0422v1 c0422v1 = this.f1175f;
                c0422v1.f1391a = null;
                c0422v1.f1394d = false;
                c0422v1.f1392b = null;
                c0422v1.f1393c = false;
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                ColorStateList m11715g = ViewCompat.C0819i.m11715g(view);
                if (m11715g != null) {
                    c0422v1.f1394d = true;
                    c0422v1.f1391a = m11715g;
                }
                PorterDuff.Mode m11714h = ViewCompat.C0819i.m11714h(view);
                if (m11714h != null) {
                    c0422v1.f1393c = true;
                    c0422v1.f1392b = m11714h;
                }
                if (c0422v1.f1394d || c0422v1.f1393c) {
                    C0363j.m12611e(background, c0422v1, view.getDrawableState());
                    z2 = true;
                }
                if (z2) {
                    return;
                }
            }
            C0422v1 c0422v12 = this.f1174e;
            if (c0422v12 != null) {
                C0363j.m12611e(background, c0422v12, view.getDrawableState());
                return;
            }
            C0422v1 c0422v13 = this.f1173d;
            if (c0422v13 != null) {
                C0363j.m12611e(background, c0422v13, view.getDrawableState());
            }
        }
    }

    /* renamed from: b */
    public final ColorStateList m12686b() {
        C0422v1 c0422v1 = this.f1174e;
        if (c0422v1 != null) {
            return c0422v1.f1391a;
        }
        return null;
    }

    /* renamed from: c */
    public final PorterDuff.Mode m12685c() {
        C0422v1 c0422v1 = this.f1174e;
        if (c0422v1 != null) {
            return c0422v1.f1392b;
        }
        return null;
    }

    /* renamed from: d */
    public final void m12684d(@Nullable AttributeSet attributeSet, int i) {
        ColorStateList m12592i;
        View view = this.f1170a;
        Context context = view.getContext();
        int[] iArr = C0157c.f407A;
        C0430x1 m12465m = C0430x1.m12465m(context, attributeSet, iArr, i);
        View view2 = this.f1170a;
        ViewCompat.m11772m(view2, view2.getContext(), iArr, attributeSet, m12465m.f1406b, i);
        try {
            if (m12465m.m12466l(0)) {
                this.f1172c = m12465m.m12469i(0, -1);
                C0363j c0363j = this.f1171b;
                Context context2 = view.getContext();
                int i2 = this.f1172c;
                synchronized (c0363j) {
                    m12592i = c0363j.f1281a.m12592i(context2, i2);
                }
                if (m12592i != null) {
                    m12681g(m12592i);
                }
            }
            if (m12465m.m12466l(1)) {
                ViewCompat.C0819i.m11705q(view, m12465m.m12476b(1));
            }
            if (m12465m.m12466l(2)) {
                ViewCompat.C0819i.m11704r(view, C0427x0.m12479c(m12465m.m12470h(2, -1), null));
            }
        } finally {
            m12465m.m12464n();
        }
    }

    /* renamed from: e */
    public final void m12683e() {
        this.f1172c = -1;
        m12681g(null);
        m12687a();
    }

    /* renamed from: f */
    public final void m12682f(int i) {
        ColorStateList colorStateList;
        this.f1172c = i;
        C0363j c0363j = this.f1171b;
        if (c0363j != null) {
            Context context = this.f1170a.getContext();
            synchronized (c0363j) {
                colorStateList = c0363j.f1281a.m12592i(context, i);
            }
        } else {
            colorStateList = null;
        }
        m12681g(colorStateList);
        m12687a();
    }

    /* renamed from: g */
    public final void m12681g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1173d == null) {
                this.f1173d = new C0422v1();
            }
            C0422v1 c0422v1 = this.f1173d;
            c0422v1.f1391a = colorStateList;
            c0422v1.f1394d = true;
        } else {
            this.f1173d = null;
        }
        m12687a();
    }

    /* renamed from: h */
    public final void m12680h(ColorStateList colorStateList) {
        if (this.f1174e == null) {
            this.f1174e = new C0422v1();
        }
        C0422v1 c0422v1 = this.f1174e;
        c0422v1.f1391a = colorStateList;
        c0422v1.f1394d = true;
        m12687a();
    }

    /* renamed from: i */
    public final void m12679i(PorterDuff.Mode mode) {
        if (this.f1174e == null) {
            this.f1174e = new C0422v1();
        }
        C0422v1 c0422v1 = this.f1174e;
        c0422v1.f1392b = mode;
        c0422v1.f1393c = true;
        m12687a();
    }
}
