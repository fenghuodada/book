package com.google.crypto.tink;

import com.google.crypto.tink.AbstractC8082f;
import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.proto.C8189y;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8287r0;
import java.security.GeneralSecurityException;

@Alpha
/* renamed from: com.google.crypto.tink.d */
/* loaded from: classes3.dex */
public final class C8074d<PrimitiveT, KeyProtoT extends InterfaceC8287r0> {

    /* renamed from: a */
    public final AbstractC8082f<KeyProtoT> f15866a;

    /* renamed from: b */
    public final Class<PrimitiveT> f15867b;

    public C8074d(AbstractC8082f<KeyProtoT> abstractC8082f, Class<PrimitiveT> cls) {
        if (!abstractC8082f.f15874b.keySet().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", abstractC8082f.toString(), cls.getName()));
        }
        this.f15866a = abstractC8082f;
        this.f15867b = cls;
    }

    /* renamed from: a */
    public final PrimitiveT m4207a(AbstractC8228i abstractC8228i) throws GeneralSecurityException {
        AbstractC8082f<KeyProtoT> abstractC8082f = this.f15866a;
        try {
            KeyProtoT mo4175e = abstractC8082f.mo4175e(abstractC8228i);
            Class cls = (Class<PrimitiveT>) this.f15867b;
            if (!Void.class.equals(cls)) {
                abstractC8082f.mo4174f(mo4175e);
                return (PrimitiveT) abstractC8082f.m4204b(mo4175e, cls);
            }
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        } catch (C8202b0 e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(abstractC8082f.f15873a.getName()), e);
        }
    }

    /* renamed from: b */
    public final C8189y m4206b(AbstractC8228i abstractC8228i) throws GeneralSecurityException {
        AbstractC8082f<KeyProtoT> abstractC8082f = this.f15866a;
        try {
            AbstractC8082f.AbstractC8083a<?, KeyProtoT> mo4177c = abstractC8082f.mo4177c();
            Object mo4169b = mo4177c.mo4169b(abstractC8228i);
            mo4177c.mo4168c(mo4169b);
            C8189y.C8190a m3946A = C8189y.m3946A();
            String mo4178a = abstractC8082f.mo4178a();
            m3946A.m3461k();
            C8189y.m3944t((C8189y) m3946A.f16130b, mo4178a);
            AbstractC8228i.C8234f mo3557b = mo4177c.mo4170a(mo4169b).mo3557b();
            m3946A.m3461k();
            C8189y.m3943u((C8189y) m3946A.f16130b, mo3557b);
            C8189y.EnumC8191b mo4176d = abstractC8082f.mo4176d();
            m3946A.m3461k();
            C8189y.m3942v((C8189y) m3946A.f16130b, mo4176d);
            return m3946A.m3463i();
        } catch (C8202b0 e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }
}
