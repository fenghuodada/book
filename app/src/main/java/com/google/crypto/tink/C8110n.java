package com.google.crypto.tink;

import com.google.crypto.tink.C8112p;
import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.crypto.tink.n */
/* loaded from: classes3.dex */
public final class C8110n implements C8112p.InterfaceC8113a {

    /* renamed from: a */
    public final /* synthetic */ AbstractC8082f f15911a;

    public C8110n(AbstractC8082f abstractC8082f) {
        this.f15911a = abstractC8082f;
    }

    @Override // com.google.crypto.tink.C8112p.InterfaceC8113a
    /* renamed from: a */
    public final C8074d mo4158a(Class cls) throws GeneralSecurityException {
        try {
            return new C8074d(this.f15911a, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    @Override // com.google.crypto.tink.C8112p.InterfaceC8113a
    /* renamed from: b */
    public final C8074d mo4157b() {
        AbstractC8082f abstractC8082f = this.f15911a;
        return new C8074d(abstractC8082f, abstractC8082f.f15875c);
    }

    @Override // com.google.crypto.tink.C8112p.InterfaceC8113a
    /* renamed from: c */
    public final Class<?> mo4156c() {
        return this.f15911a.getClass();
    }

    @Override // com.google.crypto.tink.C8112p.InterfaceC8113a
    /* renamed from: d */
    public final Set<Class<?>> mo4155d() {
        return this.f15911a.f15874b.keySet();
    }
}
