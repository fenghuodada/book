package com.google.gson;

import com.bumptech.glide.load.data.mediastore.C3468a;
import com.google.gson.EnumC8579c;
import com.google.gson.EnumC8704y;
import com.google.gson.internal.C8658f;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.reflect.C8696a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.gson.j */
/* loaded from: classes3.dex */
public final class C8686j {

    /* renamed from: m */
    public static final C8696a<?> f16490m = C8696a.get(Object.class);

    /* renamed from: a */
    public final ThreadLocal<Map<C8696a<?>, C8687a<?>>> f16491a;

    /* renamed from: b */
    public final ConcurrentHashMap f16492b;

    /* renamed from: c */
    public final C8658f f16493c;

    /* renamed from: d */
    public final JsonAdapterAnnotationTypeAdapterFactory f16494d;

    /* renamed from: e */
    public final List<InterfaceC8578b0> f16495e;

    /* renamed from: f */
    public final boolean f16496f;

    /* renamed from: g */
    public final boolean f16497g;

    /* renamed from: h */
    public final boolean f16498h;

    /* renamed from: i */
    public final boolean f16499i;

    /* renamed from: j */
    public final boolean f16500j;

    /* renamed from: k */
    public final List<InterfaceC8578b0> f16501k;

    /* renamed from: l */
    public final List<InterfaceC8578b0> f16502l;

    /* renamed from: com.google.gson.j$a */
    /* loaded from: classes3.dex */
    public static class C8687a<T> extends AbstractC8576a0<T> {

        /* renamed from: a */
        public AbstractC8576a0<T> f16503a;

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: a */
        public final T mo3199a(JsonReader jsonReader) throws IOException {
            AbstractC8576a0<T> abstractC8576a0 = this.f16503a;
            if (abstractC8576a0 != null) {
                return abstractC8576a0.mo3199a(jsonReader);
            }
            throw new IllegalStateException();
        }

        @Override // com.google.gson.AbstractC8576a0
        /* renamed from: b */
        public final void mo3198b(JsonWriter jsonWriter, T t) throws IOException {
            AbstractC8576a0<T> abstractC8576a0 = this.f16503a;
            if (abstractC8576a0 == null) {
                throw new IllegalStateException();
            }
            abstractC8576a0.mo3198b(jsonWriter, t);
        }
    }

