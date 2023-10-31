package com.applovin.impl.mediation;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p000v4.media.session.C0017a;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import androidx.activity.result.C0063d;
import androidx.annotation.Nullable;
import androidx.lifecycle.AbstractC1464h;
import com.applovin.impl.mediation.ads.AbstractC2854a;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.impl.mediation.p011a.AbstractC2827e;
import com.applovin.impl.mediation.p011a.C2825c;
import com.applovin.impl.mediation.p011a.C2828f;
import com.applovin.impl.mediation.p011a.C2829g;
import com.applovin.impl.mediation.p011a.C2831h;
import com.applovin.impl.mediation.p014c.C2879d;
import com.applovin.impl.mediation.p014c.C2886f;
import com.applovin.impl.mediation.p014c.C2887g;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3108a;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class MediationServiceImpl implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final C3214m f6747a;

    /* renamed from: b */
    private final C3349v f6748b;

    /* renamed from: c */
    private final AtomicReference<JSONObject> f6749c = new AtomicReference<>();

    /* renamed from: com.applovin.impl.mediation.MediationServiceImpl$a */
    /* loaded from: classes.dex */
    public class C2819a implements AbstractC2854a.InterfaceC2855a, MaxAdListener, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

        /* renamed from: b */
        private final AbstractC2823a f6771b;

        /* renamed from: c */
        private AbstractC2854a.InterfaceC2855a f6772c;

        public C2819a(AbstractC2823a abstractC2823a, AbstractC2854a.InterfaceC2855a interfaceC2855a) {
            this.f6771b = abstractC2823a;
            this.f6772c = interfaceC2855a;
        }

        /* renamed from: a */
        public void m8815a(AbstractC2854a.InterfaceC2855a interfaceC2855a) {
            this.f6772c = interfaceC2855a;
        }

        /* renamed from: a */
        public void m8814a(MaxAd maxAd, @Nullable Bundle bundle) {
            this.f6771b.m8786r();
            this.f6771b.m8807a(bundle);
            MediationServiceImpl.this.m8831a(this.f6771b);
            C3298j.m6984a((MaxAdListener) this.f6772c, maxAd);
        }

        /* renamed from: b */
        public void m8813b(MaxAd maxAd, @Nullable Bundle bundle) {
            if (C3349v.m6862a()) {
                MediationServiceImpl.this.f6748b.m6855b("MediationService", "Scheduling impression for ad via callback...");
            }
            MediationServiceImpl.this.processCallbackAdImpressionPostback(this.f6771b, this.f6772c);
            this.f6771b.m8807a(bundle);
            MediationServiceImpl.this.f6747a.m7433ag().m7533a(this.f6771b, "DID_DISPLAY");
            if (maxAd.getFormat().isFullscreenAd()) {
                MediationServiceImpl.this.f6747a.m7435ae().m7070a(maxAd);
                MediationServiceImpl.this.f6747a.m7429ak().m7376a(maxAd);
            }
            C3298j.m6958b(this.f6772c, maxAd);
        }

        /* renamed from: c */
        public void m8812c(final MaxAd maxAd, @Nullable Bundle bundle) {
            if (bundle != null && bundle.size() > 0) {
                ((AbstractC2823a) maxAd).m8803a(BundleUtils.toJSONObject(bundle.getBundle(Utils.KEY_AD_VALUES)));
            }
            MediationServiceImpl.this.f6747a.m7433ag().m7533a((AbstractC2823a) maxAd, "DID_HIDE");
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.a.1
                @Override // java.lang.Runnable
                public void run() {
                    if (maxAd.getFormat().isFullscreenAd()) {
                        MediationServiceImpl.this.f6747a.m7435ae().m7066b(maxAd);
                        MediationServiceImpl.this.f6747a.m7429ak().m7384a();
                    }
                    C3298j.m6952c(C2819a.this.f6772c, maxAd);
                }
            }, maxAd instanceof C2825c ? ((C2825c) maxAd).m8774A() : 0L);
        }

        /* renamed from: d */
        public void m8811d(MaxAd maxAd, @Nullable Bundle bundle) {
            if (bundle != null && bundle.size() > 0) {
                ((AbstractC2823a) maxAd).m8803a(BundleUtils.toJSONObject(bundle.getBundle(Utils.KEY_AD_VALUES)));
            }
            MediationServiceImpl.this.m8830a(this.f6771b, this.f6772c);
            C3298j.m6949d(this.f6772c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            m8811d(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            C3298j.m6941h(this.f6772c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            MediationServiceImpl.this.m8818b(this.f6771b, maxError, this.f6772c);
            if ((maxAd.getFormat() == MaxAdFormat.REWARDED || maxAd.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) && (maxAd instanceof C2825c)) {
                ((C2825c) maxAd).m8769F();
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            m8813b(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            C3298j.m6943g(this.f6772c, maxAd);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            m8812c(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            this.f6771b.m8786r();
            MediationServiceImpl.this.m8829a(this.f6771b, maxError, this.f6772c);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            m8814a(maxAd, null);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoCompleted(MaxAd maxAd) {
            C3298j.m6945f(this.f6772c, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onRewardedVideoStarted(MaxAd maxAd) {
            C3298j.m6947e(this.f6772c, maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            C3298j.m6981a(this.f6772c, maxAd, maxReward);
            MediationServiceImpl.this.f6747a.m7469S().m7620a(new C2886f((C2825c) maxAd, MediationServiceImpl.this.f6747a), C3163o.EnumC3165a.MEDIATION_REWARD);
        }
    }

    public MediationServiceImpl(C3214m c3214m) {
        this.f6747a = c3214m;
        this.f6748b = c3214m.m7487A();
        c3214m.m7430aj().registerReceiver(this, new IntentFilter("com.applovin.render_process_gone"));
    }

    /* renamed from: a */
    private C2980g m8828a(C2825c c2825c) {
        C2980g m8797g = c2825c.m8797g();
        if (m8797g == null) {
            this.f6747a.m7435ae().m7069a(false);
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f6748b;
                c3349v.m6851d("MediationService", "Failed to show " + c2825c + ": adapter not found");
                C3349v.m6846i("MediationService", "There may be an integration problem with the adapter for ad unit id '" + c2825c.getAdUnitId() + "'. Please check if you have a supported version of that SDK integrated into your project.");
            }
            throw new IllegalStateException("Could not find adapter for provided ad");
        }
        return m8797g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8831a(AbstractC2823a abstractC2823a) {
        this.f6747a.m7433ag().m7533a(abstractC2823a, "DID_LOAD");
        if (abstractC2823a.m8800d().endsWith("load")) {
            this.f6747a.m7433ag().m7534a(abstractC2823a);
        }
        long m8789o = abstractC2823a.m8789o();
        HashMap hashMap = new HashMap(1);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(m8789o));
        m8822a("load", hashMap, abstractC2823a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8830a(AbstractC2823a abstractC2823a, AbstractC2854a.InterfaceC2855a interfaceC2855a) {
        this.f6747a.m7433ag().m7533a(abstractC2823a, "DID_CLICKED");
        this.f6747a.m7433ag().m7533a(abstractC2823a, "DID_CLICK");
        if (abstractC2823a.m8800d().endsWith("click")) {
            this.f6747a.m7433ag().m7534a(abstractC2823a);
            C3298j.m6976a((MaxAdRevenueListener) interfaceC2855a, (MaxAd) abstractC2823a);
        }
        m8824a("mclick", abstractC2823a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8829a(AbstractC2823a abstractC2823a, MaxError maxError, MaxAdListener maxAdListener) {
        m8825a(maxError, abstractC2823a);
        destroyAd(abstractC2823a);
        C3298j.m6978a(maxAdListener, abstractC2823a.getAdUnitId(), maxError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8827a(C2825c c2825c, AbstractC2854a.InterfaceC2855a interfaceC2855a) {
        this.f6747a.m7435ae().m7069a(false);
        m8826a(c2825c, (MaxAdListener) interfaceC2855a);
        if (C3349v.m6862a()) {
            this.f6748b.m6855b("MediationService", "Scheduling impression for ad manually...");
        }
        processRawAdImpressionPostback(c2825c, interfaceC2855a);
    }

    /* renamed from: a */
    private void m8826a(final C2825c c2825c, final MaxAdListener maxAdListener) {
        final long longValue = ((Long) this.f6747a.m7456a(C3108a.f7748F)).longValue();
        if (longValue <= 0) {
            return;
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.4
            @Override // java.lang.Runnable
            public void run() {
                if (c2825c.m8785s().get()) {
                    return;
                }
                StringBuilder sb = new StringBuilder("Ad (");
                sb.append(c2825c.m8742M());
                sb.append(") has not been displayed after ");
                String m13071a = C0017a.m13071a(sb, longValue, "ms. Failing ad display...");
                if (C3349v.m6862a()) {
                    C3349v.m6846i("MediationService", m13071a);
                }
                MediationServiceImpl.this.m8818b(c2825c, new MaxErrorImpl(-1, m13071a), maxAdListener);
                MediationServiceImpl.this.f6747a.m7435ae().m7066b(c2825c);
                MediationServiceImpl.this.f6747a.m7429ak().m7384a();
            }
        }, longValue);
    }

    /* renamed from: a */
    private void m8825a(MaxError maxError, AbstractC2823a abstractC2823a) {
        long m8789o = abstractC2823a.m8789o();
        HashMap hashMap = new HashMap(1);
        hashMap.put("{LOAD_TIME_MS}", String.valueOf(m8789o));
        m8821a("mlerr", hashMap, maxError, abstractC2823a);
    }

    /* renamed from: a */
    private void m8824a(String str, C2828f c2828f) {
        m8821a(str, Collections.EMPTY_MAP, (MaxError) null, c2828f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8823a(String str, C2831h c2831h, C2980g c2980g) {
        HashMap hashMap = new HashMap(2);
        Utils.putObjectForStringIfValid("{ADAPTER_VERSION}", c2980g.m8135i(), hashMap);
        Utils.putObjectForStringIfValid("{SDK_VERSION}", c2980g.m8137h(), hashMap);
        m8821a("serr", hashMap, new MaxErrorImpl(str), c2831h);
    }

    /* renamed from: a */
    private void m8822a(String str, Map<String, String> map, C2828f c2828f) {
        m8821a(str, map, (MaxError) null, c2828f);
    }

    /* renamed from: a */
    private void m8821a(String str, Map<String, String> map, MaxError maxError, C2828f c2828f) {
        HashMap hashMap = new HashMap(map);
        hashMap.put("{PLACEMENT}", StringUtils.emptyIfNull(c2828f.getPlacement()));
        hashMap.put("{CUSTOM_DATA}", StringUtils.emptyIfNull(c2828f.m8729Z()));
        if (c2828f instanceof AbstractC2823a) {
            hashMap.put("{CREATIVE_ID}", StringUtils.emptyIfNull(((AbstractC2823a) c2828f).getCreativeId()));
        }
        this.f6747a.m7469S().m7620a(new C2879d(str, hashMap, maxError, c2828f, this.f6747a), C3163o.EnumC3165a.MEDIATION_POSTBACKS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8818b(AbstractC2823a abstractC2823a, MaxError maxError, MaxAdListener maxAdListener) {
        this.f6747a.m7433ag().m7533a(abstractC2823a, "DID_FAIL_DISPLAY");
        processAdDisplayErrorPostback(maxError, abstractC2823a);
        if (abstractC2823a.m8785s().compareAndSet(false, true)) {
            C3298j.m6983a(maxAdListener, abstractC2823a, maxError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8817b(C2825c c2825c) {
        if (c2825c.getFormat() == MaxAdFormat.REWARDED || c2825c.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
            this.f6747a.m7469S().m7620a(new C2887g(c2825c, this.f6747a), C3163o.EnumC3165a.MEDIATION_REWARD);
        }
    }

    public void collectSignal(MaxAdFormat maxAdFormat, final C2831h c2831h, Context context, final C2829g.InterfaceC2830a interfaceC2830a) {
        String str;
        C3349v c3349v;
        StringBuilder sb;
        if (c2831h == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        if (interfaceC2830a == null) {
            throw new IllegalArgumentException("No callback specified");
        }
        final C2980g m8177a = this.f6747a.m7485C().m8177a(c2831h, true);
        if (m8177a != null) {
            Activity m7426an = context instanceof Activity ? (Activity) context : this.f6747a.m7426an();
            MaxAdapterParametersImpl m8839a = MaxAdapterParametersImpl.m8839a(c2831h, maxAdFormat);
            if (((Boolean) this.f6747a.m7456a(C3108a.f7760R)).booleanValue()) {
                this.f6747a.m7484D().m8186a(c2831h, m7426an);
            }
            MaxSignalCollectionListener maxSignalCollectionListener = new MaxSignalCollectionListener() { // from class: com.applovin.impl.mediation.MediationServiceImpl.3
                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                public void onSignalCollected(String str2) {
                    interfaceC2830a.mo8538a(C2829g.m8704a(c2831h, m8177a, str2));
                    m8177a.m8133j();
                }

                @Override // com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener
                public void onSignalCollectionFailed(String str2) {
                    MediationServiceImpl.this.m8823a(str2, c2831h, m8177a);
                    interfaceC2830a.mo8538a(C2829g.m8701b(c2831h, m8177a, str2));
                    m8177a.m8133j();
                }
            };
            if (!c2831h.m8697a()) {
                if (C3349v.m6862a()) {
                    c3349v = this.f6748b;
                    sb = new StringBuilder("Collecting signal for adapter: ");
                    sb.append(m8177a.m8145d());
                    c3349v.m6855b("MediationService", sb.toString());
                }
                m8177a.m8160a(m8839a, c2831h, m7426an, maxSignalCollectionListener);
                return;
            } else if (this.f6747a.m7484D().m8188a(c2831h)) {
                if (C3349v.m6862a()) {
                    c3349v = this.f6748b;
                    sb = new StringBuilder("Collecting signal for now-initialized adapter: ");
                    sb.append(m8177a.m8145d());
                    c3349v.m6855b("MediationService", sb.toString());
                }
                m8177a.m8160a(m8839a, c2831h, m7426an, maxSignalCollectionListener);
                return;
            } else {
                if (C3349v.m6862a()) {
                    C3349v c3349v2 = this.f6748b;
                    c3349v2.m6850e("MediationService", "Skip collecting signal for not-initialized adapter: " + m8177a.m8145d());
                }
                str = "Adapter not initialized yet";
            }
        } else {
            str = "Could not load adapter";
        }
        interfaceC2830a.mo8538a(C2829g.m8703a(c2831h, str));
    }

    public void destroyAd(MaxAd maxAd) {
        if (maxAd instanceof AbstractC2823a) {
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f6748b;
                c3349v.m6853c("MediationService", "Destroying " + maxAd);
            }
            AbstractC2823a abstractC2823a = (AbstractC2823a) maxAd;
            C2980g m8797g = abstractC2823a.m8797g();
            if (m8797g != null) {
                m8797g.m8133j();
                abstractC2823a.m8784t();
            }
            this.f6747a.m7486B().m7707c(abstractC2823a.m8798f());
        }
    }

    public JSONObject getAndResetCustomPostBodyData() {
        return this.f6749c.getAndSet(null);
    }

    public void loadAd(String str, @Nullable String str2, MaxAdFormat maxAdFormat, Map<String, Object> map, Map<String, Object> map2, Context context, AbstractC2854a.InterfaceC2855a interfaceC2855a) {
        if (!TextUtils.isEmpty(str)) {
            if (context != null) {
                if (interfaceC2855a != null) {
                    if (C3349v.m6862a() && TextUtils.isEmpty(this.f6747a.m7392t())) {
                        C3349v.m6846i("AppLovinSdk", "Mediation provider is null. Please set AppLovin SDK mediation provider via AppLovinSdk.getInstance(context).setMediationProvider()");
                    }
                    if (C3349v.m6862a() && !this.f6747a.m7411d()) {
                        C3349v.m6847h("AppLovinSdk", "Attempted to load ad before SDK initialization. Please wait until after the SDK has initialized, e.g. AppLovinSdk.initializeSdk(Context, SdkInitializationListener).");
                    }
                    this.f6747a.m7461a();
                    if (str.length() != 16 && !str.startsWith("test_mode") && !this.f6747a.m7386z().startsWith("05TMD") && C3349v.m6862a()) {
                        StringBuilder m13052b = C0063d.m13052b("Please double-check the ad unit ", str, " for ");
                        m13052b.append(maxAdFormat.getLabel());
                        m13052b.append(" : ");
                        m13052b.append(Log.getStackTraceString(new Throwable("")));
                        C3349v.m6846i("MediationService", m13052b.toString());
                    }
                    if (this.f6747a.m7448a(maxAdFormat)) {
                        if (C3349v.m6862a()) {
                            C3349v.m6846i("MediationService", "Ad load failed due to disabled ad format " + maxAdFormat.getLabel());
                        }
                        C3298j.m6978a(interfaceC2855a, str, new MaxErrorImpl(-1, "Disabled ad format " + maxAdFormat.getLabel()));
                        return;
                    }
                    this.f6747a.m7479I().m8482a(str, str2, maxAdFormat, map, map2, context, interfaceC2855a);
                    return;
                }
                throw new IllegalArgumentException("No listener specified");
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No ad unit ID specified");
    }

    public void loadThirdPartyMediatedAd(String str, AbstractC2823a abstractC2823a, Activity activity, AbstractC2854a.InterfaceC2855a interfaceC2855a) {
        if (abstractC2823a == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        }
        if (C3349v.m6862a()) {
            this.f6748b.m6855b("MediationService", "Loading " + abstractC2823a + "...");
        }
        this.f6747a.m7433ag().m7533a(abstractC2823a, "WILL_LOAD");
        C2980g m8179a = this.f6747a.m7485C().m8179a(abstractC2823a);
        if (m8179a != null) {
            MaxAdapterParametersImpl m8841a = MaxAdapterParametersImpl.m8841a(abstractC2823a);
            if (((Boolean) this.f6747a.m7456a(C3108a.f7761S)).booleanValue()) {
                this.f6747a.m7484D().m8186a(abstractC2823a, activity);
            }
            AbstractC2823a mo8759a = abstractC2823a.mo8759a(m8179a);
            m8179a.m8156a(str, mo8759a);
            mo8759a.m8788p();
            m8179a.m8154a(str, m8841a, mo8759a, activity, new C2819a(mo8759a, interfaceC2855a));
            return;
        }
        String str2 = "Failed to load " + abstractC2823a + ": adapter not loaded";
        if (C3349v.m6862a()) {
            C3349v.m6846i("MediationService", str2);
        }
        m8829a(abstractC2823a, new MaxErrorImpl(-5001, str2), interfaceC2855a);
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Context context, Intent intent, @Nullable Map<String, Object> map) {
        if ("com.applovin.render_process_gone".equals(intent.getAction())) {
            Object m7065c = this.f6747a.m7435ae().m7065c();
            if (m7065c instanceof AbstractC2823a) {
                processAdDisplayErrorPostback(MaxAdapterError.WEBVIEW_ERROR, (AbstractC2823a) m7065c);
            }
        }
    }

    public void processAdDisplayErrorPostback(MaxError maxError, AbstractC2823a abstractC2823a) {
        m8821a("mierr", Collections.EMPTY_MAP, maxError, abstractC2823a);
    }

    public void processAdLossPostback(AbstractC2823a abstractC2823a, @Nullable Float f) {
        String f2 = f != null ? f.toString() : "";
        HashMap hashMap = new HashMap(1);
        hashMap.put("{MBR}", f2);
        m8822a("mloss", hashMap, abstractC2823a);
    }

    public void processAdapterInitializationPostback(C2828f c2828f, long j, MaxAdapter.InitializationStatus initializationStatus, String str) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("{INIT_STATUS}", String.valueOf(initializationStatus.getCode()));
        hashMap.put("{INIT_TIME_MS}", String.valueOf(j));
        m8821a("minit", hashMap, new MaxErrorImpl(str), c2828f);
    }

    public void processCallbackAdImpressionPostback(AbstractC2823a abstractC2823a, AbstractC2854a.InterfaceC2855a interfaceC2855a) {
        if (abstractC2823a.m8800d().endsWith("cimp")) {
            this.f6747a.m7433ag().m7534a(abstractC2823a);
            C3298j.m6976a((MaxAdRevenueListener) interfaceC2855a, (MaxAd) abstractC2823a);
        }
        m8824a("mcimp", abstractC2823a);
    }

    public void processRawAdImpressionPostback(AbstractC2823a abstractC2823a, AbstractC2854a.InterfaceC2855a interfaceC2855a) {
        this.f6747a.m7433ag().m7533a(abstractC2823a, "WILL_DISPLAY");
        if (abstractC2823a.m8800d().endsWith("mimp")) {
            this.f6747a.m7433ag().m7534a(abstractC2823a);
            C3298j.m6976a((MaxAdRevenueListener) interfaceC2855a, (MaxAd) abstractC2823a);
        }
        HashMap hashMap = new HashMap(1);
        if (abstractC2823a instanceof C2825c) {
            hashMap.put("{TIME_TO_SHOW_MS}", String.valueOf(((C2825c) abstractC2823a).m8761y()));
        }
        m8822a("mimp", hashMap, abstractC2823a);
    }

    public void processViewabilityAdImpressionPostback(AbstractC2827e abstractC2827e, long j, AbstractC2854a.InterfaceC2855a interfaceC2855a) {
        if (abstractC2827e.m8800d().endsWith("vimp")) {
            this.f6747a.m7433ag().m7534a(abstractC2827e);
            C3298j.m6976a((MaxAdRevenueListener) interfaceC2855a, (MaxAd) abstractC2827e);
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("{VIEWABILITY_FLAGS}", String.valueOf(j));
        hashMap.put("{USED_VIEWABILITY_TIMER}", String.valueOf(abstractC2827e.m8748G()));
        m8822a("mvimp", hashMap, abstractC2827e);
    }

    public void setCustomPostBodyData(JSONObject jSONObject) {
        this.f6749c.set(jSONObject);
    }

    public void showFullscreenAd(final C2825c c2825c, final Activity activity, final AbstractC2854a.InterfaceC2855a interfaceC2855a) {
        if (c2825c == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f6747a.m7435ae().m7069a(true);
        final C2980g m8828a = m8828a(c2825c);
        long m8760z = c2825c.m8760z();
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6748b;
            c3349v.m6853c("MediationService", "Showing ad " + c2825c.getAdUnitId() + " with delay of " + m8760z + "ms...");
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.1
            @Override // java.lang.Runnable
            public void run() {
                MediationServiceImpl.this.m8817b(c2825c);
                m8828a.m8170a(c2825c, activity);
                MediationServiceImpl.this.m8827a(c2825c, interfaceC2855a);
            }
        }, m8760z);
    }

    public void showFullscreenAd(final C2825c c2825c, final ViewGroup viewGroup, final AbstractC1464h abstractC1464h, final Activity activity, final AbstractC2854a.InterfaceC2855a interfaceC2855a) {
        if (c2825c == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        if (activity == null) {
            throw new IllegalArgumentException("No activity specified");
        }
        this.f6747a.m7435ae().m7069a(true);
        final C2980g m8828a = m8828a(c2825c);
        long m8760z = c2825c.m8760z();
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6748b;
            c3349v.m6853c("MediationService", "Showing ad " + c2825c.getAdUnitId() + " with delay of " + m8760z + "ms...");
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.MediationServiceImpl.2
            @Override // java.lang.Runnable
            public void run() {
                MediationServiceImpl.this.m8817b(c2825c);
                m8828a.m8169a(c2825c, viewGroup, abstractC1464h, activity);
                MediationServiceImpl.this.m8827a(c2825c, interfaceC2855a);
            }
        }, m8760z);
    }
}
