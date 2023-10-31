package com.google.gson.internal.bind;

import com.google.gson.AbstractC8576a0;
import com.google.gson.C8686j;
import com.google.gson.InterfaceC8578b0;
import com.google.gson.internal.C8593a;
import com.google.gson.internal.C8658f;
import com.google.gson.internal.InterfaceC8676o;
import com.google.gson.reflect.C8696a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class CollectionTypeAdapterFactory implements InterfaceC8578b0 {

    /* renamed from: a */
    public final C8658f f16339a;

    /* renamed from: com.google.gson.internal.bind.CollectionTypeAdapterFactory$a */
    /* loaded from: classes3.dex */
    public static final class C8599a<E> extends AbstractC8576a0<Collection<E>> {

        /* renamed from: a */
        public final C8653d f16340a;

        /* renamed from: b */
        public final InterfaceC8676o<? extends Collection<E>> f16341b;

        public C8599a(C8686j c8686j, Type type, AbstractC8576a0<E> abstractC8576a0, InterfaceC8676o<? extends Collection<E>> interfaceC8676o) {
            this.f16340a = new C8653d(c8686j, abstractC8576a0, type);
            this.f16341b = interfaceC8676o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final Object mo3199a(JsonReader jsonReader) throws IOException {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Collection collection = (Collection) ((Collection<E>) this.f16341b.mo3242a());
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                collection.add(this.f16340a.mo3199a(jsonReader));
            }
            jsonReader.endArray();
            return collection;
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, Object obj) throws IOException {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                jsonWriter.nullValue();
                return;
            }
            jsonWriter.beginArray();
            for (E e : collection) {
                this.f16340a.mo3198b(jsonWriter, e);
            }
            jsonWriter.endArray();
        }
    }

    public CollectionTypeAdapterFactory(C8658f c8658f) {
        this.f16339a = c8658f;
    }

    @Override // com.google.gson.InterfaceC8578b0
    /* renamed from: a */
    public final <T> AbstractC8576a0<T> mo3267a(C8686j c8686j, C8696a<T> c8696a) {
        Type type;
        Type type2 = c8696a.getType();
        Class<? super T> rawType = c8696a.getRawType();
        if (!Collection.class.isAssignableFrom(rawType)) {
            return null;
        }
        Type m3276f = C8593a.m3276f(type2, rawType, Collection.class);
        if (m3276f instanceof WildcardType) {
            m3276f = ((WildcardType) m3276f).getUpperBounds()[0];
        }
        if (m3276f instanceof ParameterizedType) {
            type = ((ParameterizedType) m3276f).getActualTypeArguments()[0];
        } else {
            type = Object.class;
        }
        return new C8599a(c8686j, type, c8686j.m3233e(C8696a.get(type)), this.f16339a.m3251a(c8696a));
    }
}
