package com.unity3d.services.core.request;

import android.os.Bundle;
import com.unity3d.services.core.log.C9549a;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.unity3d.services.core.request.k */
/* loaded from: classes3.dex */
public class RunnableC9587k implements Runnable {

    /* renamed from: a */
    private C9583h f18989a;

    /* renamed from: b */
    private boolean f18990b = false;

    /* renamed from: c */
    private final String f18991c;

    /* renamed from: d */
    private final String f18992d;

    /* renamed from: e */
    private final String f18993e;

    /* renamed from: f */
    private final int f18994f;

    /* renamed from: g */
    private final int f18995g;

    /* renamed from: h */
    private final Map<String, List<String>> f18996h;

    /* renamed from: i */
    private final InterfaceC9578c f18997i;

    public RunnableC9587k(String str, String str2, String str3, int i, int i2, Map<String, List<String>> map, InterfaceC9578c interfaceC9578c) {
        this.f18991c = str;
        this.f18992d = str2;
        this.f18993e = str3;
        this.f18994f = i;
        this.f18995g = i2;
        this.f18996h = map;
        this.f18997i = interfaceC9578c;
    }

    /* renamed from: a */
    private Map<String, List<String>> m1884a(Bundle bundle) {
        if (bundle.size() > 0) {
            HashMap hashMap = new HashMap();
            for (String str : bundle.keySet()) {
                String[] stringArray = bundle.getStringArray(str);
                if (stringArray != null) {
                    hashMap.put(str, new ArrayList(Arrays.asList(stringArray)));
                }
            }
            return hashMap;
        }
        return null;
    }

    /* renamed from: a */
    private void m1883a(String str) {
        this.f18997i.mo1906a(this.f18991c, str);
    }

    /* renamed from: a */
    private void m1882a(String str, int i, Map<String, List<String>> map) {
        this.f18997i.mo1905a(this.f18991c, str, i, map);
    }

    /* renamed from: a */
    private void m1881a(String str, String str2, Map<String, List<String>> map, String str3, int i, int i2) throws MalformedURLException {
        if (this.f18990b) {
            return;
        }
        C9583h c9583h = new C9583h(str, str2, map, i, i2);
        this.f18989a = c9583h;
        if (str3 != null) {
            c9583h.m1899a(str3);
        }
        try {
            String m1885n = this.f18989a.m1885n();
            if (this.f18989a.m1886m()) {
                return;
            }
            Bundle bundle = new Bundle();
            for (String str4 : this.f18989a.m1888k().keySet()) {
                if (str4 != null && !str4.contentEquals("null")) {
                    String[] strArr = new String[this.f18989a.m1888k().get(str4).size()];
                    for (int i3 = 0; i3 < this.f18989a.m1888k().get(str4).size(); i3++) {
                        strArr[i3] = this.f18989a.m1888k().get(str4).get(i3);
                    }
                    bundle.putStringArray(str4, strArr);
                }
            }
            if (this.f18989a.m1886m()) {
                return;
            }
            m1882a(m1885n, this.f18989a.m1889j(), m1884a(bundle));
        } catch (Exception e) {
            C9549a.m2023a("Error completing request", e);
            m1883a(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    /* renamed from: a */
    public void m1880a(boolean z) {
        C9583h c9583h;
        this.f18990b = z;
        if (!z || (c9583h = this.f18989a) == null) {
            return;
        }
        c9583h.m1902a();
    }

    @Override // java.lang.Runnable
    public void run() {
        C9549a.m2019b("Handling request message: " + this.f18991c + " type=" + this.f18992d);
        try {
            m1881a(this.f18991c, this.f18992d, this.f18996h, this.f18993e, this.f18994f, this.f18995g);
        } catch (MalformedURLException e) {
            C9549a.m2023a("Malformed URL", e);
            m1883a("Malformed URL");
        }
    }
}
