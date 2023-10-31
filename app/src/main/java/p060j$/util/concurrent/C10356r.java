package p060j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.concurrent.r */
/* loaded from: classes2.dex */
public final class C10356r extends C10351m {

    /* renamed from: h */
    private static final Unsafe f20818h;

    /* renamed from: i */
    private static final long f20819i;

    /* renamed from: e */
    C10357s f20820e;

    /* renamed from: f */
    volatile C10357s f20821f;

    /* renamed from: g */
    volatile Thread f20822g;
    volatile int lockState;

    static {
        try {
            Unsafe m951c = AbstractC10361w.m951c();
            f20818h = m951c;
            f20819i = m951c.objectFieldOffset(C10356r.class.getDeclaredField("lockState"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10356r(C10357s c10357s) {
        super(-2, null, null, null);
        int m992d;
        int m958j;
        this.f20821f = c10357s;
        C10357s c10357s2 = null;
        while (c10357s != null) {
            C10357s c10357s3 = (C10357s) c10357s.f20805d;
            c10357s.f20825g = null;
            c10357s.f20824f = null;
            if (c10357s2 == null) {
                c10357s.f20823e = null;
                c10357s.f20827i = false;
            } else {
                Object obj = c10357s.f20803b;
                int i = c10357s.f20802a;
                C10357s c10357s4 = c10357s2;
                Class cls = null;
                while (true) {
                    Object obj2 = c10357s4.f20803b;
                    int i2 = c10357s4.f20802a;
                    m958j = i2 > i ? -1 : i2 < i ? 1 : ((cls == null && (cls = ConcurrentHashMap.m993c(obj)) == null) || (m992d = ConcurrentHashMap.m992d(cls, obj, obj2)) == 0) ? m958j(obj, obj2) : m992d;
                    C10357s c10357s5 = m958j <= 0 ? c10357s4.f20824f : c10357s4.f20825g;
                    if (c10357s5 == null) {
                        break;
                    }
                    c10357s4 = c10357s5;
                }
                c10357s.f20823e = c10357s4;
                if (m958j <= 0) {
                    c10357s4.f20824f = c10357s;
                } else {
                    c10357s4.f20825g = c10357s;
                }
                c10357s = m965c(c10357s2, c10357s);
            }
            c10357s2 = c10357s;
            c10357s = c10357s3;
        }
        this.f20820e = c10357s2;
    }

    /* renamed from: b */
    static C10357s m966b(C10357s c10357s, C10357s c10357s2) {
        while (c10357s2 != null && c10357s2 != c10357s) {
            C10357s c10357s3 = c10357s2.f20823e;
            if (c10357s3 == null) {
                c10357s2.f20827i = false;
                return c10357s2;
            } else if (c10357s2.f20827i) {
                c10357s2.f20827i = false;
                return c10357s;
            } else {
                C10357s c10357s4 = c10357s3.f20824f;
                if (c10357s4 == c10357s2) {
                    c10357s4 = c10357s3.f20825g;
                    if (c10357s4 != null && c10357s4.f20827i) {
                        c10357s4.f20827i = false;
                        c10357s3.f20827i = true;
                        c10357s = m960h(c10357s, c10357s3);
                        c10357s3 = c10357s2.f20823e;
                        c10357s4 = c10357s3 == null ? null : c10357s3.f20825g;
                    }
                    if (c10357s4 == null) {
                        c10357s2 = c10357s3;
                    } else {
                        C10357s c10357s5 = c10357s4.f20824f;
                        C10357s c10357s6 = c10357s4.f20825g;
                        if ((c10357s6 != null && c10357s6.f20827i) || (c10357s5 != null && c10357s5.f20827i)) {
                            if (c10357s6 == null || !c10357s6.f20827i) {
                                if (c10357s5 != null) {
                                    c10357s5.f20827i = false;
                                }
                                c10357s4.f20827i = true;
                                c10357s = m959i(c10357s, c10357s4);
                                c10357s3 = c10357s2.f20823e;
                                c10357s4 = c10357s3 != null ? c10357s3.f20825g : null;
                            }
                            if (c10357s4 != null) {
                                c10357s4.f20827i = c10357s3 == null ? false : c10357s3.f20827i;
                                C10357s c10357s7 = c10357s4.f20825g;
                                if (c10357s7 != null) {
                                    c10357s7.f20827i = false;
                                }
                            }
                            if (c10357s3 != null) {
                                c10357s3.f20827i = false;
                                c10357s = m960h(c10357s, c10357s3);
                            }
                            c10357s2 = c10357s;
                            c10357s = c10357s2;
                        }
                        c10357s4.f20827i = true;
                        c10357s2 = c10357s3;
                    }
                } else {
                    if (c10357s4 != null && c10357s4.f20827i) {
                        c10357s4.f20827i = false;
                        c10357s3.f20827i = true;
                        c10357s = m959i(c10357s, c10357s3);
                        c10357s3 = c10357s2.f20823e;
                        c10357s4 = c10357s3 == null ? null : c10357s3.f20824f;
                    }
                    if (c10357s4 == null) {
                        c10357s2 = c10357s3;
                    } else {
                        C10357s c10357s8 = c10357s4.f20824f;
                        C10357s c10357s9 = c10357s4.f20825g;
                        if ((c10357s8 != null && c10357s8.f20827i) || (c10357s9 != null && c10357s9.f20827i)) {
                            if (c10357s8 == null || !c10357s8.f20827i) {
                                if (c10357s9 != null) {
                                    c10357s9.f20827i = false;
                                }
                                c10357s4.f20827i = true;
                                c10357s = m960h(c10357s, c10357s4);
                                c10357s3 = c10357s2.f20823e;
                                c10357s4 = c10357s3 != null ? c10357s3.f20824f : null;
                            }
                            if (c10357s4 != null) {
                                c10357s4.f20827i = c10357s3 == null ? false : c10357s3.f20827i;
                                C10357s c10357s10 = c10357s4.f20824f;
                                if (c10357s10 != null) {
                                    c10357s10.f20827i = false;
                                }
                            }
                            if (c10357s3 != null) {
                                c10357s3.f20827i = false;
                                c10357s = m959i(c10357s, c10357s3);
                            }
                            c10357s2 = c10357s;
                            c10357s = c10357s2;
                        }
                        c10357s4.f20827i = true;
                        c10357s2 = c10357s3;
                    }
                }
            }
        }
        return c10357s;
    }

    /* renamed from: c */
    static C10357s m965c(C10357s c10357s, C10357s c10357s2) {
        C10357s c10357s3;
        c10357s2.f20827i = true;
        while (true) {
            C10357s c10357s4 = c10357s2.f20823e;
            if (c10357s4 == null) {
                c10357s2.f20827i = false;
                return c10357s2;
            } else if (!c10357s4.f20827i || (c10357s3 = c10357s4.f20823e) == null) {
                break;
            } else {
                C10357s c10357s5 = c10357s3.f20824f;
                if (c10357s4 == c10357s5) {
                    c10357s5 = c10357s3.f20825g;
                    if (c10357s5 == null || !c10357s5.f20827i) {
                        if (c10357s2 == c10357s4.f20825g) {
                            c10357s = m960h(c10357s, c10357s4);
                            C10357s c10357s6 = c10357s4.f20823e;
                            c10357s3 = c10357s6 == null ? null : c10357s6.f20823e;
                            c10357s4 = c10357s6;
                            c10357s2 = c10357s4;
                        }
                        if (c10357s4 != null) {
                            c10357s4.f20827i = false;
                            if (c10357s3 != null) {
                                c10357s3.f20827i = true;
                                c10357s = m959i(c10357s, c10357s3);
                            }
                        }
                    } else {
                        c10357s5.f20827i = false;
                        c10357s4.f20827i = false;
                        c10357s3.f20827i = true;
                        c10357s2 = c10357s3;
                    }
                } else if (c10357s5 == null || !c10357s5.f20827i) {
                    if (c10357s2 == c10357s4.f20824f) {
                        c10357s = m959i(c10357s, c10357s4);
                        C10357s c10357s7 = c10357s4.f20823e;
                        c10357s3 = c10357s7 == null ? null : c10357s7.f20823e;
                        c10357s4 = c10357s7;
                        c10357s2 = c10357s4;
                    }
                    if (c10357s4 != null) {
                        c10357s4.f20827i = false;
                        if (c10357s3 != null) {
                            c10357s3.f20827i = true;
                            c10357s = m960h(c10357s, c10357s3);
                        }
                    }
                } else {
                    c10357s5.f20827i = false;
                    c10357s4.f20827i = false;
                    c10357s3.f20827i = true;
                    c10357s2 = c10357s3;
                }
            }
        }
        return c10357s;
    }

    /* renamed from: d */
    private final void m964d() {
        boolean z = false;
        while (true) {
            int i = this.lockState;
            if ((i & (-3)) == 0) {
                if (f20818h.compareAndSwapInt(this, f20819i, i, 1)) {
                    break;
                }
            } else if ((i & 2) == 0) {
                if (f20818h.compareAndSwapInt(this, f20819i, i, i | 2)) {
                    this.f20822g = Thread.currentThread();
                    z = true;
                }
            } else if (z) {
                LockSupport.park(this);
            }
        }
        if (z) {
            this.f20822g = null;
        }
    }

    /* renamed from: e */
    private final void m963e() {
        if (f20818h.compareAndSwapInt(this, f20819i, 0, 1)) {
            return;
        }
        m964d();
    }

    /* renamed from: h */
    static C10357s m960h(C10357s c10357s, C10357s c10357s2) {
        C10357s c10357s3 = c10357s2.f20825g;
        if (c10357s3 != null) {
            C10357s c10357s4 = c10357s3.f20824f;
            c10357s2.f20825g = c10357s4;
            if (c10357s4 != null) {
                c10357s4.f20823e = c10357s2;
            }
            C10357s c10357s5 = c10357s2.f20823e;
            c10357s3.f20823e = c10357s5;
            if (c10357s5 == null) {
                c10357s3.f20827i = false;
                c10357s = c10357s3;
            } else if (c10357s5.f20824f == c10357s2) {
                c10357s5.f20824f = c10357s3;
            } else {
                c10357s5.f20825g = c10357s3;
            }
            c10357s3.f20824f = c10357s2;
            c10357s2.f20823e = c10357s3;
        }
        return c10357s;
    }

    /* renamed from: i */
    static C10357s m959i(C10357s c10357s, C10357s c10357s2) {
        C10357s c10357s3 = c10357s2.f20824f;
        if (c10357s3 != null) {
            C10357s c10357s4 = c10357s3.f20825g;
            c10357s2.f20824f = c10357s4;
            if (c10357s4 != null) {
                c10357s4.f20823e = c10357s2;
            }
            C10357s c10357s5 = c10357s2.f20823e;
            c10357s3.f20823e = c10357s5;
            if (c10357s5 == null) {
                c10357s3.f20827i = false;
                c10357s = c10357s3;
            } else if (c10357s5.f20825g == c10357s2) {
                c10357s5.f20825g = c10357s3;
            } else {
                c10357s5.f20824f = c10357s3;
            }
            c10357s3.f20825g = c10357s2;
            c10357s2.f20823e = c10357s3;
        }
        return c10357s;
    }

    /* renamed from: j */
    static int m958j(Object obj, Object obj2) {
        int compareTo;
        if (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) {
            return System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1;
        }
        return compareTo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p060j$.util.concurrent.C10351m
    /* renamed from: a */
    public final C10351m mo957a(Object obj, int i) {
        Object obj2;
        Thread thread;
        Thread thread2;
        C10357s c10357s = null;
        if (obj != null) {
            C10351m c10351m = this.f20821f;
            while (c10351m != null) {
                int i2 = this.lockState;
                if ((i2 & 3) == 0) {
                    Unsafe unsafe = f20818h;
                    long j = f20819i;
                    if (unsafe.compareAndSwapInt(this, j, i2, i2 + 4)) {
                        try {
                            C10357s c10357s2 = this.f20820e;
                            if (c10357s2 != null) {
                                c10357s = c10357s2.m956b(i, obj, null);
                            }
                            if (AbstractC10361w.m953a(unsafe, this, j) == 6 && (thread2 = this.f20822g) != null) {
                                LockSupport.unpark(thread2);
                            }
                            return c10357s;
                        } catch (Throwable th) {
                            if (AbstractC10361w.m953a(f20818h, this, f20819i) == 6 && (thread = this.f20822g) != null) {
                                LockSupport.unpark(thread);
                            }
                            throw th;
                        }
                    }
                } else if (c10351m.f20802a == i && ((obj2 = c10351m.f20803b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return c10351m;
                } else {
                    c10351m = c10351m.f20805d;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005f, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00a2, code lost:
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7 A[LOOP:0: B:3:0x000c->B:55:0x00a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0071 A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p060j$.util.concurrent.C10357s m962f(int r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r4 = r17
            j$.util.concurrent.s r2 = r1.f20820e
            r8 = 0
            r9 = 0
            r10 = r2
            r2 = r8
            r3 = r9
        Lc:
            if (r10 != 0) goto L22
            j$.util.concurrent.s r9 = new j$.util.concurrent.s
            r6 = 0
            r7 = 0
            r2 = r9
            r3 = r16
            r4 = r17
            r5 = r18
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f20820e = r9
            r1.f20821f = r9
            goto La2
        L22:
            int r5 = r10.f20802a
            r11 = 1
            if (r5 <= r0) goto L29
            r5 = -1
            goto L65
        L29:
            if (r5 >= r0) goto L2d
            r12 = r11
            goto L68
        L2d:
            java.lang.Object r5 = r10.f20803b
            if (r5 == r4) goto Laa
            if (r5 == 0) goto L3b
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L3b
            goto Laa
        L3b:
            if (r2 != 0) goto L43
            java.lang.Class r2 = p060j$.util.concurrent.ConcurrentHashMap.m993c(r17)
            if (r2 == 0) goto L49
        L43:
            int r6 = p060j$.util.concurrent.ConcurrentHashMap.m992d(r2, r4, r5)
            if (r6 != 0) goto L67
        L49:
            if (r3 != 0) goto L61
            j$.util.concurrent.s r3 = r10.f20824f
            if (r3 == 0) goto L55
            j$.util.concurrent.s r3 = r3.m956b(r0, r4, r2)
            if (r3 != 0) goto L5f
        L55:
            j$.util.concurrent.s r3 = r10.f20825g
            if (r3 == 0) goto L60
            j$.util.concurrent.s r3 = r3.m956b(r0, r4, r2)
            if (r3 == 0) goto L60
        L5f:
            return r3
        L60:
            r3 = r11
        L61:
            int r5 = m958j(r4, r5)
        L65:
            r12 = r5
            goto L68
        L67:
            r12 = r6
        L68:
            if (r12 > 0) goto L6d
            j$.util.concurrent.s r5 = r10.f20824f
            goto L6f
        L6d:
            j$.util.concurrent.s r5 = r10.f20825g
        L6f:
            if (r5 != 0) goto La7
            j$.util.concurrent.s r13 = r1.f20821f
            j$.util.concurrent.s r14 = new j$.util.concurrent.s
            r2 = r14
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r13
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            r1.f20821f = r14
            if (r13 == 0) goto L87
            r13.f20826h = r14
        L87:
            if (r12 > 0) goto L8c
            r10.f20824f = r14
            goto L8e
        L8c:
            r10.f20825g = r14
        L8e:
            boolean r0 = r10.f20827i
            if (r0 != 0) goto L95
            r14.f20827i = r11
            goto La2
        L95:
            r15.m963e()
            j$.util.concurrent.s r0 = r1.f20820e     // Catch: java.lang.Throwable -> La3
            j$.util.concurrent.s r0 = m965c(r0, r14)     // Catch: java.lang.Throwable -> La3
            r1.f20820e = r0     // Catch: java.lang.Throwable -> La3
            r1.lockState = r9
        La2:
            return r8
        La3:
            r0 = move-exception
            r1.lockState = r9
            throw r0
        La7:
            r10 = r5
            goto Lc
        Laa:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p060j$.util.concurrent.C10356r.m962f(int, java.lang.Object, java.lang.Object):j$.util.concurrent.s");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008e A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00aa A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b2 A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ba A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00bd A[Catch: all -> 0x00c8, TryCatch #0 {all -> 0x00c8, blocks: (B:22:0x0030, B:26:0x0039, B:29:0x003f, B:31:0x004d, B:39:0x0065, B:41:0x006b, B:42:0x006d, B:57:0x008e, B:64:0x009f, B:60:0x0096, B:62:0x009a, B:63:0x009d, B:65:0x00a5, B:69:0x00ae, B:71:0x00b2, B:73:0x00b6, B:75:0x00ba, B:79:0x00c3, B:76:0x00bd, B:78:0x00c1, B:68:0x00aa, B:45:0x0077, B:47:0x007b, B:48:0x007e, B:32:0x0052, B:34:0x0058, B:36:0x005c, B:37:0x005f, B:38:0x0061), top: B:86:0x0030 }] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m961g(p060j$.util.concurrent.C10357s r11) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p060j$.util.concurrent.C10356r.m961g(j$.util.concurrent.s):boolean");
    }
}
