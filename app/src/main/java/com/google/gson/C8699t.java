package com.google.gson;

import com.google.gson.internal.C8677p;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.StringReader;

/* renamed from: com.google.gson.t */
/* loaded from: classes3.dex */
public final class C8699t {
    /* renamed from: a */
    public static AbstractC8692o m3210a(JsonReader jsonReader) throws C8693p, C8703x {
        boolean isLenient = jsonReader.isLenient();
        jsonReader.setLenient(true);
        try {
            try {
                return C8677p.m3241a(jsonReader);
            } catch (OutOfMemoryError e) {
                throw new C8697s("Failed parsing JSON source: " + jsonReader + " to Json", e);
            } catch (StackOverflowError e2) {
                throw new C8697s("Failed parsing JSON source: " + jsonReader + " to Json", e2);
            }
        } finally {
            jsonReader.setLenient(isLenient);
        }
    }

    /* renamed from: b */
    public static AbstractC8692o m3209b(String str) throws C8703x {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            AbstractC8692o m3210a = m3210a(jsonReader);
            m3210a.getClass();
            if (!(m3210a instanceof C8694q) && jsonReader.peek() != JsonToken.END_DOCUMENT) {
                throw new C8703x("Did not consume the entire document.");
            }
            return m3210a;
        } catch (MalformedJsonException e) {
            throw new C8703x(e);
        } catch (IOException e2) {
            throw new C8693p(e2);
        } catch (NumberFormatException e3) {
            throw new C8703x(e3);
        }
    }
}
