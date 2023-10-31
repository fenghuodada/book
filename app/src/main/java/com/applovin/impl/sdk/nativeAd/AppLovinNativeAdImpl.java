package com.applovin.impl.sdk.nativeAd;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.C2762d;
import com.applovin.impl.p008a.C2649a;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3265i;
import com.applovin.impl.sdk.p028a.C3050e;
import com.applovin.impl.sdk.p032d.C3119a;
import com.applovin.impl.sdk.utils.C3294g;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.common.internal.ImagesContract;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AppLovinNativeAdImpl extends AppLovinAdBase implements AppLovinNativeAd {
    private static final String AD_RESPONSE_TYPE_APPLOVIN = "applovin";
    private static final String AD_RESPONSE_TYPE_ORTB = "ortb";
    private static final String AD_RESPONSE_TYPE_UNDEFINED = "undefined";
    private final C3050e adEventTracker;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final Uri clickDestinationBackupUri;
    private final Uri clickDestinationUri;
    private final View$OnClickListenerC3229a clickHandler;
    private final List<String> clickTrackingUrls;
    private AppLovinNativeAdEventListener eventListener;
    private Uri iconUri;
    private final List<C3265i> impressionRequests;
    private final AtomicBoolean impressionTracked;
    private final String jsTracker;
    private Uri mainImageUri;
    private AppLovinMediaView mediaView;
    private ViewGroup nativeAdView;
    private final View$OnAttachStateChangeListenerC3230b onAttachStateChangeHandler;
    private AppLovinOptionsView optionsView;
    private final Uri privacyDestinationUri;
    private Uri privacyIconUri;
    private final List<View> registeredViews;
    private final String tag;
    private final String title;
    private final C2649a vastAd;
    private final List<C3265i> viewableMRC100Requests;
    private final List<C3265i> viewableMRC50Requests;
    private final List<C3265i> viewableVideo50Requests;

    /* loaded from: classes.dex */
    public static class Builder {
        private final JSONObject adObject;
        private String advertiser;
        private String body;
        private String callToAction;
        private Uri clickDestinationBackupUri;
        private Uri clickDestinationUri;
        private List<String> clickTrackingUrls;
        private final JSONObject fullResponse;
        private Uri iconUri;
        private List<C3265i> impressionRequests;
        private String jsTracker;
        private Uri mainImageUri;
        private Uri privacyDestinationUri;
        private Uri privacyIconUri;
        private final C3214m sdk;
        private String title;
        private C2649a vastAd;
        private List<C3265i> viewableMRC100Requests;
        private List<C3265i> viewableMRC50Requests;
        private List<C3265i> viewableVideo50Requests;

        public Builder(JSONObject jSONObject, JSONObject jSONObject2, C3214m c3214m) {
            this.adObject = jSONObject;
            this.fullResponse = jSONObject2;
            this.sdk = c3214m;
        }

        public AppLovinNativeAdImpl build() {
            return new AppLovinNativeAdImpl(this);
        }

        public Builder setAdvertiser(String str) {
            this.advertiser = str;
            return this;
        }

        public Builder setBody(String str) {
            this.body = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.callToAction = str;
            return this;
        }

        public Builder setClickDestinationBackupUri(Uri uri) {
            this.clickDestinationBackupUri = uri;
            return this;
        }

        public Builder setClickDestinationUri(Uri uri) {
            this.clickDestinationUri = uri;
            return this;
        }

        public Builder setClickTrackingUrls(List<String> list) {
            this.clickTrackingUrls = list;
            return this;
        }

        public Builder setIconUri(Uri uri) {
            this.iconUri = uri;
            return this;
        }

        public Builder setImpressionRequests(List<C3265i> list) {
            this.impressionRequests = list;
            return this;
        }

        public Builder setJsTracker(String str) {
            this.jsTracker = str;
            return this;
        }

        public Builder setMainImageUri(Uri uri) {
            this.mainImageUri = uri;
            return this;
        }

        public Builder setPrivacyDestinationUri(Uri uri) {
            this.privacyDestinationUri = uri;
            return this;
        }

        public Builder setPrivacyIconUri(Uri uri) {
            this.privacyIconUri = uri;
            return this;
        }

        public Builder setTitle(String str) {
            this.title = str;
            return this;
        }

        public Builder setVastAd(C2649a c2649a) {
            this.vastAd = c2649a;
            return this;
        }

        public Builder setViewableMRC100Requests(List<C3265i> list) {
            this.viewableMRC100Requests = list;
            return this;
        }

        public Builder setViewableMRC50Requests(List<C3265i> list) {
            this.viewableMRC50Requests = list;
            return this;
        }

        public Builder setViewableVideo50Requests(List<C3265i> list) {
            this.viewableVideo50Requests = list;
            return this;
        }
    }

    /* renamed from: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$a */
    /* loaded from: classes.dex */
    public static class View$OnClickListenerC3229a implements View.OnClickListener {

        /* renamed from: a */
        private final AppLovinNativeAdImpl f8463a;

        public View$OnClickListenerC3229a(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f8463a = appLovinNativeAdImpl;
        }

        /* renamed from: a */
        public AppLovinNativeAdImpl m7371a() {
            return this.f8463a;
        }

        /* renamed from: a */
        public boolean m7370a(Object obj) {
            return obj instanceof View$OnClickListenerC3229a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof View$OnClickListenerC3229a) {
                View$OnClickListenerC3229a view$OnClickListenerC3229a = (View$OnClickListenerC3229a) obj;
                if (view$OnClickListenerC3229a.m7370a(this)) {
                    AppLovinNativeAdImpl m7371a = m7371a();
                    AppLovinNativeAdImpl m7371a2 = view$OnClickListenerC3229a.m7371a();
                    return m7371a != null ? m7371a.equals(m7371a2) : m7371a2 == null;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            AppLovinNativeAdImpl m7371a = m7371a();
            return 59 + (m7371a == null ? 43 : m7371a.hashCode());
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((AppLovinAdBase) this.f8463a).sdk.m7391u().maybeSubmitPersistentPostbacks(this.f8463a.getDirectClickTrackingPostbacks());
            for (String str : this.f8463a.clickTrackingUrls) {
                ((AppLovinAdBase) this.f8463a).sdk.m7464X().dispatchPostbackAsync(str, null);
            }
            if (Utils.openUri(view.getContext(), this.f8463a.clickDestinationUri, ((AppLovinAdBase) this.f8463a).sdk) || Utils.openUri(view.getContext(), this.f8463a.clickDestinationBackupUri, ((AppLovinAdBase) this.f8463a).sdk)) {
                C3298j.m6986a(this.f8463a.eventListener, this.f8463a);
            }
        }

        public String toString() {
            return "AppLovinNativeAdImpl.ClickHandler(ad=" + m7371a() + ")";
        }
    }

    /* renamed from: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl$b */
    /* loaded from: classes.dex */
    public static class View$OnAttachStateChangeListenerC3230b implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        private final AppLovinNativeAdImpl f8464a;

        public View$OnAttachStateChangeListenerC3230b(AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f8464a = appLovinNativeAdImpl;
        }

        /* renamed from: a */
        public AppLovinNativeAdImpl m7369a() {
            return this.f8464a;
        }

        /* renamed from: a */
        public boolean m7368a(Object obj) {
            return obj instanceof View$OnAttachStateChangeListenerC3230b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof View$OnAttachStateChangeListenerC3230b) {
                View$OnAttachStateChangeListenerC3230b view$OnAttachStateChangeListenerC3230b = (View$OnAttachStateChangeListenerC3230b) obj;
                if (view$OnAttachStateChangeListenerC3230b.m7368a(this)) {
                    AppLovinNativeAdImpl m7369a = m7369a();
                    AppLovinNativeAdImpl m7369a2 = view$OnAttachStateChangeListenerC3230b.m7369a();
                    return m7369a != null ? m7369a.equals(m7369a2) : m7369a2 == null;
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            AppLovinNativeAdImpl m7369a = m7369a();
            return 59 + (m7369a == null ? 43 : m7369a.hashCode());
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f8464a.maybeHandleOnAttachedToWindow(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        public String toString() {
            return "AppLovinNativeAdImpl.OnAttachStateChangeHandler(ad=" + m7369a() + ")";
        }
    }

    private AppLovinNativeAdImpl(Builder builder) {
        super(builder.adObject, builder.fullResponse, builder.sdk);
        this.impressionTracked = new AtomicBoolean();
        this.registeredViews = new ArrayList();
        this.clickHandler = new View$OnClickListenerC3229a(this);
        this.onAttachStateChangeHandler = new View$OnAttachStateChangeListenerC3230b(this);
        this.adEventTracker = new C3050e(this);
        this.title = builder.title;
        this.advertiser = builder.advertiser;
        this.body = builder.body;
        this.callToAction = builder.callToAction;
        this.iconUri = builder.iconUri;
        this.mainImageUri = builder.mainImageUri;
        this.privacyIconUri = builder.privacyIconUri;
        this.vastAd = builder.vastAd;
        this.privacyDestinationUri = builder.privacyDestinationUri;
        this.clickDestinationUri = builder.clickDestinationUri;
        this.clickDestinationBackupUri = builder.clickDestinationBackupUri;
        this.clickTrackingUrls = builder.clickTrackingUrls;
        this.jsTracker = builder.jsTracker;
        this.impressionRequests = builder.impressionRequests;
        this.viewableMRC50Requests = builder.viewableMRC50Requests;
        this.viewableMRC100Requests = builder.viewableMRC100Requests;
        this.viewableVideo50Requests = builder.viewableVideo50Requests;
        this.tag = "AppLovinNativeAd:" + getAdIdNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<C3119a> getDirectClickTrackingPostbacks() {
        List<C3119a> postbacks;
        synchronized (this.adObjectLock) {
            postbacks = Utils.getPostbacks("click_tracking_urls", this.adObject, getClCode(), getStringFromAdObject("click_tracking_url", null), this.sdk);
        }
        return postbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleOnAttachedToWindow(View view) {
        if (this.impressionTracked.compareAndSet(false, true)) {
            if (StringUtils.isValidString(this.jsTracker)) {
                final C2762d c2762d = new C2762d(null, this.sdk, view.getContext());
                c2762d.loadData(this.jsTracker, "text/html", "UTF-8");
                AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        c2762d.stopLoading();
                    }
                }, TimeUnit.SECONDS.toMillis(5L));
            }
            for (C3265i c3265i : this.impressionRequests) {
                this.sdk.m7464X().dispatchPostbackRequest(c3265i, null);
            }
            this.adEventTracker.m8066a(view);
            this.adEventTracker.m8060d();
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void destroy() {
        unregisterViewsForInteraction();
        this.eventListener = null;
        this.adEventTracker.m8059e();
    }

    public C3050e getAdEventTracker() {
        return this.adEventTracker;
    }

    @Override // com.applovin.impl.sdk.AppLovinAdBase, com.applovin.sdk.AppLovinAd
    public long getAdIdNumber() {
        return getLongFromAdObject("ad_id", -1L);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getBody() {
        return this.body;
    }

    @Nullable
    public String getCachePrefix() {
        return getStringFromAdObject("cache_prefix", null);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getCallToAction() {
        return this.callToAction;
    }

    public View$OnClickListenerC3229a getClickHandler() {
        return this.clickHandler;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public Uri getIconUri() {
        return this.iconUri;
    }

    public Uri getMainImageUri() {
        return this.mainImageUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinMediaView getMediaView() {
        return this.mediaView;
    }

    @Override // com.applovin.impl.sdk.p028a.InterfaceC3039a
    @Nullable
    public String getOpenMeasurementContentUrl() {
        return getStringFromAdObject("omid_content_url", null);
    }

    @Override // com.applovin.impl.sdk.p028a.InterfaceC3039a
    public String getOpenMeasurementCustomReferenceData() {
        return getStringFromAdObject("omid_custom_ref_data", "");
    }

    @Override // com.applovin.impl.sdk.p028a.InterfaceC3039a
    public List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.adObjectLock) {
            JSONArray jSONArray = JsonUtils.getJSONArray(this.adObject, "omid_verification_script_resources", null);
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
                    URL url = new URL(JsonUtils.getString(jSONObject, ImagesContract.URL, null));
                    String string = JsonUtils.getString(jSONObject, "vendor_key", null);
                    String string2 = JsonUtils.getString(jSONObject, "parameters", null);
                    arrayList.add((StringUtils.isValidString(string) && StringUtils.isValidString(string2)) ? VerificationScriptResource.createVerificationScriptResourceWithParameters(string, url, string2) : VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url));
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public AppLovinOptionsView getOptionsView() {
        return this.optionsView;
    }

    public Uri getPrivacyDestinationUri() {
        return this.privacyDestinationUri;
    }

    public Uri getPrivacyIconUri() {
        return this.privacyIconUri;
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return getStringFromAdObject("type", "undefined");
    }

    public C2649a getVastAd() {
        return this.vastAd;
    }

    @Override // com.applovin.impl.sdk.p028a.InterfaceC3039a
    public boolean isOpenMeasurementEnabled() {
        return getBooleanFromAdObject("omsdk_enabled", Boolean.FALSE);
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void registerViewsForInteraction(List<View> list, ViewGroup viewGroup) {
        this.nativeAdView = viewGroup;
        if (!(C3294g.m7024c() && this.nativeAdView.isAttachedToWindow()) && (C3294g.m7024c() || this.nativeAdView.getParent() == null)) {
            this.nativeAdView.addOnAttachStateChangeListener(this.onAttachStateChangeHandler);
        } else {
            maybeHandleOnAttachedToWindow(this.nativeAdView);
        }
        if (C3349v.m6862a()) {
            C3349v m7487A = this.sdk.m7487A();
            String str = this.tag;
            m7487A.m6855b(str, "Registered ad view for impressions: " + this.nativeAdView);
        }
        if (this.clickDestinationUri == null && this.clickDestinationBackupUri == null) {
            return;
        }
        for (View view : list) {
            if (view.hasOnClickListeners() && C3349v.m6862a()) {
                C3349v m7487A2 = this.sdk.m7487A();
                String str2 = this.tag;
                m7487A2.m6850e(str2, "View has an onClickListener already - " + view);
            }
            view.setOnClickListener(this.clickHandler);
            this.registeredViews.add(view);
        }
        if (C3349v.m6862a()) {
            C3349v m7487A3 = this.sdk.m7487A();
            String str3 = this.tag;
            m7487A3.m6855b(str3, "Registered views for clicks: " + this.registeredViews);
        }
    }

    public void setEventListener(AppLovinNativeAdEventListener appLovinNativeAdEventListener) {
        this.eventListener = appLovinNativeAdEventListener;
    }

    public void setIconUri(Uri uri) {
        this.iconUri = uri;
    }

    public void setMainImageUri(Uri uri) {
        this.mainImageUri = uri;
    }

    public void setPrivacyIconUri(Uri uri) {
        this.privacyIconUri = uri;
    }

    public void setUpNativeAdViewComponents() {
        C3214m c3214m = this.sdk;
        this.mediaView = new AppLovinMediaView(this, c3214m, c3214m.m7476L());
        C3214m c3214m2 = this.sdk;
        this.optionsView = new AppLovinOptionsView(this, c3214m2, c3214m2.m7476L());
    }

    @NonNull
    public String toString() {
        return "AppLovinNativeAd{adIdNumber=" + getAdIdNumber() + " - " + getTitle() + "}";
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinNativeAd
    public void unregisterViewsForInteraction() {
        for (View view : this.registeredViews) {
            view.setOnClickListener(null);
        }
        if (C3349v.m6862a()) {
            C3349v m7487A = this.sdk.m7487A();
            String str = this.tag;
            m7487A.m6855b(str, "Unregistered views: " + this.registeredViews);
        }
        this.registeredViews.clear();
        ViewGroup viewGroup = this.nativeAdView;
        if (viewGroup != null) {
            viewGroup.removeOnAttachStateChangeListener(this.onAttachStateChangeHandler);
            this.nativeAdView = null;
        }
        AppLovinMediaView appLovinMediaView = this.mediaView;
        if (appLovinMediaView != null) {
            appLovinMediaView.destroy();
        }
        AppLovinOptionsView appLovinOptionsView = this.optionsView;
        if (appLovinOptionsView != null) {
            appLovinOptionsView.destroy();
        }
    }
}
