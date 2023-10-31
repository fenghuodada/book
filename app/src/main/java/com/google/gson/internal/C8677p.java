package com.google.gson.internal;

import com.google.gson.AbstractC8692o;
import com.google.gson.C8693p;
import com.google.gson.C8694q;
import com.google.gson.C8697s;
import com.google.gson.C8703x;
import com.google.gson.internal.bind.TypeAdapters;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.MalformedJsonException;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.google.gson.internal.p */
/* loaded from: classes3.dex */
public final class C8677p {
    /* renamed from: a */
    public static AbstractC8692o m3241a(JsonReader jsonReader) throws C8697s {
        boolean z;
        try {
            try {
                jsonReader.peek();
            } catch (MalformedJsonException e) {
                throw new C8703x(e);
            } catch (IOException e2) {
                throw new C8693p(e2);
            } catch (NumberFormatException e3) {
                throw new C8703x(e3);
            }
        } catch (EOFException e4) {
            e = e4;
            z = true;
        }
        try {
            TypeAdapters.f16380A.getClass();
            return TypeAdapters.C8641t.m3266c(jsonReader);
        } catch (EOFException e5) {
            e = e5;
            z = false;
            if (z) {
                return C8694q.f16515a;
            }
            throw new C8703x(e);
        }
    }
}
