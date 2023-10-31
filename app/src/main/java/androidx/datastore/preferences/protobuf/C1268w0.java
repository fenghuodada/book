package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1273z;
import androidx.datastore.preferences.protobuf.C1170e0;
import androidx.datastore.preferences.protobuf.C1263v;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.w0 */
/* loaded from: classes.dex */
public final class C1268w0<T> implements InterfaceC1182h1<T> {

    /* renamed from: a */
    public final InterfaceC1240s0 f3134a;

    /* renamed from: b */
    public final AbstractC1226o1<?, ?> f3135b;

    /* renamed from: c */
    public final boolean f3136c;

    /* renamed from: d */
    public final AbstractC1239s<?> f3137d;

    public C1268w0(AbstractC1226o1<?, ?> abstractC1226o1, AbstractC1239s<?> abstractC1239s, InterfaceC1240s0 interfaceC1240s0) {
        this.f3135b = abstractC1226o1;
        this.f3136c = abstractC1239s.mo10793e(interfaceC1240s0);
        this.f3137d = abstractC1239s;
        this.f3134a = interfaceC1240s0;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: a */
    public final void mo10731a(T t, T t2) {
        Class<?> cls = C1193i1.f2989a;
        AbstractC1226o1<?, ?> abstractC1226o1 = this.f3135b;
        abstractC1226o1.mo10847o(t, abstractC1226o1.mo10850k(abstractC1226o1.mo10854g(t), abstractC1226o1.mo10854g(t2)));
        if (this.f3136c) {
            C1193i1.m11107A(this.f3137d, t, t2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: b */
    public final void mo10730b(T t) {
        this.f3135b.mo10851j(t);
        this.f3137d.mo10792f(t);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: c */
    public final boolean mo10729c(T t) {
        return this.f3137d.mo10795c(t).m10765j();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: d */
    public final boolean mo10728d(T t, T t2) {
        AbstractC1226o1<?, ?> abstractC1226o1 = this.f3135b;
        if (abstractC1226o1.mo10854g(t).equals(abstractC1226o1.mo10854g(t2))) {
            if (this.f3136c) {
                AbstractC1239s<?> abstractC1239s = this.f3137d;
                return abstractC1239s.mo10795c(t).equals(abstractC1239s.mo10795c(t2));
            }
            return true;
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: e */
    public final int mo10727e(T t) {
        C1203k1<?, Object> c1203k1;
        AbstractC1226o1<?, ?> abstractC1226o1 = this.f3135b;
        int i = 0;
        int mo10852i = abstractC1226o1.mo10852i(abstractC1226o1.mo10854g(t)) + 0;
        if (this.f3136c) {
            C1263v<?> mo10795c = this.f3137d.mo10795c(t);
            int i2 = 0;
            while (true) {
                c1203k1 = mo10795c.f3096a;
                if (i >= c1203k1.m11012d()) {
                    break;
                }
                i2 += C1263v.m10768g(c1203k1.m11013c(i));
                i++;
            }
            for (Map.Entry<?, Object> entry : c1203k1.m11011e()) {
                i2 += C1263v.m10768g(entry);
            }
            return mo10852i + i2;
        }
        return mo10852i;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: f */
    public final T mo10726f() {
        return (T) this.f3134a.mo10699g().m10705i();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: g */
    public final int mo10725g(T t) {
        int hashCode = this.f3135b.mo10854g(t).hashCode();
        return this.f3136c ? (hashCode * 53) + this.f3137d.mo10795c(t).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: h */
    public final void mo10724h(T t, InterfaceC1179g1 interfaceC1179g1, C1233r c1233r) throws IOException {
        AbstractC1226o1 abstractC1226o1 = this.f3135b;
        C1229p1 mo10855f = abstractC1226o1.mo10855f(t);
        AbstractC1239s abstractC1239s = this.f3137d;
        C1263v<ET> mo10794d = abstractC1239s.mo10794d(t);
        do {
            try {
                if (interfaceC1179g1.mo10961w() == Integer.MAX_VALUE) {
                    break;
                }
            } finally {
                abstractC1226o1.mo10848n(t, mo10855f);
            }
        } while (m10722j(interfaceC1179g1, c1233r, abstractC1239s, mo10794d, abstractC1226o1, mo10855f));
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC1182h1
    /* renamed from: i */
    public final void mo10723i(Object obj, C1221n c1221n) throws IOException {
        Object value;
        Iterator<Map.Entry<?, Object>> m10763l = this.f3137d.mo10795c(obj).m10763l();
        while (m10763l.hasNext()) {
            Map.Entry<?, Object> next = m10763l.next();
            C1263v.InterfaceC1264a interfaceC1264a = (C1263v.InterfaceC1264a) next.getKey();
            if (interfaceC1264a.mo10696D() == EnumC1266v1.MESSAGE) {
                interfaceC1264a.mo10698B();
                interfaceC1264a.mo10695E();
                boolean z = next instanceof C1170e0.C1171a;
                interfaceC1264a.getNumber();
                if (z) {
                    value = ((C1170e0.C1171a) next).f2965a.getValue().m11124b();
                } else {
                    value = next.getValue();
                }
                c1221n.m10884l(0, value);
            } else {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
        }
        AbstractC1226o1<?, ?> abstractC1226o1 = this.f3135b;
        abstractC1226o1.mo10844r(abstractC1226o1.mo10854g(obj), c1221n);
    }

    /* renamed from: j */
    public final <UT, UB, ET extends C1263v.InterfaceC1264a<ET>> boolean m10722j(InterfaceC1179g1 interfaceC1179g1, C1233r c1233r, AbstractC1239s<ET> abstractC1239s, C1263v<ET> c1263v, AbstractC1226o1<UT, UB> abstractC1226o1, UB ub) throws IOException {
        int mo10983a = interfaceC1179g1.mo10983a();
        InterfaceC1240s0 interfaceC1240s0 = this.f3134a;
        if (mo10983a != 11) {
            if ((mo10983a & 7) == 2) {
                AbstractC1273z.C1278e mo10796b = abstractC1239s.mo10796b(c1233r, interfaceC1240s0, mo10983a >>> 3);
                if (mo10796b != null) {
                    abstractC1239s.mo10790h(mo10796b);
                    return true;
                }
                return abstractC1226o1.m10867l(ub, interfaceC1179g1);
            }
            return interfaceC1179g1.mo11003C();
        }
        AbstractC1273z.C1278e c1278e = null;
        int i = 0;
        AbstractC1183i abstractC1183i = null;
        while (interfaceC1179g1.mo10961w() != Integer.MAX_VALUE) {
            int mo10983a2 = interfaceC1179g1.mo10983a();
            if (mo10983a2 == 16) {
                i = interfaceC1179g1.mo10972l();
                c1278e = abstractC1239s.mo10796b(c1233r, interfaceC1240s0, i);
            } else if (mo10983a2 == 26) {
                if (c1278e != null) {
                    abstractC1239s.mo10790h(c1278e);
                } else {
                    abstractC1183i = interfaceC1179g1.mo10958z();
                }
            } else if (!interfaceC1179g1.mo11003C()) {
                break;
            }
        }
        if (interfaceC1179g1.mo10983a() == 12) {
            if (abstractC1183i != null) {
                if (c1278e != null) {
                    abstractC1239s.mo10789i(c1278e);
                } else {
                    abstractC1226o1.mo10857d(ub, i, abstractC1183i);
                }
            }
            return true;
        }
        throw new C1163c0("Protocol message end-group tag did not match expected tag.");
    }
}
