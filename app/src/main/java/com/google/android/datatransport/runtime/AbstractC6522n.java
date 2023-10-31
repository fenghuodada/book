package com.google.android.datatransport.runtime;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.google.android.datatransport.EnumC6464d;
import com.google.android.datatransport.runtime.C6496d;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.n */
/* loaded from: classes.dex */
public abstract class AbstractC6522n {

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.runtime.n$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC6523a {
    }

    /* renamed from: a */
    public static C6496d.C6497a m6278a() {
        C6496d.C6497a c6497a = new C6496d.C6497a();
        c6497a.m6299c(EnumC6464d.DEFAULT);
        return c6497a;
    }

    /* renamed from: b */
    public abstract String mo6277b();

    @Nullable
    /* renamed from: c */
    public abstract byte[] mo6276c();

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: d */
    public abstract EnumC6464d mo6275d();

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: e */
    public final C6496d m6274e(EnumC6464d enumC6464d) {
        C6496d.C6497a m6278a = m6278a();
        m6278a.m6300b(mo6277b());
        m6278a.m6299c(enumC6464d);
        m6278a.f10232b = mo6276c();
        return m6278a.m6301a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo6277b();
        objArr[1] = mo6275d();
        objArr[2] = mo6276c() == null ? "" : Base64.encodeToString(mo6276c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
