package com.google.crypto.tink.aead;

import com.google.crypto.tink.AbstractC8082f;
import com.google.crypto.tink.InterfaceC8038a;
import com.google.crypto.tink.proto.C8162l;
import com.google.crypto.tink.proto.C8166m;
import com.google.crypto.tink.proto.C8189y;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.subtle.C8323c;
import com.google.crypto.tink.subtle.C8345r;
import com.google.crypto.tink.subtle.C8347s;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.aead.f */
/* loaded from: classes3.dex */
public final class C8051f extends AbstractC8082f<C8162l> {

    /* renamed from: com.google.crypto.tink.aead.f$a */
    /* loaded from: classes3.dex */
    public class C8052a extends AbstractC8082f.AbstractC8084b<InterfaceC8038a, C8162l> {
        public C8052a() {
            super(InterfaceC8038a.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8084b
        /* renamed from: a */
        public final InterfaceC8038a mo4171a(C8162l c8162l) throws GeneralSecurityException {
            return new C8323c(c8162l.m4014v().m3820r());
        }
    }

    /* renamed from: com.google.crypto.tink.aead.f$b */
    /* loaded from: classes3.dex */
    public class C8053b extends AbstractC8082f.AbstractC8083a<C8166m, C8162l> {
        public C8053b() {
            super(C8166m.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: a */
        public final C8162l mo4170a(C8166m c8166m) throws GeneralSecurityException {
            C8162l.C8163a m4012x = C8162l.m4012x();
            byte[] m3419a = C8345r.m3419a(c8166m.m4006u());
            AbstractC8228i.C8234f m3821i = AbstractC8228i.m3821i(0, m3419a, m3419a.length);
            m4012x.m3461k();
            C8162l.m4015u((C8162l) m4012x.f16130b, m3821i);
            C8051f.this.getClass();
            m4012x.m3461k();
            C8162l.m4016t((C8162l) m4012x.f16130b);
            return m4012x.m3463i();
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: b */
        public final C8166m mo4169b(AbstractC8228i abstractC8228i) throws C8202b0 {
            return C8166m.m4004w(abstractC8228i, C8277q.m3569a());
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: c */
        public final void mo4168c(C8166m c8166m) throws GeneralSecurityException {
            C8347s.m3418a(c8166m.m4006u());
        }
    }

    public C8051f() {
        super(C8162l.class, new C8052a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: a */
    public final String mo4178a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: c */
    public final AbstractC8082f.AbstractC8083a<?, C8162l> mo4177c() {
        return new C8053b();
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: d */
    public final C8189y.EnumC8191b mo4176d() {
        return C8189y.EnumC8191b.SYMMETRIC;
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: e */
    public final C8162l mo4175e(AbstractC8228i abstractC8228i) throws C8202b0 {
        return C8162l.m4011y(abstractC8228i, C8277q.m3569a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: f */
    public final void mo4174f(C8162l c8162l) throws GeneralSecurityException {
        C8162l c8162l2 = c8162l;
        C8347s.m3416c(c8162l2.m4013w());
        C8347s.m3418a(c8162l2.m4014v().size());
    }
}
