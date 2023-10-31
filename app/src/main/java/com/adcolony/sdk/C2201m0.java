package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import com.google.ads.mediation.adcolony.AdColonyAdapterUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.adcolony.sdk.m0 */
/* loaded from: classes.dex */
public final class C2201m0 {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: a */
    public static Context f5363a = null;

    /* renamed from: b */
    public static C2058b3 f5364b = null;

    /* renamed from: c */
    public static boolean f5365c = false;

    /* renamed from: d */
    public static boolean f5366d = false;

    /* renamed from: e */
    public static boolean f5367e = false;

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
        if (r4.m9444o("COPPA".toLowerCase(r1) + "_required") != false) goto L7;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m9591a(com.adcolony.sdk.C2200m r4) {
        /*
            java.lang.String r0 = "is_child_directed"
            com.adcolony.sdk.y1 r4 = r4.f5362b
            boolean r0 = r4.m9444o(r0)
            if (r0 == 0) goto L44
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r2 = "COPPA"
            java.lang.String r3 = r2.toLowerCase(r1)
            r0.append(r3)
            java.lang.String r3 = "_required"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r0 = r4.m9453f(r0)
            if (r0 == 0) goto L42
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.toLowerCase(r1)
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r4 = r4.m9444o(r0)
            if (r4 == 0) goto L44
        L42:
            r4 = 1
            goto L45
        L44:
            r4 = 0
        L45:
            com.adcolony.sdk.C2201m0.f5367e = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.C2201m0.m9591a(com.adcolony.sdk.m):void");
    }

    /* renamed from: b */
    public static void m9590b(String str, InterfaceC2203m2 interfaceC2203m2) {
        HashMap<String, ArrayList<InterfaceC2203m2>> hashMap = m9588d().m9688o().f5126c;
        ArrayList<InterfaceC2203m2> arrayList = hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            hashMap.put(str, arrayList);
        }
        arrayList.add(interfaceC2203m2);
    }

    /* renamed from: c */
    public static void m9589c(String str, InterfaceC2203m2 interfaceC2203m2) {
        HashMap<String, ArrayList<InterfaceC2203m2>> hashMap = m9588d().m9688o().f5126c;
        ArrayList<InterfaceC2203m2> arrayList = hashMap.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            hashMap.put(str, arrayList);
        }
        arrayList.add(interfaceC2203m2);
    }

    /* renamed from: d */
    public static C2058b3 m9588d() {
        if (!m9586f()) {
            Context context = f5363a;
            if (context != null) {
                f5364b = new C2058b3();
                String m9436w = C2080d1.m9655m(context.getFilesDir().getAbsolutePath() + "/adc3/AppInfo").m9436w("appId");
                C2200m c2200m = new C2200m();
                if (m9436w != null) {
                    c2200m.f5361a = m9436w;
                    C2080d1.m9660h(c2200m.f5362b, AdColonyAdapterUtils.KEY_APP_ID, m9436w);
                }
                f5364b.m9697f(c2200m);
            } else {
                return new C2058b3();
            }
        }
        return f5364b;
    }

    /* renamed from: e */
    public static boolean m9587e() {
        return f5363a != null;
    }

    /* renamed from: f */
    public static boolean m9586f() {
        return f5364b != null;
    }

    /* renamed from: g */
    public static void m9585g() {
        C2117g2 m9688o = m9588d().m9688o();
        synchronized (m9688o.f5124a) {
            ArrayList arrayList = new ArrayList(m9688o.f5124a.values());
            Collections.reverse(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((InterfaceC2228o3) it.next()).mo9569d();
            }
        }
    }
}
