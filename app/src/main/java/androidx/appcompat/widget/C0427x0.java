package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.InterfaceC0710h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.x0 */
/* loaded from: classes.dex */
public final class C0427x0 {

    /* renamed from: a */
    public static final int[] f1396a = {16842912};

    /* renamed from: b */
    public static final int[] f1397b = new int[0];

    /* renamed from: c */
    public static final Rect f1398c = new Rect();

    @RequiresApi(18)
    /* renamed from: androidx.appcompat.widget.x0$a */
    /* loaded from: classes.dex */
    public static class C0428a {

        /* renamed from: a */
        public static final boolean f1399a;

        /* renamed from: b */
        public static final Method f1400b;

        /* renamed from: c */
        public static final Field f1401c;

        /* renamed from: d */
        public static final Field f1402d;

        /* renamed from: e */
        public static final Field f1403e;

        /* renamed from: f */
        public static final Field f1404f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchFieldException -> L3b java.lang.ClassNotFoundException -> L3f java.lang.NoSuchMethodException -> L43
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L35 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L39
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2f java.lang.ClassNotFoundException -> L31 java.lang.NoSuchMethodException -> L33
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2d
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L47
                r8 = r0
                goto L49
            L2d:
                r7 = r1
                goto L47
            L2f:
                r6 = r1
                goto L46
            L31:
                r6 = r1
                goto L46
            L33:
                r6 = r1
                goto L46
            L35:
                r5 = r1
                goto L3d
            L37:
                r5 = r1
                goto L41
            L39:
                r5 = r1
                goto L45
            L3b:
                r4 = r1
                r5 = r4
            L3d:
                r6 = r5
                goto L46
            L3f:
                r4 = r1
                r5 = r4
            L41:
                r6 = r5
                goto L46
            L43:
                r4 = r1
                r5 = r4
            L45:
                r6 = r5
            L46:
                r7 = r6
            L47:
                r3 = r1
                r8 = r2
            L49:
                if (r8 == 0) goto L58
                androidx.appcompat.widget.C0427x0.C0428a.f1400b = r4
                androidx.appcompat.widget.C0427x0.C0428a.f1401c = r5
                androidx.appcompat.widget.C0427x0.C0428a.f1402d = r6
                androidx.appcompat.widget.C0427x0.C0428a.f1403e = r7
                androidx.appcompat.widget.C0427x0.C0428a.f1404f = r3
                androidx.appcompat.widget.C0427x0.C0428a.f1399a = r0
                goto L64
            L58:
                androidx.appcompat.widget.C0427x0.C0428a.f1400b = r1
                androidx.appcompat.widget.C0427x0.C0428a.f1401c = r1
                androidx.appcompat.widget.C0427x0.C0428a.f1402d = r1
                androidx.appcompat.widget.C0427x0.C0428a.f1403e = r1
                androidx.appcompat.widget.C0427x0.C0428a.f1404f = r1
                androidx.appcompat.widget.C0427x0.C0428a.f1399a = r2
            L64:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0427x0.C0428a.<clinit>():void");
        }
    }

    @RequiresApi(29)
    /* renamed from: androidx.appcompat.widget.x0$b */
    /* loaded from: classes.dex */
    public static class C0429b {
        @DoNotInline
        /* renamed from: a */
        public static Insets m12478a(Drawable drawable) {
            Insets opticalInsets;
            opticalInsets = drawable.getOpticalInsets();
            return opticalInsets;
        }
    }

    /* renamed from: a */
    public static void m12481a(@NonNull Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(f1397b);
            } else {
                drawable.setState(f1396a);
            }
            drawable.setState(state);
        }
    }

    @NonNull
    /* renamed from: b */
    public static Rect m12480b(@NonNull Drawable drawable) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29) {
            Insets m12478a = C0429b.m12478a(drawable);
            i = m12478a.left;
            i2 = m12478a.top;
            i3 = m12478a.right;
            i4 = m12478a.bottom;
            return new Rect(i, i2, i3, i4);
        }
        if (drawable instanceof InterfaceC0710h) {
            drawable = ((InterfaceC0710h) drawable).m11908b();
        }
        if (i5 < 29) {
            if (C0428a.f1399a) {
                try {
                    Object invoke = C0428a.f1400b.invoke(drawable, new Object[0]);
                    if (invoke != null) {
                        return new Rect(C0428a.f1401c.getInt(invoke), C0428a.f1402d.getInt(invoke), C0428a.f1403e.getInt(invoke), C0428a.f1404f.getInt(invoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
        } else {
            boolean z = C0428a.f1399a;
        }
        return f1398c;
    }

    /* renamed from: c */
    public static PorterDuff.Mode m12479c(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}
