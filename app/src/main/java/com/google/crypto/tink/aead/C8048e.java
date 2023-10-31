package com.google.crypto.tink.aead;

import com.google.crypto.tink.AbstractC8082f;
import com.google.crypto.tink.InterfaceC8038a;
import com.google.crypto.tink.proto.C8151i;
import com.google.crypto.tink.proto.C8154j;
import com.google.crypto.tink.proto.C8158k;
import com.google.crypto.tink.proto.C8189y;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.subtle.C8320b;
import com.google.crypto.tink.subtle.C8345r;
import com.google.crypto.tink.subtle.C8347s;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.aead.e */
/* loaded from: classes3.dex */
public final class C8048e extends AbstractC8082f<C8151i> {

    /* renamed from: com.google.crypto.tink.aead.e$a */
    /* loaded from: classes3.dex */
    public class C8049a extends AbstractC8082f.AbstractC8084b<InterfaceC8038a, C8151i> {
        public C8049a() {
            super(InterfaceC8038a.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8084b
        /* renamed from: a */
        public final InterfaceC8038a mo4171a(C8151i c8151i) throws GeneralSecurityException {
            C8151i c8151i2 = c8151i;
            return new C8320b(c8151i2.m4037w().m3820r(), c8151i2.m4036x().m4025u());
        }
    }

    /* renamed from: com.google.crypto.tink.aead.e$b */
    /* loaded from: classes3.dex */
    public class C8050b extends AbstractC8082f.AbstractC8083a<C8154j, C8151i> {
        public C8050b() {
            super(C8154j.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: a */
        public final C8151i mo4170a(C8154j c8154j) throws GeneralSecurityException {
            C8154j c8154j2 = c8154j;
            C8151i.C8152a m4034z = C8151i.m4034z();
            byte[] m3419a = C8345r.m3419a(c8154j2.m4031t());
            AbstractC8228i.C8234f m3821i = AbstractC8228i.m3821i(0, m3419a, m3419a.length);
            m4034z.m3461k();
            C8151i.m4038v((C8151i) m4034z.f16130b, m3821i);
            C8158k m4030u = c8154j2.m4030u();
            m4034z.m3461k();
            C8151i.m4039u((C8151i) m4034z.f16130b, m4030u);
            C8048e.this.getClass();
            m4034z.m3461k();
            C8151i.m4040t((C8151i) m4034z.f16130b);
            return m4034z.m3463i();
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: b */
        public final C8154j mo4169b(AbstractC8228i abstractC8228i) throws C8202b0 {
            return C8154j.m4029v(abstractC8228i, C8277q.m3569a());
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: c */
        public final void mo4168c(C8154j c8154j) throws GeneralSecurityException {
            C8154j c8154j2 = c8154j;
            C8347s.m3418a(c8154j2.m4031t());
            if (c8154j2.m4030u().m4025u() != 12 && c8154j2.m4030u().m4025u() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    public C8048e() {
        super(C8151i.class, new C8049a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: a */
    public final String mo4178a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: c */
    public final AbstractC8082f.AbstractC8083a<?, C8151i> mo4177c() {
        return new C8050b();
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: d */
    public final C8189y.EnumC8191b mo4176d() {
        return C8189y.EnumC8191b.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: e */
    public final C8151i mo4175e(AbstractC8228i abstractC8228i) throws C8202b0 {
        return C8151i.m4042A(abstractC8228i, C8277q.m3569a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: f */
    public final void mo4174f(C8151i c8151i) throws GeneralSecurityException {
        C8151i c8151i2 = c8151i;
        C8347s.m3416c(c8151i2.m4035y());
        C8347s.m3418a(c8151i2.m4037w().size());
        if (c8151i2.m4036x().m4025u() != 12 && c8151i2.m4036x().m4025u() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
