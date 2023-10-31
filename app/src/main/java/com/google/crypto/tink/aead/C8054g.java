package com.google.crypto.tink.aead;

import com.google.crypto.tink.AbstractC8082f;
import com.google.crypto.tink.InterfaceC8038a;
import com.google.crypto.tink.aead.subtle.C8070a;
import com.google.crypto.tink.proto.C8168n;
import com.google.crypto.tink.proto.C8170o;
import com.google.crypto.tink.proto.C8189y;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.subtle.C8345r;
import com.google.crypto.tink.subtle.C8347s;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.aead.g */
/* loaded from: classes3.dex */
public final class C8054g extends AbstractC8082f<C8168n> {

    /* renamed from: com.google.crypto.tink.aead.g$a */
    /* loaded from: classes3.dex */
    public class C8055a extends AbstractC8082f.AbstractC8084b<InterfaceC8038a, C8168n> {
        public C8055a() {
            super(InterfaceC8038a.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8084b
        /* renamed from: a */
        public final InterfaceC8038a mo4171a(C8168n c8168n) throws GeneralSecurityException {
            return new C8070a(c8168n.m4000v().m3820r());
        }
    }

    /* renamed from: com.google.crypto.tink.aead.g$b */
    /* loaded from: classes3.dex */
    public class C8056b extends AbstractC8082f.AbstractC8083a<C8170o, C8168n> {
        public C8056b() {
            super(C8170o.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: a */
        public final C8168n mo4170a(C8170o c8170o) throws GeneralSecurityException {
            C8168n.C8169a m3998x = C8168n.m3998x();
            byte[] m3419a = C8345r.m3419a(c8170o.m3995t());
            AbstractC8228i.C8234f m3821i = AbstractC8228i.m3821i(0, m3419a, m3419a.length);
            m3998x.m3461k();
            C8168n.m4001u((C8168n) m3998x.f16130b, m3821i);
            C8054g.this.getClass();
            m3998x.m3461k();
            C8168n.m4002t((C8168n) m3998x.f16130b);
            return m3998x.m3463i();
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: b */
        public final C8170o mo4169b(AbstractC8228i abstractC8228i) throws C8202b0 {
            return C8170o.m3994u(abstractC8228i, C8277q.m3569a());
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: c */
        public final void mo4168c(C8170o c8170o) throws GeneralSecurityException {
            C8347s.m3418a(c8170o.m3995t());
        }
    }

    public C8054g() {
        super(C8168n.class, new C8055a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: a */
    public final String mo4178a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: c */
    public final AbstractC8082f.AbstractC8083a<?, C8168n> mo4177c() {
        return new C8056b();
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: d */
    public final C8189y.EnumC8191b mo4176d() {
        return C8189y.EnumC8191b.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: e */
    public final C8168n mo4175e(AbstractC8228i abstractC8228i) throws C8202b0 {
        return C8168n.m3997y(abstractC8228i, C8277q.m3569a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: f */
    public final void mo4174f(C8168n c8168n) throws GeneralSecurityException {
        C8168n c8168n2 = c8168n;
        C8347s.m3416c(c8168n2.m3999w());
        C8347s.m3418a(c8168n2.m4000v().size());
    }
}
