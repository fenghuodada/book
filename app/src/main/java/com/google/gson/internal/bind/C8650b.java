package com.google.gson.internal.bind;

import com.google.gson.AbstractC8692o;
import com.google.gson.C8690m;
import com.google.gson.C8694q;
import com.google.gson.C8695r;
import com.google.gson.C8700u;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/* renamed from: com.google.gson.internal.bind.b */
/* loaded from: classes3.dex */
public final class C8650b extends JsonWriter {

    /* renamed from: d */
    public static final C8651a f16433d = new C8651a();

    /* renamed from: e */
    public static final C8700u f16434e = new C8700u("closed");

    /* renamed from: a */
    public final ArrayList f16435a;

    /* renamed from: b */
    public String f16436b;

    /* renamed from: c */
    public AbstractC8692o f16437c;

    /* renamed from: com.google.gson.internal.bind.b$a */
    /* loaded from: classes3.dex */
    public class C8651a extends Writer {
        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    }

    public C8650b() {
        super(f16433d);
        this.f16435a = new ArrayList();
        this.f16437c = C8694q.f16515a;
    }

    /* renamed from: a */
    public final AbstractC8692o m3260a() {
        ArrayList arrayList = this.f16435a;
        if (arrayList.isEmpty()) {
            return this.f16437c;
        }
        throw new IllegalStateException("Expected one JSON element but was " + arrayList);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginArray() throws IOException {
        C8690m c8690m = new C8690m();
        m3258d(c8690m);
        this.f16435a.add(c8690m);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginObject() throws IOException {
        C8695r c8695r = new C8695r();
        m3258d(c8695r);
        this.f16435a.add(c8695r);
        return this;
    }

    /* renamed from: c */
    public final AbstractC8692o m3259c() {
        ArrayList arrayList = this.f16435a;
        return (AbstractC8692o) arrayList.get(arrayList.size() - 1);
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ArrayList arrayList = this.f16435a;
        if (!arrayList.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        arrayList.add(f16434e);
    }

    /* renamed from: d */
    public final void m3258d(AbstractC8692o abstractC8692o) {
        if (this.f16436b != null) {
            abstractC8692o.getClass();
            if (!(abstractC8692o instanceof C8694q) || getSerializeNulls()) {
                ((C8695r) m3259c()).m3218r(abstractC8692o, this.f16436b);
            }
            this.f16436b = null;
        } else if (this.f16435a.isEmpty()) {
            this.f16437c = abstractC8692o;
        } else {
            AbstractC8692o m3259c = m3259c();
            if (m3259c instanceof C8690m) {
                ((C8690m) m3259c).m3224r(abstractC8692o);
                return;
            }
            throw new IllegalStateException();
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endArray() throws IOException {
        ArrayList arrayList = this.f16435a;
        if (arrayList.isEmpty() || this.f16436b != null) {
            throw new IllegalStateException();
        }
        if (m3259c() instanceof C8690m) {
            arrayList.remove(arrayList.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endObject() throws IOException {
        ArrayList arrayList = this.f16435a;
        if (arrayList.isEmpty() || this.f16436b != null) {
            throw new IllegalStateException();
        }
        if (m3259c() instanceof C8695r) {
            arrayList.remove(arrayList.size() - 1);
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public final void flush() throws IOException {
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter name(String str) throws IOException {
        if (this.f16435a.isEmpty() || this.f16436b != null) {
            throw new IllegalStateException();
        }
        if (m3259c() instanceof C8695r) {
            this.f16436b = str;
            return this;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter nullValue() throws IOException {
        m3258d(C8694q.f16515a);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(double d) throws IOException {
        if (isLenient() || !(Double.isNaN(d) || Double.isInfinite(d))) {
            m3258d(new C8700u(Double.valueOf(d)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d);
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(long j) throws IOException {
        m3258d(new C8700u(Long.valueOf(j)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            m3258d(C8694q.f16515a);
            return this;
        }
        m3258d(new C8700u(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(boolean z) throws IOException {
        m3258d(new C8700u(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Number number) throws IOException {
        if (number == null) {
            m3258d(C8694q.f16515a);
            return this;
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        m3258d(new C8700u(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(String str) throws IOException {
        if (str == null) {
            m3258d(C8694q.f16515a);
            return this;
        }
        m3258d(new C8700u(str));
        return this;
    }
}
