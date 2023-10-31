package com.google.gson.internal.bind;

import com.google.gson.AbstractC8576a0;
import com.google.gson.C8686j;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.C8696a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/* renamed from: com.google.gson.internal.bind.d */
/* loaded from: classes3.dex */
public final class C8653d<T> extends AbstractC8576a0<T> {

    /* renamed from: a */
    public final C8686j f16444a;

    /* renamed from: b */
    public final AbstractC8576a0<T> f16445b;

    /* renamed from: c */
    public final Type f16446c;

    public C8653d(C8686j c8686j, AbstractC8576a0<T> abstractC8576a0, Type type) {
        this.f16444a = c8686j;
        this.f16445b = abstractC8576a0;
        this.f16446c = type;
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: a */
    public final T mo3199a(JsonReader jsonReader) throws IOException {
        return this.f16445b.mo3199a(jsonReader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: b */
    public final void mo3198b(JsonWriter jsonWriter, T t) throws IOException {
        Class<?> cls;
        ?? r0 = this.f16446c;
        if (t != null && (r0 == Object.class || (r0 instanceof TypeVariable) || (r0 instanceof Class))) {
            cls = t.getClass();
        } else {
            cls = r0;
        }
        AbstractC8576a0<T> abstractC8576a0 = this.f16445b;
        if (cls != r0) {
            AbstractC8576a0<T> m3233e = this.f16444a.m3233e(C8696a.get((Type) cls));
            if (!(m3233e instanceof ReflectiveTypeAdapterFactory.C8604a) || (abstractC8576a0 instanceof ReflectiveTypeAdapterFactory.C8604a)) {
                abstractC8576a0 = m3233e;
            }
        }
        abstractC8576a0.mo3198b(jsonWriter, t);
    }
}
