package com.adcolony.sdk;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.datastore.preferences.protobuf.C1169e;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.iab.omid.library.adcolony.adsession.EnumC8717g;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import libv2ray.V2rayConfig;

/* renamed from: com.adcolony.sdk.u0 */
/* loaded from: classes.dex */
public final class C2318u0 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2135i1 f5620a;

    public C2318u0(C2135i1 c2135i1) {
        this.f5620a = c2135i1;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        Context context;
        C2135i1 c2135i1 = this.f5620a;
        if (c2135i1.m9617b(c2100e2)) {
            int m9441r = c2100e2.f5098b.m9441r(FacebookAdapter.KEY_ID);
            TextureView$SurfaceTextureListenerC2142j0 textureView$SurfaceTextureListenerC2142j0 = new TextureView$SurfaceTextureListenerC2142j0(c2135i1.f5216y, c2100e2, m9441r, c2135i1);
            C2367y1 c2367y1 = textureView$SurfaceTextureListenerC2142j0.f5226E.f5098b;
            textureView$SurfaceTextureListenerC2142j0.f5225D = c2367y1.m9436w("ad_session_id");
            textureView$SurfaceTextureListenerC2142j0.f5244i = c2367y1.m9441r("x");
            textureView$SurfaceTextureListenerC2142j0.f5245j = c2367y1.m9441r("y");
            textureView$SurfaceTextureListenerC2142j0.f5246k = c2367y1.m9441r("width");
            textureView$SurfaceTextureListenerC2142j0.f5247l = c2367y1.m9441r("height");
            textureView$SurfaceTextureListenerC2142j0.f5261z = c2367y1.m9444o("enable_timer");
            textureView$SurfaceTextureListenerC2142j0.f5223B = c2367y1.m9444o("enable_progress");
            textureView$SurfaceTextureListenerC2142j0.f5224C = c2367y1.m9436w("filepath");
            textureView$SurfaceTextureListenerC2142j0.f5249n = c2367y1.m9441r("video_width");
            textureView$SurfaceTextureListenerC2142j0.f5250o = c2367y1.m9441r("video_height");
            C2201m0.m9588d().m9691l().getClass();
            textureView$SurfaceTextureListenerC2142j0.f5239d = C2247p4.m9524g();
            C1169e.m11129c("Original video dimensions = " + textureView$SurfaceTextureListenerC2142j0.f5249n + "x" + textureView$SurfaceTextureListenerC2142j0.f5250o, 0, 3, true);
            textureView$SurfaceTextureListenerC2142j0.setVisibility(4);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(textureView$SurfaceTextureListenerC2142j0.f5246k, textureView$SurfaceTextureListenerC2142j0.f5247l);
            layoutParams.setMargins(textureView$SurfaceTextureListenerC2142j0.f5244i, textureView$SurfaceTextureListenerC2142j0.f5245j, 0, 0);
            layoutParams.gravity = 0;
            C2135i1 c2135i12 = textureView$SurfaceTextureListenerC2142j0.f5227F;
            c2135i12.addView(textureView$SurfaceTextureListenerC2142j0, layoutParams);
            if (textureView$SurfaceTextureListenerC2142j0.f5223B && (context = C2201m0.f5363a) != null) {
                ProgressBar progressBar = new ProgressBar(context);
                textureView$SurfaceTextureListenerC2142j0.f5231J = progressBar;
                int i = (int) (textureView$SurfaceTextureListenerC2142j0.f5239d * 100.0f);
                c2135i12.addView(progressBar, new FrameLayout.LayoutParams(i, i, 17));
            }
            textureView$SurfaceTextureListenerC2142j0.f5232K = new MediaPlayer();
            textureView$SurfaceTextureListenerC2142j0.f5258w = false;
            try {
                if (!textureView$SurfaceTextureListenerC2142j0.f5224C.startsWith(V2rayConfig.HTTP)) {
                    textureView$SurfaceTextureListenerC2142j0.f5232K.setDataSource(new FileInputStream(textureView$SurfaceTextureListenerC2142j0.f5224C).getFD());
                } else {
                    textureView$SurfaceTextureListenerC2142j0.f5260y = true;
                    textureView$SurfaceTextureListenerC2142j0.f5232K.setDataSource(textureView$SurfaceTextureListenerC2142j0.f5224C);
                }
                textureView$SurfaceTextureListenerC2142j0.f5232K.setOnErrorListener(textureView$SurfaceTextureListenerC2142j0);
                textureView$SurfaceTextureListenerC2142j0.f5232K.setOnPreparedListener(textureView$SurfaceTextureListenerC2142j0);
                textureView$SurfaceTextureListenerC2142j0.f5232K.setOnCompletionListener(textureView$SurfaceTextureListenerC2142j0);
                textureView$SurfaceTextureListenerC2142j0.f5232K.prepareAsync();
            } catch (IOException e) {
                C2201m0.m9588d().m9689n().m9706d("Failed to create/prepare MediaPlayer: " + e.toString(), 0, 0, false);
                textureView$SurfaceTextureListenerC2142j0.m9614b();
            }
            ArrayList<InterfaceC2203m2> arrayList = c2135i12.f5210s;
            C2079d0 c2079d0 = new C2079d0(textureView$SurfaceTextureListenerC2142j0);
            C2201m0.m9589c("VideoView.play", c2079d0);
            arrayList.add(c2079d0);
            ArrayList<InterfaceC2203m2> arrayList2 = c2135i12.f5210s;
            C2087e0 c2087e0 = new C2087e0(textureView$SurfaceTextureListenerC2142j0);
            C2201m0.m9589c("VideoView.set_bounds", c2087e0);
            arrayList2.add(c2087e0);
            ArrayList<InterfaceC2203m2> arrayList3 = c2135i12.f5210s;
            C2106f0 c2106f0 = new C2106f0(textureView$SurfaceTextureListenerC2142j0);
            C2201m0.m9589c("VideoView.set_visible", c2106f0);
            arrayList3.add(c2106f0);
            ArrayList<InterfaceC2203m2> arrayList4 = c2135i12.f5210s;
            C2115g0 c2115g0 = new C2115g0(textureView$SurfaceTextureListenerC2142j0);
            C2201m0.m9589c("VideoView.pause", c2115g0);
            arrayList4.add(c2115g0);
            ArrayList<InterfaceC2203m2> arrayList5 = c2135i12.f5210s;
            C2125h0 c2125h0 = new C2125h0(textureView$SurfaceTextureListenerC2142j0);
            C2201m0.m9589c("VideoView.seek_to_time", c2125h0);
            arrayList5.add(c2125h0);
            ArrayList<InterfaceC2203m2> arrayList6 = c2135i12.f5210s;
            C2134i0 c2134i0 = new C2134i0(textureView$SurfaceTextureListenerC2142j0);
            C2201m0.m9589c("VideoView.set_volume", c2134i0);
            arrayList6.add(c2134i0);
            c2135i12.f5211t.add("VideoView.play");
            c2135i12.f5211t.add("VideoView.set_bounds");
            c2135i12.f5211t.add("VideoView.set_visible");
            c2135i12.f5211t.add("VideoView.pause");
            c2135i12.f5211t.add("VideoView.seek_to_time");
            c2135i12.f5211t.add("VideoView.set_volume");
            c2135i1.f5192a.put(Integer.valueOf(m9441r), textureView$SurfaceTextureListenerC2142j0);
            c2135i1.f5198g.put(Integer.valueOf(m9441r), textureView$SurfaceTextureListenerC2142j0);
            c2135i1.m9618a(textureView$SurfaceTextureListenerC2142j0, EnumC8717g.OTHER);
        }
    }
}
