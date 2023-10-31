package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.InterfaceC1479k;
import androidx.lifecycle.InterfaceC1483m;
import java.lang.reflect.Field;

@RequiresApi(19)
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC1479k {

    /* renamed from: b */
    public static int f56b;

    /* renamed from: c */
    public static Field f57c;

    /* renamed from: d */
    public static Field f58d;

    /* renamed from: e */
    public static Field f59e;

    /* renamed from: a */
    public final Activity f60a;

    public ImmLeaksCleaner(Activity activity) {
        this.f60a = activity;
    }

    @Override // androidx.lifecycle.InterfaceC1479k
    public final void onStateChanged(@NonNull InterfaceC1483m interfaceC1483m, @NonNull AbstractC1464h.EnumC1465a enumC1465a) {
        if (enumC1465a != AbstractC1464h.EnumC1465a.ON_DESTROY) {
            return;
        }
        if (f56b == 0) {
            try {
                f56b = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f58d = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f59e = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f57c = declaredField3;
                declaredField3.setAccessible(true);
                f56b = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f56b == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f60a.getSystemService("input_method");
            try {
                Object obj = f57c.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f58d.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f59e.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
