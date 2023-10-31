package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import com.google.ads.mediation.facebook.FacebookAdapter;

/* renamed from: com.adcolony.sdk.k0 */
/* loaded from: classes.dex */
public final class RunnableC2180k0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ TextureView$SurfaceTextureListenerC2142j0 f5331a;

    public RunnableC2180k0(TextureView$SurfaceTextureListenerC2142j0 textureView$SurfaceTextureListenerC2142j0) {
        this.f5331a = textureView$SurfaceTextureListenerC2142j0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect;
        TextureView$SurfaceTextureListenerC2142j0 textureView$SurfaceTextureListenerC2142j0 = this.f5331a;
        textureView$SurfaceTextureListenerC2142j0.f5253r = 0L;
        while (!textureView$SurfaceTextureListenerC2142j0.f5254s && !textureView$SurfaceTextureListenerC2142j0.f5257v && C2201m0.m9587e()) {
            Context context = C2201m0.f5363a;
            if (!textureView$SurfaceTextureListenerC2142j0.f5254s && !textureView$SurfaceTextureListenerC2142j0.f5259x && context != null && (context instanceof Activity)) {
                if (textureView$SurfaceTextureListenerC2142j0.f5232K.isPlaying()) {
                    if (textureView$SurfaceTextureListenerC2142j0.f5253r == 0 && C2201m0.f5366d) {
                        textureView$SurfaceTextureListenerC2142j0.f5253r = System.currentTimeMillis();
                    }
                    textureView$SurfaceTextureListenerC2142j0.f5256u = true;
                    textureView$SurfaceTextureListenerC2142j0.f5251p = textureView$SurfaceTextureListenerC2142j0.f5232K.getCurrentPosition() / 1000.0d;
                    textureView$SurfaceTextureListenerC2142j0.f5252q = textureView$SurfaceTextureListenerC2142j0.f5232K.getDuration() / 1000.0d;
                    if (System.currentTimeMillis() - textureView$SurfaceTextureListenerC2142j0.f5253r > 1000 && !textureView$SurfaceTextureListenerC2142j0.f5222A && C2201m0.f5366d) {
                        if (textureView$SurfaceTextureListenerC2142j0.f5251p == 0.0d) {
                            C2201m0.m9588d().m9689n().m9706d("getCurrentPosition() not working, firing AdSession.on_error", 0, 0, true);
                            textureView$SurfaceTextureListenerC2142j0.m9614b();
                        } else {
                            textureView$SurfaceTextureListenerC2142j0.f5222A = true;
                        }
                    }
                    if (textureView$SurfaceTextureListenerC2142j0.f5261z) {
                        if (textureView$SurfaceTextureListenerC2142j0.f5241f) {
                            textureView$SurfaceTextureListenerC2142j0.f5238c = (float) (360.0d / textureView$SurfaceTextureListenerC2142j0.f5252q);
                            Paint paint = textureView$SurfaceTextureListenerC2142j0.f5243h;
                            paint.setColor(-3355444);
                            paint.setShadowLayer((int) (textureView$SurfaceTextureListenerC2142j0.f5239d * 2.0f), 0.0f, 0.0f, -16777216);
                            paint.setTextAlign(Paint.Align.CENTER);
                            paint.setLinearText(true);
                            paint.setTextSize(textureView$SurfaceTextureListenerC2142j0.f5239d * 12.0f);
                            Paint paint2 = textureView$SurfaceTextureListenerC2142j0.f5242g;
                            paint2.setStyle(Paint.Style.STROKE);
                            float f = textureView$SurfaceTextureListenerC2142j0.f5239d * 2.0f;
                            if (f > 6.0f) {
                                f = 6.0f;
                            }
                            if (f < 4.0f) {
                                f = 4.0f;
                            }
                            paint2.setStrokeWidth(f);
                            paint2.setShadowLayer((int) (textureView$SurfaceTextureListenerC2142j0.f5239d * 3.0f), 0.0f, 0.0f, -16777216);
                            paint2.setColor(-3355444);
                            paint.getTextBounds("0123456789", 0, 9, new Rect());
                            textureView$SurfaceTextureListenerC2142j0.f5236a = rect.height();
                            Context context2 = C2201m0.f5363a;
                            if (context2 != null) {
                                C2232o6.m9548o(new RunnableC2188l0(textureView$SurfaceTextureListenerC2142j0, context2));
                            }
                            textureView$SurfaceTextureListenerC2142j0.f5241f = false;
                        }
                        textureView$SurfaceTextureListenerC2142j0.f5240e = (int) (textureView$SurfaceTextureListenerC2142j0.f5252q - textureView$SurfaceTextureListenerC2142j0.f5251p);
                        float f2 = textureView$SurfaceTextureListenerC2142j0.f5236a;
                        float f3 = (int) f2;
                        float f4 = (int) (3.0f * f2);
                        float f5 = f2 / 2.0f;
                        float f6 = f2 * 2.0f;
                        textureView$SurfaceTextureListenerC2142j0.f5229H.set(f3 - f5, f4 - f6, f3 + f6, f4 + f5);
                        textureView$SurfaceTextureListenerC2142j0.f5237b = (float) ((textureView$SurfaceTextureListenerC2142j0.f5252q - textureView$SurfaceTextureListenerC2142j0.f5251p) * textureView$SurfaceTextureListenerC2142j0.f5238c);
                    }
                }
                if (textureView$SurfaceTextureListenerC2142j0.f5256u && !textureView$SurfaceTextureListenerC2142j0.f5254s && !textureView$SurfaceTextureListenerC2142j0.f5257v) {
                    int i = textureView$SurfaceTextureListenerC2142j0.f5248m;
                    C2367y1 c2367y1 = textureView$SurfaceTextureListenerC2142j0.f5233L;
                    C2080d1.m9657k(i, c2367y1, FacebookAdapter.KEY_ID);
                    C2135i1 c2135i1 = textureView$SurfaceTextureListenerC2142j0.f5227F;
                    C2080d1.m9657k(c2135i1.f5201j, c2367y1, "container_id");
                    C2080d1.m9660h(c2367y1, "ad_session_id", textureView$SurfaceTextureListenerC2142j0.f5225D);
                    C2080d1.m9663e(c2367y1, "elapsed", textureView$SurfaceTextureListenerC2142j0.f5251p);
                    C2080d1.m9663e(c2367y1, "duration", textureView$SurfaceTextureListenerC2142j0.f5252q);
                    new C2100e2(c2135i1.f5202k, c2367y1, "VideoView.on_progress").m9640b();
                }
                if (!textureView$SurfaceTextureListenerC2142j0.f5255t && !((Activity) context).isFinishing()) {
                    try {
                        Thread.sleep(50L);
                    } catch (InterruptedException unused) {
                        textureView$SurfaceTextureListenerC2142j0.m9614b();
                        C2201m0.m9588d().m9689n().m9706d("InterruptedException in ADCVideoView's update thread.", 0, 0, false);
                    }
                } else {
                    textureView$SurfaceTextureListenerC2142j0.f5255t = false;
                    textureView$SurfaceTextureListenerC2142j0.m9611e();
                    return;
                }
            } else {
                return;
            }
        }
        if (textureView$SurfaceTextureListenerC2142j0.f5255t) {
            textureView$SurfaceTextureListenerC2142j0.m9611e();
        }
    }
}
