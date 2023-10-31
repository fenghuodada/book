package androidx.datastore.preferences.protobuf;

import androidx.activity.result.C0063d;
import androidx.datastore.preferences.protobuf.AbstractC1183i;
import androidx.datastore.preferences.protobuf.AbstractC1214m;
import androidx.datastore.preferences.protobuf.C1157b0;
import androidx.datastore.preferences.protobuf.C1211l0;
import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: androidx.datastore.preferences.protobuf.v0 */
/* loaded from: classes.dex */
public final class C1265v0<T> implements InterfaceC1182h1<T> {

    /* renamed from: r */
    public static final int[] f3099r = new int[0];

    /* renamed from: s */
    public static final Unsafe f3100s = C1242s1.m10822o();

    /* renamed from: a */
    public final int[] f3101a;

    /* renamed from: b */
    public final Object[] f3102b;

    /* renamed from: c */
    public final int f3103c;

    /* renamed from: d */
    public final int f3104d;

    /* renamed from: e */
    public final InterfaceC1240s0 f3105e;

    /* renamed from: f */
    public final boolean f3106f;

    /* renamed from: g */
    public final boolean f3107g;

    /* renamed from: h */
    public final boolean f3108h;

    /* renamed from: i */
    public final boolean f3109i;

    /* renamed from: j */
    public final int[] f3110j;

    /* renamed from: k */
    public final int f3111k;

    /* renamed from: l */
    public final int f3112l;

    /* renamed from: m */
    public final InterfaceC1270x0 f3113m;

    /* renamed from: n */
    public final AbstractC1190i0 f3114n;

    /* renamed from: o */
    public final AbstractC1226o1<?, ?> f3115o;

    /* renamed from: p */
    public final AbstractC1239s<?> f3116p;

    /* renamed from: q */
    public final InterfaceC1222n0 f3117q;

    public C1265v0(int[] iArr, Object[] objArr, int i, int i2, InterfaceC1240s0 interfaceC1240s0, boolean z, int[] iArr2, int i3, int i4, InterfaceC1270x0 interfaceC1270x0, AbstractC1190i0 abstractC1190i0, AbstractC1226o1 abstractC1226o1, AbstractC1239s abstractC1239s, InterfaceC1222n0 interfaceC1222n0) {
        this.f3101a = iArr;
        this.f3102b = objArr;
        this.f3103c = i;
        this.f3104d = i2;
        this.f3107g = interfaceC1240s0 instanceof AbstractC1273z;
        this.f3108h = z;
        this.f3106f = abstractC1239s != null && abstractC1239s.mo10793e(interfaceC1240s0);
        this.f3109i = false;
        this.f3110j = iArr2;
        this.f3111k = i3;
        this.f3112l = i4;
        this.f3113m = interfaceC1270x0;
        this.f3114n = abstractC1190i0;
        this.f3115o = abstractC1226o1;
        this.f3116p = abstractC1239s;
        this.f3105e = interfaceC1240s0;
        this.f3117q = interfaceC1222n0;
    }

