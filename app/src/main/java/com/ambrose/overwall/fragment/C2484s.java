package com.ambrose.overwall.fragment;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.NonNull;
import com.google.android.ads.nativetemplates.C6427a;
import com.google.android.gms.ads.nativead.NativeAd;

/* renamed from: com.ambrose.overwall.fragment.s */
/* loaded from: classes.dex */
public final class C2484s implements NativeAd.OnNativeAdLoadedListener {

    /* renamed from: a */
    public final /* synthetic */ C2470n f5944a;

    public C2484s(C2470n c2470n) {
        this.f5944a = c2470n;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
    public final void onNativeAdLoaded(@NonNull NativeAd nativeAd) {
        C6427a c6427a = new C6427a();
        c6427a.f10055a = new ColorDrawable(Color.parseColor("#FFFFFF"));
        C2470n c2470n = this.f5944a;
        c2470n.f5928x = c6427a;
        c2470n.f5905G.f5758d.setVisibility(0);
        c2470n.f5905G.f5758d.setStyles(c2470n.f5928x);
        c2470n.f5905G.f5758d.setNativeAd(nativeAd);
    }
}
