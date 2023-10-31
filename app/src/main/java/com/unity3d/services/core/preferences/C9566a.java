package com.unity3d.services.core.preferences;

import android.content.SharedPreferences;
import androidx.activity.result.C0063d;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.properties.C9568a;

/* renamed from: com.unity3d.services.core.preferences.a */
/* loaded from: classes3.dex */
public class C9566a {
    /* renamed from: a */
    public static Boolean m1979a(String str, String str2) {
        SharedPreferences sharedPreferences = C9568a.m1959e().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return Boolean.valueOf(sharedPreferences.getBoolean(str2, false));
            } catch (ClassCastException e) {
                StringBuilder m13052b = C0063d.m13052b("Unity Ads failed to cast ", str2, ": ");
                m13052b.append(e.getMessage());
                C9549a.m2017c(m13052b.toString());
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m1978a(String str, String str2, Boolean bool) {
        SharedPreferences sharedPreferences = C9568a.m1959e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(str2, bool.booleanValue());
            edit.commit();
        }
    }

    /* renamed from: a */
    public static void m1977a(String str, String str2, Double d) {
        SharedPreferences sharedPreferences = C9568a.m1959e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putFloat(str2, d.floatValue());
            edit.commit();
        }
    }

    /* renamed from: a */
    public static void m1976a(String str, String str2, Integer num) {
        SharedPreferences sharedPreferences = C9568a.m1959e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putInt(str2, num.intValue());
            edit.commit();
        }
    }

    /* renamed from: a */
    public static void m1975a(String str, String str2, Long l) {
        SharedPreferences sharedPreferences = C9568a.m1959e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putLong(str2, l.longValue());
            edit.commit();
        }
    }

    /* renamed from: a */
    public static void m1974a(String str, String str2, String str3) {
        SharedPreferences sharedPreferences = C9568a.m1959e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str2, str3);
            edit.commit();
        }
    }

    /* renamed from: b */
    public static Float m1973b(String str, String str2) {
        SharedPreferences sharedPreferences = C9568a.m1959e().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return Float.valueOf(sharedPreferences.getFloat(str2, Float.NaN));
            } catch (ClassCastException e) {
                StringBuilder m13052b = C0063d.m13052b("Unity Ads failed to cast ", str2, ": ");
                m13052b.append(e.getMessage());
                C9549a.m2017c(m13052b.toString());
            }
        }
        return null;
    }

    /* renamed from: c */
    public static Integer m1972c(String str, String str2) {
        SharedPreferences sharedPreferences = C9568a.m1959e().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return Integer.valueOf(sharedPreferences.getInt(str2, -1));
            } catch (ClassCastException e) {
                StringBuilder m13052b = C0063d.m13052b("Unity Ads failed to cast ", str2, ": ");
                m13052b.append(e.getMessage());
                C9549a.m2017c(m13052b.toString());
            }
        }
        return null;
    }

    /* renamed from: d */
    public static Long m1971d(String str, String str2) {
        SharedPreferences sharedPreferences = C9568a.m1959e().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return Long.valueOf(sharedPreferences.getLong(str2, -1L));
            } catch (ClassCastException e) {
                StringBuilder m13052b = C0063d.m13052b("Unity Ads failed to cast ", str2, ": ");
                m13052b.append(e.getMessage());
                C9549a.m2017c(m13052b.toString());
            }
        }
        return null;
    }

    /* renamed from: e */
    public static String m1970e(String str, String str2) {
        SharedPreferences sharedPreferences = C9568a.m1959e().getSharedPreferences(str, 0);
        if (sharedPreferences != null && sharedPreferences.contains(str2)) {
            try {
                return sharedPreferences.getString(str2, "");
            } catch (ClassCastException e) {
                StringBuilder m13052b = C0063d.m13052b("Unity Ads failed to cast ", str2, ": ");
                m13052b.append(e.getMessage());
                C9549a.m2017c(m13052b.toString());
            }
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m1969f(String str, String str2) {
        SharedPreferences sharedPreferences = C9568a.m1959e().getSharedPreferences(str, 0);
        return sharedPreferences != null && sharedPreferences.contains(str2);
    }

    /* renamed from: g */
    public static void m1968g(String str, String str2) {
        SharedPreferences sharedPreferences = C9568a.m1959e().getSharedPreferences(str, 0);
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove(str2);
            edit.commit();
        }
    }
}
