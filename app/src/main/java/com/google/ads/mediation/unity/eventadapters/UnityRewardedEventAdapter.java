package com.google.ads.mediation.unity.eventadapters;

import com.google.ads.mediation.unity.UnityAdsAdapterUtils;
import com.google.ads.mediation.unity.UnityReward;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;

/* loaded from: classes.dex */
public class UnityRewardedEventAdapter implements IUnityEventAdapter {
    final MediationRewardedAdCallback listener;

    /* renamed from: com.google.ads.mediation.unity.eventadapters.UnityRewardedEventAdapter$1 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C64051 {

        /* renamed from: $SwitchMap$com$google$ads$mediation$unity$UnityAdsAdapterUtils$AdEvent */
        static final /* synthetic */ int[] f10033x92ee1947;

        static {
            int[] iArr = new int[UnityAdsAdapterUtils.AdEvent.values().length];
            f10033x92ee1947 = iArr;
            try {
                iArr[UnityAdsAdapterUtils.AdEvent.OPENED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10033x92ee1947[UnityAdsAdapterUtils.AdEvent.CLICKED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10033x92ee1947[UnityAdsAdapterUtils.AdEvent.CLOSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10033x92ee1947[UnityAdsAdapterUtils.AdEvent.IMPRESSION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10033x92ee1947[UnityAdsAdapterUtils.AdEvent.VIDEO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10033x92ee1947[UnityAdsAdapterUtils.AdEvent.REWARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10033x92ee1947[UnityAdsAdapterUtils.AdEvent.VIDEO_COMPLETE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public UnityRewardedEventAdapter(MediationRewardedAdCallback mediationRewardedAdCallback) {
        this.listener = mediationRewardedAdCallback;
    }

    @Override // com.google.ads.mediation.unity.eventadapters.IUnityEventAdapter
    public void sendAdEvent(UnityAdsAdapterUtils.AdEvent adEvent) {
        if (this.listener == null) {
            return;
        }
        switch (C64051.f10033x92ee1947[adEvent.ordinal()]) {
            case 1:
                this.listener.onAdOpened();
                return;
            case 2:
                this.listener.reportAdClicked();
                return;
            case 3:
                this.listener.onAdClosed();
                return;
            case 4:
                this.listener.reportAdImpression();
                return;
            case 5:
                this.listener.onVideoStart();
                return;
            case 6:
                this.listener.onUserEarnedReward(new UnityReward());
                return;
            case 7:
                this.listener.onVideoComplete();
                return;
            default:
                return;
        }
    }
}
