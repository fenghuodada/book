package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.collection.C0482i;
import androidx.core.content.C0663f;
import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class FragmentFactory {
    private static final C0482i<ClassLoader, C0482i<String, Class<?>>> sClassCacheMap = new C0482i<>();

    public static boolean isFragmentClass(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return Fragment.class.isAssignableFrom(loadClass(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @NonNull
    private static Class<?> loadClass(@NonNull ClassLoader classLoader, @NonNull String str) throws ClassNotFoundException {
        C0482i<ClassLoader, C0482i<String, Class<?>>> c0482i = sClassCacheMap;
        C0482i<String, Class<?>> orDefault = c0482i.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new C0482i<>();
            c0482i.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 == null) {
            Class<?> cls = Class.forName(str, false, classLoader);
            orDefault.put(str, cls);
            return cls;
        }
        return orDefault2;
    }

    @NonNull
    public static Class<? extends Fragment> loadFragmentClass(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return loadClass(classLoader, str);
        } catch (ClassCastException e) {
            throw new Fragment.InstantiationException(C0663f.m12005a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new Fragment.InstantiationException(C0663f.m12005a("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    @NonNull
    public Fragment instantiate(@NonNull ClassLoader classLoader, @NonNull String str) {
        try {
            return loadFragmentClass(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new Fragment.InstantiationException(C0663f.m12005a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new Fragment.InstantiationException(C0663f.m12005a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new Fragment.InstantiationException(C0663f.m12005a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new Fragment.InstantiationException(C0663f.m12005a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}
