package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: com.google.gson.e */
/* loaded from: classes3.dex */
public final class C8587e extends AbstractC8576a0<Number> {
    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: a */
    public final Number mo3199a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return Double.valueOf(jsonReader.nextDouble());
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: b */
    public final void mo3198b(JsonWriter jsonWriter, Number number) throws IOException {
        Number number2 = number;
        if (number2 == null) {
            jsonWriter.nullValue();
            return;
        }
        C8686j.m3237a(number2.doubleValue());
        jsonWriter.value(number2);
    }
}
