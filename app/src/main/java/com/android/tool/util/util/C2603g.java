package com.android.tool.util.util;

import android.content.SharedPreferences;
import com.android.tool.ApplicationC2534a;
import java.util.Set;

/* renamed from: com.android.tool.util.util.g */
/* loaded from: classes.dex */
public final class C2603g {

    /* renamed from: a */
    public static SharedPreferences f6120a;

    /* renamed from: b */
    public static final ApplicationC2534a f6121b = ApplicationC2534a.f6025a;

    /* renamed from: a */
    public static int m9339a(String str) {
        if (f6120a == null) {
            f6120a = f6121b.getSharedPreferences("OverWall", 0);
        }
        return f6120a.getInt(str, 0);
    }

    /* renamed from: b */
    public static String m9338b(String str) {
        if (f6120a == null) {
            f6120a = f6121b.getSharedPreferences("OverWall", 0);
        }
        return f6120a.getString(str, null);
    }

    /* renamed from: c */
    public static void m9337c(int i, String str) {
        if (f6120a == null) {
            f6120a = f6121b.getSharedPreferences("OverWall", 0);
        }
        f6120a.edit().putInt(str, i).commit();
    }

    /* renamed from: d */
    public static void m9336d(String str, String str2) {
        if (f6120a == null) {
            f6120a = f6121b.getSharedPreferences("OverWall", 0);
        }
        f6120a.edit().putString(str, str2).commit();
    }

    /* renamed from: e */
    public static void m9335e(Set set) {
        if (f6120a == null) {
            f6120a = f6121b.getSharedPreferences("OverWall", 0);
        }
        f6120a.edit().putStringSet("REJECTAPP", set).commit();
    }
}
