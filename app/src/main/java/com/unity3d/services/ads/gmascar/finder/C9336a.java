package com.unity3d.services.ads.gmascar.finder;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.gmascar.bridges.C9326a;
import com.unity3d.services.ads.gmascar.bridges.C9329c;
import com.unity3d.services.ads.gmascar.bridges.C9331d;
import com.unity3d.services.ads.gmascar.bridges.C9334e;
import com.unity3d.services.ads.gmascar.utils.C9346a;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;

/* renamed from: com.unity3d.services.ads.gmascar.finder.a */
/* loaded from: classes3.dex */
public class C9336a {

    /* renamed from: a */
    private C9334e f18230a;

    /* renamed from: b */
    private C9331d f18231b;

    /* renamed from: c */
    private C9329c f18232c;

    /* renamed from: d */
    private C9326a f18233d;

    /* renamed from: e */
    private C9346a f18234e = new C9346a();

    public C9336a(C9334e c9334e, C9331d c9331d, C9329c c9329c, C9326a c9326a) {
        this.f18230a = c9334e;
        this.f18231b = c9331d;
        this.f18232c = c9329c;
        this.f18233d = c9326a;
    }

    /* renamed from: a */
    public C9331d m2446a() {
        return this.f18231b;
    }

    /* renamed from: a */
    public boolean m2445a(Object obj) {
        Object obj2 = this.f18232c.m2453a(obj).get(this.f18230a.mo1685g());
        if (obj2 != null) {
            if (this.f18233d.m2456a(obj2)) {
                C9620a.m1774c().m1784a(EnumC9627b.GMA, GMAEvent.INIT_SUCCESS, new Object[0]);
                return true;
            }
            C9620a.m1774c().m1784a(EnumC9627b.GMA, GMAEvent.INIT_ERROR, new Object[0]);
        }
        return false;
    }

    /* renamed from: b */
    public void m2444b() {
        if (m2443c()) {
            this.f18234e.m2435a(GMAEvent.ALREADY_INITIALIZED, new Object[0]);
        } else {
            this.f18230a.m2449a(C9568a.m1959e(), this.f18231b.m2450i());
        }
    }

    /* renamed from: c */
    public boolean m2443c() {
        try {
            try {
                return m2445a(this.f18230a.m2448i());
            } catch (Exception e) {
                C9549a.m2022a("ERROR: Could not get initialization status of GMA SDK - %s", e.getLocalizedMessage());
                return false;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
