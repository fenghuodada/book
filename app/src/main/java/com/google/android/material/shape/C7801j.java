package com.google.android.material.shape;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import androidx.annotation.AttrRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import com.google.android.material.C7621c;

/* renamed from: com.google.android.material.shape.j */
/* loaded from: classes3.dex */
public final class C7801j {

    /* renamed from: a */
    public final C7795d f15233a;

    /* renamed from: b */
    public final C7795d f15234b;

    /* renamed from: c */
    public final C7795d f15235c;

    /* renamed from: d */
    public final C7795d f15236d;

    /* renamed from: e */
    public final InterfaceC7794c f15237e;

    /* renamed from: f */
    public final InterfaceC7794c f15238f;

    /* renamed from: g */
    public final InterfaceC7794c f15239g;

    /* renamed from: h */
    public final InterfaceC7794c f15240h;

    /* renamed from: i */
    public final C7797f f15241i;

    /* renamed from: j */
    public final C7797f f15242j;

    /* renamed from: k */
    public final C7797f f15243k;

    /* renamed from: l */
    public final C7797f f15244l;

    public C7801j() {
        this.f15233a = new C7800i();
        this.f15234b = new C7800i();
        this.f15235c = new C7800i();
        this.f15236d = new C7800i();
        this.f15237e = new C7792a(0.0f);
        this.f15238f = new C7792a(0.0f);
        this.f15239g = new C7792a(0.0f);
        this.f15240h = new C7792a(0.0f);
        this.f15241i = new C7797f();
        this.f15242j = new C7797f();
        this.f15243k = new C7797f();
        this.f15244l = new C7797f();
    }

