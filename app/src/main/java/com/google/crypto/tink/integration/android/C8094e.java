package com.google.crypto.tink.integration.android;

import android.app.Application;
import android.content.SharedPreferences;

/* renamed from: com.google.crypto.tink.integration.android.e */
/* loaded from: classes3.dex */
public final class C8094e {

    /* renamed from: a */
    public final SharedPreferences.Editor f15895a;

    /* renamed from: b */
    public final String f15896b;

    public C8094e(Application application, String str) {
        this.f15896b = str;
        this.f15895a = application.getApplicationContext().getSharedPreferences("Temporises", 0).edit();
    }
}
