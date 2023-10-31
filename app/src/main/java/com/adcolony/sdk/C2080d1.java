package com.adcolony.sdk;

import androidx.constraintlayout.core.C0510h;
import androidx.datastore.preferences.protobuf.C1169e;
import java.io.IOException;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.adcolony.sdk.d1 */
/* loaded from: classes.dex */
public final class C2080d1 {
    /* renamed from: a */
    public static long m9667a(C2367y1 c2367y1, String str, long j) {
        long optLong;
        synchronized (c2367y1.f5690a) {
            optLong = c2367y1.f5690a.optLong(str, j);
        }
        return optLong;
    }

    /* renamed from: b */
    public static C2328v1 m9666b(C2367y1 c2367y1, String str) {
        C2328v1 c2328v1;
        synchronized (c2367y1.f5690a) {
            JSONArray optJSONArray = c2367y1.f5690a.optJSONArray(str);
            if (optJSONArray != null) {
                c2328v1 = new C2328v1(optJSONArray);
            } else {
                c2328v1 = new C2328v1();
            }
        }
        return c2328v1;
    }

    /* renamed from: c */
    public static C2367y1 m9665c(String str, String str2) {
        String sb;
        try {
            return new C2367y1(str);
        } catch (JSONException e) {
            if (str2 == null) {
                sb = "";
            } else {
                StringBuilder m12339b = C0510h.m12339b(str2, ": ");
                m12339b.append(e.toString());
                sb = m12339b.toString();
            }
            C2201m0.m9588d().m9689n().m9706d(sb, 0, 0, true);
            return new C2367y1();
        }
    }

    /* renamed from: d */
    public static C2367y1 m9664d(C2367y1... c2367y1Arr) {
        C2367y1 c2367y1 = new C2367y1();
        for (C2367y1 c2367y12 : c2367y1Arr) {
            if (c2367y12 != null) {
                synchronized (c2367y1.f5690a) {
                    synchronized (c2367y12.f5690a) {
                        Iterator<String> keys = c2367y12.f5690a.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            try {
                                c2367y1.f5690a.put(next, c2367y12.f5690a.get(next));
                            } catch (JSONException unused) {
                            }
                        }
                    }
                }
            }
        }
        return c2367y1;
    }

    /* renamed from: e */
    public static void m9663e(C2367y1 c2367y1, String str, double d) {
        try {
            c2367y1.m9450i(str, d);
        } catch (JSONException unused) {
            StringBuilder sb = new StringBuilder("JSON error in ADCJSON putDouble(): ");
            sb.append(" with key: ".concat(str));
            sb.append(" and value: " + d);
            C1169e.m11129c(sb.toString(), 0, 0, true);
        }
    }

    /* renamed from: f */
    public static void m9662f(C2367y1 c2367y1, String str, C2328v1 c2328v1) {
        try {
            synchronized (c2367y1.f5690a) {
                c2367y1.f5690a.put(str, c2328v1.f5642a);
            }
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("JSON error in ADCJSON putArray(): ");
            sb.append(e.toString());
            sb.append(" with key: " + str);
            sb.append(" and value: " + c2328v1);
            C1169e.m11129c(sb.toString(), 0, 0, true);
        }
    }

    /* renamed from: g */
    public static void m9661g(C2367y1 c2367y1, String str, C2367y1 c2367y12) {
        try {
            c2367y1.m9456c(c2367y12, str);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("JSON error in ADCJSON putObject(): ");
            sb.append(e.toString());
            sb.append(" with key: " + str);
            sb.append(" and value: " + c2367y12);
            C1169e.m11129c(sb.toString(), 0, 0, true);
        }
    }

    /* renamed from: h */
    public static void m9660h(C2367y1 c2367y1, String str, String str2) {
        try {
            c2367y1.m9455d(str, str2);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("JSON error in ADCJSON putString(): ");
            sb.append(e.toString());
            sb.append(" with key: " + str);
            sb.append(" and value: " + str2);
            C1169e.m11129c(sb.toString(), 0, 0, true);
        }
    }

    /* renamed from: i */
    public static boolean m9659i(C2367y1 c2367y1, String str, boolean z) {
        boolean optBoolean;
        synchronized (c2367y1.f5690a) {
            optBoolean = c2367y1.f5690a.optBoolean(str, z);
        }
        return optBoolean;
    }

    /* renamed from: j */
    public static String[] m9658j(C2328v1 c2328v1) {
        String[] strArr;
        synchronized (c2328v1.f5642a) {
            strArr = new String[c2328v1.f5642a.length()];
            for (int i = 0; i < c2328v1.f5642a.length(); i++) {
                strArr[i] = c2328v1.m9480g(i);
            }
        }
        return strArr;
    }

    /* renamed from: k */
    public static void m9657k(int i, C2367y1 c2367y1, String str) {
        try {
            c2367y1.m9451h(i, str);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("JSON error in ADCJSON putInteger(): ");
            sb.append(e.toString());
            sb.append(" with key: ".concat(str));
            sb.append(" and value: " + i);
            C1169e.m11129c(sb.toString(), 0, 0, true);
        }
    }

    /* renamed from: l */
    public static void m9656l(C2367y1 c2367y1, String str, boolean z) {
        try {
            synchronized (c2367y1.f5690a) {
                c2367y1.f5690a.put(str, z);
            }
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("JSON error in ADCJSON putBoolean(): ");
            sb.append(e.toString());
            sb.append(" with key: ".concat(str));
            sb.append(" and value: " + z);
            C1169e.m11129c(sb.toString(), 0, 0, true);
        }
    }

    /* renamed from: m */
    public static C2367y1 m9655m(String str) {
        try {
            C2201m0.m9588d().m9690m().getClass();
            String sb = C2298t5.m9498a(str, false).toString();
            return m9665c(sb, "loadObject from filepath " + str);
        } catch (IOException e) {
            C2201m0.m9588d().m9689n().m9706d("IOException in ADCJSON's loadObject: " + e.toString(), 0, 0, true);
            return new C2367y1();
        }
    }

    /* renamed from: n */
    public static String m9654n(C2367y1 c2367y1, String str) {
        String valueOf;
        synchronized (c2367y1.f5690a) {
            if (!c2367y1.f5690a.isNull(str)) {
                Object opt = c2367y1.f5690a.opt(str);
                if (opt instanceof String) {
                    valueOf = (String) opt;
                } else if (opt != null) {
                    valueOf = String.valueOf(opt);
                }
                return valueOf;
            }
            return null;
        }
    }

    /* renamed from: o */
    public static void m9653o(C2367y1 c2367y1, String str) {
        try {
            C2298t5 m9690m = C2201m0.m9588d().m9690m();
            String c2367y12 = c2367y1.toString();
            m9690m.getClass();
            C2298t5.m9495d(str, c2367y12, false);
        } catch (IOException e) {
            C1169e.m11129c("IOException in ADCJSON's saveObject: " + e.toString(), 0, 0, true);
        }
    }
}
