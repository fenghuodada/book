package com.iab.omid.library.applovin.p048d;

import android.text.TextUtils;
import android.util.Log;
import com.iab.omid.library.applovin.C8767a;

/* renamed from: com.iab.omid.library.applovin.d.c */
/* loaded from: classes3.dex */
public final class C8792c {
    /* renamed from: a */
    public static void m3044a(String str) {
        if (!C8767a.f16670a.booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        Log.i("OMIDLIB", str);
    }

    /* renamed from: a */
    public static void m3043a(String str, Exception exc) {
        if ((!C8767a.f16670a.booleanValue() || TextUtils.isEmpty(str)) && exc == null) {
            return;
        }
        Log.e("OMIDLIB", str, exc);
    }
}
