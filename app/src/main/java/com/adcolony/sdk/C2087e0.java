package com.adcolony.sdk;

import android.widget.FrameLayout;

/* renamed from: com.adcolony.sdk.e0 */
/* loaded from: classes.dex */
public final class C2087e0 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ TextureView$SurfaceTextureListenerC2142j0 f5075a;

    public C2087e0(TextureView$SurfaceTextureListenerC2142j0 textureView$SurfaceTextureListenerC2142j0) {
        this.f5075a = textureView$SurfaceTextureListenerC2142j0;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        TextureView$SurfaceTextureListenerC2142j0 textureView$SurfaceTextureListenerC2142j0 = this.f5075a;
        if (TextureView$SurfaceTextureListenerC2142j0.m9615a(textureView$SurfaceTextureListenerC2142j0, c2100e2)) {
            C2367y1 c2367y1 = c2100e2.f5098b;
            textureView$SurfaceTextureListenerC2142j0.f5244i = c2367y1.m9441r("x");
            textureView$SurfaceTextureListenerC2142j0.f5245j = c2367y1.m9441r("y");
            textureView$SurfaceTextureListenerC2142j0.f5246k = c2367y1.m9441r("width");
            textureView$SurfaceTextureListenerC2142j0.f5247l = c2367y1.m9441r("height");
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView$SurfaceTextureListenerC2142j0.getLayoutParams();
            layoutParams.setMargins(textureView$SurfaceTextureListenerC2142j0.f5244i, textureView$SurfaceTextureListenerC2142j0.f5245j, 0, 0);
            layoutParams.width = textureView$SurfaceTextureListenerC2142j0.f5246k;
            layoutParams.height = textureView$SurfaceTextureListenerC2142j0.f5247l;
            textureView$SurfaceTextureListenerC2142j0.setLayoutParams(layoutParams);
            if (textureView$SurfaceTextureListenerC2142j0.f5261z && textureView$SurfaceTextureListenerC2142j0.f5230I != null) {
                int i = (int) (textureView$SurfaceTextureListenerC2142j0.f5236a * 4.0f);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i, i);
                layoutParams2.setMargins(0, textureView$SurfaceTextureListenerC2142j0.f5227F.f5200i - ((int) (textureView$SurfaceTextureListenerC2142j0.f5236a * 4.0f)), 0, 0);
                layoutParams2.gravity = 0;
                textureView$SurfaceTextureListenerC2142j0.f5230I.setLayoutParams(layoutParams2);
            }
        }
    }
}
