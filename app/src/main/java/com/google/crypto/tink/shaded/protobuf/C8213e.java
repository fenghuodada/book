package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC8308y;
import com.google.crypto.tink.shaded.protobuf.C8196a0;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.e */
/* loaded from: classes3.dex */
public final class C8213e {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.e$a */
    /* loaded from: classes3.dex */
    public static final class C8214a {

        /* renamed from: a */
        public int f15979a;

        /* renamed from: b */
        public long f15980b;

        /* renamed from: c */
        public Object f15981c;

        /* renamed from: d */
        public final C8277q f15982d;

        public C8214a(C8277q c8277q) {
            c8277q.getClass();
            this.f15982d = c8277q;
        }
    }

    /* renamed from: A */
    public static int m3916A(int i, byte[] bArr, int i2, int i3, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) {
        C8236i0 c8236i0 = (C8236i0) interfaceC8199c;
        int m3907J = m3907J(bArr, i2, c8214a);
        while (true) {
            c8236i0.m3808b(AbstractC8244j.m3795c(c8214a.f15980b));
            if (m3907J >= i3) {
                break;
            }
            int m3909H = m3909H(bArr, m3907J, c8214a);
            if (i != c8214a.f15979a) {
                break;
            }
            m3907J = m3907J(bArr, m3909H, c8214a);
        }
        return m3907J;
    }

