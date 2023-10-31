package com.google.crypto.tink.shaded.protobuf;

import androidx.activity.result.C0063d;
import com.google.android.gms.ads.AdRequest;
import com.google.crypto.tink.shaded.protobuf.C8196a0;
import com.google.crypto.tink.shaded.protobuf.C8213e;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.google.crypto.tink.shaded.protobuf.u0 */
/* loaded from: classes3.dex */
public final class C8301u0<T> implements InterfaceC8219f1<T> {

    /* renamed from: r */
    public static final int[] f16098r = new int[0];

    /* renamed from: s */
    public static final Unsafe f16099s = C8271p1.m3597o();

    /* renamed from: a */
    public final int[] f16100a;

    /* renamed from: b */
    public final Object[] f16101b;

    /* renamed from: c */
    public final int f16102c;

    /* renamed from: d */
    public final int f16103d;

    /* renamed from: e */
    public final InterfaceC8287r0 f16104e;

    /* renamed from: f */
    public final boolean f16105f;

    /* renamed from: g */
    public final boolean f16106g;

    /* renamed from: h */
    public final boolean f16107h;

    /* renamed from: i */
    public final boolean f16108i;

    /* renamed from: j */
    public final int[] f16109j;

    /* renamed from: k */
    public final int f16110k;

    /* renamed from: l */
    public final int f16111l;

    /* renamed from: m */
    public final InterfaceC8305w0 f16112m;

    /* renamed from: n */
    public final AbstractC8224h0 f16113n;

    /* renamed from: o */
    public final AbstractC8257l1<?, ?> f16114o;

    /* renamed from: p */
    public final AbstractC8286r<?> f16115p;

    /* renamed from: q */
    public final InterfaceC8259m0 f16116q;

    public C8301u0(int[] iArr, Object[] objArr, int i, int i2, InterfaceC8287r0 interfaceC8287r0, boolean z, int[] iArr2, int i3, int i4, InterfaceC8305w0 interfaceC8305w0, AbstractC8224h0 abstractC8224h0, AbstractC8257l1 abstractC8257l1, AbstractC8286r abstractC8286r, InterfaceC8259m0 interfaceC8259m0) {
        this.f16100a = iArr;
        this.f16101b = objArr;
        this.f16102c = i;
        this.f16103d = i2;
        this.f16106g = interfaceC8287r0 instanceof AbstractC8308y;
        this.f16107h = z;
        this.f16105f = abstractC8286r != null && abstractC8286r.mo3551e(interfaceC8287r0);
        this.f16108i = false;
        this.f16109j = iArr2;
        this.f16110k = i3;
        this.f16111l = i4;
        this.f16112m = interfaceC8305w0;
        this.f16113n = abstractC8224h0;
        this.f16114o = abstractC8257l1;
        this.f16115p = abstractC8286r;
        this.f16104e = interfaceC8287r0;
        this.f16116q = interfaceC8259m0;
    }

