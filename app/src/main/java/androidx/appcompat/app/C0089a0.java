package androidx.appcompat.app;

import android.util.Log;
import android.util.LongSparseArray;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Field;

/* renamed from: androidx.appcompat.app.a0 */
/* loaded from: classes.dex */
public final class C0089a0 {

    /* renamed from: a */
    public static Field f214a;

    /* renamed from: b */
    public static boolean f215b;

    /* renamed from: c */
    public static Class<?> f216c;

    /* renamed from: d */
    public static boolean f217d;

    /* renamed from: e */
    public static Field f218e;

    /* renamed from: f */
    public static boolean f219f;

    /* renamed from: g */
    public static Field f220g;

    /* renamed from: h */
    public static boolean f221h;

    @RequiresApi(16)
    /* renamed from: androidx.appcompat.app.a0$a */
    /* loaded from: classes.dex */
    public static class C0090a {
        @DoNotInline
        /* renamed from: a */
        public static void m13032a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    @RequiresApi(16)
    /* renamed from: a */
    public static void m13033a(@NonNull Object obj) {
        LongSparseArray longSparseArray;
        if (!f217d) {
            try {
                f216c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            f217d = true;
        }
        Class<?> cls = f216c;
        if (cls == null) {
            return;
        }
        if (!f219f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f218e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e2) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
            }
            f219f = true;
        }
        Field field = f218e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e3) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            C0090a.m13032a(longSparseArray);
        }
    }
}
