package com.google.gson.internal.bind;

import com.google.gson.AbstractC8692o;
import com.google.gson.C8690m;
import com.google.gson.C8694q;
import com.google.gson.C8695r;
import com.google.gson.C8700u;
import com.google.gson.internal.C8668n;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.gson.internal.bind.a */
/* loaded from: classes3.dex */
public final class C8648a extends JsonReader {

    /* renamed from: e */
    public static final C8649a f16427e = new C8649a();

    /* renamed from: f */
    public static final Object f16428f = new Object();

    /* renamed from: a */
    public Object[] f16429a;

    /* renamed from: b */
    public int f16430b;

    /* renamed from: c */
    public String[] f16431c;

    /* renamed from: d */
    public int[] f16432d;

    /* renamed from: com.google.gson.internal.bind.a$a */
    /* loaded from: classes3.dex */
    public class C8649a extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) throws IOException {
            throw new AssertionError();
        }
    }

    public C8648a(AbstractC8692o abstractC8692o) {
        super(f16427e);
        this.f16429a = new Object[32];
        this.f16430b = 0;
        this.f16431c = new String[32];
        this.f16432d = new int[32];
        m3261e(abstractC8692o);
    }

    private String locationString() {
        return " at path " + getPath();
    }

    /* renamed from: a */
    public final void m3264a(JsonToken jsonToken) throws IOException {
        if (peek() == jsonToken) {
            return;
        }
        throw new IllegalStateException("Expected " + jsonToken + " but was " + peek() + locationString());
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginArray() throws IOException {
        m3264a(JsonToken.BEGIN_ARRAY);
        m3261e(((C8690m) m3263c()).iterator());
        this.f16432d[this.f16430b - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginObject() throws IOException {
        m3264a(JsonToken.BEGIN_OBJECT);
        m3261e(new C8668n.C8670b.C8671a((C8668n.C8670b) ((C8695r) m3263c()).f16516a.entrySet()));
    }

    /* renamed from: c */
    public final Object m3263c() {
        return this.f16429a[this.f16430b - 1];
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f16429a = new Object[]{f16428f};
        this.f16430b = 1;
    }

    /* renamed from: d */
    public final Object m3262d() {
        Object[] objArr = this.f16429a;
        int i = this.f16430b - 1;
        this.f16430b = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    /* renamed from: e */
    public final void m3261e(Object obj) {
        int i = this.f16430b;
        Object[] objArr = this.f16429a;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.f16429a = Arrays.copyOf(objArr, i2);
            this.f16432d = Arrays.copyOf(this.f16432d, i2);
            this.f16431c = (String[]) Arrays.copyOf(this.f16431c, i2);
        }
        Object[] objArr2 = this.f16429a;
        int i3 = this.f16430b;
        this.f16430b = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endArray() throws IOException {
        m3264a(JsonToken.END_ARRAY);
        m3262d();
        m3262d();
        int i = this.f16430b;
        if (i > 0) {
            int[] iArr = this.f16432d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endObject() throws IOException {
        m3264a(JsonToken.END_OBJECT);
        m3262d();
        m3262d();
        int i = this.f16430b;
        if (i > 0) {
            int[] iArr = this.f16432d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPath() {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (i < this.f16430b) {
            Object[] objArr = this.f16429a;
            Object obj = objArr[i];
            if (obj instanceof C8690m) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('[');
                    sb.append(this.f16432d[i]);
                    sb.append(']');
                }
            } else if (obj instanceof C8695r) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    sb.append('.');
                    String str = this.f16431c[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
            }
            i++;
        }
        return sb.toString();
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean hasNext() throws IOException {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY) ? false : true;
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean nextBoolean() throws IOException {
        m3264a(JsonToken.BOOLEAN);
        boolean mo3207b = ((C8700u) m3262d()).mo3207b();
        int i = this.f16430b;
        if (i > 0) {
            int[] iArr = this.f16432d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return mo3207b;
    }

    @Override // com.google.gson.stream.JsonReader
    public final double nextDouble() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        double mo3206i = ((C8700u) m3263c()).mo3206i();
        if (!isLenient() && (Double.isNaN(mo3206i) || Double.isInfinite(mo3206i))) {
            throw new NumberFormatException("JSON forbids NaN and infinities: " + mo3206i);
        }
        m3262d();
        int i = this.f16430b;
        if (i > 0) {
            int[] iArr = this.f16432d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return mo3206i;
    }

    @Override // com.google.gson.stream.JsonReader
    public final int nextInt() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        int mo3204k = ((C8700u) m3263c()).mo3204k();
        m3262d();
        int i = this.f16430b;
        if (i > 0) {
            int[] iArr = this.f16432d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return mo3204k;
    }

    @Override // com.google.gson.stream.JsonReader
    public final long nextLong() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        long mo3203o = ((C8700u) m3263c()).mo3203o();
        m3262d();
        int i = this.f16430b;
        if (i > 0) {
            int[] iArr = this.f16432d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return mo3203o;
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextName() throws IOException {
        m3264a(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) m3263c()).next();
        String str = (String) entry.getKey();
        this.f16431c[this.f16430b - 1] = str;
        m3261e(entry.getValue());
        return str;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void nextNull() throws IOException {
        m3264a(JsonToken.NULL);
        m3262d();
        int i = this.f16430b;
        if (i > 0) {
            int[] iArr = this.f16432d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextString() throws IOException {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek != jsonToken && peek != JsonToken.NUMBER) {
            throw new IllegalStateException("Expected " + jsonToken + " but was " + peek + locationString());
        }
        String mo3202p = ((C8700u) m3262d()).mo3202p();
        int i = this.f16430b;
        if (i > 0) {
            int[] iArr = this.f16432d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return mo3202p;
    }

    @Override // com.google.gson.stream.JsonReader
    public final JsonToken peek() throws IOException {
        if (this.f16430b == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object m3263c = m3263c();
        if (m3263c instanceof Iterator) {
            boolean z = this.f16429a[this.f16430b - 2] instanceof C8695r;
            Iterator it = (Iterator) m3263c;
            if (it.hasNext()) {
                if (z) {
                    return JsonToken.NAME;
                }
                m3261e(it.next());
                return peek();
            } else if (z) {
                return JsonToken.END_OBJECT;
            } else {
                return JsonToken.END_ARRAY;
            }
        } else if (m3263c instanceof C8695r) {
            return JsonToken.BEGIN_OBJECT;
        } else {
            if (m3263c instanceof C8690m) {
                return JsonToken.BEGIN_ARRAY;
            }
            if (m3263c instanceof C8700u) {
                Serializable serializable = ((C8700u) m3263c).f16518a;
                if (serializable instanceof String) {
                    return JsonToken.STRING;
                }
                if (serializable instanceof Boolean) {
                    return JsonToken.BOOLEAN;
                }
                if (serializable instanceof Number) {
                    return JsonToken.NUMBER;
                }
                throw new AssertionError();
            } else if (m3263c instanceof C8694q) {
                return JsonToken.NULL;
            } else {
                if (m3263c == f16428f) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                throw new AssertionError();
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void skipValue() throws IOException {
        if (peek() == JsonToken.NAME) {
            nextName();
            this.f16431c[this.f16430b - 2] = "null";
        } else {
            m3262d();
            int i = this.f16430b;
            if (i > 0) {
                this.f16431c[i - 1] = "null";
            }
        }
        int i2 = this.f16430b;
        if (i2 > 0) {
            int[] iArr = this.f16432d;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String toString() {
        return C8648a.class.getSimpleName();
    }
}
