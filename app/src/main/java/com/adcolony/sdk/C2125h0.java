package com.adcolony.sdk;

/* renamed from: com.adcolony.sdk.h0 */
/* loaded from: classes.dex */
public final class C2125h0 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ TextureView$SurfaceTextureListenerC2142j0 f5162a;

    public C2125h0(TextureView$SurfaceTextureListenerC2142j0 textureView$SurfaceTextureListenerC2142j0) {
        this.f5162a = textureView$SurfaceTextureListenerC2142j0;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        TextureView$SurfaceTextureListenerC2142j0 textureView$SurfaceTextureListenerC2142j0 = this.f5162a;
        if (TextureView$SurfaceTextureListenerC2142j0.m9615a(textureView$SurfaceTextureListenerC2142j0, c2100e2) && textureView$SurfaceTextureListenerC2142j0.f5258w) {
            if (textureView$SurfaceTextureListenerC2142j0.f5254s) {
                textureView$SurfaceTextureListenerC2142j0.f5254s = false;
            }
            textureView$SurfaceTextureListenerC2142j0.f5235N = c2100e2;
            int m9441r = c2100e2.f5098b.m9441r("time");
            int duration = textureView$SurfaceTextureListenerC2142j0.f5232K.getDuration() / 1000;
            textureView$SurfaceTextureListenerC2142j0.f5232K.setOnSeekCompleteListener(textureView$SurfaceTextureListenerC2142j0);
            textureView$SurfaceTextureListenerC2142j0.f5232K.seekTo(m9441r * 1000);
            if (duration == m9441r) {
                textureView$SurfaceTextureListenerC2142j0.f5254s = true;
            }
        }
    }
}
