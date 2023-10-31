package com.iab.omid.library.applovin.p048d;

import android.os.Build;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.d.a */
/* loaded from: classes3.dex */
public final class C8789a {
    /* renamed from: a */
    public static String m3066a() {
        return Build.MANUFACTURER + "; " + Build.MODEL;
    }

    /* renamed from: b */
    public static String m3065b() {
        return Integer.toString(Build.VERSION.SDK_INT);
    }

    /* renamed from: c */
    public static String m3064c() {
        return "Android";
    }

    /* renamed from: d */
    public static JSONObject m3063d() {
        JSONObject jSONObject = new JSONObject();
        C8790b.m3054a(jSONObject, "deviceType", m3066a());
        C8790b.m3054a(jSONObject, "osVersion", m3065b());
        C8790b.m3054a(jSONObject, "os", m3064c());
        return jSONObject;
    }
}
