package com.iab.omid.library.applovin.p046b;

import android.annotation.SuppressLint;
import android.content.Context;

/* renamed from: com.iab.omid.library.applovin.b.d */
/* loaded from: classes3.dex */
public class C8779d {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    private static C8779d f16704a = new C8779d();

    /* renamed from: b */
    private Context f16705b;

    private C8779d() {
    }

    /* renamed from: a */
    public static C8779d m3107a() {
        return f16704a;
    }

    /* renamed from: a */
    public void m3106a(Context context) {
        this.f16705b = context != null ? context.getApplicationContext() : null;
    }

    /* renamed from: b */
    public Context m3105b() {
        return this.f16705b;
    }
}
