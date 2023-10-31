package com.vungle.warren.log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.C8695r;

/* renamed from: com.vungle.warren.log.e */
/* loaded from: classes3.dex */
public final class C9834e {

    /* renamed from: a */
    public final String f19629a;

    /* renamed from: b */
    public final String f19630b;

    /* renamed from: c */
    public final String f19631c;

    /* renamed from: d */
    public final String f19632d = "";

    /* renamed from: e */
    public final String f19633e;

    /* renamed from: f */
    public final String f19634f;

    /* renamed from: g */
    public final String f19635g;

    /* renamed from: h */
    public final String f19636h;

    /* renamed from: i */
    public final String f19637i;

    /* renamed from: j */
    public final String f19638j;

    /* renamed from: k */
    public final String f19639k;

    public C9834e(@NonNull String str, @NonNull String str2, @NonNull String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10) {
        this.f19629a = str2;
        this.f19630b = str;
        this.f19631c = str3;
        this.f19633e = str4;
        this.f19634f = str5;
        this.f19635g = str6;
        this.f19636h = str7;
        this.f19637i = str8;
        this.f19638j = str9;
        this.f19639k = str10;
    }

    /* renamed from: a */
    public static void m1490a(@NonNull String str, @Nullable String str2, @NonNull C8695r c8695r) {
        if (str2 != null) {
            c8695r.m3215u(str, str2);
        }
    }

    @NonNull
    /* renamed from: b */
    public final String m1489b() {
        C8695r c8695r = new C8695r();
        c8695r.m3215u("raw_log", this.f19630b);
        C8695r c8695r2 = new C8695r();
        c8695r.m3218r(c8695r2, "metadata");
        m1490a("log_level", this.f19629a, c8695r2);
        m1490a("context", this.f19631c, c8695r2);
        m1490a("event_id", this.f19632d, c8695r2);
        m1490a("sdk_user_agent", this.f19633e, c8695r2);
        m1490a("bundle_id", this.f19634f, c8695r2);
        m1490a("time_zone", this.f19635g, c8695r2);
        m1490a("device_timestamp", this.f19636h, c8695r2);
        m1490a("custom_data", this.f19637i, c8695r2);
        m1490a("exception_class", this.f19638j, c8695r2);
        m1490a("thread_id", this.f19639k, c8695r2);
        return c8695r.toString();
    }
}
