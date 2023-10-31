package com.google.gson.internal;

import java.lang.reflect.Method;

/* renamed from: com.google.gson.internal.r */
/* loaded from: classes3.dex */
public final class C8679r extends AbstractC8685u {

    /* renamed from: a */
    public final /* synthetic */ Method f16483a;

    /* renamed from: b */
    public final /* synthetic */ int f16484b;

    public C8679r(int i, Method method) {
        this.f16483a = method;
        this.f16484b = i;
    }

    @Override // com.google.gson.internal.AbstractC8685u
    /* renamed from: b */
    public final <T> T mo3238b(Class<T> cls) throws Exception {
        AbstractC8685u.m3239a(cls);
        return (T) this.f16483a.invoke(null, cls, Integer.valueOf(this.f16484b));
    }
}
