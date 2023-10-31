package com.adcolony.sdk;

import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.adcolony.sdk.i0 */
/* loaded from: classes.dex */
public final class C2134i0 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ TextureView$SurfaceTextureListenerC2142j0 f5191a;

    public C2134i0(TextureView$SurfaceTextureListenerC2142j0 textureView$SurfaceTextureListenerC2142j0) {
        this.f5191a = textureView$SurfaceTextureListenerC2142j0;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        double optDouble;
        TextureView$SurfaceTextureListenerC2142j0 textureView$SurfaceTextureListenerC2142j0 = this.f5191a;
        if (TextureView$SurfaceTextureListenerC2142j0.m9615a(textureView$SurfaceTextureListenerC2142j0, c2100e2) && textureView$SurfaceTextureListenerC2142j0.f5258w) {
            C2367y1 c2367y1 = c2100e2.f5098b;
            synchronized (c2367y1.f5690a) {
                optDouble = c2367y1.f5690a.optDouble("volume", 0.0d);
            }
            float f = (float) optDouble;
            C2249q c2249q = C2201m0.m9588d().f4997o;
            textureView$SurfaceTextureListenerC2142j0.f5232K.setVolume(f, f);
            C2367y1 c2367y12 = new C2367y1();
            C2080d1.m9656l(c2367y12, FirebaseAnalytics.Param.SUCCESS, true);
            c2100e2.m9641a(c2367y12).m9640b();
        }
    }
}
