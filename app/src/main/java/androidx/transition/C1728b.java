package androidx.transition;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: androidx.transition.b */
/* loaded from: classes.dex */
public final class C1728b extends Transition {

    /* renamed from: A */
    public static final C1732d f4222A;

    /* renamed from: B */
    public static final C1733e f4223B;

    /* renamed from: C */
    public static final C1734f f4224C;

    /* renamed from: x */
    public static final String[] f4225x = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: y */
    public static final C1730b f4226y;

    /* renamed from: z */
    public static final C1731c f4227z;

    /* renamed from: androidx.transition.b$a */
    /* loaded from: classes.dex */
    public static class C1729a extends Property<Drawable, PointF> {

        /* renamed from: a */
        public final Rect f4228a;

        public C1729a() {
            super(PointF.class, "boundsOrigin");
            this.f4228a = new Rect();
        }

        @Override // android.util.Property
        public final PointF get(Drawable drawable) {
            Rect rect = this.f4228a;
            drawable.copyBounds(rect);
            return new PointF(rect.left, rect.top);
        }

        @Override // android.util.Property
        public final void set(Drawable drawable, PointF pointF) {
            Drawable drawable2 = drawable;
            PointF pointF2 = pointF;
            Rect rect = this.f4228a;
            drawable2.copyBounds(rect);
            rect.offsetTo(Math.round(pointF2.x), Math.round(pointF2.y));
            drawable2.setBounds(rect);
        }
    }

    /* renamed from: androidx.transition.b$b */
    /* loaded from: classes.dex */
    public static class C1730b extends Property<C1737i, PointF> {
        public C1730b() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(C1737i c1737i) {
            return null;
        }

        @Override // android.util.Property
        public final void set(C1737i c1737i, PointF pointF) {
            C1737i c1737i2 = c1737i;
            PointF pointF2 = pointF;
            c1737i2.getClass();
            c1737i2.f4231a = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            c1737i2.f4232b = round;
            int i = c1737i2.f4236f + 1;
            c1737i2.f4236f = i;
            if (i == c1737i2.f4237g) {
                C1770s.m9956a(c1737i2.f4235e, c1737i2.f4231a, round, c1737i2.f4233c, c1737i2.f4234d);
                c1737i2.f4236f = 0;
                c1737i2.f4237g = 0;
            }
        }
    }

    /* renamed from: androidx.transition.b$c */
    /* loaded from: classes.dex */
    public static class C1731c extends Property<C1737i, PointF> {
        public C1731c() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(C1737i c1737i) {
            return null;
        }

        @Override // android.util.Property
        public final void set(C1737i c1737i, PointF pointF) {
            C1737i c1737i2 = c1737i;
            PointF pointF2 = pointF;
            c1737i2.getClass();
            c1737i2.f4233c = Math.round(pointF2.x);
            int round = Math.round(pointF2.y);
            c1737i2.f4234d = round;
            int i = c1737i2.f4237g + 1;
            c1737i2.f4237g = i;
            if (c1737i2.f4236f == i) {
                C1770s.m9956a(c1737i2.f4235e, c1737i2.f4231a, c1737i2.f4232b, c1737i2.f4233c, round);
                c1737i2.f4236f = 0;
                c1737i2.f4237g = 0;
            }
        }
    }

    /* renamed from: androidx.transition.b$d */
    /* loaded from: classes.dex */
    public static class C1732d extends Property<View, PointF> {
        public C1732d() {
            super(PointF.class, "bottomRight");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C1770s.m9956a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* renamed from: androidx.transition.b$e */
    /* loaded from: classes.dex */
    public static class C1733e extends Property<View, PointF> {
        public C1733e() {
            super(PointF.class, "topLeft");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            C1770s.m9956a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* renamed from: androidx.transition.b$f */
    /* loaded from: classes.dex */
    public static class C1734f extends Property<View, PointF> {
        public C1734f() {
            super(PointF.class, "position");
        }

        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int round = Math.round(pointF2.x);
            int round2 = Math.round(pointF2.y);
            C1770s.m9956a(view2, round, round2, view2.getWidth() + round, view2.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.b$g */
    /* loaded from: classes.dex */
    public class C1735g extends AnimatorListenerAdapter {
        private C1737i mViewBounds;

        public C1735g(C1737i c1737i) {
            this.mViewBounds = c1737i;
        }
    }

    /* renamed from: androidx.transition.b$h */
    /* loaded from: classes.dex */
    public class C1736h extends C1757j {

        /* renamed from: a */
        public boolean f4229a = false;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f4230b;

        public C1736h(ViewGroup viewGroup) {
            this.f4230b = viewGroup;
        }

        @Override // androidx.transition.C1757j, androidx.transition.Transition.InterfaceC1723d
        /* renamed from: a */
        public final void mo9987a() {
            C1769r.m9957a(this.f4230b, false);
        }

        @Override // androidx.transition.C1757j, androidx.transition.Transition.InterfaceC1723d
        /* renamed from: b */
        public final void mo9986b() {
            C1769r.m9957a(this.f4230b, false);
            this.f4229a = true;
        }

        @Override // androidx.transition.Transition.InterfaceC1723d
        /* renamed from: c */
        public final void mo9962c(@NonNull Transition transition) {
            if (!this.f4229a) {
                C1769r.m9957a(this.f4230b, false);
            }
            transition.mo9966w(this);
        }

        @Override // androidx.transition.C1757j, androidx.transition.Transition.InterfaceC1723d
        /* renamed from: e */
        public final void mo9985e() {
            C1769r.m9957a(this.f4230b, true);
        }
    }

    /* renamed from: androidx.transition.b$i */
    /* loaded from: classes.dex */
    public static class C1737i {

        /* renamed from: a */
        public int f4231a;

        /* renamed from: b */
        public int f4232b;

        /* renamed from: c */
        public int f4233c;

        /* renamed from: d */
        public int f4234d;

        /* renamed from: e */
        public final View f4235e;

        /* renamed from: f */
        public int f4236f;

        /* renamed from: g */
        public int f4237g;

        public C1737i(View view) {
            this.f4235e = view;
        }
    }

    static {
        new C1729a();
        f4226y = new C1730b();
        f4227z = new C1731c();
        f4222A = new C1732d();
        f4223B = new C1733e();
        f4224C = new C1734f();
    }

    /* renamed from: I */
    public final void m9995I(C1766o c1766o) {
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        View view = c1766o.f4279b;
        if (ViewCompat.C0817g.m11729c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = c1766o.f4278a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", view.getParent());
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: d */
    public final void mo9972d(@NonNull C1766o c1766o) {
        m9995I(c1766o);
    }

    @Override // androidx.transition.Transition
    /* renamed from: h */
    public final void mo9970h(@NonNull C1766o c1766o) {
        m9995I(c1766o);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010e  */
    @Override // androidx.transition.Transition
    @androidx.annotation.Nullable
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator mo9994l(@androidx.annotation.NonNull android.view.ViewGroup r19, @androidx.annotation.Nullable androidx.transition.C1766o r20, @androidx.annotation.Nullable androidx.transition.C1766o r21) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1728b.mo9994l(android.view.ViewGroup, androidx.transition.o, androidx.transition.o):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    @Nullable
    /* renamed from: q */
    public final String[] mo9993q() {
        return f4225x;
    }
}