    public C8686j() {
        this(Excluder.f16317f, EnumC8579c.f16313a, Collections.emptyMap(), true, false, EnumC8704y.f16519a, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public C8686j(Excluder excluder, EnumC8579c.C8580a c8580a, Map map, boolean z, boolean z2, EnumC8704y.C8705a c8705a, List list, List list2, List list3) {
        this.f16491a = new ThreadLocal<>();
        this.f16492b = new ConcurrentHashMap();
        C8658f c8658f = new C8658f(map);
        this.f16493c = c8658f;
        this.f16496f = false;
        this.f16497g = false;
        this.f16498h = z;
        this.f16499i = z2;
        this.f16500j = false;
        this.f16501k = list;
        this.f16502l = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.f16381B);
        arrayList.add(ObjectTypeAdapter.f16351b);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.f16398p);
        arrayList.add(TypeAdapters.f16389g);
        arrayList.add(TypeAdapters.f16386d);
        arrayList.add(TypeAdapters.f16387e);
        arrayList.add(TypeAdapters.f16388f);
        AbstractC8576a0 c8589g = c8705a == EnumC8704y.f16519a ? TypeAdapters.f16393k : new C8589g();
        arrayList.add(TypeAdapters.m3268c(Long.TYPE, Long.class, c8589g));
        arrayList.add(TypeAdapters.m3268c(Double.TYPE, Double.class, new C8587e()));
        arrayList.add(TypeAdapters.m3268c(Float.TYPE, Float.class, new C8588f()));
        arrayList.add(TypeAdapters.f16394l);
        arrayList.add(TypeAdapters.f16390h);
        arrayList.add(TypeAdapters.f16391i);
        arrayList.add(TypeAdapters.m3269b(AtomicLong.class, new C8707z(new C8590h(c8589g))));
        arrayList.add(TypeAdapters.m3269b(AtomicLongArray.class, new C8707z(new C8591i(c8589g))));
        arrayList.add(TypeAdapters.f16392j);
        arrayList.add(TypeAdapters.f16395m);
        arrayList.add(TypeAdapters.f16399q);
        arrayList.add(TypeAdapters.f16400r);
        arrayList.add(TypeAdapters.m3269b(BigDecimal.class, TypeAdapters.f16396n));
        arrayList.add(TypeAdapters.m3269b(BigInteger.class, TypeAdapters.f16397o));
        arrayList.add(TypeAdapters.f16401s);
        arrayList.add(TypeAdapters.f16402t);
        arrayList.add(TypeAdapters.f16404v);
        arrayList.add(TypeAdapters.f16405w);
        arrayList.add(TypeAdapters.f16408z);
        arrayList.add(TypeAdapters.f16403u);
        arrayList.add(TypeAdapters.f16384b);
        arrayList.add(DateTypeAdapter.f16342b);
        arrayList.add(TypeAdapters.f16407y);
        arrayList.add(TimeTypeAdapter.f16366b);
        arrayList.add(SqlDateTypeAdapter.f16364b);
        arrayList.add(TypeAdapters.f16406x);
        arrayList.add(ArrayTypeAdapter.f16336c);
        arrayList.add(TypeAdapters.f16383a);
        arrayList.add(new CollectionTypeAdapterFactory(c8658f));
        arrayList.add(new MapTypeAdapterFactory(c8658f));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(c8658f);
        this.f16494d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.f16382C);
        arrayList.add(new ReflectiveTypeAdapterFactory(c8658f, c8580a, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f16495e = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    public static void m3237a(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* renamed from: b */
    public final <T> T m3236b(JsonReader jsonReader, Type type) throws C8693p, C8703x {
        boolean isLenient = jsonReader.isLenient();
        boolean z = true;
        jsonReader.setLenient(true);
        try {
            try {
                try {
                    jsonReader.peek();
                    z = false;
                    T mo3199a = m3233e(C8696a.get(type)).mo3199a(jsonReader);
                    jsonReader.setLenient(isLenient);
                    return mo3199a;
                } catch (EOFException e) {
                    if (z) {
                        jsonReader.setLenient(isLenient);
                        return null;
                    }
                    throw new C8703x(e);
                } catch (AssertionError e2) {
                    AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
                    assertionError.initCause(e2);
                    throw assertionError;
                }
            } catch (IOException e3) {
                throw new C8703x(e3);
            } catch (IllegalStateException e4) {
                throw new C8703x(e4);
            }
        } catch (Throwable th) {
            jsonReader.setLenient(isLenient);
            throw th;
        }
    }

    /* renamed from: c */
    public final Object m3235c(Class cls, String str) throws C8703x {
        return C3468a.m6719a(cls).cast(m3234d(str, cls));
    }

    /* renamed from: d */
    public final <T> T m3234d(String str, Type type) throws C8703x {
        if (str == null) {
            return null;
        }
        JsonReader jsonReader = new JsonReader(new StringReader(str));
        jsonReader.setLenient(this.f16500j);
        T t = (T) m3236b(jsonReader, type);
        if (t != null) {
            try {
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw new C8693p("JSON document was not fully consumed.");
                }
            } catch (MalformedJsonException e) {
                throw new C8703x(e);
            } catch (IOException e2) {
                throw new C8693p(e2);
            }
        }
        return t;
    }

    /* renamed from: e */
    public final <T> AbstractC8576a0<T> m3233e(C8696a<T> c8696a) {
        Object obj;
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.f16492b;
        if (c8696a == null) {
            obj = f16490m;
        } else {
            obj = c8696a;
        }
        AbstractC8576a0<T> abstractC8576a0 = (AbstractC8576a0) concurrentHashMap.get(obj);
        if (abstractC8576a0 != null) {
            return abstractC8576a0;
        }
        ThreadLocal<Map<C8696a<?>, C8687a<?>>> threadLocal = this.f16491a;
        Map<C8696a<?>, C8687a<?>> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
            z = true;
        } else {
            z = false;
        }
        C8687a<?> c8687a = map.get(c8696a);
        if (c8687a != null) {
            return c8687a;
        }
        try {
            C8687a<?> c8687a2 = new C8687a<>();
            map.put(c8696a, c8687a2);
            for (InterfaceC8578b0 interfaceC8578b0 : this.f16495e) {
                AbstractC8576a0<T> mo3267a = interfaceC8578b0.mo3267a(this, c8696a);
                if (mo3267a != null) {
                    if (c8687a2.f16503a == null) {
                        c8687a2.f16503a = mo3267a;
                        concurrentHashMap.put(c8696a, mo3267a);
                        return mo3267a;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + c8696a);
        } finally {
            map.remove(c8696a);
            if (z) {
                threadLocal.remove();
            }
        }
    }

    /* renamed from: f */
    public final <T> AbstractC8576a0<T> m3232f(InterfaceC8578b0 interfaceC8578b0, C8696a<T> c8696a) {
        List<InterfaceC8578b0> list = this.f16495e;
        if (!list.contains(interfaceC8578b0)) {
            interfaceC8578b0 = this.f16494d;
        }
        boolean z = false;
        for (InterfaceC8578b0 interfaceC8578b02 : list) {
            if (z) {
                AbstractC8576a0<T> mo3267a = interfaceC8578b02.mo3267a(this, c8696a);
                if (mo3267a != null) {
                    return mo3267a;
                }
            } else if (interfaceC8578b02 == interfaceC8578b0) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + c8696a);
    }

    /* renamed from: g */
    public final JsonWriter m3231g(Writer writer) throws IOException {
        if (this.f16497g) {
            writer.write(")]}'\n");
        }
        JsonWriter jsonWriter = new JsonWriter(writer);
        if (this.f16499i) {
            jsonWriter.setIndent("  ");
        }
        jsonWriter.setSerializeNulls(this.f16496f);
        return jsonWriter;
    }

    /* renamed from: h */
    public final String m3230h(Object obj) {
        if (obj == null) {
            AbstractC8692o abstractC8692o = C8694q.f16515a;
            StringWriter stringWriter = new StringWriter();
            try {
                m3228j(abstractC8692o, m3231g(stringWriter));
                return stringWriter.toString();
            } catch (IOException e) {
                throw new C8693p(e);
            }
        }
        return m3229i(obj, obj.getClass());
    }

    /* renamed from: i */
    public final String m3229i(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        try {
            m3227k(obj, type, m3231g(stringWriter));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new C8693p(e);
        }
    }

    /* renamed from: j */
    public final void m3228j(AbstractC8692o abstractC8692o, JsonWriter jsonWriter) throws C8693p {
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f16498h);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f16496f);
        try {
            try {
                TypeAdapters.f16380A.mo3198b(jsonWriter, abstractC8692o);
            } catch (IOException e) {
                throw new C8693p(e);
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    /* renamed from: k */
    public final void m3227k(Object obj, Type type, JsonWriter jsonWriter) throws C8693p {
        AbstractC8576a0 m3233e = m3233e(C8696a.get(type));
        boolean isLenient = jsonWriter.isLenient();
        jsonWriter.setLenient(true);
        boolean isHtmlSafe = jsonWriter.isHtmlSafe();
        jsonWriter.setHtmlSafe(this.f16498h);
        boolean serializeNulls = jsonWriter.getSerializeNulls();
        jsonWriter.setSerializeNulls(this.f16496f);
        try {
            try {
                try {
                    m3233e.mo3198b(jsonWriter, obj);
                } catch (IOException e) {
                    throw new C8693p(e);
                }
            } catch (AssertionError e2) {
                AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e2.getMessage());
                assertionError.initCause(e2);
                throw assertionError;
            }
        } finally {
            jsonWriter.setLenient(isLenient);
            jsonWriter.setHtmlSafe(isHtmlSafe);
            jsonWriter.setSerializeNulls(serializeNulls);
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f16496f + ",factories:" + this.f16495e + ",instanceCreators:" + this.f16493c + "}";
    }
}
