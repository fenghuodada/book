package com.google.gson.internal.bind;

import com.google.gson.AbstractC8576a0;
import com.google.gson.C8686j;
import com.google.gson.InterfaceC8578b0;
import com.google.gson.internal.C8668n;
import com.google.gson.reflect.C8696a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ObjectTypeAdapter extends AbstractC8576a0<Object> {

    /* renamed from: b */
    public static final InterfaceC8578b0 f16351b = new InterfaceC8578b0() { // from class: com.google.gson.internal.bind.ObjectTypeAdapter.1
        @Override // com.google.gson.InterfaceC8578b0
        /* renamed from: a */
        public final <T> AbstractC8576a0<T> mo3267a(C8686j c8686j, C8696a<T> c8696a) {
            if (c8696a.getRawType() == Object.class) {
                return new ObjectTypeAdapter(c8686j);
            }
            return null;
        }
    };

    /* renamed from: a */
    public final C8686j f16352a;

    /* renamed from: com.google.gson.internal.bind.ObjectTypeAdapter$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C8603a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16353a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f16353a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16353a[JsonToken.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16353a[JsonToken.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16353a[JsonToken.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16353a[JsonToken.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16353a[JsonToken.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public ObjectTypeAdapter(C8686j c8686j) {
        this.f16352a = c8686j;
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: a */
    public final Object mo3199a(JsonReader jsonReader) throws IOException {
        switch (C8603a.f16353a[jsonReader.peek().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    arrayList.add(mo3199a(jsonReader));
                }
                jsonReader.endArray();
                return arrayList;
            case 2:
                C8668n c8668n = new C8668n();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    c8668n.put(jsonReader.nextName(), mo3199a(jsonReader));
                }
                jsonReader.endObject();
                return c8668n;
            case 3:
                return jsonReader.nextString();
            case 4:
                return Double.valueOf(jsonReader.nextDouble());
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: b */
    public final void mo3198b(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Class<?> cls = obj.getClass();
        C8686j c8686j = this.f16352a;
        c8686j.getClass();
        AbstractC8576a0 m3233e = c8686j.m3233e(C8696a.get((Class) cls));
        if (m3233e instanceof ObjectTypeAdapter) {
            jsonWriter.beginObject();
            jsonWriter.endObject();
            return;
        }
        m3233e.mo3198b(jsonWriter, obj);
    }
}
