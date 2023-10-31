package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.graphics.drawable.C0159a;
import androidx.appcompat.resources.C0175b;
import androidx.appcompat.widget.C0363j;
import androidx.collection.C0473e;
import androidx.collection.C0474f;
import androidx.collection.C0475g;
import androidx.collection.C0482i;
import androidx.collection.C0483j;
import androidx.vectordrawable.graphics.drawable.C1783d;
import androidx.vectordrawable.graphics.drawable.C1792i;
import com.github.appintro.AppIntroBaseFragmentKt;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.k1 */
/* loaded from: classes.dex */
public final class C0371k1 {

    /* renamed from: i */
    public static C0371k1 f1296i;

    /* renamed from: a */
    public WeakHashMap<Context, C0483j<ColorStateList>> f1298a;

    /* renamed from: b */
    public C0482i<String, InterfaceC0376e> f1299b;

    /* renamed from: c */
    public C0483j<String> f1300c;

    /* renamed from: d */
    public final WeakHashMap<Context, C0474f<WeakReference<Drawable.ConstantState>>> f1301d = new WeakHashMap<>(0);

    /* renamed from: e */
    public TypedValue f1302e;

    /* renamed from: f */
    public boolean f1303f;

    /* renamed from: g */
    public InterfaceC0377f f1304g;

    /* renamed from: h */
    public static final PorterDuff.Mode f1295h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    public static final C0374c f1297j = new C0374c();

