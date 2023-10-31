package com.unity3d.services.ads.operation.show;

import android.app.Activity;
import com.unity3d.ads.IUnityAdsShowListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.services.ads.operation.C9351e;
import com.unity3d.services.core.configuration.Configuration;

/* renamed from: com.unity3d.services.ads.operation.show.g */
/* loaded from: classes3.dex */
public class C9382g extends C9351e {

    /* renamed from: h */
    public Activity f18311h;

    /* renamed from: i */
    public IUnityAdsShowListener f18312i;

    /* renamed from: j */
    public UnityAdsShowOptions f18313j;

    public C9382g(String str, IUnityAdsShowListener iUnityAdsShowListener, Activity activity, UnityAdsShowOptions unityAdsShowOptions, Configuration configuration) {
        super(str, configuration);
        this.f18312i = iUnityAdsShowListener;
        this.f18311h = activity;
        this.f18313j = unityAdsShowOptions;
    }

    /* renamed from: a */
    public void m2401a(UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        IUnityAdsShowListener iUnityAdsShowListener = this.f18312i;
        if (iUnityAdsShowListener != null) {
            iUnityAdsShowListener.onUnityAdsShowComplete(this.f18255c, unityAdsShowCompletionState);
        }
    }

    /* renamed from: a */
    public void m2400a(UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        IUnityAdsShowListener iUnityAdsShowListener = this.f18312i;
        if (iUnityAdsShowListener != null) {
            iUnityAdsShowListener.onUnityAdsShowFailure(this.f18255c, unityAdsShowError, str);
        }
    }

    /* renamed from: a */
    public void m2399a(String str) {
        IUnityAdsShowListener iUnityAdsShowListener = this.f18312i;
        if (iUnityAdsShowListener != null) {
            iUnityAdsShowListener.onUnityAdsShowStart(str);
        }
    }

    /* renamed from: f */
    public void m2398f() {
        IUnityAdsShowListener iUnityAdsShowListener = this.f18312i;
        if (iUnityAdsShowListener != null) {
            iUnityAdsShowListener.onUnityAdsShowClick(this.f18255c);
        }
    }
}
