package com.google.crypto.tink.aead;

import com.google.crypto.tink.AbstractC8082f;
import com.google.crypto.tink.proto.C8139f;
import com.google.crypto.tink.proto.C8143g;
import com.google.crypto.tink.proto.C8147h;
import com.google.crypto.tink.proto.C8189y;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.subtle.C8318a;
import com.google.crypto.tink.subtle.C8345r;
import com.google.crypto.tink.subtle.C8347s;
import com.google.crypto.tink.subtle.InterfaceC8340n;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.aead.d */
/* loaded from: classes3.dex */
public final class C8045d extends AbstractC8082f<C8139f> {

    /* renamed from: com.google.crypto.tink.aead.d$a */
    /* loaded from: classes3.dex */
    public class C8046a extends AbstractC8082f.AbstractC8084b<InterfaceC8340n, C8139f> {
        public C8046a() {
            super(InterfaceC8340n.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8084b
        /* renamed from: a */
        public final InterfaceC8340n mo4171a(C8139f c8139f) throws GeneralSecurityException {
            C8139f c8139f2 = c8139f;
            return new C8318a(c8139f2.m4069x().m3820r(), c8139f2.m4068y().m4048u());
        }
    }

    /* renamed from: com.google.crypto.tink.aead.d$b */
    /* loaded from: classes3.dex */
    public class C8047b extends AbstractC8082f.AbstractC8083a<C8143g, C8139f> {
        public C8047b() {
            super(C8143g.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: a */
        public final C8139f mo4170a(C8143g c8143g) throws GeneralSecurityException {
            C8143g c8143g2 = c8143g;
            C8139f.C8140a m4076A = C8139f.m4076A();
            C8147h m4059v = c8143g2.m4059v();
            m4076A.m3461k();
            C8139f.m4072u((C8139f) m4076A.f16130b, m4059v);
            byte[] m3419a = C8345r.m3419a(c8143g2.m4060u());
            AbstractC8228i.C8234f m3821i = AbstractC8228i.m3821i(0, m3419a, m3419a.length);
            m4076A.m3461k();
            C8139f.m4071v((C8139f) m4076A.f16130b, m3821i);
            C8045d.this.getClass();
            m4076A.m3461k();
            C8139f.m4073t((C8139f) m4076A.f16130b);
            return m4076A.m3463i();
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: b */
        public final C8143g mo4169b(AbstractC8228i abstractC8228i) throws C8202b0 {
            return C8143g.m4058w(abstractC8228i, C8277q.m3569a());
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: c */
        public final void mo4168c(C8143g c8143g) throws GeneralSecurityException {
            C8143g c8143g2 = c8143g;
            C8347s.m3418a(c8143g2.m4060u());
            C8147h m4059v = c8143g2.m4059v();
            C8045d.this.getClass();
            if (m4059v.m4048u() >= 12 && m4059v.m4048u() <= 16) {
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public C8045d() {
        super(C8139f.class, new C8046a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: a */
    public final String mo4178a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: c */
    public final AbstractC8082f.AbstractC8083a<?, C8139f> mo4177c() {
        return new C8047b();
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: d */
    public final C8189y.EnumC8191b mo4176d() {
        return C8189y.EnumC8191b.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: e */
    public final C8139f mo4175e(AbstractC8228i abstractC8228i) throws C8202b0 {
        return C8139f.m4075B(abstractC8228i, C8277q.m3569a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: f */
    public final void mo4174f(C8139f c8139f) throws GeneralSecurityException {
        C8139f c8139f2 = c8139f;
        C8347s.m3416c(c8139f2.m4067z());
        C8347s.m3418a(c8139f2.m4069x().size());
        C8147h m4068y = c8139f2.m4068y();
        if (m4068y.m4048u() >= 12 && m4068y.m4048u() <= 16) {
            return;
        }
        throw new GeneralSecurityException("invalid IV size");
    }
}
