package com.google.gson;

import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: com.google.gson.o */
/* loaded from: classes3.dex */
public abstract class AbstractC8692o {
    /* renamed from: a */
    public abstract AbstractC8692o mo3208a();

    /* renamed from: b */
    public boolean mo3207b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: i */
    public double mo3206i() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: j */
    public float mo3205j() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: k */
    public int mo3204k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: m */
    public final C8690m m3221m() {
        if (this instanceof C8690m) {
            return (C8690m) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    /* renamed from: n */
    public final C8695r m3220n() {
        if (this instanceof C8695r) {
            return (C8695r) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    /* renamed from: o */
    public long mo3203o() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: p */
    public String mo3202p() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            jsonWriter.setLenient(true);
            TypeAdapters.f16380A.mo3198b(jsonWriter, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