    /* renamed from: B */
    public static int m3915B(byte[] bArr, int i, C8214a c8214a) throws C8202b0 {
        int m3909H = m3909H(bArr, i, c8214a);
        int i2 = c8214a.f15979a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c8214a.f15981c = "";
                return m3909H;
            }
            c8214a.f15981c = new String(bArr, m3909H, i2, C8196a0.f15949a);
            return m3909H + i2;
        }
        throw C8202b0.m3927d();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002d -> B:9:0x0018). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0031 -> B:8:0x0014). Please submit an issue!!! */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m3914C(int r4, byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8199c<?> r8, com.google.crypto.tink.shaded.protobuf.C8213e.C8214a r9) throws com.google.crypto.tink.shaded.protobuf.C8202b0 {
        /*
            int r6 = m3909H(r5, r6, r9)
            int r0 = r9.f15979a
            if (r0 < 0) goto L3f
            java.lang.String r1 = ""
            if (r0 != 0) goto Ld
            goto L2d
        Ld:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.C8196a0.f15949a
            r2.<init>(r5, r6, r0, r3)
        L14:
            r8.add(r2)
            int r6 = r6 + r0
        L18:
            if (r6 >= r7) goto L3e
            int r0 = m3909H(r5, r6, r9)
            int r2 = r9.f15979a
            if (r4 == r2) goto L23
            goto L3e
        L23:
            int r6 = m3909H(r5, r0, r9)
            int r0 = r9.f15979a
            if (r0 < 0) goto L39
            if (r0 != 0) goto L31
        L2d:
            r8.add(r1)
            goto L18
        L31:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.C8196a0.f15949a
            r2.<init>(r5, r6, r0, r3)
            goto L14
        L39:
            com.google.crypto.tink.shaded.protobuf.b0 r4 = com.google.crypto.tink.shaded.protobuf.C8202b0.m3927d()
            throw r4
        L3e:
            return r6
        L3f:
            com.google.crypto.tink.shaded.protobuf.b0 r4 = com.google.crypto.tink.shaded.protobuf.C8202b0.m3927d()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8213e.m3914C(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.a0$c, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001d -> B:11:0x0020). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0033 -> B:6:0x000c). Please submit an issue!!! */
    /* renamed from: D */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m3913D(int r5, byte[] r6, int r7, int r8, com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8199c<?> r9, com.google.crypto.tink.shaded.protobuf.C8213e.C8214a r10) throws com.google.crypto.tink.shaded.protobuf.C8202b0 {
        /*
            int r7 = m3909H(r6, r7, r10)
            int r0 = r10.f15979a
            if (r0 < 0) goto L5a
            java.lang.String r1 = ""
            if (r0 != 0) goto Le
        Lc:
            r2 = r7
            goto L36
        Le:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.C8280q1.m3565d(r7, r6, r2)
            if (r3 == 0) goto L55
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.C8196a0.f15949a
            r3.<init>(r6, r7, r0, r4)
        L1d:
            r9.add(r3)
        L20:
            if (r2 >= r8) goto L54
            int r7 = m3909H(r6, r2, r10)
            int r0 = r10.f15979a
            if (r5 == r0) goto L2b
            goto L54
        L2b:
            int r7 = m3909H(r6, r7, r10)
            int r0 = r10.f15979a
            if (r0 < 0) goto L4f
            if (r0 != 0) goto L3a
            goto Lc
        L36:
            r9.add(r1)
            goto L20
        L3a:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.C8280q1.m3565d(r7, r6, r2)
            if (r3 == 0) goto L4a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.C8196a0.f15949a
            r3.<init>(r6, r7, r0, r4)
            goto L1d
        L4a:
            com.google.crypto.tink.shaded.protobuf.b0 r5 = com.google.crypto.tink.shaded.protobuf.C8202b0.m3930a()
            throw r5
        L4f:
            com.google.crypto.tink.shaded.protobuf.b0 r5 = com.google.crypto.tink.shaded.protobuf.C8202b0.m3927d()
            throw r5
        L54:
            return r2
        L55:
            com.google.crypto.tink.shaded.protobuf.b0 r5 = com.google.crypto.tink.shaded.protobuf.C8202b0.m3930a()
            throw r5
        L5a:
            com.google.crypto.tink.shaded.protobuf.b0 r5 = com.google.crypto.tink.shaded.protobuf.C8202b0.m3927d()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8213e.m3913D(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.a0$c, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* renamed from: E */
    public static int m3912E(byte[] bArr, int i, C8214a c8214a) throws C8202b0 {
        int m3909H = m3909H(bArr, i, c8214a);
        int i2 = c8214a.f15979a;
        if (i2 >= 0) {
            if (i2 == 0) {
                c8214a.f15981c = "";
                return m3909H;
            }
            c8214a.f15981c = C8280q1.f16077a.mo3561a(m3909H, bArr, i2);
            return m3909H + i2;
        }
        throw C8202b0.m3927d();
    }

    /* renamed from: F */
    public static int m3911F(int i, byte[] bArr, int i2, int i3, C8260m1 c8260m1, C8214a c8214a) throws C8202b0 {
        Object m3821i;
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                c8260m1.m3648b(i, Integer.valueOf(m3898g(i2, bArr)));
                                return i2 + 4;
                            }
                            throw new C8202b0("Protocol message contained an invalid tag (zero).");
                        }
                        C8260m1 c8260m12 = new C8260m1();
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int m3909H = m3909H(bArr, i2, c8214a);
                            int i7 = c8214a.f15979a;
                            i6 = i7;
                            if (i7 == i5) {
                                i2 = m3909H;
                                break;
                            }
                            int m3911F = m3911F(i6, bArr, m3909H, i3, c8260m12, c8214a);
                            i6 = i7;
                            i2 = m3911F;
                        }
                        if (i2 <= i3 && i6 == i5) {
                            c8260m1.m3648b(i, c8260m12);
                            return i2;
                        }
                        throw C8202b0.m3926e();
                    }
                    int m3909H2 = m3909H(bArr, i2, c8214a);
                    int i8 = c8214a.f15979a;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - m3909H2) {
                            if (i8 == 0) {
                                m3821i = AbstractC8228i.f15998b;
                            } else {
                                m3821i = AbstractC8228i.m3821i(m3909H2, bArr, i8);
                            }
                            c8260m1.m3648b(i, m3821i);
                            return m3909H2 + i8;
                        }
                        throw C8202b0.m3925f();
                    }
                    throw C8202b0.m3927d();
                }
                c8260m1.m3648b(i, Long.valueOf(m3896i(i2, bArr)));
                return i2 + 8;
            }
            int m3907J = m3907J(bArr, i2, c8214a);
            c8260m1.m3648b(i, Long.valueOf(c8214a.f15980b));
            return m3907J;
        }
        throw new C8202b0("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: G */
    public static int m3910G(int i, byte[] bArr, int i2, C8214a c8214a) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                c8214a.f15979a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            c8214a.f15979a = i7 | i3;
            return i8;
        }
        i4 = b << 7;
        c8214a.f15979a = i5 | i4;
        return i6;
    }

    /* renamed from: H */
    public static int m3909H(byte[] bArr, int i, C8214a c8214a) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            c8214a.f15979a = b;
            return i2;
        }
        return m3910G(b, bArr, i2, c8214a);
    }

    /* renamed from: I */
    public static int m3908I(int i, byte[] bArr, int i2, int i3, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) {
        C8316z c8316z = (C8316z) interfaceC8199c;
        int m3909H = m3909H(bArr, i2, c8214a);
        while (true) {
            c8316z.m3454b(c8214a.f15979a);
            if (m3909H >= i3) {
                break;
            }
            int m3909H2 = m3909H(bArr, m3909H, c8214a);
            if (i != c8214a.f15979a) {
                break;
            }
            m3909H = m3909H(bArr, m3909H2, c8214a);
        }
        return m3909H;
    }

    /* renamed from: J */
    public static int m3907J(byte[] bArr, int i, C8214a c8214a) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c8214a.f15980b = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        c8214a.f15980b = j2;
        return i3;
    }

    /* renamed from: K */
    public static int m3906K(int i, byte[] bArr, int i2, int i3, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) {
        C8236i0 c8236i0 = (C8236i0) interfaceC8199c;
        int m3907J = m3907J(bArr, i2, c8214a);
        while (true) {
            c8236i0.m3808b(c8214a.f15980b);
            if (m3907J >= i3) {
                break;
            }
            int m3909H = m3909H(bArr, m3907J, c8214a);
            if (i != c8214a.f15979a) {
                break;
            }
            m3907J = m3907J(bArr, m3909H, c8214a);
        }
        return m3907J;
    }

    /* renamed from: L */
    public static int m3905L(int i, byte[] bArr, int i2, int i3, C8214a c8214a) throws C8202b0 {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                return i2 + 4;
                            }
                            throw new C8202b0("Protocol message contained an invalid tag (zero).");
                        }
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (i2 < i3) {
                            i2 = m3909H(bArr, i2, c8214a);
                            i6 = c8214a.f15979a;
                            if (i6 == i5) {
                                break;
                            }
                            i2 = m3905L(i6, bArr, i2, i3, c8214a);
                        }
                        if (i2 <= i3 && i6 == i5) {
                            return i2;
                        }
                        throw C8202b0.m3926e();
                    }
                    return m3909H(bArr, i2, c8214a) + c8214a.f15979a;
                }
                return i2 + 8;
            }
            return m3907J(bArr, i2, c8214a);
        }
        throw new C8202b0("Protocol message contained an invalid tag (zero).");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        r6 = m3907J(r5, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r9.f15980b == 0) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r9.f15980b != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
        r8.m3876b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r6 >= r7) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        r0 = m3909H(r5, r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r4 == r9.f15979a) goto L8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0026 -> B:5:0x000f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0028 -> B:6:0x0010). Please submit an issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m3904a(int r4, byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8199c<?> r8, com.google.crypto.tink.shaded.protobuf.C8213e.C8214a r9) {
        /*
            com.google.crypto.tink.shaded.protobuf.f r8 = (com.google.crypto.tink.shaded.protobuf.C8217f) r8
            int r6 = m3907J(r5, r6, r9)
            long r0 = r9.f15980b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lf
            goto L28
        Lf:
            r0 = 0
        L10:
            r8.m3876b(r0)
            if (r6 >= r7) goto L2a
            int r0 = m3909H(r5, r6, r9)
            int r1 = r9.f15979a
            if (r4 == r1) goto L1e
            goto L2a
        L1e:
            int r6 = m3907J(r5, r0, r9)
            long r0 = r9.f15980b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lf
        L28:
            r0 = 1
            goto L10
        L2a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8213e.m3904a(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.a0$c, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* renamed from: b */
    public static int m3903b(byte[] bArr, int i, C8214a c8214a) throws C8202b0 {
        int m3909H = m3909H(bArr, i, c8214a);
        int i2 = c8214a.f15979a;
        if (i2 >= 0) {
            if (i2 <= bArr.length - m3909H) {
                if (i2 == 0) {
                    c8214a.f15981c = AbstractC8228i.f15998b;
                    return m3909H;
                }
                c8214a.f15981c = AbstractC8228i.m3821i(m3909H, bArr, i2);
                return m3909H + i2;
            }
            throw C8202b0.m3925f();
        }
        throw C8202b0.m3927d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = m3909H(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r2 == r7.f15979a) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        r4 = m3909H(r3, r0, r7);
        r0 = r7.f15979a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r0 < 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r0 > (r3.length - r4)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r0 != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        r6.add(com.google.crypto.tink.shaded.protobuf.AbstractC8228i.f15998b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        throw com.google.crypto.tink.shaded.protobuf.C8202b0.m3925f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        throw com.google.crypto.tink.shaded.protobuf.C8202b0.m3927d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
        r6.add(com.google.crypto.tink.shaded.protobuf.AbstractC8228i.m3821i(r4, r3, r0));
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r4 >= r5) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x002e -> B:8:0x000f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0030 -> B:9:0x0017). Please submit an issue!!! */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int m3902c(int r2, byte[] r3, int r4, int r5, com.google.crypto.tink.shaded.protobuf.C8196a0.InterfaceC8199c<?> r6, com.google.crypto.tink.shaded.protobuf.C8213e.C8214a r7) throws com.google.crypto.tink.shaded.protobuf.C8202b0 {
        /*
            int r4 = m3909H(r3, r4, r7)
            int r0 = r7.f15979a
            if (r0 < 0) goto L46
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L41
            if (r0 != 0) goto Lf
            goto L30
        Lf:
            com.google.crypto.tink.shaded.protobuf.i$f r1 = com.google.crypto.tink.shaded.protobuf.AbstractC8228i.m3821i(r4, r3, r0)
            r6.add(r1)
            int r4 = r4 + r0
        L17:
            if (r4 >= r5) goto L40
            int r0 = m3909H(r3, r4, r7)
            int r1 = r7.f15979a
            if (r2 == r1) goto L22
            goto L40
        L22:
            int r4 = m3909H(r3, r0, r7)
            int r0 = r7.f15979a
            if (r0 < 0) goto L3b
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L36
            if (r0 != 0) goto Lf
        L30:
            com.google.crypto.tink.shaded.protobuf.i$f r0 = com.google.crypto.tink.shaded.protobuf.AbstractC8228i.f15998b
            r6.add(r0)
            goto L17
        L36:
            com.google.crypto.tink.shaded.protobuf.b0 r2 = com.google.crypto.tink.shaded.protobuf.C8202b0.m3925f()
            throw r2
        L3b:
            com.google.crypto.tink.shaded.protobuf.b0 r2 = com.google.crypto.tink.shaded.protobuf.C8202b0.m3927d()
            throw r2
        L40:
            return r4
        L41:
            com.google.crypto.tink.shaded.protobuf.b0 r2 = com.google.crypto.tink.shaded.protobuf.C8202b0.m3925f()
            throw r2
        L46:
            com.google.crypto.tink.shaded.protobuf.b0 r2 = com.google.crypto.tink.shaded.protobuf.C8202b0.m3927d()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8213e.m3902c(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.a0$c, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* renamed from: d */
    public static double m3901d(int i, byte[] bArr) {
        return Double.longBitsToDouble(m3896i(i, bArr));
    }

    /* renamed from: e */
    public static int m3900e(int i, byte[] bArr, int i2, int i3, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) {
        C8261n c8261n = (C8261n) interfaceC8199c;
        c8261n.m3646b(Double.longBitsToDouble(m3896i(i2, bArr)));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int m3909H = m3909H(bArr, i4, c8214a);
            if (i != c8214a.f15979a) {
                break;
            }
            c8261n.m3646b(Double.longBitsToDouble(m3896i(m3909H, bArr)));
            i4 = m3909H + 8;
        }
        return i4;
    }

    /* renamed from: f */
    public static int m3899f(int i, byte[] bArr, int i2, int i3, Object obj, InterfaceC8287r0 interfaceC8287r0, C8214a c8214a) throws IOException {
        C8277q c8277q = c8214a.f15982d;
        c8277q.getClass();
        if (c8277q.f16074a.get(new C8277q.C8278a(interfaceC8287r0, i >>> 3)) == null) {
            return m3911F(i, bArr, i2, i3, C8301u0.m3506p(obj), c8214a);
        }
        AbstractC8308y.AbstractC8311c abstractC8311c = (AbstractC8308y.AbstractC8311c) obj;
        C8299u<AbstractC8308y.C8312d> c8299u = abstractC8311c.extensions;
        if (c8299u.f16096b) {
            abstractC8311c.extensions = c8299u.clone();
        }
        throw null;
    }

    /* renamed from: g */
    public static int m3898g(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* renamed from: h */
    public static int m3897h(int i, byte[] bArr, int i2, int i3, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) {
        C8316z c8316z = (C8316z) interfaceC8199c;
        c8316z.m3454b(m3898g(i2, bArr));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int m3909H = m3909H(bArr, i4, c8214a);
            if (i != c8214a.f15979a) {
                break;
            }
            c8316z.m3454b(m3898g(m3909H, bArr));
            i4 = m3909H + 4;
        }
        return i4;
    }

    /* renamed from: i */
    public static long m3896i(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    /* renamed from: j */
    public static int m3895j(int i, byte[] bArr, int i2, int i3, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) {
        C8236i0 c8236i0 = (C8236i0) interfaceC8199c;
        c8236i0.m3808b(m3896i(i2, bArr));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int m3909H = m3909H(bArr, i4, c8214a);
            if (i != c8214a.f15979a) {
                break;
            }
            c8236i0.m3808b(m3896i(m3909H, bArr));
            i4 = m3909H + 8;
        }
        return i4;
    }

    /* renamed from: k */
    public static float m3894k(int i, byte[] bArr) {
        return Float.intBitsToFloat(m3898g(i, bArr));
    }

    /* renamed from: l */
    public static int m3893l(int i, byte[] bArr, int i2, int i3, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) {
        C8304w c8304w = (C8304w) interfaceC8199c;
        c8304w.m3483b(Float.intBitsToFloat(m3898g(i2, bArr)));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int m3909H = m3909H(bArr, i4, c8214a);
            if (i != c8214a.f15979a) {
                break;
            }
            c8304w.m3483b(Float.intBitsToFloat(m3898g(m3909H, bArr)));
            i4 = m3909H + 4;
        }
        return i4;
    }

    /* renamed from: m */
    public static int m3892m(InterfaceC8219f1 interfaceC8219f1, byte[] bArr, int i, int i2, int i3, C8214a c8214a) throws IOException {
        C8301u0 c8301u0 = (C8301u0) interfaceC8219f1;
        Object mo3489f = c8301u0.mo3489f();
        int m3526B = c8301u0.m3526B(mo3489f, bArr, i, i2, i3, c8214a);
        c8301u0.mo3493b(mo3489f);
        c8214a.f15981c = mo3489f;
        return m3526B;
    }

    /* renamed from: n */
    public static int m3891n(InterfaceC8219f1 interfaceC8219f1, int i, byte[] bArr, int i2, int i3, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) throws IOException {
        int i4 = (i & (-8)) | 4;
        int m3892m = m3892m(interfaceC8219f1, bArr, i2, i3, i4, c8214a);
        while (true) {
            interfaceC8199c.add(c8214a.f15981c);
            if (m3892m >= i3) {
                break;
            }
            int m3909H = m3909H(bArr, m3892m, c8214a);
            if (i != c8214a.f15979a) {
                break;
            }
            m3892m = m3892m(interfaceC8219f1, bArr, m3909H, i3, i4, c8214a);
        }
        return m3892m;
    }

    /* renamed from: o */
    public static int m3890o(InterfaceC8219f1 interfaceC8219f1, byte[] bArr, int i, int i2, C8214a c8214a) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = m3910G(i4, bArr, i3, c8214a);
            i4 = c8214a.f15979a;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw C8202b0.m3925f();
        }
        Object mo3489f = interfaceC8219f1.mo3489f();
        int i6 = i4 + i5;
        interfaceC8219f1.mo3486i(mo3489f, bArr, i5, i6, c8214a);
        interfaceC8219f1.mo3493b(mo3489f);
        c8214a.f15981c = mo3489f;
        return i6;
    }

    /* renamed from: p */
    public static int m3889p(InterfaceC8219f1<?> interfaceC8219f1, int i, byte[] bArr, int i2, int i3, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) throws IOException {
        int m3890o = m3890o(interfaceC8219f1, bArr, i2, i3, c8214a);
        while (true) {
            interfaceC8199c.add(c8214a.f15981c);
            if (m3890o >= i3) {
                break;
            }
            int m3909H = m3909H(bArr, m3890o, c8214a);
            if (i != c8214a.f15979a) {
                break;
            }
            m3890o = m3890o(interfaceC8219f1, bArr, m3909H, i3, c8214a);
        }
        return m3890o;
    }

    /* renamed from: q */
    public static int m3888q(byte[] bArr, int i, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) throws IOException {
        C8217f c8217f = (C8217f) interfaceC8199c;
        int m3909H = m3909H(bArr, i, c8214a);
        int i2 = c8214a.f15979a + m3909H;
        while (m3909H < i2) {
            m3909H = m3907J(bArr, m3909H, c8214a);
            c8217f.m3876b(c8214a.f15980b != 0);
        }
        if (m3909H == i2) {
            return m3909H;
        }
        throw C8202b0.m3925f();
    }

    /* renamed from: r */
    public static int m3887r(byte[] bArr, int i, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) throws IOException {
        C8261n c8261n = (C8261n) interfaceC8199c;
        int m3909H = m3909H(bArr, i, c8214a);
        int i2 = c8214a.f15979a + m3909H;
        while (m3909H < i2) {
            c8261n.m3646b(Double.longBitsToDouble(m3896i(m3909H, bArr)));
            m3909H += 8;
        }
        if (m3909H == i2) {
            return m3909H;
        }
        throw C8202b0.m3925f();
    }

    /* renamed from: s */
    public static int m3886s(byte[] bArr, int i, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) throws IOException {
        C8316z c8316z = (C8316z) interfaceC8199c;
        int m3909H = m3909H(bArr, i, c8214a);
        int i2 = c8214a.f15979a + m3909H;
        while (m3909H < i2) {
            c8316z.m3454b(m3898g(m3909H, bArr));
            m3909H += 4;
        }
        if (m3909H == i2) {
            return m3909H;
        }
        throw C8202b0.m3925f();
    }

    /* renamed from: t */
    public static int m3885t(byte[] bArr, int i, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) throws IOException {
        C8236i0 c8236i0 = (C8236i0) interfaceC8199c;
        int m3909H = m3909H(bArr, i, c8214a);
        int i2 = c8214a.f15979a + m3909H;
        while (m3909H < i2) {
            c8236i0.m3808b(m3896i(m3909H, bArr));
            m3909H += 8;
        }
        if (m3909H == i2) {
            return m3909H;
        }
        throw C8202b0.m3925f();
    }

    /* renamed from: u */
    public static int m3884u(byte[] bArr, int i, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) throws IOException {
        C8304w c8304w = (C8304w) interfaceC8199c;
        int m3909H = m3909H(bArr, i, c8214a);
        int i2 = c8214a.f15979a + m3909H;
        while (m3909H < i2) {
            c8304w.m3483b(Float.intBitsToFloat(m3898g(m3909H, bArr)));
            m3909H += 4;
        }
        if (m3909H == i2) {
            return m3909H;
        }
        throw C8202b0.m3925f();
    }

    /* renamed from: v */
    public static int m3883v(byte[] bArr, int i, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) throws IOException {
        C8316z c8316z = (C8316z) interfaceC8199c;
        int m3909H = m3909H(bArr, i, c8214a);
        int i2 = c8214a.f15979a + m3909H;
        while (m3909H < i2) {
            m3909H = m3909H(bArr, m3909H, c8214a);
            c8316z.m3454b(AbstractC8244j.m3796b(c8214a.f15979a));
        }
        if (m3909H == i2) {
            return m3909H;
        }
        throw C8202b0.m3925f();
    }

    /* renamed from: w */
    public static int m3882w(byte[] bArr, int i, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) throws IOException {
        C8236i0 c8236i0 = (C8236i0) interfaceC8199c;
        int m3909H = m3909H(bArr, i, c8214a);
        int i2 = c8214a.f15979a + m3909H;
        while (m3909H < i2) {
            m3909H = m3907J(bArr, m3909H, c8214a);
            c8236i0.m3808b(AbstractC8244j.m3795c(c8214a.f15980b));
        }
        if (m3909H == i2) {
            return m3909H;
        }
        throw C8202b0.m3925f();
    }

    /* renamed from: x */
    public static int m3881x(byte[] bArr, int i, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) throws IOException {
        C8316z c8316z = (C8316z) interfaceC8199c;
        int m3909H = m3909H(bArr, i, c8214a);
        int i2 = c8214a.f15979a + m3909H;
        while (m3909H < i2) {
            m3909H = m3909H(bArr, m3909H, c8214a);
            c8316z.m3454b(c8214a.f15979a);
        }
        if (m3909H == i2) {
            return m3909H;
        }
        throw C8202b0.m3925f();
    }

    /* renamed from: y */
    public static int m3880y(byte[] bArr, int i, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) throws IOException {
        C8236i0 c8236i0 = (C8236i0) interfaceC8199c;
        int m3909H = m3909H(bArr, i, c8214a);
        int i2 = c8214a.f15979a + m3909H;
        while (m3909H < i2) {
            m3909H = m3907J(bArr, m3909H, c8214a);
            c8236i0.m3808b(c8214a.f15980b);
        }
        if (m3909H == i2) {
            return m3909H;
        }
        throw C8202b0.m3925f();
    }

    /* renamed from: z */
    public static int m3879z(int i, byte[] bArr, int i2, int i3, C8196a0.InterfaceC8199c<?> interfaceC8199c, C8214a c8214a) {
        C8316z c8316z = (C8316z) interfaceC8199c;
        int m3909H = m3909H(bArr, i2, c8214a);
        while (true) {
            c8316z.m3454b(AbstractC8244j.m3796b(c8214a.f15979a));
            if (m3909H >= i3) {
                break;
            }
            int m3909H2 = m3909H(bArr, m3909H, c8214a);
            if (i != c8214a.f15979a) {
                break;
            }
            m3909H = m3909H(bArr, m3909H2, c8214a);
        }
        return m3909H;
    }
}
