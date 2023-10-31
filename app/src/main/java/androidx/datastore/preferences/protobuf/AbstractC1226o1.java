package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C1163c0;
import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.o1 */
/* loaded from: classes.dex */
public abstract class AbstractC1226o1<T, B> {
    /* renamed from: a */
    public abstract void mo10860a(int i, int i2, Object obj);

    /* renamed from: b */
    public abstract void mo10859b(B b, int i, long j);

    /* renamed from: c */
    public abstract void mo10858c(int i, Object obj, Object obj2);

    /* renamed from: d */
    public abstract void mo10857d(B b, int i, AbstractC1183i abstractC1183i);

    /* renamed from: e */
    public abstract void mo10856e(B b, int i, long j);

    /* renamed from: f */
    public abstract C1229p1 mo10855f(Object obj);

    /* renamed from: g */
    public abstract C1229p1 mo10854g(Object obj);

    /* renamed from: h */
    public abstract int mo10853h(T t);

    /* renamed from: i */
    public abstract int mo10852i(T t);

    /* renamed from: j */
    public abstract void mo10851j(Object obj);

    /* renamed from: k */
    public abstract C1229p1 mo10850k(Object obj, Object obj2);

    /* renamed from: l */
    public final boolean m10867l(B b, InterfaceC1179g1 interfaceC1179g1) throws IOException {
        int mo10983a = interfaceC1179g1.mo10983a();
        int i = mo10983a >>> 3;
        int i2 = mo10983a & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                mo10860a(i, interfaceC1179g1.mo10976h(), b);
                                return true;
                            }
                            int i3 = C1163c0.f2947a;
                            throw new C1163c0.C1164a();
                        }
                        return false;
                    }
                    C1229p1 mo10849m = mo10849m();
                    int i4 = (i << 3) | 4;
                    while (interfaceC1179g1.mo10961w() != Integer.MAX_VALUE && m10867l(mo10849m, interfaceC1179g1)) {
                    }
                    if (i4 == interfaceC1179g1.mo10983a()) {
                        mo10858c(i, b, mo10845q(mo10849m));
                        return true;
                    }
                    throw new C1163c0("Protocol message end-group tag did not match expected tag.");
                }
                mo10857d(b, i, interfaceC1179g1.mo10958z());
                return true;
            }
            mo10859b(b, i, interfaceC1179g1.mo10980d());
            return true;
        }
        mo10856e(b, i, interfaceC1179g1.mo10999G());
        return true;
    }

    /* renamed from: m */
    public abstract C1229p1 mo10849m();

    /* renamed from: n */
    public abstract void mo10848n(Object obj, B b);

    /* renamed from: o */
    public abstract void mo10847o(Object obj, T t);

    /* renamed from: p */
    public abstract void mo10846p();

    /* renamed from: q */
    public abstract C1229p1 mo10845q(Object obj);

    /* renamed from: r */
    public abstract void mo10844r(Object obj, C1221n c1221n) throws IOException;

    /* renamed from: s */
    public abstract void mo10843s(Object obj, C1221n c1221n) throws IOException;
}
