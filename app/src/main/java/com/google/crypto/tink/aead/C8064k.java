package com.google.crypto.tink.aead;

import com.google.crypto.tink.AbstractC8082f;
import com.google.crypto.tink.C8095j;
import com.google.crypto.tink.InterfaceC8038a;
import com.google.crypto.tink.proto.C8145g0;
import com.google.crypto.tink.proto.C8149h0;
import com.google.crypto.tink.proto.C8189y;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.subtle.C8347s;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.aead.k */
/* loaded from: classes3.dex */
public final class C8064k extends AbstractC8082f<C8145g0> {

    /* renamed from: com.google.crypto.tink.aead.k$a */
    /* loaded from: classes3.dex */
    public class C8065a extends AbstractC8082f.AbstractC8084b<InterfaceC8038a, C8145g0> {
        public C8065a() {
            super(InterfaceC8038a.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8084b
        /* renamed from: a */
        public final InterfaceC8038a mo4171a(C8145g0 c8145g0) throws GeneralSecurityException {
            C8145g0 c8145g02 = c8145g0;
            String m4044v = c8145g02.m4054v().m4044v();
            return new C8063j(c8145g02.m4054v().m4045u(), C8095j.m4182a(m4044v).mo4186b(m4044v));
        }
    }

    /* renamed from: com.google.crypto.tink.aead.k$b */
    /* loaded from: classes3.dex */
    public class C8066b extends AbstractC8082f.AbstractC8083a<C8149h0, C8145g0> {
        public C8066b() {
            super(C8149h0.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: a */
        public final C8145g0 mo4170a(C8149h0 c8149h0) throws GeneralSecurityException {
            C8145g0.C8146a m4052x = C8145g0.m4052x();
            m4052x.m3461k();
            C8145g0.m4055u((C8145g0) m4052x.f16130b, c8149h0);
            C8064k.this.getClass();
            m4052x.m3461k();
            C8145g0.m4056t((C8145g0) m4052x.f16130b);
            return m4052x.m3463i();
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: b */
        public final C8149h0 mo4169b(AbstractC8228i abstractC8228i) throws C8202b0 {
            return C8149h0.m4043w(abstractC8228i, C8277q.m3569a());
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo4168c(C8149h0 c8149h0) throws GeneralSecurityException {
        }
    }

    public C8064k() {
        super(C8145g0.class, new C8065a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: a */
    public final String mo4178a() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: c */
    public final AbstractC8082f.AbstractC8083a<?, C8145g0> mo4177c() {
        return new C8066b();
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: d */
    public final C8189y.EnumC8191b mo4176d() {
        return C8189y.EnumC8191b.REMOTE;
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: e */
    public final C8145g0 mo4175e(AbstractC8228i abstractC8228i) throws C8202b0 {
        return C8145g0.m4051y(abstractC8228i, C8277q.m3569a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: f */
    public final void mo4174f(C8145g0 c8145g0) throws GeneralSecurityException {
        C8347s.m3416c(c8145g0.m4053w());
    }
}
