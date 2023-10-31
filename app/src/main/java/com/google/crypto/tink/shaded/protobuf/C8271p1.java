package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.google.crypto.tink.shaded.protobuf.p1 */
/* loaded from: classes3.dex */
public final class C8271p1 {

    /* renamed from: a */
    public static final Logger f16063a = Logger.getLogger(C8271p1.class.getName());

    /* renamed from: b */
    public static final Unsafe f16064b;

    /* renamed from: c */
    public static final Class<?> f16065c;

    /* renamed from: d */
    public static final AbstractC8276e f16066d;

    /* renamed from: e */
    public static final boolean f16067e;

    /* renamed from: f */
    public static final boolean f16068f;

    /* renamed from: g */
    public static final long f16069g;

    /* renamed from: h */
    public static final boolean f16070h;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.p1$a */
    /* loaded from: classes3.dex */
    public class C8272a implements PrivilegedExceptionAction<Unsafe> {
        /* renamed from: a */
        public static Unsafe m3587a() throws Exception {
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
            return m3587a();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.p1$b */
    /* loaded from: classes3.dex */
    public static final class C8273b extends AbstractC8276e {
        public C8273b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: c */
        public final boolean mo3584c(long j, Object obj) {
            if (C8271p1.f16070h) {
                if (C8271p1.m3604h(j, obj) != 0) {
                    return true;
                }
                return false;
            } else if (C8271p1.m3603i(j, obj) != 0) {
                return true;
            } else {
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: d */
        public final byte mo3583d(long j, Object obj) {
            if (C8271p1.f16070h) {
                return C8271p1.m3604h(j, obj);
            }
            return C8271p1.m3603i(j, obj);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: e */
        public final double mo3582e(long j, Object obj) {
            return Double.longBitsToDouble(m3579h(j, obj));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: f */
        public final float mo3581f(long j, Object obj) {
            return Float.intBitsToFloat(m3580g(j, obj));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: k */
        public final void mo3576k(Object obj, long j, boolean z) {
            if (C8271p1.f16070h) {
                C8271p1.m3594r(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                C8271p1.m3593s(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: l */
        public final void mo3575l(Object obj, long j, byte b) {
            if (C8271p1.f16070h) {
                C8271p1.m3594r(obj, j, b);
            } else {
                C8271p1.m3593s(obj, j, b);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: m */
        public final void mo3574m(Object obj, long j, double d) {
            m3571p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: n */
        public final void mo3573n(Object obj, long j, float f) {
            m3572o(obj, Float.floatToIntBits(f), j);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.p1$c */
    /* loaded from: classes3.dex */
    public static final class C8274c extends AbstractC8276e {
        public C8274c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: c */
        public final boolean mo3584c(long j, Object obj) {
            if (C8271p1.f16070h) {
                if (C8271p1.m3604h(j, obj) != 0) {
                    return true;
                }
                return false;
            } else if (C8271p1.m3603i(j, obj) != 0) {
                return true;
            } else {
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: d */
        public final byte mo3583d(long j, Object obj) {
            if (C8271p1.f16070h) {
                return C8271p1.m3604h(j, obj);
            }
            return C8271p1.m3603i(j, obj);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: e */
        public final double mo3582e(long j, Object obj) {
            return Double.longBitsToDouble(m3579h(j, obj));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: f */
        public final float mo3581f(long j, Object obj) {
            return Float.intBitsToFloat(m3580g(j, obj));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: k */
        public final void mo3576k(Object obj, long j, boolean z) {
            if (C8271p1.f16070h) {
                C8271p1.m3594r(obj, j, z ? (byte) 1 : (byte) 0);
            } else {
                C8271p1.m3593s(obj, j, z ? (byte) 1 : (byte) 0);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: l */
        public final void mo3575l(Object obj, long j, byte b) {
            if (C8271p1.f16070h) {
                C8271p1.m3594r(obj, j, b);
            } else {
                C8271p1.m3593s(obj, j, b);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: m */
        public final void mo3574m(Object obj, long j, double d) {
            m3571p(obj, j, Double.doubleToLongBits(d));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: n */
        public final void mo3573n(Object obj, long j, float f) {
            m3572o(obj, Float.floatToIntBits(f), j);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.p1$d */
    /* loaded from: classes3.dex */
    public static final class C8275d extends AbstractC8276e {
        public C8275d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: c */
        public final boolean mo3584c(long j, Object obj) {
            return this.f16071a.getBoolean(obj, j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: d */
        public final byte mo3583d(long j, Object obj) {
            return this.f16071a.getByte(obj, j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: e */
        public final double mo3582e(long j, Object obj) {
            return this.f16071a.getDouble(obj, j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: f */
        public final float mo3581f(long j, Object obj) {
            return this.f16071a.getFloat(obj, j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: k */
        public final void mo3576k(Object obj, long j, boolean z) {
            this.f16071a.putBoolean(obj, j, z);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: l */
        public final void mo3575l(Object obj, long j, byte b) {
            this.f16071a.putByte(obj, j, b);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: m */
        public final void mo3574m(Object obj, long j, double d) {
            this.f16071a.putDouble(obj, j, d);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C8271p1.AbstractC8276e
        /* renamed from: n */
        public final void mo3573n(Object obj, long j, float f) {
            this.f16071a.putFloat(obj, j, f);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.p1$e */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC8276e {

        /* renamed from: a */
        public final Unsafe f16071a;

        public AbstractC8276e(Unsafe unsafe) {
            this.f16071a = unsafe;
        }

        /* renamed from: a */
        public final int m3586a(Class<?> cls) {
            return this.f16071a.arrayBaseOffset(cls);
        }

        /* renamed from: b */
        public final int m3585b(Class<?> cls) {
            return this.f16071a.arrayIndexScale(cls);
        }

        /* renamed from: c */
        public abstract boolean mo3584c(long j, Object obj);

        /* renamed from: d */
        public abstract byte mo3583d(long j, Object obj);

        /* renamed from: e */
        public abstract double mo3582e(long j, Object obj);

        /* renamed from: f */
        public abstract float mo3581f(long j, Object obj);

        /* renamed from: g */
        public final int m3580g(long j, Object obj) {
            return this.f16071a.getInt(obj, j);
        }

        /* renamed from: h */
        public final long m3579h(long j, Object obj) {
            return this.f16071a.getLong(obj, j);
        }

        /* renamed from: i */
        public final Object m3578i(long j, Object obj) {
            return this.f16071a.getObject(obj, j);
        }

        /* renamed from: j */
        public final long m3577j(Field field) {
            return this.f16071a.objectFieldOffset(field);
        }

        /* renamed from: k */
        public abstract void mo3576k(Object obj, long j, boolean z);

        /* renamed from: l */
        public abstract void mo3575l(Object obj, long j, byte b);

        /* renamed from: m */
        public abstract void mo3574m(Object obj, long j, double d);

        /* renamed from: n */
        public abstract void mo3573n(Object obj, long j, float f);

        /* renamed from: o */
        public final void m3572o(Object obj, int i, long j) {
            this.f16071a.putInt(obj, j, i);
        }

        /* renamed from: p */
        public final void m3571p(Object obj, long j, long j2) {
            this.f16071a.putLong(obj, j, j2);
        }

        /* renamed from: q */
        public final void m3570q(Object obj, long j, Object obj2) {
            this.f16071a.putObject(obj, j, obj2);
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8271p1.<clinit>():void");
    }

    /* renamed from: a */
    public static <T> T m3611a(Class<T> cls) {
        try {
            return (T) f16064b.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: b */
    public static int m3610b(Class<?> cls) {
        if (f16068f) {
            return f16066d.m3586a(cls);
        }
        return -1;
    }

    /* renamed from: c */
    public static void m3609c(Class cls) {
        if (f16068f) {
            f16066d.m3585b(cls);
        }
    }

    /* renamed from: d */
    public static Field m3608d() {
        Field field;
        Field field2;
        if (C8208d.m3919a()) {
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
    public static boolean m3607e(Class<?> cls) {
        if (C8208d.m3919a()) {
            try {
                Class<?> cls2 = f16065c;
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
    public static boolean m3606f(long j, Object obj) {
        return f16066d.mo3584c(j, obj);
    }

    /* renamed from: g */
    public static byte m3605g(byte[] bArr, long j) {
        return f16066d.mo3583d(f16069g + j, bArr);
    }

    /* renamed from: h */
    public static byte m3604h(long j, Object obj) {
        return (byte) ((m3600l((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: i */
    public static byte m3603i(long j, Object obj) {
        return (byte) ((m3600l((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: j */
    public static double m3602j(long j, Object obj) {
        return f16066d.mo3582e(j, obj);
    }

    /* renamed from: k */
    public static float m3601k(long j, Object obj) {
        return f16066d.mo3581f(j, obj);
    }

    /* renamed from: l */
    public static int m3600l(long j, Object obj) {
        return f16066d.m3580g(j, obj);
    }

    /* renamed from: m */
    public static long m3599m(long j, Object obj) {
        return f16066d.m3579h(j, obj);
    }

    /* renamed from: n */
    public static Object m3598n(long j, Object obj) {
        return f16066d.m3578i(j, obj);
    }

    /* renamed from: o */
    public static Unsafe m3597o() {
        try {
            return (Unsafe) AccessController.doPrivileged(new C8272a());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: p */
    public static void m3596p(Object obj, long j, boolean z) {
        f16066d.mo3576k(obj, j, z);
    }

    /* renamed from: q */
    public static void m3595q(byte[] bArr, long j, byte b) {
        f16066d.mo3575l(bArr, f16069g + j, b);
    }

    /* renamed from: r */
    public static void m3594r(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int m3600l = m3600l(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        m3590v(obj, ((255 & b) << i) | (m3600l & (~(255 << i))), j2);
    }

    /* renamed from: s */
    public static void m3593s(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        m3590v(obj, ((255 & b) << i) | (m3600l(j2, obj) & (~(255 << i))), j2);
    }

    /* renamed from: t */
    public static void m3592t(Object obj, long j, double d) {
        f16066d.mo3574m(obj, j, d);
    }

    /* renamed from: u */
    public static void m3591u(Object obj, long j, float f) {
        f16066d.mo3573n(obj, j, f);
    }

    /* renamed from: v */
    public static void m3590v(Object obj, int i, long j) {
        f16066d.m3572o(obj, i, j);
    }

    /* renamed from: w */
    public static void m3589w(Object obj, long j, long j2) {
        f16066d.m3571p(obj, j, j2);
    }

    /* renamed from: x */
    public static void m3588x(Object obj, long j, Object obj2) {
        f16066d.m3570q(obj, j, obj2);
    }
}
