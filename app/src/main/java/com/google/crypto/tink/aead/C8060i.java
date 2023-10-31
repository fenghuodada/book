package com.google.crypto.tink.aead;

import com.google.crypto.tink.AbstractC8082f;
import com.google.crypto.tink.C8095j;
import com.google.crypto.tink.InterfaceC8038a;
import com.google.crypto.tink.proto.C8137e0;
import com.google.crypto.tink.proto.C8141f0;
import com.google.crypto.tink.proto.C8189y;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.C8277q;
import com.google.crypto.tink.subtle.C8347s;
import java.security.GeneralSecurityException;

/* renamed from: com.google.crypto.tink.aead.i */
/* loaded from: classes3.dex */
public final class C8060i extends AbstractC8082f<C8137e0> {

    /* renamed from: com.google.crypto.tink.aead.i$a */
    /* loaded from: classes3.dex */
    public class C8061a extends AbstractC8082f.AbstractC8084b<InterfaceC8038a, C8137e0> {
        public C8061a() {
            super(InterfaceC8038a.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8084b
        /* renamed from: a */
        public final InterfaceC8038a mo4171a(C8137e0 c8137e0) throws GeneralSecurityException {
            String m4064u = c8137e0.m4080v().m4064u();
            return C8095j.m4182a(m4064u).mo4186b(m4064u);
        }
    }

    /* renamed from: com.google.crypto.tink.aead.i$b */
    /* loaded from: classes3.dex */
    public class C8062b extends AbstractC8082f.AbstractC8083a<C8141f0, C8137e0> {
        public C8062b() {
            super(C8141f0.class);
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: a */
        public final C8137e0 mo4170a(C8141f0 c8141f0) throws GeneralSecurityException {
            C8137e0.C8138a m4078x = C8137e0.m4078x();
            m4078x.m3461k();
            C8137e0.m4081u((C8137e0) m4078x.f16130b, c8141f0);
            C8060i.this.getClass();
            m4078x.m3461k();
            C8137e0.m4082t((C8137e0) m4078x.f16130b);
            return m4078x.m3463i();
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: b */
        public final C8141f0 mo4169b(AbstractC8228i abstractC8228i) throws C8202b0 {
            return C8141f0.m4063v(abstractC8228i, C8277q.m3569a());
        }

        @Override // com.google.crypto.tink.AbstractC8082f.AbstractC8083a
        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo4168c(C8141f0 c8141f0) throws GeneralSecurityException {
        }
    }

    public C8060i() {
        super(C8137e0.class, new C8061a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: a */
    public final String mo4178a() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: c */
    public final AbstractC8082f.AbstractC8083a<?, C8137e0> mo4177c() {
        return new C8062b();
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: d */
    public final C8189y.EnumC8191b mo4176d() {
        return C8189y.EnumC8191b.REMOTE;
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: e */
    public final C8137e0 mo4175e(AbstractC8228i abstractC8228i) throws C8202b0 {
        return C8137e0.m4077y(abstractC8228i, C8277q.m3569a());
    }

    @Override // com.google.crypto.tink.AbstractC8082f
    /* renamed from: f */
    public final void mo4174f(C8137e0 c8137e0) throws GeneralSecurityException {
        C8347s.m3416c(c8137e0.m4079w());
    }
}