    /* renamed from: androidx.appcompat.widget.k1$a */
    /* loaded from: classes.dex */
    public static class C0372a implements InterfaceC0376e {
        @Override // androidx.appcompat.widget.C0371k1.InterfaceC0376e
        /* renamed from: a */
        public final Drawable mo12587a(@NonNull Context context, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                return C0159a.m12919g(context, theme, context.getResources(), attributeSet, xmlResourceParser);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.k1$b */
    /* loaded from: classes.dex */
    public static class C0373b implements InterfaceC0376e {
        @Override // androidx.appcompat.widget.C0371k1.InterfaceC0376e
        /* renamed from: a */
        public final Drawable mo12587a(@NonNull Context context, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                C1783d c1783d = new C1783d(context);
                c1783d.inflate(resources, xmlResourceParser, attributeSet, theme);
                return c1783d;
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.k1$c */
    /* loaded from: classes.dex */
    public static class C0374c extends C0475g<Integer, PorterDuffColorFilter> {
        public C0374c() {
            super(6);
        }
    }

    /* renamed from: androidx.appcompat.widget.k1$d */
    /* loaded from: classes.dex */
    public static class C0375d implements InterfaceC0376e {
        @Override // androidx.appcompat.widget.C0371k1.InterfaceC0376e
        /* renamed from: a */
        public final Drawable mo12587a(@NonNull Context context, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) C0375d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    C0175b.m12898c(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception e) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e);
                    return null;
                }
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.k1$e */
    /* loaded from: classes.dex */
    public interface InterfaceC0376e {
        /* renamed from: a */
        Drawable mo12587a(@NonNull Context context, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme);
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
    /* renamed from: androidx.appcompat.widget.k1$f */
    /* loaded from: classes.dex */
    public interface InterfaceC0377f {
    }

    /* renamed from: androidx.appcompat.widget.k1$g */
    /* loaded from: classes.dex */
    public static class C0378g implements InterfaceC0376e {
        @Override // androidx.appcompat.widget.C0371k1.InterfaceC0376e
        /* renamed from: a */
        public final Drawable mo12587a(@NonNull Context context, @NonNull XmlResourceParser xmlResourceParser, @NonNull AttributeSet attributeSet, @Nullable Resources.Theme theme) {
            try {
                Resources resources = context.getResources();
                C1792i c1792i = new C1792i();
                c1792i.inflate(resources, xmlResourceParser, attributeSet, theme);
                return c1792i;
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: d */
    public static synchronized C0371k1 m12597d() {
        C0371k1 c0371k1;
        synchronized (C0371k1.class) {
            if (f1296i == null) {
                C0371k1 c0371k12 = new C0371k1();
                f1296i = c0371k12;
                m12591j(c0371k12);
            }
            c0371k1 = f1296i;
        }
        return c0371k1;
    }

    /* renamed from: h */
    public static synchronized PorterDuffColorFilter m12593h(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C0371k1.class) {
            C0374c c0374c = f1297j;
            c0374c.getClass();
            int i2 = (i + 31) * 31;
            porterDuffColorFilter = c0374c.get(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                c0374c.getClass();
                c0374c.put(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    /* renamed from: j */
    public static void m12591j(@NonNull C0371k1 c0371k1) {
        if (Build.VERSION.SDK_INT < 24) {
            c0371k1.m12600a("vector", new C0378g());
            c0371k1.m12600a("animated-vector", new C0373b());
            c0371k1.m12600a("animated-selector", new C0372a());
            c0371k1.m12600a(AppIntroBaseFragmentKt.ARG_DRAWABLE, new C0375d());
        }
    }

    /* renamed from: a */
    public final void m12600a(@NonNull String str, @NonNull InterfaceC0376e interfaceC0376e) {
        if (this.f1299b == null) {
            this.f1299b = new C0482i<>();
        }
        this.f1299b.put(str, interfaceC0376e);
    }

    /* renamed from: b */
    public final synchronized void m12599b(@NonNull Context context, long j, @NonNull Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            C0474f<WeakReference<Drawable.ConstantState>> c0474f = this.f1301d.get(context);
            if (c0474f == null) {
                c0474f = new C0474f<>();
                this.f1301d.put(context, c0474f);
            }
            c0474f.m12419g(j, new WeakReference<>(constantState));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0107  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable m12598c(@androidx.annotation.NonNull android.content.Context r12, @androidx.annotation.DrawableRes int r13) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0371k1.m12598c(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* renamed from: e */
    public final synchronized Drawable m12596e(long j, @NonNull Context context) {
        C0474f<WeakReference<Drawable.ConstantState>> c0474f = this.f1301d.get(context);
        if (c0474f == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c0474f.m12420f(j, null);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int m12425b = C0473e.m12425b(c0474f.f1507b, c0474f.f1509d, j);
            if (m12425b >= 0) {
                Object[] objArr = c0474f.f1508c;
                Object obj = objArr[m12425b];
                Object obj2 = C0474f.f1505e;
                if (obj != obj2) {
                    objArr[m12425b] = obj2;
                    c0474f.f1506a = true;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    public final synchronized Drawable m12595f(@NonNull Context context, @DrawableRes int i) {
        return m12594g(context, i, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r0 == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0115, code lost:
        androidx.core.graphics.drawable.C0700a.C0702b.m11923i(r13, r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ea A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0032, B:20:0x0038, B:22:0x003e, B:25:0x004c, B:29:0x005d, B:31:0x0061, B:32:0x0068, B:60:0x00ea, B:62:0x00f0, B:64:0x00f8, B:66:0x00fe, B:73:0x0115, B:71:0x0111, B:75:0x011b, B:79:0x0132, B:86:0x0168, B:90:0x0192, B:97:0x019f, B:35:0x0082, B:37:0x0086, B:39:0x0092, B:40:0x009a, B:45:0x00a6, B:47:0x00b9, B:49:0x00c3, B:52:0x00cf, B:53:0x00d6, B:55:0x00d8, B:57:0x00e1, B:28:0x0056, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:100:0x01a4, B:101:0x01ad), top: B:105:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f0 A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0032, B:20:0x0038, B:22:0x003e, B:25:0x004c, B:29:0x005d, B:31:0x0061, B:32:0x0068, B:60:0x00ea, B:62:0x00f0, B:64:0x00f8, B:66:0x00fe, B:73:0x0115, B:71:0x0111, B:75:0x011b, B:79:0x0132, B:86:0x0168, B:90:0x0192, B:97:0x019f, B:35:0x0082, B:37:0x0086, B:39:0x0092, B:40:0x009a, B:45:0x00a6, B:47:0x00b9, B:49:0x00c3, B:52:0x00cf, B:53:0x00d6, B:55:0x00d8, B:57:0x00e1, B:28:0x0056, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:100:0x01a4, B:101:0x01ad), top: B:105:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8 A[Catch: all -> 0x00cc, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0032, B:20:0x0038, B:22:0x003e, B:25:0x004c, B:29:0x005d, B:31:0x0061, B:32:0x0068, B:60:0x00ea, B:62:0x00f0, B:64:0x00f8, B:66:0x00fe, B:73:0x0115, B:71:0x0111, B:75:0x011b, B:79:0x0132, B:86:0x0168, B:90:0x0192, B:97:0x019f, B:35:0x0082, B:37:0x0086, B:39:0x0092, B:40:0x009a, B:45:0x00a6, B:47:0x00b9, B:49:0x00c3, B:52:0x00cf, B:53:0x00d6, B:55:0x00d8, B:57:0x00e1, B:28:0x0056, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:100:0x01a4, B:101:0x01ad), top: B:105:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019f A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #1 {all -> 0x00cc, blocks: (B:3:0x0001, B:16:0x002d, B:18:0x0032, B:20:0x0038, B:22:0x003e, B:25:0x004c, B:29:0x005d, B:31:0x0061, B:32:0x0068, B:60:0x00ea, B:62:0x00f0, B:64:0x00f8, B:66:0x00fe, B:73:0x0115, B:71:0x0111, B:75:0x011b, B:79:0x0132, B:86:0x0168, B:90:0x0192, B:97:0x019f, B:35:0x0082, B:37:0x0086, B:39:0x0092, B:40:0x009a, B:45:0x00a6, B:47:0x00b9, B:49:0x00c3, B:52:0x00cf, B:53:0x00d6, B:55:0x00d8, B:57:0x00e1, B:28:0x0056, B:6:0x0008, B:8:0x0013, B:10:0x0017, B:100:0x01a4, B:101:0x01ad), top: B:105:0x0001, inners: #0 }] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.drawable.Drawable m12594g(@androidx.annotation.NonNull android.content.Context r13, @androidx.annotation.DrawableRes int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0371k1.m12594g(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    /* renamed from: i */
    public final synchronized ColorStateList m12592i(@NonNull Context context, @DrawableRes int i) {
        ColorStateList colorStateList;
        C0483j<ColorStateList> c0483j;
        try {
            WeakHashMap<Context, C0483j<ColorStateList>> weakHashMap = this.f1298a;
            ColorStateList colorStateList2 = null;
            if (weakHashMap != null && (c0483j = weakHashMap.get(context)) != null) {
                colorStateList = (ColorStateList) c0483j.m12394c(i, null);
            } else {
                colorStateList = null;
            }
            if (colorStateList == null) {
                InterfaceC0377f interfaceC0377f = this.f1304g;
                if (interfaceC0377f != null) {
                    colorStateList2 = ((C0363j.C0364a) interfaceC0377f).m12608c(context, i);
                }
                if (colorStateList2 != null) {
                    if (this.f1298a == null) {
                        this.f1298a = new WeakHashMap<>();
                    }
                    C0483j<ColorStateList> c0483j2 = this.f1298a.get(context);
                    if (c0483j2 == null) {
                        c0483j2 = new C0483j<>();
                        this.f1298a.put(context, c0483j2);
                    }
                    c0483j2.m12396a(i, colorStateList2);
                }
                colorStateList = colorStateList2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return colorStateList;
    }

    /* renamed from: k */
    public final synchronized void m12590k(@NonNull Context context) {
        C0474f<WeakReference<Drawable.ConstantState>> c0474f = this.f1301d.get(context);
        if (c0474f != null) {
            c0474f.m12423b();
        }
    }

    /* renamed from: l */
    public final synchronized void m12589l(C0363j.C0364a c0364a) {
        this.f1304g = c0364a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m12588m(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.DrawableRes int r8, @androidx.annotation.NonNull android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            androidx.appcompat.widget.k1$f r0 = r6.f1304g
            r1 = 0
            if (r0 == 0) goto L70
            androidx.appcompat.widget.j$a r0 = (androidx.appcompat.widget.C0363j.C0364a) r0
            android.graphics.PorterDuff$Mode r2 = androidx.appcompat.widget.C0363j.f1279b
            int[] r3 = r0.f1282a
            boolean r3 = androidx.appcompat.widget.C0363j.C0364a.m12610a(r8, r3)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L17
            r8 = 2130968879(0x7f04012f, float:1.7546424E38)
            goto L4a
        L17:
            int[] r3 = r0.f1284c
            boolean r3 = androidx.appcompat.widget.C0363j.C0364a.m12610a(r8, r3)
            if (r3 == 0) goto L23
            r8 = 2130968877(0x7f04012d, float:1.754642E38)
            goto L4a
        L23:
            int[] r0 = r0.f1285d
            boolean r0 = androidx.appcompat.widget.C0363j.C0364a.m12610a(r8, r0)
            if (r0 == 0) goto L2e
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L47
        L2e:
            r0 = 2131230807(0x7f080057, float:1.8077677E38)
            if (r8 != r0) goto L42
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r3 = r2
            r2 = r0
            r0 = r8
            r8 = r4
            goto L52
        L42:
            r0 = 2131230789(0x7f080045, float:1.807764E38)
            if (r8 != r0) goto L4d
        L47:
            r8 = 16842801(0x1010031, float:2.3693695E-38)
        L4a:
            r0 = r8
            r8 = r4
            goto L4f
        L4d:
            r8 = r1
            r0 = r8
        L4f:
            r3 = r2
            r2 = r0
            r0 = r5
        L52:
            if (r8 == 0) goto L6c
            int[] r8 = androidx.appcompat.widget.C0427x0.f1396a
            android.graphics.drawable.Drawable r8 = r9.mutate()
            int r7 = androidx.appcompat.widget.C0413s1.m12499c(r7, r2)
            android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.C0363j.m12613c(r7, r3)
            r8.setColorFilter(r7)
            if (r0 == r5) goto L6a
            r8.setAlpha(r0)
        L6a:
            r7 = r4
            goto L6d
        L6c:
            r7 = r1
        L6d:
            if (r7 == 0) goto L70
            r1 = r4
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0371k1.m12588m(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
