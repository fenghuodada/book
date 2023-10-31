package com.google.ads.mediation.unity.eventadapters;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* loaded from: classes.dex */
public class UnityBannerEventAdapter implements IUnityEventAdapter {
    final MediationBannerAdapter adapter;
    final MediationBannerListener listener;

    /* renamed from: com.google.ads.mediation.unity.eventadapters.UnityBannerEventAdapter$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C64031 {

        /* renamed from: $SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent */
        static final /* synthetic */ int[] f10031x92ee1947;

        static {
            int[] iArr = new int[UnityAdsAdapterUtils.AdEvent.values().length];
            f10031x92ee1947 = iArr;
            try {
                iArr[UnityAdsAdapterUtils.AdEvent.LOADED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10031x92ee1947[UnityAdsAdapterUtils.AdEvent.OPENED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10031x92ee1947[UnityAdsAdapterUtils.AdEvent.CLICKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10031x92ee1947[UnityAdsAdapterUtils.AdEvent.CLOSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10031x92ee1947[UnityAdsAdapterUtils.AdEvent.LEFT_APPLICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public UnityBannerEventAdapter(MediationBannerListener mediationBannerListener, MediationBannerAdapter mediationBannerAdapter) {
        this.listener = mediationBannerListener;
        this.adapter = mediationBannerAdapter;
    }

    @Override // com.google.ads.mediation.unity.eventadapters.IUnityEventAdapter
    public void sendAdEvent(UnityAdsAdapterUtils.AdEvent adEvent) {
        if (this.listener == null) {
            return;
        }
        int i = C64031.f10031x92ee1947[adEvent.ordinal()];
        if (i == 1) {
            this.listener.onAdLoaded(this.adapter);
        } else if (i == 2) {
            this.listener.onAdOpened(this.adapter);
        } else if (i == 3) {
            this.listener.onAdClicked(this.adapter);
        } else if (i == 4) {
            this.listener.onAdClosed(this.adapter);
        } else if (i != 5) {
        } else {
            this.listener.onAdLeftApplication(this.adapter);
        }
    }
}
