package com.applovin.impl.sdk.p030b;

import androidx.annotation.NonNull;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.b.c */
/* loaded from: classes.dex */
public class C3105c {

    /* renamed from: a */
    private final String f7736a;

    /* renamed from: b */
    private Map<String, String> f7737b;

    private C3105c(String str, Map<String, String> map) {
        this.f7736a = str;
        this.f7737b = map;
    }

    /* renamed from: a */
    public static C3105c m7823a(String str) {
        return m7822a(str, null);
    }

    /* renamed from: a */
    public static C3105c m7822a(String str, Map<String, String> map) {
        return new C3105c(str, map);
    }

    /* renamed from: a */
    public Map<String, String> m7824a() {
        return this.f7737b;
    }

    /* renamed from: b */
    public String m7821b() {
        return this.f7736a;
    }

    @NonNull
    public String toString() {
        return "PendingReward{result='" + this.f7736a + "'params='" + this.f7737b + "'}";
    }
}
