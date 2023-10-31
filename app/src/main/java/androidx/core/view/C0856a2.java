package androidx.core.view;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* renamed from: androidx.core.view.a2 */
/* loaded from: classes.dex */
public final class C0856a2 {

    /* renamed from: a */
    public static final Method f2600a;

    @RequiresApi(26)
    /* renamed from: androidx.core.view.a2$a */
    /* loaded from: classes.dex */
    public static class C0857a {
        @DoNotInline
        /* renamed from: a */
        public static float m11582a(ViewConfiguration viewConfiguration) {
            float scaledHorizontalScrollFactor;
            scaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
            return scaledHorizontalScrollFactor;
        }

        @DoNotInline
        /* renamed from: b */
        public static float m11581b(ViewConfiguration viewConfiguration) {
            float scaledVerticalScrollFactor;
            scaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
            return scaledVerticalScrollFactor;
        }
    }

    @RequiresApi(28)
    /* renamed from: androidx.core.view.a2$b */
    /* loaded from: classes.dex */
    public static class C0858b {
        @DoNotInline
        /* renamed from: a */
        public static int m11580a(ViewConfiguration viewConfiguration) {
            int scaledHoverSlop;
            scaledHoverSlop = viewConfiguration.getScaledHoverSlop();
            return scaledHoverSlop;
        }

        @DoNotInline
        /* renamed from: b */
        public static boolean m11579b(ViewConfiguration viewConfiguration) {
            boolean shouldShowMenuShortcutsWhenKeyboardPresent;
            shouldShowMenuShortcutsWhenKeyboardPresent = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            return shouldShowMenuShortcutsWhenKeyboardPresent;
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f2600a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    /* renamed from: a */
    public static float m11583a(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f2600a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
}
