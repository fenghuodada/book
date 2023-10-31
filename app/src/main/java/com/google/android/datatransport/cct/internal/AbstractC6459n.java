package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import java.io.BufferedReader;
import java.io.IOException;

@AutoValue
/* renamed from: com.google.android.datatransport.cct.internal.n */
/* loaded from: classes.dex */
public abstract class AbstractC6459n {
    @NonNull
    /* renamed from: a */
    public static C6451h m6320a(@NonNull BufferedReader bufferedReader) throws IOException {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    if (jsonReader.peek() == JsonToken.STRING) {
                        return new C6451h(Long.parseLong(jsonReader.nextString()));
                    }
                    return new C6451h(jsonReader.nextLong());
                }
                jsonReader.skipValue();
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    /* renamed from: b */
    public abstract long mo6319b();
}
