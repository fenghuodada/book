package com.android.tool.util.manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* renamed from: com.android.tool.util.manager.b */
/* loaded from: classes.dex */
public final class C2559b {

    /* renamed from: a */
    public static SharedPreferences f6057a;

    /* renamed from: b */
    public static C2559b f6058b;

    public C2559b(Context context) {
        f6057a = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
    }

    /* renamed from: a */
    public static final C2559b m9372a(Context context) {
        if (f6058b == null) {
            f6058b = new C2559b(context);
        }
        return f6058b;
    }
}
