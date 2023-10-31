package com.unity3d.services.ads.gmascar.finder;

import com.google.ads.AdRequest;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.gmascar.bridges.C9334e;
import com.unity3d.services.ads.gmascar.listeners.InterfaceC9345a;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;

/* renamed from: com.unity3d.services.ads.gmascar.finder.c */
/* loaded from: classes3.dex */
public class C9338c implements InterfaceC9345a {

    /* renamed from: a */
    private static C9334e f18239a;

    /* renamed from: b */
    private C9337b f18240b;

    /* renamed from: c */
    private C9336a f18241c;

    /* renamed from: d */
    private long f18242d = -1;

    public C9338c(C9334e c9334e, C9337b c9337b, C9336a c9336a) {
        f18239a = c9334e;
        this.f18240b = c9337b;
        this.f18241c = c9336a;
        c9336a.m2446a().m2451a(this);
    }

    /* renamed from: a */
    public long m2441a() {
        String m2447j;
        if (this.f18242d == -1 && (m2447j = f18239a.m2447j()) != null) {
            String[] split = m2447j.split("\\.");
            if (split.length > 1) {
                this.f18242d = Long.parseLong(split[1]);
            }
        }
        return this.f18242d;
    }

    @Override // com.unity3d.services.ads.gmascar.listeners.InterfaceC9345a
    /* renamed from: a */
    public void mo2436a(Object obj) {
        m2440a(this.f18241c.m2445a(obj));
    }

    /* renamed from: a */
    public void m2440a(boolean z) {
        C9620a.m1774c().m1784a(EnumC9627b.INIT_GMA, GMAEvent.VERSION, z ? f18239a.m2447j() : AdRequest.VERSION);
    }

    /* renamed from: b */
    public void m2439b() {
        try {
            if (!this.f18240b.m2442a()) {
                C9620a.m1774c().m1784a(EnumC9627b.INIT_GMA, GMAEvent.VERSION, AdRequest.VERSION);
            } else if (this.f18241c.m2443c()) {
                m2440a(true);
            } else {
                this.f18241c.m2444b();
            }
        } catch (Exception e) {
            C9549a.m2022a("Got exception finding GMA SDK: %s", e.getLocalizedMessage());
        }
    }
}
