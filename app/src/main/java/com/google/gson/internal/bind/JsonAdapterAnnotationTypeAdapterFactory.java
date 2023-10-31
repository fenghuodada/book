package com.google.gson.internal.bind;

import com.google.gson.AbstractC8576a0;
import com.google.gson.C8686j;
import com.google.gson.C8707z;
import com.google.gson.InterfaceC8578b0;
import com.google.gson.InterfaceC8691n;
import com.google.gson.InterfaceC8702w;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.internal.C8658f;
import com.google.gson.reflect.C8696a;

/* loaded from: classes3.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements InterfaceC8578b0 {

    /* renamed from: a */
    public final C8658f f16344a;

    public JsonAdapterAnnotationTypeAdapterFactory(C8658f c8658f) {
        this.f16344a = c8658f;
    }

    /* renamed from: b */
    public static AbstractC8576a0 m3273b(C8658f c8658f, C8686j c8686j, C8696a c8696a, JsonAdapter jsonAdapter) {
        InterfaceC8702w interfaceC8702w;
        AbstractC8576a0 treeTypeAdapter;
        Object mo3242a = c8658f.m3251a(C8696a.get((Class) jsonAdapter.value())).mo3242a();
        if (mo3242a instanceof AbstractC8576a0) {
            treeTypeAdapter = (AbstractC8576a0) mo3242a;
        } else if (mo3242a instanceof InterfaceC8578b0) {
            treeTypeAdapter = ((InterfaceC8578b0) mo3242a).mo3267a(c8686j, c8696a);
        } else {
            boolean z = mo3242a instanceof InterfaceC8702w;
            if (!z && !(mo3242a instanceof InterfaceC8691n)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + mo3242a.getClass().getName() + " as a @JsonAdapter for " + c8696a.toString() + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            InterfaceC8691n interfaceC8691n = null;
            if (z) {
                interfaceC8702w = (InterfaceC8702w) mo3242a;
            } else {
                interfaceC8702w = null;
            }
            if (mo3242a instanceof InterfaceC8691n) {
                interfaceC8691n = (InterfaceC8691n) mo3242a;
            }
            treeTypeAdapter = new TreeTypeAdapter(interfaceC8702w, interfaceC8691n, c8686j, c8696a, null);
        }
        if (treeTypeAdapter != null && jsonAdapter.nullSafe()) {
            return new C8707z(treeTypeAdapter);
        }
        return treeTypeAdapter;
    }

    @Override // com.google.gson.InterfaceC8578b0
    /* renamed from: a */
    public final <T> AbstractC8576a0<T> mo3267a(C8686j c8686j, C8696a<T> c8696a) {
        JsonAdapter jsonAdapter = (JsonAdapter) c8696a.getRawType().getAnnotation(JsonAdapter.class);
        if (jsonAdapter == null) {
            return null;
        }
        return m3273b(this.f16344a, c8686j, c8696a, jsonAdapter);
    }
}
