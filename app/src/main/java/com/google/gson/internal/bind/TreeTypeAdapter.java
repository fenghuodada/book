package com.google.gson.internal.bind;

import com.google.gson.AbstractC8576a0;
import com.google.gson.AbstractC8692o;
import com.google.gson.C8686j;
import com.google.gson.C8694q;
import com.google.gson.InterfaceC8578b0;
import com.google.gson.InterfaceC8691n;
import com.google.gson.InterfaceC8701v;
import com.google.gson.InterfaceC8702w;
import com.google.gson.internal.C8677p;
import com.google.gson.reflect.C8696a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import libv2ray.C11166a;

/* loaded from: classes3.dex */
public final class TreeTypeAdapter<T> extends AbstractC8576a0<T> {

    /* renamed from: a */
    public final InterfaceC8702w<T> f16368a;

    /* renamed from: b */
    public final InterfaceC8691n<T> f16369b;

    /* renamed from: c */
    public final C8686j f16370c;

    /* renamed from: d */
    public final C8696a<T> f16371d;

    /* renamed from: e */
    public final InterfaceC8578b0 f16372e;

    /* renamed from: f */
    public final TreeTypeAdapter<T>.C8608a f16373f = new C8608a();

    /* renamed from: g */
    public AbstractC8576a0<T> f16374g;

    /* loaded from: classes3.dex */
    public static final class SingleTypeFactory implements InterfaceC8578b0 {

        /* renamed from: a */
        public final C8696a<?> f16375a;

        /* renamed from: b */
        public final boolean f16376b;

        /* renamed from: c */
        public final Class<?> f16377c;

        /* renamed from: d */
        public final InterfaceC8702w<?> f16378d;

        /* renamed from: e */
        public final InterfaceC8691n<?> f16379e;

        public SingleTypeFactory(C11166a c11166a, C8696a c8696a, boolean z) {
            this.f16378d = c11166a;
            this.f16379e = c11166a instanceof InterfaceC8691n ? (InterfaceC8691n) c11166a : null;
            this.f16375a = c8696a;
            this.f16376b = z;
            this.f16377c = null;
        }

        @Override // com.google.gson.InterfaceC8578b0
        /* renamed from: a */
        public final <T> AbstractC8576a0<T> mo3267a(C8686j c8686j, C8696a<T> c8696a) {
            C8696a<?> c8696a2 = this.f16375a;
            if (c8696a2 != null ? c8696a2.equals(c8696a) || (this.f16376b && c8696a2.getType() == c8696a.getRawType()) : this.f16377c.isAssignableFrom(c8696a.getRawType())) {
                return new TreeTypeAdapter(this.f16378d, this.f16379e, c8686j, c8696a, this);
            }
            return null;
        }
    }

    /* renamed from: com.google.gson.internal.bind.TreeTypeAdapter$a */
    /* loaded from: classes3.dex */
    public final class C8608a implements InterfaceC8701v {
    }

    public TreeTypeAdapter(InterfaceC8702w<T> interfaceC8702w, InterfaceC8691n<T> interfaceC8691n, C8686j c8686j, C8696a<T> c8696a, InterfaceC8578b0 interfaceC8578b0) {
        this.f16368a = interfaceC8702w;
        this.f16369b = interfaceC8691n;
        this.f16370c = c8686j;
        this.f16371d = c8696a;
        this.f16372e = interfaceC8578b0;
    }

    /* renamed from: c */
    public static InterfaceC8578b0 m3271c(C8696a c8696a, C11166a c11166a) {
        return new SingleTypeFactory(c11166a, c8696a, c8696a.getType() == c8696a.getRawType());
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: a */
    public final T mo3199a(JsonReader jsonReader) throws IOException {
        C8696a<T> c8696a = this.f16371d;
        InterfaceC8691n<T> interfaceC8691n = this.f16369b;
        if (interfaceC8691n == null) {
            AbstractC8576a0<T> abstractC8576a0 = this.f16374g;
            if (abstractC8576a0 == null) {
                abstractC8576a0 = this.f16370c.m3232f(this.f16372e, c8696a);
                this.f16374g = abstractC8576a0;
            }
            return abstractC8576a0.mo3199a(jsonReader);
        }
        AbstractC8692o m3241a = C8677p.m3241a(jsonReader);
        m3241a.getClass();
        if (m3241a instanceof C8694q) {
            return null;
        }
        c8696a.getType();
        return (T) interfaceC8691n.deserialize();
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: b */
    public final void mo3198b(JsonWriter jsonWriter, T t) throws IOException {
        C8696a<T> c8696a = this.f16371d;
        InterfaceC8702w<T> interfaceC8702w = this.f16368a;
        if (interfaceC8702w == null) {
            AbstractC8576a0<T> abstractC8576a0 = this.f16374g;
            if (abstractC8576a0 == null) {
                abstractC8576a0 = this.f16370c.m3232f(this.f16372e, c8696a);
                this.f16374g = abstractC8576a0;
            }
            abstractC8576a0.mo3198b(jsonWriter, t);
        } else if (t == null) {
            jsonWriter.nullValue();
        } else {
            TypeAdapters.f16380A.mo3198b(jsonWriter, interfaceC8702w.mo97a(t, c8696a.getType(), this.f16373f));
        }
    }
}
