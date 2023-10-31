package com.adcolony.sdk;

import android.content.Context;
import android.widget.FrameLayout;
import com.adcolony.sdk.TextureView$SurfaceTextureListenerC2142j0;

/* renamed from: com.adcolony.sdk.l0 */
/* loaded from: classes.dex */
public final class RunnableC2188l0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f5343a;

    /* renamed from: b */
    public final /* synthetic */ TextureView$SurfaceTextureListenerC2142j0 f5344b;

    public RunnableC2188l0(TextureView$SurfaceTextureListenerC2142j0 textureView$SurfaceTextureListenerC2142j0, Context context) {
        this.f5344b = textureView$SurfaceTextureListenerC2142j0;
        this.f5343a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f5343a;
        TextureView$SurfaceTextureListenerC2142j0 textureView$SurfaceTextureListenerC2142j0 = this.f5344b;
        textureView$SurfaceTextureListenerC2142j0.f5230I = new TextureView$SurfaceTextureListenerC2142j0.C2144b(context);
        float f = textureView$SurfaceTextureListenerC2142j0.f5236a;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (f * 4.0f), (int) (f * 4.0f));
        layoutParams.setMargins(0, textureView$SurfaceTextureListenerC2142j0.f5227F.f5200i - ((int) (textureView$SurfaceTextureListenerC2142j0.f5236a * 4.0f)), 0, 0);
        layoutParams.gravity = 0;
        textureView$SurfaceTextureListenerC2142j0.f5227F.addView(textureView$SurfaceTextureListenerC2142j0.f5230I, layoutParams);
    }
}
