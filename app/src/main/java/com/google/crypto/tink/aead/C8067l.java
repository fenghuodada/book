package com.google.crypto.tink.aead;

import com.google.crypto.tink.AbstractC8082f;
import com.google.crypto.tink.InterfaceC8038a;
import com.google.crypto.tink.proto.C8160k0;
import com.google.crypto.tink.proto.C8164l0;
import com.google.crypto.tink.proto.C8189y;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.subtle.C8345r;
import com.google.crypto.tink.subtle.C8347s;
import com.google.crypto.tink.subtle.C8349u;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.aead.l */
/* loaded from: classes3.dex */
public final class C8067l extends AbstractC8082f<C8160k0> {

    /* renamed from: com.google.crypto.tink.aead.l$a */
    /* loaded from: classes3.dex */
    public class C8068a extends AbstractC8082f.AbstractC8084b<InterfaceC8038a, C8160k0> {
        public C8068a() {
            super(InterfaceC8038a.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8084b
        /* renamed from: a */
        public final InterfaceC8038a mo4171a(C8160k0 c8160k0) throws GeneralSecurityException {
            return new C8349u(c8160k0.m4021v().m3820r());
        }
    }

    /* renamed from: com.google.crypto.tink.aead.l$b */
    /* loaded from: classes3.dex */
    public class C8069b extends AbstractC8082f.AbstractC8083a<C8164l0, C8160k0> {
        public C8069b() {
            super(C8164l0.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: a */
        public final C8160k0 mo4170a(C8164l0 c8164l0) throws GeneralSecurityException {
            C8160k0.C8161a m4019x = C8160k0.m4019x();
            C8067l.this.getClass();
            m4019x.m3461k();
            C8160k0.m4023t((C8160k0) m4019x.f16130b);
            byte[] m3419a = C8345r.m3419a(32);
            AbstractC8228i.C8234f m3821i = AbstractC8228i.m3821i(0, m3419a, m3419a.length);
            m4019x.m3461k();
            C8160k0.m4022u((C8160k0) m4019x.f16130b, m3821i);
            return m4019x.m3463i();
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: b */
        public final C8164l0 mo4169b(AbstractC8228i abstractC8228i) throws C8202b0 {
            return C8164l0.m4009t(abstractC8228i, C8277q.m3569a());
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo4168c(C8164l0 c8164l0) throws GeneralSecurityException {
        }
    }

    public C8067l() {
        super(C8160k0.class, new C8068a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: a */
    public final String mo4178a() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: c */
    public final AbstractC8082f.AbstractC8083a<?, C8160k0> mo4177c() {
        return new C8069b();
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: d */
    public final C8189y.EnumC8191b mo4176d() {
        return C8189y.EnumC8191b.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: e */
    public final C8160k0 mo4175e(AbstractC8228i abstractC8228i) throws C8202b0 {
        return C8160k0.m4018y(abstractC8228i, C8277q.m3569a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: f */
    public final void mo4174f(C8160k0 c8160k0) throws GeneralSecurityException {
        C8160k0 c8160k02 = c8160k0;
        C8347s.m3416c(c8160k02.m4020w());
        if (c8160k02.m4021v().size() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
    }
}
