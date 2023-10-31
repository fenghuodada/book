package androidx.transition;

import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;

/* renamed from: androidx.transition.e0 */
/* loaded from: classes.dex */
public class C1749e0 {

    /* renamed from: a */
    public static Field f4251a;

    /* renamed from: b */
    public static boolean f4252b;

    /* renamed from: a */
    public void mo9989a(int i, @NonNull View view) {
        if (!f4252b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f4251a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f4252b = true;
        }
        Field field = f4251a;
        if (field != null) {
            try {
                f4251a.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
