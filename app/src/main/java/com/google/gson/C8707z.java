package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: com.google.gson.z */
/* loaded from: classes3.dex */
public final class C8707z extends AbstractC8576a0<Object> {

    /* renamed from: a */
    public final /* synthetic */ AbstractC8576a0 f16521a;

    public C8707z(AbstractC8576a0 abstractC8576a0) {
        this.f16521a = abstractC8576a0;
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: a */
    public final Object mo3199a(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return this.f16521a.mo3199a(jsonReader);
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: b */
    public final void mo3198b(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.f16521a.mo3198b(jsonWriter, obj);
        }
    }
}
