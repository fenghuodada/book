package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1464h;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.adview.AppLovinRewardedInterstitialAd;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener;
import com.applovin.impl.sdk.p029ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p029ad.InterfaceC3087g;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class AppLovinMediationAdapter extends MediationAdapterBase implements MaxAdViewAdapter, MaxInterstitialAdapter, MaxRewardedAdapter, MaxRewardedInterstitialAdapter, MaxSignalProvider {
    private AppLovinAdView mLoadedAdView;
    private AppLovinAd mLoadedInterstitialAd;
    private AppLovinAd mLoadedRewardedAd;
    private AppLovinAd mLoadedRewardedInterstitialAd;
    private AppLovinNativeAd mNativeAd;

    /* renamed from: com.applovin.mediation.adapters.AppLovinMediationAdapter$1 */
    /* loaded from: classes.dex */
    public class C33741 implements AppLovinAdLoadListener {
        final /* synthetic */ MaxAdFormat val$adFormat;
        final /* synthetic */ MaxAdViewAdapterListener val$listener;

        public C33741(MaxAdFormat maxAdFormat, MaxAdViewAdapterListener maxAdViewAdapterListener) {
            this.val$adFormat = maxAdFormat;
            this.val$listener = maxAdViewAdapterListener;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log(this.val$adFormat.getLabel() + " ad loaded");
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.1.1
                @Override // java.lang.Runnable
                public void run() {
                    AppLovinMediationAdapter.this.mLoadedAdView = new AppLovinAdView(AppLovinMediationAdapter.this.getWrappingSdk(), appLovinAd.getSize(), AppLovinMediationAdapter.this.getApplicationContext());
                    AppLovinMediationAdapter.this.mLoadedAdView.setAdDisplayListener(new AppLovinAdDisplayListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.1.1.1
                        @Override // com.applovin.sdk.AppLovinAdDisplayListener
                        public void adDisplayed(AppLovinAd appLovinAd2) {
                            if (C3349v.m6862a()) {
                                AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                                appLovinMediationAdapter2.log(C33741.this.val$adFormat.getLabel() + " ad shown");
                            }
                            C33741.this.val$listener.onAdViewAdDisplayed();
                        }

                        @Override // com.applovin.sdk.AppLovinAdDisplayListener
                        public void adHidden(AppLovinAd appLovinAd2) {
                            if (C3349v.m6862a()) {
                                AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                                appLovinMediationAdapter2.log(C33741.this.val$adFormat.getLabel() + " ad hidden");
                            }
                            C33741.this.val$listener.onAdViewAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd2));
                        }
                    });
                    AppLovinMediationAdapter.this.mLoadedAdView.setAdClickListener(new AppLovinAdClickListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.1.1.2
                        @Override // com.applovin.sdk.AppLovinAdClickListener
                        public void adClicked(AppLovinAd appLovinAd2) {
                            if (C3349v.m6862a()) {
                                AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                                appLovinMediationAdapter2.log(C33741.this.val$adFormat.getLabel() + " ad clicked");
                            }
                            C33741.this.val$listener.onAdViewAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd2));
                        }
                    });
                    AppLovinMediationAdapter.this.mLoadedAdView.setAdViewEventListener(new AppLovinAdViewEventListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.1.1.3
                        @Override // com.applovin.adview.AppLovinAdViewEventListener
                        public void adClosedFullscreen(AppLovinAd appLovinAd2, AppLovinAdView appLovinAdView) {
                            if (C3349v.m6862a()) {
                                AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                                appLovinMediationAdapter2.log(C33741.this.val$adFormat.getLabel() + " ad collapsed");
                            }
                            C33741.this.val$listener.onAdViewAdCollapsed();
                        }

                        @Override // com.applovin.adview.AppLovinAdViewEventListener
                        public void adFailedToDisplay(AppLovinAd appLovinAd2, AppLovinAdView appLovinAdView, AppLovinAdViewDisplayErrorCode appLovinAdViewDisplayErrorCode) {
                            C33741.this.val$listener.onAdViewAdDisplayFailed(MaxAdapterError.UNSPECIFIED);
                        }

                        @Override // com.applovin.adview.AppLovinAdViewEventListener
                        public void adLeftApplication(AppLovinAd appLovinAd2, AppLovinAdView appLovinAdView) {
                        }

                        @Override // com.applovin.adview.AppLovinAdViewEventListener
                        public void adOpenedFullscreen(AppLovinAd appLovinAd2, AppLovinAdView appLovinAdView) {
                            if (C3349v.m6862a()) {
                                AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                                appLovinMediationAdapter2.log(C33741.this.val$adFormat.getLabel() + " ad expanded");
                            }
                            C33741.this.val$listener.onAdViewAdExpanded();
                        }
                    });
                    C33741 c33741 = C33741.this;
                    c33741.val$listener.onAdViewAdLoaded(AppLovinMediationAdapter.this.mLoadedAdView);
                    AppLovinMediationAdapter.this.mLoadedAdView.renderAd(appLovinAd);
                }
            });
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log(this.val$adFormat.getLabel() + " ad failed to load with error code: " + i);
            }
            this.val$listener.onAdViewAdLoadFailed(AppLovinMediationAdapter.toMaxError(i));
        }
    }

    /* loaded from: classes.dex */
    public class InterstitialListenerWrapper implements InterfaceC3087g, AppLovinAdClickListener {
        final MaxInterstitialAdapterListener listener;

        public InterstitialListenerWrapper(MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
            this.listener = maxInterstitialAdapterListener;
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter.this.log("Interstitial ad clicked");
            }
            this.listener.onInterstitialAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter.this.log("Interstitial ad shown");
            }
            this.listener.onInterstitialAdDisplayed();
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter.this.log("Interstitial ad hidden");
            }
            this.listener.onInterstitialAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
        }

        @Override // com.applovin.impl.sdk.p029ad.InterfaceC3087g
        public void onAdDisplayFailed(String str) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log("Interstitial ad failed to display with error: " + str);
            }
            this.listener.onInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
        }
    }

    /* loaded from: classes.dex */
    public class MaxAppLovinNativeAd extends MaxNativeAd {
        public MaxAppLovinNativeAd(MaxNativeAd.Builder builder) {
            super(builder);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAd
        public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
            AppLovinNativeAdImpl appLovinNativeAdImpl = (AppLovinNativeAdImpl) AppLovinMediationAdapter.this.mNativeAd;
            if (appLovinNativeAdImpl == null) {
                if (C3349v.m6862a()) {
                    AppLovinMediationAdapter.this.m6823e("Failed to register native ad view for interaction. Native ad is null");
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            if (StringUtils.isValidString(getTitle()) && maxNativeAdView.getTitleTextView() != null) {
                arrayList.add(maxNativeAdView.getTitleTextView());
            }
            if (StringUtils.isValidString(getBody()) && maxNativeAdView.getBodyTextView() != null) {
                arrayList.add(maxNativeAdView.getBodyTextView());
            }
            if (StringUtils.isValidString(getCallToAction()) && maxNativeAdView.getCallToActionButton() != null) {
                arrayList.add(maxNativeAdView.getCallToActionButton());
            }
            if (getIcon() != null && maxNativeAdView.getIconImageView() != null) {
                arrayList.add(maxNativeAdView.getIconImageView());
            }
            appLovinNativeAdImpl.registerViewsForInteraction(arrayList, maxNativeAdView);
        }
    }

    /* loaded from: classes.dex */
    public abstract class RewardListenerWrapper implements AppLovinAdRewardListener {
        protected boolean hasGrantedReward;

        private RewardListenerWrapper() {
        }

        public /* synthetic */ RewardListenerWrapper(AppLovinMediationAdapter appLovinMediationAdapter, C33741 c33741) {
            this();
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log("User is over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log("Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter.this.log("Reward verified");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log("Reward validation request failed with code: " + i);
            }
        }
    }

    /* loaded from: classes.dex */
    public class RewardedAdListenerWrapper extends RewardListenerWrapper implements InterfaceC3087g, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
        private final MaxRewardedAdapterListener listener;

        private RewardedAdListenerWrapper(MaxRewardedAdapterListener maxRewardedAdapterListener) {
            super(AppLovinMediationAdapter.this, null);
            this.listener = maxRewardedAdapterListener;
        }

        public /* synthetic */ RewardedAdListenerWrapper(AppLovinMediationAdapter appLovinMediationAdapter, MaxRewardedAdapterListener maxRewardedAdapterListener, C33741 c33741) {
            this(maxRewardedAdapterListener);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter.this.log("Rewarded ad clicked");
            }
            this.listener.onRewardedAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter.this.log("Rewarded ad shown");
            }
            this.listener.onRewardedAdDisplayed();
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            if (this.hasGrantedReward || AppLovinMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = AppLovinMediationAdapter.this.getReward();
                if (C3349v.m6862a()) {
                    AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                    appLovinMediationAdapter.log("Rewarded user with reward: " + reward);
                }
                this.listener.onUserRewarded(reward);
            }
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter.this.log("Rewarded ad hidden");
            }
            this.listener.onRewardedAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
        }

        @Override // com.applovin.impl.sdk.p029ad.InterfaceC3087g
        public void onAdDisplayFailed(String str) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log("Rewarded ad failed to display with error: " + str);
            }
            this.listener.onRewardedAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter.this.log("Rewarded ad video started");
            }
            this.listener.onRewardedAdVideoStarted();
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log("Rewarded ad video ended at " + d + "% and is fully watched: " + z);
            }
            this.hasGrantedReward = z;
            this.listener.onRewardedAdVideoCompleted();
        }
    }

    /* loaded from: classes.dex */
    public class RewardedInterstitialAdListenerWrapper extends RewardListenerWrapper implements InterfaceC3087g, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
        private final MaxRewardedInterstitialAdapterListener listener;

        private RewardedInterstitialAdListenerWrapper(MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
            super(AppLovinMediationAdapter.this, null);
            this.listener = maxRewardedInterstitialAdapterListener;
        }

        public /* synthetic */ RewardedInterstitialAdListenerWrapper(AppLovinMediationAdapter appLovinMediationAdapter, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener, C33741 c33741) {
            this(maxRewardedInterstitialAdapterListener);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter.this.log("Rewarded interstitial ad clicked");
            }
            this.listener.onRewardedInterstitialAdClicked(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter.this.log("Rewarded interstitial ad shown");
            }
            this.listener.onRewardedInterstitialAdDisplayed();
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            if (this.hasGrantedReward || AppLovinMediationAdapter.this.shouldAlwaysRewardUser()) {
                MaxReward reward = AppLovinMediationAdapter.this.getReward();
                if (C3349v.m6862a()) {
                    AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                    appLovinMediationAdapter.log("Rewarded interstitial rewarded user with reward: " + reward);
                }
                this.listener.onUserRewarded(reward);
            }
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter.this.log("Rewarded interstitial ad hidden");
            }
            this.listener.onRewardedInterstitialAdHidden(AppLovinMediationAdapter.getExtraInfo(appLovinAd));
        }

        @Override // com.applovin.impl.sdk.p029ad.InterfaceC3087g
        public void onAdDisplayFailed(String str) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log("Rewarded interstitial ad failed to display with error: " + str);
            }
            this.listener.onRewardedInterstitialAdDisplayFailed(new MaxAdapterError((int) MaxAdapterError.ERROR_CODE_UNSPECIFIED, str));
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter.this.log("Rewarded interstitial ad video started");
            }
            this.listener.onRewardedInterstitialAdVideoStarted();
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            if (C3349v.m6862a()) {
                AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                appLovinMediationAdapter.log("Rewarded interstitial ad video ended at " + d + "% and is fully watched: " + z);
            }
            this.hasGrantedReward = z;
            this.listener.onRewardedInterstitialAdVideoCompleted();
        }
    }

    public AppLovinMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bundle getExtraInfo(AppLovinAd appLovinAd) {
        Bundle bundle = new Bundle(1);
        bundle.putBundle(Utils.KEY_AD_VALUES, ((AppLovinAdImpl) appLovinAd).getMAXAdValues());
        return bundle;
    }

    private void loadFullscreenAd(String str, MaxAdapterResponseParameters maxAdapterResponseParameters, final MaxAdFormat maxAdFormat, final MaxAdapterListener maxAdapterListener) {
        StringBuilder sb;
        AppLovinAdLoadListener appLovinAdLoadListener = new AppLovinAdLoadListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.2
            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void adReceived(AppLovinAd appLovinAd) {
                if (C3349v.m6862a()) {
                    AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                    appLovinMediationAdapter.log(maxAdFormat.getLabel() + " ad loaded");
                }
                MaxAdFormat maxAdFormat2 = maxAdFormat;
                if (maxAdFormat2 == MaxAdFormat.INTERSTITIAL) {
                    AppLovinMediationAdapter.this.mLoadedInterstitialAd = appLovinAd;
                    ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdLoaded();
                } else if (maxAdFormat2 == MaxAdFormat.REWARDED) {
                    AppLovinMediationAdapter.this.mLoadedRewardedAd = appLovinAd;
                    ((MaxRewardedAdapterListener) maxAdapterListener).onRewardedAdLoaded();
                } else if (maxAdFormat2 != MaxAdFormat.REWARDED_INTERSTITIAL) {
                    throw new IllegalStateException("Non-fullscreen ad loaded for fullscreen ad adapter");
                } else {
                    AppLovinMediationAdapter.this.mLoadedRewardedInterstitialAd = appLovinAd;
                    ((MaxRewardedInterstitialAdapterListener) maxAdapterListener).onRewardedInterstitialAdLoaded();
                }
            }

            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void failedToReceiveAd(int i) {
                if (C3349v.m6862a()) {
                    AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                    appLovinMediationAdapter.log(maxAdFormat.getLabel() + " ad failed to load with error code: " + i);
                }
                MaxAdFormat maxAdFormat2 = maxAdFormat;
                if (maxAdFormat2 == MaxAdFormat.INTERSTITIAL) {
                    ((MaxInterstitialAdapterListener) maxAdapterListener).onInterstitialAdLoadFailed(AppLovinMediationAdapter.toMaxError(i));
                } else if (maxAdFormat2 == MaxAdFormat.REWARDED) {
                    ((MaxRewardedAdapterListener) maxAdapterListener).onRewardedAdLoadFailed(AppLovinMediationAdapter.toMaxError(i));
                } else if (maxAdFormat2 != MaxAdFormat.REWARDED_INTERSTITIAL) {
                    throw new IllegalStateException("Non-fullscreen ad failed to load for fullscreen ad adapter");
                } else {
                    ((MaxRewardedInterstitialAdapterListener) maxAdapterListener).onRewardedInterstitialAdLoadFailed(AppLovinMediationAdapter.toMaxError(i));
                }
            }
        };
        if (StringUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            if (C3349v.m6862a()) {
                log("Loading bidding " + maxAdFormat.getLabel() + " ad...");
            }
            getWrappingSdk().getAdService().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), appLovinAdLoadListener);
        } else if (!StringUtils.isValidString(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            if (C3349v.m6862a()) {
                sb = new StringBuilder("Loading mediated ");
                sb.append(maxAdFormat.getLabel());
                sb.append(" ad...");
                log(sb.toString());
            }
            getWrappingSdk().getAdService().loadNextAdForZoneId(str, appLovinAdLoadListener);
        } else {
            str = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            if (C3349v.m6862a()) {
                sb = new StringBuilder("Loading mediated ");
                sb.append(maxAdFormat.getLabel());
                sb.append(" ad: ");
                sb.append(str);
                sb.append("...");
                log(sb.toString());
            }
            getWrappingSdk().getAdService().loadNextAdForZoneId(str, appLovinAdLoadListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MaxAdapterError toMaxError(int i) {
        MaxAdapterError maxAdapterError = i == -1009 ? MaxAdapterError.NO_CONNECTION : i == 204 ? MaxAdapterError.NO_FILL : i == -1 ? MaxAdapterError.INTERNAL_ERROR : i >= 500 ? MaxAdapterError.SERVER_ERROR : MaxAdapterError.UNSPECIFIED;
        return new MaxAdapterError(maxAdapterError.getCode(), maxAdapterError.getErrorMessage(), i, "");
    }

    @Override // com.applovin.mediation.adapter.MaxSignalProvider
    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        if (C3349v.m6862a()) {
            log("Collecting signal...");
        }
        maxSignalCollectionListener.onSignalCollected(getWrappingSdk().getAdService().getBidToken());
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getAdapterVersion() {
        return getSdkVersion();
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public String getSdkVersion() {
        return AppLovinSdk.VERSION;
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, null);
    }

    @Override // com.applovin.mediation.adapter.MaxAdViewAdapter
    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        C33741 c33741 = new C33741(maxAdFormat, maxAdViewAdapterListener);
        if (StringUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            if (C3349v.m6862a()) {
                log("Loading bidding " + maxAdFormat.getLabel() + " ad...");
            }
            getWrappingSdk().getAdService().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), c33741);
        } else if (StringUtils.isValidString(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            if (C3349v.m6862a()) {
                log("Loading mediated " + maxAdFormat.getLabel() + " ad: " + thirdPartyAdPlacementId + "...");
            }
            getWrappingSdk().getAdService().loadNextAdForZoneId(thirdPartyAdPlacementId, c33741);
        } else {
            AppLovinAdSize appLovinAdSize = maxAdFormat == MaxAdFormat.BANNER ? AppLovinAdSize.BANNER : maxAdFormat == MaxAdFormat.MREC ? AppLovinAdSize.MREC : maxAdFormat == MaxAdFormat.LEADER ? AppLovinAdSize.LEADER : null;
            if (appLovinAdSize == null) {
                if (C3349v.m6862a()) {
                    log("Failed to load ad for format: " + maxAdFormat);
                }
                maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.INTERNAL_ERROR);
                return;
            }
            if (C3349v.m6862a()) {
                log("Loading mediated " + maxAdFormat.getLabel() + " ad...");
            }
            getWrappingSdk().getAdService().loadNextAd(appLovinAdSize, c33741);
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        loadFullscreenAd("inter_regular", maxAdapterResponseParameters, MaxAdFormat.INTERSTITIAL, maxInterstitialAdapterListener);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxNativeAdAdapter
    public void loadNativeAd(final MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, final MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        if (TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        if (C3349v.m6862a()) {
            m6824d("Loading bidding native ad...");
        }
        getWrappingSdk().coreSdk.m7390v().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), new AppLovinNativeAdLoadListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.3
            @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener
            public void onNativeAdLoadFailed(int i) {
                if (C3349v.m6862a()) {
                    AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                    appLovinMediationAdapter.m6824d("Native ad failed to load with error code: " + i);
                }
                maxNativeAdAdapterListener.onNativeAdLoadFailed(AppLovinMediationAdapter.toMaxError(i));
            }

            @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdLoadListener
            public void onNativeAdLoaded(AppLovinNativeAd appLovinNativeAd) {
                if (C3349v.m6862a()) {
                    AppLovinMediationAdapter appLovinMediationAdapter = AppLovinMediationAdapter.this;
                    appLovinMediationAdapter.m6824d("Native ad loaded: " + appLovinNativeAd);
                }
                if (!StringUtils.isValidString(BundleUtils.getString("template", "", maxAdapterResponseParameters.getServerParameters())) || !TextUtils.isEmpty(appLovinNativeAd.getTitle())) {
                    ((AppLovinNativeAdImpl) appLovinNativeAd).setEventListener(new AppLovinNativeAdEventListener() { // from class: com.applovin.mediation.adapters.AppLovinMediationAdapter.3.1
                        @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAdEventListener
                        public void onNativeAdClicked(AppLovinNativeAd appLovinNativeAd2) {
                            if (C3349v.m6862a()) {
                                AppLovinMediationAdapter.this.m6824d("Native ad clicked");
                            }
                            maxNativeAdAdapterListener.onNativeAdClicked();
                        }
                    });
                    AppLovinMediationAdapter.this.mNativeAd = appLovinNativeAd;
                    maxNativeAdAdapterListener.onNativeAdLoaded(new MaxAppLovinNativeAd(new MaxNativeAd.Builder().setAdFormat(MaxAdFormat.NATIVE).setTitle(appLovinNativeAd.getTitle()).setBody(appLovinNativeAd.getBody()).setAdvertiser(appLovinNativeAd.getAdvertiser()).setCallToAction(appLovinNativeAd.getCallToAction()).setIcon(new MaxNativeAd.MaxNativeAdImage(appLovinNativeAd.getIconUri())).setMainImage(new MaxNativeAd.MaxNativeAdImage(((AppLovinNativeAdImpl) appLovinNativeAd).getMainImageUri())).setMediaView(appLovinNativeAd.getMediaView()).setMediaContentAspectRatio(appLovinNativeAd.getMediaView().getAspectRatio()).setOptionsView(appLovinNativeAd.getOptionsView())), null);
                    return;
                }
                if (C3349v.m6862a()) {
                    AppLovinMediationAdapter appLovinMediationAdapter2 = AppLovinMediationAdapter.this;
                    appLovinMediationAdapter2.m6823e("Native ad does not have required assets: " + appLovinNativeAd);
                }
                maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.MISSING_REQUIRED_NATIVE_AD_ASSETS);
            }
        });
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        loadFullscreenAd("inter_videoa", maxAdapterResponseParameters, MaxAdFormat.REWARDED, maxRewardedAdapterListener);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter
    public void loadRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        loadFullscreenAd("inter_autorew", maxAdapterResponseParameters, MaxAdFormat.REWARDED_INTERSTITIAL, maxRewardedInterstitialAdapterListener);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public void onDestroy() {
        this.mLoadedInterstitialAd = null;
        this.mLoadedRewardedAd = null;
        this.mLoadedRewardedInterstitialAd = null;
        AppLovinAdView appLovinAdView = this.mLoadedAdView;
        if (appLovinAdView != null) {
            appLovinAdView.destroy();
            this.mLoadedAdView = null;
        }
        AppLovinNativeAd appLovinNativeAd = this.mNativeAd;
        if (appLovinNativeAd instanceof AppLovinNativeAdImpl) {
            ((AppLovinNativeAdImpl) appLovinNativeAd).destroy();
            this.mNativeAd = null;
        }
    }

    @Override // com.applovin.mediation.adapter.MaxInterstitialAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        if (C3349v.m6862a()) {
            log("Showing interstitial: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        InterstitialListenerWrapper interstitialListenerWrapper = new InterstitialListenerWrapper(maxInterstitialAdapterListener);
        create.setAdDisplayListener(interstitialListenerWrapper);
        create.setAdClickListener(interstitialListenerWrapper);
        create.showAndRender(this.mLoadedInterstitialAd);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter
    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, AbstractC1464h abstractC1464h, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        if (C3349v.m6862a()) {
            log("Showing interstitial ad view: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        InterstitialListenerWrapper interstitialListenerWrapper = new InterstitialListenerWrapper(maxInterstitialAdapterListener);
        create.setAdDisplayListener(interstitialListenerWrapper);
        create.setAdClickListener(interstitialListenerWrapper);
        create.showAndRender(this.mLoadedInterstitialAd, viewGroup, abstractC1464h);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        if (C3349v.m6862a()) {
            log("Showing rewarded ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        }
        configureReward(maxAdapterResponseParameters);
        AppLovinIncentivizedInterstitial create = AppLovinIncentivizedInterstitial.create(getWrappingSdk());
        RewardedAdListenerWrapper rewardedAdListenerWrapper = new RewardedAdListenerWrapper(this, maxRewardedAdapterListener, null);
        create.show(this.mLoadedRewardedAd, activity, rewardedAdListenerWrapper, rewardedAdListenerWrapper, rewardedAdListenerWrapper, rewardedAdListenerWrapper);
    }

    @Override // com.applovin.mediation.adapters.MediationAdapterBase, com.applovin.mediation.adapter.MaxRewardedAdViewAdapter
    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, AbstractC1464h abstractC1464h, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        if (C3349v.m6862a()) {
            log("Showing rewarded ad view: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        }
        configureReward(maxAdapterResponseParameters);
        AppLovinIncentivizedInterstitial create = AppLovinIncentivizedInterstitial.create(getWrappingSdk());
        RewardedAdListenerWrapper rewardedAdListenerWrapper = new RewardedAdListenerWrapper(this, maxRewardedAdapterListener, null);
        create.show(this.mLoadedRewardedAd, viewGroup, abstractC1464h, activity, rewardedAdListenerWrapper, rewardedAdListenerWrapper, rewardedAdListenerWrapper, rewardedAdListenerWrapper);
    }

    @Override // com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter
    public void showRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        if (C3349v.m6862a()) {
            log("Showing rewarded interstitial ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + "...");
        }
        RewardedInterstitialAdListenerWrapper rewardedInterstitialAdListenerWrapper = new RewardedInterstitialAdListenerWrapper(this, maxRewardedInterstitialAdapterListener, null);
        if (this.mLoadedRewardedInterstitialAd.getType() == AppLovinAdType.AUTO_INCENTIVIZED) {
            configureReward(maxAdapterResponseParameters);
            AppLovinRewardedInterstitialAd appLovinRewardedInterstitialAd = new AppLovinRewardedInterstitialAd(getWrappingSdk());
            appLovinRewardedInterstitialAd.setAdDisplayListener(rewardedInterstitialAdListenerWrapper);
            appLovinRewardedInterstitialAd.setAdClickListener(rewardedInterstitialAdListenerWrapper);
            appLovinRewardedInterstitialAd.setAdVideoPlaybackListener(rewardedInterstitialAdListenerWrapper);
            appLovinRewardedInterstitialAd.show(this.mLoadedRewardedInterstitialAd, activity, rewardedInterstitialAdListenerWrapper);
            return;
        }
        if (C3349v.m6862a()) {
            log("Rewarded interstitial is regular interstitial");
        }
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        create.setAdDisplayListener(rewardedInterstitialAdListenerWrapper);
        create.setAdClickListener(rewardedInterstitialAdListenerWrapper);
        create.setAdVideoPlaybackListener(rewardedInterstitialAdListenerWrapper);
        create.showAndRender(this.mLoadedRewardedInterstitialAd);
    }
}
