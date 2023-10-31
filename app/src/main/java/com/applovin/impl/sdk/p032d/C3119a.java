package com.applovin.impl.sdk.p032d;

import java.util.Map;

/* renamed from: com.applovin.impl.sdk.d.a */
/* loaded from: classes.dex */
public class C3119a {

    /* renamed from: a */
    private final String f8105a;

    /* renamed from: b */
    private final String f8106b;

    /* renamed from: c */
    private final Map<String, String> f8107c;

    /* renamed from: d */
    private final boolean f8108d;

    public C3119a(String str, String str2) {
        this(str, str2, null, false);
    }

    public C3119a(String str, String str2, Map<String, String> map, boolean z) {
        this.f8105a = str;
        this.f8106b = str2;
        this.f8107c = map;
        this.f8108d = z;
    }

    /* renamed from: a */
    public String m7761a() {
        return this.f8105a;
    }

    /* renamed from: b */
    public String m7760b() {
        return this.f8106b;
    }

    /* renamed from: c */
    public Map<String, String> m7759c() {
        return this.f8107c;
    }

    /* renamed from: d */
    public boolean m7758d() {
        return this.f8108d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f8105a + "', backupUrl='" + this.f8106b + "', headers='" + this.f8107c + "', shouldFireInWebView='" + this.f8108d + "'}";
    }
}
