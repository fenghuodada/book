package com.google.gson.internal;

import java.lang.reflect.Method;

/* renamed from: com.google.gson.internal.q */
/* loaded from: classes3.dex */
public final class C8678q extends AbstractC8685u {

    /* renamed from: a */
    public final /* synthetic */ Method f16481a;

    /* renamed from: b */
    public final /* synthetic */ Object f16482b;

    public C8678q(Method method, Object obj) {
        this.f16481a = method;
        this.f16482b = obj;
    }

    @Override // com.google.gson.internal.AbstractC8685u
    /* renamed from: b */
    public final <T> T mo3238b(Class<T> cls) throws Exception {
        AbstractC8685u.m3239a(cls);
        return (T) this.f16481a.invoke(this.f16482b, cls);
    }
}
