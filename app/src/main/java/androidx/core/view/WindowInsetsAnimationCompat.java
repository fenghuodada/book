package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.C0690b;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.ambrose.overwall.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class WindowInsetsAnimationCompat {

    /* renamed from: a */
    public final C0838d f2537a;

    /* loaded from: classes.dex */
    public static abstract class Callback {

        /* renamed from: a */
        public WindowInsets f2538a;

        /* renamed from: b */
        public final int f2539b;

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
        /* loaded from: classes.dex */
        public @interface DispatchMode {
        }

        public Callback(int i) {
            this.f2539b = i;
        }

        /* renamed from: a */
        public void mo4733a() {
        }

        /* renamed from: b */
        public void mo4732b() {
        }

        @NonNull
        /* renamed from: c */
        public abstract WindowInsetsCompat mo2837c(@NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list);

        @NonNull
        /* renamed from: d */
        public C0830a mo4731d(@NonNull C0830a c0830a) {
            return c0830a;
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$a */
    /* loaded from: classes.dex */
    public static final class C0830a {

        /* renamed from: a */
        public final C0690b f2540a;

        /* renamed from: b */
        public final C0690b f2541b;

        @RequiresApi(30)
        public C0830a(@NonNull WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            Insets upperBound;
            lowerBound = bounds.getLowerBound();
            this.f2540a = C0690b.m11967c(lowerBound);
            upperBound = bounds.getUpperBound();
            this.f2541b = C0690b.m11967c(upperBound);
        }

        public C0830a(@NonNull C0690b c0690b, @NonNull C0690b c0690b2) {
            this.f2540a = c0690b;
            this.f2541b = c0690b2;
        }

        public final String toString() {
            return "Bounds{lower=" + this.f2540a + " upper=" + this.f2541b + "}";
        }
    }

    @RequiresApi(21)
    /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$b */
    /* loaded from: classes.dex */
    public static class C0831b extends C0838d {

        @RequiresApi(21)
        /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$b$a */
        /* loaded from: classes.dex */
        public static class View$OnApplyWindowInsetsListenerC0832a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public final Callback f2542a;

            /* renamed from: b */
            public WindowInsetsCompat f2543b;

            /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$b$a$a */
            /* loaded from: classes.dex */
            public class C0833a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a */
                public final /* synthetic */ WindowInsetsAnimationCompat f2544a;

                /* renamed from: b */
                public final /* synthetic */ WindowInsetsCompat f2545b;

                /* renamed from: c */
                public final /* synthetic */ WindowInsetsCompat f2546c;

                /* renamed from: d */
                public final /* synthetic */ int f2547d;

                /* renamed from: e */
                public final /* synthetic */ View f2548e;

                public C0833a(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsCompat windowInsetsCompat, WindowInsetsCompat windowInsetsCompat2, int i, View view) {
                    this.f2544a = windowInsetsAnimationCompat;
                    this.f2545b = windowInsetsCompat;
                    this.f2546c = windowInsetsCompat2;
                    this.f2547d = i;
                    this.f2548e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    WindowInsetsCompat.C0843e c0840b;
                    C0690b m11638f;
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.f2544a;
                    windowInsetsAnimationCompat.f2537a.mo11644d(animatedFraction);
                    float mo11646b = windowInsetsAnimationCompat.f2537a.mo11646b();
                    int i = Build.VERSION.SDK_INT;
                    WindowInsetsCompat windowInsetsCompat = this.f2545b;
                    if (i >= 30) {
                        c0840b = new WindowInsetsCompat.C0842d(windowInsetsCompat);
                    } else if (i >= 29) {
                        c0840b = new WindowInsetsCompat.C0841c(windowInsetsCompat);
                    } else {
                        c0840b = new WindowInsetsCompat.C0840b(windowInsetsCompat);
                    }
                    for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                        if ((this.f2547d & i2) == 0) {
                            m11638f = windowInsetsCompat.m11643a(i2);
                        } else {
                            C0690b m11643a = windowInsetsCompat.m11643a(i2);
                            C0690b m11643a2 = this.f2546c.m11643a(i2);
                            float f = 1.0f - mo11646b;
                            m11638f = WindowInsetsCompat.m11638f(m11643a, (int) (((m11643a.f2384a - m11643a2.f2384a) * f) + 0.5d), (int) (((m11643a.f2385b - m11643a2.f2385b) * f) + 0.5d), (int) (((m11643a.f2386c - m11643a2.f2386c) * f) + 0.5d), (int) (((m11643a.f2387d - m11643a2.f2387d) * f) + 0.5d));
                        }
                        c0840b.mo11630c(i2, m11638f);
                    }
                    C0831b.m11653g(this.f2548e, c0840b.mo11631b(), Collections.singletonList(windowInsetsAnimationCompat));
                }
            }

            /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$b$a$b */
            /* loaded from: classes.dex */
            public class C0834b extends AnimatorListenerAdapter {

                /* renamed from: a */
                public final /* synthetic */ WindowInsetsAnimationCompat f2549a;

                /* renamed from: b */
                public final /* synthetic */ View f2550b;

                public C0834b(WindowInsetsAnimationCompat windowInsetsAnimationCompat, View view) {
                    this.f2549a = windowInsetsAnimationCompat;
                    this.f2550b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.f2549a;
                    windowInsetsAnimationCompat.f2537a.mo11644d(1.0f);
                    C0831b.m11655e(this.f2550b, windowInsetsAnimationCompat);
                }
            }

            /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$b$a$c */
            /* loaded from: classes.dex */
            public class RunnableC0835c implements Runnable {

                /* renamed from: a */
                public final /* synthetic */ View f2551a;

                /* renamed from: b */
                public final /* synthetic */ WindowInsetsAnimationCompat f2552b;

                /* renamed from: c */
                public final /* synthetic */ C0830a f2553c;

                /* renamed from: d */
                public final /* synthetic */ ValueAnimator f2554d;

                public RunnableC0835c(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, C0830a c0830a, ValueAnimator valueAnimator) {
                    this.f2551a = view;
                    this.f2552b = windowInsetsAnimationCompat;
                    this.f2553c = c0830a;
                    this.f2554d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C0831b.m11652h(this.f2551a, this.f2552b, this.f2553c);
                    this.f2554d.start();
                }
            }

            public View$OnApplyWindowInsetsListenerC0832a(@NonNull View view, @NonNull Callback callback) {
                WindowInsetsCompat windowInsetsCompat;
                WindowInsetsCompat.C0843e c0840b;
                this.f2542a = callback;
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                WindowInsetsCompat m11695a = ViewCompat.C0821j.m11695a(view);
                if (m11695a != null) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 30) {
                        c0840b = new WindowInsetsCompat.C0842d(m11695a);
                    } else if (i >= 29) {
                        c0840b = new WindowInsetsCompat.C0841c(m11695a);
                    } else {
                        c0840b = new WindowInsetsCompat.C0840b(m11695a);
                    }
                    windowInsetsCompat = c0840b.mo11631b();
                } else {
                    windowInsetsCompat = null;
                }
                this.f2543b = windowInsetsCompat;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                View$OnApplyWindowInsetsListenerC0832a view$OnApplyWindowInsetsListenerC0832a = this;
                if (!view.isLaidOut()) {
                    view$OnApplyWindowInsetsListenerC0832a.f2543b = WindowInsetsCompat.m11635i(view, windowInsets);
                } else {
                    WindowInsetsCompat m11635i = WindowInsetsCompat.m11635i(view, windowInsets);
                    if (view$OnApplyWindowInsetsListenerC0832a.f2543b == null) {
                        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                        view$OnApplyWindowInsetsListenerC0832a.f2543b = ViewCompat.C0821j.m11695a(view);
                    }
                    if (view$OnApplyWindowInsetsListenerC0832a.f2543b != null) {
                        Callback m11650j = C0831b.m11650j(view);
                        if (m11650j != null && Objects.equals(m11650j.f2538a, windowInsets)) {
                            return C0831b.m11651i(view, windowInsets);
                        }
                        WindowInsetsCompat windowInsetsCompat = view$OnApplyWindowInsetsListenerC0832a.f2543b;
                        int i = 0;
                        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                            if (!m11635i.m11643a(i2).equals(windowInsetsCompat.m11643a(i2))) {
                                i |= i2;
                            }
                        }
                        if (i == 0) {
                            return C0831b.m11651i(view, windowInsets);
                        }
                        WindowInsetsCompat windowInsetsCompat2 = view$OnApplyWindowInsetsListenerC0832a.f2543b;
                        WindowInsetsAnimationCompat windowInsetsAnimationCompat = new WindowInsetsAnimationCompat(i, new DecelerateInterpolator(), 160L);
                        C0838d c0838d = windowInsetsAnimationCompat.f2537a;
                        c0838d.mo11644d(0.0f);
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(c0838d.mo11647a());
                        C0690b m11643a = m11635i.m11643a(i);
                        C0690b m11643a2 = windowInsetsCompat2.m11643a(i);
                        int min = Math.min(m11643a.f2384a, m11643a2.f2384a);
                        int i3 = m11643a.f2385b;
                        int i4 = m11643a2.f2385b;
                        int min2 = Math.min(i3, i4);
                        int i5 = m11643a.f2386c;
                        int i6 = m11643a2.f2386c;
                        int min3 = Math.min(i5, i6);
                        int i7 = m11643a.f2387d;
                        int i8 = i;
                        int i9 = m11643a2.f2387d;
                        C0830a c0830a = new C0830a(C0690b.m11968b(min, min2, min3, Math.min(i7, i9)), C0690b.m11968b(Math.max(m11643a.f2384a, m11643a2.f2384a), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
                        C0831b.m11654f(view, windowInsetsAnimationCompat, windowInsets, false);
                        duration.addUpdateListener(new C0833a(windowInsetsAnimationCompat, m11635i, windowInsetsCompat2, i8, view));
                        duration.addListener(new C0834b(windowInsetsAnimationCompat, view));
                        ViewTreeObserver$OnPreDrawListenerC0964l0.m11415a(view, new RunnableC0835c(view, windowInsetsAnimationCompat, c0830a, duration));
                        view$OnApplyWindowInsetsListenerC0832a = this;
                    }
                    view$OnApplyWindowInsetsListenerC0832a.f2543b = m11635i;
                }
                return C0831b.m11651i(view, windowInsets);
            }
        }

        public C0831b(int i, @Nullable DecelerateInterpolator decelerateInterpolator, long j) {
            super(i, decelerateInterpolator, j);
        }

        /* renamed from: e */
        public static void m11655e(@NonNull View view, @NonNull WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            Callback m11650j = m11650j(view);
            if (m11650j != null) {
                m11650j.mo4733a();
                if (m11650j.f2539b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m11655e(viewGroup.getChildAt(i), windowInsetsAnimationCompat);
                }
            }
        }

        /* renamed from: f */
        public static void m11654f(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsets windowInsets, boolean z) {
            Callback m11650j = m11650j(view);
            if (m11650j != null) {
                m11650j.f2538a = windowInsets;
                if (!z) {
                    m11650j.mo4732b();
                    z = m11650j.f2539b == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m11654f(viewGroup.getChildAt(i), windowInsetsAnimationCompat, windowInsets, z);
                }
            }
        }

        /* renamed from: g */
        public static void m11653g(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull List<WindowInsetsAnimationCompat> list) {
            Callback m11650j = m11650j(view);
            if (m11650j != null) {
                windowInsetsCompat = m11650j.mo2837c(windowInsetsCompat, list);
                if (m11650j.f2539b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m11653g(viewGroup.getChildAt(i), windowInsetsCompat, list);
                }
            }
        }

        /* renamed from: h */
        public static void m11652h(View view, WindowInsetsAnimationCompat windowInsetsAnimationCompat, C0830a c0830a) {
            Callback m11650j = m11650j(view);
            if (m11650j != null) {
                m11650j.mo4731d(c0830a);
                if (m11650j.f2539b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m11652h(viewGroup.getChildAt(i), windowInsetsAnimationCompat, c0830a);
                }
            }
        }

        @NonNull
        /* renamed from: i */
        public static WindowInsets m11651i(@NonNull View view, @NonNull WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        @Nullable
        /* renamed from: j */
        public static Callback m11650j(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof View$OnApplyWindowInsetsListenerC0832a) {
                return ((View$OnApplyWindowInsetsListenerC0832a) tag).f2542a;
            }
            return null;
        }
    }

    @RequiresApi(30)
    /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$c */
    /* loaded from: classes.dex */
    public static class C0836c extends C0838d {
        @NonNull

        /* renamed from: e */
        public final WindowInsetsAnimation f2555e;

        @RequiresApi(30)
        /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$c$a */
        /* loaded from: classes.dex */
        public static class C0837a extends WindowInsetsAnimation.Callback {

            /* renamed from: a */
            public final Callback f2556a;

            /* renamed from: b */
            public List<WindowInsetsAnimationCompat> f2557b;

            /* renamed from: c */
            public ArrayList<WindowInsetsAnimationCompat> f2558c;

            /* renamed from: d */
            public final HashMap<WindowInsetsAnimation, WindowInsetsAnimationCompat> f2559d;

            public C0837a(@NonNull Callback callback) {
                super(callback.f2539b);
                this.f2559d = new HashMap<>();
                this.f2556a = callback;
            }

            @NonNull
            /* renamed from: a */
            public final WindowInsetsAnimationCompat m11648a(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.f2559d.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat == null) {
                    WindowInsetsAnimationCompat windowInsetsAnimationCompat2 = new WindowInsetsAnimationCompat(windowInsetsAnimation);
                    this.f2559d.put(windowInsetsAnimation, windowInsetsAnimationCompat2);
                    return windowInsetsAnimationCompat2;
                }
                return windowInsetsAnimationCompat;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public final void onEnd(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                Callback callback = this.f2556a;
                m11648a(windowInsetsAnimation);
                callback.mo4733a();
                this.f2559d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public final void onPrepare(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
                Callback callback = this.f2556a;
                m11648a(windowInsetsAnimation);
                callback.mo4732b();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            @NonNull
            public final WindowInsets onProgress(@NonNull WindowInsets windowInsets, @NonNull List<WindowInsetsAnimation> list) {
                float fraction;
                ArrayList<WindowInsetsAnimationCompat> arrayList = this.f2558c;
                if (arrayList == null) {
                    ArrayList<WindowInsetsAnimationCompat> arrayList2 = new ArrayList<>(list.size());
                    this.f2558c = arrayList2;
                    this.f2557b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                        WindowInsetsAnimationCompat m11648a = m11648a(windowInsetsAnimation);
                        fraction = windowInsetsAnimation.getFraction();
                        m11648a.f2537a.mo11644d(fraction);
                        this.f2558c.add(m11648a);
                    } else {
                        return this.f2556a.mo2837c(WindowInsetsCompat.m11635i(null, windowInsets), this.f2557b).m11636h();
                    }
                }
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            @NonNull
            public final WindowInsetsAnimation.Bounds onStart(@NonNull WindowInsetsAnimation windowInsetsAnimation, @NonNull WindowInsetsAnimation.Bounds bounds) {
                Callback callback = this.f2556a;
                m11648a(windowInsetsAnimation);
                C0830a mo4731d = callback.mo4731d(new C0830a(bounds));
                mo4731d.getClass();
                return C0836c.m11649e(mo4731d);
            }
        }

        public C0836c(int i, DecelerateInterpolator decelerateInterpolator, long j) {
            this(new WindowInsetsAnimation(i, decelerateInterpolator, j));
        }

        public C0836c(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f2555e = windowInsetsAnimation;
        }

        @NonNull
        /* renamed from: e */
        public static WindowInsetsAnimation.Bounds m11649e(@NonNull C0830a c0830a) {
            return new WindowInsetsAnimation.Bounds(c0830a.f2540a.m11966d(), c0830a.f2541b.m11966d());
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.C0838d
        /* renamed from: a */
        public final long mo11647a() {
            long durationMillis;
            durationMillis = this.f2555e.getDurationMillis();
            return durationMillis;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.C0838d
        /* renamed from: b */
        public final float mo11646b() {
            float interpolatedFraction;
            interpolatedFraction = this.f2555e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.C0838d
        /* renamed from: c */
        public final int mo11645c() {
            int typeMask;
            typeMask = this.f2555e.getTypeMask();
            return typeMask;
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.C0838d
        /* renamed from: d */
        public final void mo11644d(float f) {
            this.f2555e.setFraction(f);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsAnimationCompat$d */
    /* loaded from: classes.dex */
    public static class C0838d {

        /* renamed from: a */
        public final int f2560a;

        /* renamed from: b */
        public float f2561b;
        @Nullable

        /* renamed from: c */
        public final Interpolator f2562c;

        /* renamed from: d */
        public final long f2563d;

        public C0838d(int i, @Nullable DecelerateInterpolator decelerateInterpolator, long j) {
            this.f2560a = i;
            this.f2562c = decelerateInterpolator;
            this.f2563d = j;
        }

        /* renamed from: a */
        public long mo11647a() {
            return this.f2563d;
        }

        /* renamed from: b */
        public float mo11646b() {
            Interpolator interpolator = this.f2562c;
            return interpolator != null ? interpolator.getInterpolation(this.f2561b) : this.f2561b;
        }

        /* renamed from: c */
        public int mo11645c() {
            return this.f2560a;
        }

        /* renamed from: d */
        public void mo11644d(float f) {
            this.f2561b = f;
        }
    }

    public WindowInsetsAnimationCompat(int i, @Nullable DecelerateInterpolator decelerateInterpolator, long j) {
        this.f2537a = Build.VERSION.SDK_INT >= 30 ? new C0836c(i, decelerateInterpolator, j) : new C0831b(i, decelerateInterpolator, j);
    }

    @RequiresApi(30)
    public WindowInsetsAnimationCompat(@NonNull WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f2537a = new C0836c(windowInsetsAnimation);
        }
    }
}
