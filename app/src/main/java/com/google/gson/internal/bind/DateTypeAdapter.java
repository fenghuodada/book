package com.google.gson.internal.bind;

import com.google.android.material.C7582b;
import com.google.gson.AbstractC8576a0;
import com.google.gson.C8686j;
import com.google.gson.InterfaceC8578b0;
import com.google.gson.internal.C8665k;
import com.google.gson.reflect.C8696a;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class DateTypeAdapter extends AbstractC8576a0<Date> {

    /* renamed from: b */
    public static final InterfaceC8578b0 f16342b = new InterfaceC8578b0() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.InterfaceC8578b0
        /* renamed from: a */
        public final <T> AbstractC8576a0<T> mo3267a(C8686j c8686j, C8696a<T> c8696a) {
            if (c8696a.getRawType() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a */
    public final ArrayList f16343a;

    public DateTypeAdapter() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        this.f16343a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (C8665k.f16457a >= 9) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList.add(C7582b.m4771a(2, 2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
        r3 = com.google.gson.internal.bind.util.C8654a.m3253b(r3, new java.text.ParsePosition(0));
     */
    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Date mo3199a(com.google.gson.stream.JsonReader r3) throws java.io.IOException {
        /*
            r2 = this;
            com.google.gson.stream.JsonToken r0 = r3.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            if (r0 != r1) goto Ld
            r3.nextNull()
            r3 = 0
            goto L34
        Ld:
            java.lang.String r3 = r3.nextString()
            monitor-enter(r2)
            java.util.ArrayList r0 = r2.f16343a     // Catch: java.lang.Throwable -> L3c
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3c
        L18:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3c
            java.text.DateFormat r1 = (java.text.DateFormat) r1     // Catch: java.lang.Throwable -> L3c
            java.util.Date r3 = r1.parse(r3)     // Catch: java.text.ParseException -> L18 java.lang.Throwable -> L3c
            goto L33
        L29:
            java.text.ParsePosition r0 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
            r1 = 0
            r0.<init>(r1)     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
            java.util.Date r3 = com.google.gson.internal.bind.util.C8654a.m3253b(r3, r0)     // Catch: java.text.ParseException -> L35 java.lang.Throwable -> L3c
        L33:
            monitor-exit(r2)
        L34:
            return r3
        L35:
            r0 = move-exception
            com.google.gson.x r1 = new com.google.gson.x     // Catch: java.lang.Throwable -> L3c
            r1.<init>(r3, r0)     // Catch: java.lang.Throwable -> L3c
            throw r1     // Catch: java.lang.Throwable -> L3c
        L3c:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.DateTypeAdapter.mo3199a(com.google.gson.stream.JsonReader):java.lang.Object");
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: b */
    public final void mo3198b(JsonWriter jsonWriter, Date date) throws IOException {
        Date date2 = date;
        synchronized (this) {
            if (date2 == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(((DateFormat) this.f16343a.get(0)).format(date2));
            }
        }
    }
}
