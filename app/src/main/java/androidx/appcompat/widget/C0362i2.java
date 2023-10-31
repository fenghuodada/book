package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.RestrictTo;
import androidx.core.view.C0922g2;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.i2 */
/* loaded from: classes.dex */
public final class C0362i2 {

    /* renamed from: a */
    public static final Method f1277a;
    @ChecksSdkIntAtLeast(api = 27)
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY})

    /* renamed from: b */
    public static final boolean f1278b;

    static {
        f1278b = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f1277a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    /* renamed from: a */
    public static boolean m12616a(View view) {
        WeakHashMap<View, C0922g2> weakHashMap = ViewCompat.f2518a;
        if (ViewCompat.C0815e.m11742d(view) == 1) {
            return true;
        }
        return false;
    }
}
