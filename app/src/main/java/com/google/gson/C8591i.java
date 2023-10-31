package com.google.gson;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* renamed from: com.google.gson.i */
/* loaded from: classes3.dex */
public final class C8591i extends AbstractC8576a0<AtomicLongArray> {

    /* renamed from: a */
    public final /* synthetic */ AbstractC8576a0 f16316a;

    public C8591i(AbstractC8576a0 abstractC8576a0) {
        this.f16316a = abstractC8576a0;
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: a */
    public final AtomicLongArray mo3199a(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(Long.valueOf(((Number) this.f16316a.mo3199a(jsonReader)).longValue()));
        }
        jsonReader.endArray();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i = 0; i < size; i++) {
            atomicLongArray.set(i, ((Long) arrayList.get(i)).longValue());
        }
        return atomicLongArray;
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: b */
    public final void mo3198b(JsonWriter jsonWriter, AtomicLongArray atomicLongArray) throws IOException {
        AtomicLongArray atomicLongArray2 = atomicLongArray;
        jsonWriter.beginArray();
        int length = atomicLongArray2.length();
        for (int i = 0; i < length; i++) {
            this.f16316a.mo3198b(jsonWriter, Long.valueOf(atomicLongArray2.get(i)));
        }
        jsonWriter.endArray();
    }
}
