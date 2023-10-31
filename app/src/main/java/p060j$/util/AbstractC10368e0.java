package p060j$.util;

import java.util.Iterator;

/* renamed from: j$.util.e0 */
/* loaded from: classes2.dex */
public abstract class AbstractC10368e0 {

    /* renamed from: a */
    private static final InterfaceC10321P f20844a = new C10332a0();

    /* renamed from: b */
    private static final InterfaceC10312G f20845b = new C10329Y();

    /* renamed from: c */
    private static final InterfaceC10315J f20846c = new C10330Z();

    /* renamed from: d */
    private static final InterfaceC10309D f20847d = new C10328X();

    /* renamed from: a */
    private static void m949a(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i2);
            }
            if (i3 > i) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i2 + ") > fence(" + i3 + ")");
    }

    /* renamed from: b */
    public static InterfaceC10309D m948b() {
        return f20847d;
    }

    /* renamed from: c */
    public static InterfaceC10312G m947c() {
        return f20845b;
    }

    /* renamed from: d */
    public static InterfaceC10315J m946d() {
        return f20846c;
    }

    /* renamed from: e */
    public static InterfaceC10321P m945e() {
        return f20844a;
    }

    /* renamed from: f */
    public static InterfaceC10480q m944f(InterfaceC10309D interfaceC10309D) {
        interfaceC10309D.getClass();
        return new C10325U(interfaceC10309D);
    }

    /* renamed from: g */
    public static InterfaceC10727u m943g(InterfaceC10312G interfaceC10312G) {
        interfaceC10312G.getClass();
        return new C10323S(interfaceC10312G);
    }

    /* renamed from: h */
    public static InterfaceC10731y m942h(InterfaceC10315J interfaceC10315J) {
        interfaceC10315J.getClass();
        return new C10324T(interfaceC10315J);
    }

    /* renamed from: i */
    public static Iterator m941i(InterfaceC10321P interfaceC10321P) {
        interfaceC10321P.getClass();
        return new C10322Q(interfaceC10321P);
    }

    /* renamed from: j */
    public static InterfaceC10309D m940j(double[] dArr, int i, int i2) {
        dArr.getClass();
        m949a(dArr.length, i, i2);
        return new C10327W(dArr, i, i2, 1040);
    }

    /* renamed from: k */
    public static InterfaceC10312G m939k(int[] iArr, int i, int i2) {
        iArr.getClass();
        m949a(iArr.length, i, i2);
        return new C10334b0(iArr, i, i2, 1040);
    }

    /* renamed from: l */
    public static InterfaceC10315J m938l(long[] jArr, int i, int i2) {
        jArr.getClass();
        m949a(jArr.length, i, i2);
        return new C10366d0(jArr, i, i2, 1040);
    }

    /* renamed from: m */
    public static InterfaceC10321P m937m(Object[] objArr, int i, int i2) {
        objArr.getClass();
        m949a(objArr.length, i, i2);
        return new C10326V(objArr, i, i2, 1040);
    }
}
