package androidx.core.graphics;

import android.graphics.Typeface;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RequiresApi(28)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.graphics.j */
/* loaded from: classes.dex */
public final class C0717j extends C0716i {
    @Override // androidx.core.graphics.C0716i
    /* renamed from: j */
    public final Typeface mo11892j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f2414f, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f2420l.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.core.graphics.C0716i
    /* renamed from: o */
    public final Method mo11891o(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
