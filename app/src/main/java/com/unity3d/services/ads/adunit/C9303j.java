package com.unity3d.services.ads.adunit;

import android.os.Bundle;
import android.view.View;
import com.unity3d.services.core.misc.C9565k;
import com.unity3d.services.core.webview.C9620a;

/* renamed from: com.unity3d.services.ads.adunit.j */
/* loaded from: classes3.dex */
public class C9303j implements InterfaceC9299f {
    @Override // com.unity3d.services.ads.adunit.InterfaceC9299f
    /* renamed from: a */
    public void mo2480a(AdUnitActivity adUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.InterfaceC9299f
    /* renamed from: a */
    public void mo2479a(AdUnitActivity adUnitActivity, Bundle bundle) {
    }

    @Override // com.unity3d.services.ads.adunit.InterfaceC9299f
    /* renamed from: a */
    public boolean mo2481a() {
        if (C9620a.m1774c() == null || C9620a.m1774c().m1770g() == null) {
            return true;
        }
        C9565k.m1982a(C9620a.m1774c().m1770g());
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.InterfaceC9299f
    /* renamed from: b */
    public View mo2478b() {
        if (C9620a.m1774c() != null) {
            return C9620a.m1774c().m1770g();
        }
        return null;
    }

    @Override // com.unity3d.services.ads.adunit.InterfaceC9299f
    /* renamed from: b */
    public void mo2477b(AdUnitActivity adUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.InterfaceC9299f
    /* renamed from: c */
    public void mo2476c(AdUnitActivity adUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.InterfaceC9299f
    /* renamed from: d */
    public void mo2475d(AdUnitActivity adUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.InterfaceC9299f
    /* renamed from: e */
    public boolean mo2474e(AdUnitActivity adUnitActivity) {
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.InterfaceC9299f
    /* renamed from: f */
    public void mo2473f(AdUnitActivity adUnitActivity) {
        mo2481a();
    }
}