    /* renamed from: C */
    public static Field m10756C(Class<?> cls, String str) {
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

    /* renamed from: I */
    public static void m10750I(int i, Object obj, C1221n c1221n) throws IOException {
        if (obj instanceof String) {
            c1221n.f3057a.mo10911O(i, (String) obj);
            return;
        }
        c1221n.m10894b(i, (AbstractC1183i) obj);
    }

    /* renamed from: s */
    public static List m10740s(long j, Object obj) {
        return (List) C1242s1.m10823n(j, obj);
    }

    /* renamed from: u */
    public static <T> C1265v0<T> m10738u(C1176f1 c1176f1, InterfaceC1270x0 interfaceC1270x0, AbstractC1190i0 abstractC1190i0, AbstractC1226o1<?, ?> abstractC1226o1, AbstractC1239s<?> abstractC1239s, InterfaceC1222n0 interfaceC1222n0) {
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
        Field m10756C;
        char charAt11;
        int i27;
        int i28;
        int i29;
        Field m10756C2;
        Field m10756C3;
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
        boolean z = c1176f1.mo10861c() == 2;
        String m11122e = c1176f1.m11122e();
        int length = m11122e.length();
        int charAt17 = m11122e.charAt(0);
        if (charAt17 >= 55296) {
            int i35 = charAt17 & 8191;
            int i36 = 1;
            int i37 = 13;
            while (true) {
                i = i36 + 1;
                charAt16 = m11122e.charAt(i36);
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
        int charAt18 = m11122e.charAt(i);
        if (charAt18 >= 55296) {
            int i39 = charAt18 & 8191;
            int i40 = 13;
            while (true) {
                i33 = i38 + 1;
                charAt15 = m11122e.charAt(i38);
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
            iArr = f3099r;
            i4 = 0;
        } else {
            int i41 = i38 + 1;
            int charAt19 = m11122e.charAt(i38);
            if (charAt19 >= 55296) {
                int i42 = charAt19 & 8191;
                int i43 = 13;
                while (true) {
                    i14 = i41 + 1;
                    charAt10 = m11122e.charAt(i41);
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
            int charAt20 = m11122e.charAt(i41);
            if (charAt20 >= 55296) {
                int i45 = charAt20 & 8191;
                int i46 = 13;
                while (true) {
                    i13 = i44 + 1;
                    charAt9 = m11122e.charAt(i44);
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
            int charAt21 = m11122e.charAt(i44);
            if (charAt21 >= 55296) {
                int i48 = charAt21 & 8191;
                int i49 = 13;
                while (true) {
                    i12 = i47 + 1;
                    charAt8 = m11122e.charAt(i47);
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
            charAt = m11122e.charAt(i47);
            if (charAt >= 55296) {
                int i51 = charAt & 8191;
                int i52 = 13;
                while (true) {
                    i11 = i50 + 1;
                    charAt7 = m11122e.charAt(i50);
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
            int charAt22 = m11122e.charAt(i50);
            if (charAt22 >= 55296) {
                int i54 = charAt22 & 8191;
                int i55 = 13;
                while (true) {
                    i10 = i53 + 1;
                    charAt6 = m11122e.charAt(i53);
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
            charAt2 = m11122e.charAt(i53);
            if (charAt2 >= 55296) {
                int i57 = charAt2 & 8191;
                int i58 = 13;
                while (true) {
                    i9 = i56 + 1;
                    charAt5 = m11122e.charAt(i56);
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
            int charAt23 = m11122e.charAt(i56);
            if (charAt23 >= 55296) {
                int i60 = charAt23 & 8191;
                int i61 = i59;
                int i62 = 13;
                while (true) {
                    i8 = i61 + 1;
                    charAt4 = m11122e.charAt(i61);
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
            int charAt24 = m11122e.charAt(i2);
            if (charAt24 >= 55296) {
                int i64 = charAt24 & 8191;
                int i65 = i63;
                int i66 = 13;
                while (true) {
                    i7 = i65 + 1;
                    charAt3 = m11122e.charAt(i65);
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
        Object[] m11123d = c1176f1.m11123d();
        Class<?> cls2 = c1176f1.mo10862b().getClass();
        int[] iArr2 = new int[i4 * 3];
        Object[] objArr = new Object[i4 * 2];
        int i68 = charAt2 + i5;
        int i69 = i5;
        int i70 = i68;
        int i71 = 0;
        int i72 = 0;
        while (i38 < length) {
            int i73 = i38 + 1;
            int charAt25 = m11122e.charAt(i38);
            if (charAt25 >= 55296) {
                int i74 = charAt25 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i32 = i75 + 1;
                    charAt14 = m11122e.charAt(i75);
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
            int charAt26 = m11122e.charAt(i16);
            if (charAt26 >= 55296) {
                int i78 = charAt26 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i31 = i79 + 1;
                    charAt13 = m11122e.charAt(i79);
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
            Unsafe unsafe = f3100s;
            if (i81 >= 51) {
                int i83 = i18 + 1;
                int charAt27 = m11122e.charAt(i18);
                if (charAt27 >= 55296) {
                    int i84 = charAt27 & 8191;
                    int i85 = i83;
                    int i86 = 13;
                    while (true) {
                        i30 = i85 + 1;
                        charAt12 = m11122e.charAt(i85);
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
                    objArr[((i71 / 3) * 2) + 1] = m11123d[i3];
                    i3++;
                } else {
                    if (i87 == 12 && (charAt17 & 1) == 1) {
                        objArr[((i71 / 3) * 2) + 1] = m11123d[i3];
                        i3++;
                    }
                    i29 = 2;
                }
                int i89 = charAt27 * i29;
                Object obj = m11123d[i89];
                if (obj instanceof Field) {
                    m10756C2 = (Field) obj;
                } else {
                    m10756C2 = m10756C(cls2, (String) obj);
                    m11123d[i89] = m10756C2;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(m10756C2);
                int i90 = i89 + 1;
                Object obj2 = m11123d[i90];
                if (obj2 instanceof Field) {
                    m10756C3 = (Field) obj2;
                } else {
                    m10756C3 = m10756C(cls2, (String) obj2);
                    m11123d[i90] = m10756C3;
                }
                str = m11122e;
                cls = cls2;
                i23 = (int) unsafe.objectFieldOffset(m10756C3);
                i25 = i3;
                i26 = objectFieldOffset2;
                i24 = 0;
                i20 = i6;
                i21 = charAt25;
                i38 = i88;
            } else {
                i19 = charAt;
                int i91 = i3 + 1;
                Field m10756C4 = m10756C(cls2, (String) m11123d[i3]);
                if (i81 == 9 || i81 == 17) {
                    i20 = i6;
                    objArr[((i71 / 3) * 2) + 1] = m10756C4.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        i20 = i6;
                        i27 = i91 + 1;
                        objArr[((i71 / 3) * 2) + 1] = m11123d[i91];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        i20 = i6;
                        if ((charAt17 & 1) == 1) {
                            i27 = i91 + 1;
                            objArr[((i71 / 3) * 2) + 1] = m11123d[i91];
                        }
                    } else {
                        if (i81 == 50) {
                            int i92 = i69 + 1;
                            iArr[i69] = i71;
                            int i93 = (i71 / 3) * 2;
                            int i94 = i91 + 1;
                            objArr[i93] = m11123d[i91];
                            if ((charAt26 & 2048) != 0) {
                                i91 = i94 + 1;
                                objArr[i93 + 1] = m11123d[i94];
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(m10756C4);
                    if ((charAt17 & 1) == 1 || i81 > 17) {
                        str = m11122e;
                        cls = cls2;
                        i22 = i18;
                        i23 = 0;
                        i24 = 0;
                    } else {
                        int i95 = i18 + 1;
                        int charAt28 = m11122e.charAt(i18);
                        if (charAt28 >= 55296) {
                            int i96 = charAt28 & 8191;
                            int i97 = 13;
                            while (true) {
                                i22 = i95 + 1;
                                charAt11 = m11122e.charAt(i95);
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
                        Object obj3 = m11123d[i98];
                        if (obj3 instanceof Field) {
                            m10756C = (Field) obj3;
                        } else {
                            m10756C = m10756C(cls2, (String) obj3);
                            m11123d[i98] = m10756C;
                        }
                        str = m11122e;
                        cls = cls2;
                        i23 = (int) unsafe.objectFieldOffset(m10756C);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(m10756C4);
                if ((charAt17 & 1) == 1) {
                }
                str = m11122e;
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
            m11122e = str;
            i5 = i82;
            cls2 = cls;
            i6 = i20;
            length = i15;
            i68 = i17;
            z = z2;
            charAt = i19;
        }
        return new C1265v0<>(iArr2, objArr, i6, charAt, c1176f1.mo10862b(), z, iArr, i5, i68, interfaceC1270x0, abstractC1190i0, abstractC1226o1, abstractC1239s, interfaceC1222n0);
    }

    /* renamed from: v */
    public static int m10737v(long j, Object obj) {
        return ((Integer) C1242s1.m10823n(j, obj)).intValue();
    }

    /* renamed from: w */
    public static long m10736w(long j, Object obj) {
        return ((Long) C1242s1.m10823n(j, obj)).longValue();
    }

    /* renamed from: A */
    public final void m10758A(Object obj, int i, InterfaceC1179g1 interfaceC1179g1) throws IOException {
        long j;
        Object mo10958z;
        if ((536870912 & i) != 0) {
            j = i & 1048575;
            mo10958z = interfaceC1179g1.mo10998H();
        } else {
            int i2 = i & 1048575;
            if (this.f3107g) {
                j = i2;
                mo10958z = interfaceC1179g1.mo10962v();
            } else {
                j = i2;
                mo10958z = interfaceC1179g1.mo10958z();
            }
        }
        C1242s1.m10816u(obj, j, mo10958z);
    }

    /* renamed from: B */
    public final void m10757B(Object obj, int i, InterfaceC1179g1 interfaceC1179g1) throws IOException {
        boolean z = (536870912 & i) != 0;
        AbstractC1190i0 abstractC1190i0 = this.f3114n;
        int i2 = i & 1048575;
        if (z) {
            interfaceC1179g1.mo10959y(abstractC1190i0.mo11108c(i2, obj));
        } else {
            interfaceC1179g1.mo10960x(abstractC1190i0.mo11108c(i2, obj));
        }
    }

    /* renamed from: D */
    public final void m10755D(int i, Object obj) {
        if (this.f3108h) {
            return;
        }
        int i2 = this.f3101a[i + 2];
        long j = i2 & 1048575;
        C1242s1.m10818s(obj, C1242s1.m10825l(j, obj) | (1 << (i2 >>> 20)), j);
    }

    /* renamed from: E */
    public final void m10754E(int i, int i2, Object obj) {
        C1242s1.m10818s(obj, i, this.f3101a[i2 + 2] & 1048575);
    }

    /* renamed from: F */
    public final int m10753F(int i) {
        return this.f3101a[i + 1];
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
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m10752G(java.lang.Object r21, androidx.datastore.preferences.protobuf.C1221n r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1265v0.m10752G(java.lang.Object, androidx.datastore.preferences.protobuf.n):void");
    }

    /* renamed from: H */
    public final void m10751H(C1221n c1221n, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            Object m10746m = m10746m(i2);
            InterfaceC1222n0 interfaceC1222n0 = this.f3117q;
            C1211l0.C1212a<?, ?> mo10873c = interfaceC1222n0.mo10873c(m10746m);
            C1219m0 mo10868h = interfaceC1222n0.mo10868h(obj);
            AbstractC1214m abstractC1214m = c1221n.f3057a;
            abstractC1214m.getClass();
            for (Map.Entry entry : mo10868h.entrySet()) {
                abstractC1214m.mo10909Q(i, 2);
                abstractC1214m.mo10907S(C1211l0.m10957a(mo10873c, entry.getKey(), entry.getValue()));
                C1211l0.m10956b(abstractC1214m, mo10873c, entry.getKey(), entry.getValue());
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: a */
    public final void mo10731a(T t, T t2) {
        t2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f3101a;
            if (i < iArr.length) {
                int m10753F = m10753F(i);
                long j = m10753F & 1048575;
                int i2 = iArr[i];
                switch ((m10753F & 267386880) >>> 20) {
                    case 0:
                        if (!m10742q(i, t2)) {
                            break;
                        } else {
                            C1242s1.f3080d.mo10802m(t, j, C1242s1.m10827j(j, t2));
                            m10755D(i, t);
                            break;
                        }
                    case 1:
                        if (!m10742q(i, t2)) {
                            break;
                        } else {
                            C1242s1.f3080d.mo10801n(t, j, C1242s1.m10826k(j, t2));
                            m10755D(i, t);
                            break;
                        }
                    case 2:
                        if (!m10742q(i, t2)) {
                            break;
                        }
                        C1242s1.m10817t(t, j, C1242s1.m10824m(j, t2));
                        m10755D(i, t);
                        break;
                    case 3:
                        if (!m10742q(i, t2)) {
                            break;
                        }
                        C1242s1.m10817t(t, j, C1242s1.m10824m(j, t2));
                        m10755D(i, t);
                        break;
                    case 4:
                        if (!m10742q(i, t2)) {
                            break;
                        }
                        C1242s1.m10818s(t, C1242s1.m10825l(j, t2), j);
                        m10755D(i, t);
                        break;
                    case 5:
                        if (!m10742q(i, t2)) {
                            break;
                        }
                        C1242s1.m10817t(t, j, C1242s1.m10824m(j, t2));
                        m10755D(i, t);
                        break;
                    case 6:
                        if (!m10742q(i, t2)) {
                            break;
                        }
                        C1242s1.m10818s(t, C1242s1.m10825l(j, t2), j);
                        m10755D(i, t);
                        break;
                    case 7:
                        if (!m10742q(i, t2)) {
                            break;
                        } else {
                            C1242s1.f3080d.mo10804k(t, j, C1242s1.m10831f(j, t2));
                            m10755D(i, t);
                            break;
                        }
                    case 8:
                        if (!m10742q(i, t2)) {
                            break;
                        }
                        C1242s1.m10816u(t, j, C1242s1.m10823n(j, t2));
                        m10755D(i, t);
                        break;
                    case 9:
                    case 17:
                        long m10753F2 = m10753F(i) & 1048575;
                        if (!m10742q(i, t2)) {
                            break;
                        } else {
                            Object m10823n = C1242s1.m10823n(m10753F2, t);
                            Object m10823n2 = C1242s1.m10823n(m10753F2, t2);
                            if (m10823n != null && m10823n2 != null) {
                                m10823n2 = C1157b0.m11144c(m10823n, m10823n2);
                            } else if (m10823n2 == null) {
                                break;
                            }
                            C1242s1.m10816u(t, m10753F2, m10823n2);
                            m10755D(i, t);
                            break;
                        }
                    case 10:
                        if (!m10742q(i, t2)) {
                            break;
                        }
                        C1242s1.m10816u(t, j, C1242s1.m10823n(j, t2));
                        m10755D(i, t);
                        break;
                    case 11:
                        if (!m10742q(i, t2)) {
                            break;
                        }
                        C1242s1.m10818s(t, C1242s1.m10825l(j, t2), j);
                        m10755D(i, t);
                        break;
                    case 12:
                        if (!m10742q(i, t2)) {
                            break;
                        }
                        C1242s1.m10818s(t, C1242s1.m10825l(j, t2), j);
                        m10755D(i, t);
                        break;
                    case 13:
                        if (!m10742q(i, t2)) {
                            break;
                        }
                        C1242s1.m10818s(t, C1242s1.m10825l(j, t2), j);
                        m10755D(i, t);
                        break;
                    case 14:
                        if (!m10742q(i, t2)) {
                            break;
                        }
                        C1242s1.m10817t(t, j, C1242s1.m10824m(j, t2));
                        m10755D(i, t);
                        break;
                    case 15:
                        if (!m10742q(i, t2)) {
                            break;
                        }
                        C1242s1.m10818s(t, C1242s1.m10825l(j, t2), j);
                        m10755D(i, t);
                        break;
                    case 16:
                        if (!m10742q(i, t2)) {
                            break;
                        }
                        C1242s1.m10817t(t, j, C1242s1.m10824m(j, t2));
                        m10755D(i, t);
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
                        this.f3114n.mo11109b(t, j, t2);
                        break;
                    case 50:
                        Class<?> cls = C1193i1.f2989a;
                        C1242s1.m10816u(t, j, this.f3117q.mo10875a(C1242s1.m10823n(j, t), C1242s1.m10823n(j, t2)));
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
                        if (!m10741r(i2, i, t2)) {
                            break;
                        }
                        C1242s1.m10816u(t, j, C1242s1.m10823n(j, t2));
                        m10754E(i2, i, t);
                        break;
                    case 60:
                    case 68:
                        int m10753F3 = m10753F(i);
                        int i3 = iArr[i];
                        long j2 = m10753F3 & 1048575;
                        if (!m10741r(i3, i, t2)) {
                            break;
                        } else {
                            Object m10823n3 = C1242s1.m10823n(j2, t);
                            Object m10823n4 = C1242s1.m10823n(j2, t2);
                            if (m10823n3 != null && m10823n4 != null) {
                                m10823n4 = C1157b0.m11144c(m10823n3, m10823n4);
                            } else if (m10823n4 == null) {
                                break;
                            }
                            C1242s1.m10816u(t, j2, m10823n4);
                            m10754E(i3, i, t);
                            break;
                        }
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!m10741r(i2, i, t2)) {
                            break;
                        }
                        C1242s1.m10816u(t, j, C1242s1.m10823n(j, t2));
                        m10754E(i2, i, t);
                        break;
                }
                i += 3;
            } else if (!this.f3108h) {
                Class<?> cls2 = C1193i1.f2989a;
                AbstractC1226o1<?, ?> abstractC1226o1 = this.f3115o;
                abstractC1226o1.mo10847o(t, abstractC1226o1.mo10850k(abstractC1226o1.mo10854g(t), abstractC1226o1.mo10854g(t2)));
                if (this.f3106f) {
                    C1193i1.m11107A(this.f3116p, t, t2);
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: b */
    public final void mo10730b(T t) {
        int[] iArr;
        int i;
        int i2 = this.f3111k;
        while (true) {
            iArr = this.f3110j;
            i = this.f3112l;
            if (i2 >= i) {
                break;
            }
            long m10753F = m10753F(iArr[i2]) & 1048575;
            Object m10823n = C1242s1.m10823n(m10753F, t);
            if (m10823n != null) {
                C1242s1.m10816u(t, m10753F, this.f3117q.mo10874b(m10823n));
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.f3114n.mo11110a(iArr[i], t);
            i++;
        }
        this.f3115o.mo10851j(t);
        if (this.f3106f) {
            this.f3116p.mo10792f(t);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.datastore.preferences.protobuf.h1] */
    /* JADX WARN: Type inference failed for: r4v5, types: [androidx.datastore.preferences.protobuf.h1] */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.h1] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19, types: [androidx.datastore.preferences.protobuf.h1] */
    /* JADX WARN: Type inference failed for: r6v25 */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: c */
    public final boolean mo10729c(T t) {
        int i;
        boolean z;
        boolean z2;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z3 = true;
            if (i3 < this.f3111k) {
                int i5 = this.f3110j[i3];
                int[] iArr = this.f3101a;
                int i6 = iArr[i5];
                int m10753F = m10753F(i5);
                boolean z4 = this.f3108h;
                if (!z4) {
                    int i7 = iArr[i5 + 2];
                    int i8 = i7 & 1048575;
                    i = 1 << (i7 >>> 20);
                    if (i8 != i2) {
                        i4 = f3100s.getInt(t, i8);
                        i2 = i8;
                    }
                } else {
                    i = 0;
                }
                if ((268435456 & m10753F) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (z4) {
                        z2 = m10742q(i5, t);
                    } else if ((i4 & i) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        return false;
                    }
                }
                int i9 = (267386880 & m10753F) >>> 20;
                if (i9 != 9 && i9 != 17) {
                    if (i9 != 27) {
                        if (i9 != 60 && i9 != 68) {
                            if (i9 != 49) {
                                if (i9 != 50) {
                                    continue;
                                } else {
                                    Object m10823n = C1242s1.m10823n(m10753F & 1048575, t);
                                    InterfaceC1222n0 interfaceC1222n0 = this.f3117q;
                                    C1219m0 mo10868h = interfaceC1222n0.mo10868h(m10823n);
                                    if (!mo10868h.isEmpty() && interfaceC1222n0.mo10873c(m10746m(i5)).f3043c.f3093a == EnumC1266v1.MESSAGE) {
                                        Iterator it = mo10868h.values().iterator();
                                        InterfaceC1182h1<T> interfaceC1182h1 = 0;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Object next = it.next();
                                            if (interfaceC1182h1 == null) {
                                                interfaceC1182h1 = C1168d1.f2962c.m11132a(next.getClass());
                                            }
                                            boolean mo10729c = interfaceC1182h1.mo10729c(next);
                                            interfaceC1182h1 = interfaceC1182h1;
                                            if (!mo10729c) {
                                                z3 = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z3) {
                                        return false;
                                    }
                                }
                            }
                        } else if (m10741r(i6, i5, t) && !m10745n(i5).mo10729c(C1242s1.m10823n(m10753F & 1048575, t))) {
                            return false;
                        }
                    }
                    List list = (List) C1242s1.m10823n(m10753F & 1048575, t);
                    if (!list.isEmpty()) {
                        ?? m10745n = m10745n(i5);
                        int i10 = 0;
                        while (true) {
                            if (i10 >= list.size()) {
                                break;
                            } else if (!m10745n.mo10729c(list.get(i10))) {
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
                        z3 = m10742q(i5, t);
                    } else if ((i & i4) == 0) {
                        z3 = false;
                    }
                    if (z3 && !m10745n(i5).mo10729c(C1242s1.m10823n(m10753F & 1048575, t))) {
                        return false;
                    }
                }
                i3++;
            } else if (this.f3106f && !this.f3116p.mo10795c(t).m10765j()) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019c, code lost:
        if (java.lang.Float.floatToIntBits(androidx.datastore.preferences.protobuf.C1242s1.m10826k(r7, r11)) == java.lang.Float.floatToIntBits(androidx.datastore.preferences.protobuf.C1242s1.m10826k(r7, r12))) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b7, code lost:
        if (java.lang.Double.doubleToLongBits(androidx.datastore.preferences.protobuf.C1242s1.m10827j(r7, r11)) == java.lang.Double.doubleToLongBits(androidx.datastore.preferences.protobuf.C1242s1.m10827j(r7, r12))) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
        if (androidx.datastore.preferences.protobuf.C1193i1.m11106B(androidx.datastore.preferences.protobuf.C1242s1.m10823n(r7, r11), androidx.datastore.preferences.protobuf.C1242s1.m10823n(r7, r12)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
        if (androidx.datastore.preferences.protobuf.C1193i1.m11106B(androidx.datastore.preferences.protobuf.C1242s1.m10823n(r7, r11), androidx.datastore.preferences.protobuf.C1242s1.m10823n(r7, r12)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0075, code lost:
        if (androidx.datastore.preferences.protobuf.C1242s1.m10824m(r7, r11) == androidx.datastore.preferences.protobuf.C1242s1.m10824m(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0087, code lost:
        if (androidx.datastore.preferences.protobuf.C1242s1.m10825l(r7, r11) == androidx.datastore.preferences.protobuf.C1242s1.m10825l(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009b, code lost:
        if (androidx.datastore.preferences.protobuf.C1242s1.m10824m(r7, r11) == androidx.datastore.preferences.protobuf.C1242s1.m10824m(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ad, code lost:
        if (androidx.datastore.preferences.protobuf.C1242s1.m10825l(r7, r11) == androidx.datastore.preferences.protobuf.C1242s1.m10825l(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bf, code lost:
        if (androidx.datastore.preferences.protobuf.C1242s1.m10825l(r7, r11) == androidx.datastore.preferences.protobuf.C1242s1.m10825l(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d1, code lost:
        if (androidx.datastore.preferences.protobuf.C1242s1.m10825l(r7, r11) == androidx.datastore.preferences.protobuf.C1242s1.m10825l(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e7, code lost:
        if (androidx.datastore.preferences.protobuf.C1193i1.m11106B(androidx.datastore.preferences.protobuf.C1242s1.m10823n(r7, r11), androidx.datastore.preferences.protobuf.C1242s1.m10823n(r7, r12)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00fd, code lost:
        if (androidx.datastore.preferences.protobuf.C1193i1.m11106B(androidx.datastore.preferences.protobuf.C1242s1.m10823n(r7, r11), androidx.datastore.preferences.protobuf.C1242s1.m10823n(r7, r12)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0113, code lost:
        if (androidx.datastore.preferences.protobuf.C1193i1.m11106B(androidx.datastore.preferences.protobuf.C1242s1.m10823n(r7, r11), androidx.datastore.preferences.protobuf.C1242s1.m10823n(r7, r12)) != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0125, code lost:
        if (androidx.datastore.preferences.protobuf.C1242s1.m10831f(r7, r11) == androidx.datastore.preferences.protobuf.C1242s1.m10831f(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0137, code lost:
        if (androidx.datastore.preferences.protobuf.C1242s1.m10825l(r7, r11) == androidx.datastore.preferences.protobuf.C1242s1.m10825l(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x014b, code lost:
        if (androidx.datastore.preferences.protobuf.C1242s1.m10824m(r7, r11) == androidx.datastore.preferences.protobuf.C1242s1.m10824m(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x015d, code lost:
        if (androidx.datastore.preferences.protobuf.C1242s1.m10825l(r7, r11) == androidx.datastore.preferences.protobuf.C1242s1.m10825l(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0170, code lost:
        if (androidx.datastore.preferences.protobuf.C1242s1.m10824m(r7, r11) == androidx.datastore.preferences.protobuf.C1242s1.m10824m(r7, r12)) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0183, code lost:
        if (androidx.datastore.preferences.protobuf.C1242s1.m10824m(r7, r11) == androidx.datastore.preferences.protobuf.C1242s1.m10824m(r7, r12)) goto L87;
     */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo10728d(T r11, T r12) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1265v0.mo10728d(java.lang.Object, java.lang.Object):boolean");
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: e */
    public final int mo10727e(T t) {
        return this.f3108h ? m10743p(t) : m10744o(t);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: f */
    public final T mo10726f() {
        return (T) this.f3113m.mo10716a(this.f3105e);
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
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int mo10725g(T r10) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1265v0.mo10725g(java.lang.Object):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0257 A[Catch: a -> 0x019c, all -> 0x028f, TryCatch #8 {a -> 0x019c, all -> 0x028f, blocks: (B:80:0x01b0, B:81:0x01b5, B:96:0x0222, B:82:0x01bb, B:97:0x022a, B:83:0x01c1, B:98:0x0232, B:84:0x01c7, B:99:0x023a, B:85:0x01cd, B:86:0x01d5, B:101:0x024b, B:104:0x0257, B:106:0x025b, B:108:0x0264, B:87:0x01da, B:88:0x01e2, B:89:0x01ea, B:90:0x01f2, B:91:0x01fa, B:92:0x0202, B:93:0x020a, B:94:0x0212, B:95:0x021a, B:100:0x0242), top: B:235:0x01b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04da A[Catch: all -> 0x04fc, TryCatch #3 {all -> 0x04fc, blocks: (B:192:0x04bf, B:199:0x04d5, B:201:0x04da, B:202:0x04df), top: B:225:0x04bf }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0507 A[LOOP:1: B:217:0x0505->B:218:0x0507, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04f8 A[SYNTHETIC] */
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo10724h(T r23, androidx.datastore.preferences.protobuf.InterfaceC1179g1 r24, androidx.datastore.preferences.protobuf.C1233r r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1265v0.mo10724h(java.lang.Object, androidx.datastore.preferences.protobuf.g1, androidx.datastore.preferences.protobuf.r):void");
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
    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo10723i(java.lang.Object r18, androidx.datastore.preferences.protobuf.C1221n r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1562
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1265v0.mo10723i(java.lang.Object, androidx.datastore.preferences.protobuf.n):void");
    }

    /* renamed from: j */
    public final boolean m10749j(int i, Object obj, Object obj2) {
        return m10742q(i, obj) == m10742q(i, obj2);
    }

    /* renamed from: k */
    public final <UT, UB> UB m10748k(Object obj, int i, UB ub, AbstractC1226o1<UT, UB> abstractC1226o1) {
        int i2 = this.f3101a[i];
        Object m10823n = C1242s1.m10823n(m10753F(i) & 1048575, obj);
        if (m10823n == null) {
            return ub;
        }
        C1157b0.InterfaceC1159b m10747l = m10747l(i);
        if (m10747l == null) {
            return ub;
        }
        InterfaceC1222n0 interfaceC1222n0 = this.f3117q;
        C1219m0 mo10871e = interfaceC1222n0.mo10871e(m10823n);
        C1211l0.C1212a<?, ?> mo10873c = interfaceC1222n0.mo10873c(m10746m(i));
        Iterator it = mo10871e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            ((Integer) entry.getValue()).intValue();
            if (!m10747l.m11143a()) {
                if (ub == null) {
                    ub = (UB) abstractC1226o1.mo10849m();
                }
                int m10957a = C1211l0.m10957a(mo10873c, entry.getKey(), entry.getValue());
                byte[] bArr = new byte[m10957a];
                Logger logger = AbstractC1214m.f3045b;
                AbstractC1214m.C1216b c1216b = new AbstractC1214m.C1216b(bArr, m10957a);
                try {
                    C1211l0.m10956b(c1216b, mo10873c, entry.getKey(), entry.getValue());
                    if (c1216b.f3052e - c1216b.f3053f == 0) {
                        abstractC1226o1.mo10857d(ub, i2, new AbstractC1183i.C1188e(bArr));
                        it.remove();
                    } else {
                        throw new IllegalStateException("Did not write as much data as expected.");
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: l */
    public final C1157b0.InterfaceC1159b m10747l(int i) {
        return (C1157b0.InterfaceC1159b) this.f3102b[((i / 3) * 2) + 1];
    }

    /* renamed from: m */
    public final Object m10746m(int i) {
        return this.f3102b[(i / 3) * 2];
    }

    /* renamed from: n */
    public final InterfaceC1182h1 m10745n(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f3102b;
        InterfaceC1182h1 interfaceC1182h1 = (InterfaceC1182h1) objArr[i2];
        if (interfaceC1182h1 != null) {
            return interfaceC1182h1;
        }
        InterfaceC1182h1<T> m11132a = C1168d1.f2962c.m11132a((Class) objArr[i2 + 1]);
        objArr[i2] = m11132a;
        return m11132a;
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
        r5 = ((androidx.datastore.preferences.protobuf.AbstractC1214m.m10935v(r3) + androidx.datastore.preferences.protobuf.AbstractC1214m.m10937t(r9)) + r3) + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0356, code lost:
        if ((r3 instanceof androidx.datastore.preferences.protobuf.AbstractC1183i) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0358, code lost:
        r3 = androidx.datastore.preferences.protobuf.AbstractC1214m.m10954c(r9, (androidx.datastore.preferences.protobuf.AbstractC1183i) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x035f, code lost:
        r3 = androidx.datastore.preferences.protobuf.AbstractC1214m.m10939r(r9, (java.lang.String) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0365, code lost:
        r5 = r3 + r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c5, code lost:
        if ((r3 instanceof androidx.datastore.preferences.protobuf.AbstractC1183i) != false) goto L61;
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
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m10744o(T r19) {
        /*
            Method dump skipped, instructions count: 1110
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1265v0.m10744o(java.lang.Object):int");
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
        r2 = r2 + ((androidx.datastore.preferences.protobuf.AbstractC1214m.m10935v(r5) + androidx.datastore.preferences.protobuf.AbstractC1214m.m10937t(r6)) + r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0319, code lost:
        if ((r3 instanceof androidx.datastore.preferences.protobuf.AbstractC1183i) != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x031b, code lost:
        r3 = androidx.datastore.preferences.protobuf.AbstractC1214m.m10954c(r6, (androidx.datastore.preferences.protobuf.AbstractC1183i) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0322, code lost:
        r3 = androidx.datastore.preferences.protobuf.AbstractC1214m.m10939r(r6, (java.lang.String) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0328, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
        if ((r3 instanceof androidx.datastore.preferences.protobuf.AbstractC1183i) != false) goto L61;
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
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int m10743p(T r11) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C1265v0.m10743p(java.lang.Object):int");
    }

    /* renamed from: q */
    public final boolean m10742q(int i, Object obj) {
        int i2;
        boolean equals;
        if (this.f3108h) {
            int m10753F = m10753F(i);
            long j = m10753F & 1048575;
            switch ((m10753F & 267386880) >>> 20) {
                case 0:
                    if (C1242s1.m10827j(j, obj) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (C1242s1.m10826k(j, obj) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (C1242s1.m10824m(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (C1242s1.m10824m(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (C1242s1.m10825l(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (C1242s1.m10824m(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (C1242s1.m10825l(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return C1242s1.m10831f(j, obj);
                case 8:
                    Object m10823n = C1242s1.m10823n(j, obj);
                    if (m10823n instanceof String) {
                        equals = ((String) m10823n).isEmpty();
                        break;
                    } else if (m10823n instanceof AbstractC1183i) {
                        equals = AbstractC1183i.f2982b.equals(m10823n);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (C1242s1.m10823n(j, obj) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    equals = AbstractC1183i.f2982b.equals(C1242s1.m10823n(j, obj));
                    break;
                case 11:
                    if (C1242s1.m10825l(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (C1242s1.m10825l(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (C1242s1.m10825l(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (C1242s1.m10824m(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (C1242s1.m10825l(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (C1242s1.m10824m(j, obj) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (C1242s1.m10823n(j, obj) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        if ((C1242s1.m10825l(i2 & 1048575, obj) & (1 << (this.f3101a[i + 2] >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    public final boolean m10741r(int i, int i2, Object obj) {
        if (C1242s1.m10825l(this.f3101a[i2 + 2] & 1048575, obj) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final <K, V> void m10739t(Object obj, int i, Object obj2, C1233r c1233r, InterfaceC1179g1 interfaceC1179g1) throws IOException {
        long m10753F = m10753F(i) & 1048575;
        Object m10823n = C1242s1.m10823n(m10753F, obj);
        InterfaceC1222n0 interfaceC1222n0 = this.f3117q;
        if (m10823n == null) {
            m10823n = interfaceC1222n0.mo10872d();
            C1242s1.m10816u(obj, m10753F, m10823n);
        } else if (interfaceC1222n0.mo10869g(m10823n)) {
            C1219m0 mo10872d = interfaceC1222n0.mo10872d();
            interfaceC1222n0.mo10875a(mo10872d, m10823n);
            C1242s1.m10816u(obj, m10753F, mo10872d);
            m10823n = mo10872d;
        }
        interfaceC1179g1.mo10995K(interfaceC1222n0.mo10871e(m10823n), interfaceC1222n0.mo10873c(obj2), c1233r);
    }

    /* renamed from: x */
    public final int m10735x(int i) {
        if (i < this.f3103c || i > this.f3104d) {
            return -1;
        }
        int[] iArr = this.f3101a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
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

    /* renamed from: y */
    public final <E> void m10734y(Object obj, long j, InterfaceC1179g1 interfaceC1179g1, InterfaceC1182h1<E> interfaceC1182h1, C1233r c1233r) throws IOException {
        interfaceC1179g1.mo10994L(this.f3114n.mo11108c(j, obj), interfaceC1182h1, c1233r);
    }

    /* renamed from: z */
    public final <E> void m10733z(Object obj, int i, InterfaceC1179g1 interfaceC1179g1, InterfaceC1182h1<E> interfaceC1182h1, C1233r c1233r) throws IOException {
        interfaceC1179g1.mo10993M(this.f3114n.mo11108c(i & 1048575, obj), interfaceC1182h1, c1233r);
    }
}
