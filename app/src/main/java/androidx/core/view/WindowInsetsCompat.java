package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.C0235r;
import androidx.core.graphics.C0690b;
import androidx.core.util.C0799c;
import androidx.core.view.C0930i;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class WindowInsetsCompat {
    @NonNull

    /* renamed from: b */
    public static final WindowInsetsCompat f2564b;

    /* renamed from: a */
    public final C0849k f2565a;

    /* loaded from: classes.dex */
    public static final class Type {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
        /* loaded from: classes.dex */
        public @interface InsetsType {
        }

        /* renamed from: a */
        public static int m11634a(int i) {
            if (i != 1) {
                if (i == 2) {
                    return 1;
                }
                if (i == 4) {
                    return 2;
                }
                if (i != 8) {
                    if (i == 16) {
                        return 4;
                    }
                    if (i != 32) {
                        if (i != 64) {
                            if (i != 128) {
                                if (i == 256) {
                                    return 8;
                                }
                                throw new IllegalArgumentException(C0235r.m12816a("type needs to be >= FIRST and <= LAST, type=", i));
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 3;
            }
            return 0;
        }
    }

    @RequiresApi(21)
    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: androidx.core.view.WindowInsetsCompat$a */
    /* loaded from: classes.dex */
    public static class C0839a {

        /* renamed from: a */
        public static final Field f2566a;

        /* renamed from: b */
        public static final Field f2567b;

        /* renamed from: c */
        public static final Field f2568c;

        /* renamed from: d */
        public static final boolean f2569d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f2566a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f2567b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f2568c = declaredField3;
                declaredField3.setAccessible(true);
                f2569d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }
    }

    @RequiresApi(api = 20)
    /* renamed from: androidx.core.view.WindowInsetsCompat$b */
    /* loaded from: classes.dex */
    public static class C0840b extends C0843e {

        /* renamed from: e */
        public static Field f2570e = null;

        /* renamed from: f */
        public static boolean f2571f = false;

        /* renamed from: g */
        public static Constructor<WindowInsets> f2572g = null;

        /* renamed from: h */
        public static boolean f2573h = false;

        /* renamed from: c */
        public WindowInsets f2574c;

        /* renamed from: d */
        public C0690b f2575d;

        public C0840b() {
            this.f2574c = m11633i();
        }

        public C0840b(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.f2574c = windowInsetsCompat.m11636h();
        }

        @Nullable
        /* renamed from: i */
        private static WindowInsets m11633i() {
            if (!f2571f) {
                try {
                    f2570e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f2571f = true;
            }
            Field field = f2570e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f2573h) {
                try {
                    f2572g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f2573h = true;
            }
            Constructor<WindowInsets> constructor = f2572g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0843e
        @NonNull
        /* renamed from: b */
        public WindowInsetsCompat mo11631b() {
            m11632a();
            WindowInsetsCompat m11635i = WindowInsetsCompat.m11635i(null, this.f2574c);
            C0690b[] c0690bArr = this.f2578b;
            C0849k c0849k = m11635i.f2565a;
            c0849k.mo11603p(c0690bArr);
            c0849k.mo11601r(this.f2575d);
            return m11635i;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0843e
        /* renamed from: e */
        public void mo11628e(@Nullable C0690b c0690b) {
            this.f2575d = c0690b;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0843e
        /* renamed from: g */
        public void mo11626g(@NonNull C0690b c0690b) {
            WindowInsets windowInsets = this.f2574c;
            if (windowInsets != null) {
                this.f2574c = windowInsets.replaceSystemWindowInsets(c0690b.f2384a, c0690b.f2385b, c0690b.f2386c, c0690b.f2387d);
            }
        }
    }

    @RequiresApi(api = 29)
    /* renamed from: androidx.core.view.WindowInsetsCompat$c */
    /* loaded from: classes.dex */
    public static class C0841c extends C0843e {

        /* renamed from: c */
        public final WindowInsets.Builder f2576c;

        public C0841c() {
            this.f2576c = new WindowInsets.Builder();
        }

        public C0841c(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            WindowInsets m11636h = windowInsetsCompat.m11636h();
            this.f2576c = m11636h != null ? new WindowInsets.Builder(m11636h) : new WindowInsets.Builder();
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0843e
        @NonNull
        /* renamed from: b */
        public WindowInsetsCompat mo11631b() {
            WindowInsets build;
            m11632a();
            build = this.f2576c.build();
            WindowInsetsCompat m11635i = WindowInsetsCompat.m11635i(null, build);
            m11635i.f2565a.mo11603p(this.f2578b);
            return m11635i;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0843e
        /* renamed from: d */
        public void mo11629d(@NonNull C0690b c0690b) {
            this.f2576c.setMandatorySystemGestureInsets(c0690b.m11966d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0843e
        /* renamed from: e */
        public void mo11628e(@NonNull C0690b c0690b) {
            this.f2576c.setStableInsets(c0690b.m11966d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0843e
        /* renamed from: f */
        public void mo11627f(@NonNull C0690b c0690b) {
            this.f2576c.setSystemGestureInsets(c0690b.m11966d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0843e
        /* renamed from: g */
        public void mo11626g(@NonNull C0690b c0690b) {
            this.f2576c.setSystemWindowInsets(c0690b.m11966d());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0843e
        /* renamed from: h */
        public void mo11625h(@NonNull C0690b c0690b) {
            this.f2576c.setTappableElementInsets(c0690b.m11966d());
        }
    }

    @RequiresApi(30)
    /* renamed from: androidx.core.view.WindowInsetsCompat$d */
    /* loaded from: classes.dex */
    public static class C0842d extends C0841c {
        public C0842d() {
        }

        public C0842d(@NonNull WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0843e
        /* renamed from: c */
        public void mo11630c(int i, @NonNull C0690b c0690b) {
            this.f2576c.setInsets(C0850l.m11600a(i), c0690b.m11966d());
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$e */
    /* loaded from: classes.dex */
    public static class C0843e {

        /* renamed from: a */
        public final WindowInsetsCompat f2577a;

        /* renamed from: b */
        public C0690b[] f2578b;

        public C0843e() {
            this(new WindowInsetsCompat());
        }

        public C0843e(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f2577a = windowInsetsCompat;
        }

        /* renamed from: a */
        public final void m11632a() {
            C0690b[] c0690bArr = this.f2578b;
            if (c0690bArr != null) {
                C0690b c0690b = c0690bArr[Type.m11634a(1)];
                C0690b c0690b2 = this.f2578b[Type.m11634a(2)];
                WindowInsetsCompat windowInsetsCompat = this.f2577a;
                if (c0690b2 == null) {
                    c0690b2 = windowInsetsCompat.m11643a(2);
                }
                if (c0690b == null) {
                    c0690b = windowInsetsCompat.m11643a(1);
                }
                mo11626g(C0690b.m11969a(c0690b, c0690b2));
                C0690b c0690b3 = this.f2578b[Type.m11634a(16)];
                if (c0690b3 != null) {
                    mo11627f(c0690b3);
                }
                C0690b c0690b4 = this.f2578b[Type.m11634a(32)];
                if (c0690b4 != null) {
                    mo11629d(c0690b4);
                }
                C0690b c0690b5 = this.f2578b[Type.m11634a(64)];
                if (c0690b5 != null) {
                    mo11625h(c0690b5);
                }
            }
        }

        @NonNull
        /* renamed from: b */
        public WindowInsetsCompat mo11631b() {
            throw null;
        }

        /* renamed from: c */
        public void mo11630c(int i, @NonNull C0690b c0690b) {
            if (this.f2578b == null) {
                this.f2578b = new C0690b[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.f2578b[Type.m11634a(i2)] = c0690b;
                }
            }
        }

        /* renamed from: d */
        public void mo11629d(@NonNull C0690b c0690b) {
        }

        /* renamed from: e */
        public void mo11628e(@NonNull C0690b c0690b) {
            throw null;
        }

        /* renamed from: f */
        public void mo11627f(@NonNull C0690b c0690b) {
        }

        /* renamed from: g */
        public void mo11626g(@NonNull C0690b c0690b) {
            throw null;
        }

        /* renamed from: h */
        public void mo11625h(@NonNull C0690b c0690b) {
        }
    }

    @RequiresApi(20)
    /* renamed from: androidx.core.view.WindowInsetsCompat$f */
    /* loaded from: classes.dex */
    public static class C0844f extends C0849k {

        /* renamed from: h */
        public static boolean f2579h = false;

        /* renamed from: i */
        public static Method f2580i;

        /* renamed from: j */
        public static Class<?> f2581j;

        /* renamed from: k */
        public static Field f2582k;

        /* renamed from: l */
        public static Field f2583l;
        @NonNull

        /* renamed from: c */
        public final WindowInsets f2584c;

        /* renamed from: d */
        public C0690b[] f2585d;

        /* renamed from: e */
        public C0690b f2586e;

        /* renamed from: f */
        public WindowInsetsCompat f2587f;

        /* renamed from: g */
        public C0690b f2588g;

        public C0844f(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.f2586e = null;
            this.f2584c = windowInsets;
        }

        @NonNull
        @SuppressLint({"WrongConstant"})
        /* renamed from: s */
        private C0690b m11624s(int i, boolean z) {
            C0690b c0690b = C0690b.f2383e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    c0690b = C0690b.m11969a(c0690b, m11623t(i2, z));
                }
            }
            return c0690b;
        }

        /* renamed from: u */
        private C0690b m11622u() {
            WindowInsetsCompat windowInsetsCompat = this.f2587f;
            if (windowInsetsCompat != null) {
                return windowInsetsCompat.f2565a.mo11610i();
            }
            return C0690b.f2383e;
        }

        @Nullable
        /* renamed from: v */
        private C0690b m11621v(@NonNull View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f2579h) {
                    m11620w();
                }
                Method method = f2580i;
                if (method != null && f2581j != null && f2582k != null) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f2582k.get(f2583l.get(invoke));
                        if (rect == null) {
                            return null;
                        }
                        return C0690b.m11968b(rect.left, rect.top, rect.right, rect.bottom);
                    } catch (ReflectiveOperationException e) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: w */
        private static void m11620w() {
            try {
                f2580i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f2581j = cls;
                f2582k = cls.getDeclaredField("mVisibleInsets");
                f2583l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f2582k.setAccessible(true);
                f2583l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f2579h = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        /* renamed from: d */
        public void mo11615d(@NonNull View view) {
            C0690b m11621v = m11621v(view);
            if (m11621v == null) {
                m11621v = C0690b.f2383e;
            }
            m11619x(m11621v);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f2588g, ((C0844f) obj).f2588g);
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        @NonNull
        /* renamed from: f */
        public C0690b mo11613f(int i) {
            return m11624s(i, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        @NonNull
        /* renamed from: g */
        public C0690b mo11612g(int i) {
            return m11624s(i, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        @NonNull
        /* renamed from: k */
        public final C0690b mo11608k() {
            if (this.f2586e == null) {
                WindowInsets windowInsets = this.f2584c;
                this.f2586e = C0690b.m11968b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f2586e;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        @NonNull
        /* renamed from: m */
        public WindowInsetsCompat mo11606m(int i, int i2, int i3, int i4) {
            C0843e c0840b;
            WindowInsetsCompat m11635i = WindowInsetsCompat.m11635i(null, this.f2584c);
            int i5 = Build.VERSION.SDK_INT;
            if (i5 >= 30) {
                c0840b = new C0842d(m11635i);
            } else if (i5 >= 29) {
                c0840b = new C0841c(m11635i);
            } else {
                c0840b = new C0840b(m11635i);
            }
            c0840b.mo11626g(WindowInsetsCompat.m11638f(mo11608k(), i, i2, i3, i4));
            c0840b.mo11628e(WindowInsetsCompat.m11638f(mo11610i(), i, i2, i3, i4));
            return c0840b.mo11631b();
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        /* renamed from: o */
        public boolean mo11604o() {
            return this.f2584c.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        /* renamed from: p */
        public void mo11603p(C0690b[] c0690bArr) {
            this.f2585d = c0690bArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        /* renamed from: q */
        public void mo11602q(@Nullable WindowInsetsCompat windowInsetsCompat) {
            this.f2587f = windowInsetsCompat;
        }

        @NonNull
        /* renamed from: t */
        public C0690b m11623t(int i, boolean z) {
            int i2;
            C0930i mo11614e;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (i != 1) {
                C0690b c0690b = null;
                if (i != 2) {
                    C0690b c0690b2 = C0690b.f2383e;
                    if (i != 8) {
                        if (i != 16) {
                            if (i != 32) {
                                if (i != 64) {
                                    if (i != 128) {
                                        return c0690b2;
                                    }
                                    WindowInsetsCompat windowInsetsCompat = this.f2587f;
                                    if (windowInsetsCompat != null) {
                                        mo11614e = windowInsetsCompat.f2565a.mo11614e();
                                    } else {
                                        mo11614e = mo11614e();
                                    }
                                    if (mo11614e != null) {
                                        int i7 = Build.VERSION.SDK_INT;
                                        DisplayCutout displayCutout = mo11614e.f2637a;
                                        if (i7 >= 28) {
                                            i3 = C0930i.C0931a.m11457d(displayCutout);
                                        } else {
                                            i3 = 0;
                                        }
                                        if (i7 >= 28) {
                                            i4 = C0930i.C0931a.m11455f(displayCutout);
                                        } else {
                                            i4 = 0;
                                        }
                                        if (i7 >= 28) {
                                            i5 = C0930i.C0931a.m11456e(displayCutout);
                                        } else {
                                            i5 = 0;
                                        }
                                        if (i7 >= 28) {
                                            i6 = C0930i.C0931a.m11458c(displayCutout);
                                        }
                                        return C0690b.m11968b(i3, i4, i5, i6);
                                    }
                                    return c0690b2;
                                }
                                return mo11607l();
                            }
                            return mo11611h();
                        }
                        return mo11609j();
                    }
                    C0690b[] c0690bArr = this.f2585d;
                    if (c0690bArr != null) {
                        c0690b = c0690bArr[Type.m11634a(8)];
                    }
                    if (c0690b != null) {
                        return c0690b;
                    }
                    C0690b mo11608k = mo11608k();
                    C0690b m11622u = m11622u();
                    int i8 = mo11608k.f2387d;
                    if (i8 > m11622u.f2387d) {
                        return C0690b.m11968b(0, 0, 0, i8);
                    }
                    C0690b c0690b3 = this.f2588g;
                    if (c0690b3 != null && !c0690b3.equals(c0690b2) && (i2 = this.f2588g.f2387d) > m11622u.f2387d) {
                        return C0690b.m11968b(0, 0, 0, i2);
                    }
                    return c0690b2;
                } else if (z) {
                    C0690b m11622u2 = m11622u();
                    C0690b mo11610i = mo11610i();
                    return C0690b.m11968b(Math.max(m11622u2.f2384a, mo11610i.f2384a), 0, Math.max(m11622u2.f2386c, mo11610i.f2386c), Math.max(m11622u2.f2387d, mo11610i.f2387d));
                } else {
                    C0690b mo11608k2 = mo11608k();
                    WindowInsetsCompat windowInsetsCompat2 = this.f2587f;
                    if (windowInsetsCompat2 != null) {
                        c0690b = windowInsetsCompat2.f2565a.mo11610i();
                    }
                    int i9 = mo11608k2.f2387d;
                    if (c0690b != null) {
                        i9 = Math.min(i9, c0690b.f2387d);
                    }
                    return C0690b.m11968b(mo11608k2.f2384a, 0, mo11608k2.f2386c, i9);
                }
            } else if (z) {
                return C0690b.m11968b(0, Math.max(m11622u().f2385b, mo11608k().f2385b), 0, 0);
            } else {
                return C0690b.m11968b(0, mo11608k().f2385b, 0, 0);
            }
        }

        /* renamed from: x */
        public void m11619x(@NonNull C0690b c0690b) {
            this.f2588g = c0690b;
        }
    }

    @RequiresApi(21)
    /* renamed from: androidx.core.view.WindowInsetsCompat$g */
    /* loaded from: classes.dex */
    public static class C0845g extends C0844f {

        /* renamed from: m */
        public C0690b f2589m;

        public C0845g(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f2589m = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        @NonNull
        /* renamed from: b */
        public WindowInsetsCompat mo11617b() {
            return WindowInsetsCompat.m11635i(null, this.f2584c.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        @NonNull
        /* renamed from: c */
        public WindowInsetsCompat mo11616c() {
            return WindowInsetsCompat.m11635i(null, this.f2584c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        @NonNull
        /* renamed from: i */
        public final C0690b mo11610i() {
            if (this.f2589m == null) {
                WindowInsets windowInsets = this.f2584c;
                this.f2589m = C0690b.m11968b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f2589m;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        /* renamed from: n */
        public boolean mo11605n() {
            return this.f2584c.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        /* renamed from: r */
        public void mo11601r(@Nullable C0690b c0690b) {
            this.f2589m = c0690b;
        }
    }

    @RequiresApi(28)
    /* renamed from: androidx.core.view.WindowInsetsCompat$h */
    /* loaded from: classes.dex */
    public static class C0846h extends C0845g {
        public C0846h(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        @NonNull
        /* renamed from: a */
        public WindowInsetsCompat mo11618a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f2584c.consumeDisplayCutout();
            return WindowInsetsCompat.m11635i(null, consumeDisplayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        @Nullable
        /* renamed from: e */
        public C0930i mo11614e() {
            DisplayCutout displayCutout;
            displayCutout = this.f2584c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new C0930i(displayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0844f, androidx.core.view.WindowInsetsCompat.C0849k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0846h) {
                C0846h c0846h = (C0846h) obj;
                return Objects.equals(this.f2584c, c0846h.f2584c) && Objects.equals(this.f2588g, c0846h.f2588g);
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        public int hashCode() {
            return this.f2584c.hashCode();
        }
    }

    @RequiresApi(29)
    /* renamed from: androidx.core.view.WindowInsetsCompat$i */
    /* loaded from: classes.dex */
    public static class C0847i extends C0846h {

        /* renamed from: n */
        public C0690b f2590n;

        /* renamed from: o */
        public C0690b f2591o;

        /* renamed from: p */
        public C0690b f2592p;

        public C0847i(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.f2590n = null;
            this.f2591o = null;
            this.f2592p = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        @NonNull
        /* renamed from: h */
        public C0690b mo11611h() {
            Insets mandatorySystemGestureInsets;
            if (this.f2591o == null) {
                mandatorySystemGestureInsets = this.f2584c.getMandatorySystemGestureInsets();
                this.f2591o = C0690b.m11967c(mandatorySystemGestureInsets);
            }
            return this.f2591o;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        @NonNull
        /* renamed from: j */
        public C0690b mo11609j() {
            Insets systemGestureInsets;
            if (this.f2590n == null) {
                systemGestureInsets = this.f2584c.getSystemGestureInsets();
                this.f2590n = C0690b.m11967c(systemGestureInsets);
            }
            return this.f2590n;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0849k
        @NonNull
        /* renamed from: l */
        public C0690b mo11607l() {
            Insets tappableElementInsets;
            if (this.f2592p == null) {
                tappableElementInsets = this.f2584c.getTappableElementInsets();
                this.f2592p = C0690b.m11967c(tappableElementInsets);
            }
            return this.f2592p;
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0844f, androidx.core.view.WindowInsetsCompat.C0849k
        @NonNull
        /* renamed from: m */
        public WindowInsetsCompat mo11606m(int i, int i2, int i3, int i4) {
            WindowInsets inset;
            inset = this.f2584c.inset(i, i2, i3, i4);
            return WindowInsetsCompat.m11635i(null, inset);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0845g, androidx.core.view.WindowInsetsCompat.C0849k
        /* renamed from: r */
        public void mo11601r(@Nullable C0690b c0690b) {
        }
    }

    @RequiresApi(30)
    /* renamed from: androidx.core.view.WindowInsetsCompat$j */
    /* loaded from: classes.dex */
    public static class C0848j extends C0847i {
        @NonNull

        /* renamed from: q */
        public static final WindowInsetsCompat f2593q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f2593q = WindowInsetsCompat.m11635i(null, windowInsets);
        }

        public C0848j(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0844f, androidx.core.view.WindowInsetsCompat.C0849k
        /* renamed from: d */
        public final void mo11615d(@NonNull View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0844f, androidx.core.view.WindowInsetsCompat.C0849k
        @NonNull
        /* renamed from: f */
        public C0690b mo11613f(int i) {
            Insets insets;
            insets = this.f2584c.getInsets(C0850l.m11600a(i));
            return C0690b.m11967c(insets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.C0844f, androidx.core.view.WindowInsetsCompat.C0849k
        @NonNull
        /* renamed from: g */
        public C0690b mo11612g(int i) {
            Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.f2584c.getInsetsIgnoringVisibility(C0850l.m11600a(i));
            return C0690b.m11967c(insetsIgnoringVisibility);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsCompat$k */
    /* loaded from: classes.dex */
    public static class C0849k {
        @NonNull

        /* renamed from: b */
        public static final WindowInsetsCompat f2594b;

        /* renamed from: a */
        public final WindowInsetsCompat f2595a;

        static {
            C0843e c0840b;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                c0840b = new C0842d();
            } else if (i >= 29) {
                c0840b = new C0841c();
            } else {
                c0840b = new C0840b();
            }
            f2594b = c0840b.mo11631b().f2565a.mo11618a().f2565a.mo11617b().f2565a.mo11616c();
        }

        public C0849k(@NonNull WindowInsetsCompat windowInsetsCompat) {
            this.f2595a = windowInsetsCompat;
        }

        @NonNull
        /* renamed from: a */
        public WindowInsetsCompat mo11618a() {
            return this.f2595a;
        }

        @NonNull
        /* renamed from: b */
        public WindowInsetsCompat mo11617b() {
            return this.f2595a;
        }

        @NonNull
        /* renamed from: c */
        public WindowInsetsCompat mo11616c() {
            return this.f2595a;
        }

        /* renamed from: d */
        public void mo11615d(@NonNull View view) {
        }

        @Nullable
        /* renamed from: e */
        public C0930i mo11614e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0849k)) {
                return false;
            }
            C0849k c0849k = (C0849k) obj;
            if (mo11604o() == c0849k.mo11604o() && mo11605n() == c0849k.mo11605n() && C0799c.m11795a(mo11608k(), c0849k.mo11608k()) && C0799c.m11795a(mo11610i(), c0849k.mo11610i()) && C0799c.m11795a(mo11614e(), c0849k.mo11614e())) {
                return true;
            }
            return false;
        }

        @NonNull
        /* renamed from: f */
        public C0690b mo11613f(int i) {
            return C0690b.f2383e;
        }

        @NonNull
        /* renamed from: g */
        public C0690b mo11612g(int i) {
            if ((i & 8) == 0) {
                return C0690b.f2383e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        @NonNull
        /* renamed from: h */
        public C0690b mo11611h() {
            return mo11608k();
        }

        public int hashCode() {
            return C0799c.m11794b(Boolean.valueOf(mo11604o()), Boolean.valueOf(mo11605n()), mo11608k(), mo11610i(), mo11614e());
        }

        @NonNull
        /* renamed from: i */
        public C0690b mo11610i() {
            return C0690b.f2383e;
        }

        @NonNull
        /* renamed from: j */
        public C0690b mo11609j() {
            return mo11608k();
        }

        @NonNull
        /* renamed from: k */
        public C0690b mo11608k() {
            return C0690b.f2383e;
        }

        @NonNull
        /* renamed from: l */
        public C0690b mo11607l() {
            return mo11608k();
        }

        @NonNull
        /* renamed from: m */
        public WindowInsetsCompat mo11606m(int i, int i2, int i3, int i4) {
            return f2594b;
        }

        /* renamed from: n */
        public boolean mo11605n() {
            return false;
        }

        /* renamed from: o */
        public boolean mo11604o() {
            return false;
        }

        /* renamed from: p */
        public void mo11603p(C0690b[] c0690bArr) {
        }

        /* renamed from: q */
        public void mo11602q(@Nullable WindowInsetsCompat windowInsetsCompat) {
        }

        /* renamed from: r */
        public void mo11601r(C0690b c0690b) {
        }
    }

    @RequiresApi(30)
    /* renamed from: androidx.core.view.WindowInsetsCompat$l */
    /* loaded from: classes.dex */
    public static final class C0850l {
        /* renamed from: a */
        public static int m11600a(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static {
        f2564b = Build.VERSION.SDK_INT >= 30 ? C0848j.f2593q : C0849k.f2594b;
    }

    public WindowInsetsCompat() {
        this.f2565a = new C0849k(this);
    }

    @RequiresApi(20)
    public WindowInsetsCompat(@NonNull WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        this.f2565a = i >= 30 ? new C0848j(this, windowInsets) : i >= 29 ? new C0847i(this, windowInsets) : i >= 28 ? new C0846h(this, windowInsets) : new C0845g(this, windowInsets);
    }

    /* renamed from: f */
    public static C0690b m11638f(@NonNull C0690b c0690b, int i, int i2, int i3, int i4) {
        int max = Math.max(0, c0690b.f2384a - i);
        int max2 = Math.max(0, c0690b.f2385b - i2);
        int max3 = Math.max(0, c0690b.f2386c - i3);
        int max4 = Math.max(0, c0690b.f2387d - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? c0690b : C0690b.m11968b(max, max2, max3, max4);
    }

    @NonNull
    @RequiresApi(20)
    /* renamed from: i */
    public static WindowInsetsCompat m11635i(@Nullable View view, @NonNull WindowInsets windowInsets) {
        windowInsets.getClass();
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat(windowInsets);
        if (view != null) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            if (ViewCompat.C0817g.m11730b(view)) {
                WindowInsetsCompat m11695a = ViewCompat.C0821j.m11695a(view);
                C0849k c0849k = windowInsetsCompat.f2565a;
                c0849k.mo11602q(m11695a);
                c0849k.mo11615d(view.getRootView());
            }
        }
        return windowInsetsCompat;
    }

    @NonNull
    /* renamed from: a */
    public final C0690b m11643a(int i) {
        return this.f2565a.mo11613f(i);
    }

    @Deprecated
    /* renamed from: b */
    public final int m11642b() {
        return this.f2565a.mo11608k().f2387d;
    }

    @Deprecated
    /* renamed from: c */
    public final int m11641c() {
        return this.f2565a.mo11608k().f2384a;
    }

    @Deprecated
    /* renamed from: d */
    public final int m11640d() {
        return this.f2565a.mo11608k().f2386c;
    }

    @Deprecated
    /* renamed from: e */
    public final int m11639e() {
        return this.f2565a.mo11608k().f2385b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WindowInsetsCompat)) {
            return false;
        }
        return C0799c.m11795a(this.f2565a, ((WindowInsetsCompat) obj).f2565a);
    }

    @NonNull
    @Deprecated
    /* renamed from: g */
    public final WindowInsetsCompat m11637g(int i, int i2, int i3, int i4) {
        C0843e c0840b;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            c0840b = new C0842d(this);
        } else if (i5 >= 29) {
            c0840b = new C0841c(this);
        } else {
            c0840b = new C0840b(this);
        }
        c0840b.mo11626g(C0690b.m11968b(i, i2, i3, i4));
        return c0840b.mo11631b();
    }

    @Nullable
    @RequiresApi(20)
    /* renamed from: h */
    public final WindowInsets m11636h() {
        C0849k c0849k = this.f2565a;
        if (c0849k instanceof C0844f) {
            return ((C0844f) c0849k).f2584c;
        }
        return null;
    }

    public final int hashCode() {
        C0849k c0849k = this.f2565a;
        if (c0849k == null) {
            return 0;
        }
        return c0849k.hashCode();
    }
}
