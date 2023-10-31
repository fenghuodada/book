package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: com.google.gson.g */
/* loaded from: classes3.dex */
public final class C8589g extends AbstractC8576a0<Number> {
    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: a */
    public final Number mo3199a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return Long.valueOf(jsonReader.nextLong());
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: b */
    public final void mo3198b(JsonWriter jsonWriter, Number number) throws IOException {
        Number number2 = number;
        if (number2 == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(number2.toString());
        }
    }
}
