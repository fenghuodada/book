package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.collection.C0482i;
import androidx.core.graphics.C0690b;
import androidx.core.view.C0851a;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.C0874o;
import androidx.core.view.accessibility.InterfaceC0883s;
import com.ambrose.overwall.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public final class ViewCompat {

    /* renamed from: a */
    public static WeakHashMap<View, C0922g2> f2518a;

    /* renamed from: b */
    public static Field f2519b;

    /* renamed from: c */
    public static boolean f2520c;

    /* renamed from: d */
    public static final int[] f2521d;

    /* renamed from: e */
    public static final C0974n0 f2522e;

    /* renamed from: f */
    public static final ViewTreeObserver$OnGlobalLayoutListenerC0811a f2523f;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface FocusDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface FocusRealDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface FocusRelativeDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface NestedScrollType {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface ScrollAxis {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface ScrollIndicators {
    }

    /* renamed from: androidx.core.view.ViewCompat$a */
    /* loaded from: classes.dex */
    public static class ViewTreeObserver$OnGlobalLayoutListenerC0811a implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a */
        public final WeakHashMap<View, Boolean> f2524a = new WeakHashMap<>();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        @RequiresApi(19)
        public final void onGlobalLayout() {
            boolean z;
            int i;
            if (Build.VERSION.SDK_INT < 28) {
                WeakHashMap<View, Boolean> weakHashMap = this.f2524a;
                for (Map.Entry<View, Boolean> entry : weakHashMap.entrySet()) {
                    View key = entry.getKey();
                    boolean booleanValue = entry.getValue().booleanValue();
                    if (key.isShown() && key.getWindowVisibility() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (booleanValue != z) {
                        if (z) {
                            i = 16;
                        } else {
                            i = 32;
                        }
                        ViewCompat.m11777h(i, key);
                        weakHashMap.put(key, Boolean.valueOf(z));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @RequiresApi(19)
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0812b<T> {

        /* renamed from: a */
        public final int f2525a;

        /* renamed from: b */
        public final Class<T> f2526b;

        /* renamed from: c */
        public final int f2527c;

        /* renamed from: d */
        public final int f2528d;

        public AbstractC0812b(int i, Class<T> cls, int i2, int i3) {
            this.f2525a = i;
            this.f2526b = cls;
            this.f2528d = i2;
            this.f2527c = i3;
        }

        /* renamed from: a */
        public static boolean m11768a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        /* renamed from: b */
        public abstract T mo11380b(View view);

        /* renamed from: c */
        public abstract void mo11379c(View view, T t);

        /* renamed from: d */
        public final T m11767d(View view) {
            boolean z;
            if (Build.VERSION.SDK_INT >= this.f2527c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return mo11380b(view);
            }
            T t = (T) view.getTag(this.f2525a);
            if (this.f2526b.isInstance(t)) {
                return t;
            }
            return null;
        }

        /* renamed from: e */
        public final void m11766e(View view, T t) {
            boolean z;
            C0851a c0851a;
            if (Build.VERSION.SDK_INT >= this.f2527c) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                mo11379c(view, t);
            } else if (mo11378f(m11767d(view), t)) {
                View.AccessibilityDelegate m11781d = ViewCompat.m11781d(view);
                if (m11781d == null) {
                    c0851a = null;
                } else if (m11781d instanceof C0851a.C0852a) {
                    c0851a = ((C0851a.C0852a) m11781d).f2599a;
                } else {
                    c0851a = new C0851a(m11781d);
                }
                if (c0851a == null) {
                    c0851a = new C0851a();
                }
                ViewCompat.m11771n(view, c0851a);
                view.setTag(this.f2525a, t);
                ViewCompat.m11777h(this.f2528d, view);
            }
        }

        /* renamed from: f */
        public abstract boolean mo11378f(T t, T t2);
    }

    @RequiresApi(15)
    /* renamed from: androidx.core.view.ViewCompat$c */
    /* loaded from: classes.dex */
    public static class C0813c {
        @DoNotInline
        /* renamed from: a */
        public static boolean m11765a(@NonNull View view) {
            return view.hasOnClickListeners();
        }
    }

    @RequiresApi(16)
    /* renamed from: androidx.core.view.ViewCompat$d */
    /* loaded from: classes.dex */
    public static class C0814d {
        @DoNotInline
        /* renamed from: a */
        public static AccessibilityNodeProvider m11764a(View view) {
            return view.getAccessibilityNodeProvider();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m11763b(View view) {
            return view.getFitsSystemWindows();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m11762c(View view) {
            return view.getImportantForAccessibility();
        }

        @DoNotInline
        /* renamed from: d */
        public static int m11761d(View view) {
            return view.getMinimumHeight();
        }

        @DoNotInline
        /* renamed from: e */
        public static int m11760e(View view) {
            return view.getMinimumWidth();
        }

        @DoNotInline
        /* renamed from: f */
        public static ViewParent m11759f(View view) {
            return view.getParentForAccessibility();
        }

        @DoNotInline
        /* renamed from: g */
        public static int m11758g(View view) {
            return view.getWindowSystemUiVisibility();
        }

        @DoNotInline
        /* renamed from: h */
        public static boolean m11757h(View view) {
            return view.hasOverlappingRendering();
        }

        @DoNotInline
        /* renamed from: i */
        public static boolean m11756i(View view) {
            return view.hasTransientState();
        }

        @DoNotInline
        /* renamed from: j */
        public static boolean m11755j(View view, int i, Bundle bundle) {
            return view.performAccessibilityAction(i, bundle);
        }

        @DoNotInline
        /* renamed from: k */
        public static void m11754k(View view) {
            view.postInvalidateOnAnimation();
        }

        @DoNotInline
        /* renamed from: l */
        public static void m11753l(View view, int i, int i2, int i3, int i4) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        }

        @DoNotInline
        /* renamed from: m */
        public static void m11752m(View view, Runnable runnable) {
            view.postOnAnimation(runnable);
        }

        @DoNotInline
        /* renamed from: n */
        public static void m11751n(View view, Runnable runnable, long j) {
            view.postOnAnimationDelayed(runnable, j);
        }

        @DoNotInline
        /* renamed from: o */
        public static void m11750o(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }

        @DoNotInline
        /* renamed from: p */
        public static void m11749p(View view) {
            view.requestFitSystemWindows();
        }

        @DoNotInline
        /* renamed from: q */
        public static void m11748q(View view, Drawable drawable) {
            view.setBackground(drawable);
        }

        @DoNotInline
        /* renamed from: r */
        public static void m11747r(View view, boolean z) {
            view.setHasTransientState(z);
        }

        @DoNotInline
        /* renamed from: s */
        public static void m11746s(View view, int i) {
            view.setImportantForAccessibility(i);
        }
    }

    @RequiresApi(17)
    /* renamed from: androidx.core.view.ViewCompat$e */
    /* loaded from: classes.dex */
    public static class C0815e {
        @DoNotInline
        /* renamed from: a */
        public static int m11745a() {
            return View.generateViewId();
        }

        @DoNotInline
        /* renamed from: b */
        public static Display m11744b(@NonNull View view) {
            return view.getDisplay();
        }

        @DoNotInline
        /* renamed from: c */
        public static int m11743c(View view) {
            return view.getLabelFor();
        }

        @DoNotInline
        /* renamed from: d */
        public static int m11742d(View view) {
            return view.getLayoutDirection();
        }

        @DoNotInline
        /* renamed from: e */
        public static int m11741e(View view) {
            return view.getPaddingEnd();
        }

        @DoNotInline
        /* renamed from: f */
        public static int m11740f(View view) {
            return view.getPaddingStart();
        }

        @DoNotInline
        /* renamed from: g */
        public static boolean m11739g(View view) {
            return view.isPaddingRelative();
        }

        @DoNotInline
        /* renamed from: h */
        public static void m11738h(View view, int i) {
            view.setLabelFor(i);
        }

        @DoNotInline
        /* renamed from: i */
        public static void m11737i(View view, Paint paint) {
            view.setLayerPaint(paint);
        }

        @DoNotInline
        /* renamed from: j */
        public static void m11736j(View view, int i) {
            view.setLayoutDirection(i);
        }

        @DoNotInline
        /* renamed from: k */
        public static void m11735k(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    @RequiresApi(18)
    /* renamed from: androidx.core.view.ViewCompat$f */
    /* loaded from: classes.dex */
    public static class C0816f {
        @DoNotInline
        /* renamed from: a */
        public static Rect m11734a(@NonNull View view) {
            return view.getClipBounds();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m11733b(@NonNull View view) {
            return view.isInLayout();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m11732c(@NonNull View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    @RequiresApi(19)
    /* renamed from: androidx.core.view.ViewCompat$g */
    /* loaded from: classes.dex */
    public static class C0817g {
        @DoNotInline
        /* renamed from: a */
        public static int m11731a(View view) {
            return view.getAccessibilityLiveRegion();
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m11730b(@NonNull View view) {
            return view.isAttachedToWindow();
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m11729c(@NonNull View view) {
            return view.isLaidOut();
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m11728d(@NonNull View view) {
            return view.isLayoutDirectionResolved();
        }

        @DoNotInline
        /* renamed from: e */
        public static void m11727e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
        }

        @DoNotInline
        /* renamed from: f */
        public static void m11726f(View view, int i) {
            view.setAccessibilityLiveRegion(i);
        }

        @DoNotInline
        /* renamed from: g */
        public static void m11725g(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    @RequiresApi(20)
    /* renamed from: androidx.core.view.ViewCompat$h */
    /* loaded from: classes.dex */
    public static class C0818h {
        @DoNotInline
        /* renamed from: a */
        public static WindowInsets m11724a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        /* renamed from: b */
        public static WindowInsets m11723b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        /* renamed from: c */
        public static void m11722c(View view) {
            view.requestApplyInsets();
        }
    }

    @RequiresApi(21)
    /* renamed from: androidx.core.view.ViewCompat$i */
    /* loaded from: classes.dex */
    public static class C0819i {

        /* renamed from: androidx.core.view.ViewCompat$i$a */
        /* loaded from: classes.dex */
        public class View$OnApplyWindowInsetsListenerC0820a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a */
            public WindowInsetsCompat f2529a = null;

            /* renamed from: b */
            public final /* synthetic */ View f2530b;

            /* renamed from: c */
            public final /* synthetic */ InterfaceC0932i0 f2531c;

            public View$OnApplyWindowInsetsListenerC0820a(View view, InterfaceC0932i0 interfaceC0932i0) {
                this.f2530b = view;
                this.f2531c = interfaceC0932i0;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsetsCompat m11635i = WindowInsetsCompat.m11635i(view, windowInsets);
                int i = Build.VERSION.SDK_INT;
                InterfaceC0932i0 interfaceC0932i0 = this.f2531c;
                if (i < 30) {
                    C0819i.m11721a(windowInsets, this.f2530b);
                    if (m11635i.equals(this.f2529a)) {
                        return interfaceC0932i0.mo2619a(view, m11635i).m11636h();
                    }
                }
                this.f2529a = m11635i;
                WindowInsetsCompat mo2619a = interfaceC0932i0.mo2619a(view, m11635i);
                if (i >= 30) {
                    return mo2619a.m11636h();
                }
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                C0818h.m11722c(view);
                return mo2619a.m11636h();
            }
        }

        @DoNotInline
        /* renamed from: a */
        public static void m11721a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @DoNotInline
        /* renamed from: b */
        public static WindowInsetsCompat m11720b(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
            WindowInsets m11636h = windowInsetsCompat.m11636h();
            if (m11636h != null) {
                return WindowInsetsCompat.m11635i(view, view.computeSystemWindowInsets(m11636h, rect));
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m11719c(@NonNull View view, float f, float f2, boolean z) {
            return view.dispatchNestedFling(f, f2, z);
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m11718d(@NonNull View view, float f, float f2) {
            return view.dispatchNestedPreFling(f, f2);
        }

        @DoNotInline
        /* renamed from: e */
        public static boolean m11717e(View view, int i, int i2, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
        }

        @DoNotInline
        /* renamed from: f */
        public static boolean m11716f(View view, int i, int i2, int i3, int i4, int[] iArr) {
            return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
        }

        @DoNotInline
        /* renamed from: g */
        public static ColorStateList m11715g(View view) {
            return view.getBackgroundTintList();
        }

        @DoNotInline
        /* renamed from: h */
        public static PorterDuff.Mode m11714h(View view) {
            return view.getBackgroundTintMode();
        }

        @DoNotInline
        /* renamed from: i */
        public static float m11713i(View view) {
            return view.getElevation();
        }

        @Nullable
        @DoNotInline
        /* renamed from: j */
        public static WindowInsetsCompat m11712j(@NonNull View view) {
            WindowInsetsCompat.C0843e c0840b;
            if (WindowInsetsCompat.C0839a.f2569d && view.isAttachedToWindow()) {
                try {
                    Object obj = WindowInsetsCompat.C0839a.f2566a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) WindowInsetsCompat.C0839a.f2567b.get(obj);
                        Rect rect2 = (Rect) WindowInsetsCompat.C0839a.f2568c.get(obj);
                        if (rect != null && rect2 != null) {
                            int i = Build.VERSION.SDK_INT;
                            if (i >= 30) {
                                c0840b = new WindowInsetsCompat.C0842d();
                            } else if (i >= 29) {
                                c0840b = new WindowInsetsCompat.C0841c();
                            } else {
                                c0840b = new WindowInsetsCompat.C0840b();
                            }
                            c0840b.mo11628e(C0690b.m11968b(rect.left, rect.top, rect.right, rect.bottom));
                            c0840b.mo11626g(C0690b.m11968b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                            WindowInsetsCompat mo11631b = c0840b.mo11631b();
                            mo11631b.f2565a.mo11602q(mo11631b);
                            mo11631b.f2565a.mo11615d(view.getRootView());
                            return mo11631b;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }

        @DoNotInline
        /* renamed from: k */
        public static String m11711k(View view) {
            return view.getTransitionName();
        }

        @DoNotInline
        /* renamed from: l */
        public static float m11710l(View view) {
            return view.getTranslationZ();
        }

        @DoNotInline
        /* renamed from: m */
        public static float m11709m(@NonNull View view) {
            return view.getZ();
        }

        @DoNotInline
        /* renamed from: n */
        public static boolean m11708n(View view) {
            return view.hasNestedScrollingParent();
        }

        @DoNotInline
        /* renamed from: o */
        public static boolean m11707o(View view) {
            return view.isImportantForAccessibility();
        }

        @DoNotInline
        /* renamed from: p */
        public static boolean m11706p(View view) {
            return view.isNestedScrollingEnabled();
        }

        @DoNotInline
        /* renamed from: q */
        public static void m11705q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @DoNotInline
        /* renamed from: r */
        public static void m11704r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @DoNotInline
        /* renamed from: s */
        public static void m11703s(View view, float f) {
            view.setElevation(f);
        }

        @DoNotInline
        /* renamed from: t */
        public static void m11702t(View view, boolean z) {
            view.setNestedScrollingEnabled(z);
        }

        @DoNotInline
        /* renamed from: u */
        public static void m11701u(@NonNull View view, @Nullable InterfaceC0932i0 interfaceC0932i0) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, interfaceC0932i0);
            }
            if (interfaceC0932i0 == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new View$OnApplyWindowInsetsListenerC0820a(view, interfaceC0932i0));
            }
        }

        @DoNotInline
        /* renamed from: v */
        public static void m11700v(View view, String str) {
            view.setTransitionName(str);
        }

        @DoNotInline
        /* renamed from: w */
        public static void m11699w(View view, float f) {
            view.setTranslationZ(f);
        }

        @DoNotInline
        /* renamed from: x */
        public static void m11698x(@NonNull View view, float f) {
            view.setZ(f);
        }

        @DoNotInline
        /* renamed from: y */
        public static boolean m11697y(View view, int i) {
            return view.startNestedScroll(i);
        }

        @DoNotInline
        /* renamed from: z */
        public static void m11696z(View view) {
            view.stopNestedScroll();
        }
    }

    @RequiresApi(23)
    /* renamed from: androidx.core.view.ViewCompat$j */
    /* loaded from: classes.dex */
    public static class C0821j {
        @Nullable
        /* renamed from: a */
        public static WindowInsetsCompat m11695a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat m11635i = WindowInsetsCompat.m11635i(null, rootWindowInsets);
            WindowInsetsCompat.C0849k c0849k = m11635i.f2565a;
            c0849k.mo11602q(m11635i);
            c0849k.mo11615d(view.getRootView());
            return m11635i;
        }

        @DoNotInline
        /* renamed from: b */
        public static int m11694b(@NonNull View view) {
            return view.getScrollIndicators();
        }

        @DoNotInline
        /* renamed from: c */
        public static void m11693c(@NonNull View view, int i) {
            view.setScrollIndicators(i);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m11692d(@NonNull View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    @RequiresApi(26)
    /* renamed from: androidx.core.view.ViewCompat$k */
    /* loaded from: classes.dex */
    public static class C0822k {
        @DoNotInline
        /* renamed from: a */
        public static void m11691a(@NonNull View view, Collection<View> collection, int i) {
            view.addKeyboardNavigationClusters(collection, i);
        }

        @DoNotInline
        /* renamed from: b */
        public static int m11690b(View view) {
            int importantForAutofill;
            importantForAutofill = view.getImportantForAutofill();
            return importantForAutofill;
        }

        @DoNotInline
        /* renamed from: c */
        public static int m11689c(@NonNull View view) {
            int nextClusterForwardId;
            nextClusterForwardId = view.getNextClusterForwardId();
            return nextClusterForwardId;
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m11688d(@NonNull View view) {
            boolean hasExplicitFocusable;
            hasExplicitFocusable = view.hasExplicitFocusable();
            return hasExplicitFocusable;
        }

        @DoNotInline
        /* renamed from: e */
        public static boolean m11687e(@NonNull View view) {
            boolean isFocusedByDefault;
            isFocusedByDefault = view.isFocusedByDefault();
            return isFocusedByDefault;
        }

        @DoNotInline
        /* renamed from: f */
        public static boolean m11686f(View view) {
            boolean isImportantForAutofill;
            isImportantForAutofill = view.isImportantForAutofill();
            return isImportantForAutofill;
        }

        @DoNotInline
        /* renamed from: g */
        public static boolean m11685g(@NonNull View view) {
            boolean isKeyboardNavigationCluster;
            isKeyboardNavigationCluster = view.isKeyboardNavigationCluster();
            return isKeyboardNavigationCluster;
        }

        @DoNotInline
        /* renamed from: h */
        public static View m11684h(@NonNull View view, View view2, int i) {
            View keyboardNavigationClusterSearch;
            keyboardNavigationClusterSearch = view.keyboardNavigationClusterSearch(view2, i);
            return keyboardNavigationClusterSearch;
        }

        @DoNotInline
        /* renamed from: i */
        public static boolean m11683i(@NonNull View view) {
            boolean restoreDefaultFocus;
            restoreDefaultFocus = view.restoreDefaultFocus();
            return restoreDefaultFocus;
        }

        @DoNotInline
        /* renamed from: j */
        public static void m11682j(@NonNull View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @DoNotInline
        /* renamed from: k */
        public static void m11681k(@NonNull View view, boolean z) {
            view.setFocusedByDefault(z);
        }

        @DoNotInline
        /* renamed from: l */
        public static void m11680l(View view, int i) {
            view.setImportantForAutofill(i);
        }

        @DoNotInline
        /* renamed from: m */
        public static void m11679m(@NonNull View view, boolean z) {
            view.setKeyboardNavigationCluster(z);
        }

        @DoNotInline
        /* renamed from: n */
        public static void m11678n(View view, int i) {
            view.setNextClusterForwardId(i);
        }

        @DoNotInline
        /* renamed from: o */
        public static void m11677o(@NonNull View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    @RequiresApi(28)
    /* renamed from: androidx.core.view.ViewCompat$l */
    /* loaded from: classes.dex */
    public static class C0823l {
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, androidx.core.view.o1] */
        @DoNotInline
        /* renamed from: a */
        public static void m11676a(@NonNull View view, @NonNull final InterfaceC0828q interfaceC0828q) {
            C0482i c0482i = (C0482i) view.getTag(R.id.tag_unhandled_key_listeners);
            if (c0482i == null) {
                c0482i = new C0482i();
                view.setTag(R.id.tag_unhandled_key_listeners, c0482i);
            }
            Objects.requireNonNull(interfaceC0828q);
            ?? r0 = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.o1
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return ViewCompat.InterfaceC0828q.this.m11658a();
                }
            };
            c0482i.put(interfaceC0828q, r0);
            view.addOnUnhandledKeyEventListener(r0);
        }

        @DoNotInline
        /* renamed from: b */
        public static CharSequence m11675b(View view) {
            CharSequence accessibilityPaneTitle;
            accessibilityPaneTitle = view.getAccessibilityPaneTitle();
            return accessibilityPaneTitle;
        }

        @DoNotInline
        /* renamed from: c */
        public static boolean m11674c(View view) {
            boolean isAccessibilityHeading;
            isAccessibilityHeading = view.isAccessibilityHeading();
            return isAccessibilityHeading;
        }

        @DoNotInline
        /* renamed from: d */
        public static boolean m11673d(View view) {
            boolean isScreenReaderFocusable;
            isScreenReaderFocusable = view.isScreenReaderFocusable();
            return isScreenReaderFocusable;
        }

        @DoNotInline
        /* renamed from: e */
        public static void m11672e(@NonNull View view, @NonNull InterfaceC0828q interfaceC0828q) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            C0482i c0482i = (C0482i) view.getTag(R.id.tag_unhandled_key_listeners);
            if (c0482i != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c0482i.getOrDefault(interfaceC0828q, null)) != null) {
                view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
            }
        }

        @DoNotInline
        /* renamed from: f */
        public static <T> T m11671f(View view, int i) {
            View requireViewById;
            requireViewById = view.requireViewById(i);
            return (T) requireViewById;
        }

        @DoNotInline
        /* renamed from: g */
        public static void m11670g(View view, boolean z) {
            view.setAccessibilityHeading(z);
        }

        @DoNotInline
        /* renamed from: h */
        public static void m11669h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @DoNotInline
        /* renamed from: i */
        public static void m11668i(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    @RequiresApi(29)
    /* renamed from: androidx.core.view.ViewCompat$m */
    /* loaded from: classes.dex */
    public static class C0824m {
        @DoNotInline
        /* renamed from: a */
        public static View.AccessibilityDelegate m11667a(View view) {
            View.AccessibilityDelegate accessibilityDelegate;
            accessibilityDelegate = view.getAccessibilityDelegate();
            return accessibilityDelegate;
        }

        @DoNotInline
        /* renamed from: b */
        public static List<Rect> m11666b(View view) {
            List<Rect> systemGestureExclusionRects;
            systemGestureExclusionRects = view.getSystemGestureExclusionRects();
            return systemGestureExclusionRects;
        }

        @DoNotInline
        /* renamed from: c */
        public static void m11665c(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i, int i2) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }

        @DoNotInline
        /* renamed from: d */
        public static void m11664d(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    @RequiresApi(30)
    /* renamed from: androidx.core.view.ViewCompat$n */
    /* loaded from: classes.dex */
    public static class C0825n {
        @DoNotInline
        /* renamed from: a */
        public static CharSequence m11663a(View view) {
            CharSequence stateDescription;
            stateDescription = view.getStateDescription();
            return stateDescription;
        }

        @DoNotInline
        /* renamed from: b */
        public static void m11662b(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    @RequiresApi(31)
    /* renamed from: androidx.core.view.ViewCompat$o */
    /* loaded from: classes.dex */
    public static final class C0826o {
        @Nullable
        @DoNotInline
        /* renamed from: a */
        public static String[] m11661a(@NonNull View view) {
            String[] receiveContentMimeTypes;
            receiveContentMimeTypes = view.getReceiveContentMimeTypes();
            return receiveContentMimeTypes;
        }

        @Nullable
        @DoNotInline
        /* renamed from: b */
        public static ContentInfoCompat m11660b(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
            ContentInfo performReceiveContent;
            ContentInfo mo11786c = contentInfoCompat.f2505a.mo11786c();
            Objects.requireNonNull(mo11786c);
            performReceiveContent = view.performReceiveContent(mo11786c);
            if (performReceiveContent == null) {
                return null;
            }
            if (performReceiveContent == mo11786c) {
                return contentInfoCompat;
            }
            return new ContentInfoCompat(new ContentInfoCompat.C0808d(performReceiveContent));
        }

        @DoNotInline
        /* renamed from: c */
        public static void m11659c(@NonNull View view, @Nullable String[] strArr, @Nullable InterfaceC0953j0 interfaceC0953j0) {
            if (interfaceC0953j0 == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC0827p(interfaceC0953j0));
            }
        }
    }

    @RequiresApi(31)
    /* renamed from: androidx.core.view.ViewCompat$p */
    /* loaded from: classes.dex */
    public static final class OnReceiveContentListenerC0827p implements OnReceiveContentListener {
        @NonNull

        /* renamed from: a */
        public final InterfaceC0953j0 f2532a;

        public OnReceiveContentListenerC0827p(@NonNull InterfaceC0953j0 interfaceC0953j0) {
            this.f2532a = interfaceC0953j0;
        }

        @Override // android.view.OnReceiveContentListener
        @Nullable
        public final ContentInfo onReceiveContent(@NonNull View view, @NonNull ContentInfo contentInfo) {
            ContentInfoCompat contentInfoCompat = new ContentInfoCompat(new ContentInfoCompat.C0808d(contentInfo));
            ContentInfoCompat mo11242a = this.f2532a.mo11242a(view, contentInfoCompat);
            if (mo11242a == null) {
                return null;
            }
            if (mo11242a == contentInfoCompat) {
                return contentInfo;
            }
            ContentInfo mo11786c = mo11242a.f2505a.mo11786c();
            Objects.requireNonNull(mo11786c);
            return mo11786c;
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$q */
    /* loaded from: classes.dex */
    public interface InterfaceC0828q {
        /* renamed from: a */
        boolean m11658a();
    }

    /* renamed from: androidx.core.view.ViewCompat$r */
    /* loaded from: classes.dex */
    public static class C0829r {

        /* renamed from: d */
        public static final ArrayList<WeakReference<View>> f2533d = new ArrayList<>();
        @Nullable

        /* renamed from: a */
        public WeakHashMap<View, Boolean> f2534a = null;

        /* renamed from: b */
        public SparseArray<WeakReference<View>> f2535b = null;

        /* renamed from: c */
        public WeakReference<KeyEvent> f2536c = null;

        /* renamed from: b */
        public static boolean m11656b(@NonNull View view, @NonNull KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((InterfaceC0828q) arrayList.get(size)).m11658a()) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        @Nullable
        /* renamed from: a */
        public final View m11657a(View view, KeyEvent keyEvent) {
            View m11657a;
            WeakHashMap<View, Boolean> weakHashMap = this.f2534a;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                do {
                    childCount--;
                    if (childCount >= 0) {
                        m11657a = m11657a(viewGroup.getChildAt(childCount), keyEvent);
                    }
                } while (m11657a == null);
                return m11657a;
            }
            if (m11656b(view, keyEvent)) {
                return view;
            }
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [androidx.core.view.n0] */
    static {
        new AtomicInteger(1);
        f2518a = null;
        f2520c = false;
        f2521d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f2522e = new InterfaceC0959k0() { // from class: androidx.core.view.n0
            @Override // androidx.core.view.InterfaceC0959k0
            /* renamed from: a */
            public final ContentInfoCompat mo11407a(ContentInfoCompat contentInfoCompat) {
                return contentInfoCompat;
            }
        };
        f2523f = new ViewTreeObserver$OnGlobalLayoutListenerC0811a();
    }

    @NonNull
    /* renamed from: a */
    public static C0922g2 m11784a(@NonNull View view) {
        if (f2518a == null) {
            f2518a = new WeakHashMap<>();
        }
        C0922g2 c0922g2 = f2518a.get(view);
        if (c0922g2 == null) {
            C0922g2 c0922g22 = new C0922g2(view);
            f2518a.put(view, c0922g22);
            return c0922g22;
        }
        return c0922g2;
    }

    @NonNull
    /* renamed from: b */
    public static WindowInsetsCompat m11783b(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets m11636h = windowInsetsCompat.m11636h();
        if (m11636h != null) {
            WindowInsets m11724a = C0818h.m11724a(view, m11636h);
            if (!m11724a.equals(m11636h)) {
                return WindowInsetsCompat.m11635i(view, m11724a);
            }
        }
        return windowInsetsCompat;
    }

    @UiThread
    /* renamed from: c */
    public static boolean m11782c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = C0829r.f2533d;
        C0829r c0829r = (C0829r) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c0829r == null) {
            c0829r = new C0829r();
            view.setTag(R.id.tag_unhandled_key_event_manager, c0829r);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = c0829r.f2534a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = C0829r.f2533d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (c0829r.f2534a == null) {
                        c0829r.f2534a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = C0829r.f2533d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            c0829r.f2534a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                c0829r.f2534a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View m11657a = c0829r.m11657a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (m11657a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c0829r.f2535b == null) {
                    c0829r.f2535b = new SparseArray<>();
                }
                c0829r.f2535b.put(keyCode, new WeakReference<>(m11657a));
            }
        }
        if (m11657a == null) {
            return false;
        }
        return true;
    }

    @Nullable
    /* renamed from: d */
    public static View.AccessibilityDelegate m11781d(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return C0824m.m11667a(view);
        }
        if (f2520c) {
            return null;
        }
        if (f2519b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f2519b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f2520c = true;
                return null;
            }
        }
        Object obj = f2519b.get(view);
        if (!(obj instanceof View.AccessibilityDelegate)) {
            return null;
        }
        return (View.AccessibilityDelegate) obj;
    }

    @Nullable
    @UiThread
    /* renamed from: e */
    public static CharSequence m11780e(@NonNull View view) {
        boolean z;
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            tag = C0823l.m11675b(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* renamed from: f */
    public static ArrayList m11779f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    @Nullable
    /* renamed from: g */
    public static String[] m11778g(@NonNull View view) {
        return Build.VERSION.SDK_INT >= 31 ? C0826o.m11661a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @RequiresApi(19)
    /* renamed from: h */
    public static void m11777h(int i, View view) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (m11780e(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 32;
        if (C0817g.m11731a(view) == 0 && !z) {
            if (i == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                C0817g.m11725g(obtain, i);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(m11780e(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    C0817g.m11727e(view.getParent(), view, view, i);
                    return;
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z) {
            i2 = 2048;
        }
        obtain2.setEventType(i2);
        C0817g.m11725g(obtain2, i);
        if (z) {
            obtain2.getText().add(m11780e(view));
            if (C0814d.m11762c(view) == 0) {
                C0814d.m11746s(view, 1);
            }
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (C0814d.m11762c((View) parent) == 4) {
                    C0814d.m11746s(view, 2);
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    @NonNull
    /* renamed from: i */
    public static WindowInsetsCompat m11776i(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
        WindowInsets m11636h = windowInsetsCompat.m11636h();
        if (m11636h != null) {
            WindowInsets m11723b = C0818h.m11723b(view, m11636h);
            if (!m11723b.equals(m11636h)) {
                return WindowInsetsCompat.m11635i(view, m11723b);
            }
        }
        return windowInsetsCompat;
    }

    @Nullable
    /* renamed from: j */
    public static ContentInfoCompat m11775j(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C0826o.m11660b(view, contentInfoCompat);
        }
        InterfaceC0953j0 interfaceC0953j0 = (InterfaceC0953j0) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0959k0 interfaceC0959k0 = f2522e;
        if (interfaceC0953j0 != null) {
            ContentInfoCompat mo11242a = interfaceC0953j0.mo11242a(view, contentInfoCompat);
            if (mo11242a == null) {
                return null;
            }
            if (view instanceof InterfaceC0959k0) {
                interfaceC0959k0 = (InterfaceC0959k0) view;
            }
            return interfaceC0959k0.mo11407a(mo11242a);
        }
        if (view instanceof InterfaceC0959k0) {
            interfaceC0959k0 = (InterfaceC0959k0) view;
        }
        return interfaceC0959k0.mo11407a(contentInfoCompat);
    }

    /* renamed from: k */
    public static void m11774k(int i, View view) {
        ArrayList m11779f = m11779f(view);
        for (int i2 = 0; i2 < m11779f.size(); i2++) {
            if (((C0874o.C0875a) m11779f.get(i2)).m11546a() == i) {
                m11779f.remove(i2);
                return;
            }
        }
    }

    /* renamed from: l */
    public static void m11773l(@NonNull View view, @NonNull C0874o.C0875a c0875a, @Nullable InterfaceC0883s interfaceC0883s) {
        C0851a c0851a;
        C0874o.C0875a c0875a2 = new C0874o.C0875a(null, c0875a.f2618b, null, interfaceC0883s, c0875a.f2619c);
        View.AccessibilityDelegate m11781d = m11781d(view);
        if (m11781d == null) {
            c0851a = null;
        } else if (m11781d instanceof C0851a.C0852a) {
            c0851a = ((C0851a.C0852a) m11781d).f2599a;
        } else {
            c0851a = new C0851a(m11781d);
        }
        if (c0851a == null) {
            c0851a = new C0851a();
        }
        m11771n(view, c0851a);
        m11774k(c0875a2.m11546a(), view);
        m11779f(view).add(c0875a2);
        m11777h(0, view);
    }

    /* renamed from: m */
    public static void m11772m(@NonNull View view, @NonNull @SuppressLint({"ContextFirst"}) Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            C0824m.m11665c(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* renamed from: n */
    public static void m11771n(@NonNull View view, @Nullable C0851a c0851a) {
        C0851a.C0852a c0852a;
        if (c0851a == null && (m11781d(view) instanceof C0851a.C0852a)) {
            c0851a = new C0851a();
        }
        if (c0851a == null) {
            c0852a = null;
        } else {
            c0852a = c0851a.f2598b;
        }
        view.setAccessibilityDelegate(c0852a);
    }

    @UiThread
    /* renamed from: o */
    public static void m11770o(@NonNull View view, @Nullable CharSequence charSequence) {
        boolean z;
        new C0985p0().m11766e(view, charSequence);
        ViewTreeObserver$OnGlobalLayoutListenerC0811a viewTreeObserver$OnGlobalLayoutListenerC0811a = f2523f;
        if (charSequence != null) {
            WeakHashMap<View, Boolean> weakHashMap = viewTreeObserver$OnGlobalLayoutListenerC0811a.f2524a;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(viewTreeObserver$OnGlobalLayoutListenerC0811a);
            if (C0817g.m11730b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC0811a);
                return;
            }
            return;
        }
        viewTreeObserver$OnGlobalLayoutListenerC0811a.f2524a.remove(view);
        view.removeOnAttachStateChangeListener(viewTreeObserver$OnGlobalLayoutListenerC0811a);
        C0814d.m11750o(view.getViewTreeObserver(), viewTreeObserver$OnGlobalLayoutListenerC0811a);
    }

    /* renamed from: p */
    public static void m11769p(@NonNull View view, @Nullable WindowInsetsAnimationCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(new WindowInsetsAnimationCompat.C0836c.C0837a(callback));
            return;
        }
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        View.OnApplyWindowInsetsListener view$OnApplyWindowInsetsListenerC0832a = new WindowInsetsAnimationCompat.C0831b.View$OnApplyWindowInsetsListenerC0832a(view, callback);
        view.setTag(R.id.tag_window_insets_animation_callback, view$OnApplyWindowInsetsListenerC0832a);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(view$OnApplyWindowInsetsListenerC0832a);
        }
    }
}
