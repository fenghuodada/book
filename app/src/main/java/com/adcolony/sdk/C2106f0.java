package com.adcolony.sdk;

import com.adcolony.sdk.TextureView$SurfaceTextureListenerC2142j0;

/* renamed from: com.adcolony.sdk.f0 */
/* loaded from: classes.dex */
public final class C2106f0 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ TextureView$SurfaceTextureListenerC2142j0 f5105a;

    public C2106f0(TextureView$SurfaceTextureListenerC2142j0 textureView$SurfaceTextureListenerC2142j0) {
        this.f5105a = textureView$SurfaceTextureListenerC2142j0;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        int i;
        TextureView$SurfaceTextureListenerC2142j0.C2144b c2144b;
        TextureView$SurfaceTextureListenerC2142j0 textureView$SurfaceTextureListenerC2142j0 = this.f5105a;
        if (TextureView$SurfaceTextureListenerC2142j0.m9615a(textureView$SurfaceTextureListenerC2142j0, c2100e2)) {
            if (c2100e2.f5098b.m9444o("visible")) {
                i = 0;
                textureView$SurfaceTextureListenerC2142j0.setVisibility(0);
                if (!textureView$SurfaceTextureListenerC2142j0.f5261z || (c2144b = textureView$SurfaceTextureListenerC2142j0.f5230I) == null) {
                    return;
                }
            } else {
                i = 4;
                textureView$SurfaceTextureListenerC2142j0.setVisibility(4);
                if (!textureView$SurfaceTextureListenerC2142j0.f5261z || (c2144b = textureView$SurfaceTextureListenerC2142j0.f5230I) == null) {
                    return;
                }
            }
            c2144b.setVisibility(i);
        }
    }
}
