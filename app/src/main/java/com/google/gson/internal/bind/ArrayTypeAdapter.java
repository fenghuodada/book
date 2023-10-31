package com.google.gson.internal.bind;

import com.google.gson.AbstractC8576a0;
import com.google.gson.C8686j;
import com.google.gson.InterfaceC8578b0;
import com.google.gson.internal.C8593a;
import com.google.gson.reflect.C8696a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ArrayTypeAdapter<E> extends AbstractC8576a0<Object> {

    /* renamed from: c */
    public static final InterfaceC8578b0 f16336c = new InterfaceC8578b0() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.InterfaceC8578b0
        /* renamed from: a */
        public final <T> AbstractC8576a0<T> mo3267a(C8686j c8686j, C8696a<T> c8696a) {
            Type componentType;
            Type type = c8696a.getType();
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            if (z) {
                componentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                componentType = ((Class) type).getComponentType();
            }
            return new ArrayTypeAdapter(c8686j, c8686j.m3233e(C8696a.get(componentType)), C8593a.m3277e(componentType));
        }
    };

    /* renamed from: a */
    public final Class<E> f16337a;

    /* renamed from: b */
    public final C8653d f16338b;

    public ArrayTypeAdapter(C8686j c8686j, AbstractC8576a0<E> abstractC8576a0, Class<E> cls) {
        this.f16338b = new C8653d(c8686j, abstractC8576a0, cls);
        this.f16337a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: a */
    public final Object mo3199a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(this.f16338b.mo3199a(jsonReader));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.f16337a, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: b */
    public final void mo3198b(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.beginArray();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f16338b.mo3198b(jsonWriter, Array.get(obj, i));
        }
        jsonWriter.endArray();
    }
}
