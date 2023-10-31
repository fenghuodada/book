package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: androidx.datastore.preferences.protobuf.s1 */
/* loaded from: classes.dex */
public final class C1242s1 {

    /* renamed from: a */
    public static final Logger f3077a = Logger.getLogger(C1242s1.class.getName());

    /* renamed from: b */
    public static final Unsafe f3078b;

    /* renamed from: c */
    public static final Class<?> f3079c;

    /* renamed from: d */
    public static final AbstractC1247e f3080d;

    /* renamed from: e */
    public static final boolean f3081e;

    /* renamed from: f */
    public static final boolean f3082f;

    /* renamed from: g */
    public static final long f3083g;

    /* renamed from: h */
    public static final boolean f3084h;

    /* renamed from: androidx.datastore.preferences.protobuf.s1$a */
    /* loaded from: classes.dex */
    public static class C1243a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public static Unsafe m10815a() throws Exception {
            Field[] declaredFields;
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
            return m10815a();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.s1$b */
    /* loaded from: classes.dex */
    public static final class C1244b extends AbstractC1247e {
        public C1244b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: c */
        public final boolean mo10812c(long j, Object obj) {
            if (C1242s1.f3084h) {
                if (C1242s1.m10829h(j, obj) != 0) {
                    return true;
                }
                return false;
            } else if (C1242s1.m10828i(j, obj) != 0) {
                return true;
            } else {
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: d */
        public final byte mo10811d(long j, Object obj) {
            if (C1242s1.f3084h) {
                return C1242s1.m10829h(j, obj);
            }
            return C1242s1.m10828i(j, obj);
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: e */
        public final double mo10810e(long j, Object obj) {
            return Double.longBitsToDouble(m10807h(j, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: f */
        public final float mo10809f(long j, Object obj) {
            return Float.intBitsToFloat(m10808g(j, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: k */
        public final void mo10804k(Object obj, long j, boolean z) {
            if (C1242s1.f3084h) {
                C1242s1.m10820q(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                C1242s1.m10819r(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: l */
        public final void mo10803l(Object obj, long j, byte b) {
            if (C1242s1.f3084h) {
                C1242s1.m10820q(obj, j, b);
            } else {
                C1242s1.m10819r(obj, j, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: m */
        public final void mo10802m(Object obj, long j, double d) {
            m10799p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: n */
        public final void mo10801n(Object obj, long j, float f) {
            m10800o(obj, Float.floatToIntBits(f), j);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.s1$c */
    /* loaded from: classes.dex */
    public static final class C1245c extends AbstractC1247e {
        public C1245c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: c */
        public final boolean mo10812c(long j, Object obj) {
            if (C1242s1.f3084h) {
                if (C1242s1.m10829h(j, obj) != 0) {
                    return true;
                }
                return false;
            } else if (C1242s1.m10828i(j, obj) != 0) {
                return true;
            } else {
                return false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: d */
        public final byte mo10811d(long j, Object obj) {
            if (C1242s1.f3084h) {
                return C1242s1.m10829h(j, obj);
            }
            return C1242s1.m10828i(j, obj);
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: e */
        public final double mo10810e(long j, Object obj) {
            return Double.longBitsToDouble(m10807h(j, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: f */
        public final float mo10809f(long j, Object obj) {
            return Float.intBitsToFloat(m10808g(j, obj));
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: k */
        public final void mo10804k(Object obj, long j, boolean z) {
            if (C1242s1.f3084h) {
                C1242s1.m10820q(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                C1242s1.m10819r(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: l */
        public final void mo10803l(Object obj, long j, byte b) {
            if (C1242s1.f3084h) {
                C1242s1.m10820q(obj, j, b);
            } else {
                C1242s1.m10819r(obj, j, b);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: m */
        public final void mo10802m(Object obj, long j, double d) {
            m10799p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: n */
        public final void mo10801n(Object obj, long j, float f) {
            m10800o(obj, Float.floatToIntBits(f), j);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.s1$d */
    /* loaded from: classes.dex */
    public static final class C1246d extends AbstractC1247e {
        public C1246d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: c */
        public final boolean mo10812c(long j, Object obj) {
            return this.f3085a.getBoolean(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: d */
        public final byte mo10811d(long j, Object obj) {
            return this.f3085a.getByte(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: e */
        public final double mo10810e(long j, Object obj) {
            return this.f3085a.getDouble(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: f */
        public final float mo10809f(long j, Object obj) {
            return this.f3085a.getFloat(obj, j);
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: k */
        public final void mo10804k(Object obj, long j, boolean z) {
            this.f3085a.putBoolean(obj, j, z);
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: l */
        public final void mo10803l(Object obj, long j, byte b) {
            this.f3085a.putByte(obj, j, b);
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: m */
        public final void mo10802m(Object obj, long j, double d) {
            this.f3085a.putDouble(obj, j, d);
        }

        @Override // androidx.datastore.preferences.protobuf.C1242s1.AbstractC1247e
        /* renamed from: n */
        public final void mo10801n(Object obj, long j, float f) {
            this.f3085a.putFloat(obj, j, f);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.s1$e */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1247e {

        /* renamed from: a */
        public final Unsafe f3085a;

        public AbstractC1247e(Unsafe unsafe) {
            this.f3085a = unsafe;
        }

        /* renamed from: a */
        public final int m10814a(Class<?> cls) {
            return this.f3085a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m10813b(Class<?> cls) {
            return this.f3085a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract boolean mo10812c(long j, Object obj);

        /* renamed from: d */
        public abstract byte mo10811d(long j, Object obj);

        /* renamed from: e */
        public abstract double mo10810e(long j, Object obj);

        /* renamed from: f */
        public abstract float mo10809f(long j, Object obj);

        /* renamed from: g */
        public final int m10808g(long j, Object obj) {
            return this.f3085a.getInt(obj, j);
        }

        /* renamed from: h */
        public final long m10807h(long j, Object obj) {
            return this.f3085a.getLong(obj, j);
        }

        /* renamed from: i */
        public final Object m10806i(long j, Object obj) {
            return this.f3085a.getObject(obj, j);
        }

        /* renamed from: j */
        public final long m10805j(Field field) {
            return this.f3085a.objectFieldOffset(field);
        }

        /* renamed from: k */
        public abstract void mo10804k(Object obj, long j, boolean z);

        /* renamed from: l */
        public abstract void mo10803l(Object obj, long j, byte b);

        /* renamed from: m */
        public abstract void mo10802m(Object obj, long j, double d);

        /* renamed from: n */
        public abstract void mo10801n(Object obj, long j, float f);

        /* renamed from: o */
        public final void m10800o(Object obj, int i, long j) {
            this.f3085a.putInt(obj, j, i);
        }

        /* renamed from: p */
        public final void m10799p(Object obj, long j, long j2) {
            this.f3085a.putLong(obj, j, j2);
        }

        /* renamed from: q */
        public final void m10798q(Object obj, long j, Object obj2) {
            this.f3085a.putObject(obj, j, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1242s1.<clinit>():void");
    }

    /* renamed from: a */
    public static <T> T m10836a(Class<T> cls) {
        try {
            return (T) f3078b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public static int m10835b(Class<?> cls) {
        if (f3082f) {
            return f3080d.m10814a(cls);
        }
        return -1;
    }

    /* renamed from: c */
    public static void m10834c(Class cls) {
        if (f3082f) {
            f3080d.m10813b(cls);
        }
    }

    /* renamed from: d */
    public static Field m10833d() {
        Field field;
        Field field2;
        if (C1166d.m11133a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* renamed from: e */
    public static boolean m10832e(Class<?> cls) {
        if (C1166d.m11133a()) {
            try {
                Class<?> cls2 = f3079c;
                Class<?> cls3 = Boolean.TYPE;
                cls2.getMethod("peekLong", cls, cls3);
                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
                Class<?> cls4 = Integer.TYPE;
                cls2.getMethod("pokeInt", cls, cls4, cls3);
                cls2.getMethod("peekInt", cls, cls3);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: f */
    public static boolean m10831f(long j, Object obj) {
        return f3080d.mo10812c(j, obj);
    }

    /* renamed from: g */
    public static byte m10830g(byte[] bArr, long j) {
        return f3080d.mo10811d(f3083g + j, bArr);
    }

    /* renamed from: h */
    public static byte m10829h(long j, Object obj) {
        return (byte) ((m10825l((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: i */
    public static byte m10828i(long j, Object obj) {
        return (byte) ((m10825l((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: j */
    public static double m10827j(long j, Object obj) {
        return f3080d.mo10810e(j, obj);
    }

    /* renamed from: k */
    public static float m10826k(long j, Object obj) {
        return f3080d.mo10809f(j, obj);
    }

    /* renamed from: l */
    public static int m10825l(long j, Object obj) {
        return f3080d.m10808g(j, obj);
    }

    /* renamed from: m */
    public static long m10824m(long j, Object obj) {
        return f3080d.m10807h(j, obj);
    }

    /* renamed from: n */
    public static Object m10823n(long j, Object obj) {
        return f3080d.m10806i(j, obj);
    }

    /* renamed from: o */
    public static Unsafe m10822o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C1243a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: p */
    public static void m10821p(byte[] bArr, long j, byte b) {
        f3080d.mo10803l(bArr, f3083g + j, b);
    }

    /* renamed from: q */
    public static void m10820q(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m10825l = m10825l(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m10818s(obj, ((255 & b) << i) | (m10825l & (~(255 << i))), j2);
    }

    /* renamed from: r */
    public static void m10819r(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m10818s(obj, ((255 & b) << i) | (m10825l(j2, obj) & (~(255 << i))), j2);
    }

    /* renamed from: s */
    public static void m10818s(Object obj, int i, long j) {
        f3080d.m10800o(obj, i, j);
    }

    /* renamed from: t */
    public static void m10817t(Object obj, long j, long j2) {
        f3080d.m10799p(obj, j, j2);
    }

    /* renamed from: u */
    public static void m10816u(Object obj, long j, Object obj2) {
        f3080d.m10798q(obj, j, obj2);
    }
}
