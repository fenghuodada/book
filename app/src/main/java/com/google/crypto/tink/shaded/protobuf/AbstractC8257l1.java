package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C8202b0;
import java.io.IOException;

/* renamed from: com.google.crypto.tink.shaded.protobuf.l1 */
/* loaded from: classes3.dex */
public abstract class AbstractC8257l1<T, B> {
    /* renamed from: a */
    public abstract void mo3636a(int i, int i2, Object obj);

    /* renamed from: b */
    public abstract void mo3635b(B b, int i, long j);

    /* renamed from: c */
    public abstract void mo3634c(int i, Object obj, Object obj2);

    /* renamed from: d */
    public abstract void mo3633d(B b, int i, AbstractC8228i abstractC8228i);

    /* renamed from: e */
    public abstract void mo3632e(B b, int i, long j);

    /* renamed from: f */
    public abstract C8260m1 mo3631f(Object obj);

    /* renamed from: g */
    public abstract C8260m1 mo3630g(Object obj);

    /* renamed from: h */
    public abstract int mo3629h(T t);

    /* renamed from: i */
    public abstract int mo3628i(T t);

    /* renamed from: j */
    public abstract void mo3627j(Object obj);

    /* renamed from: k */
    public abstract C8260m1 mo3626k(Object obj, Object obj2);

    /* renamed from: l */
    public final boolean m3668l(B b, InterfaceC8216e1 interfaceC8216e1) throws IOException {
        int mo3743a = interfaceC8216e1.mo3743a();
        int i = mo3743a >>> 3;
        int i2 = mo3743a & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                mo3636a(i, interfaceC8216e1.mo3736h(), b);
                                return true;
                            }
                            int i3 = C8202b0.f15951a;
                            throw new C8202b0.C8203a();
                        }
                        return false;
                    }
                    C8260m1 mo3625m = mo3625m();
                    int i4 = (i << 3) | 4;
                    while (interfaceC8216e1.mo3721w() != Integer.MAX_VALUE && m3668l(mo3625m, interfaceC8216e1)) {
                    }
                    if (i4 == interfaceC8216e1.mo3743a()) {
                        mo3634c(i, b, mo3621q(mo3625m));
                        return true;
                    }
                    throw new C8202b0("Protocol message end-group tag did not match expected tag.");
                }
                mo3633d(b, i, interfaceC8216e1.mo3718z());
                return true;
            }
            mo3635b(b, i, interfaceC8216e1.mo3740d());
            return true;
        }
        mo3632e(b, i, interfaceC8216e1.mo3758G());
        return true;
    }

    /* renamed from: m */
    public abstract C8260m1 mo3625m();

    /* renamed from: n */
    public abstract void mo3624n(Object obj, B b);

    /* renamed from: o */
    public abstract void mo3623o(Object obj, T t);

    /* renamed from: p */
    public abstract void mo3622p();

    /* renamed from: q */
    public abstract C8260m1 mo3621q(Object obj);

    /* renamed from: r */
    public abstract void mo3620r(Object obj, C8258m c8258m) throws IOException;

    /* renamed from: s */
    public abstract void mo3619s(Object obj, C8258m c8258m) throws IOException;
}
