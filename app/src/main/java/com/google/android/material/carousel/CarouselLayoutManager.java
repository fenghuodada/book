package com.google.android.material.carousel;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.LinearInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.C0689a;
import androidx.core.math.C0728a;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.ambrose.overwall.R;
import com.google.android.material.animation.C7556a;
import com.google.android.material.carousel.C7628c;
import com.google.android.material.carousel.C7633f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public class CarouselLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: p */
    public int f14609p;

    /* renamed from: q */
    public int f14610q;

    /* renamed from: r */
    public int f14611r;
    @Nullable

    /* renamed from: v */
    public C7628c f14615v;

    /* renamed from: s */
    public final C7624b f14612s = new C7624b();

    /* renamed from: w */
    public int f14616w = 0;
    @NonNull

    /* renamed from: t */
    public AbstractC7627b f14613t = new C7633f();
    @Nullable

    /* renamed from: u */
    public C7631d f14614u = null;

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$a */
    /* loaded from: classes3.dex */
    public static final class C7623a {

        /* renamed from: a */
        public final View f14617a;

        /* renamed from: b */
        public final float f14618b;

        /* renamed from: c */
        public final C7625c f14619c;

        public C7623a(View view, float f, C7625c c7625c) {
            this.f14617a = view;
            this.f14618b = f;
            this.f14619c = c7625c;
        }
    }

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$b */
    /* loaded from: classes3.dex */
    public static class C7624b extends RecyclerView.AbstractC1578j {

        /* renamed from: a */
        public final Paint f14620a;

        /* renamed from: b */
        public List<C7628c.C7630b> f14621b;

        public C7624b() {
            Paint paint = new Paint();
            this.f14620a = paint;
            this.f14621b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1578j
        /* renamed from: e */
        public final void mo67e(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C1594v c1594v) {
            Paint paint = this.f14620a;
            paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (C7628c.C7630b c7630b : this.f14621b) {
                float f = c7630b.f14638c;
                ThreadLocal<double[]> threadLocal = C0689a.f2382a;
                float f2 = 1.0f - f;
                paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * f) + (Color.blue(-65281) * f2))));
                float f3 = c7630b.f14637b;
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) recyclerView.getLayoutManager();
                canvas.drawLine(c7630b.f14637b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).m10337J(), f3, carouselLayoutManager.f3729o - carouselLayoutManager.m10340G(), paint);
            }
        }
    }

    /* renamed from: com.google.android.material.carousel.CarouselLayoutManager$c */
    /* loaded from: classes3.dex */
    public static class C7625c {

        /* renamed from: a */
        public final C7628c.C7630b f14622a;

        /* renamed from: b */
        public final C7628c.C7630b f14623b;

        public C7625c(C7628c.C7630b c7630b, C7628c.C7630b c7630b2) {
            boolean z;
            if (c7630b.f14636a <= c7630b2.f14636a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f14622a = c7630b;
                this.f14623b = c7630b2;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    public CarouselLayoutManager() {
        m10320o0();
    }

    /* renamed from: K0 */
    public static float m4705K0(float f, C7625c c7625c) {
        C7628c.C7630b c7630b = c7625c.f14622a;
        float f2 = c7630b.f14639d;
        C7628c.C7630b c7630b2 = c7625c.f14623b;
        return C7556a.m4809a(f2, c7630b2.f14639d, c7630b.f14637b, c7630b2.f14637b, f);
    }

    /* renamed from: M0 */
    public static C7625c m4703M0(float f, List list, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            C7628c.C7630b c7630b = (C7628c.C7630b) list.get(i5);
            float f6 = z ? c7630b.f14637b : c7630b.f14636a;
            float abs = Math.abs(f6 - f);
            if (f6 <= f && abs <= f2) {
                i = i5;
                f2 = abs;
            }
            if (f6 > f && abs <= f4) {
                i3 = i5;
                f4 = abs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new C7625c((C7628c.C7630b) list.get(i), (C7628c.C7630b) list.get(i3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: A */
    public final void mo4713A(@NonNull View view, @NonNull Rect rect) {
        super.mo4713A(view, rect);
        float centerX = rect.centerX();
        float width = (rect.width() - m4705K0(centerX, m4703M0(centerX, this.f14615v.f14626b, true))) / 2.0f;
        rect.set((int) (rect.left + width), rect.top, (int) (rect.right - width), rect.bottom);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: A0 */
    public final void mo4606A0(RecyclerView recyclerView, int i) {
        C7626a c7626a = new C7626a(this, recyclerView.getContext());
        c7626a.f3758a = i;
        m10345B0(c7626a);
    }

    /* renamed from: D0 */
    public final void m4712D0(View view, int i, float f) {
        float f2 = this.f14615v.f14625a / 2.0f;
        m10328b(view, false, i);
        RecyclerView.LayoutManager.m10331Q(view, (int) (f - f2), m10337J(), (int) (f + f2), this.f3729o - m10340G());
    }

    /* renamed from: E0 */
    public final int m4711E0(int i, int i2) {
        return m4702N0() ? i - i2 : i + i2;
    }

    /* renamed from: F0 */
    public final void m4710F0(int i, RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        int m4707I0 = m4707I0(i);
        while (i < c1594v.m10276b()) {
            C7623a m4699Q0 = m4699Q0(c1586q, m4707I0, i);
            float f = m4699Q0.f14618b;
            C7625c c7625c = m4699Q0.f14619c;
            if (!m4701O0(f, c7625c)) {
                m4707I0 = m4711E0(m4707I0, (int) this.f14615v.f14625a);
                if (!m4700P0(f, c7625c)) {
                    m4712D0(m4699Q0.f14617a, -1, f);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: G0 */
    public final void m4709G0(int i, RecyclerView.C1586q c1586q) {
        int m4707I0 = m4707I0(i);
        while (i >= 0) {
            C7623a m4699Q0 = m4699Q0(c1586q, m4707I0, i);
            float f = m4699Q0.f14618b;
            C7625c c7625c = m4699Q0.f14619c;
            if (!m4700P0(f, c7625c)) {
                int i2 = (int) this.f14615v.f14625a;
                if (m4702N0()) {
                    m4707I0 += i2;
                } else {
                    m4707I0 -= i2;
                }
                if (!m4701O0(f, c7625c)) {
                    m4712D0(m4699Q0.f14617a, 0, f);
                }
                i--;
            } else {
                return;
            }
        }
    }

    /* renamed from: H0 */
    public final float m4708H0(View view, float f, C7625c c7625c) {
        C7628c.C7630b c7630b = c7625c.f14622a;
        float f2 = c7630b.f14637b;
        C7628c.C7630b c7630b2 = c7625c.f14623b;
        float f3 = c7630b2.f14637b;
        float f4 = c7630b.f14636a;
        float f5 = c7630b2.f14636a;
        float m4809a = C7556a.m4809a(f2, f3, f4, f5, f);
        if (c7630b2 == this.f14615v.m4683b() || c7630b == this.f14615v.m4681d()) {
            RecyclerView.C1579k c1579k = (RecyclerView.C1579k) view.getLayoutParams();
            return m4809a + (((1.0f - c7630b2.f14638c) + ((((ViewGroup.MarginLayoutParams) c1579k).rightMargin + ((ViewGroup.MarginLayoutParams) c1579k).leftMargin) / this.f14615v.f14625a)) * (f - f5));
        }
        return m4809a;
    }

    /* renamed from: I0 */
    public final int m4707I0(int i) {
        int i2;
        if (m4702N0()) {
            i2 = this.f3728n;
        } else {
            i2 = 0;
        }
        return m4711E0(i2 - this.f14609p, (int) (this.f14615v.f14625a * i));
    }

    /* renamed from: J0 */
    public final void m4706J0(RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        while (m10313w() > 0) {
            View m10315v = m10315v(0);
            Rect rect = new Rect();
            super.mo4713A(m10315v, rect);
            float centerX = rect.centerX();
            if (!m4700P0(centerX, m4703M0(centerX, this.f14615v.f14626b, true))) {
                break;
            }
            m10322l0(m10315v, c1586q);
        }
        while (m10313w() - 1 >= 0) {
            View m10315v2 = m10315v(m10313w() - 1);
            Rect rect2 = new Rect();
            super.mo4713A(m10315v2, rect2);
            float centerX2 = rect2.centerX();
            if (!m4701O0(centerX2, m4703M0(centerX2, this.f14615v.f14626b, true))) {
                break;
            }
            m10322l0(m10315v2, c1586q);
        }
        if (m10313w() == 0) {
            m4709G0(this.f14616w - 1, c1586q);
            m4710F0(this.f14616w, c1586q, c1594v);
            return;
        }
        int m10336K = RecyclerView.LayoutManager.m10336K(m10315v(0));
        int m10336K2 = RecyclerView.LayoutManager.m10336K(m10315v(m10313w() - 1));
        m4709G0(m10336K - 1, c1586q);
        m4710F0(m10336K2 + 1, c1586q, c1594v);
    }

    /* renamed from: L0 */
    public final int m4704L0(C7628c c7628c, int i) {
        if (m4702N0()) {
            float f = c7628c.f14625a;
            return (int) (((this.f3728n - c7628c.m4682c().f14636a) - (i * f)) - (f / 2.0f));
        }
        return (int) ((c7628c.f14625a / 2.0f) + ((i * c7628c.f14625a) - c7628c.m4684a().f14636a));
    }

    /* renamed from: N0 */
    public final boolean m4702N0() {
        return m10341F() == 1;
    }

    /* renamed from: O0 */
    public final boolean m4701O0(float f, C7625c c7625c) {
        int i;
        float m4705K0 = m4705K0(f, c7625c);
        int i2 = (int) f;
        int i3 = (int) (m4705K0 / 2.0f);
        if (m4702N0()) {
            i = i2 + i3;
        } else {
            i = i2 - i3;
        }
        if (!m4702N0() ? i > this.f3728n : i < 0) {
            return true;
        }
        return false;
    }

    /* renamed from: P0 */
    public final boolean m4700P0(float f, C7625c c7625c) {
        int m4711E0 = m4711E0((int) f, (int) (m4705K0(f, c7625c) / 2.0f));
        if (!m4702N0() ? m4711E0 < 0 : m4711E0 > this.f3728n) {
            return true;
        }
        return false;
    }

    /* renamed from: Q0 */
    public final C7623a m4699Q0(RecyclerView.C1586q c1586q, float f, int i) {
        View m10291d = c1586q.m10291d(i);
        m4698R0(m10291d);
        float m4711E0 = m4711E0((int) f, (int) (this.f14615v.f14625a / 2.0f));
        C7625c m4703M0 = m4703M0(m4711E0, this.f14615v.f14626b, false);
        float m4708H0 = m4708H0(m10291d, m4711E0, m4703M0);
        if (m10291d instanceof InterfaceC7632e) {
            float f2 = m4703M0.f14622a.f14638c;
            float f3 = m4703M0.f14623b.f14638c;
            LinearInterpolator linearInterpolator = C7556a.f14282a;
            ((InterfaceC7632e) m10291d).m4675a();
        }
        return new C7623a(m10291d, m4708H0, m4703M0);
    }

    /* renamed from: R0 */
    public final void m4698R0(@NonNull View view) {
        float f;
        if (view instanceof InterfaceC7632e) {
            RecyclerView.C1579k c1579k = (RecyclerView.C1579k) view.getLayoutParams();
            Rect rect = new Rect();
            m10327d(view, rect);
            int i = rect.left + rect.right + 0;
            int i2 = rect.top + rect.bottom + 0;
            C7631d c7631d = this.f14614u;
            if (c7631d != null) {
                f = c7631d.f14640a.f14625a;
            } else {
                f = ((ViewGroup.MarginLayoutParams) c1579k).width;
            }
            view.measure(RecyclerView.LayoutManager.m10311x(this.f3728n, this.f3726l, m10338I() + m10339H() + ((ViewGroup.MarginLayoutParams) c1579k).leftMargin + ((ViewGroup.MarginLayoutParams) c1579k).rightMargin + i, (int) f, true), RecyclerView.LayoutManager.m10311x(this.f3729o, this.f3727m, m10340G() + m10337J() + ((ViewGroup.MarginLayoutParams) c1579k).topMargin + ((ViewGroup.MarginLayoutParams) c1579k).bottomMargin + i2, ((ViewGroup.MarginLayoutParams) c1579k).height, false));
            return;
        }
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    /* renamed from: S0 */
    public final void m4697S0() {
        C7628c c7628c;
        List<C7628c> list;
        List<C7628c> list2;
        int i = this.f14611r;
        int i2 = this.f14610q;
        if (i <= i2) {
            if (m4702N0()) {
                c7628c = this.f14614u.f14642c.get(list2.size() - 1);
            } else {
                c7628c = this.f14614u.f14641b.get(list.size() - 1);
            }
        } else {
            C7631d c7631d = this.f14614u;
            float f = this.f14609p;
            float f2 = i2;
            float f3 = i;
            float f4 = c7631d.f14645f + f2;
            float f5 = f3 - c7631d.f14646g;
            if (f < f4) {
                c7628c = C7631d.m4677b(c7631d.f14641b, C7556a.m4809a(1.0f, 0.0f, f2, f4, f), c7631d.f14643d);
            } else if (f > f5) {
                c7628c = C7631d.m4677b(c7631d.f14642c, C7556a.m4809a(0.0f, 1.0f, f5, f3, f), c7631d.f14644e);
            } else {
                c7628c = c7631d.f14640a;
            }
        }
        this.f14615v = c7628c;
        List<C7628c.C7630b> list3 = c7628c.f14626b;
        C7624b c7624b = this.f14612s;
        c7624b.getClass();
        c7624b.f14621b = Collections.unmodifiableList(list3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: W */
    public final void mo4696W(@NonNull AccessibilityEvent accessibilityEvent) {
        super.mo4696W(accessibilityEvent);
        if (m10313w() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.LayoutManager.m10336K(m10315v(0)));
            accessibilityEvent.setToIndex(RecyclerView.LayoutManager.m10336K(m10315v(m10313w() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: e0 */
    public final void mo4695e0(RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        boolean z;
        CarouselLayoutManager carouselLayoutManager;
        boolean z2;
        boolean z3;
        int i;
        float f;
        List<C7628c> list;
        C7628c c7628c;
        C7628c.C7630b m4684a;
        int i2;
        int i3;
        int i4;
        int i5;
        List<C7628c> list2;
        C7628c c7628c2;
        C7628c.C7630b m4682c;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        List<C7628c> list3;
        List<C7628c> list4;
        float f3;
        int i12;
        float f4;
        float f5;
        List<C7628c.C7630b> list5;
        boolean z4;
        boolean z5;
        int i13;
        int i14;
        int size;
        boolean z6;
        int i15 = 0;
        if (c1594v.m10276b() <= 0) {
            m10324j0(c1586q);
            this.f14616w = 0;
            return;
        }
        boolean m4702N0 = m4702N0();
        int i16 = 1;
        if (this.f14614u == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View m10291d = c1586q.m10291d(0);
            m4698R0(m10291d);
            ((C7633f) this.f14613t).getClass();
            float f6 = this.f3728n;
            RecyclerView.C1579k c1579k = (RecyclerView.C1579k) m10291d.getLayoutParams();
            float f7 = ((ViewGroup.MarginLayoutParams) c1579k).leftMargin + ((ViewGroup.MarginLayoutParams) c1579k).rightMargin;
            float dimension = m10291d.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_min) + f7;
            float dimension2 = m10291d.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_max) + f7;
            float measuredWidth = m10291d.getMeasuredWidth();
            float min = Math.min(measuredWidth + f7, f6);
            float f8 = (measuredWidth / 3.0f) + f7;
            float dimension3 = m10291d.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_min) + f7;
            float dimension4 = m10291d.getContext().getResources().getDimension(R.dimen.m3_carousel_small_item_size_max) + f7;
            if (f8 < dimension3) {
                f3 = dimension3;
            } else if (f8 > dimension4) {
                f3 = dimension4;
            } else {
                f3 = f8;
            }
            float f9 = (min + f3) / 2.0f;
            int[] iArr = C7633f.f14647a;
            int[] iArr2 = C7633f.f14648b;
            int i17 = Integer.MIN_VALUE;
            int i18 = 0;
            int i19 = Integer.MIN_VALUE;
            while (true) {
                i12 = 2;
                if (i18 >= 2) {
                    break;
                }
                int i20 = iArr2[i18];
                if (i20 > i19) {
                    i19 = i20;
                }
                i18++;
            }
            float f10 = f6 - (i19 * f9);
            int i21 = iArr[0];
            if (i21 > Integer.MIN_VALUE) {
                i17 = i21;
            }
            int ceil = (int) Math.ceil(f6 / min);
            int max = (ceil - ((int) Math.max(1.0d, Math.floor((f10 - (i17 * dimension2)) / min)))) + 1;
            int[] iArr3 = new int[max];
            for (int i22 = 0; i22 < max; i22++) {
                iArr3[i22] = ceil - i22;
            }
            C7633f.C7634a c7634a = null;
            int i23 = 0;
            int i24 = 1;
            loop2: while (true) {
                if (i23 < max) {
                    int i25 = iArr3[i23];
                    while (i15 < i12) {
                        int i26 = iArr2[i15];
                        int i27 = i24;
                        int i28 = 0;
                        while (i28 < i16) {
                            int i29 = i28;
                            int i30 = i23;
                            int[] iArr4 = iArr3;
                            int i31 = i12;
                            f4 = f7;
                            C7633f.C7634a c7634a2 = new C7633f.C7634a(i27, f3, dimension, dimension2, iArr[i28], f9, i26, min, i25, f6);
                            float f11 = c7634a2.f14656h;
                            if (c7634a == null || f11 < c7634a.f14656h) {
                                if (f11 == 0.0f) {
                                    c7634a = c7634a2;
                                    break loop2;
                                }
                                c7634a = c7634a2;
                            }
                            i27++;
                            i28 = i29 + 1;
                            i23 = i30;
                            iArr3 = iArr4;
                            i12 = i31;
                            f7 = f4;
                            i16 = 1;
                        }
                        i15++;
                        i24 = i27;
                        i16 = 1;
                    }
                    i23++;
                    i15 = 0;
                    i16 = 1;
                } else {
                    f4 = f7;
                    break;
                }
            }
            float dimension5 = m10291d.getContext().getResources().getDimension(R.dimen.m3_carousel_gone_size) + f4;
            float f12 = dimension5 / 2.0f;
            float f13 = 0.0f - f12;
            float f14 = (c7634a.f14654f / 2.0f) + 0.0f;
            int i32 = c7634a.f14655g;
            float f15 = c7634a.f14654f;
            float max2 = (Math.max(0, i32 - 1) * f15) + f14;
            float f16 = (f15 / 2.0f) + max2;
            int i33 = c7634a.f14652d;
            if (i33 > 0) {
                max2 = (c7634a.f14653e / 2.0f) + f16;
            }
            if (i33 > 0) {
                f16 = (c7634a.f14653e / 2.0f) + max2;
            }
            int i34 = c7634a.f14651c;
            if (i34 > 0) {
                f5 = (c7634a.f14650b / 2.0f) + f16;
            } else {
                f5 = max2;
            }
            float f17 = f12 + this.f3728n;
            f = 1.0f;
            float f18 = 1.0f - ((dimension5 - f4) / (f15 - f4));
            float f19 = 1.0f - ((c7634a.f14650b - f4) / (f15 - f4));
            z3 = z;
            float f20 = 1.0f - ((c7634a.f14653e - f4) / (f15 - f4));
            C7628c.C7629a c7629a = new C7628c.C7629a(f15);
            c7629a.m4680a(f13, f18, dimension5, false);
            float f21 = c7634a.f14654f;
            if (i32 > 0 && f21 > 0.0f) {
                int i35 = 0;
                while (i35 < i32) {
                    c7629a.m4680a((i35 * f21) + f14, 0.0f, f21, true);
                    i35++;
                    i32 = i32;
                    f14 = f14;
                    m4702N0 = m4702N0;
                }
            }
            z2 = m4702N0;
            if (i33 > 0) {
                c7629a.m4680a(max2, f20, c7634a.f14653e, false);
            }
            if (i34 > 0) {
                float f22 = c7634a.f14650b;
                if (i34 > 0 && f22 > 0.0f) {
                    for (int i36 = 0; i36 < i34; i36++) {
                        c7629a.m4680a((i36 * f22) + f5, f19, f22, false);
                    }
                }
            }
            c7629a.m4680a(f17, f18, dimension5, false);
            C7628c m4679b = c7629a.m4679b();
            if (z2) {
                C7628c.C7629a c7629a2 = new C7628c.C7629a(m4679b.f14625a);
                float f23 = 2.0f;
                float f24 = m4679b.m4683b().f14637b - (m4679b.m4683b().f14639d / 2.0f);
                List<C7628c.C7630b> list6 = m4679b.f14626b;
                int size2 = list6.size() - 1;
                while (size2 >= 0) {
                    C7628c.C7630b c7630b = list6.get(size2);
                    float f25 = c7630b.f14639d;
                    float f26 = (f25 / f23) + f24;
                    if (size2 >= m4679b.f14627c && size2 <= m4679b.f14628d) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    c7629a2.m4680a(f26, c7630b.f14638c, f25, z6);
                    f24 += c7630b.f14639d;
                    size2--;
                    f23 = 2.0f;
                }
                m4679b = c7629a2.m4679b();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(m4679b);
            int i37 = 0;
            while (true) {
                list5 = m4679b.f14626b;
                if (i37 < list5.size()) {
                    if (list5.get(i37).f14637b >= 0.0f) {
                        break;
                    }
                    i37++;
                } else {
                    i37 = -1;
                    break;
                }
            }
            if (m4679b.m4684a().f14637b - (m4679b.m4684a().f14639d / 2.0f) > 0.0f && m4679b.m4684a() != m4679b.m4683b()) {
                z4 = false;
            } else {
                z4 = true;
            }
            int i38 = m4679b.f14628d;
            int i39 = m4679b.f14627c;
            if (!z4 && i37 != -1) {
                int i40 = (i39 - 1) - i37;
                float f27 = m4679b.m4683b().f14637b - (m4679b.m4683b().f14639d / 2.0f);
                for (int i41 = 0; i41 <= i40; i41++) {
                    C7628c c7628c3 = (C7628c) arrayList.get(arrayList.size() - 1);
                    int size3 = list5.size() - 1;
                    int i42 = (i37 + i41) - 1;
                    if (i42 >= 0) {
                        float f28 = list5.get(i42).f14638c;
                        int i43 = c7628c3.f14628d;
                        while (true) {
                            List<C7628c.C7630b> list7 = c7628c3.f14626b;
                            if (i43 >= list7.size()) {
                                size = list7.size() - 1;
                                break;
                            }
                            if (f28 == list7.get(i43).f14638c) {
                                size = i43;
                                break;
                            }
                            i43++;
                        }
                        size3 = size - 1;
                    }
                    arrayList.add(C7631d.m4676c(c7628c3, i37, size3, f27, (i39 - i41) - 1, (i38 - i41) - 1));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(m4679b);
            int size4 = list5.size() - 1;
            while (true) {
                if (size4 >= 0) {
                    carouselLayoutManager = this;
                    if (list5.get(size4).f14637b <= carouselLayoutManager.f3728n) {
                        break;
                    }
                    size4--;
                } else {
                    carouselLayoutManager = this;
                    size4 = -1;
                    break;
                }
            }
            if ((m4679b.m4682c().f14639d / 2.0f) + m4679b.m4682c().f14637b < carouselLayoutManager.f3728n && m4679b.m4682c() != m4679b.m4681d()) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (!z5 && size4 != -1) {
                int i44 = size4 - i38;
                float f29 = m4679b.m4683b().f14637b - (m4679b.m4683b().f14639d / 2.0f);
                for (int i45 = 0; i45 < i44; i45++) {
                    C7628c c7628c4 = (C7628c) arrayList2.get(arrayList2.size() - 1);
                    int i46 = (size4 - i45) + 1;
                    if (i46 < list5.size()) {
                        float f30 = list5.get(i46).f14638c;
                        int i47 = c7628c4.f14627c - 1;
                        while (true) {
                            if (i47 >= 0) {
                                if (f30 == c7628c4.f14626b.get(i47).f14638c) {
                                    i14 = 1;
                                    break;
                                }
                                i47--;
                            } else {
                                i14 = 1;
                                i47 = 0;
                                break;
                            }
                        }
                        i13 = i47 + i14;
                    } else {
                        i13 = 0;
                    }
                    arrayList2.add(C7631d.m4676c(c7628c4, size4, i13, f29, i39 + i45 + 1, i38 + i45 + 1));
                }
            }
            i = 1;
            carouselLayoutManager.f14614u = new C7631d(m4679b, arrayList, arrayList2);
        } else {
            carouselLayoutManager = this;
            z2 = m4702N0;
            z3 = z;
            i = 1;
            f = 1.0f;
        }
        C7631d c7631d = carouselLayoutManager.f14614u;
        boolean m4702N02 = m4702N0();
        if (m4702N02) {
            c7628c = c7631d.f14642c.get(list4.size() - 1);
        } else {
            c7628c = c7631d.f14641b.get(list.size() - 1);
        }
        if (m4702N02) {
            m4684a = c7628c.m4682c();
        } else {
            m4684a = c7628c.m4684a();
        }
        RecyclerView recyclerView = carouselLayoutManager.f3716b;
        if (recyclerView != null) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            i2 = ViewCompat.C0815e.m11740f(recyclerView);
        } else {
            i2 = 0;
        }
        if (m4702N02) {
            i3 = i;
        } else {
            i3 = -1;
        }
        float f31 = i2 * i3;
        int i48 = (int) m4684a.f14636a;
        int i49 = (int) (c7628c.f14625a / 2.0f);
        if (m4702N0()) {
            i4 = i48 + i49;
        } else {
            i4 = i48 - i49;
        }
        if (m4702N0()) {
            i5 = carouselLayoutManager.f3728n;
        } else {
            i5 = 0;
        }
        int i50 = (int) ((f31 + i5) - i4);
        C7631d c7631d2 = carouselLayoutManager.f14614u;
        boolean m4702N03 = m4702N0();
        if (m4702N03) {
            c7628c2 = c7631d2.f14641b.get(list3.size() - 1);
        } else {
            c7628c2 = c7631d2.f14642c.get(list2.size() - 1);
        }
        if (m4702N03) {
            m4682c = c7628c2.m4684a();
        } else {
            m4682c = c7628c2.m4682c();
        }
        float m10276b = (c1594v.m10276b() - 1) * c7628c2.f14625a;
        RecyclerView recyclerView2 = carouselLayoutManager.f3716b;
        if (recyclerView2 != null) {
            WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
            i6 = ViewCompat.C0815e.m11741e(recyclerView2);
        } else {
            i6 = 0;
        }
        float f32 = m10276b + i6;
        if (m4702N03) {
            f2 = -1.0f;
        } else {
            f2 = f;
        }
        float f33 = f32 * f2;
        float f34 = m4682c.f14636a;
        if (m4702N0()) {
            i7 = carouselLayoutManager.f3728n;
        } else {
            i7 = 0;
        }
        float f35 = f34 - i7;
        if (m4702N0()) {
            i8 = 0;
        } else {
            i8 = carouselLayoutManager.f3728n;
        }
        float f36 = i8 - m4682c.f14636a;
        if (Math.abs(f35) > Math.abs(f33)) {
            i9 = 0;
        } else {
            i9 = (int) ((f33 - f35) + f36);
        }
        if (z2) {
            i10 = i9;
        } else {
            i10 = i50;
        }
        carouselLayoutManager.f14610q = i10;
        if (z2) {
            i9 = i50;
        }
        carouselLayoutManager.f14611r = i9;
        if (z3) {
            carouselLayoutManager.f14609p = i50;
        } else {
            int i51 = carouselLayoutManager.f14609p;
            int i52 = i51 + 0;
            if (i52 < i10) {
                i11 = i10 - i51;
            } else if (i52 > i9) {
                i11 = i9 - i51;
            } else {
                i11 = 0;
            }
            carouselLayoutManager.f14609p = i11 + i51;
        }
        carouselLayoutManager.f14616w = C0728a.m11870a(carouselLayoutManager.f14616w, 0, c1594v.m10276b());
        m4697S0();
        m10319q(c1586q);
        m4706J0(c1586q, c1594v);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: f0 */
    public final void mo4694f0(RecyclerView.C1594v c1594v) {
        if (m10313w() == 0) {
            this.f14616w = 0;
        } else {
            this.f14616w = RecyclerView.LayoutManager.m10336K(m10315v(0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: k */
    public final int mo4693k(@NonNull RecyclerView.C1594v c1594v) {
        return (int) this.f14614u.f14640a.f14625a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: l */
    public final int mo4692l(@NonNull RecyclerView.C1594v c1594v) {
        return this.f14609p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: m */
    public final int mo4691m(@NonNull RecyclerView.C1594v c1594v) {
        return this.f14611r - this.f14610q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: n0 */
    public final boolean mo4690n0(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z, boolean z2) {
        C7631d c7631d = this.f14614u;
        if (c7631d == null) {
            return false;
        }
        int m4704L0 = m4704L0(c7631d.f14640a, RecyclerView.LayoutManager.m10336K(view)) - this.f14609p;
        if (z2 || m4704L0 == 0) {
            return false;
        }
        recyclerView.scrollBy(m4704L0, 0);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: p0 */
    public final int mo4689p0(int i, RecyclerView.C1586q c1586q, RecyclerView.C1594v c1594v) {
        if (m10313w() == 0 || i == 0) {
            return 0;
        }
        int i2 = this.f14609p;
        int i3 = this.f14610q;
        int i4 = this.f14611r;
        int i5 = i2 + i;
        if (i5 < i3) {
            i = i3 - i2;
        } else if (i5 > i4) {
            i = i4 - i2;
        }
        this.f14609p = i2 + i;
        m4697S0();
        float f = this.f14615v.f14625a / 2.0f;
        int m4707I0 = m4707I0(RecyclerView.LayoutManager.m10336K(m10315v(0)));
        Rect rect = new Rect();
        for (int i6 = 0; i6 < m10313w(); i6++) {
            View m10315v = m10315v(i6);
            float m4711E0 = m4711E0(m4707I0, (int) f);
            C7625c m4703M0 = m4703M0(m4711E0, this.f14615v.f14626b, false);
            float m4708H0 = m4708H0(m10315v, m4711E0, m4703M0);
            if (m10315v instanceof InterfaceC7632e) {
                float f2 = m4703M0.f14622a.f14638c;
                float f3 = m4703M0.f14623b.f14638c;
                LinearInterpolator linearInterpolator = C7556a.f14282a;
                ((InterfaceC7632e) m10315v).m4675a();
            }
            super.mo4713A(m10315v, rect);
            m10315v.offsetLeftAndRight((int) (m4708H0 - (rect.left + f)));
            m4707I0 = m4711E0(m4707I0, (int) this.f14615v.f14625a);
        }
        m4706J0(c1586q, c1594v);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: q0 */
    public final void mo4688q0(int i) {
        C7631d c7631d = this.f14614u;
        if (c7631d == null) {
            return;
        }
        this.f14609p = m4704L0(c7631d.f14640a, i);
        this.f14616w = C0728a.m11870a(i, 0, Math.max(0, m10342E() - 1));
        m4697S0();
        m10320o0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    /* renamed from: s */
    public final RecyclerView.C1579k mo4687s() {
        return new RecyclerView.C1579k(-2, -2);
    }
}
