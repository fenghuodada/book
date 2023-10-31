package p060j$.util.concurrent;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* renamed from: j$.util.concurrent.w */
/* loaded from: classes2.dex */
abstract class AbstractC10361w {

    /* renamed from: a */
    private static final Unsafe f20831a;

    static {
        Field m952b = m952b();
        m952b.setAccessible(true);
        try {
            f20831a = (Unsafe) m952b.get(null);
        } catch (IllegalAccessException e) {
            throw new Error("Couldn't get the Unsafe", e);
        }
    }

    /* renamed from: a */
    public static final int m953a(Unsafe unsafe, Object obj, long j) {
        int intVolatile;
        do {
            intVolatile = unsafe.getIntVolatile(obj, j);
        } while (!unsafe.compareAndSwapInt(obj, j, intVolatile, intVolatile - 4));
        return intVolatile;
    }

    /* renamed from: b */
    private static Field m952b() {
        Field[] declaredFields;
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new Error("Couldn't find the Unsafe", e);
        }
    }

    /* renamed from: c */
    public static Unsafe m951c() {
        return f20831a;
    }
}
