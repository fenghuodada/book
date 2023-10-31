package com.google.gson.internal.bind;

import com.google.gson.AbstractC8576a0;
import com.google.gson.C8686j;
import com.google.gson.C8703x;
import com.google.gson.InterfaceC8578b0;
import com.google.gson.reflect.C8696a;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes3.dex */
public final class SqlDateTypeAdapter extends AbstractC8576a0<Date> {

    /* renamed from: b */
    public static final InterfaceC8578b0 f16364b = new InterfaceC8578b0() { // from class: com.google.gson.internal.bind.SqlDateTypeAdapter.1
        @Override // com.google.gson.InterfaceC8578b0
        /* renamed from: a */
        public final <T> AbstractC8576a0<T> mo3267a(C8686j c8686j, C8696a<T> c8696a) {
            if (c8696a.getRawType() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    public final SimpleDateFormat f16365a = new SimpleDateFormat("MMM d, yyyy");

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: a */
    public final Date mo3199a(JsonReader jsonReader) throws IOException {
        synchronized (this) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new Date(this.f16365a.parse(jsonReader.nextString()).getTime());
            } catch (ParseException e) {
                throw new C8703x(e);
            }
        }
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: b */
    public final void mo3198b(JsonWriter jsonWriter, Date date) throws IOException {
        String format;
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                format = null;
            } else {
                format = this.f16365a.format((java.util.Date) date2);
            }
            jsonWriter.value(format);
        }
    }
}
