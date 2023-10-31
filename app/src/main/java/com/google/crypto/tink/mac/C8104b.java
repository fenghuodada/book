package com.google.crypto.tink.mac;

import com.google.crypto.tink.AbstractC8082f;
import com.google.crypto.tink.InterfaceC8096k;
import com.google.crypto.tink.proto.C8183v;
import com.google.crypto.tink.proto.C8185w;
import com.google.crypto.tink.proto.C8187x;
import com.google.crypto.tink.proto.C8189y;
import com.google.crypto.tink.proto.EnumC8182u;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.subtle.C8342p;
import com.google.crypto.tink.subtle.C8344q;
import com.google.crypto.tink.subtle.C8345r;
import com.google.crypto.tink.subtle.C8347s;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.crypto.tink.mac.b */
/* loaded from: classes3.dex */
public final class C8104b extends AbstractC8082f<C8183v> {

    /* renamed from: com.google.crypto.tink.mac.b$a */
    /* loaded from: classes3.dex */
    public class C8105a extends AbstractC8082f.AbstractC8084b<InterfaceC8096k, C8183v> {
        public C8105a() {
            super(InterfaceC8096k.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8084b
        /* renamed from: a */
        public final InterfaceC8096k mo4171a(C8183v c8183v) throws GeneralSecurityException {
            C8183v c8183v2 = c8183v;
            EnumC8182u m3948u = c8183v2.m3957y().m3948u();
            SecretKeySpec secretKeySpec = new SecretKeySpec(c8183v2.m3958x().m3820r(), "HMAC");
            int m3947v = c8183v2.m3957y().m3947v();
            int ordinal = m3948u.ordinal();
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        return new C8344q(new C8342p("HMACSHA512", secretKeySpec), m3947v);
                    }
                    throw new GeneralSecurityException("unknown hash");
                }
                return new C8344q(new C8342p("HMACSHA256", secretKeySpec), m3947v);
            }
            return new C8344q(new C8342p("HMACSHA1", secretKeySpec), m3947v);
        }
    }

    /* renamed from: com.google.crypto.tink.mac.b$b */
    /* loaded from: classes3.dex */
    public class C8106b extends AbstractC8082f.AbstractC8083a<C8185w, C8183v> {
        public C8106b() {
            super(C8185w.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: a */
        public final C8183v mo4170a(C8185w c8185w) throws GeneralSecurityException {
            C8185w c8185w2 = c8185w;
            C8183v.C8184a m3965A = C8183v.m3965A();
            C8104b.this.getClass();
            m3965A.m3461k();
            C8183v.m3962t((C8183v) m3965A.f16130b);
            C8187x m3952v = c8185w2.m3952v();
            m3965A.m3461k();
            C8183v.m3961u((C8183v) m3965A.f16130b, m3952v);
            byte[] m3419a = C8345r.m3419a(c8185w2.m3953u());
            AbstractC8228i.C8234f m3821i = AbstractC8228i.m3821i(0, m3419a, m3419a.length);
            m3965A.m3461k();
            C8183v.m3960v((C8183v) m3965A.f16130b, m3821i);
            return m3965A.m3463i();
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: b */
        public final C8185w mo4169b(AbstractC8228i abstractC8228i) throws C8202b0 {
            return C8185w.m3951w(abstractC8228i, C8277q.m3569a());
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: c */
        public final void mo4168c(C8185w c8185w) throws GeneralSecurityException {
            C8185w c8185w2 = c8185w;
            if (c8185w2.m3953u() >= 16) {
                C8104b.m4172h(c8185w2.m3952v());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
    }

    public C8104b() {
        super(C8183v.class, new C8105a());
    }

    /* renamed from: g */
    public static void m4173g(C8183v c8183v) throws GeneralSecurityException {
        C8347s.m3416c(c8183v.m3956z());
        if (c8183v.m3958x().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        m4172h(c8183v.m3957y());
    }

    /* renamed from: h */
    public static void m4172h(C8187x c8187x) throws GeneralSecurityException {
        if (c8187x.m3947v() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int ordinal = c8187x.m3948u().ordinal();
        if (ordinal == 1) {
            if (c8187x.m3947v() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (ordinal == 3) {
            if (c8187x.m3947v() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (ordinal != 4) {
            throw new GeneralSecurityException("unknown hash type");
        } else {
            if (c8187x.m3947v() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: a */
    public final String mo4178a() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: c */
    public final AbstractC8082f.AbstractC8083a<?, C8183v> mo4177c() {
        return new C8106b();
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: d */
    public final C8189y.EnumC8191b mo4176d() {
        return C8189y.EnumC8191b.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: e */
    public final C8183v mo4175e(AbstractC8228i abstractC8228i) throws C8202b0 {
        return C8183v.m3964B(abstractC8228i, C8277q.m3569a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ void mo4174f(C8183v c8183v) throws GeneralSecurityException {
        m4173g(c8183v);
    }
}
