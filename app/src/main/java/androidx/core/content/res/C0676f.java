package androidx.core.content.res;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.FontRes;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.C0676f;
import androidx.core.util.C0799c;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: androidx.core.content.res.f */
/* loaded from: classes.dex */
public final class C0676f {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f2356a = new ThreadLocal<>();
    @GuardedBy("sColorStateCacheLock")

    /* renamed from: b */
    public static final WeakHashMap<C0680d, SparseArray<C0679c>> f2357b = new WeakHashMap<>(0);

    /* renamed from: c */
    public static final Object f2358c = new Object();

    @RequiresApi(21)
    /* renamed from: androidx.core.content.res.f$a */
    /* loaded from: classes.dex */
    public static class C0677a {
        @DoNotInline
        /* renamed from: a */
        public static Drawable m11986a(Resources resources, int i, Resources.Theme theme) {
            return resources.getDrawable(i, theme);
        }

        @DoNotInline
        /* renamed from: b */
        public static Drawable m11985b(Resources resources, int i, int i2, Resources.Theme theme) {
            return resources.getDrawableForDensity(i, i2, theme);
        }
    }

    @RequiresApi(23)
    /* renamed from: androidx.core.content.res.f$b */
    /* loaded from: classes.dex */
    public static class C0678b {
        @DoNotInline
        /* renamed from: a */
        public static int m11984a(Resources resources, int i, Resources.Theme theme) {
            return resources.getColor(i, theme);
        }

        @NonNull
        @DoNotInline
        /* renamed from: b */
        public static ColorStateList m11983b(@NonNull Resources resources, @ColorRes int i, @Nullable Resources.Theme theme) {
            return resources.getColorStateList(i, theme);
        }
    }

    /* renamed from: androidx.core.content.res.f$c */
    /* loaded from: classes.dex */
    public static class C0679c {

        /* renamed from: a */
        public final ColorStateList f2359a;

        /* renamed from: b */
        public final Configuration f2360b;

        /* renamed from: c */
        public final int f2361c;

        public C0679c(@NonNull ColorStateList colorStateList, @NonNull Configuration configuration, @Nullable Resources.Theme theme) {
            this.f2359a = colorStateList;
            this.f2360b = configuration;
            this.f2361c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* renamed from: androidx.core.content.res.f$d */
    /* loaded from: classes.dex */
    public static final class C0680d {

        /* renamed from: a */
        public final Resources f2362a;

        /* renamed from: b */
        public final Resources.Theme f2363b;

        public C0680d(@NonNull Resources resources, @Nullable Resources.Theme theme) {
            this.f2362a = resources;
            this.f2363b = theme;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0680d.class != obj.getClass()) {
                return false;
            }
            C0680d c0680d = (C0680d) obj;
            if (this.f2362a.equals(c0680d.f2362a) && C0799c.m11795a(this.f2363b, c0680d.f2363b)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return C0799c.m11794b(this.f2362a, this.f2363b);
        }
    }

    /* renamed from: androidx.core.content.res.f$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0681e {
        @NonNull
        @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
        public static Handler getHandler(@Nullable Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
        public final void callbackFailAsync(final int i, @Nullable Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: androidx.core.content.res.h
                @Override // java.lang.Runnable
                public final void run() {
                    C0676f.AbstractC0681e.this.lambda$callbackFailAsync$1(i);
                }
            });
        }

        @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
        public final void callbackSuccessAsync(@NonNull final Typeface typeface, @Nullable Handler handler) {
            getHandler(handler).post(new Runnable() { // from class: androidx.core.content.res.g
                @Override // java.lang.Runnable
                public final void run() {
                    C0676f.AbstractC0681e.this.lambda$callbackSuccessAsync$0(typeface);
                }
            });
        }

        /* renamed from: onFontRetrievalFailed */
        public abstract void lambda$callbackFailAsync$1(int i);

        /* renamed from: onFontRetrieved */
        public abstract void lambda$callbackSuccessAsync$0(@NonNull Typeface typeface);
    }

    /* renamed from: androidx.core.content.res.f$f */
    /* loaded from: classes.dex */
    public static final class C0682f {

        @RequiresApi(23)
        /* renamed from: androidx.core.content.res.f$f$a */
        /* loaded from: classes.dex */
        public static class C0683a {

            /* renamed from: a */
            public static final Object f2364a = new Object();

            /* renamed from: b */
            public static Method f2365b;

            /* renamed from: c */
            public static boolean f2366c;
        }

        @RequiresApi(29)
        /* renamed from: androidx.core.content.res.f$f$b */
        /* loaded from: classes.dex */
        public static class C0684b {
            @DoNotInline
            /* renamed from: a */
            public static void m11979a(@NonNull Resources.Theme theme) {
                theme.rebase();
            }
        }

        /* renamed from: a */
        public static void m11980a(@NonNull Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                C0684b.m11979a(theme);
                return;
            }
            synchronized (C0683a.f2364a) {
                if (!C0683a.f2366c) {
                    try {
                        Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                        C0683a.f2365b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e) {
                        Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                    }
                    C0683a.f2366c = true;
                }
                Method method = C0683a.f2365b;
                if (method != null) {
                    try {
                        method.invoke(theme, new Object[0]);
                    } catch (IllegalAccessException | InvocationTargetException e2) {
                        Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                        C0683a.f2365b = null;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m11990a(@NonNull C0680d c0680d, @ColorRes int i, @NonNull ColorStateList colorStateList, @Nullable Resources.Theme theme) {
        synchronized (f2358c) {
            WeakHashMap<C0680d, SparseArray<C0679c>> weakHashMap = f2357b;
            SparseArray<C0679c> sparseArray = weakHashMap.get(c0680d);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(c0680d, sparseArray);
            }
            sparseArray.append(i, new C0679c(colorStateList, c0680d.f2362a.getConfiguration(), theme));
        }
    }

    @Nullable
    /* renamed from: b */
    public static Typeface m11989b(@NonNull Context context, @FontRes int i) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return m11987d(context, i, new TypedValue(), 0, null, false, false);
    }

    /* renamed from: c */
    public static void m11988c(@NonNull Context context, @FontRes int i, @NonNull AbstractC0681e abstractC0681e) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            abstractC0681e.callbackFailAsync(-4, null);
        } else {
            m11987d(context, i, new TypedValue(), 0, abstractC0681e, false, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
        if (r20 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r20 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
        r20.callbackFailAsync(-3, null);
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface m11987d(@androidx.annotation.NonNull android.content.Context r16, int r17, @androidx.annotation.NonNull android.util.TypedValue r18, int r19, @androidx.annotation.Nullable androidx.core.content.res.C0676f.AbstractC0681e r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.res.C0676f.m11987d(android.content.Context, int, android.util.TypedValue, int, androidx.core.content.res.f$e, boolean, boolean):android.graphics.Typeface");
    }
}
