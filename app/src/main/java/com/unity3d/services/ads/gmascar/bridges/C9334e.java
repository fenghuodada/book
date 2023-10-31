package com.unity3d.services.ads.gmascar.bridges;

import android.content.Context;
import com.google.ads.AdRequest;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.reflection.AbstractC9574a;
import java.util.HashMap;

/* renamed from: com.unity3d.services.ads.gmascar.bridges.e */
/* loaded from: classes3.dex */
public class C9334e extends AbstractC9574a {

    /* renamed from: com.unity3d.services.ads.gmascar.bridges.e$a */
    /* loaded from: classes3.dex */
    public class C9335a extends HashMap<String, Class<?>[]> {
        public C9335a() throws RuntimeException, Error {
            try {
                put("initialize", new Class[]{Context.class, OnInitializationCompleteListener.class});
            } catch (ClassNotFoundException e) {
                C9549a.m2022a("Could not find class \"com.google.android.gms.ads.initialization.OnInitializationCompleteListener\" %s", e.getLocalizedMessage());
            }
            put("getInitializationStatus", new Class[0]);
            put("getVersionString", new Class[0]);
        }
    }

    public C9334e() {
        super(new C9335a());
    }

    /* renamed from: a */
    public void m2449a(Context context, Object obj) {
        m1915b("initialize", null, context, obj);
    }

    @Override // com.unity3d.services.core.reflection.AbstractC9574a
    /* renamed from: g */
    public String mo1685g() {
        return "com.google.android.gms.ads.MobileAds";
    }

    /* renamed from: i */
    public Object m2448i() {
        return m1917a("getInitializationStatus", (Object) null, new Object[0]);
    }

    /* renamed from: j */
    public String m2447j() {
        Object m1917a = m1917a("getVersionString", (Object) null, new Object[0]);
        return m1917a == null ? AdRequest.VERSION : m1917a.toString();
    }
}
