package com.google.gson;

import androidx.core.p003os.C0740h;
import com.google.android.material.C7582b;
import com.google.gson.internal.C8665k;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.gson.a */
/* loaded from: classes3.dex */
public final class C8575a extends AbstractC8576a0<Date> {

    /* renamed from: a */
    public final Class<? extends Date> f16311a;

    /* renamed from: b */
    public final ArrayList f16312b;

    public C8575a(Class<? extends Date> cls, int i, int i2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        this.f16312b = arrayList;
        m3290c(cls);
        this.f16311a = cls;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i, i2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i, i2));
        }
        if (C8665k.f16457a >= 9) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            arrayList.add(C7582b.m4771a(i, i2));
        }
    }

    /* renamed from: c */
    public static void m3290c(Class cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        r4 = com.google.gson.internal.bind.util.C8654a.m3253b(r4, new java.text.ParsePosition(0));
     */
    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Date mo3199a(com.google.gson.stream.JsonReader r4) throws java.io.IOException {
        /*
            r3 = this;
            com.google.gson.stream.JsonToken r0 = r4.peek()
            com.google.gson.stream.JsonToken r1 = com.google.gson.stream.JsonToken.NULL
            if (r0 != r1) goto Ld
            r4.nextNull()
            r4 = 0
            goto L5a
        Ld:
            java.lang.String r4 = r4.nextString()
            java.util.ArrayList r0 = r3.f16312b
            monitor-enter(r0)
            java.util.ArrayList r1 = r3.f16312b     // Catch: java.lang.Throwable -> L68
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L68
        L1a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L68
            java.text.DateFormat r2 = (java.text.DateFormat) r2     // Catch: java.lang.Throwable -> L68
            java.util.Date r4 = r2.parse(r4)     // Catch: java.text.ParseException -> L1a java.lang.Throwable -> L68
            goto L35
        L2b:
            java.text.ParsePosition r1 = new java.text.ParsePosition     // Catch: java.text.ParseException -> L61 java.lang.Throwable -> L68
            r2 = 0
            r1.<init>(r2)     // Catch: java.text.ParseException -> L61 java.lang.Throwable -> L68
            java.util.Date r4 = com.google.gson.internal.bind.util.C8654a.m3253b(r4, r1)     // Catch: java.text.ParseException -> L61 java.lang.Throwable -> L68
        L35:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.Class<? extends java.util.Date> r0 = r3.f16311a
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r0 != r1) goto L3d
            goto L5a
        L3d:
            java.lang.Class<java.sql.Timestamp> r1 = java.sql.Timestamp.class
            if (r0 != r1) goto L4c
            java.sql.Timestamp r0 = new java.sql.Timestamp
            long r1 = r4.getTime()
            r0.<init>(r1)
        L4a:
            r4 = r0
            goto L5a
        L4c:
            java.lang.Class<java.sql.Date> r1 = java.sql.Date.class
            if (r0 != r1) goto L5b
            java.sql.Date r0 = new java.sql.Date
            long r1 = r4.getTime()
            r0.<init>(r1)
            goto L4a
        L5a:
            return r4
        L5b:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L61:
            r1 = move-exception
            com.google.gson.x r2 = new com.google.gson.x     // Catch: java.lang.Throwable -> L68
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> L68
            throw r2     // Catch: java.lang.Throwable -> L68
        L68:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L68
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.C8575a.mo3199a(com.google.gson.stream.JsonReader):java.lang.Object");
    }

    @Override // com.google.gson.AbstractC8576a0
    /* renamed from: b */
    public final void mo3198b(JsonWriter jsonWriter, Date date) throws IOException {
        Date date2 = date;
        if (date2 == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.f16312b) {
            jsonWriter.value(((DateFormat) this.f16312b.get(0)).format(date2));
        }
    }

    public final String toString() {
        StringBuilder sb;
        String simpleName;
        DateFormat dateFormat = (DateFormat) this.f16312b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            sb = new StringBuilder("DefaultDateTypeAdapter(");
            simpleName = ((SimpleDateFormat) dateFormat).toPattern();
        } else {
            sb = new StringBuilder("DefaultDateTypeAdapter(");
            simpleName = dateFormat.getClass().getSimpleName();
        }
        return C0740h.m11848b(sb, simpleName, ')');
    }
}
