package com.google.ads.mediation.facebook.rtb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.InterfaceC3877Ad;
import com.facebook.ads.MediaView;
import com.facebook.ads.MediaViewListener;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class FacebookRtbNativeAd extends UnifiedNativeAdMapper {
    private MediationNativeAdConfiguration adConfiguration;
    private MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> callback;
    private MediaView mMediaView;
    private NativeAdBase mNativeAdBase;
    private MediationNativeAdCallback mNativeAdCallback;

    /* loaded from: classes.dex */
    public class FacebookAdapterNativeAdImage extends NativeAd.Image {
        private Drawable mDrawable;
        private Uri mUri;

        public FacebookAdapterNativeAdImage() {
        }

        public FacebookAdapterNativeAdImage(Drawable drawable) {
            this.mDrawable = drawable;
        }

        public FacebookAdapterNativeAdImage(Uri uri) {
            this.mUri = uri;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Drawable getDrawable() {
            return this.mDrawable;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return 1.0d;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public Uri getUri() {
            return this.mUri;
        }

        public void setDrawable(Drawable drawable) {
            this.mDrawable = drawable;
        }
    }

    /* loaded from: classes.dex */
    public interface NativeAdMapperListener {
        void onMappingFailed(AdError adError);

        void onMappingSuccess();
    }

    /* loaded from: classes.dex */
    public class NativeListener implements AdListener, NativeAdListener {
        private WeakReference<Context> mContext;
        private NativeAdBase mNativeAd;

        public NativeListener(Context context, NativeAdBase nativeAdBase) {
            this.mNativeAd = nativeAdBase;
            this.mContext = new WeakReference<>(context);
        }

        @Override // com.facebook.ads.AdListener
        public void onAdClicked(InterfaceC3877Ad interfaceC3877Ad) {
            FacebookRtbNativeAd.this.mNativeAdCallback.reportAdClicked();
            FacebookRtbNativeAd.this.mNativeAdCallback.onAdOpened();
            FacebookRtbNativeAd.this.mNativeAdCallback.onAdLeftApplication();
        }

        @Override // com.facebook.ads.AdListener
        public void onAdLoaded(InterfaceC3877Ad interfaceC3877Ad) {
            if (interfaceC3877Ad != this.mNativeAd) {
                AdError adError = new AdError(106, "Ad Loaded is not a Native Ad.", "com.google.ads.mediation.facebook");
                Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
                FacebookRtbNativeAd.this.callback.onFailure(adError);
                return;
            }
            Context context = this.mContext.get();
            if (context != null) {
                FacebookRtbNativeAd.this.mapNativeAd(context, new NativeAdMapperListener() { // from class: com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.NativeListener.1
                    @Override // com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.NativeAdMapperListener
                    public void onMappingFailed(AdError adError2) {
                        Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
                        FacebookRtbNativeAd.this.callback.onFailure(adError2);
                    }

                    @Override // com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.NativeAdMapperListener
                    public void onMappingSuccess() {
                        FacebookRtbNativeAd facebookRtbNativeAd = FacebookRtbNativeAd.this;
                        facebookRtbNativeAd.mNativeAdCallback = (MediationNativeAdCallback) facebookRtbNativeAd.callback.onSuccess(FacebookRtbNativeAd.this);
                    }
                });
                return;
            }
            AdError adError2 = new AdError(107, "Context is null.", "com.google.ads.mediation.facebook");
            Log.e(FacebookMediationAdapter.TAG, adError2.getMessage());
            FacebookRtbNativeAd.this.callback.onFailure(adError2);
        }

        @Override // com.facebook.ads.AdListener
        public void onError(InterfaceC3877Ad interfaceC3877Ad, com.facebook.ads.AdError adError) {
            AdError adError2 = FacebookMediationAdapter.getAdError(adError);
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            FacebookRtbNativeAd.this.callback.onFailure(adError2);
        }

        @Override // com.facebook.ads.AdListener
        public void onLoggingImpression(InterfaceC3877Ad interfaceC3877Ad) {
        }

        @Override // com.facebook.ads.NativeAdListener
        public void onMediaDownloaded(InterfaceC3877Ad interfaceC3877Ad) {
            Log.d(FacebookMediationAdapter.TAG, "onMediaDownloaded");
        }
    }

    public FacebookRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.callback = mediationAdLoadCallback;
        this.adConfiguration = mediationNativeAdConfiguration;
    }

    private boolean containsRequiredFieldsForUnifiedNativeAd(NativeAdBase nativeAdBase) {
        boolean z = (nativeAdBase.getAdHeadline() == null || nativeAdBase.getAdBodyText() == null || nativeAdBase.getAdIcon() == null || nativeAdBase.getAdCallToAction() == null) ? false : true;
        return nativeAdBase instanceof NativeBannerAd ? z : (!z || nativeAdBase.getAdCoverImage() == null || this.mMediaView == null) ? false : true;
    }

    public void mapNativeAd(Context context, NativeAdMapperListener nativeAdMapperListener) {
        if (!containsRequiredFieldsForUnifiedNativeAd(this.mNativeAdBase)) {
            AdError adError = new AdError(108, "Ad from Facebook doesn't have all required assets.", "com.google.ads.mediation.facebook");
            Log.w(FacebookMediationAdapter.TAG, adError.getMessage());
            nativeAdMapperListener.onMappingFailed(adError);
            return;
        }
        setHeadline(this.mNativeAdBase.getAdHeadline());
        if (this.mNativeAdBase.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new FacebookAdapterNativeAdImage(Uri.parse(this.mNativeAdBase.getAdCoverImage().getUrl())));
            setImages(arrayList);
        }
        setBody(this.mNativeAdBase.getAdBodyText());
        if (this.mNativeAdBase.getPreloadedIconViewDrawable() == null) {
            setIcon(this.mNativeAdBase.getAdIcon() == null ? new FacebookAdapterNativeAdImage() : new FacebookAdapterNativeAdImage(Uri.parse(this.mNativeAdBase.getAdIcon().getUrl())));
        } else {
            setIcon(new FacebookAdapterNativeAdImage(this.mNativeAdBase.getPreloadedIconViewDrawable()));
        }
        setCallToAction(this.mNativeAdBase.getAdCallToAction());
        setAdvertiser(this.mNativeAdBase.getAdvertiserName());
        this.mMediaView.setListener(new MediaViewListener() { // from class: com.google.ads.mediation.facebook.rtb.FacebookRtbNativeAd.1
            @Override // com.facebook.ads.MediaViewListener
            public void onComplete(MediaView mediaView) {
                if (FacebookRtbNativeAd.this.mNativeAdCallback != null) {
                    FacebookRtbNativeAd.this.mNativeAdCallback.onVideoComplete();
                }
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onEnterFullscreen(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onExitFullscreen(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onFullscreenBackground(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onFullscreenForeground(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onPause(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onPlay(MediaView mediaView) {
            }

            @Override // com.facebook.ads.MediaViewListener
            public void onVolumeChange(MediaView mediaView, float f) {
            }
        });
        setHasVideoContent(true);
        setMediaView(this.mMediaView);
        setStarRating(null);
        Bundle bundle = new Bundle();
        bundle.putCharSequence(FacebookAdapter.KEY_ID, this.mNativeAdBase.getId());
        bundle.putCharSequence(FacebookAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.mNativeAdBase.getAdSocialContext());
        setExtras(bundle);
        setAdChoicesContent(new AdOptionsView(context, this.mNativeAdBase, null));
        nativeAdMapperListener.onMappingSuccess();
    }

    public void render() {
        String placementID = FacebookMediationAdapter.getPlacementID(this.adConfiguration.getServerParameters());
        if (TextUtils.isEmpty(placementID)) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            this.callback.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(this.adConfiguration);
        this.mMediaView = new MediaView(this.adConfiguration.getContext());
        try {
            this.mNativeAdBase = NativeAdBase.fromBidPayload(this.adConfiguration.getContext(), placementID, this.adConfiguration.getBidResponse());
            if (!TextUtils.isEmpty(this.adConfiguration.getWatermark())) {
                this.mNativeAdBase.setExtraHints(new ExtraHints.Builder().mediationData(this.adConfiguration.getWatermark()).build());
            }
            NativeAdBase nativeAdBase = this.mNativeAdBase;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new NativeListener(this.adConfiguration.getContext(), this.mNativeAdBase)).withBid(this.adConfiguration.getBidResponse()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e) {
            AdError adError2 = new AdError(109, "Failed to create native ad from bid payload: " + e.getMessage(), "com.google.ads.mediation.facebook");
            Log.w(FacebookMediationAdapter.TAG, adError2.getMessage());
            this.callback.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        setOverrideClickHandling(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = map.get("3003");
        NativeAdBase nativeAdBase = this.mNativeAdBase;
        if (nativeAdBase instanceof NativeBannerAd) {
            if (view2 == null) {
                Log.w(FacebookMediationAdapter.TAG, "Missing or invalid native ad icon asset. Facebook impression recording might be impacted for this ad.");
            } else if (view2 instanceof ImageView) {
                ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
            } else {
                Log.w(FacebookMediationAdapter.TAG, String.format("Native ad icon asset is rendered with an incompatible class type. Facebook impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", view2.getClass()));
            }
        } else if (!(nativeAdBase instanceof com.facebook.ads.NativeAd)) {
            Log.w(FacebookMediationAdapter.TAG, "Native ad type is not of type NativeAd or NativeBannerAd. It is not currently supported by the Facebook Adapter. Facebook impression recording might be impacted for this ad.");
        } else {
            com.facebook.ads.NativeAd nativeAd = (com.facebook.ads.NativeAd) nativeAdBase;
            if (view2 instanceof ImageView) {
                nativeAd.registerViewForInteraction(view, this.mMediaView, (ImageView) view2, arrayList);
                return;
            }
            Log.w(FacebookMediationAdapter.TAG, "Native icon asset is not of type ImageView. Calling registerViewForInteraction() without a reference to the icon view.");
            nativeAd.registerViewForInteraction(view, this.mMediaView, arrayList);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        NativeAdBase nativeAdBase = this.mNativeAdBase;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.untrackView(view);
    }
}
