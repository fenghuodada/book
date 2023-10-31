package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.C0482i;
import androidx.constraintlayout.motion.widget.C0552c;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.C0700a;
import androidx.core.util.C0799c;
import androidx.core.util.C0803g;
import androidx.core.view.C0922g2;
import androidx.core.view.C0926h0;
import androidx.core.view.C0952j;
import androidx.core.view.InterfaceC0915f0;
import androidx.core.view.InterfaceC0920g0;
import androidx.core.view.InterfaceC0932i0;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbstractC1068a;
import com.ambrose.overwall.R;
import com.vungle.warren.utility.C10083e;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0915f0, InterfaceC0920g0 {

    /* renamed from: t */
    public static final String f2187t;

    /* renamed from: u */
    public static final Class<?>[] f2188u;

    /* renamed from: v */
    public static final ThreadLocal<Map<String, Constructor<AbstractC0588c>>> f2189v;

    /* renamed from: w */
    public static final C0594h f2190w;

    /* renamed from: x */
    public static final C0803g f2191x;

    /* renamed from: a */
    public final ArrayList f2192a;

    /* renamed from: b */
    public final C0595a<View> f2193b;

    /* renamed from: c */
    public final ArrayList f2194c;

    /* renamed from: d */
    public final ArrayList f2195d;

    /* renamed from: e */
    public final int[] f2196e;

    /* renamed from: f */
    public final int[] f2197f;

    /* renamed from: g */
    public boolean f2198g;

    /* renamed from: h */
    public boolean f2199h;

    /* renamed from: i */
    public final int[] f2200i;

    /* renamed from: j */
    public View f2201j;

    /* renamed from: k */
    public View f2202k;

    /* renamed from: l */
    public ViewTreeObserver$OnPreDrawListenerC0591f f2203l;

    /* renamed from: m */
    public boolean f2204m;

    /* renamed from: n */
    public WindowInsetsCompat f2205n;

    /* renamed from: o */
    public boolean f2206o;

    /* renamed from: p */
    public Drawable f2207p;

    /* renamed from: q */
    public ViewGroup.OnHierarchyChangeListener f2208q;

    /* renamed from: r */
    public C0586a f2209r;

    /* renamed from: s */
    public final C0926h0 f2210s;

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface DefaultBehavior {
        Class<? extends AbstractC0588c> value();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public @interface DispatchChangeEvent {
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$a */
    /* loaded from: classes.dex */
    public class C0586a implements InterfaceC0932i0 {
        public C0586a() {
        }

        @Override // androidx.core.view.InterfaceC0932i0
        /* renamed from: a */
        public final WindowInsetsCompat mo2619a(View view, WindowInsetsCompat windowInsetsCompat) {
            boolean z;
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            if (!C0799c.m11795a(coordinatorLayout.f2205n, windowInsetsCompat)) {
                coordinatorLayout.f2205n = windowInsetsCompat;
                boolean z2 = true;
                if (windowInsetsCompat.m11639e() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                coordinatorLayout.f2206o = z;
                coordinatorLayout.setWillNotDraw((z || coordinatorLayout.getBackground() != null) ? false : false);
                WindowInsetsCompat.C0849k c0849k = windowInsetsCompat.f2565a;
                if (!c0849k.mo11605n()) {
                    int childCount = coordinatorLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = coordinatorLayout.getChildAt(i);
                        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                        if (ViewCompat.C0814d.m11763b(childAt) && ((C0590e) childAt.getLayoutParams()).f2213a != null && c0849k.mo11605n()) {
                            break;
                        }
                    }
                }
                coordinatorLayout.requestLayout();
            }
            return windowInsetsCompat;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$b */
    /* loaded from: classes.dex */
    public interface InterfaceC0587b {
        @NonNull
        AbstractC0588c getBehavior();
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$c */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0588c<V extends View> {
        public AbstractC0588c() {
        }

        public AbstractC0588c(Context context, AttributeSet attributeSet) {
        }

        /* renamed from: a */
        public boolean mo4558a(@NonNull View view) {
            return false;
        }

        /* renamed from: b */
        public boolean mo2731b(@NonNull View view, @NonNull View view2) {
            return false;
        }

        /* renamed from: c */
        public void mo4304c(@NonNull C0590e c0590e) {
        }

        /* renamed from: d */
        public boolean mo2730d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view) {
            return false;
        }

        /* renamed from: e */
        public void mo4788e(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        }

        /* renamed from: f */
        public void mo4442f() {
        }

        /* renamed from: g */
        public boolean mo2599g(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }

        /* renamed from: h */
        public boolean mo2724h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, int i) {
            return false;
        }

        /* renamed from: i */
        public boolean mo2729i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, int i, int i2, int i3) {
            return false;
        }

        /* renamed from: j */
        public boolean mo4746j(@NonNull View view) {
            return false;
        }

        /* renamed from: k */
        public void mo2728k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, @NonNull int[] iArr, int i3) {
        }

        @Deprecated
        /* renamed from: l */
        public void mo2727l(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i, int i2) {
        }

        /* renamed from: m */
        public void mo4745m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            mo2727l(coordinatorLayout, v, view, i2, i4);
        }

        /* renamed from: n */
        public boolean mo4787n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull Rect rect, boolean z) {
            return false;
        }

        /* renamed from: o */
        public void mo4441o(@NonNull View view, @NonNull Parcelable parcelable) {
        }

        @Nullable
        /* renamed from: p */
        public Parcelable mo4440p(@NonNull View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        /* renamed from: q */
        public boolean mo2598q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, @NonNull View view2, int i, int i2) {
            return false;
        }

        /* renamed from: r */
        public void mo4744r(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull View view, int i) {
        }

        /* renamed from: s */
        public boolean mo2597s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v, @NonNull MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$d */
    /* loaded from: classes.dex */
    public class ViewGroup$OnHierarchyChangeListenerC0589d implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup$OnHierarchyChangeListenerC0589d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f2208q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
            coordinatorLayout.m12119p(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f2208q;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$e */
    /* loaded from: classes.dex */
    public static class C0590e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public AbstractC0588c f2213a;

        /* renamed from: b */
        public boolean f2214b;

        /* renamed from: c */
        public int f2215c;

        /* renamed from: d */
        public int f2216d;

        /* renamed from: e */
        public final int f2217e;

        /* renamed from: f */
        public final int f2218f;

        /* renamed from: g */
        public int f2219g;

        /* renamed from: h */
        public int f2220h;

        /* renamed from: i */
        public int f2221i;

        /* renamed from: j */
        public int f2222j;

        /* renamed from: k */
        public View f2223k;

        /* renamed from: l */
        public View f2224l;

        /* renamed from: m */
        public boolean f2225m;

        /* renamed from: n */
        public boolean f2226n;

        /* renamed from: o */
        public boolean f2227o;

        /* renamed from: p */
        public boolean f2228p;

        /* renamed from: q */
        public final Rect f2229q;

        public C0590e(int i) {
            super(-2, i);
            this.f2214b = false;
            this.f2215c = 0;
            this.f2216d = 0;
            this.f2217e = -1;
            this.f2218f = -1;
            this.f2219g = 0;
            this.f2220h = 0;
            this.f2229q = new Rect();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C0590e(@NonNull Context context, @Nullable AttributeSet attributeSet) {
            super(context, attributeSet);
            AbstractC0588c newInstance;
            this.f2214b = false;
            this.f2215c = 0;
            this.f2216d = 0;
            this.f2217e = -1;
            this.f2218f = -1;
            this.f2219g = 0;
            this.f2220h = 0;
            this.f2229q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C10083e.f20310b);
            this.f2215c = obtainStyledAttributes.getInteger(0, 0);
            this.f2218f = obtainStyledAttributes.getResourceId(1, -1);
            this.f2216d = obtainStyledAttributes.getInteger(2, 0);
            this.f2217e = obtainStyledAttributes.getInteger(6, -1);
            this.f2219g = obtainStyledAttributes.getInt(5, 0);
            this.f2220h = obtainStyledAttributes.getInt(4, 0);
            boolean hasValue = obtainStyledAttributes.hasValue(3);
            this.f2214b = hasValue;
            if (hasValue) {
                String string = obtainStyledAttributes.getString(3);
                String str = CoordinatorLayout.f2187t;
                if (TextUtils.isEmpty(string)) {
                    newInstance = null;
                } else {
                    if (string.startsWith(".")) {
                        string = context.getPackageName() + string;
                    } else if (string.indexOf(46) < 0) {
                        String str2 = CoordinatorLayout.f2187t;
                        if (!TextUtils.isEmpty(str2)) {
                            string = str2 + '.' + string;
                        }
                    }
                    try {
                        ThreadLocal<Map<String, Constructor<AbstractC0588c>>> threadLocal = CoordinatorLayout.f2189v;
                        Map<String, Constructor<AbstractC0588c>> map = threadLocal.get();
                        if (map == null) {
                            map = new HashMap<>();
                            threadLocal.set(map);
                        }
                        Constructor<AbstractC0588c> constructor = map.get(string);
                        if (constructor == null) {
                            constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f2188u);
                            constructor.setAccessible(true);
                            map.put(string, constructor);
                        }
                        newInstance = constructor.newInstance(context, attributeSet);
                    } catch (Exception e) {
                        throw new RuntimeException(C0552c.m12192b("Could not inflate Behavior subclass ", string), e);
                    }
                }
                this.f2213a = newInstance;
            }
            obtainStyledAttributes.recycle();
            AbstractC0588c abstractC0588c = this.f2213a;
            if (abstractC0588c != null) {
                abstractC0588c.mo4304c(this);
            }
        }

        public C0590e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f2214b = false;
            this.f2215c = 0;
            this.f2216d = 0;
            this.f2217e = -1;
            this.f2218f = -1;
            this.f2219g = 0;
            this.f2220h = 0;
            this.f2229q = new Rect();
        }

        public C0590e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f2214b = false;
            this.f2215c = 0;
            this.f2216d = 0;
            this.f2217e = -1;
            this.f2218f = -1;
            this.f2219g = 0;
            this.f2220h = 0;
            this.f2229q = new Rect();
        }

        public C0590e(C0590e c0590e) {
            super((ViewGroup.MarginLayoutParams) c0590e);
            this.f2214b = false;
            this.f2215c = 0;
            this.f2216d = 0;
            this.f2217e = -1;
            this.f2218f = -1;
            this.f2219g = 0;
            this.f2220h = 0;
            this.f2229q = new Rect();
        }

        /* renamed from: a */
        public final boolean m12109a(int i) {
            if (i != 0) {
                if (i != 1) {
                    return false;
                }
                return this.f2227o;
            }
            return this.f2226n;
        }

        /* renamed from: b */
        public final void m12108b(@Nullable AbstractC0588c abstractC0588c) {
            AbstractC0588c abstractC0588c2 = this.f2213a;
            if (abstractC0588c2 != abstractC0588c) {
                if (abstractC0588c2 != null) {
                    abstractC0588c2.mo4442f();
                }
                this.f2213a = abstractC0588c;
                this.f2214b = true;
                if (abstractC0588c != null) {
                    abstractC0588c.mo4304c(this);
                }
            }
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$f */
    /* loaded from: classes.dex */
    public class ViewTreeObserver$OnPreDrawListenerC0591f implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserver$OnPreDrawListenerC0591f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.m12119p(0);
            return true;
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g */
    /* loaded from: classes.dex */
    public static class C0592g extends AbstractC1068a {
        public static final Parcelable.Creator<C0592g> CREATOR = new C0593a();

        /* renamed from: c */
        public SparseArray<Parcelable> f2231c;

        /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$g$a */
        /* loaded from: classes.dex */
        public static class C0593a implements Parcelable.ClassLoaderCreator<C0592g> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new C0592g(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new C0592g[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final C0592g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0592g(parcel, classLoader);
            }
        }

        public C0592g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f2231c = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.f2231c.append(iArr[i], readParcelableArray[i]);
            }
        }

        public C0592g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbstractC1068a, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2;
            parcel.writeParcelable(this.f2747a, i);
            SparseArray<Parcelable> sparseArray = this.f2231c;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.f2231c.keyAt(i3);
                parcelableArr[i3] = this.f2231c.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* renamed from: androidx.coordinatorlayout.widget.CoordinatorLayout$h */
    /* loaded from: classes.dex */
    public static class C0594h implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            float m11709m = ViewCompat.C0819i.m11709m(view);
            float m11709m2 = ViewCompat.C0819i.m11709m(view2);
            if (m11709m > m11709m2) {
                return -1;
            }
            if (m11709m < m11709m2) {
                return 1;
            }
            return 0;
        }
    }

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f2187t = r0 != null ? r0.getName() : null;
        f2190w = new C0594h();
        f2188u = new Class[]{Context.class, AttributeSet.class};
        f2189v = new ThreadLocal<>();
        f2191x = new C0803g(12);
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f2192a = new ArrayList();
        this.f2193b = new C0595a<>();
        this.f2194c = new ArrayList();
        this.f2195d = new ArrayList();
        this.f2196e = new int[2];
        this.f2197f = new int[2];
        this.f2210s = new C0926h0();
        int[] iArr = C10083e.f20309a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f2200i = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.f2200i;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.f2207p = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        m12110y();
        super.setOnHierarchyChangeListener(new ViewGroup$OnHierarchyChangeListenerC0589d());
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0814d.m11762c(this) == 0) {
            ViewCompat.C0814d.m11746s(this, 1);
        }
    }

    @NonNull
    /* renamed from: a */
    public static Rect m12128a() {
        Rect rect = (Rect) f2191x.mo6394b();
        return rect == null ? new Rect() : rect;
    }

    /* renamed from: f */
    public static void m12123f(int i, Rect rect, Rect rect2, C0590e c0590e, int i2, int i3) {
        int width;
        int height;
        int i4 = c0590e.f2215c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c0590e.f2216d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            if (i8 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            if (i9 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i6 != 1) {
            if (i6 != 5) {
                width -= i2;
            }
        } else {
            width -= i2 / 2;
        }
        if (i7 != 16) {
            if (i7 != 80) {
                height -= i3;
            }
        } else {
            height -= i3 / 2;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* renamed from: h */
    public static C0590e m12121h(View view) {
        C0590e c0590e = (C0590e) view.getLayoutParams();
        if (!c0590e.f2214b) {
            if (view instanceof InterfaceC0587b) {
                AbstractC0588c behavior = ((InterfaceC0587b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                c0590e.m12108b(behavior);
            } else {
                DefaultBehavior defaultBehavior = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                    if (defaultBehavior != null) {
                        break;
                    }
                }
                if (defaultBehavior != null) {
                    try {
                        c0590e.m12108b(defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
            }
            c0590e.f2214b = true;
        }
        return c0590e;
    }

    /* renamed from: u */
    public static void m12114u(@NonNull Rect rect) {
        rect.setEmpty();
        f2191x.mo6395a(rect);
    }

    /* renamed from: w */
    public static void m12112w(int i, View view) {
        C0590e c0590e = (C0590e) view.getLayoutParams();
        int i2 = c0590e.f2221i;
        if (i2 != i) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            view.offsetLeftAndRight(i - i2);
            c0590e.f2221i = i;
        }
    }

    /* renamed from: x */
    public static void m12111x(int i, View view) {
        C0590e c0590e = (C0590e) view.getLayoutParams();
        int i2 = c0590e.f2222j;
        if (i2 != i) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            view.offsetTopAndBottom(i - i2);
            c0590e.f2222j = i;
        }
    }

    /* renamed from: b */
    public final void m12127b(C0590e c0590e, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0590e).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c0590e).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0590e).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c0590e).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    /* renamed from: c */
    public final void m12126c(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            m12124e(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof C0590e) && super.checkLayoutParams(layoutParams);
    }

    @NonNull
    /* renamed from: d */
    public final ArrayList m12125d(@NonNull View view) {
        C0482i<View, ArrayList<View>> c0482i = this.f2193b.f2233b;
        int i = c0482i.f1531c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList<View> m12397l = c0482i.m12397l(i2);
            if (m12397l != null && m12397l.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0482i.m12398h(i2));
            }
        }
        ArrayList arrayList2 = this.f2195d;
        arrayList2.clear();
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        return arrayList2;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC0588c abstractC0588c = ((C0590e) view.getLayoutParams()).f2213a;
        if (abstractC0588c != null) {
            abstractC0588c.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2207p;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m12124e(View view, Rect rect) {
        ThreadLocal<Matrix> threadLocal = C0596b.f2236a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal<Matrix> threadLocal2 = C0596b.f2236a;
        Matrix matrix = threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        C0596b.m12106a(this, view, matrix);
        ThreadLocal<RectF> threadLocal3 = C0596b.f2237b;
        RectF rectF = threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: g */
    public final int m12122g(int i) {
        StringBuilder sb;
        int[] iArr = this.f2200i;
        if (iArr == null) {
            sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else if (i >= 0 && i < iArr.length) {
            return iArr[i];
        } else {
            sb = new StringBuilder("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0590e(-2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0590e(getContext(), attributeSet);
    }

    @VisibleForTesting
    public final List<View> getDependencySortedChildren() {
        m12115t();
        return Collections.unmodifiableList(this.f2192a);
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.f2205n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0926h0 c0926h0 = this.f2210s;
        return c0926h0.f2636b | c0926h0.f2635a;
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.f2207p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    /* renamed from: i */
    public final boolean m12120i(@NonNull View view, int i, int i2) {
        Rect m12128a = m12128a();
        m12124e(view, m12128a);
        try {
            return m12128a.contains(i, i2);
        } finally {
            m12114u(m12128a);
        }
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: j */
    public final void mo2713j(int i, View view) {
        C0926h0 c0926h0 = this.f2210s;
        if (i == 1) {
            c0926h0.f2636b = 0;
        } else {
            c0926h0.f2635a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C0590e c0590e = (C0590e) childAt.getLayoutParams();
            if (c0590e.m12109a(i)) {
                AbstractC0588c abstractC0588c = c0590e.f2213a;
                if (abstractC0588c != null) {
                    abstractC0588c.mo4744r(this, childAt, view, i);
                }
                if (i != 0) {
                    if (i == 1) {
                        c0590e.f2227o = false;
                    }
                } else {
                    c0590e.f2226n = false;
                }
                c0590e.f2228p = false;
            }
        }
        this.f2202k = null;
    }

    @Override // androidx.core.view.InterfaceC0920g0
    /* renamed from: k */
    public final void mo11312k(@NonNull View view, int i, int i2, int i3, int i4, int i5, @NonNull int[] iArr) {
        AbstractC0588c abstractC0588c;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C0590e c0590e = (C0590e) childAt.getLayoutParams();
                if (c0590e.m12109a(i5) && (abstractC0588c = c0590e.f2213a) != null) {
                    int[] iArr2 = this.f2196e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0588c.mo4745m(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.f2196e;
                    if (i3 > 0) {
                        min = Math.max(i6, iArr3[0]);
                    } else {
                        min = Math.min(i6, iArr3[0]);
                    }
                    i6 = min;
                    if (i4 > 0) {
                        min2 = Math.max(i7, iArr3[1]);
                    } else {
                        min2 = Math.min(i7, iArr3[1]);
                    }
                    i7 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            m12119p(1);
        }
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: l */
    public void mo2712l(View view, int i, int i2, int i3, int i4, int i5) {
        mo11312k(view, i, i2, i3, i4, 0, this.f2197f);
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: m */
    public final boolean mo2711m(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C0590e c0590e = (C0590e) childAt.getLayoutParams();
                AbstractC0588c abstractC0588c = c0590e.f2213a;
                if (abstractC0588c != null) {
                    boolean mo2598q = abstractC0588c.mo2598q(this, childAt, view, view2, i, i2);
                    z |= mo2598q;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            c0590e.f2227o = mo2598q;
                        }
                    } else {
                        c0590e.f2226n = mo2598q;
                    }
                } else if (i2 != 0) {
                    if (i2 == 1) {
                        c0590e.f2227o = false;
                    }
                } else {
                    c0590e.f2226n = false;
                }
            }
        }
        return z;
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: n */
    public final void mo2710n(View view, View view2, int i, int i2) {
        C0926h0 c0926h0 = this.f2210s;
        if (i2 == 1) {
            c0926h0.f2636b = i;
        } else {
            c0926h0.f2635a = i;
        }
        this.f2202k = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((C0590e) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // androidx.core.view.InterfaceC0915f0
    /* renamed from: o */
    public final void mo2709o(View view, int i, int i2, int[] iArr, int i3) {
        AbstractC0588c abstractC0588c;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0590e c0590e = (C0590e) childAt.getLayoutParams();
                if (c0590e.m12109a(i3) && (abstractC0588c = c0590e.f2213a) != null) {
                    int[] iArr2 = this.f2196e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    abstractC0588c.mo2728k(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.f2196e;
                    if (i > 0) {
                        min = Math.max(i4, iArr3[0]);
                    } else {
                        min = Math.min(i4, iArr3[0]);
                    }
                    i4 = min;
                    if (i2 > 0) {
                        min2 = Math.max(i5, iArr3[1]);
                    } else {
                        min2 = Math.min(i5, iArr3[1]);
                    }
                    i5 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            m12119p(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m12113v(false);
        if (this.f2204m) {
            if (this.f2203l == null) {
                this.f2203l = new ViewTreeObserver$OnPreDrawListenerC0591f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2203l);
        }
        if (this.f2205n == null) {
            WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
            if (ViewCompat.C0814d.m11763b(this)) {
                ViewCompat.C0818h.m11722c(this);
            }
        }
        this.f2199h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m12113v(false);
        if (this.f2204m && this.f2203l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2203l);
        }
        View view = this.f2202k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2199h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2206o || this.f2207p == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.f2205n;
        int m11639e = windowInsetsCompat != null ? windowInsetsCompat.m11639e() : 0;
        if (m11639e > 0) {
            this.f2207p.setBounds(0, 0, getWidth(), m11639e);
            this.f2207p.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            m12113v(true);
        }
        boolean m12116s = m12116s(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            m12113v(true);
        }
        return m12116s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC0588c abstractC0588c;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        int m11742d = ViewCompat.C0815e.m11742d(this);
        ArrayList arrayList = this.f2192a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((abstractC0588c = ((C0590e) view.getLayoutParams()).f2213a) == null || !abstractC0588c.mo2724h(this, view, m11742d))) {
                m12118q(m11742d, view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0191, code lost:
        if (r0.mo2729i(r32, r19, r25, r20, r26) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0194  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0590e c0590e = (C0590e) childAt.getLayoutParams();
                if (c0590e.m12109a(0)) {
                    AbstractC0588c abstractC0588c = c0590e.f2213a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        AbstractC0588c abstractC0588c;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C0590e c0590e = (C0590e) childAt.getLayoutParams();
                if (c0590e.m12109a(0) && (abstractC0588c = c0590e.f2213a) != null) {
                    z |= abstractC0588c.mo4746j(view);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        mo2709o(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo2712l(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        mo2710n(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C0592g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0592g c0592g = (C0592g) parcelable;
        super.onRestoreInstanceState(c0592g.f2747a);
        SparseArray<Parcelable> sparseArray = c0592g.f2231c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0588c abstractC0588c = m12121h(childAt).f2213a;
            if (id != -1 && abstractC0588c != null && (parcelable2 = sparseArray.get(id)) != null) {
                abstractC0588c.mo4441o(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable mo4440p;
        C0592g c0592g = new C0592g(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            AbstractC0588c abstractC0588c = ((C0590e) childAt.getLayoutParams()).f2213a;
            if (id != -1 && abstractC0588c != null && (mo4440p = abstractC0588c.mo4440p(childAt)) != null) {
                sparseArray.append(id, mo4440p);
            }
        }
        c0592g.f2231c = sparseArray;
        return c0592g;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return mo2711m(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        mo2713j(0, view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2201j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.m12116s(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.f2201j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.C0590e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$c r6 = r6.f2213a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.f2201j
            boolean r6 = r6.mo2597s(r0, r7, r1)
            goto L2a
        L29:
            r6 = r5
        L2a:
            android.view.View r7 = r0.f2201j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.m12113v(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final void m12119p(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        int i10;
        C0590e c0590e;
        ArrayList arrayList2;
        int i11;
        Rect rect2;
        int i12;
        View view;
        C0803g c0803g;
        C0590e c0590e2;
        int i13;
        boolean z5;
        AbstractC0588c abstractC0588c;
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        int m11742d = ViewCompat.C0815e.m11742d(this);
        ArrayList arrayList3 = this.f2192a;
        int size = arrayList3.size();
        Rect m12128a = m12128a();
        Rect m12128a2 = m12128a();
        Rect m12128a3 = m12128a();
        int i14 = i;
        int i15 = 0;
        while (true) {
            C0803g c0803g2 = f2191x;
            if (i15 < size) {
                View view2 = (View) arrayList3.get(i15);
                C0590e c0590e3 = (C0590e) view2.getLayoutParams();
                if (i14 == 0 && view2.getVisibility() == 8) {
                    arrayList = arrayList3;
                    i3 = size;
                    rect = m12128a3;
                    i2 = i15;
                } else {
                    int i16 = 0;
                    while (i16 < i15) {
                        if (c0590e3.f2224l == ((View) arrayList3.get(i16))) {
                            C0590e c0590e4 = (C0590e) view2.getLayoutParams();
                            if (c0590e4.f2223k != null) {
                                Rect m12128a4 = m12128a();
                                Rect m12128a5 = m12128a();
                                arrayList2 = arrayList3;
                                Rect m12128a6 = m12128a();
                                i10 = i16;
                                m12124e(c0590e4.f2223k, m12128a4);
                                m12126c(view2, m12128a5, false);
                                int measuredWidth = view2.getMeasuredWidth();
                                i11 = size;
                                int measuredHeight = view2.getMeasuredHeight();
                                i12 = i15;
                                c0590e = c0590e3;
                                view = view2;
                                rect2 = m12128a3;
                                c0803g = c0803g2;
                                m12123f(m11742d, m12128a4, m12128a6, c0590e4, measuredWidth, measuredHeight);
                                if (m12128a6.left == m12128a5.left && m12128a6.top == m12128a5.top) {
                                    c0590e2 = c0590e4;
                                    i13 = measuredWidth;
                                    z5 = false;
                                } else {
                                    c0590e2 = c0590e4;
                                    i13 = measuredWidth;
                                    z5 = true;
                                }
                                m12127b(c0590e2, m12128a6, i13, measuredHeight);
                                int i17 = m12128a6.left - m12128a5.left;
                                int i18 = m12128a6.top - m12128a5.top;
                                if (i17 != 0) {
                                    WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
                                    view.offsetLeftAndRight(i17);
                                }
                                if (i18 != 0) {
                                    WeakHashMap<View, C0922g2> weakHashMap3 = ViewCompat.f2518a;
                                    view.offsetTopAndBottom(i18);
                                }
                                if (z5 && (abstractC0588c = c0590e2.f2213a) != null) {
                                    abstractC0588c.mo2730d(this, view, c0590e2.f2223k);
                                }
                                m12128a4.setEmpty();
                                c0803g.mo6395a(m12128a4);
                                m12128a5.setEmpty();
                                c0803g.mo6395a(m12128a5);
                                m12128a6.setEmpty();
                                c0803g.mo6395a(m12128a6);
                                i16 = i10 + 1;
                                c0803g2 = c0803g;
                                view2 = view;
                                arrayList3 = arrayList2;
                                size = i11;
                                i15 = i12;
                                c0590e3 = c0590e;
                                m12128a3 = rect2;
                            }
                        }
                        i10 = i16;
                        c0590e = c0590e3;
                        arrayList2 = arrayList3;
                        i11 = size;
                        rect2 = m12128a3;
                        i12 = i15;
                        view = view2;
                        c0803g = c0803g2;
                        i16 = i10 + 1;
                        c0803g2 = c0803g;
                        view2 = view;
                        arrayList3 = arrayList2;
                        size = i11;
                        i15 = i12;
                        c0590e3 = c0590e;
                        m12128a3 = rect2;
                    }
                    C0590e c0590e5 = c0590e3;
                    ArrayList arrayList4 = arrayList3;
                    int i19 = size;
                    Rect rect3 = m12128a3;
                    i2 = i15;
                    View view3 = view2;
                    C0803g c0803g3 = c0803g2;
                    m12126c(view3, m12128a2, true);
                    if (c0590e5.f2219g != 0 && !m12128a2.isEmpty()) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(c0590e5.f2219g, m11742d);
                        int i20 = absoluteGravity & 112;
                        if (i20 != 48) {
                            if (i20 == 80) {
                                m12128a.bottom = Math.max(m12128a.bottom, getHeight() - m12128a2.top);
                            }
                        } else {
                            m12128a.top = Math.max(m12128a.top, m12128a2.bottom);
                        }
                        int i21 = absoluteGravity & 7;
                        if (i21 != 3) {
                            if (i21 == 5) {
                                m12128a.right = Math.max(m12128a.right, getWidth() - m12128a2.left);
                            }
                        } else {
                            m12128a.left = Math.max(m12128a.left, m12128a2.right);
                        }
                    }
                    if (c0590e5.f2220h != 0 && view3.getVisibility() == 0) {
                        WeakHashMap<View, C0922g2> weakHashMap4 = ViewCompat.f2518a;
                        if (ViewCompat.C0817g.m11729c(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                            C0590e c0590e6 = (C0590e) view3.getLayoutParams();
                            AbstractC0588c abstractC0588c2 = c0590e6.f2213a;
                            Rect m12128a7 = m12128a();
                            Rect m12128a8 = m12128a();
                            m12128a8.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                            if (abstractC0588c2 != null && abstractC0588c2.mo4558a(view3)) {
                                if (!m12128a8.contains(m12128a7)) {
                                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + m12128a7.toShortString() + " | Bounds:" + m12128a8.toShortString());
                                }
                            } else {
                                m12128a7.set(m12128a8);
                            }
                            m12128a8.setEmpty();
                            c0803g3.mo6395a(m12128a8);
                            if (!m12128a7.isEmpty()) {
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(c0590e6.f2220h, m11742d);
                                if ((absoluteGravity2 & 48) == 48 && (i8 = (m12128a7.top - ((ViewGroup.MarginLayoutParams) c0590e6).topMargin) - c0590e6.f2222j) < (i9 = m12128a.top)) {
                                    m12111x(i9 - i8, view3);
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - m12128a7.bottom) - ((ViewGroup.MarginLayoutParams) c0590e6).bottomMargin) + c0590e6.f2222j) < (i7 = m12128a.bottom)) {
                                    m12111x(height - i7, view3);
                                    z2 = true;
                                }
                                if (!z2) {
                                    m12111x(0, view3);
                                }
                                if ((absoluteGravity2 & 3) == 3 && (i5 = (m12128a7.left - ((ViewGroup.MarginLayoutParams) c0590e6).leftMargin) - c0590e6.f2221i) < (i6 = m12128a.left)) {
                                    m12112w(i6 - i5, view3);
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - m12128a7.right) - ((ViewGroup.MarginLayoutParams) c0590e6).rightMargin) + c0590e6.f2221i) < (i4 = m12128a.right)) {
                                    m12112w(width - i4, view3);
                                    z4 = true;
                                } else {
                                    z4 = z3;
                                }
                                if (!z4) {
                                    m12112w(0, view3);
                                }
                            }
                            m12128a7.setEmpty();
                            c0803g3.mo6395a(m12128a7);
                        }
                    }
                    if (i != 2) {
                        rect = rect3;
                        rect.set(((C0590e) view3.getLayoutParams()).f2229q);
                        if (rect.equals(m12128a2)) {
                            arrayList = arrayList4;
                            i3 = i19;
                            i14 = i;
                        } else {
                            ((C0590e) view3.getLayoutParams()).f2229q.set(m12128a2);
                        }
                    } else {
                        rect = rect3;
                    }
                    int i22 = i2 + 1;
                    i3 = i19;
                    while (true) {
                        arrayList = arrayList4;
                        if (i22 >= i3) {
                            break;
                        }
                        View view4 = (View) arrayList.get(i22);
                        C0590e c0590e7 = (C0590e) view4.getLayoutParams();
                        AbstractC0588c abstractC0588c3 = c0590e7.f2213a;
                        if (abstractC0588c3 != null && abstractC0588c3.mo2731b(view4, view3)) {
                            if (i == 0 && c0590e7.f2228p) {
                                c0590e7.f2228p = false;
                            } else {
                                if (i != 2) {
                                    z = abstractC0588c3.mo2730d(this, view4, view3);
                                } else {
                                    abstractC0588c3.mo4788e(this, view3);
                                    z = true;
                                }
                                if (i == 1) {
                                    c0590e7.f2228p = z;
                                }
                            }
                        }
                        i22++;
                        arrayList4 = arrayList;
                    }
                    i14 = i;
                }
                i15 = i2 + 1;
                m12128a3 = rect;
                size = i3;
                arrayList3 = arrayList;
            } else {
                Rect rect4 = m12128a3;
                m12128a.setEmpty();
                c0803g2.mo6395a(m12128a);
                m12128a2.setEmpty();
                c0803g2.mo6395a(m12128a2);
                rect4.setEmpty();
                c0803g2.mo6395a(rect4);
                return;
            }
        }
    }

    /* renamed from: q */
    public final void m12118q(int i, @NonNull View view) {
        boolean z;
        Rect m12128a;
        Rect m12128a2;
        C0590e c0590e = (C0590e) view.getLayoutParams();
        View view2 = c0590e.f2223k;
        int i2 = 0;
        if (view2 == null && c0590e.f2218f != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C0803g c0803g = f2191x;
            if (view2 != null) {
                m12128a = m12128a();
                m12128a2 = m12128a();
                try {
                    m12124e(view2, m12128a);
                    C0590e c0590e2 = (C0590e) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    m12123f(i, m12128a, m12128a2, c0590e2, measuredWidth, measuredHeight);
                    m12127b(c0590e2, m12128a2, measuredWidth, measuredHeight);
                    view.layout(m12128a2.left, m12128a2.top, m12128a2.right, m12128a2.bottom);
                    return;
                } finally {
                    m12128a.setEmpty();
                    c0803g.mo6395a(m12128a);
                    m12128a2.setEmpty();
                    c0803g.mo6395a(m12128a2);
                }
            }
            int i3 = c0590e.f2217e;
            if (i3 >= 0) {
                C0590e c0590e3 = (C0590e) view.getLayoutParams();
                int i4 = c0590e3.f2215c;
                if (i4 == 0) {
                    i4 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
                int i5 = absoluteGravity & 7;
                int i6 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i3 = width - i3;
                }
                int m12122g = m12122g(i3) - measuredWidth2;
                if (i5 != 1) {
                    if (i5 == 5) {
                        m12122g += measuredWidth2;
                    }
                } else {
                    m12122g += measuredWidth2 / 2;
                }
                if (i6 != 16) {
                    if (i6 == 80) {
                        i2 = measuredHeight2 + 0;
                    }
                } else {
                    i2 = 0 + (measuredHeight2 / 2);
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0590e3).leftMargin, Math.min(m12122g, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) c0590e3).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0590e3).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) c0590e3).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            C0590e c0590e4 = (C0590e) view.getLayoutParams();
            m12128a = m12128a();
            m12128a.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c0590e4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c0590e4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c0590e4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c0590e4).bottomMargin);
            if (this.f2205n != null) {
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                if (ViewCompat.C0814d.m11763b(this) && !ViewCompat.C0814d.m11763b(view)) {
                    m12128a.left = this.f2205n.m11641c() + m12128a.left;
                    m12128a.top = this.f2205n.m11639e() + m12128a.top;
                    m12128a.right -= this.f2205n.m11640d();
                    m12128a.bottom -= this.f2205n.m11642b();
                }
            }
            m12128a2 = m12128a();
            int i7 = c0590e4.f2215c;
            if ((i7 & 7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            C0952j.m11434b(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), m12128a, m12128a2, i);
            view.layout(m12128a2.left, m12128a2.top, m12128a2.right, m12128a2.bottom);
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    /* renamed from: r */
    public final void m12117r(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        AbstractC0588c abstractC0588c = ((C0590e) view.getLayoutParams()).f2213a;
        if (abstractC0588c != null && abstractC0588c.mo4787n(this, view, rect, z)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f2198g) {
            return;
        }
        m12113v(false);
        this.f2198g = true;
    }

    /* renamed from: s */
    public final boolean m12116s(MotionEvent motionEvent, int i) {
        boolean z;
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f2194c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            arrayList.add(getChildAt(i2));
        }
        C0594h c0594h = f2190w;
        if (c0594h != null) {
            Collections.sort(arrayList, c0594h);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            C0590e c0590e = (C0590e) view.getLayoutParams();
            AbstractC0588c abstractC0588c = c0590e.f2213a;
            if ((z2 || z3) && actionMasked != 0) {
                if (abstractC0588c != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i != 0) {
                        if (i == 1) {
                            abstractC0588c.mo2597s(this, view, motionEvent2);
                        }
                    } else {
                        abstractC0588c.mo2599g(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z2 && abstractC0588c != null) {
                    if (i != 0) {
                        if (i == 1) {
                            z2 = abstractC0588c.mo2597s(this, view, motionEvent);
                        }
                    } else {
                        z2 = abstractC0588c.mo2599g(this, view, motionEvent);
                    }
                    if (z2) {
                        this.f2201j = view;
                    }
                }
                if (c0590e.f2213a == null) {
                    c0590e.f2225m = false;
                }
                boolean z4 = c0590e.f2225m;
                if (z4) {
                    z = true;
                } else {
                    z = z4 | false;
                    c0590e.f2225m = z;
                }
                if (z && !z4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z && !z3) {
                    break;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        m12110y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2208q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f2207p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2207p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2207p.setState(getDrawableState());
                }
                Drawable drawable4 = this.f2207p;
                WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
                C0700a.C0703c.m11921b(drawable4, ViewCompat.C0815e.m11742d(this));
                Drawable drawable5 = this.f2207p;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.f2207p.setCallback(this);
            }
            WeakHashMap<View, C0922g2> weakHashMap2 = ViewCompat.f2518a;
            ViewCompat.C0814d.m11754k(this);
        }
    }

    public void setStatusBarBackgroundColor(@ColorInt int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i) {
        Drawable drawable;
        if (i != 0) {
            Context context = getContext();
            Object obj = ContextCompat.f2323a;
            drawable = ContextCompat.C0651c.m12032b(context, i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2207p;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f2207p.setVisible(z, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0071, code lost:
        if (r12 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0146, code lost:
        throw new java.lang.IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0147 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0108  */
    /* renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m12115t() {
        /*
            Method dump skipped, instructions count: 403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.m12115t():void");
    }

    /* renamed from: v */
    public final void m12113v(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            AbstractC0588c abstractC0588c = ((C0590e) childAt.getLayoutParams()).f2213a;
            if (abstractC0588c != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    abstractC0588c.mo2599g(this, childAt, obtain);
                } else {
                    abstractC0588c.mo2597s(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((C0590e) getChildAt(i2).getLayoutParams()).f2225m = false;
        }
        this.f2201j = null;
        this.f2198g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2207p;
    }

    /* renamed from: y */
    public final void m12110y() {
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0814d.m11763b(this)) {
            if (this.f2209r == null) {
                this.f2209r = new C0586a();
            }
            ViewCompat.C0819i.m11701u(this, this.f2209r);
            setSystemUiVisibility(1280);
            return;
        }
        ViewCompat.C0819i.m11701u(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0590e ? new C0590e((C0590e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C0590e((ViewGroup.MarginLayoutParams) layoutParams) : new C0590e(layoutParams);
    }
}
