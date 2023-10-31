package com.google.gson.internal;

import java.lang.reflect.Method;

/* renamed from: com.google.gson.internal.s */
/* loaded from: classes3.dex */
public final class C8683s extends AbstractC8685u {

    /* renamed from: a */
    public final /* synthetic */ Method f16489a;

    public C8683s(Method method) {
        this.f16489a = method;
    }

    @Override // com.google.gson.internal.AbstractC8685u
    /* renamed from: b */
    public final <T> T mo3238b(Class<T> cls) throws Exception {
        AbstractC8685u.m3239a(cls);
        return (T) this.f16489a.invoke(null, cls, Object.class);
    }
}
