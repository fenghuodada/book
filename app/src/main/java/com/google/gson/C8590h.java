package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.gson.h */
/* loaded from: classes3.dex */
public final class C8590h extends AbstractC8576a0<AtomicLong> {

    /* renamed from: a */
    public final /* synthetic */ AbstractC8576a0 f16315a;

    public C8590h(AbstractC8576a0 abstractC8576a0) {
        this.f16315a = abstractC8576a0;
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: a */
    public final AtomicLong mo3199a(JsonReader jsonReader) throws IOException {
        return new AtomicLong(((Number) this.f16315a.mo3199a(jsonReader)).longValue());
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: b */
    public final void mo3198b(JsonWriter jsonWriter, AtomicLong atomicLong) throws IOException {
        this.f16315a.mo3198b(jsonWriter, Long.valueOf(atomicLong.get()));
    }
}
