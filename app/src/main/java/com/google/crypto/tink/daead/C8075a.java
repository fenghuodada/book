package com.google.crypto.tink.daead;

import com.google.crypto.tink.AbstractC8082f;
import com.google.crypto.tink.InterfaceC8073c;
import com.google.crypto.tink.proto.C8172p;
import com.google.crypto.tink.proto.C8174q;
import com.google.crypto.tink.proto.C8189y;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.subtle.C8325d;
import com.google.crypto.tink.subtle.C8345r;
import com.google.crypto.tink.subtle.C8347s;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;

/* renamed from: com.google.crypto.tink.daead.a */
/* loaded from: classes3.dex */
public final class C8075a extends AbstractC8082f<C8172p> {

    /* renamed from: com.google.crypto.tink.daead.a$a */
    /* loaded from: classes3.dex */
    public class C8076a extends AbstractC8082f.AbstractC8084b<InterfaceC8073c, C8172p> {
        public C8076a() {
            super(InterfaceC8073c.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8084b
        /* renamed from: a */
        public final InterfaceC8073c mo4171a(C8172p c8172p) throws GeneralSecurityException {
            return new C8325d(c8172p.m3990v().m3820r());
        }
    }

    /* renamed from: com.google.crypto.tink.daead.a$b */
    /* loaded from: classes3.dex */
    public class C8077b extends AbstractC8082f.AbstractC8083a<C8174q, C8172p> {
        public C8077b() {
            super(C8174q.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: a */
        public final C8172p mo4170a(C8174q c8174q) throws GeneralSecurityException {
            C8172p.C8173a m3988x = C8172p.m3988x();
            byte[] m3419a = C8345r.m3419a(c8174q.m3984u());
            AbstractC8228i.C8234f m3821i = AbstractC8228i.m3821i(0, m3419a, m3419a.length);
            m3988x.m3461k();
            C8172p.m3991u((C8172p) m3988x.f16130b, m3821i);
            C8075a.this.getClass();
            m3988x.m3461k();
            C8172p.m3992t((C8172p) m3988x.f16130b);
            return m3988x.m3463i();
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: b */
        public final C8174q mo4169b(AbstractC8228i abstractC8228i) throws C8202b0 {
            return C8174q.m3982w(abstractC8228i, C8277q.m3569a());
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: c */
        public final void mo4168c(C8174q c8174q) throws GeneralSecurityException {
            C8174q c8174q2 = c8174q;
            if (c8174q2.m3984u() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + c8174q2.m3984u() + ". Valid keys must have 64 bytes.");
        }
    }

    public C8075a() {
        super(C8172p.class, new C8076a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: a */
    public final String mo4178a() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: c */
    public final AbstractC8082f.AbstractC8083a<?, C8172p> mo4177c() {
        return new C8077b();
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: d */
    public final C8189y.EnumC8191b mo4176d() {
        return C8189y.EnumC8191b.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: e */
    public final C8172p mo4175e(AbstractC8228i abstractC8228i) throws C8202b0 {
        return C8172p.m3987y(abstractC8228i, C8277q.m3569a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: f */
    public final void mo4174f(C8172p c8172p) throws GeneralSecurityException {
        C8172p c8172p2 = c8172p;
        C8347s.m3416c(c8172p2.m3989w());
        if (c8172p2.m3990v().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + c8172p2.m3990v().size() + ". Valid keys must have 64 bytes.");
    }
}
