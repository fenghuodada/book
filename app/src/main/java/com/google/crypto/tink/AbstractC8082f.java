package com.google.crypto.tink;

import com.google.crypto.tink.annotations.Alpha;
import com.google.crypto.tink.proto.C8189y;
import com.google.crypto.tink.shaded.protobuf.AbstractC8228i;
import com.google.crypto.tink.shaded.protobuf.C8202b0;
import com.google.crypto.tink.shaded.protobuf.InterfaceC8287r0;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Alpha
/* renamed from: com.google.crypto.tink.f */
/* loaded from: classes3.dex */
public abstract class AbstractC8082f<KeyProtoT extends InterfaceC8287r0> {

    /* renamed from: a */
    public final Class<KeyProtoT> f15873a;

    /* renamed from: b */
    public final Map<Class<?>, AbstractC8084b<?, KeyProtoT>> f15874b;

    /* renamed from: c */
    public final Class<?> f15875c;

    /* renamed from: com.google.crypto.tink.f$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC8083a<KeyFormatProtoT extends InterfaceC8287r0, KeyT> {

        /* renamed from: a */
        public final Class<KeyFormatProtoT> f15876a;

        public AbstractC8083a(Class<KeyFormatProtoT> cls) {
            this.f15876a = cls;
        }

        /* renamed from: a */
        public abstract KeyT mo4170a(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;

        /* renamed from: b */
        public abstract KeyFormatProtoT mo4169b(AbstractC8228i abstractC8228i) throws C8202b0;

        /* renamed from: c */
        public abstract void mo4168c(KeyFormatProtoT keyformatprotot) throws GeneralSecurityException;
    }

    /* renamed from: com.google.crypto.tink.f$b */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC8084b<PrimitiveT, KeyT> {

        /* renamed from: a */
        public final Class<PrimitiveT> f15877a;

        public AbstractC8084b(Class<PrimitiveT> cls) {
            this.f15877a = cls;
        }

        /* renamed from: a */
        public abstract PrimitiveT mo4171a(KeyT keyt) throws GeneralSecurityException;
    }

    @SafeVarargs
    public AbstractC8082f(Class<KeyProtoT> cls, AbstractC8084b<?, KeyProtoT>... abstractC8084bArr) {
        Class<?> cls2;
        this.f15873a = cls;
        HashMap hashMap = new HashMap();
        for (AbstractC8084b<?, KeyProtoT> abstractC8084b : abstractC8084bArr) {
            boolean containsKey = hashMap.containsKey(abstractC8084b.f15877a);
            Class<?> cls3 = abstractC8084b.f15877a;
            if (!containsKey) {
                hashMap.put(cls3, abstractC8084b);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + cls3.getCanonicalName());
            }
        }
        if (abstractC8084bArr.length > 0) {
            cls2 = abstractC8084bArr[0].f15877a;
        } else {
            cls2 = Void.class;
        }
        this.f15875c = cls2;
        this.f15874b = Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: a */
    public abstract String mo4178a();

    /* renamed from: b */
    public final <P> P m4204b(KeyProtoT keyprotot, Class<P> cls) throws GeneralSecurityException {
        AbstractC8084b<?, KeyProtoT> abstractC8084b = this.f15874b.get(cls);
        if (abstractC8084b != null) {
            return (P) abstractC8084b.mo4171a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    /* renamed from: c */
    public abstract AbstractC8083a<?, KeyProtoT> mo4177c();

    /* renamed from: d */
    public abstract C8189y.EnumC8191b mo4176d();

    /* renamed from: e */
    public abstract KeyProtoT mo4175e(AbstractC8228i abstractC8228i) throws C8202b0;

    /* renamed from: f */
    public abstract void mo4174f(KeyProtoT keyprotot) throws GeneralSecurityException;
}
