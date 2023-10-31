package com.adcolony.sdk;

import com.unity3d.ads.metadata.MediationMetaData;

/* renamed from: com.adcolony.sdk.s2 */
/* loaded from: classes.dex */
public final class C2285s2 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2058b3 f5557a;

    public C2285s2(C2058b3 c2058b3) {
        this.f5557a = c2058b3;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2323u4 c2323u4 = this.f5557a.m9689n().f4926e;
        this.f5557a.m9691l().f5471g = c2100e2.f5098b.m9436w(MediationMetaData.KEY_VERSION);
        if (c2323u4 != null) {
            String str = this.f5557a.m9691l().f5471g;
            synchronized (c2323u4) {
                c2323u4.f5631d.put("controllerVersion", str);
            }
        }
    }
}
