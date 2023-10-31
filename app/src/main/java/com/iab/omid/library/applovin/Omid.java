package com.iab.omid.library.applovin;

import android.content.Context;

/* loaded from: classes3.dex */
public final class Omid {
    private static C8774b INSTANCE = new C8774b();

    private Omid() {
    }

    public static void activate(Context context) {
        INSTANCE.m3130a(context.getApplicationContext());
    }

    public static String getVersion() {
        return INSTANCE.m3131a();
    }

    public static boolean isActive() {
        return INSTANCE.m3128b();
    }
}
