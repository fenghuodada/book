package p060j$.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p060j$.util.function.InterfaceC10394L0;

/* renamed from: j$.util.DesugarCollections */
/* loaded from: classes2.dex */
public class DesugarCollections {

    /* renamed from: a */
    public static final Class f20711a;

    /* renamed from: b */
    static final Class f20712b;

    /* renamed from: c */
    private static final Field f20713c;

    /* renamed from: d */
    private static final Field f20714d;

    /* renamed from: e */
    private static final Constructor f20715e;

    /* renamed from: f */
    private static final Constructor f20716f;

    static {
        Field field;
        Field field2;
        Constructor<?> constructor;
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        f20711a = cls;
        f20712b = Collections.synchronizedList(new LinkedList()).getClass();
        Constructor<?> constructor2 = null;
        try {
            field = cls.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            field = null;
        }
        f20713c = field;
        if (field != null) {
            field.setAccessible(true);
        }
        try {
            field2 = cls.getDeclaredField("c");
        } catch (NoSuchFieldException unused2) {
            field2 = null;
        }
        f20714d = field2;
        if (field2 != null) {
            field2.setAccessible(true);
        }
        try {
            constructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(Set.class, Object.class);
        } catch (NoSuchMethodException unused3) {
            constructor = null;
        }
        f20716f = constructor;
        if (constructor != null) {
            constructor.setAccessible(true);
        }
        try {
            constructor2 = cls.getDeclaredConstructor(Collection.class, Object.class);
        } catch (NoSuchMethodException unused4) {
        }
        f20715e = constructor2;
        if (constructor2 != null) {
            constructor2.setAccessible(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m1037c(Collection collection, InterfaceC10394L0 interfaceC10394L0) {
        boolean mo954b;
        Field field = f20713c;
        if (field == null) {
            try {
                Collection collection2 = (Collection) f20714d.get(collection);
                return collection2 instanceof InterfaceC10333b ? ((InterfaceC10333b) collection2).mo954b(interfaceC10394L0) : AbstractC10331a.m1011l(collection2, interfaceC10394L0);
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e);
            }
        }
        try {
            synchronized (field.get(collection)) {
                Collection collection3 = (Collection) f20714d.get(collection);
                mo954b = collection3 instanceof InterfaceC10333b ? ((InterfaceC10333b) collection3).mo954b(interfaceC10394L0) : AbstractC10331a.m1011l(collection3, interfaceC10394L0);
            }
            return mo954b;
        } catch (IllegalAccessException e2) {
            throw new Error("Runtime illegal access in synchronized collection removeIf.", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m1036d(List list, Comparator comparator) {
        Field field = f20713c;
        if (field == null) {
            try {
                AbstractC10331a.m1019E((List) f20714d.get(list), comparator);
                return;
            } catch (IllegalAccessException e) {
                throw new Error("Runtime illegal access in synchronized collection sort fall-back.", e);
            }
        }
        try {
            synchronized (field.get(list)) {
                AbstractC10331a.m1019E((List) f20714d.get(list), comparator);
            }
        } catch (IllegalAccessException e2) {
            throw new Error("Runtime illegal access in synchronized list sort.", e2);
        }
    }

    public static <K, V> Map<K, V> synchronizedMap(Map<K, V> map) {
        return new C10369f(map);
    }
}
