package com.applovin.impl.sdk.utils;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p031c.C3111d;
import com.applovin.impl.sdk.p031c.C3112e;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.applovin.impl.sdk.utils.p */
/* loaded from: classes.dex */
public final class C3339p {

    /* renamed from: a */
    private final C3214m f8805a;
    @Nullable

    /* renamed from: b */
    private String f8806b;

    /* renamed from: c */
    private final String f8807c;

    /* renamed from: d */
    private final String f8808d;

    public C3339p(C3214m c3214m) {
        this.f8805a = c3214m;
        this.f8807c = m6896a(C3111d.f8071g, (String) C3112e.m7781b(C3111d.f8070f, (Object) null, c3214m.m7476L()));
        this.f8808d = m6896a(C3111d.f8072h, (String) c3214m.m7456a(C3109b.f7792X));
        m6894a(m6891d());
    }

    /* renamed from: a */
    private String m6896a(C3111d<String> c3111d, String str) {
        String str2 = (String) C3112e.m7781b(c3111d, (Object) null, this.f8805a.m7476L());
        if (StringUtils.isValidString(str2)) {
            return str2;
        }
        if (!StringUtils.isValidString(str)) {
            str = UUID.randomUUID().toString().toLowerCase(Locale.US);
        }
        C3112e.m7788a(c3111d, str, this.f8805a.m7476L());
        return str;
    }

    /* renamed from: a */
    public static String m6895a(C3214m c3214m) {
        C3111d<String> c3111d = C3111d.f8073i;
        String str = (String) c3214m.m7454a(c3111d);
        if (TextUtils.isEmpty(str)) {
            String valueOf = String.valueOf(((int) (Math.random() * 100.0d)) + 1);
            c3214m.m7453a((C3111d<C3111d<String>>) c3111d, (C3111d<String>) valueOf);
            return valueOf;
        }
        return str;
    }

    /* renamed from: d */
    private String m6891d() {
        if (!((Boolean) this.f8805a.m7456a(C3109b.f8003dy)).booleanValue()) {
            this.f8805a.m7422b(C3111d.f8069e);
        }
        String str = (String) this.f8805a.m7454a(C3111d.f8069e);
        if (StringUtils.isValidString(str)) {
            if (C3349v.m6862a()) {
                C3349v m7487A = this.f8805a.m7487A();
                m7487A.m6855b("AppLovinSdk", "Using identifier (" + str + ") from previous session");
            }
            return str;
        }
        return null;
    }

    /* renamed from: a */
    public String m6897a() {
        return this.f8806b;
    }

    /* renamed from: a */
    public void m6894a(@Nullable String str) {
        if (((Boolean) this.f8805a.m7456a(C3109b.f8003dy)).booleanValue()) {
            this.f8805a.m7453a((C3111d<C3111d<String>>) C3111d.f8069e, (C3111d<String>) str);
        }
        this.f8806b = str;
        Bundle bundle = new Bundle(2);
        bundle.putString("user_id", StringUtils.emptyIfNull(str));
        bundle.putString("applovin_random_token", m6892c());
        this.f8805a.m7433ag().m7535a(bundle, "user_info");
    }

    /* renamed from: b */
    public String m6893b() {
        return this.f8807c;
    }

    /* renamed from: c */
    public String m6892c() {
        return this.f8808d;
    }
}
