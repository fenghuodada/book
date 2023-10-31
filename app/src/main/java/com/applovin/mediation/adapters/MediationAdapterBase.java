package com.applovin.mediation.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1464h;
import com.applovin.impl.mediation.MaxRewardImpl;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxNativeAdAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.sdk.AppLovinEventParameters;
import com.applovin.sdk.AppLovinSdk;
import java.io.InputStream;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public abstract class MediationAdapterBase implements MaxAdapter, MaxInterstitialAdViewAdapter, MaxNativeAdAdapter, MaxRewardedAdViewAdapter {
    private static final ExecutorService sCachingExecutorService = Executors.newFixedThreadPool(4);
    private boolean alwaysRewardUser;
    private final C3349v mLogger;
    private final C3214m mSdk;
    private final String mTag;
    private final AppLovinSdk mWrappingSdk;
    private MaxReward reward;

    public MediationAdapterBase(AppLovinSdk appLovinSdk) {
        this.mWrappingSdk = appLovinSdk;
        C3214m c3214m = appLovinSdk.coreSdk;
        this.mSdk = c3214m;
        this.mLogger = c3214m.m7487A();
        this.mTag = getClass().getSimpleName();
    }

    public static String mediationTag() {
        return "AppLovinSdk_" + AppLovinSdk.VERSION;
    }

    public void checkActivities(Context context, Class<?>... clsArr) {
    }

    public void checkExistence(Class<?>... clsArr) {
        if (clsArr == null || clsArr.length <= 0 || !C3349v.m6862a()) {
            return;
        }
        for (Class<?> cls : clsArr) {
            log("Found: ".concat(cls.getName()));
        }
    }

    public void configureReward(MaxAdapterResponseParameters maxAdapterResponseParameters) {
        Bundle serverParameters = maxAdapterResponseParameters.getServerParameters();
        this.alwaysRewardUser = BundleUtils.getBoolean("always_reward_user", maxAdapterResponseParameters.isTesting(), serverParameters);
        int i = BundleUtils.getInt(AppLovinEventParameters.REVENUE_AMOUNT, 0, serverParameters);
        String string = BundleUtils.getString("currency", "", serverParameters);
        if (C3349v.m6862a()) {
            log("Creating reward: " + i + " " + string);
        }
        this.reward = MaxRewardImpl.create(i, string);
    }

    public Future<Drawable> createDrawableFuture(final String str, final Resources resources) {
        return getCachingExecutorService().submit(new Callable<Drawable>() { // from class: com.applovin.mediation.adapters.MediationAdapterBase.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Drawable call() throws Exception {
                InputStream openStream = new URL(str).openStream();
                BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeStream(openStream));
                openStream.close();
                return bitmapDrawable;
            }
        });
    }

    /* renamed from: d */
    public void m6824d(String str) {
        this.mLogger.m6855b(this.mTag, str);
    }

    /* renamed from: e */
    public void m6823e(String str) {
        this.mLogger.m6850e(this.mTag, str);
    }

    /* renamed from: e */
    public void m6822e(String str, Throwable th) {
        this.mLogger.m6854b(this.mTag, str, th);
    }

    public Context getApplicationContext() {
        return this.mSdk.m7476L();
    }

    public ExecutorService getCachingExecutorService() {
        return sCachingExecutorService;
    }

    public MaxReward getReward() {
        MaxReward maxReward = this.reward;
        return maxReward != null ? maxReward : MaxRewardImpl.createDefault();
    }

    public String getVersionString(Class cls, String str) {
        String string = Utils.getString(cls, str);
        if (string == null && C3349v.m6862a()) {
            log("Failed to retrieve version string.");
        }
        return string;
    }

    public AppLovinSdk getWrappingSdk() {
        return this.mWrappingSdk;
    }

    /* renamed from: i */
    public void m6821i(String str) {
        this.mLogger.m6853c(this.mTag, str);
    }

    @Override // com.applovin.mediation.adapter.MaxAdapter
    public boolean isBeta() {
        return false;
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        if (C3349v.m6862a()) {
            m6824d("This adapter (" + getAdapterVersion() + ") does not support native ads.");
        }
        maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void log(String str) {
        if (C3349v.m6862a()) {
            this.mLogger.m6853c(this.mTag, str);
        }
    }

    public void log(String str, Throwable th) {
        if (C3349v.m6862a()) {
            this.mLogger.m6854b(this.mTag, str, th);
        }
    }

    public boolean shouldAlwaysRewardUser() {
        return this.alwaysRewardUser;
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, AbstractC1464h abstractC1464h, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        if (C3349v.m6862a()) {
            m6824d("This adapter (" + getAdapterVersion() + ") does not support interstitial ad view ads.");
        }
        maxInterstitialAdapterListener.onInterstitialAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, AbstractC1464h abstractC1464h, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        if (C3349v.m6862a()) {
            m6824d("This adapter (" + getAdapterVersion() + ") does not support rewarded ad view ads.");
        }
        maxRewardedAdapterListener.onRewardedAdDisplayFailed(MaxAdapterError.INVALID_CONFIGURATION);
    }

    public void userError(String str) {
        userError(str, null);
    }

    public void userError(String str, Throwable th) {
        if (C3349v.m6862a()) {
            C3349v.m6852c(this.mTag, str, th);
        }
    }

    /* renamed from: w */
    public void m6820w(String str) {
        this.mLogger.m6851d(this.mTag, str);
    }
}
