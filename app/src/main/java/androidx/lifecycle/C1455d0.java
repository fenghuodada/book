package androidx.lifecycle;

import android.app.Application;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.C10751g;
import kotlin.collections.C10752h;
import kotlin.jvm.internal.C10843j;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY})
/* renamed from: androidx.lifecycle.d0 */
/* loaded from: classes.dex */
public final class C1455d0 {
    @NotNull

    /* renamed from: a */
    public static final List<Class<?>> f3426a = C10752h.m485d(Application.class, C1508y.class);
    @NotNull

    /* renamed from: b */
    public static final List<Class<?>> f3427b = C10752h.m486c(C1508y.class);

    @Nullable
    /* renamed from: a */
    public static final <T> Constructor<T> m10555a(@NotNull Class<T> modelClass, @NotNull List<? extends Class<?>> signature) {
        C10843j.m430f(modelClass, "modelClass");
        C10843j.m430f(signature, "signature");
        Constructor<?>[] constructors = modelClass.getConstructors();
        C10843j.m431e(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Constructor<T> constructor2 = (Constructor<T>) constructor;
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            C10843j.m431e(parameterTypes, "constructor.parameterTypes");
            List m489g = C10751g.m489g(parameterTypes);
            if (C10843j.m435a(signature, m489g)) {
                return constructor2;
            }
            if (signature.size() == m489g.size() && m489g.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static final <T extends AbstractC1460f0> T m10554b(@NotNull Class<T> modelClass, @NotNull Constructor<T> constructor, @NotNull Object... objArr) {
        C10843j.m430f(modelClass, "modelClass");
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Failed to access " + modelClass, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e3.getCause());
        }
    }
}
