package com.google.android.datatransport.runtime;

import androidx.annotation.Nullable;
import com.google.android.datatransport.runtime.C6477b;
import com.google.auto.value.AutoValue;
import java.util.HashMap;
import java.util.Map;

@AutoValue
/* renamed from: com.google.android.datatransport.runtime.h */
/* loaded from: classes.dex */
public abstract class AbstractC6512h {

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.runtime.h$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC6513a {
        /* renamed from: a */
        public final void m6288a(String str, String str2) {
            Map<String, String> map = ((C6477b.C6478a) this).f10201f;
            if (map != null) {
                map.put(str, str2);
                return;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
    }

    /* renamed from: a */
    public final String m6297a(String str) {
        String str2 = mo6296b().get(str);
        return str2 == null ? "" : str2;
    }

    /* renamed from: b */
    public abstract Map<String, String> mo6296b();

    @Nullable
    /* renamed from: c */
    public abstract Integer mo6295c();

    /* renamed from: d */
    public abstract C6511g mo6294d();

    /* renamed from: e */
    public abstract long mo6293e();

    /* renamed from: f */
    public final int m6292f(String str) {
        String str2 = mo6296b().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: g */
    public abstract String mo6291g();

    /* renamed from: h */
    public abstract long mo6290h();

    /* renamed from: i */
    public final C6477b.C6478a m6289i() {
        C6477b.C6478a c6478a = new C6477b.C6478a();
        c6478a.m6314d(mo6291g());
        c6478a.f10197b = mo6295c();
        c6478a.m6315c(mo6294d());
        c6478a.f10199d = Long.valueOf(mo6293e());
        c6478a.f10200e = Long.valueOf(mo6290h());
        c6478a.f10201f = new HashMap(mo6296b());
        return c6478a;
    }
}
