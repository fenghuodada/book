package com.google.crypto.tink.aead;

import com.google.crypto.tink.AbstractC8082f;
import com.google.crypto.tink.InterfaceC8038a;
import com.google.crypto.tink.proto.C8176r;
import com.google.crypto.tink.proto.C8178s;
import com.google.crypto.tink.proto.C8189y;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.subtle.C8333i;
import com.google.crypto.tink.subtle.C8345r;
import com.google.crypto.tink.subtle.C8347s;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.aead.h */
/* loaded from: classes3.dex */
public final class C8057h extends AbstractC8082f<C8176r> {

    /* renamed from: com.google.crypto.tink.aead.h$a */
    /* loaded from: classes3.dex */
    public class C8058a extends AbstractC8082f.AbstractC8084b<InterfaceC8038a, C8176r> {
        public C8058a() {
            super(InterfaceC8038a.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8084b
        /* renamed from: a */
        public final InterfaceC8038a mo4171a(C8176r c8176r) throws GeneralSecurityException {
            return new C8333i(c8176r.m3978v().m3820r());
        }
    }

    /* renamed from: com.google.crypto.tink.aead.h$b */
    /* loaded from: classes3.dex */
    public class C8059b extends AbstractC8082f.AbstractC8083a<C8178s, C8176r> {
        public C8059b() {
            super(C8178s.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: a */
        public final C8176r mo4170a(C8178s c8178s) throws GeneralSecurityException {
            C8176r.C8177a m3976x = C8176r.m3976x();
            C8057h.this.getClass();
            m3976x.m3461k();
            C8176r.m3980t((C8176r) m3976x.f16130b);
            byte[] m3419a = C8345r.m3419a(32);
            AbstractC8228i.C8234f m3821i = AbstractC8228i.m3821i(0, m3419a, m3419a.length);
            m3976x.m3461k();
            C8176r.m3979u((C8176r) m3976x.f16130b, m3821i);
            return m3976x.m3463i();
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: b */
        public final C8178s mo4169b(AbstractC8228i abstractC8228i) throws C8202b0 {
            return C8178s.m3973t(abstractC8228i, C8277q.m3569a());
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo4168c(C8178s c8178s) throws GeneralSecurityException {
        }
    }

    public C8057h() {
        super(C8176r.class, new C8058a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: a */
    public final String mo4178a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: c */
    public final AbstractC8082f.AbstractC8083a<?, C8176r> mo4177c() {
        return new C8059b();
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: d */
    public final C8189y.EnumC8191b mo4176d() {
        return C8189y.EnumC8191b.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: e */
    public final C8176r mo4175e(AbstractC8228i abstractC8228i) throws C8202b0 {
        return C8176r.m3975y(abstractC8228i, C8277q.m3569a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: f */
    public final void mo4174f(C8176r c8176r) throws GeneralSecurityException {
        C8176r c8176r2 = c8176r;
        C8347s.m3416c(c8176r2.m3977w());
        if (c8176r2.m3978v().size() == 32) {
            return;
        }
        throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    }
}
