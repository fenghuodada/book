package com.google.gson.internal.bind;

import com.google.gson.AbstractC8576a0;
import com.google.gson.AbstractC8692o;
import com.google.gson.C8686j;
import com.google.gson.C8690m;
import com.google.gson.C8693p;
import com.google.gson.C8694q;
import com.google.gson.C8695r;
import com.google.gson.C8700u;
import com.google.gson.C8703x;
import com.google.gson.InterfaceC8578b0;
import com.google.gson.internal.AbstractC8666l;
import com.google.gson.internal.C8593a;
import com.google.gson.internal.C8658f;
import com.google.gson.internal.InterfaceC8676o;
import com.google.gson.reflect.C8696a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;

/* loaded from: classes3.dex */
public final class MapTypeAdapterFactory implements InterfaceC8578b0 {

    /* renamed from: a */
    public final C8658f f16345a;

    /* renamed from: b */
    public final boolean f16346b = false;

    /* renamed from: com.google.gson.internal.bind.MapTypeAdapterFactory$a */
    /* loaded from: classes3.dex */
    public final class C8601a<K, V> extends AbstractC8576a0<Map<K, V>> {

        /* renamed from: a */
        public final C8653d f16347a;

        /* renamed from: b */
        public final C8653d f16348b;

        /* renamed from: c */
        public final InterfaceC8676o<? extends Map<K, V>> f16349c;

        public C8601a(C8686j c8686j, Type type, AbstractC8576a0<K> abstractC8576a0, Type type2, AbstractC8576a0<V> abstractC8576a02, InterfaceC8676o<? extends Map<K, V>> interfaceC8676o) {
            this.f16347a = new C8653d(c8686j, abstractC8576a0, type);
            this.f16348b = new C8653d(c8686j, abstractC8576a02, type2);
            this.f16349c = interfaceC8676o;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final Object mo3199a(JsonReader jsonReader) throws IOException {
            JsonToken peek = jsonReader.peek();
            if (peek == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            Map map = (Map) ((Map<K, V>) this.f16349c.mo3242a());
            JsonToken jsonToken = JsonToken.BEGIN_ARRAY;
            C8653d c8653d = this.f16348b;
            C8653d c8653d2 = this.f16347a;
            if (peek == jsonToken) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginArray();
                    Object mo3199a = c8653d2.mo3199a(jsonReader);
                    if (map.put(mo3199a, c8653d.mo3199a(jsonReader)) != null) {
                        throw new C8703x("duplicate key: " + mo3199a);
                    }
                    jsonReader.endArray();
                }
                jsonReader.endArray();
            } else {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    AbstractC8666l.INSTANCE.promoteNameToValue(jsonReader);
                    Object mo3199a2 = c8653d2.mo3199a(jsonReader);
                    if (map.put(mo3199a2, c8653d.mo3199a(jsonReader)) != null) {
                        throw new C8703x("duplicate key: " + mo3199a2);
                    }
                }
                jsonReader.endObject();
            }
            return map;
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, Object obj) throws IOException {
            String str;
            boolean z;
            Map map = (Map) obj;
            if (map == null) {
                jsonWriter.nullValue();
                return;
            }
            boolean z2 = MapTypeAdapterFactory.this.f16346b;
            C8653d c8653d = this.f16348b;
            if (!z2) {
                jsonWriter.beginObject();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    jsonWriter.name(String.valueOf(entry.getKey()));
                    c8653d.mo3198b(jsonWriter, entry.getValue());
                }
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z3 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    K key = entry2.getKey();
                    C8653d c8653d2 = this.f16347a;
                    c8653d2.getClass();
                    try {
                        C8650b c8650b = new C8650b();
                        c8653d2.mo3198b(c8650b, key);
                        AbstractC8692o m3260a = c8650b.m3260a();
                        arrayList.add(m3260a);
                        arrayList2.add(entry2.getValue());
                        m3260a.getClass();
                        if (!(m3260a instanceof C8690m) && !(m3260a instanceof C8695r)) {
                            z = false;
                        } else {
                            z = true;
                        }
                        z3 |= z;
                    } catch (IOException e) {
                        throw new C8693p(e);
                    }
                }
                if (z3) {
                    jsonWriter.beginArray();
                    int size = arrayList.size();
                    while (i < size) {
                        jsonWriter.beginArray();
                        TypeAdapters.f16380A.mo3198b(jsonWriter, (AbstractC8692o) arrayList.get(i));
                        c8653d.mo3198b(jsonWriter, arrayList2.get(i));
                        jsonWriter.endArray();
                        i++;
                    }
                    jsonWriter.endArray();
                    return;
                }
                jsonWriter.beginObject();
                int size2 = arrayList.size();
                while (i < size2) {
                    AbstractC8692o abstractC8692o = (AbstractC8692o) arrayList.get(i);
                    abstractC8692o.getClass();
                    boolean z4 = abstractC8692o instanceof C8700u;
                    if (z4) {
                        if (z4) {
                            C8700u c8700u = (C8700u) abstractC8692o;
                            Serializable serializable = c8700u.f16518a;
                            if (serializable instanceof Number) {
                                str = String.valueOf(c8700u.m3201r());
                            } else if (serializable instanceof Boolean) {
                                str = Boolean.toString(c8700u.mo3207b());
                            } else if (serializable instanceof String) {
                                str = c8700u.mo3202p();
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            throw new IllegalStateException("Not a JSON Primitive: " + abstractC8692o);
                        }
                    } else if (abstractC8692o instanceof C8694q) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    jsonWriter.name(str);
                    c8653d.mo3198b(jsonWriter, arrayList2.get(i));
                    i++;
                }
            }
            jsonWriter.endObject();
        }
    }

    public MapTypeAdapterFactory(C8658f c8658f) {
        this.f16345a = c8658f;
    }

    @Override // com.google.gson.InterfaceC8578b0
    /* renamed from: a */
    public final <T> AbstractC8576a0<T> mo3267a(C8686j c8686j, C8696a<T> c8696a) {
        Type[] actualTypeArguments;
        AbstractC8576a0<T> abstractC8576a0;
        Type type = c8696a.getType();
        if (!Map.class.isAssignableFrom(c8696a.getRawType())) {
            return null;
        }
        Class<?> m3277e = C8593a.m3277e(type);
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type m3276f = C8593a.m3276f(type, m3277e, Map.class);
            actualTypeArguments = m3276f instanceof ParameterizedType ? ((ParameterizedType) m3276f).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        if (type2 != Boolean.TYPE && type2 != Boolean.class) {
            abstractC8576a0 = c8686j.m3233e(C8696a.get(type2));
        } else {
            abstractC8576a0 = TypeAdapters.f16385c;
        }
        return new C8601a(c8686j, actualTypeArguments[0], abstractC8576a0, actualTypeArguments[1], c8686j.m3233e(C8696a.get(actualTypeArguments[1])), this.f16345a.m3251a(c8696a));
    }
}
