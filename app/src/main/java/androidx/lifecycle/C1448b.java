package androidx.lifecycle;

import androidx.annotation.Nullable;
import androidx.lifecycle.AbstractC1464h;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: androidx.lifecycle.b */
/* loaded from: classes.dex */
public final class C1448b {

    /* renamed from: c */
    public static final C1448b f3413c = new C1448b();

    /* renamed from: a */
    public final HashMap f3414a = new HashMap();

    /* renamed from: b */
    public final HashMap f3415b = new HashMap();

    @Deprecated
    /* renamed from: androidx.lifecycle.b$a */
    /* loaded from: classes.dex */
    public static class C1449a {

        /* renamed from: a */
        public final HashMap f3416a = new HashMap();

        /* renamed from: b */
        public final Map<C1450b, AbstractC1464h.EnumC1465a> f3417b;

        public C1449a(HashMap hashMap) {
            this.f3417b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                AbstractC1464h.EnumC1465a enumC1465a = (AbstractC1464h.EnumC1465a) entry.getValue();
                List list = (List) this.f3416a.get(enumC1465a);
                if (list == null) {
                    list = new ArrayList();
                    this.f3416a.put(enumC1465a, list);
                }
                list.add((C1450b) entry.getKey());
            }
        }

        /* renamed from: a */
        public static void m10563a(List<C1450b> list, InterfaceC1483m interfaceC1483m, AbstractC1464h.EnumC1465a enumC1465a, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C1450b c1450b = list.get(size);
                    c1450b.getClass();
                    try {
                        int i = c1450b.f3418a;
                        Method method = c1450b.f3419b;
                        if (i != 0) {
                            if (i != 1) {
                                if (i == 2) {
                                    method.invoke(obj, interfaceC1483m, enumC1465a);
                                }
                            } else {
                                method.invoke(obj, interfaceC1483m);
                            }
                        } else {
                            method.invoke(obj, new Object[0]);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    /* renamed from: androidx.lifecycle.b$b */
    /* loaded from: classes.dex */
    public static final class C1450b {

        /* renamed from: a */
        public final int f3418a;

        /* renamed from: b */
        public final Method f3419b;

        public C1450b(int i, Method method) {
            this.f3418a = i;
            this.f3419b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1450b) {
                C1450b c1450b = (C1450b) obj;
                return this.f3418a == c1450b.f3418a && this.f3419b.getName().equals(c1450b.f3419b.getName());
            }
            return false;
        }

        public final int hashCode() {
            return this.f3419b.getName().hashCode() + (this.f3418a * 31);
        }
    }

    /* renamed from: c */
    public static void m10564c(HashMap hashMap, C1450b c1450b, AbstractC1464h.EnumC1465a enumC1465a, Class cls) {
        AbstractC1464h.EnumC1465a enumC1465a2 = (AbstractC1464h.EnumC1465a) hashMap.get(c1450b);
        if (enumC1465a2 == null || enumC1465a == enumC1465a2) {
            if (enumC1465a2 == null) {
                hashMap.put(c1450b, enumC1465a);
                return;
            }
            return;
        }
        Method method = c1450b.f3419b;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC1465a2 + ", new value " + enumC1465a);
    }

    /* renamed from: a */
    public final C1449a m10566a(Class<?> cls, @Nullable Method[] methodArr) {
        int i;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(m10565b(superclass).f3417b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C1450b, AbstractC1464h.EnumC1465a> entry : m10565b(cls2).f3417b.entrySet()) {
                m10564c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            OnLifecycleEvent onLifecycleEvent = (OnLifecycleEvent) method.getAnnotation(OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (InterfaceC1483m.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i = 0;
                }
                AbstractC1464h.EnumC1465a value = onLifecycleEvent.value();
                if (parameterTypes.length > 1) {
                    if (AbstractC1464h.EnumC1465a.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == AbstractC1464h.EnumC1465a.ON_ANY) {
                            i = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    m10564c(hashMap, new C1450b(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        C1449a c1449a = new C1449a(hashMap);
        this.f3414a.put(cls, c1449a);
        this.f3415b.put(cls, Boolean.valueOf(z));
        return c1449a;
    }

    /* renamed from: b */
    public final C1449a m10565b(Class<?> cls) {
        C1449a c1449a = (C1449a) this.f3414a.get(cls);
        return c1449a != null ? c1449a : m10566a(cls, null);
    }
}
