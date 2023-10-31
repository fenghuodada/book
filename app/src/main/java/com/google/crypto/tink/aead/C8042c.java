package com.google.crypto.tink.aead;

import com.google.crypto.tink.AbstractC8082f;
import com.google.crypto.tink.InterfaceC8038a;
import com.google.crypto.tink.InterfaceC8096k;
import com.google.crypto.tink.mac.C8104b;
import com.google.crypto.tink.proto.C8129d;
import com.google.crypto.tink.proto.C8135e;
import com.google.crypto.tink.proto.C8139f;
import com.google.crypto.tink.proto.C8143g;
import com.google.crypto.tink.proto.C8147h;
import com.google.crypto.tink.proto.C8183v;
import com.google.crypto.tink.proto.C8185w;
import com.google.crypto.tink.proto.C8187x;
import com.google.crypto.tink.proto.C8189y;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.subtle.C8335k;
import com.google.crypto.tink.subtle.C8345r;
import com.google.crypto.tink.subtle.C8347s;
import com.google.crypto.tink.subtle.InterfaceC8340n;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.aead.c */
/* loaded from: classes3.dex */
public final class C8042c extends AbstractC8082f<C8129d> {

    /* renamed from: com.google.crypto.tink.aead.c$a */
    /* loaded from: classes3.dex */
    public class C8043a extends AbstractC8082f.AbstractC8084b<InterfaceC8038a, C8129d> {
        public C8043a() {
            super(InterfaceC8038a.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8084b
        /* renamed from: a */
        public final InterfaceC8038a mo4171a(C8129d c8129d) throws GeneralSecurityException {
            C8129d c8129d2 = c8129d;
            return new C8335k((InterfaceC8340n) new C8045d().m4204b(c8129d2.m4103w(), InterfaceC8340n.class), (InterfaceC8096k) new C8104b().m4204b(c8129d2.m4102x(), InterfaceC8096k.class), c8129d2.m4102x().m3957y().m3947v());
        }
    }

    /* renamed from: com.google.crypto.tink.aead.c$b */
    /* loaded from: classes3.dex */
    public class C8044b extends AbstractC8082f.AbstractC8083a<C8135e, C8129d> {
        public C8044b() {
            super(C8135e.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: a */
        public final C8129d mo4170a(C8135e c8135e) throws GeneralSecurityException {
            C8135e c8135e2 = c8135e;
            new C8045d();
            C8143g m4086t = c8135e2.m4086t();
            C8139f.C8140a m4076A = C8139f.m4076A();
            C8147h m4059v = m4086t.m4059v();
            m4076A.m3461k();
            C8139f.m4072u((C8139f) m4076A.f16130b, m4059v);
            byte[] m3419a = C8345r.m3419a(m4086t.m4060u());
            AbstractC8228i.C8234f m3821i = AbstractC8228i.m3821i(0, m3419a, m3419a.length);
            m4076A.m3461k();
            C8139f.m4071v((C8139f) m4076A.f16130b, m3821i);
            m4076A.m3461k();
            C8139f.m4073t((C8139f) m4076A.f16130b);
            new C8104b();
            C8185w m4085u = c8135e2.m4085u();
            C8183v.C8184a m3965A = C8183v.m3965A();
            m3965A.m3461k();
            C8183v.m3962t((C8183v) m3965A.f16130b);
            C8187x m3952v = m4085u.m3952v();
            m3965A.m3461k();
            C8183v.m3961u((C8183v) m3965A.f16130b, m3952v);
            byte[] m3419a2 = C8345r.m3419a(m4085u.m3953u());
            AbstractC8228i.C8234f m3821i2 = AbstractC8228i.m3821i(0, m3419a2, m3419a2.length);
            m3965A.m3461k();
            C8183v.m3960v((C8183v) m3965A.f16130b, m3821i2);
            C8129d.C8130a m4100z = C8129d.m4100z();
            m4100z.m3461k();
            C8129d.m4105u((C8129d) m4100z.f16130b, m4076A.m3463i());
            m4100z.m3461k();
            C8129d.m4104v((C8129d) m4100z.f16130b, m3965A.m3463i());
            C8042c.this.getClass();
            m4100z.m3461k();
            C8129d.m4106t((C8129d) m4100z.f16130b);
            return m4100z.m3463i();
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: b */
        public final C8135e mo4169b(AbstractC8228i abstractC8228i) throws C8202b0 {
            return C8135e.m4084v(abstractC8228i, C8277q.m3569a());
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: c */
        public final void mo4168c(C8135e c8135e) throws GeneralSecurityException {
            C8135e c8135e2 = c8135e;
            new C8045d();
            C8143g m4086t = c8135e2.m4086t();
            C8347s.m3418a(m4086t.m4060u());
            C8147h m4059v = m4086t.m4059v();
            if (m4059v.m4048u() >= 12 && m4059v.m4048u() <= 16) {
                new C8104b();
                C8185w m4085u = c8135e2.m4085u();
                if (m4085u.m3953u() >= 16) {
                    C8104b.m4172h(m4085u.m3952v());
                    C8347s.m3418a(c8135e2.m4086t().m4060u());
                    return;
                }
                throw new GeneralSecurityException("key too short");
            }
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public C8042c() {
        super(C8129d.class, new C8043a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: a */
    public final String mo4178a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: c */
    public final AbstractC8082f.AbstractC8083a<?, C8129d> mo4177c() {
        return new C8044b();
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: d */
    public final C8189y.EnumC8191b mo4176d() {
        return C8189y.EnumC8191b.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: e */
    public final C8129d mo4175e(AbstractC8228i abstractC8228i) throws C8202b0 {
        return C8129d.m4108A(abstractC8228i, C8277q.m3569a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: f */
    public final void mo4174f(C8129d c8129d) throws GeneralSecurityException {
        C8129d c8129d2 = c8129d;
        C8347s.m3416c(c8129d2.m4101y());
        new C8045d();
        C8139f m4103w = c8129d2.m4103w();
        C8347s.m3416c(m4103w.m4067z());
        C8347s.m3418a(m4103w.m4069x().size());
        C8147h m4068y = m4103w.m4068y();
        if (m4068y.m4048u() >= 12 && m4068y.m4048u() <= 16) {
            new C8104b();
            C8104b.m4173g(c8129d2.m4102x());
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }
}
