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
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes3.dex */
public final class TimeTypeAdapter extends AbstractC8576a0<Time> {

    /* renamed from: b */
    public static final InterfaceC8578b0 f16366b = new InterfaceC8578b0() { // from class: com.google.gson.internal.bind.TimeTypeAdapter.1
        @Override // com.google.gson.InterfaceC8578b0
        /* renamed from: a */
        public final <T> AbstractC8576a0<T> mo3267a(C8686j c8686j, C8696a<T> c8696a) {
            if (c8696a.getRawType() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    public final SimpleDateFormat f16367a = new SimpleDateFormat("hh:mm:ss a");

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: a */
    public final Time mo3199a(JsonReader jsonReader) throws IOException {
        synchronized (this) {
            if (jsonReader.peek() == JsonToken.NULL) {
                jsonReader.nextNull();
                return null;
            }
            try {
                return new Time(this.f16367a.parse(jsonReader.nextString()).getTime());
            } catch (ParseException e) {
                throw new C8703x(e);
            }
        }
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: b */
    public final void mo3198b(JsonWriter jsonWriter, Time time) throws IOException {
        String format;
        Time time2 = time;
        synchronized (this) {
            if (time2 == null) {
                format = null;
            } else {
                format = this.f16367a.format((Date) time2);
            }
            jsonWriter.value(format);
        }
    }
}
