package com.unity3d.services.ads.adunit;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.api.VideoPlayer;
import com.unity3d.services.ads.video.C9402c;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9565k;

/* renamed from: com.unity3d.services.ads.adunit.h */
/* loaded from: classes3.dex */
public class C9301h implements InterfaceC9299f {

    /* renamed from: a */
    private RelativeLayout f18169a;

    /* renamed from: b */
    private C9402c f18170b;

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
        C9549a.m2029a();
        C9402c c9402c = this.f18170b;
        if (c9402c != null) {
            c9402c.m2358e();
            this.f18170b.stopPlayback();
            C9565k.m1982a(this.f18170b);
            if (this.f18170b.equals(VideoPlayer.getVideoPlayerView())) {
                VideoPlayer.setVideoPlayerView(null);
            }
            this.f18170b = null;
        }
        RelativeLayout relativeLayout = this.f18169a;
        if (relativeLayout != null) {
            C9565k.m1982a(relativeLayout);
            this.f18169a = null;
            return true;
        }
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.InterfaceC9299f
    /* renamed from: b */
    public View mo2478b() {
        return this.f18169a;
    }

    @Override // com.unity3d.services.ads.adunit.InterfaceC9299f
    /* renamed from: b */
    public void mo2477b(AdUnitActivity adUnitActivity) {
        mo2481a();
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
        C9549a.m2029a();
        if (this.f18169a == null) {
            this.f18169a = new RelativeLayout(adUnitActivity);
        }
        if (this.f18170b == null) {
            this.f18170b = new C9402c(adUnitActivity);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            this.f18170b.setLayoutParams(layoutParams);
            this.f18169a.addView(this.f18170b);
            VideoPlayer.setVideoPlayerView(this.f18170b);
            return true;
        }
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.InterfaceC9299f
    /* renamed from: f */
    public void mo2473f(AdUnitActivity adUnitActivity) {
    }
}
