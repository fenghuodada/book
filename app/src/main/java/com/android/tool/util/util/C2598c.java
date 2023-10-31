package com.android.tool.util.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.appcompat.C0079a;

/* renamed from: com.android.tool.util.util.c */
/* loaded from: classes.dex */
public final class C2598c {
    /* renamed from: a */
    public static boolean m9342a() {
        Context context = C0079a.f147a;
        if (context != null) {
            if (context != null) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    return activeNetworkInfo.isAvailable();
                }
                return false;
            }
            throw new NullPointerException("the context is null,please init AppContextUtil in Application first.");
        }
        throw new NullPointerException("the context is null,please init AppContextUtil in Application first.");
    }
}
