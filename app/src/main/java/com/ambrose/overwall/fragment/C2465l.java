package com.ambrose.overwall.fragment;

import android.util.Log;
import com.ambrose.overwall.p005mv.main.C2507n;
import com.android.tool.util.util.C2603g;
import com.kongzue.dialogx.dialogs.C8897o;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;

/* renamed from: com.ambrose.overwall.fragment.l */
/* loaded from: classes.dex */
public final class C2465l implements IUnityAdsLoadListener {

    /* renamed from: a */
    public final /* synthetic */ C2470n f5893a;

    /* renamed from: com.ambrose.overwall.fragment.l$a */
    /* loaded from: classes.dex */
    public class C2466a implements IUnityAdsShowListener {
        public C2466a() {
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public final void onUnityAdsShowClick(String str) {
            Log.e("ConnectFragment", "onUnityAdsShowClick: ");
            C2465l c2465l = C2465l.this;
            c2465l.f5893a.f5906H.getClass();
            C2603g.m9336d(C2507n.m9406b(), "ok");
            c2465l.f5893a.f5914P = Boolean.FALSE;
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public final void onUnityAdsShowComplete(String str, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
            Log.e("ConnectFragment", "onUnityAdsShowComplete: ");
            C2465l c2465l = C2465l.this;
            c2465l.f5893a.f5906H.getClass();
            C2603g.m9336d(C2507n.m9406b(), "ok");
            c2465l.f5893a.f5914P = Boolean.FALSE;
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public final void onUnityAdsShowFailure(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2) {
            Log.e("ConnectFragment", "onUnityAdsShowFailure: ");
            C2465l.this.f5893a.f5914P = Boolean.FALSE;
        }

        @Override // com.unity3d.ads.IUnityAdsShowListener
        public final void onUnityAdsShowStart(String str) {
            Log.e("ConnectFragment", "onUnityAdsShowStart: ");
        }
    }

    public C2465l(C2470n c2470n) {
        this.f5893a = c2470n;
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsAdLoaded(String str) {
        C8897o.m2905E();
        UnityAds.show(this.f5893a.m2811m(), "Rewarded_Android", new UnityAdsShowOptions(), new C2466a());
    }

    @Override // com.unity3d.ads.IUnityAdsLoadListener
    public final void onUnityAdsFailedToLoad(String str, UnityAds.UnityAdsLoadError unityAdsLoadError, String str2) {
        Log.e("ConnectFragment", "onUnityAdsFailedToLoad: RewardedAd");
        C8897o.m2905E();
        this.f5893a.f5914P = Boolean.FALSE;
    }
}
