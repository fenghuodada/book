package p060j$.util.concurrent;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import p060j$.util.function.BiConsumer;
import p060j$.util.function.BiFunction;
import p060j$.util.function.Function;
import sun.misc.Unsafe;

/* renamed from: j$.util.concurrent.ConcurrentHashMap */
/* loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, InterfaceC10360v {

    /* renamed from: g */
    private static final int f20766g = (1 << (32 - 16)) - 1;

    /* renamed from: h */
    private static final int f20767h = 32 - 16;

    /* renamed from: i */
    static final int f20768i = Runtime.getRuntime().availableProcessors();

    /* renamed from: j */
    private static final Unsafe f20769j;

    /* renamed from: k */
    private static final long f20770k;

    /* renamed from: l */
    private static final long f20771l;

    /* renamed from: m */
    private static final long f20772m;

    /* renamed from: n */
    private static final long f20773n;

    /* renamed from: o */
    private static final long f20774o;

    /* renamed from: p */
    private static final long f20775p;

    /* renamed from: q */
    private static final int f20776q;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a */
    volatile transient C10351m[] f20777a;

    /* renamed from: b */
    private volatile transient C10351m[] f20778b;
    private volatile transient long baseCount;

    /* renamed from: c */
    private volatile transient C10342d[] f20779c;
    private volatile transient int cellsBusy;

    /* renamed from: d */
    private transient C10348j f20780d;

    /* renamed from: e */
    private transient C10358t f20781e;

    /* renamed from: f */
    private transient C10344f f20782f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", C10353o[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        try {
            Unsafe m951c = AbstractC10361w.m951c();
            f20769j = m951c;
            f20770k = m951c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("sizeCtl"));
            f20771l = m951c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("transferIndex"));
            f20772m = m951c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("baseCount"));
            f20773n = m951c.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("cellsBusy"));
            f20774o = m951c.objectFieldOffset(C10342d.class.getDeclaredField("value"));
            f20775p = m951c.arrayBaseOffset(C10351m[].class);
            int arrayIndexScale = m951c.arrayIndexScale(C10351m[].class);
            if (((arrayIndexScale - 1) & arrayIndexScale) != 0) {
                throw new Error("data type scale not a power of two");
            }
            f20776q = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        this.sizeCtl = i >= 536870912 ? 1073741824 : m982n(i + (i >>> 1) + 1);
    }

    public ConcurrentHashMap(int i, float f, int i2) {
        if (f <= 0.0f || i < 0 || i2 <= 0) {
            throw new IllegalArgumentException();
        }
        long j = (long) (((i < i2 ? i2 : i) / f) + 1.0d);
        this.sizeCtl = j >= 1073741824 ? 1073741824 : m982n((int) j);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r1.compareAndSwapLong(r11, r3, r5, r9) == false) goto L53;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m995a(long r12, int r14) {
        /*
            r11 = this;
            j$.util.concurrent.d[] r0 = r11.f20779c
            if (r0 != 0) goto L14
            sun.misc.Unsafe r1 = p060j$.util.concurrent.ConcurrentHashMap.f20769j
            long r3 = p060j$.util.concurrent.ConcurrentHashMap.f20772m
            long r5 = r11.baseCount
            long r9 = r5 + r12
            r2 = r11
            r7 = r9
            boolean r1 = r1.compareAndSwapLong(r2, r3, r5, r7)
            if (r1 != 0) goto L3b
        L14:
            r1 = 1
            if (r0 == 0) goto L98
            int r2 = r0.length
            int r2 = r2 - r1
            if (r2 < 0) goto L98
            int r3 = p060j$.util.concurrent.ThreadLocalRandom.m976b()
            r2 = r2 & r3
            r4 = r0[r2]
            if (r4 == 0) goto L98
            sun.misc.Unsafe r3 = p060j$.util.concurrent.ConcurrentHashMap.f20769j
            long r5 = p060j$.util.concurrent.ConcurrentHashMap.f20774o
            long r7 = r4.value
            long r9 = r7 + r12
            boolean r0 = r3.compareAndSwapLong(r4, r5, r7, r9)
            if (r0 != 0) goto L34
            r1 = r0
            goto L98
        L34:
            if (r14 > r1) goto L37
            return
        L37:
            long r9 = r11.m984l()
        L3b:
            if (r14 < 0) goto L97
        L3d:
            int r4 = r11.sizeCtl
            long r12 = (long) r4
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 < 0) goto L97
            j$.util.concurrent.m[] r12 = r11.f20777a
            if (r12 == 0) goto L97
            int r13 = r12.length
            r14 = 1073741824(0x40000000, float:2.0)
            if (r13 >= r14) goto L97
            int r13 = java.lang.Integer.numberOfLeadingZeros(r13)
            r14 = 32768(0x8000, float:4.5918E-41)
            r13 = r13 | r14
            int r14 = p060j$.util.concurrent.ConcurrentHashMap.f20767h
            if (r4 >= 0) goto L80
            int r14 = r4 >>> r14
            if (r14 != r13) goto L97
            int r14 = r13 + 1
            if (r4 == r14) goto L97
            int r14 = p060j$.util.concurrent.ConcurrentHashMap.f20766g
            int r13 = r13 + r14
            if (r4 == r13) goto L97
            j$.util.concurrent.m[] r13 = r11.f20778b
            if (r13 == 0) goto L97
            int r14 = r11.transferIndex
            if (r14 > 0) goto L6f
            goto L97
        L6f:
            sun.misc.Unsafe r0 = p060j$.util.concurrent.ConcurrentHashMap.f20769j
            long r2 = p060j$.util.concurrent.ConcurrentHashMap.f20770k
            int r5 = r4 + 1
            r1 = r11
            boolean r14 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r14 == 0) goto L92
            r11.m981o(r12, r13)
            goto L92
        L80:
            sun.misc.Unsafe r0 = p060j$.util.concurrent.ConcurrentHashMap.f20769j
            long r2 = p060j$.util.concurrent.ConcurrentHashMap.f20770k
            int r13 = r13 << r14
            int r5 = r13 + 2
            r1 = r11
            boolean r13 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r13 == 0) goto L92
            r13 = 0
            r11.m981o(r12, r13)
        L92:
            long r9 = r11.m984l()
            goto L3d
        L97:
            return
        L98:
            r11.m991e(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p060j$.util.concurrent.ConcurrentHashMap.m995a(long, int):void");
    }

    /* renamed from: b */
    static final boolean m994b(C10351m[] c10351mArr, int i, C10351m c10351m) {
        return AbstractC10339a.m968a(f20769j, c10351mArr, (i << f20776q) + f20775p, c10351m);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Class m993c(Object obj) {
        Type[] actualTypeArguments;
        if (obj instanceof Comparable) {
            Class<?> cls = obj.getClass();
            if (cls == String.class) {
                return cls;
            }
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces != null) {
                for (Type type : genericInterfaces) {
                    if (type instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) type;
                        if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                            return cls;
                        }
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static int m992d(Class cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x009d, code lost:
        if (r24.f20779c != r7) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009f, code lost:
        r1 = new p060j$.util.concurrent.C10342d[r8 << 1];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a4, code lost:
        if (r2 >= r8) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a6, code lost:
        r1[r2] = r7[r2];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ad, code lost:
        r24.f20779c = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x001b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0102 A[SYNTHETIC] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m991e(long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p060j$.util.concurrent.ConcurrentHashMap.m991e(long, boolean):void");
    }

    /* renamed from: g */
    private final C10351m[] m989g() {
        while (true) {
            C10351m[] c10351mArr = this.f20777a;
            if (c10351mArr != null && c10351mArr.length != 0) {
                return c10351mArr;
            }
            int i = this.sizeCtl;
            if (i < 0) {
                Thread.yield();
            } else if (f20769j.compareAndSwapInt(this, f20770k, i, -1)) {
                try {
                    C10351m[] c10351mArr2 = this.f20777a;
                    if (c10351mArr2 == null || c10351mArr2.length == 0) {
                        int i2 = i > 0 ? i : 16;
                        C10351m[] c10351mArr3 = new C10351m[i2];
                        this.f20777a = c10351mArr3;
                        i = i2 - (i2 >>> 2);
                        c10351mArr2 = c10351mArr3;
                    }
                    this.sizeCtl = i;
                    return c10351mArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i;
                    throw th;
                }
            }
        }
    }

    /* renamed from: j */
    static final void m986j(C10351m[] c10351mArr, int i, C10351m c10351m) {
        f20769j.putObjectVolatile(c10351mArr, (i << f20776q) + f20775p, c10351m);
    }

    /* renamed from: k */
    static final int m985k(int i) {
        return (i ^ (i >>> 16)) & Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public static final C10351m m983m(C10351m[] c10351mArr, int i) {
        return (C10351m) f20769j.getObjectVolatile(c10351mArr, (i << f20776q) + f20775p);
    }

    /* renamed from: n */
    private static final int m982n(int i) {
        int i2 = i - 1;
        int i3 = i2 | (i2 >>> 1);
        int i4 = i3 | (i3 >>> 2);
        int i5 = i4 | (i4 >>> 4);
        int i6 = i5 | (i5 >>> 8);
        int i7 = i6 | (i6 >>> 16);
        if (i7 < 0) {
            return 1;
        }
        if (i7 >= 1073741824) {
            return 1073741824;
        }
        return 1 + i7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v15, types: [j$.util.concurrent.m] */
    /* JADX WARN: Type inference failed for: r15v17, types: [j$.util.concurrent.m] */
    /* JADX WARN: Type inference failed for: r6v17, types: [j$.util.concurrent.m] */
    /* JADX WARN: Type inference failed for: r6v22, types: [j$.util.concurrent.m] */
    /* renamed from: o */
    private final void m981o(C10351m[] c10351mArr, C10351m[] c10351mArr2) {
        C10351m[] c10351mArr3;
        ConcurrentHashMap<K, V> concurrentHashMap;
        C10351m[] c10351mArr4;
        int i;
        int i2;
        C10346h c10346h;
        boolean z;
        ConcurrentHashMap<K, V> concurrentHashMap2;
        int i3;
        C10357s c10357s;
        C10357s c10357s2;
        boolean z2;
        ConcurrentHashMap<K, V> concurrentHashMap3 = this;
        int length = c10351mArr.length;
        int i4 = f20768i;
        boolean z3 = true;
        int i5 = i4 > 1 ? (length >>> 3) / i4 : length;
        int i6 = i5 < 16 ? 16 : i5;
        if (c10351mArr2 == null) {
            try {
                C10351m[] c10351mArr5 = new C10351m[length << 1];
                concurrentHashMap3.f20778b = c10351mArr5;
                concurrentHashMap3.transferIndex = length;
                c10351mArr3 = c10351mArr5;
            } catch (Throwable unused) {
                concurrentHashMap3.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            c10351mArr3 = c10351mArr2;
        }
        int length2 = c10351mArr3.length;
        C10346h c10346h2 = new C10346h(c10351mArr3);
        C10351m[] c10351mArr6 = c10351mArr;
        ConcurrentHashMap<K, V> concurrentHashMap4 = concurrentHashMap3;
        boolean z4 = true;
        int i7 = 0;
        int i8 = 0;
        boolean z5 = false;
        while (true) {
            if (z4) {
                int i9 = i7 - 1;
                if (i9 >= i8 || z5) {
                    concurrentHashMap = concurrentHashMap4;
                    c10351mArr4 = c10351mArr6;
                    i7 = i9;
                    i8 = i8;
                } else {
                    int i10 = concurrentHashMap4.transferIndex;
                    if (i10 <= 0) {
                        i7 = -1;
                        concurrentHashMap = concurrentHashMap4;
                        c10351mArr4 = c10351mArr6;
                    } else {
                        Unsafe unsafe = f20769j;
                        long j = f20771l;
                        int i11 = i10 > i6 ? i10 - i6 : 0;
                        concurrentHashMap = concurrentHashMap4;
                        c10351mArr4 = c10351mArr6;
                        int i12 = i8;
                        if (unsafe.compareAndSwapInt(this, j, i10, i11)) {
                            i7 = i10 - 1;
                            i8 = i11;
                        } else {
                            c10351mArr6 = c10351mArr4;
                            i7 = i9;
                            i8 = i12;
                            concurrentHashMap4 = concurrentHashMap;
                        }
                    }
                }
                c10351mArr6 = c10351mArr4;
                concurrentHashMap4 = concurrentHashMap;
                z4 = false;
            } else {
                ConcurrentHashMap<K, V> concurrentHashMap5 = concurrentHashMap4;
                C10351m[] c10351mArr7 = c10351mArr6;
                int i13 = i8;
                C10357s c10357s3 = null;
                if (i7 < 0 || i7 >= length || (i3 = i7 + length) >= length2) {
                    i = i6;
                    i2 = length2;
                    c10346h = c10346h2;
                    if (z5) {
                        this.f20778b = null;
                        this.f20777a = c10351mArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    z = true;
                    concurrentHashMap2 = this;
                    Unsafe unsafe2 = f20769j;
                    long j2 = f20770k;
                    int i14 = concurrentHashMap2.sizeCtl;
                    int i15 = i7;
                    if (!unsafe2.compareAndSwapInt(this, j2, i14, i14 - 1)) {
                        concurrentHashMap4 = concurrentHashMap2;
                        c10351mArr6 = c10351mArr7;
                        i7 = i15;
                    } else if (i14 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << f20767h)) {
                        return;
                    } else {
                        i7 = length;
                        concurrentHashMap4 = concurrentHashMap2;
                        z4 = true;
                        z5 = true;
                        c10351mArr6 = c10351mArr7;
                    }
                } else {
                    C10351m m983m = m983m(c10351mArr7, i7);
                    if (m983m == null) {
                        z2 = m994b(c10351mArr7, i7, c10346h2);
                    } else {
                        int i16 = m983m.f20802a;
                        if (i16 == -1) {
                            z2 = z3;
                        } else {
                            synchronized (m983m) {
                                if (m983m(c10351mArr7, i7) == m983m) {
                                    if (i16 >= 0) {
                                        int i17 = i16 & length;
                                        C10357s c10357s4 = m983m;
                                        for (C10357s c10357s5 = m983m.f20805d; c10357s5 != null; c10357s5 = c10357s5.f20805d) {
                                            int i18 = c10357s5.f20802a & length;
                                            if (i18 != i17) {
                                                c10357s4 = c10357s5;
                                                i17 = i18;
                                            }
                                        }
                                        if (i17 == 0) {
                                            c10357s = c10357s4;
                                        } else {
                                            c10357s = null;
                                            c10357s3 = c10357s4;
                                        }
                                        C10351m c10351m = m983m;
                                        while (c10351m != c10357s4) {
                                            int i19 = c10351m.f20802a;
                                            int i20 = i6;
                                            Object obj = c10351m.f20803b;
                                            int i21 = length2;
                                            Object obj2 = c10351m.f20804c;
                                            if ((i19 & length) == 0) {
                                                c10357s2 = c10357s4;
                                                c10357s = new C10351m(i19, obj, obj2, c10357s);
                                            } else {
                                                c10357s2 = c10357s4;
                                                c10357s3 = new C10351m(i19, obj, obj2, c10357s3);
                                            }
                                            c10351m = c10351m.f20805d;
                                            i6 = i20;
                                            length2 = i21;
                                            c10357s4 = c10357s2;
                                        }
                                        i = i6;
                                        i2 = length2;
                                        m986j(c10351mArr3, i7, c10357s);
                                        m986j(c10351mArr3, i3, c10357s3);
                                        m986j(c10351mArr7, i7, c10346h2);
                                        c10346h = c10346h2;
                                    } else {
                                        i = i6;
                                        i2 = length2;
                                        if (m983m instanceof C10356r) {
                                            C10356r c10356r = (C10356r) m983m;
                                            C10357s c10357s6 = null;
                                            C10357s c10357s7 = null;
                                            C10351m c10351m2 = c10356r.f20821f;
                                            int i22 = 0;
                                            int i23 = 0;
                                            C10357s c10357s8 = null;
                                            while (c10351m2 != null) {
                                                C10356r c10356r2 = c10356r;
                                                int i24 = c10351m2.f20802a;
                                                C10346h c10346h3 = c10346h2;
                                                C10357s c10357s9 = new C10357s(i24, c10351m2.f20803b, c10351m2.f20804c, null, null);
                                                if ((i24 & length) == 0) {
                                                    c10357s9.f20826h = c10357s7;
                                                    if (c10357s7 == null) {
                                                        c10357s3 = c10357s9;
                                                    } else {
                                                        c10357s7.f20805d = c10357s9;
                                                    }
                                                    i22++;
                                                    c10357s7 = c10357s9;
                                                } else {
                                                    c10357s9.f20826h = c10357s6;
                                                    if (c10357s6 == null) {
                                                        c10357s8 = c10357s9;
                                                    } else {
                                                        c10357s6.f20805d = c10357s9;
                                                    }
                                                    i23++;
                                                    c10357s6 = c10357s9;
                                                }
                                                c10351m2 = c10351m2.f20805d;
                                                c10356r = c10356r2;
                                                c10346h2 = c10346h3;
                                            }
                                            C10356r c10356r3 = c10356r;
                                            C10346h c10346h4 = c10346h2;
                                            C10351m m978r = i22 <= 6 ? m978r(c10357s3) : i23 != 0 ? new C10356r(c10357s3) : c10356r3;
                                            C10351m m978r2 = i23 <= 6 ? m978r(c10357s8) : i22 != 0 ? new C10356r(c10357s8) : c10356r3;
                                            m986j(c10351mArr3, i7, m978r);
                                            m986j(c10351mArr3, i3, m978r2);
                                            c10346h = c10346h4;
                                            m986j(c10351mArr, i7, c10346h);
                                            c10351mArr7 = c10351mArr;
                                        }
                                    }
                                    z4 = true;
                                } else {
                                    i = i6;
                                    i2 = length2;
                                }
                                c10346h = c10346h2;
                            }
                            concurrentHashMap4 = this;
                            c10351mArr6 = c10351mArr7;
                            z = true;
                            concurrentHashMap2 = concurrentHashMap4;
                        }
                    }
                    z4 = z2;
                    i = i6;
                    i2 = length2;
                    c10351mArr6 = c10351mArr7;
                    concurrentHashMap4 = concurrentHashMap5;
                    z = z3;
                    concurrentHashMap2 = concurrentHashMap3;
                    c10346h = c10346h2;
                }
                c10346h2 = c10346h;
                concurrentHashMap3 = concurrentHashMap2;
                z3 = z;
                i8 = i13;
                i6 = i;
                length2 = i2;
            }
        }
    }

    /* renamed from: p */
    private final void m980p(C10351m[] c10351mArr, int i) {
        int length = c10351mArr.length;
        if (length < 64) {
            m979q(length << 1);
            return;
        }
        C10351m m983m = m983m(c10351mArr, i);
        if (m983m == null || m983m.f20802a < 0) {
            return;
        }
        synchronized (m983m) {
            if (m983m(c10351mArr, i) == m983m) {
                C10357s c10357s = null;
                C10351m c10351m = m983m;
                C10357s c10357s2 = null;
                while (c10351m != null) {
                    C10357s c10357s3 = new C10357s(c10351m.f20802a, c10351m.f20803b, c10351m.f20804c, null, null);
                    c10357s3.f20826h = c10357s2;
                    if (c10357s2 == null) {
                        c10357s = c10357s3;
                    } else {
                        c10357s2.f20805d = c10357s3;
                    }
                    c10351m = c10351m.f20805d;
                    c10357s2 = c10357s3;
                }
                m986j(c10351mArr, i, new C10356r(c10357s));
            }
        }
    }

    /* renamed from: q */
    private final void m979q(int i) {
        int length;
        C10351m[] c10351mArr;
        int m982n = i >= 536870912 ? 1073741824 : m982n(i + (i >>> 1) + 1);
        while (true) {
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                return;
            }
            C10351m[] c10351mArr2 = this.f20777a;
            if (c10351mArr2 == null || (length = c10351mArr2.length) == 0) {
                int i3 = i2 > m982n ? i2 : m982n;
                if (f20769j.compareAndSwapInt(this, f20770k, i2, -1)) {
                    try {
                        if (this.f20777a == c10351mArr2) {
                            this.f20777a = new C10351m[i3];
                            i2 = i3 - (i3 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i2;
                    }
                } else {
                    continue;
                }
            } else if (m982n <= i2 || length >= 1073741824) {
                return;
            } else {
                if (c10351mArr2 == this.f20777a) {
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length) | 32768;
                    int i4 = f20767h;
                    if (i2 < 0) {
                        if ((i2 >>> i4) != numberOfLeadingZeros || i2 == numberOfLeadingZeros + 1 || i2 == numberOfLeadingZeros + f20766g || (c10351mArr = this.f20778b) == null || this.transferIndex <= 0) {
                            return;
                        }
                        if (f20769j.compareAndSwapInt(this, f20770k, i2, i2 + 1)) {
                            m981o(c10351mArr2, c10351mArr);
                        }
                    } else if (f20769j.compareAndSwapInt(this, f20770k, i2, (numberOfLeadingZeros << i4) + 2)) {
                        m981o(c10351mArr2, null);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [j$.util.concurrent.m] */
    /* renamed from: r */
    static C10351m m978r(C10357s c10357s) {
        C10351m c10351m = null;
        C10351m c10351m2 = null;
        for (C10357s c10357s2 = c10357s; c10357s2 != null; c10357s2 = c10357s2.f20805d) {
            C10351m c10351m3 = new C10351m(c10357s2.f20802a, c10357s2.f20803b, c10357s2.f20804c, null);
            if (c10351m2 == null) {
                c10351m = c10351m3;
            } else {
                c10351m2.f20805d = c10351m3;
            }
            c10351m2 = c10351m3;
        }
        return c10351m;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j;
        int m982n;
        boolean z;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j2 = 0;
        long j3 = 0;
        C10351m c10351m = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j3++;
            c10351m = new C10351m(m985k(readObject.hashCode()), readObject, readObject2, c10351m);
        }
        if (j3 == 0) {
            this.sizeCtl = 0;
            return;
        }
        boolean z2 = true;
        if (j3 >= 536870912) {
            m982n = 1073741824;
        } else {
            int i = (int) j3;
            m982n = m982n(i + (i >>> 1) + 1);
        }
        C10351m[] c10351mArr = new C10351m[m982n];
        int i2 = m982n - 1;
        while (c10351m != null) {
            C10351m c10351m2 = c10351m.f20805d;
            int i3 = c10351m.f20802a;
            int i4 = i3 & i2;
            C10351m m983m = m983m(c10351mArr, i4);
            if (m983m == null) {
                z = z2;
            } else {
                Object obj2 = c10351m.f20803b;
                if (m983m.f20802a >= 0) {
                    int i5 = 0;
                    for (C10351m c10351m3 = m983m; c10351m3 != null; c10351m3 = c10351m3.f20805d) {
                        if (c10351m3.f20802a == i3 && ((obj = c10351m3.f20803b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z = false;
                            break;
                        }
                        i5++;
                    }
                    z = true;
                    if (z && i5 >= 8) {
                        long j4 = j2 + 1;
                        c10351m.f20805d = m983m;
                        C10351m c10351m4 = c10351m;
                        C10357s c10357s = null;
                        C10357s c10357s2 = null;
                        while (c10351m4 != null) {
                            long j5 = j4;
                            C10357s c10357s3 = new C10357s(c10351m4.f20802a, c10351m4.f20803b, c10351m4.f20804c, null, null);
                            c10357s3.f20826h = c10357s2;
                            if (c10357s2 == null) {
                                c10357s = c10357s3;
                            } else {
                                c10357s2.f20805d = c10357s3;
                            }
                            c10351m4 = c10351m4.f20805d;
                            c10357s2 = c10357s3;
                            j4 = j5;
                        }
                        m986j(c10351mArr, i4, new C10356r(c10357s));
                        j2 = j4;
                    }
                } else if (((C10356r) m983m).m962f(i3, obj2, c10351m.f20804c) == null) {
                    j2 += j;
                }
                z = false;
            }
            if (z) {
                j2++;
                c10351m.f20805d = m983m;
                m986j(c10351mArr, i4, c10351m);
            }
            j = 1;
            c10351m = c10351m2;
            z2 = true;
        }
        this.f20777a = c10351mArr;
        this.sizeCtl = m982n - (m982n >>> 2);
        this.baseCount = j2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i = 0;
        int i2 = 1;
        while (i2 < 16) {
            i++;
            i2 <<= 1;
        }
        int i3 = 32 - i;
        int i4 = i2 - 1;
        C10353o[] c10353oArr = new C10353o[16];
        for (int i5 = 0; i5 < 16; i5++) {
            c10353oArr[i5] = new C10353o();
        }
        objectOutputStream.putFields().put("segments", c10353oArr);
        objectOutputStream.putFields().put("segmentShift", i3);
        objectOutputStream.putFields().put("segmentMask", i4);
        objectOutputStream.writeFields();
        C10351m[] c10351mArr = this.f20777a;
        if (c10351mArr != null) {
            C10355q c10355q = new C10355q(c10351mArr, c10351mArr.length, 0, c10351mArr.length);
            while (true) {
                C10351m m967e = c10355q.m967e();
                if (m967e == null) {
                    break;
                }
                objectOutputStream.writeObject(m967e.f20803b);
                objectOutputStream.writeObject(m967e.f20804c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map, p060j$.util.Map
    public void clear() {
        C10351m m983m;
        C10351m[] c10351mArr = this.f20777a;
        long j = 0;
        loop0: while (true) {
            int i = 0;
            while (c10351mArr != null && i < c10351mArr.length) {
                m983m = m983m(c10351mArr, i);
                if (m983m == null) {
                    i++;
                } else {
                    int i2 = m983m.f20802a;
                    if (i2 == -1) {
                        break;
                    }
                    synchronized (m983m) {
                        if (m983m(c10351mArr, i) == m983m) {
                            for (C10351m c10351m = i2 >= 0 ? m983m : m983m instanceof C10356r ? ((C10356r) m983m).f20821f : null; c10351m != null; c10351m = c10351m.f20805d) {
                                j--;
                            }
                            m986j(c10351mArr, i, null);
                            i++;
                        }
                    }
                }
            }
            c10351mArr = m990f(c10351mArr, m983m);
        }
        if (j != 0) {
            m995a(j, -1);
        }
    }

    @Override // p060j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        int i;
        C10351m c10351m;
        Object obj2;
        Object obj3;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int m985k = m985k(obj.hashCode());
        C10351m[] c10351mArr = this.f20777a;
        int i2 = 0;
        Object obj4 = null;
        int i3 = 0;
        while (true) {
            if (c10351mArr != null) {
                int length = c10351mArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & m985k;
                    C10351m m983m = m983m(c10351mArr, i4);
                    if (m983m == null) {
                        C10352n c10352n = new C10352n();
                        synchronized (c10352n) {
                            if (m994b(c10351mArr, i4, c10352n)) {
                                Object apply = biFunction.apply(obj, null);
                                if (apply != null) {
                                    c10351m = new C10351m(m985k, obj, apply, null);
                                    i = 1;
                                } else {
                                    i = i2;
                                    c10351m = null;
                                }
                                m986j(c10351mArr, i4, c10351m);
                                i2 = i;
                                obj4 = apply;
                                i3 = 1;
                            }
                        }
                        if (i3 != 0) {
                        }
                    } else {
                        int i5 = m983m.f20802a;
                        if (i5 == -1) {
                            c10351mArr = m990f(c10351mArr, m983m);
                        } else {
                            synchronized (m983m) {
                                try {
                                    if (m983m(c10351mArr, i4) == m983m) {
                                        if (i5 >= 0) {
                                            C10351m c10351m2 = null;
                                            C10351m c10351m3 = m983m;
                                            int i6 = 1;
                                            while (true) {
                                                if (c10351m3.f20802a != m985k || ((obj3 = c10351m3.f20803b) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                                    C10351m c10351m4 = c10351m3.f20805d;
                                                    if (c10351m4 == null) {
                                                        Object apply2 = biFunction.apply(obj, null);
                                                        if (apply2 != null) {
                                                            c10351m3.f20805d = new C10351m(m985k, obj, apply2, null);
                                                            i2 = 1;
                                                        }
                                                        obj2 = apply2;
                                                    } else {
                                                        i6++;
                                                        c10351m2 = c10351m3;
                                                        c10351m3 = c10351m4;
                                                    }
                                                }
                                            }
                                            obj2 = biFunction.apply(obj, c10351m3.f20804c);
                                            if (obj2 != null) {
                                                c10351m3.f20804c = obj2;
                                            } else {
                                                C10351m c10351m5 = c10351m3.f20805d;
                                                if (c10351m2 != null) {
                                                    c10351m2.f20805d = c10351m5;
                                                } else {
                                                    m986j(c10351mArr, i4, c10351m5);
                                                }
                                                i2 = -1;
                                            }
                                            i3 = i6;
                                            obj4 = obj2;
                                        } else if (m983m instanceof C10356r) {
                                            C10356r c10356r = (C10356r) m983m;
                                            C10357s c10357s = c10356r.f20820e;
                                            C10357s m956b = c10357s != null ? c10357s.m956b(m985k, obj, null) : null;
                                            Object apply3 = biFunction.apply(obj, m956b == null ? null : m956b.f20804c);
                                            if (apply3 != null) {
                                                if (m956b != null) {
                                                    m956b.f20804c = apply3;
                                                } else {
                                                    c10356r.m962f(m985k, obj, apply3);
                                                    i2 = 1;
                                                }
                                            } else if (m956b != null) {
                                                if (c10356r.m961g(m956b)) {
                                                    m986j(c10351mArr, i4, m978r(c10356r.f20821f));
                                                }
                                                i3 = 1;
                                                obj4 = apply3;
                                                i2 = -1;
                                            }
                                            i3 = 1;
                                            obj4 = apply3;
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    m980p(c10351mArr, i4);
                                }
                            }
                        }
                    }
                }
            }
            c10351mArr = m989g();
        }
        if (i2 != 0) {
            m995a(i2, i3);
        }
        return obj4;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // p060j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object obj2;
        int i;
        C10357s m956b;
        Object obj3;
        if (obj == null || function == null) {
            throw null;
        }
        int m985k = m985k(obj.hashCode());
        C10351m[] c10351mArr = this.f20777a;
        Object obj4 = null;
        int i2 = 0;
        while (true) {
            if (c10351mArr != null) {
                int length = c10351mArr.length;
                if (length != 0) {
                    int i3 = (length - 1) & m985k;
                    C10351m m983m = m983m(c10351mArr, i3);
                    boolean z = true;
                    if (m983m == null) {
                        C10352n c10352n = new C10352n();
                        synchronized (c10352n) {
                            if (m994b(c10351mArr, i3, c10352n)) {
                                Object apply = function.apply(obj);
                                m986j(c10351mArr, i3, apply != null ? new C10351m(m985k, obj, apply, null) : null);
                                obj4 = apply;
                                i2 = 1;
                            }
                        }
                        if (i2 != 0) {
                            break;
                        }
                    } else {
                        int i4 = m983m.f20802a;
                        if (i4 == -1) {
                            c10351mArr = m990f(c10351mArr, m983m);
                        } else {
                            synchronized (m983m) {
                                if (m983m(c10351mArr, i3) == m983m) {
                                    if (i4 >= 0) {
                                        C10351m c10351m = m983m;
                                        i = 1;
                                        while (true) {
                                            if (c10351m.f20802a != m985k || ((obj3 = c10351m.f20803b) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                                C10351m c10351m2 = c10351m.f20805d;
                                                if (c10351m2 == null) {
                                                    Object apply2 = function.apply(obj);
                                                    if (apply2 != null) {
                                                        c10351m.f20805d = new C10351m(m985k, obj, apply2, null);
                                                    } else {
                                                        z = false;
                                                    }
                                                    obj2 = apply2;
                                                } else {
                                                    i++;
                                                    c10351m = c10351m2;
                                                }
                                            }
                                        }
                                        obj2 = c10351m.f20804c;
                                        z = false;
                                    } else if (m983m instanceof C10356r) {
                                        C10356r c10356r = (C10356r) m983m;
                                        C10357s c10357s = c10356r.f20820e;
                                        if (c10357s == null || (m956b = c10357s.m956b(m985k, obj, null)) == null) {
                                            Object apply3 = function.apply(obj);
                                            if (apply3 != null) {
                                                c10356r.m962f(m985k, obj, apply3);
                                            } else {
                                                z = false;
                                            }
                                            obj2 = apply3;
                                        } else {
                                            obj2 = m956b.f20804c;
                                            z = false;
                                        }
                                        i = 2;
                                    }
                                    int i5 = i;
                                    obj4 = obj2;
                                    i2 = i5;
                                }
                                z = false;
                            }
                            if (i2 != 0) {
                                if (i2 >= 8) {
                                    m980p(c10351mArr, i3);
                                }
                                if (!z) {
                                    return obj4;
                                }
                            }
                        }
                    }
                }
            }
            c10351mArr = m989g();
        }
        if (obj4 != null) {
            m995a(1L, i2);
        }
        return obj4;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // p060j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        C10357s m956b;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int m985k = m985k(obj.hashCode());
        C10351m[] c10351mArr = this.f20777a;
        int i = 0;
        Object obj3 = null;
        int i2 = 0;
        while (true) {
            if (c10351mArr != null) {
                int length = c10351mArr.length;
                if (length != 0) {
                    int i3 = (length - 1) & m985k;
                    C10351m m983m = m983m(c10351mArr, i3);
                    if (m983m == null) {
                        break;
                    }
                    int i4 = m983m.f20802a;
                    if (i4 == -1) {
                        c10351mArr = m990f(c10351mArr, m983m);
                    } else {
                        synchronized (m983m) {
                            try {
                                if (m983m(c10351mArr, i3) == m983m) {
                                    if (i4 >= 0) {
                                        i2 = 1;
                                        C10351m c10351m = null;
                                        C10351m c10351m2 = m983m;
                                        while (true) {
                                            if (c10351m2.f20802a != m985k || ((obj2 = c10351m2.f20803b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                                                C10351m c10351m3 = c10351m2.f20805d;
                                                if (c10351m3 == null) {
                                                    break;
                                                }
                                                i2++;
                                                c10351m = c10351m2;
                                                c10351m2 = c10351m3;
                                            }
                                        }
                                        obj3 = biFunction.apply(obj, c10351m2.f20804c);
                                        if (obj3 != null) {
                                            c10351m2.f20804c = obj3;
                                        } else {
                                            C10351m c10351m4 = c10351m2.f20805d;
                                            if (c10351m != null) {
                                                c10351m.f20805d = c10351m4;
                                            } else {
                                                m986j(c10351mArr, i3, c10351m4);
                                            }
                                            i = -1;
                                        }
                                    } else if (m983m instanceof C10356r) {
                                        C10356r c10356r = (C10356r) m983m;
                                        C10357s c10357s = c10356r.f20820e;
                                        if (c10357s != null && (m956b = c10357s.m956b(m985k, obj, null)) != null) {
                                            obj3 = biFunction.apply(obj, m956b.f20804c);
                                            if (obj3 != null) {
                                                m956b.f20804c = obj3;
                                            } else {
                                                if (c10356r.m961g(m956b)) {
                                                    m986j(c10351mArr, i3, m978r(c10356r.f20821f));
                                                }
                                                i = -1;
                                            }
                                        }
                                        i2 = 2;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (i2 != 0) {
                            break;
                        }
                    }
                }
            }
            c10351mArr = m989g();
        }
        if (i != 0) {
            m995a(i, i2);
        }
        return obj3;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, p060j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map, p060j$.util.Map
    public final boolean containsValue(Object obj) {
        obj.getClass();
        C10351m[] c10351mArr = this.f20777a;
        if (c10351mArr != null) {
            C10355q c10355q = new C10355q(c10351mArr, c10351mArr.length, 0, c10351mArr.length);
            while (true) {
                C10351m m967e = c10355q.m967e();
                if (m967e == null) {
                    break;
                }
                Object obj2 = m967e.f20804c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map, p060j$.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        C10344f c10344f = this.f20782f;
        if (c10344f != null) {
            return c10344f;
        }
        C10344f c10344f2 = new C10344f(this);
        this.f20782f = c10344f2;
        return c10344f2;
    }

    @Override // java.util.AbstractMap, java.util.Map, p060j$.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v;
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                C10351m[] c10351mArr = this.f20777a;
                int length = c10351mArr == null ? 0 : c10351mArr.length;
                C10355q c10355q = new C10355q(c10351mArr, length, 0, length);
                while (true) {
                    C10351m m967e = c10355q.m967e();
                    if (m967e == null) {
                        for (Map.Entry<K, V> entry : map.entrySet()) {
                            K key = entry.getKey();
                            if (key == null || (value = entry.getValue()) == null || (v = get(key)) == null || (value != v && !value.equals(v))) {
                                return false;
                            }
                        }
                        return true;
                    }
                    Object obj2 = m967e.f20804c;
                    Object obj3 = map.get(m967e.f20803b);
                    if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                        break;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    final C10351m[] m990f(C10351m[] c10351mArr, C10351m c10351m) {
        C10351m[] c10351mArr2;
        int i;
        if (!(c10351m instanceof C10346h) || (c10351mArr2 = ((C10346h) c10351m).f20795e) == null) {
            return this.f20777a;
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(c10351mArr.length) | 32768;
        while (true) {
            if (c10351mArr2 != this.f20778b || this.f20777a != c10351mArr || (i = this.sizeCtl) >= 0 || (i >>> f20767h) != numberOfLeadingZeros || i == numberOfLeadingZeros + 1 || i == f20766g + numberOfLeadingZeros || this.transferIndex <= 0) {
                break;
            } else if (f20769j.compareAndSwapInt(this, f20770k, i, i + 1)) {
                m981o(c10351mArr, c10351mArr2);
                break;
            }
        }
        return c10351mArr2;
    }

    @Override // p060j$.util.concurrent.InterfaceC10360v, p060j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        C10351m[] c10351mArr = this.f20777a;
        if (c10351mArr == null) {
            return;
        }
        C10355q c10355q = new C10355q(c10351mArr, c10351mArr.length, 0, c10351mArr.length);
        while (true) {
            C10351m m967e = c10355q.m967e();
            if (m967e == null) {
                return;
            }
            biConsumer.accept(m967e.f20803b, m967e.f20804c);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
        return (V) r1.f20804c;
     */
    @Override // java.util.AbstractMap, java.util.Map, p060j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = m985k(r0)
            j$.util.concurrent.m[] r1 = r4.f20777a
            r2 = 0
            if (r1 == 0) goto L4e
            int r3 = r1.length
            if (r3 <= 0) goto L4e
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.m r1 = m983m(r1, r3)
            if (r1 == 0) goto L4e
            int r3 = r1.f20802a
            if (r3 != r0) goto L2c
            java.lang.Object r3 = r1.f20803b
            if (r3 == r5) goto L29
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L29:
            java.lang.Object r5 = r1.f20804c
            return r5
        L2c:
            if (r3 >= 0) goto L37
            j$.util.concurrent.m r5 = r1.mo957a(r5, r0)
            if (r5 == 0) goto L36
            java.lang.Object r2 = r5.f20804c
        L36:
            return r2
        L37:
            j$.util.concurrent.m r1 = r1.f20805d
            if (r1 == 0) goto L4e
            int r3 = r1.f20802a
            if (r3 != r0) goto L37
            java.lang.Object r3 = r1.f20803b
            if (r3 == r5) goto L4b
            if (r3 == 0) goto L37
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L37
        L4b:
            java.lang.Object r5 = r1.f20804c
            return r5
        L4e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p060j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p060j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v = get(obj);
        return v == null ? obj2 : v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0052, code lost:
        r7 = r6.f20804c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
        if (r11 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
        r6.f20804c = r10;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m988h(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L9e
            if (r10 == 0) goto L9e
            int r1 = r9.hashCode()
            int r1 = m985k(r1)
            j$.util.concurrent.m[] r2 = r8.f20777a
            r3 = 0
        L10:
            if (r2 == 0) goto L98
            int r4 = r2.length
            if (r4 != 0) goto L17
            goto L98
        L17:
            int r4 = r4 + (-1)
            r4 = r4 & r1
            j$.util.concurrent.m r5 = m983m(r2, r4)
            if (r5 != 0) goto L2d
            j$.util.concurrent.m r5 = new j$.util.concurrent.m
            r5.<init>(r1, r9, r10, r0)
            boolean r4 = m994b(r2, r4, r5)
            if (r4 == 0) goto L10
            goto L8f
        L2d:
            int r6 = r5.f20802a
            r7 = -1
            if (r6 != r7) goto L37
            j$.util.concurrent.m[] r2 = r8.m990f(r2, r5)
            goto L10
        L37:
            monitor-enter(r5)
            j$.util.concurrent.m r7 = m983m(r2, r4)     // Catch: java.lang.Throwable -> L95
            if (r7 != r5) goto L81
            if (r6 < 0) goto L69
            r3 = 1
            r6 = r5
        L42:
            int r7 = r6.f20802a     // Catch: java.lang.Throwable -> L95
            if (r7 != r1) goto L59
            java.lang.Object r7 = r6.f20803b     // Catch: java.lang.Throwable -> L95
            if (r7 == r9) goto L52
            if (r7 == 0) goto L59
            boolean r7 = r9.equals(r7)     // Catch: java.lang.Throwable -> L95
            if (r7 == 0) goto L59
        L52:
            java.lang.Object r7 = r6.f20804c     // Catch: java.lang.Throwable -> L95
            if (r11 != 0) goto L82
            r6.f20804c = r10     // Catch: java.lang.Throwable -> L95
            goto L82
        L59:
            j$.util.concurrent.m r7 = r6.f20805d     // Catch: java.lang.Throwable -> L95
            if (r7 != 0) goto L65
            j$.util.concurrent.m r7 = new j$.util.concurrent.m     // Catch: java.lang.Throwable -> L95
            r7.<init>(r1, r9, r10, r0)     // Catch: java.lang.Throwable -> L95
            r6.f20805d = r7     // Catch: java.lang.Throwable -> L95
            goto L81
        L65:
            int r3 = r3 + 1
            r6 = r7
            goto L42
        L69:
            boolean r6 = r5 instanceof p060j$.util.concurrent.C10356r     // Catch: java.lang.Throwable -> L95
            if (r6 == 0) goto L81
            r3 = r5
            j$.util.concurrent.r r3 = (p060j$.util.concurrent.C10356r) r3     // Catch: java.lang.Throwable -> L95
            j$.util.concurrent.s r3 = r3.m962f(r1, r9, r10)     // Catch: java.lang.Throwable -> L95
            if (r3 == 0) goto L7e
            java.lang.Object r6 = r3.f20804c     // Catch: java.lang.Throwable -> L95
            if (r11 != 0) goto L7c
            r3.f20804c = r10     // Catch: java.lang.Throwable -> L95
        L7c:
            r7 = r6
            goto L7f
        L7e:
            r7 = r0
        L7f:
            r3 = 2
            goto L82
        L81:
            r7 = r0
        L82:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L95
            if (r3 == 0) goto L10
            r9 = 8
            if (r3 < r9) goto L8c
            r8.m980p(r2, r4)
        L8c:
            if (r7 == 0) goto L8f
            return r7
        L8f:
            r9 = 1
            r8.m995a(r9, r3)
            return r0
        L95:
            r9 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L95
            throw r9
        L98:
            j$.util.concurrent.m[] r2 = r8.m989g()
            goto L10
        L9e:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p060j$.util.concurrent.ConcurrentHashMap.m988h(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map, p060j$.util.Map
    public final int hashCode() {
        C10351m[] c10351mArr = this.f20777a;
        int i = 0;
        if (c10351mArr != null) {
            C10355q c10355q = new C10355q(c10351mArr, c10351mArr.length, 0, c10351mArr.length);
            while (true) {
                C10351m m967e = c10355q.m967e();
                if (m967e == null) {
                    break;
                }
                i += m967e.f20804c.hashCode() ^ m967e.f20803b.hashCode();
            }
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public final Object m987i(Object obj, Object obj2, Object obj3) {
        int length;
        int i;
        C10351m m983m;
        boolean z;
        Object obj4;
        C10357s m956b;
        C10351m m978r;
        Object obj5;
        int m985k = m985k(obj.hashCode());
        C10351m[] c10351mArr = this.f20777a;
        while (true) {
            if (c10351mArr == null || (length = c10351mArr.length) == 0 || (m983m = m983m(c10351mArr, (i = (length - 1) & m985k))) == null) {
                break;
            }
            int i2 = m983m.f20802a;
            if (i2 == -1) {
                c10351mArr = m990f(c10351mArr, m983m);
            } else {
                synchronized (m983m) {
                    try {
                        if (m983m(c10351mArr, i) == m983m) {
                            z = true;
                            if (i2 >= 0) {
                                C10351m c10351m = null;
                                C10351m c10351m2 = m983m;
                                while (true) {
                                    if (c10351m2.f20802a != m985k || ((obj5 = c10351m2.f20803b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                        C10351m c10351m3 = c10351m2.f20805d;
                                        if (c10351m3 == null) {
                                            break;
                                        }
                                        c10351m = c10351m2;
                                        c10351m2 = c10351m3;
                                    }
                                }
                                obj4 = c10351m2.f20804c;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        c10351m2.f20804c = obj2;
                                    } else if (c10351m != null) {
                                        c10351m.f20805d = c10351m2.f20805d;
                                    } else {
                                        m978r = c10351m2.f20805d;
                                        m986j(c10351mArr, i, m978r);
                                    }
                                }
                                obj4 = null;
                            } else if (m983m instanceof C10356r) {
                                C10356r c10356r = (C10356r) m983m;
                                C10357s c10357s = c10356r.f20820e;
                                if (c10357s != null && (m956b = c10357s.m956b(m985k, obj, null)) != null) {
                                    obj4 = m956b.f20804c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            m956b.f20804c = obj2;
                                        } else if (c10356r.m961g(m956b)) {
                                            m978r = m978r(c10356r.f20821f);
                                            m986j(c10351mArr, i, m978r);
                                        }
                                    }
                                }
                                obj4 = null;
                            }
                        }
                        z = false;
                        obj4 = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (z) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            m995a(-1L, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, p060j$.util.Map
    public boolean isEmpty() {
        return m984l() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map, p060j$.util.Map
    public Set<K> keySet() {
        C10348j c10348j = this.f20780d;
        if (c10348j != null) {
            return c10348j;
        }
        C10348j c10348j2 = new C10348j(this);
        this.f20780d = c10348j2;
        return c10348j2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l */
    public final long m984l() {
        C10342d[] c10342dArr = this.f20779c;
        long j = this.baseCount;
        if (c10342dArr != null) {
            for (C10342d c10342d : c10342dArr) {
                if (c10342d != null) {
                    j += c10342d.value;
                }
            }
        }
        return j;
    }

    @Override // p060j$.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i;
        Object obj3;
        Object obj4;
        Object obj5 = obj2;
        if (obj == null || obj5 == null || biFunction == null) {
            throw null;
        }
        int m985k = m985k(obj.hashCode());
        C10351m[] c10351mArr = this.f20777a;
        int i2 = 0;
        Object obj6 = null;
        int i3 = 0;
        while (true) {
            if (c10351mArr != null) {
                int length = c10351mArr.length;
                if (length != 0) {
                    int i4 = (length - 1) & m985k;
                    C10351m m983m = m983m(c10351mArr, i4);
                    i = 1;
                    if (m983m != null) {
                        int i5 = m983m.f20802a;
                        int i6 = -1;
                        if (i5 == -1) {
                            c10351mArr = m990f(c10351mArr, m983m);
                        } else {
                            synchronized (m983m) {
                                try {
                                    if (m983m(c10351mArr, i4) == m983m) {
                                        if (i5 >= 0) {
                                            C10351m c10351m = null;
                                            C10351m c10351m2 = m983m;
                                            int i7 = 1;
                                            while (true) {
                                                if (c10351m2.f20802a != m985k || ((obj4 = c10351m2.f20803b) != obj && (obj4 == null || !obj.equals(obj4)))) {
                                                    C10351m c10351m3 = c10351m2.f20805d;
                                                    if (c10351m3 == null) {
                                                        c10351m2.f20805d = new C10351m(m985k, obj, obj5, null);
                                                        i3 = 1;
                                                        obj3 = obj5;
                                                        break;
                                                    }
                                                    i7++;
                                                    c10351m = c10351m2;
                                                    c10351m2 = c10351m3;
                                                }
                                            }
                                            obj3 = biFunction.apply(c10351m2.f20804c, obj5);
                                            if (obj3 != null) {
                                                c10351m2.f20804c = obj3;
                                            } else {
                                                C10351m c10351m4 = c10351m2.f20805d;
                                                if (c10351m != null) {
                                                    c10351m.f20805d = c10351m4;
                                                } else {
                                                    m986j(c10351mArr, i4, c10351m4);
                                                }
                                                i3 = -1;
                                            }
                                            i2 = i7;
                                            obj6 = obj3;
                                        } else if (m983m instanceof C10356r) {
                                            C10356r c10356r = (C10356r) m983m;
                                            C10357s c10357s = c10356r.f20820e;
                                            C10357s m956b = c10357s == null ? null : c10357s.m956b(m985k, obj, null);
                                            Object apply = m956b == null ? obj5 : biFunction.apply(m956b.f20804c, obj5);
                                            if (apply != null) {
                                                if (m956b != null) {
                                                    m956b.f20804c = apply;
                                                } else {
                                                    c10356r.m962f(m985k, obj, apply);
                                                    i3 = 1;
                                                }
                                            } else if (m956b != null) {
                                                if (c10356r.m961g(m956b)) {
                                                    m986j(c10351mArr, i4, m978r(c10356r.f20821f));
                                                }
                                                i2 = 2;
                                                obj6 = apply;
                                                i3 = i6;
                                            }
                                            i6 = i3;
                                            i2 = 2;
                                            obj6 = apply;
                                            i3 = i6;
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            if (i2 != 0) {
                                if (i2 >= 8) {
                                    m980p(c10351mArr, i4);
                                }
                                i = i3;
                                obj5 = obj6;
                            }
                        }
                    } else if (m994b(c10351mArr, i4, new C10351m(m985k, obj, obj5, null))) {
                        break;
                    }
                }
            }
            c10351mArr = m989g();
        }
        if (i != 0) {
            m995a(i, i2);
        }
        return obj5;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, p060j$.util.Map
    public V put(K k, V v) {
        return (V) m988h(k, v, false);
    }

    @Override // java.util.AbstractMap, java.util.Map, p060j$.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        m979q(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            m988h(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p060j$.util.Map
    public V putIfAbsent(K k, V v) {
        return (V) m988h(k, v, true);
    }

    @Override // java.util.AbstractMap, java.util.Map, p060j$.util.Map
    public V remove(Object obj) {
        return (V) m987i(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p060j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || m987i(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p060j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return m987i(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, p060j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return m987i(obj, obj3, obj2) != null;
    }

    @Override // p060j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        C10351m[] c10351mArr = this.f20777a;
        if (c10351mArr == null) {
            return;
        }
        C10355q c10355q = new C10355q(c10351mArr, c10351mArr.length, 0, c10351mArr.length);
        while (true) {
            C10351m m967e = c10355q.m967e();
            if (m967e == null) {
                return;
            }
            Object obj = m967e.f20804c;
            Object obj2 = m967e.f20803b;
            do {
                Object apply = biFunction.apply(obj2, obj);
                apply.getClass();
                if (m987i(obj2, apply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, p060j$.util.Map
    public int size() {
        long m984l = m984l();
        if (m984l < 0) {
            return 0;
        }
        if (m984l > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) m984l;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        C10351m[] c10351mArr = this.f20777a;
        int length = c10351mArr == null ? 0 : c10351mArr.length;
        C10355q c10355q = new C10355q(c10351mArr, length, 0, length);
        StringBuilder sb = new StringBuilder("{");
        C10351m m967e = c10355q.m967e();
        if (m967e != null) {
            while (true) {
                Object obj = m967e.f20803b;
                Object obj2 = m967e.f20804c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                m967e = c10355q.m967e();
                if (m967e == null) {
                    break;
                }
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map, p060j$.util.Map
    public Collection<V> values() {
        C10358t c10358t = this.f20781e;
        if (c10358t != null) {
            return c10358t;
        }
        C10358t c10358t2 = new C10358t(this);
        this.f20781e = c10358t2;
        return c10358t2;
    }
}
