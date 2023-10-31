package com.google.gson.internal.bind;

import com.google.gson.AbstractC8576a0;
import com.google.gson.C8686j;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.reflect.C8696a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;

/* renamed from: com.google.gson.internal.bind.c */
/* loaded from: classes3.dex */
public final class C8652c extends ReflectiveTypeAdapterFactory.AbstractC8605b {

    /* renamed from: d */
    public final /* synthetic */ Field f16438d;

    /* renamed from: e */
    public final /* synthetic */ boolean f16439e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC8576a0 f16440f;

    /* renamed from: g */
    public final /* synthetic */ C8686j f16441g;

    /* renamed from: h */
    public final /* synthetic */ C8696a f16442h;

    /* renamed from: i */
    public final /* synthetic */ boolean f16443i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8652c(String str, boolean z, boolean z2, Field field, boolean z3, AbstractC8576a0 abstractC8576a0, C8686j c8686j, C8696a c8696a, boolean z4) {
        super(str, z, z2);
        this.f16438d = field;
        this.f16439e = z3;
        this.f16440f = abstractC8576a0;
        this.f16441g = c8686j;
        this.f16442h = c8696a;
        this.f16443i = z4;
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC8605b
    /* renamed from: a */
    public final void mo3257a(JsonReader jsonReader, Object obj) throws IOException, IllegalAccessException {
        Object mo3199a = this.f16440f.mo3199a(jsonReader);
        if (mo3199a == null && this.f16443i) {
            return;
        }
        this.f16438d.set(obj, mo3199a);
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC8605b
    /* renamed from: b */
    public final void mo3256b(JsonWriter jsonWriter, Object obj) throws IOException, IllegalAccessException {
        Object obj2 = this.f16438d.get(obj);
        boolean z = this.f16439e;
        AbstractC8576a0 abstractC8576a0 = this.f16440f;
        if (!z) {
            abstractC8576a0 = new C8653d(this.f16441g, abstractC8576a0, this.f16442h.getType());
        }
        abstractC8576a0.mo3198b(jsonWriter, obj2);
    }

    @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.AbstractC8605b
    /* renamed from: c */
    public final boolean mo3255c(Object obj) throws IOException, IllegalAccessException {
        return this.f16362b && this.f16438d.get(obj) != obj;
    }
}
