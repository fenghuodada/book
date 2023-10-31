package com.qmuiteam.qmui.util;

import android.content.Context;

/* renamed from: com.qmuiteam.qmui.util.e */
/* loaded from: classes3.dex */
public final class C9144e {

    /* renamed from: a */
    public static String f17579a;

    /* renamed from: a */
    public static String m2641a(Context context) {
        if (f17579a == null) {
            try {
                f17579a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        String str = f17579a;
        return str == null ? "" : str;
    }
}