    /* renamed from: I */
    public static Field m3519I(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder m13052b = C0063d.m13052b("Field ", str, " for ");
            m13052b.append(cls.getName());
            m13052b.append(" not found. Known fields are ");
            m13052b.append(Arrays.toString(declaredFields));
            throw new RuntimeException(m13052b.toString());
        }
    }

    /* renamed from: P */
    public static void m3512P(int i, Object obj, C8258m c8258m) throws IOException {
        if (obj instanceof String) {
            c8258m.f16048a.mo3684K(i, (String) obj);
            return;
        }
        c8258m.m3666b(i, (AbstractC8228i) obj);
    }

    /* renamed from: p */
    public static C8260m1 m3506p(Object obj) {
        AbstractC8308y abstractC8308y = (AbstractC8308y) obj;
        C8260m1 c8260m1 = abstractC8308y.unknownFields;
        if (c8260m1 == C8260m1.f16049f) {
            C8260m1 c8260m12 = new C8260m1();
            abstractC8308y.unknownFields = c8260m12;
            return c8260m12;
        }
        return c8260m1;
    }

    /* renamed from: u */
    public static List m3501u(long j, Object obj) {
        return (List) C8271p1.m3598n(j, obj);
    }

    /* renamed from: w */
    public static <T> C8301u0<T> m3499w(C8212d1 c8212d1, InterfaceC8305w0 interfaceC8305w0, AbstractC8224h0 abstractC8224h0, AbstractC8257l1<?, ?> abstractC8257l1, AbstractC8286r<?> abstractC8286r, InterfaceC8259m0 interfaceC8259m0) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int objectFieldOffset;
        String str;
        Class<?> cls;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        Field m3519I;
        char charAt11;
        int i27;
        int i28;
        int i29;
        Field m3519I2;
        Field m3519I3;
        int i30;
        char charAt12;
        int i31;
        char charAt13;
        int i32;
        char charAt14;
        int i33;
        char charAt15;
        char charAt16;
        int i34 = 0;
        boolean z = c8212d1.mo3612c() == 2;
        String m3917e = c8212d1.m3917e();
        int length = m3917e.length();
        int charAt17 = m3917e.charAt(0);
        if (charAt17 >= 55296) {
            int i35 = charAt17 & 8191;
            int i36 = 1;
            int i37 = 13;
            while (true) {
                i = i36 + 1;
                charAt16 = m3917e.charAt(i36);
                if (charAt16 < 55296) {
                    break;
                }
                i35 |= (charAt16 & 8191) << i37;
                i37 += 13;
                i36 = i;
            }
            charAt17 = i35 | (charAt16 << i37);
        } else {
            i = 1;
        }
        int i38 = i + 1;
        int charAt18 = m3917e.charAt(i);
        if (charAt18 >= 55296) {
            int i39 = charAt18 & 8191;
            int i40 = 13;
            while (true) {
                i33 = i38 + 1;
                charAt15 = m3917e.charAt(i38);
                if (charAt15 < 55296) {
                    break;
                }
                i39 |= (charAt15 & 8191) << i40;
                i40 += 13;
                i38 = i33;
            }
            charAt18 = i39 | (charAt15 << i40);
            i38 = i33;
        }
        if (charAt18 == 0) {
            i6 = 0;
            charAt = 0;
            i5 = 0;
            charAt2 = 0;
            i3 = 0;
            iArr = f16098r;
            i4 = 0;
        } else {
            int i41 = i38 + 1;
            int charAt19 = m3917e.charAt(i38);
            if (charAt19 >= 55296) {
                int i42 = charAt19 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    charAt10 = m3917e.charAt(i41);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i42 |= (charAt10 & 8191) << i43;
                    i43 += 13;
                    i41 = i14;
                }
                charAt19 = i42 | (charAt10 << i43);
                i41 = i14;
            }
            int i44 = i41 + 1;
            int charAt20 = m3917e.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    charAt9 = m3917e.charAt(i44);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i45 |= (charAt9 & 8191) << i46;
                    i46 += 13;
                    i44 = i13;
                }
                charAt20 = i45 | (charAt9 << i46);
                i44 = i13;
            }
            int i47 = i44 + 1;
            int charAt21 = m3917e.charAt(i44);
            if (charAt21 >= 55296) {
                int i48 = charAt21 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    charAt8 = m3917e.charAt(i47);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i48 |= (charAt8 & 8191) << i49;
                    i49 += 13;
                    i47 = i12;
                }
                charAt21 = i48 | (charAt8 << i49);
                i47 = i12;
            }
            int i50 = i47 + 1;
            charAt = m3917e.charAt(i47);
            if (charAt >= 55296) {
                int i51 = charAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    charAt7 = m3917e.charAt(i50);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i51 |= (charAt7 & 8191) << i52;
                    i52 += 13;
                    i50 = i11;
                }
                charAt = i51 | (charAt7 << i52);
                i50 = i11;
            }
            int i53 = i50 + 1;
            int charAt22 = m3917e.charAt(i50);
            if (charAt22 >= 55296) {
                int i54 = charAt22 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    charAt6 = m3917e.charAt(i53);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i54 |= (charAt6 & 8191) << i55;
                    i55 += 13;
                    i53 = i10;
                }
                charAt22 = i54 | (charAt6 << i55);
                i53 = i10;
            }
            int i56 = i53 + 1;
            charAt2 = m3917e.charAt(i53);
            if (charAt2 >= 55296) {
                int i57 = charAt2 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    charAt5 = m3917e.charAt(i56);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i57 |= (charAt5 & 8191) << i58;
                    i58 += 13;
                    i56 = i9;
                }
                charAt2 = i57 | (charAt5 << i58);
                i56 = i9;
            }
            int i59 = i56 + 1;
            int charAt23 = m3917e.charAt(i56);
            if (charAt23 >= 55296) {
                int i60 = charAt23 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i8 = i61 + 1;
                    charAt4 = m3917e.charAt(i61);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i60 |= (charAt4 & 8191) << i62;
                    i62 += 13;
                    i61 = i8;
                }
                charAt23 = i60 | (charAt4 << i62);
                i2 = i8;
            } else {
                i2 = i59;
            }
            int i63 = i2 + 1;
            int charAt24 = m3917e.charAt(i2);
            if (charAt24 >= 55296) {
                int i64 = charAt24 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i7 = i65 + 1;
                    charAt3 = m3917e.charAt(i65);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i64 |= (charAt3 & 8191) << i66;
                    i66 += 13;
                    i65 = i7;
                }
                charAt24 = i64 | (charAt3 << i66);
                i63 = i7;
            }
            i3 = (charAt19 * 2) + charAt20;
            i4 = charAt22;
            i5 = charAt24;
            i34 = charAt19;
            i38 = i63;
            int i67 = charAt21;
            iArr = new int[charAt24 + charAt2 + charAt23];
            i6 = i67;
        }
        Object[] m3918d = c8212d1.m3918d();
        Class<?> cls2 = c8212d1.mo3613b().getClass();
        int[] iArr2 = new int[i4 * 3];
        Object[] objArr = new Object[i4 * 2];
        int i68 = charAt2 + i5;
        int i69 = i5;
        int i70 = i68;
        int i71 = 0;
        int i72 = 0;
        while (i38 < length) {
            int i73 = i38 + 1;
            int charAt25 = m3917e.charAt(i38);
            if (charAt25 >= 55296) {
                int i74 = charAt25 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i32 = i75 + 1;
                    charAt14 = m3917e.charAt(i75);
                    i15 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i74 |= (charAt14 & 8191) << i76;
                    i76 += 13;
                    i75 = i32;
                    length = i15;
                }
                charAt25 = i74 | (charAt14 << i76);
                i16 = i32;
            } else {
                i15 = length;
                i16 = i73;
            }
            int i77 = i16 + 1;
            int charAt26 = m3917e.charAt(i16);
            if (charAt26 >= 55296) {
                int i78 = charAt26 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i31 = i79 + 1;
                    charAt13 = m3917e.charAt(i79);
                    i17 = i68;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i78 |= (charAt13 & 8191) << i80;
                    i80 += 13;
                    i79 = i31;
                    i68 = i17;
                }
                charAt26 = i78 | (charAt13 << i80);
                i18 = i31;
            } else {
                i17 = i68;
                i18 = i77;
            }
            int i81 = charAt26 & 255;
            int i82 = i5;
            if ((charAt26 & 1024) != 0) {
                iArr[i72] = i71;
                i72++;
            }
            boolean z2 = z;
            Unsafe unsafe = f16099s;
            if (i81 >= 51) {
                int i83 = i18 + 1;
                int charAt27 = m3917e.charAt(i18);
                if (charAt27 >= 55296) {
                    int i84 = charAt27 & 8191;
                    int i85 = i83;
                    int i86 = 13;
                    while (true) {
                        i30 = i85 + 1;
                        charAt12 = m3917e.charAt(i85);
                        i19 = charAt;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i84 |= (charAt12 & 8191) << i86;
                        i86 += 13;
                        i85 = i30;
                        charAt = i19;
                    }
                    charAt27 = i84 | (charAt12 << i86);
                    i28 = i30;
                } else {
                    i19 = charAt;
                    i28 = i83;
                }
                int i87 = i81 - 51;
                int i88 = i28;
                if (i87 == 9 || i87 == 17) {
                    i29 = 2;
                    objArr[((i71 / 3) * 2) + 1] = m3918d[i3];
                    i3++;
                } else {
                    if (i87 == 12 && (charAt17 & 1) == 1) {
                        objArr[((i71 / 3) * 2) + 1] = m3918d[i3];
                        i3++;
                    }
                    i29 = 2;
                }
                int i89 = charAt27 * i29;
                Object obj = m3918d[i89];
                if (obj instanceof Field) {
                    m3519I2 = (Field) obj;
                } else {
                    m3519I2 = m3519I(cls2, (String) obj);
                    m3918d[i89] = m3519I2;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m3519I2);
                int i90 = i89 + 1;
                Object obj2 = m3918d[i90];
                if (obj2 instanceof Field) {
                    m3519I3 = (Field) obj2;
                } else {
                    m3519I3 = m3519I(cls2, (String) obj2);
                    m3918d[i90] = m3519I3;
                }
                str = m3917e;
                cls = cls2;
                i23 = (int) unsafe.objectFieldOffset(m3519I3);
                i25 = i3;
                i26 = objectFieldOffset2;
                i24 = 0;
                i20 = i6;
                i21 = charAt25;
                i38 = i88;
            } else {
                i19 = charAt;
                int i91 = i3 + 1;
                Field m3519I4 = m3519I(cls2, (String) m3918d[i3]);
                if (i81 == 9 || i81 == 17) {
                    i20 = i6;
                    objArr[((i71 / 3) * 2) + 1] = m3519I4.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        i20 = i6;
                        i27 = i91 + 1;
                        objArr[((i71 / 3) * 2) + 1] = m3918d[i91];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        i20 = i6;
                        if ((charAt17 & 1) == 1) {
                            i27 = i91 + 1;
                            objArr[((i71 / 3) * 2) + 1] = m3918d[i91];
                        }
                    } else {
                        if (i81 == 50) {
                            int i92 = i69 + 1;
                            iArr[i69] = i71;
                            int i93 = (i71 / 3) * 2;
                            int i94 = i91 + 1;
                            objArr[i93] = m3918d[i91];
                            if ((charAt26 & 2048) != 0) {
                                i91 = i94 + 1;
                                objArr[i93 + 1] = m3918d[i94];
                                i20 = i6;
                                i69 = i92;
                            } else {
                                i69 = i92;
                                i91 = i94;
                            }
                        }
                        i20 = i6;
                    }
                    i21 = charAt25;
                    i91 = i27;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m3519I4);
                    if ((charAt17 & 1) == 1 || i81 > 17) {
                        str = m3917e;
                        cls = cls2;
                        i22 = i18;
                        i23 = 0;
                        i24 = 0;
                    } else {
                        int i95 = i18 + 1;
                        int charAt28 = m3917e.charAt(i18);
                        if (charAt28 >= 55296) {
                            int i96 = charAt28 & 8191;
                            int i97 = 13;
                            while (true) {
                                i22 = i95 + 1;
                                charAt11 = m3917e.charAt(i95);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i96 |= (charAt11 & 8191) << i97;
                                i97 += 13;
                                i95 = i22;
                            }
                            charAt28 = i96 | (charAt11 << i97);
                        } else {
                            i22 = i95;
                        }
                        int i98 = (charAt28 / 32) + (i34 * 2);
                        Object obj3 = m3918d[i98];
                        if (obj3 instanceof Field) {
                            m3519I = (Field) obj3;
                        } else {
                            m3519I = m3519I(cls2, (String) obj3);
                            m3918d[i98] = m3519I;
                        }
                        str = m3917e;
                        cls = cls2;
                        i23 = (int) unsafe.objectFieldOffset(m3519I);
                        i24 = charAt28 % 32;
                    }
                    if (i81 >= 18 && i81 <= 49) {
                        iArr[i70] = objectFieldOffset;
                        i70++;
                    }
                    i25 = i91;
                    i38 = i22;
                    i26 = objectFieldOffset;
                }
                i21 = charAt25;
                objectFieldOffset = (int) unsafe.objectFieldOffset(m3519I4);
                if ((charAt17 & 1) == 1) {
                }
                str = m3917e;
                cls = cls2;
                i22 = i18;
                i23 = 0;
                i24 = 0;
                if (i81 >= 18) {
                    iArr[i70] = objectFieldOffset;
                    i70++;
                }
                i25 = i91;
                i38 = i22;
                i26 = objectFieldOffset;
            }
            int i99 = i71 + 1;
            iArr2[i71] = i21;
            int i100 = i99 + 1;
            iArr2[i99] = ((charAt26 & 256) != 0 ? 268435456 : 0) | ((charAt26 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? 536870912 : 0) | (i81 << 20) | i26;
            i71 = i100 + 1;
            iArr2[i100] = i23 | (i24 << 20);
            i3 = i25;
            m3917e = str;
            i5 = i82;
            cls2 = cls;
            i6 = i20;
            length = i15;
            i68 = i17;
            z = z2;
            charAt = i19;
        }
        return new C8301u0<>(iArr2, objArr, i6, charAt, c8212d1.mo3613b(), z, iArr, i5, i68, interfaceC8305w0, abstractC8224h0, abstractC8257l1, abstractC8286r, interfaceC8259m0);
    }

    /* renamed from: x */
    public static int m3498x(long j, Object obj) {
        return ((Integer) C8271p1.m3598n(j, obj)).intValue();
    }

    /* renamed from: y */
    public static long m3497y(long j, Object obj) {
        return ((Long) C8271p1.m3598n(j, obj)).longValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
        if (r3 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
        if (r3 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c0, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.C8196a0.m3932c(r3, r29.f15981c);
     */
    /* renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m3527A(T r17, byte[] r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, long r26, int r28, com.google.crypto.tink.shaded.protobuf.C8213e.C8214a r29) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8301u0.m3527A(java.lang.Object, byte[], int, int, int, int, int, int, int, long, int, com.google.crypto.tink.shaded.protobuf.e$a):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r33v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v35, types: [int] */
    /* renamed from: B */
    public final int m3526B(T t, byte[] bArr, int i, int i2, int i3, C8213e.C8214a c8214a) throws IOException {
        Unsafe unsafe;
        C8301u0<T> c8301u0;
        Object obj;
        T t2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        byte b;
        byte b2;
        int i10;
        int i11;
        byte b3;
        byte b4;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        long j;
        long j2;
        int i18;
        long j3;
        int i19;
        byte b5;
        int i20;
        int m3907J;
        boolean z;
        long j4;
        int i21;
        long j5;
        Object obj2;
        long j6;
        int i22;
        C8301u0<T> c8301u02 = this;
        T t3 = t;
        byte[] bArr2 = bArr;
        int i23 = i2;
        C8213e.C8214a c8214a2 = c8214a;
        Unsafe unsafe2 = f16099s;
        int i24 = i;
        byte b6 = i3;
        int i25 = -1;
        int i26 = 0;
        byte b7 = 0;
        int i27 = -1;
        int i28 = 0;
        while (true) {
            if (i24 < i23) {
                int i29 = i24 + 1;
                byte b8 = bArr2[i24];
                if (b8 < 0) {
                    i29 = C8213e.m3910G(b8, bArr2, i29, c8214a2);
                    b8 = c8214a2.f15979a;
                }
                int i30 = b8 >>> 3;
                int i31 = b8 & 7;
                int i32 = c8301u02.f16103d;
                byte b9 = b8;
                int i33 = c8301u02.f16102c;
                byte b10 = b6;
                if (i30 > i25) {
                    i6 = (i30 < i33 || i30 > i32) ? -1 : c8301u02.m3516L(i30, i26 / 3);
                    i7 = -1;
                    i4 = 0;
                } else {
                    if (i30 < i33 || i30 > i32) {
                        i4 = 0;
                        i5 = -1;
                    } else {
                        i4 = 0;
                        i5 = c8301u02.m3516L(i30, 0);
                    }
                    i6 = i5;
                    i7 = -1;
                }
                if (i6 == i7) {
                    i8 = i4;
                    i9 = i30;
                    unsafe = unsafe2;
                    b = b9;
                    b2 = b10;
                } else {
                    int[] iArr = c8301u02.f16100a;
                    int i34 = iArr[i6 + 1];
                    int i35 = (i34 & 267386880) >>> 20;
                    long j7 = i34 & 1048575;
                    if (i35 <= 17) {
                        int i36 = iArr[i6 + 2];
                        int i37 = 1 << (i36 >>> 20);
                        int i38 = i36 & 1048575;
                        if (i38 != i27) {
                            if (i27 != -1) {
                                unsafe2.putInt(t3, i27, i28);
                            }
                            i27 = i38;
                            i28 = unsafe2.getInt(t3, i38);
                        }
                        switch (i35) {
                            case 0:
                                i15 = i29;
                                i9 = i30;
                                b = b9;
                                i16 = i6;
                                bArr2 = bArr;
                                i23 = i2;
                                if (i31 == 1) {
                                    C8271p1.m3592t(t3, j7, C8213e.m3901d(i15, bArr2));
                                    i17 = i15 + 8;
                                    i24 = i17;
                                    i28 |= i37;
                                    b6 = i3;
                                    i26 = i16;
                                    i25 = i9;
                                    break;
                                } else {
                                    b2 = i3;
                                    i29 = i15;
                                    i8 = i16;
                                    unsafe = unsafe2;
                                    break;
                                }
                            case 1:
                                i15 = i29;
                                i9 = i30;
                                b = b9;
                                i16 = i6;
                                bArr2 = bArr;
                                i23 = i2;
                                if (i31 == 5) {
                                    C8271p1.m3591u(t3, j7, C8213e.m3894k(i15, bArr2));
                                    i17 = i15 + 4;
                                    i24 = i17;
                                    i28 |= i37;
                                    b6 = i3;
                                    i26 = i16;
                                    i25 = i9;
                                    break;
                                } else {
                                    b2 = i3;
                                    i29 = i15;
                                    i8 = i16;
                                    unsafe = unsafe2;
                                    break;
                                }
                            case 2:
                            case 3:
                                i15 = i29;
                                i9 = i30;
                                b = b9;
                                i16 = i6;
                                j = j7;
                                bArr2 = bArr;
                                i23 = i2;
                                if (i31 == 0) {
                                    int m3907J2 = C8213e.m3907J(bArr2, i15, c8214a2);
                                    j2 = c8214a2.f15980b;
                                    i18 = m3907J2;
                                    unsafe2.putLong(t, j, j2);
                                    i28 |= i37;
                                    i24 = i18;
                                    b6 = i3;
                                    i26 = i16;
                                    i25 = i9;
                                    break;
                                } else {
                                    b2 = i3;
                                    i29 = i15;
                                    i8 = i16;
                                    unsafe = unsafe2;
                                    break;
                                }
                            case 4:
                            case 11:
                                i15 = i29;
                                i9 = i30;
                                b = b9;
                                i16 = i6;
                                j3 = j7;
                                bArr2 = bArr;
                                i23 = i2;
                                if (i31 == 0) {
                                    i24 = C8213e.m3909H(bArr2, i15, c8214a2);
                                    i19 = c8214a2.f15979a;
                                    unsafe2.putInt(t3, j3, i19);
                                    i28 |= i37;
                                    b6 = i3;
                                    i26 = i16;
                                    i25 = i9;
                                    break;
                                } else {
                                    b2 = i3;
                                    i29 = i15;
                                    i8 = i16;
                                    unsafe = unsafe2;
                                    break;
                                }
                            case 5:
                            case 14:
                                i9 = i30;
                                b5 = b9;
                                bArr2 = bArr;
                                i23 = i2;
                                i16 = i6;
                                if (i31 == 1) {
                                    b = b5;
                                    unsafe2.putLong(t, j7, C8213e.m3896i(i29, bArr2));
                                    i17 = i29 + 8;
                                    i24 = i17;
                                    i28 |= i37;
                                    b6 = i3;
                                    i26 = i16;
                                    i25 = i9;
                                    break;
                                } else {
                                    b = b5;
                                    i15 = i29;
                                    b2 = i3;
                                    i29 = i15;
                                    i8 = i16;
                                    unsafe = unsafe2;
                                    break;
                                }
                            case 6:
                            case 13:
                                i9 = i30;
                                b5 = b9;
                                bArr2 = bArr;
                                i23 = i2;
                                i16 = i6;
                                if (i31 == 5) {
                                    unsafe2.putInt(t3, j7, C8213e.m3898g(i29, bArr2));
                                    i20 = i29 + 4;
                                    m3907J = i20;
                                    i21 = i28 | i37;
                                    i28 = i21;
                                    i24 = m3907J;
                                    b = b5;
                                    b6 = i3;
                                    i26 = i16;
                                    i25 = i9;
                                    break;
                                } else {
                                    b = b5;
                                    i15 = i29;
                                    b2 = i3;
                                    i29 = i15;
                                    i8 = i16;
                                    unsafe = unsafe2;
                                    break;
                                }
                            case 7:
                                i9 = i30;
                                b5 = b9;
                                bArr2 = bArr;
                                i23 = i2;
                                i16 = i6;
                                if (i31 == 0) {
                                    m3907J = C8213e.m3907J(bArr2, i29, c8214a2);
                                    if (c8214a2.f15980b != 0) {
                                        j4 = j7;
                                        z = true;
                                    } else {
                                        z = false;
                                        j4 = j7;
                                    }
                                    C8271p1.m3596p(t3, j4, z);
                                    i21 = i28 | i37;
                                    i28 = i21;
                                    i24 = m3907J;
                                    b = b5;
                                    b6 = i3;
                                    i26 = i16;
                                    i25 = i9;
                                    break;
                                } else {
                                    b = b5;
                                    i15 = i29;
                                    b2 = i3;
                                    i29 = i15;
                                    i8 = i16;
                                    unsafe = unsafe2;
                                    break;
                                }
                            case 8:
                                i9 = i30;
                                j5 = j7;
                                b5 = b9;
                                bArr2 = bArr;
                                i23 = i2;
                                i16 = i6;
                                if (i31 == 2) {
                                    i20 = (i34 & 536870912) == 0 ? C8213e.m3915B(bArr2, i29, c8214a2) : C8213e.m3912E(bArr2, i29, c8214a2);
                                    obj2 = c8214a2.f15981c;
                                    unsafe2.putObject(t3, j5, obj2);
                                    m3907J = i20;
                                    i21 = i28 | i37;
                                    i28 = i21;
                                    i24 = m3907J;
                                    b = b5;
                                    b6 = i3;
                                    i26 = i16;
                                    i25 = i9;
                                    break;
                                } else {
                                    b = b5;
                                    i15 = i29;
                                    b2 = i3;
                                    i29 = i15;
                                    i8 = i16;
                                    unsafe = unsafe2;
                                    break;
                                }
                            case 9:
                                i9 = i30;
                                j5 = j7;
                                b5 = b9;
                                bArr2 = bArr;
                                i16 = i6;
                                if (i31 != 2) {
                                    b = b5;
                                    i15 = i29;
                                    b2 = i3;
                                    i29 = i15;
                                    i8 = i16;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i23 = i2;
                                    i20 = C8213e.m3890o(c8301u02.m3507o(i16), bArr2, i29, i23, c8214a2);
                                    if ((i28 & i37) != 0) {
                                        obj2 = C8196a0.m3932c(unsafe2.getObject(t3, j5), c8214a2.f15981c);
                                        unsafe2.putObject(t3, j5, obj2);
                                        m3907J = i20;
                                        i21 = i28 | i37;
                                        i28 = i21;
                                        i24 = m3907J;
                                        b = b5;
                                        b6 = i3;
                                        i26 = i16;
                                        i25 = i9;
                                        break;
                                    }
                                    obj2 = c8214a2.f15981c;
                                    unsafe2.putObject(t3, j5, obj2);
                                    m3907J = i20;
                                    i21 = i28 | i37;
                                    i28 = i21;
                                    i24 = m3907J;
                                    b = b5;
                                    b6 = i3;
                                    i26 = i16;
                                    i25 = i9;
                                }
                            case 10:
                                i9 = i30;
                                b5 = b9;
                                bArr2 = bArr;
                                i16 = i6;
                                if (i31 == 2) {
                                    i24 = C8213e.m3903b(bArr2, i29, c8214a2);
                                    unsafe2.putObject(t3, j7, c8214a2.f15981c);
                                    i23 = i2;
                                    b = b5;
                                    i28 |= i37;
                                    b6 = i3;
                                    i26 = i16;
                                    i25 = i9;
                                    break;
                                } else {
                                    b = b5;
                                    i15 = i29;
                                    b2 = i3;
                                    i29 = i15;
                                    i8 = i16;
                                    unsafe = unsafe2;
                                    break;
                                }
                            case 12:
                                i9 = i30;
                                j6 = j7;
                                b5 = b9;
                                bArr2 = bArr;
                                i16 = i6;
                                if (i31 != 0) {
                                    b = b5;
                                    i15 = i29;
                                    b2 = i3;
                                    i29 = i15;
                                    i8 = i16;
                                    unsafe = unsafe2;
                                    break;
                                } else {
                                    i24 = C8213e.m3909H(bArr2, i29, c8214a2);
                                    i22 = c8214a2.f15979a;
                                    C8196a0.InterfaceC8198b m3509m = c8301u02.m3509m(i16);
                                    if (m3509m != null && !m3509m.m3931a()) {
                                        m3506p(t).m3648b(b5, Long.valueOf(i22));
                                        i23 = i2;
                                        b = b5;
                                        b6 = i3;
                                        i26 = i16;
                                        i25 = i9;
                                        break;
                                    }
                                    i23 = i2;
                                    b = b5;
                                    long j8 = j6;
                                    i19 = i22;
                                    j3 = j8;
                                    unsafe2.putInt(t3, j3, i19);
                                    i28 |= i37;
                                    b6 = i3;
                                    i26 = i16;
                                    i25 = i9;
                                }
                                break;
                            case 15:
                                i9 = i30;
                                j6 = j7;
                                b5 = b9;
                                bArr2 = bArr;
                                i16 = i6;
                                if (i31 == 0) {
                                    i24 = C8213e.m3909H(bArr2, i29, c8214a2);
                                    i22 = AbstractC8244j.m3796b(c8214a2.f15979a);
                                    i23 = i2;
                                    b = b5;
                                    long j82 = j6;
                                    i19 = i22;
                                    j3 = j82;
                                    unsafe2.putInt(t3, j3, i19);
                                    i28 |= i37;
                                    b6 = i3;
                                    i26 = i16;
                                    i25 = i9;
                                    break;
                                } else {
                                    b = b5;
                                    i15 = i29;
                                    b2 = i3;
                                    i29 = i15;
                                    i8 = i16;
                                    unsafe = unsafe2;
                                    break;
                                }
                            case 16:
                                i9 = i30;
                                b5 = b9;
                                i16 = i6;
                                if (i31 == 0) {
                                    bArr2 = bArr;
                                    i23 = i2;
                                    i18 = C8213e.m3907J(bArr2, i29, c8214a2);
                                    b = b5;
                                    j2 = AbstractC8244j.m3795c(c8214a2.f15980b);
                                    j = j7;
                                    unsafe2.putLong(t, j, j2);
                                    i28 |= i37;
                                    i24 = i18;
                                    b6 = i3;
                                    i26 = i16;
                                    i25 = i9;
                                    break;
                                } else {
                                    b = b5;
                                    i15 = i29;
                                    b2 = i3;
                                    i29 = i15;
                                    i8 = i16;
                                    unsafe = unsafe2;
                                    break;
                                }
                            case 17:
                                if (i31 == 3) {
                                    int i39 = (i30 << 3) | 4;
                                    i9 = i30;
                                    i16 = i6;
                                    i24 = C8213e.m3892m(c8301u02.m3507o(i6), bArr, i29, i2, i39, c8214a);
                                    unsafe2.putObject(t3, j7, (i28 & i37) == 0 ? c8214a2.f15981c : C8196a0.m3932c(unsafe2.getObject(t3, j7), c8214a2.f15981c));
                                    bArr2 = bArr;
                                    i23 = i2;
                                    i28 |= i37;
                                    b = b9;
                                    b6 = i3;
                                    i26 = i16;
                                    i25 = i9;
                                    break;
                                } else {
                                    i9 = i30;
                                    i16 = i6;
                                    i15 = i29;
                                    b = b9;
                                    b2 = i3;
                                    i29 = i15;
                                    i8 = i16;
                                    unsafe = unsafe2;
                                    break;
                                }
                            default:
                                i15 = i29;
                                i9 = i30;
                                b = b9;
                                i16 = i6;
                                b2 = i3;
                                i29 = i15;
                                i8 = i16;
                                unsafe = unsafe2;
                                break;
                        }
                        b7 = b;
                    } else {
                        int i40 = i29;
                        i9 = i30;
                        b = b9;
                        int i41 = i6;
                        bArr2 = bArr;
                        i23 = i2;
                        if (i35 != 27) {
                            i11 = i27;
                            if (i35 <= 49) {
                                i10 = i28;
                                i14 = i41;
                                unsafe = unsafe2;
                                i29 = m3524D(t, bArr, i40, i2, b, i9, i31, i41, i34, i35, j7, c8214a);
                                if (i29 != i40) {
                                    i24 = i29;
                                }
                                b2 = i3;
                                i8 = i14;
                                i27 = i11;
                                i28 = i10;
                            } else {
                                i13 = i40;
                                i10 = i28;
                                i14 = i41;
                                unsafe = unsafe2;
                                if (i35 != 50) {
                                    obj = null;
                                    i24 = m3527A(t, bArr, i13, i2, b, i9, i31, i34, i35, j7, i14, c8214a);
                                    if (i24 == i13) {
                                        b4 = i3;
                                        i12 = i24;
                                        i8 = i14;
                                        b3 = b;
                                        if (b3 == b4 || b4 == 0) {
                                            c8214a2 = c8214a;
                                            i24 = (this.f16105f || c8214a2.f15982d == C8277q.m3569a()) ? C8213e.m3911F(b3, bArr, i12, i2, m3506p(t), c8214a) : C8213e.m3899f(b3, bArr, i12, i2, t, this.f16104e, c8214a);
                                            t3 = t;
                                            bArr2 = bArr;
                                            i23 = i2;
                                            b6 = b4;
                                            b7 = b3;
                                            c8301u02 = this;
                                            i26 = i8;
                                            i25 = i9;
                                            i27 = i11;
                                            i28 = i10;
                                            unsafe2 = unsafe;
                                        } else {
                                            c8301u0 = this;
                                            i24 = i12;
                                            b6 = b4;
                                            b7 = b3;
                                            i27 = i11;
                                            i28 = i10;
                                        }
                                    }
                                } else if (i31 == 2) {
                                    m3496z(t, bArr, i13, i2, i14, j7, c8214a);
                                    throw null;
                                }
                            }
                            c8301u02 = this;
                            t3 = t;
                            bArr2 = bArr;
                            i23 = i2;
                            b6 = i3;
                            c8214a2 = c8214a;
                            i25 = i9;
                            i26 = i14;
                            i27 = i11;
                            b7 = b;
                            i28 = i10;
                            unsafe2 = unsafe;
                        } else if (i31 == 2) {
                            C8196a0.InterfaceC8199c interfaceC8199c = (C8196a0.InterfaceC8199c) unsafe2.getObject(t3, j7);
                            if (!interfaceC8199c.mo3921h()) {
                                int size = interfaceC8199c.size();
                                interfaceC8199c = interfaceC8199c.mo3453d(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t3, j7, interfaceC8199c);
                            }
                            i24 = C8213e.m3889p(c8301u02.m3507o(i41), b, bArr, i40, i2, interfaceC8199c, c8214a);
                            b6 = i3;
                            i26 = i41;
                            i25 = i9;
                            i27 = i27;
                            b7 = b;
                        } else {
                            i11 = i27;
                            i13 = i40;
                            i10 = i28;
                            i14 = i41;
                            unsafe = unsafe2;
                        }
                        i29 = i13;
                        b2 = i3;
                        i8 = i14;
                        i27 = i11;
                        i28 = i10;
                    }
                }
                i12 = i29;
                i11 = i27;
                i10 = i28;
                b3 = b;
                obj = null;
                b4 = b2;
                if (b3 == b4) {
                }
                c8214a2 = c8214a;
                if (this.f16105f) {
                }
                t3 = t;
                bArr2 = bArr;
                i23 = i2;
                b6 = b4;
                b7 = b3;
                c8301u02 = this;
                i26 = i8;
                i25 = i9;
                i27 = i11;
                i28 = i10;
                unsafe2 = unsafe;
            } else {
                unsafe = unsafe2;
                c8301u0 = c8301u02;
                obj = null;
            }
        }
        if (i27 != -1) {
            t2 = t;
            unsafe.putInt(t2, i27, i28);
        } else {
            t2 = t;
        }
        for (int i42 = c8301u0.f16110k; i42 < c8301u0.f16111l; i42++) {
            c8301u0.m3510l(t2, c8301u0.f16109j[i42], obj, c8301u0.f16114o);
        }
        if (b6 == 0) {
            if (i24 != i2) {
                throw C8202b0.m3926e();
            }
        } else if (i24 > i2 || b7 != b6) {
            throw C8202b0.m3926e();
        }
        return i24;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0225, code lost:
        if (r0 != r15) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0227, code lost:
        r2 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x022a, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01db, code lost:
        if (r0 != r15) goto L123;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r30v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [int] */
    /* renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3525C(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.crypto.tink.shaded.protobuf.C8213e.C8214a r34) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 642
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8301u0.m3525C(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.e$a):void");
    }

    /* renamed from: D */
    public final int m3524D(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, C8213e.C8214a c8214a) throws IOException {
        int m3908I;
        Unsafe unsafe = f16099s;
        C8196a0.InterfaceC8199c interfaceC8199c = (C8196a0.InterfaceC8199c) unsafe.getObject(t, j2);
        if (!interfaceC8199c.mo3921h()) {
            int size = interfaceC8199c.size();
            interfaceC8199c = interfaceC8199c.mo3453d(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, interfaceC8199c);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return C8213e.m3887r(bArr, i, interfaceC8199c, c8214a);
                }
                if (i5 == 1) {
                    return C8213e.m3900e(i3, bArr, i, i2, interfaceC8199c, c8214a);
                }
                break;
            case 19:
            case 36:
                if (i5 == 2) {
                    return C8213e.m3884u(bArr, i, interfaceC8199c, c8214a);
                }
                if (i5 == 5) {
                    return C8213e.m3893l(i3, bArr, i, i2, interfaceC8199c, c8214a);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return C8213e.m3880y(bArr, i, interfaceC8199c, c8214a);
                }
                if (i5 == 0) {
                    return C8213e.m3906K(i3, bArr, i, i2, interfaceC8199c, c8214a);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return C8213e.m3881x(bArr, i, interfaceC8199c, c8214a);
                }
                if (i5 == 0) {
                    return C8213e.m3908I(i3, bArr, i, i2, interfaceC8199c, c8214a);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return C8213e.m3885t(bArr, i, interfaceC8199c, c8214a);
                }
                if (i5 == 1) {
                    return C8213e.m3895j(i3, bArr, i, i2, interfaceC8199c, c8214a);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return C8213e.m3886s(bArr, i, interfaceC8199c, c8214a);
                }
                if (i5 == 5) {
                    return C8213e.m3897h(i3, bArr, i, i2, interfaceC8199c, c8214a);
                }
                break;
            case 25:
            case 42:
                if (i5 == 2) {
                    return C8213e.m3888q(bArr, i, interfaceC8199c, c8214a);
                }
                if (i5 == 0) {
                    return C8213e.m3904a(i3, bArr, i, i2, interfaceC8199c, c8214a);
                }
                break;
            case 26:
                if (i5 == 2) {
                    int i8 = ((j & 536870912) > 0L ? 1 : ((j & 536870912) == 0L ? 0 : -1));
                    C8196a0.InterfaceC8199c interfaceC8199c2 = interfaceC8199c;
                    return i8 == 0 ? C8213e.m3914C(i3, bArr, i, i2, interfaceC8199c2, c8214a) : C8213e.m3913D(i3, bArr, i, i2, interfaceC8199c2, c8214a);
                }
                break;
            case 27:
                if (i5 == 2) {
                    return C8213e.m3889p(m3507o(i6), i3, bArr, i, i2, interfaceC8199c, c8214a);
                }
                break;
            case 28:
                if (i5 == 2) {
                    return C8213e.m3902c(i3, bArr, i, i2, interfaceC8199c, c8214a);
                }
                break;
            case 30:
            case 44:
                if (i5 == 2) {
                    m3908I = C8213e.m3881x(bArr, i, interfaceC8199c, c8214a);
                } else if (i5 == 0) {
                    m3908I = C8213e.m3908I(i3, bArr, i, i2, interfaceC8199c, c8214a);
                }
                AbstractC8308y abstractC8308y = (AbstractC8308y) t;
                C8260m1 c8260m1 = abstractC8308y.unknownFields;
                if (c8260m1 == C8260m1.f16049f) {
                    c8260m1 = null;
                }
                C8260m1 c8260m12 = (C8260m1) C8222g1.m3827z(i4, interfaceC8199c, m3509m(i6), c8260m1, this.f16114o);
                if (c8260m12 != null) {
                    abstractC8308y.unknownFields = c8260m12;
                }
                return m3908I;
            case 33:
            case 47:
                if (i5 == 2) {
                    return C8213e.m3883v(bArr, i, interfaceC8199c, c8214a);
                }
                if (i5 == 0) {
                    return C8213e.m3879z(i3, bArr, i, i2, interfaceC8199c, c8214a);
                }
                break;
            case 34:
            case 48:
                if (i5 == 2) {
                    return C8213e.m3882w(bArr, i, interfaceC8199c, c8214a);
                }
                if (i5 == 0) {
                    return C8213e.m3916A(i3, bArr, i, i2, interfaceC8199c, c8214a);
                }
                break;
            case 49:
                if (i5 == 3) {
                    return C8213e.m3891n(m3507o(i6), i3, bArr, i, i2, interfaceC8199c, c8214a);
                }
                break;
        }
        return i;
    }

    /* renamed from: E */
    public final <E> void m3523E(Object obj, long j, InterfaceC8216e1 interfaceC8216e1, InterfaceC8219f1<E> interfaceC8219f1, C8277q c8277q) throws IOException {
        interfaceC8216e1.mo3751N(this.f16113n.mo3823c(j, obj), interfaceC8219f1, c8277q);
    }

    /* renamed from: F */
    public final <E> void m3522F(Object obj, int i, InterfaceC8216e1 interfaceC8216e1, InterfaceC8219f1<E> interfaceC8219f1, C8277q c8277q) throws IOException {
        interfaceC8216e1.mo3755J(this.f16113n.mo3823c(i & 1048575, obj), interfaceC8219f1, c8277q);
    }

    /* renamed from: G */
    public final void m3521G(Object obj, int i, InterfaceC8216e1 interfaceC8216e1) throws IOException {
        long j;
        Object mo3718z;
        if ((536870912 & i) != 0) {
            j = i & 1048575;
            mo3718z = interfaceC8216e1.mo3757H();
        } else {
            int i2 = i & 1048575;
            if (this.f16106g) {
                j = i2;
                mo3718z = interfaceC8216e1.mo3722v();
            } else {
                j = i2;
                mo3718z = interfaceC8216e1.mo3718z();
            }
        }
        C8271p1.m3588x(obj, j, mo3718z);
    }

    /* renamed from: H */
    public final void m3520H(Object obj, int i, InterfaceC8216e1 interfaceC8216e1) throws IOException {
        boolean z = (536870912 & i) != 0;
        AbstractC8224h0 abstractC8224h0 = this.f16113n;
        int i2 = i & 1048575;
        if (z) {
            interfaceC8216e1.mo3719y(abstractC8224h0.mo3823c(i2, obj));
        } else {
            interfaceC8216e1.mo3720x(abstractC8224h0.mo3823c(i2, obj));
        }
    }

    /* renamed from: J */
    public final void m3518J(int i, Object obj) {
        if (this.f16107h) {
            return;
        }
        int i2 = this.f16100a[i + 2];
        long j = i2 & 1048575;
        C8271p1.m3590v(obj, C8271p1.m3600l(j, obj) | (1 << (i2 >>> 20)), j);
    }

    /* renamed from: K */
    public final void m3517K(int i, int i2, Object obj) {
        C8271p1.m3590v(obj, i, this.f16100a[i2 + 2] & 1048575);
    }

    /* renamed from: L */
    public final int m3516L(int i, int i2) {
        int[] iArr = this.f16100a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: M */
    public final int m3515M(int i) {
        return this.f16100a[i + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028b  */
    /* renamed from: N */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3514N(java.lang.Object r21, com.google.crypto.tink.shaded.protobuf.C8258m r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8301u0.m3514N(java.lang.Object, com.google.crypto.tink.shaded.protobuf.m):void");
    }

    /* renamed from: O */
    public final void m3513O(C8258m c8258m, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            Object m3508n = m3508n(i2);
            InterfaceC8259m0 interfaceC8259m0 = this.f16116q;
            interfaceC8259m0.mo3642c(m3508n);
            C8256l0 mo3637h = interfaceC8259m0.mo3637h(obj);
            AbstractC8253l abstractC8253l = c8258m.f16048a;
            abstractC8253l.getClass();
            Iterator it = mo3637h.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                abstractC8253l.mo3683L(i, 2);
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: a */
    public final void mo3494a(T t, T t2) {
        t2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f16100a;
            if (i < iArr.length) {
                int m3515M = m3515M(i);
                long j = m3515M & 1048575;
                int i2 = iArr[i];
                switch ((m3515M & 267386880) >>> 20) {
                    case 0:
                        if (!m3503s(i, t2)) {
                            break;
                        } else {
                            C8271p1.m3592t(t, j, C8271p1.m3602j(j, t2));
                            m3518J(i, t);
                            break;
                        }
                    case 1:
                        if (!m3503s(i, t2)) {
                            break;
                        } else {
                            C8271p1.m3591u(t, j, C8271p1.m3601k(j, t2));
                            m3518J(i, t);
                            break;
                        }
                    case 2:
                        if (!m3503s(i, t2)) {
                            break;
                        }
                        C8271p1.m3589w(t, j, C8271p1.m3599m(j, t2));
                        m3518J(i, t);
                        break;
                    case 3:
                        if (!m3503s(i, t2)) {
                            break;
                        }
                        C8271p1.m3589w(t, j, C8271p1.m3599m(j, t2));
                        m3518J(i, t);
                        break;
                    case 4:
                        if (!m3503s(i, t2)) {
                            break;
                        }
                        C8271p1.m3590v(t, C8271p1.m3600l(j, t2), j);
                        m3518J(i, t);
                        break;
                    case 5:
                        if (!m3503s(i, t2)) {
                            break;
                        }
                        C8271p1.m3589w(t, j, C8271p1.m3599m(j, t2));
                        m3518J(i, t);
                        break;
                    case 6:
                        if (!m3503s(i, t2)) {
                            break;
                        }
                        C8271p1.m3590v(t, C8271p1.m3600l(j, t2), j);
                        m3518J(i, t);
                        break;
                    case 7:
                        if (!m3503s(i, t2)) {
                            break;
                        } else {
                            C8271p1.m3596p(t, j, C8271p1.m3606f(j, t2));
                            m3518J(i, t);
                            break;
                        }
                    case 8:
                        if (!m3503s(i, t2)) {
                            break;
                        }
                        C8271p1.m3588x(t, j, C8271p1.m3598n(j, t2));
                        m3518J(i, t);
                        break;
                    case 9:
                    case 17:
                        long m3515M2 = m3515M(i) & 1048575;
                        if (!m3503s(i, t2)) {
                            break;
                        } else {
                            Object m3598n = C8271p1.m3598n(m3515M2, t);
                            Object m3598n2 = C8271p1.m3598n(m3515M2, t2);
                            if (m3598n != null && m3598n2 != null) {
                                m3598n2 = C8196a0.m3932c(m3598n, m3598n2);
                            } else if (m3598n2 == null) {
                                break;
                            }
                            C8271p1.m3588x(t, m3515M2, m3598n2);
                            m3518J(i, t);
                            break;
                        }
                    case 10:
                        if (!m3503s(i, t2)) {
                            break;
                        }
                        C8271p1.m3588x(t, j, C8271p1.m3598n(j, t2));
                        m3518J(i, t);
                        break;
                    case 11:
                        if (!m3503s(i, t2)) {
                            break;
                        }
                        C8271p1.m3590v(t, C8271p1.m3600l(j, t2), j);
                        m3518J(i, t);
                        break;
                    case 12:
                        if (!m3503s(i, t2)) {
                            break;
                        }
                        C8271p1.m3590v(t, C8271p1.m3600l(j, t2), j);
                        m3518J(i, t);
                        break;
                    case 13:
                        if (!m3503s(i, t2)) {
                            break;
                        }
                        C8271p1.m3590v(t, C8271p1.m3600l(j, t2), j);
                        m3518J(i, t);
                        break;
                    case 14:
                        if (!m3503s(i, t2)) {
                            break;
                        }
                        C8271p1.m3589w(t, j, C8271p1.m3599m(j, t2));
                        m3518J(i, t);
                        break;
                    case 15:
                        if (!m3503s(i, t2)) {
                            break;
                        }
                        C8271p1.m3590v(t, C8271p1.m3600l(j, t2), j);
                        m3518J(i, t);
                        break;
                    case 16:
                        if (!m3503s(i, t2)) {
                            break;
                        }
                        C8271p1.m3589w(t, j, C8271p1.m3599m(j, t2));
                        m3518J(i, t);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.f16113n.mo3824b(t, j, t2);
                        break;
                    case 50:
                        Class<?> cls = C8222g1.f15988a;
                        C8271p1.m3588x(t, j, this.f16116q.mo3644a(C8271p1.m3598n(j, t), C8271p1.m3598n(j, t2)));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!m3502t(i2, i, t2)) {
                            break;
                        }
                        C8271p1.m3588x(t, j, C8271p1.m3598n(j, t2));
                        m3517K(i2, i, t);
                        break;
                    case 60:
                    case 68:
                        int m3515M3 = m3515M(i);
                        int i3 = iArr[i];
                        long j2 = m3515M3 & 1048575;
                        if (!m3502t(i3, i, t2)) {
                            break;
                        } else {
                            Object m3598n3 = C8271p1.m3598n(j2, t);
                            Object m3598n4 = C8271p1.m3598n(j2, t2);
                            if (m3598n3 != null && m3598n4 != null) {
                                m3598n4 = C8196a0.m3932c(m3598n3, m3598n4);
                            } else if (m3598n4 == null) {
                                break;
                            }
                            C8271p1.m3588x(t, j2, m3598n4);
                            m3517K(i3, i, t);
                            break;
                        }
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!m3502t(i2, i, t2)) {
                            break;
                        }
                        C8271p1.m3588x(t, j, C8271p1.m3598n(j, t2));
                        m3517K(i2, i, t);
                        break;
                }
                i += 3;
            } else {
                Class<?> cls2 = C8222g1.f15988a;
                AbstractC8257l1<?, ?> abstractC8257l1 = this.f16114o;
                abstractC8257l1.mo3623o(t, abstractC8257l1.mo3626k(abstractC8257l1.mo3630g(t), abstractC8257l1.mo3630g(t2)));
                if (this.f16105f) {
                    C8222g1.m3873B(this.f16115p, t, t2);
                    return;
                }
                return;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: b */
    public final void mo3493b(T t) {
        int[] iArr;
        int i;
        int i2 = this.f16110k;
        while (true) {
            iArr = this.f16109j;
            i = this.f16111l;
            if (i2 >= i) {
                break;
            }
            long m3515M = m3515M(iArr[i2]) & 1048575;
            Object m3598n = C8271p1.m3598n(m3515M, t);
            if (m3598n != null) {
                C8271p1.m3588x(t, m3515M, this.f16116q.mo3643b(m3598n));
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.f16113n.mo3825a(iArr[i], t);
            i++;
        }
        this.f16114o.mo3627j(t);
        if (this.f16105f) {
            this.f16115p.mo3550f(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: c */
    public final boolean mo3492c(T t) {
        int i;
        boolean z;
        boolean z2;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z3 = true;
            if (i3 < this.f16110k) {
                int i5 = this.f16109j[i3];
                int[] iArr = this.f16100a;
                int i6 = iArr[i5];
                int m3515M = m3515M(i5);
                boolean z4 = this.f16107h;
                if (!z4) {
                    int i7 = iArr[i5 + 2];
                    int i8 = i7 & 1048575;
                    i = 1 << (i7 >>> 20);
                    if (i8 != i2) {
                        i4 = f16099s.getInt(t, i8);
                        i2 = i8;
                    }
                } else {
                    i = 0;
                }
                if ((268435456 & m3515M) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (z4) {
                        z2 = m3503s(i5, t);
                    } else if ((i4 & i) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        return false;
                    }
                }
                int i9 = (267386880 & m3515M) >>> 20;
                if (i9 != 9 && i9 != 17) {
                    if (i9 != 27) {
                        if (i9 != 60 && i9 != 68) {
                            if (i9 != 49) {
                                if (i9 != 50) {
                                    continue;
                                } else {
                                    Object m3598n = C8271p1.m3598n(m3515M & 1048575, t);
                                    InterfaceC8259m0 interfaceC8259m0 = this.f16116q;
                                    if (!interfaceC8259m0.mo3637h(m3598n).isEmpty()) {
                                        interfaceC8259m0.mo3642c(m3508n(i5));
                                        throw null;
                                    }
                                }
                            }
                        } else if (m3502t(i6, i5, t) && !m3507o(i5).mo3492c(C8271p1.m3598n(m3515M & 1048575, t))) {
                            return false;
                        }
                    }
                    List list = (List) C8271p1.m3598n(m3515M & 1048575, t);
                    if (!list.isEmpty()) {
                        InterfaceC8219f1 m3507o = m3507o(i5);
                        int i10 = 0;
                        while (true) {
                            if (i10 >= list.size()) {
                                break;
                            } else if (!m3507o.mo3492c(list.get(i10))) {
                                z3 = false;
                                break;
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (!z3) {
                        return false;
                    }
                } else {
                    if (z4) {
                        z3 = m3503s(i5, t);
                    } else if ((i & i4) == 0) {
                        z3 = false;
                    }
                    if (z3 && !m3507o(i5).mo3492c(C8271p1.m3598n(m3515M & 1048575, t))) {
                        return false;
                    }
                }
                i3++;
            } else if (this.f16105f && !this.f16115p.mo3553c(t).m3533j()) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019c, code lost:
        if (java.lang.Float.floatToIntBits(com.google.crypto.tink.shaded.protobuf.C8271p1.m3601k(r7, r11)) == java.lang.Float.floatToIntBits(com.google.crypto.tink.shaded.protobuf.C8271p1.m3601k(r7, r12))) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b7, code lost:
        if (java.lang.Double.doubleToLongBits(com.google.crypto.tink.shaded.protobuf.C8271p1.m3602j(r7, r11)) == java.lang.Double.doubleToLongBits(com.google.crypto.tink.shaded.protobuf.C8271p1.m3602j(r7, r12))) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C8222g1.m3872C(com.google.crypto.tink.shaded.protobuf.C8271p1.m3598n(r7, r11), com.google.crypto.tink.shaded.protobuf.C8271p1.m3598n(r7, r12)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C8222g1.m3872C(com.google.crypto.tink.shaded.protobuf.C8271p1.m3598n(r7, r11), com.google.crypto.tink.shaded.protobuf.C8271p1.m3598n(r7, r12)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C8271p1.m3599m(r7, r11) == com.google.crypto.tink.shaded.protobuf.C8271p1.m3599m(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C8271p1.m3600l(r7, r11) == com.google.crypto.tink.shaded.protobuf.C8271p1.m3600l(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C8271p1.m3599m(r7, r11) == com.google.crypto.tink.shaded.protobuf.C8271p1.m3599m(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C8271p1.m3600l(r7, r11) == com.google.crypto.tink.shaded.protobuf.C8271p1.m3600l(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C8271p1.m3600l(r7, r11) == com.google.crypto.tink.shaded.protobuf.C8271p1.m3600l(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C8271p1.m3600l(r7, r11) == com.google.crypto.tink.shaded.protobuf.C8271p1.m3600l(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e7, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C8222g1.m3872C(com.google.crypto.tink.shaded.protobuf.C8271p1.m3598n(r7, r11), com.google.crypto.tink.shaded.protobuf.C8271p1.m3598n(r7, r12)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fd, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C8222g1.m3872C(com.google.crypto.tink.shaded.protobuf.C8271p1.m3598n(r7, r11), com.google.crypto.tink.shaded.protobuf.C8271p1.m3598n(r7, r12)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0113, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C8222g1.m3872C(com.google.crypto.tink.shaded.protobuf.C8271p1.m3598n(r7, r11), com.google.crypto.tink.shaded.protobuf.C8271p1.m3598n(r7, r12)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0125, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C8271p1.m3606f(r7, r11) == com.google.crypto.tink.shaded.protobuf.C8271p1.m3606f(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0137, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C8271p1.m3600l(r7, r11) == com.google.crypto.tink.shaded.protobuf.C8271p1.m3600l(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014b, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C8271p1.m3599m(r7, r11) == com.google.crypto.tink.shaded.protobuf.C8271p1.m3599m(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015d, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C8271p1.m3600l(r7, r11) == com.google.crypto.tink.shaded.protobuf.C8271p1.m3600l(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0170, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C8271p1.m3599m(r7, r11) == com.google.crypto.tink.shaded.protobuf.C8271p1.m3599m(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0183, code lost:
        if (com.google.crypto.tink.shaded.protobuf.C8271p1.m3599m(r7, r11) == com.google.crypto.tink.shaded.protobuf.C8271p1.m3599m(r7, r12)) goto L87;
     */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo3491d(T r11, T r12) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8301u0.mo3491d(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: e */
    public final int mo3490e(T t) {
        return this.f16107h ? m3504r(t) : m3505q(t);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: f */
    public final T mo3489f() {
        return (T) this.f16112m.mo3479a(this.f16104e);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00dd, code lost:
        if (r4 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ef, code lost:
        if (r4 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f1, code lost:
        r4 = r4.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f6, code lost:
        r4 = 37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f8, code lost:
        r3 = (r3 * 53) + r4;
     */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo3488g(T r10) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8301u0.mo3488g(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04c8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x032c  */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo3487h(java.lang.Object r18, com.google.crypto.tink.shaded.protobuf.C8258m r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8301u0.mo3487h(java.lang.Object, com.google.crypto.tink.shaded.protobuf.m):void");
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: i */
    public final void mo3486i(T t, byte[] bArr, int i, int i2, C8213e.C8214a c8214a) throws IOException {
        if (this.f16107h) {
            m3525C(t, bArr, i, i2, c8214a);
        } else {
            m3526B(t, bArr, i, i2, 0, c8214a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x03e3 A[Catch: all -> 0x03fe, TryCatch #5 {all -> 0x03fe, blocks: (B:25:0x0051, B:32:0x0066, B:159:0x03cb, B:165:0x03de, B:167:0x03e3, B:168:0x03e8), top: B:193:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0405 A[LOOP:3: B:180:0x0403->B:181:0x0405, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03ee A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0016 A[SYNTHETIC] */
    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC8219f1
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo3485j(T r20, com.google.crypto.tink.shaded.protobuf.InterfaceC8216e1 r21, com.google.crypto.tink.shaded.protobuf.C8277q r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8301u0.mo3485j(java.lang.Object, com.google.crypto.tink.shaded.protobuf.e1, com.google.crypto.tink.shaded.protobuf.q):void");
    }

    /* renamed from: k */
    public final boolean m3511k(int i, Object obj, Object obj2) {
        return m3503s(i, obj) == m3503s(i, obj2);
    }

    /* renamed from: l */
    public final void m3510l(Object obj, int i, Object obj2, AbstractC8257l1 abstractC8257l1) {
        C8196a0.InterfaceC8198b m3509m;
        int i2 = this.f16100a[i];
        Object m3598n = C8271p1.m3598n(m3515M(i) & 1048575, obj);
        if (m3598n == null || (m3509m = m3509m(i)) == null) {
            return;
        }
        InterfaceC8259m0 interfaceC8259m0 = this.f16116q;
        C8256l0 mo3640e = interfaceC8259m0.mo3640e(m3598n);
        interfaceC8259m0.mo3642c(m3508n(i));
        for (Map.Entry entry : mo3640e.entrySet()) {
            ((Integer) entry.getValue()).intValue();
            if (!m3509m.m3931a()) {
                if (obj2 == null) {
                    abstractC8257l1.mo3625m();
                }
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    /* renamed from: m */
    public final C8196a0.InterfaceC8198b m3509m(int i) {
        return (C8196a0.InterfaceC8198b) this.f16101b[((i / 3) * 2) + 1];
    }

    /* renamed from: n */
    public final Object m3508n(int i) {
        return this.f16101b[(i / 3) * 2];
    }

    /* renamed from: o */
    public final InterfaceC8219f1 m3507o(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f16101b;
        InterfaceC8219f1 interfaceC8219f1 = (InterfaceC8219f1) objArr[i2];
        if (interfaceC8219f1 != null) {
            return interfaceC8219f1;
        }
        InterfaceC8219f1<T> m3924a = C8204b1.f15952c.m3924a((Class) objArr[i2 + 1]);
        objArr[i2] = m3924a;
        return m3924a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x019d, code lost:
        if (r13 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ad, code lost:
        if (r13 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bd, code lost:
        if (r13 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01cd, code lost:
        if (r13 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01dc, code lost:
        if (r13 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01eb, code lost:
        if (r13 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01fa, code lost:
        if (r13 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0209, code lost:
        if (r13 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0218, code lost:
        if (r13 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0227, code lost:
        if (r13 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0229, code lost:
        r14.putInt(r19, r7, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x022d, code lost:
        r5 = ((com.google.crypto.tink.shaded.protobuf.AbstractC8253l.m3697v(r3) + com.google.crypto.tink.shaded.protobuf.AbstractC8253l.m3699t(r9)) + r3) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0356, code lost:
        if ((r3 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC8228i) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0358, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.AbstractC8253l.m3716c(r9, (com.google.crypto.tink.shaded.protobuf.AbstractC8228i) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x035f, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.AbstractC8253l.m3701r(r9, (java.lang.String) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0365, code lost:
        r5 = r3 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c5, code lost:
        if ((r3 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC8228i) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015d, code lost:
        if (r13 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x016d, code lost:
        if (r13 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x017d, code lost:
        if (r13 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x018d, code lost:
        if (r13 != false) goto L105;
     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m3505q(T r19) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8301u0.m3505q(java.lang.Object):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0186, code lost:
        if (r4 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0195, code lost:
        if (r4 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01a4, code lost:
        if (r4 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01b3, code lost:
        if (r4 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01c2, code lost:
        if (r4 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01d1, code lost:
        if (r4 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01e0, code lost:
        if (r4 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01e2, code lost:
        r7.putInt(r11, r3, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01e6, code lost:
        r2 = r2 + ((com.google.crypto.tink.shaded.protobuf.AbstractC8253l.m3697v(r5) + com.google.crypto.tink.shaded.protobuf.AbstractC8253l.m3699t(r6)) + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0319, code lost:
        if ((r3 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC8228i) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x031b, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.AbstractC8253l.m3716c(r6, (com.google.crypto.tink.shaded.protobuf.AbstractC8228i) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0322, code lost:
        r3 = com.google.crypto.tink.shaded.protobuf.AbstractC8253l.m3701r(r6, (java.lang.String) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0328, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
        if ((r3 instanceof com.google.crypto.tink.shaded.protobuf.AbstractC8228i) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0116, code lost:
        if (r4 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0126, code lost:
        if (r4 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0136, code lost:
        if (r4 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0146, code lost:
        if (r4 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0156, code lost:
        if (r4 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0166, code lost:
        if (r4 != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0176, code lost:
        if (r4 != false) goto L105;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m3504r(T r11) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C8301u0.m3504r(java.lang.Object):int");
    }

    /* renamed from: s */
    public final boolean m3503s(int i, Object obj) {
        int i2;
        boolean equals;
        if (this.f16107h) {
            int m3515M = m3515M(i);
            long j = m3515M & 1048575;
            switch ((m3515M & 267386880) >>> 20) {
                case 0:
                    if (C8271p1.m3602j(j, obj) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (C8271p1.m3601k(j, obj) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C8271p1.m3599m(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C8271p1.m3599m(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C8271p1.m3600l(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C8271p1.m3599m(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C8271p1.m3600l(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C8271p1.m3606f(j, obj);
                case 8:
                    Object m3598n = C8271p1.m3598n(j, obj);
                    if (m3598n instanceof String) {
                        equals = ((String) m3598n).isEmpty();
                        break;
                    } else if (m3598n instanceof AbstractC8228i) {
                        equals = AbstractC8228i.f15998b.equals(m3598n);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (C8271p1.m3598n(j, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    equals = AbstractC8228i.f15998b.equals(C8271p1.m3598n(j, obj));
                    break;
                case 11:
                    if (C8271p1.m3600l(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C8271p1.m3600l(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (C8271p1.m3600l(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C8271p1.m3599m(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C8271p1.m3600l(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (C8271p1.m3599m(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C8271p1.m3598n(j, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        if ((C8271p1.m3600l(i2 & 1048575, obj) & (1 << (this.f16100a[i + 2] >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    public final boolean m3502t(int i, int i2, Object obj) {
        if (C8271p1.m3600l(this.f16100a[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    public final <K, V> void m3500v(Object obj, int i, Object obj2, C8277q c8277q, InterfaceC8216e1 interfaceC8216e1) throws IOException {
        long m3515M = m3515M(i) & 1048575;
        Object m3598n = C8271p1.m3598n(m3515M, obj);
        InterfaceC8259m0 interfaceC8259m0 = this.f16116q;
        if (m3598n == null) {
            m3598n = interfaceC8259m0.mo3641d();
            C8271p1.m3588x(obj, m3515M, m3598n);
        } else if (interfaceC8259m0.mo3638g(m3598n)) {
            C8256l0 mo3641d = interfaceC8259m0.mo3641d();
            interfaceC8259m0.mo3644a(mo3641d, m3598n);
            C8271p1.m3588x(obj, m3515M, mo3641d);
            m3598n = mo3641d;
        }
        interfaceC8259m0.mo3640e(m3598n);
        interfaceC8259m0.mo3642c(obj2);
        interfaceC8216e1.mo3754K();
    }

    /* renamed from: z */
    public final void m3496z(Object obj, byte[] bArr, int i, int i2, int i3, long j, C8213e.C8214a c8214a) throws IOException {
        Object m3508n = m3508n(i3);
        Unsafe unsafe = f16099s;
        Object object = unsafe.getObject(obj, j);
        InterfaceC8259m0 interfaceC8259m0 = this.f16116q;
        if (interfaceC8259m0.mo3638g(object)) {
            C8256l0 mo3641d = interfaceC8259m0.mo3641d();
            interfaceC8259m0.mo3644a(mo3641d, object);
            unsafe.putObject(obj, j, mo3641d);
            object = mo3641d;
        }
        interfaceC8259m0.mo3642c(m3508n);
        interfaceC8259m0.mo3640e(object);
        int m3909H = C8213e.m3909H(bArr, i, c8214a);
        int i4 = c8214a.f15979a;
        if (i4 >= 0 && i4 <= i2 - m3909H) {
            throw null;
        }
        throw C8202b0.m3925f();
    }
}