    @NonNull
    /* renamed from: a */
    public static C7802a m4458a(Context context, @StyleRes int i, @StyleRes int i2, @NonNull C7792a c7792a) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C7621c.f14602v);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            InterfaceC7794c m4456c = m4456c(obtainStyledAttributes, 5, c7792a);
            InterfaceC7794c m4456c2 = m4456c(obtainStyledAttributes, 8, m4456c);
            InterfaceC7794c m4456c3 = m4456c(obtainStyledAttributes, 9, m4456c);
            InterfaceC7794c m4456c4 = m4456c(obtainStyledAttributes, 7, m4456c);
            InterfaceC7794c m4456c5 = m4456c(obtainStyledAttributes, 6, m4456c);
            C7802a c7802a = new C7802a();
            C7795d m4462a = C7798g.m4462a(i4);
            c7802a.f15245a = m4462a;
            float m4453b = C7802a.m4453b(m4462a);
            if (m4453b != -1.0f) {
                c7802a.f15249e = new C7792a(m4453b);
            }
            c7802a.f15249e = m4456c2;
            C7795d m4462a2 = C7798g.m4462a(i5);
            c7802a.f15246b = m4462a2;
            float m4453b2 = C7802a.m4453b(m4462a2);
            if (m4453b2 != -1.0f) {
                c7802a.f15250f = new C7792a(m4453b2);
            }
            c7802a.f15250f = m4456c3;
            C7795d m4462a3 = C7798g.m4462a(i6);
            c7802a.f15247c = m4462a3;
            float m4453b3 = C7802a.m4453b(m4462a3);
            if (m4453b3 != -1.0f) {
                c7802a.f15251g = new C7792a(m4453b3);
            }
            c7802a.f15251g = m4456c4;
            C7795d m4462a4 = C7798g.m4462a(i7);
            c7802a.f15248d = m4462a4;
            float m4453b4 = C7802a.m4453b(m4462a4);
            if (m4453b4 != -1.0f) {
                c7802a.f15252h = new C7792a(m4453b4);
            }
            c7802a.f15252h = m4456c5;
            return c7802a;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    @NonNull
    /* renamed from: b */
    public static C7802a m4457b(@NonNull Context context, AttributeSet attributeSet, @AttrRes int i, @StyleRes int i2) {
        C7792a c7792a = new C7792a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7621c.f14596p, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return m4458a(context, resourceId, resourceId2, c7792a);
    }

    @NonNull
    /* renamed from: c */
    public static InterfaceC7794c m4456c(TypedArray typedArray, int i, @NonNull InterfaceC7794c interfaceC7794c) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return interfaceC7794c;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new C7792a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C7799h(peekValue.getFraction(1.0f, 1.0f)) : interfaceC7794c;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: d */
    public final boolean m4455d(@NonNull RectF rectF) {
        boolean z = this.f15244l.getClass().equals(C7797f.class) && this.f15242j.getClass().equals(C7797f.class) && this.f15241i.getClass().equals(C7797f.class) && this.f15243k.getClass().equals(C7797f.class);
        float mo4460a = this.f15237e.mo4460a(rectF);
        return z && ((this.f15238f.mo4460a(rectF) > mo4460a ? 1 : (this.f15238f.mo4460a(rectF) == mo4460a ? 0 : -1)) == 0 && (this.f15240h.mo4460a(rectF) > mo4460a ? 1 : (this.f15240h.mo4460a(rectF) == mo4460a ? 0 : -1)) == 0 && (this.f15239g.mo4460a(rectF) > mo4460a ? 1 : (this.f15239g.mo4460a(rectF) == mo4460a ? 0 : -1)) == 0) && ((this.f15234b instanceof C7800i) && (this.f15233a instanceof C7800i) && (this.f15235c instanceof C7800i) && (this.f15236d instanceof C7800i));
    }

    /* renamed from: com.google.android.material.shape.j$a */
    /* loaded from: classes3.dex */
    public static final class C7802a {
        @NonNull

        /* renamed from: a */
        public C7795d f15245a;
        @NonNull

        /* renamed from: b */
        public C7795d f15246b;
        @NonNull

        /* renamed from: c */
        public C7795d f15247c;
        @NonNull

        /* renamed from: d */
        public C7795d f15248d;
        @NonNull

        /* renamed from: e */
        public InterfaceC7794c f15249e;
        @NonNull

        /* renamed from: f */
        public InterfaceC7794c f15250f;
        @NonNull

        /* renamed from: g */
        public InterfaceC7794c f15251g;
        @NonNull

        /* renamed from: h */
        public InterfaceC7794c f15252h;
        @NonNull

        /* renamed from: i */
        public final C7797f f15253i;
        @NonNull

        /* renamed from: j */
        public final C7797f f15254j;
        @NonNull

        /* renamed from: k */
        public final C7797f f15255k;
        @NonNull

        /* renamed from: l */
        public final C7797f f15256l;

        public C7802a() {
            this.f15245a = new C7800i();
            this.f15246b = new C7800i();
            this.f15247c = new C7800i();
            this.f15248d = new C7800i();
            this.f15249e = new C7792a(0.0f);
            this.f15250f = new C7792a(0.0f);
            this.f15251g = new C7792a(0.0f);
            this.f15252h = new C7792a(0.0f);
            this.f15253i = new C7797f();
            this.f15254j = new C7797f();
            this.f15255k = new C7797f();
            this.f15256l = new C7797f();
        }

        /* renamed from: b */
        public static float m4453b(C7795d c7795d) {
            if (c7795d instanceof C7800i) {
                return ((C7800i) c7795d).f15232a;
            }
            if (c7795d instanceof C7796e) {
                return ((C7796e) c7795d).f15230a;
            }
            return -1.0f;
        }

        @NonNull
        /* renamed from: a */
        public final C7801j m4454a() {
            return new C7801j(this);
        }

        public C7802a(@NonNull C7801j c7801j) {
            this.f15245a = new C7800i();
            this.f15246b = new C7800i();
            this.f15247c = new C7800i();
            this.f15248d = new C7800i();
            this.f15249e = new C7792a(0.0f);
            this.f15250f = new C7792a(0.0f);
            this.f15251g = new C7792a(0.0f);
            this.f15252h = new C7792a(0.0f);
            this.f15253i = new C7797f();
            this.f15254j = new C7797f();
            this.f15255k = new C7797f();
            this.f15256l = new C7797f();
            this.f15245a = c7801j.f15233a;
            this.f15246b = c7801j.f15234b;
            this.f15247c = c7801j.f15235c;
            this.f15248d = c7801j.f15236d;
            this.f15249e = c7801j.f15237e;
            this.f15250f = c7801j.f15238f;
            this.f15251g = c7801j.f15239g;
            this.f15252h = c7801j.f15240h;
            this.f15253i = c7801j.f15241i;
            this.f15254j = c7801j.f15242j;
            this.f15255k = c7801j.f15243k;
            this.f15256l = c7801j.f15244l;
        }
    }

    public C7801j(C7802a c7802a) {
        this.f15233a = c7802a.f15245a;
        this.f15234b = c7802a.f15246b;
        this.f15235c = c7802a.f15247c;
        this.f15236d = c7802a.f15248d;
        this.f15237e = c7802a.f15249e;
        this.f15238f = c7802a.f15250f;
        this.f15239g = c7802a.f15251g;
        this.f15240h = c7802a.f15252h;
        this.f15241i = c7802a.f15253i;
        this.f15242j = c7802a.f15254j;
        this.f15243k = c7802a.f15255k;
        this.f15244l = c7802a.f15256l;
    }
}
