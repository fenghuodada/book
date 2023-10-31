package com.unity3d.services.ads.adunit;

import android.os.Bundle;
import android.view.View;
import com.unity3d.services.ads.webplayer.C9413e;
import com.unity3d.services.ads.webplayer.C9414f;
import com.unity3d.services.ads.webplayer.C9422g;
import com.unity3d.services.core.misc.C9565k;

/* renamed from: com.unity3d.services.ads.adunit.i */
/* loaded from: classes3.dex */
public class C9302i implements InterfaceC9299f {

    /* renamed from: a */
    private static String f18171a = "webplayer";

    /* renamed from: b */
    private C9414f f18172b;

    @Override // com.unity3d.services.ads.adunit.InterfaceC9299f
    /* renamed from: a */
    public void mo2480a(AdUnitActivity adUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.InterfaceC9299f
    /* renamed from: a */
    public void mo2479a(AdUnitActivity adUnitActivity, Bundle bundle) {
        mo2474e(adUnitActivity);
    }

    @Override // com.unity3d.services.ads.adunit.InterfaceC9299f
    /* renamed from: a */
    public boolean mo2481a() {
        C9414f c9414f = this.f18172b;
        if (c9414f != null) {
            C9565k.m1982a(c9414f);
            this.f18172b.destroy();
        }
        C9422g.m2324a().m2321b(f18171a);
        this.f18172b = null;
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.InterfaceC9299f
    /* renamed from: b */
    public View mo2478b() {
        return this.f18172b;
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
        if (this.f18172b == null) {
            C9413e m2354a = C9413e.m2354a();
            String str = f18171a;
            C9414f c9414f = new C9414f(adUnitActivity, str, m2354a.m2349c(str), m2354a.m2351b(f18171a));
            this.f18172b = c9414f;
            c9414f.setEventSettings(m2354a.m2353a(f18171a));
            C9422g.m2324a().m2322a(f18171a, this.f18172b);
            return true;
        }
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.InterfaceC9299f
    /* renamed from: f */
    public void mo2473f(AdUnitActivity adUnitActivity) {
        if (adUnitActivity.isFinishing()) {
            mo2481a();
        }
    }
}
