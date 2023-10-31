package com.google.crypto.tink.mac;

import com.google.crypto.tink.AbstractC8082f;
import com.google.crypto.tink.InterfaceC8096k;
import com.google.crypto.tink.proto.C8115a;
import com.google.crypto.tink.proto.C8119b;
import com.google.crypto.tink.proto.C8123c;
import com.google.crypto.tink.proto.C8189y;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.subtle.C8341o;
import com.google.crypto.tink.subtle.C8344q;
import com.google.crypto.tink.subtle.C8345r;
import com.google.crypto.tink.subtle.C8347s;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.mac.a */
/* loaded from: classes3.dex */
public final class C8101a extends AbstractC8082f<C8115a> {

    /* renamed from: com.google.crypto.tink.mac.a$a */
    /* loaded from: classes3.dex */
    public class C8102a extends AbstractC8082f.AbstractC8084b<InterfaceC8096k, C8115a> {
        public C8102a() {
            super(InterfaceC8096k.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8084b
        /* renamed from: a */
        public final InterfaceC8096k mo4171a(C8115a c8115a) throws GeneralSecurityException {
            C8115a c8115a2 = c8115a;
            return new C8344q(new C8341o(c8115a2.m4149w().m3820r()), c8115a2.m4148x().m4129u());
        }
    }

    /* renamed from: com.google.crypto.tink.mac.a$b */
    /* loaded from: classes3.dex */
    public class C8103b extends AbstractC8082f.AbstractC8083a<C8119b, C8115a> {
        public C8103b() {
            super(C8119b.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: a */
        public final C8115a mo4170a(C8119b c8119b) throws GeneralSecurityException {
            C8119b c8119b2 = c8119b;
            C8115a.C8116a m4146z = C8115a.m4146z();
            m4146z.m3461k();
            C8115a.m4152t((C8115a) m4146z.f16130b);
            byte[] m3419a = C8345r.m3419a(c8119b2.m4135t());
            AbstractC8228i.C8234f m3821i = AbstractC8228i.m3821i(0, m3419a, m3419a.length);
            m4146z.m3461k();
            C8115a.m4151u((C8115a) m4146z.f16130b, m3821i);
            C8123c m4134u = c8119b2.m4134u();
            m4146z.m3461k();
            C8115a.m4150v((C8115a) m4146z.f16130b, m4134u);
            return m4146z.m3463i();
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: b */
        public final C8119b mo4169b(AbstractC8228i abstractC8228i) throws C8202b0 {
            return C8119b.m4133v(abstractC8228i, C8277q.m3569a());
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: c */
        public final void mo4168c(C8119b c8119b) throws GeneralSecurityException {
            C8119b c8119b2 = c8119b;
            C8101a.m4179g(c8119b2.m4134u());
            if (c8119b2.m4135t() == 32) {
                return;
            }
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public C8101a() {
        super(C8115a.class, new C8102a());
    }

    /* renamed from: g */
    public static void m4179g(C8123c c8123c) throws GeneralSecurityException {
        if (c8123c.m4129u() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (c8123c.m4129u() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: a */
    public final String mo4178a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: c */
    public final AbstractC8082f.AbstractC8083a<?, C8115a> mo4177c() {
        return new C8103b();
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: d */
    public final C8189y.EnumC8191b mo4176d() {
        return C8189y.EnumC8191b.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: e */
    public final C8115a mo4175e(AbstractC8228i abstractC8228i) throws C8202b0 {
        return C8115a.m4154A(abstractC8228i, C8277q.m3569a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: f */
    public final void mo4174f(C8115a c8115a) throws GeneralSecurityException {
        C8115a c8115a2 = c8115a;
        C8347s.m3416c(c8115a2.m4147y());
        if (c8115a2.m4149w().size() == 32) {
            m4179g(c8115a2.m4148x());
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }
}
