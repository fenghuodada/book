package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.C2791o;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.p010b.AbstractC2688a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p029ad.C3079d;
import com.applovin.impl.sdk.p029ad.EnumC3076b;
import com.applovin.impl.sdk.p033e.AbstractRunnableC3131a;
import com.applovin.impl.sdk.p033e.C3169p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.adview.activity.a */
/* loaded from: classes.dex */
public class ServiceConnectionC2675a implements ServiceConnection {

    /* renamed from: a */
    private final C3214m f6374a;

    /* renamed from: b */
    private final C3349v f6375b;

    /* renamed from: c */
    private final WeakReference<AppLovinFullscreenActivity> f6376c;

    /* renamed from: d */
    private final AtomicBoolean f6377d = new AtomicBoolean();

    /* renamed from: e */
    private Messenger f6378e;

    /* renamed from: com.applovin.impl.adview.activity.a$a */
    /* loaded from: classes.dex */
    public class C2678a implements AppLovinAdClickListener, AppLovinAdDisplayListener, AppLovinAdVideoPlaybackListener {
        private C2678a() {
        }

        /* renamed from: a */
        private void m9169a(Bundle bundle, FullscreenAdService.EnumC2674b enumC2674b) {
            Message obtain = Message.obtain((Handler) null, enumC2674b.m9178a());
            if (bundle != null) {
                obtain.setData(bundle);
            }
            try {
                ServiceConnectionC2675a.this.f6378e.send(obtain);
            } catch (RemoteException e) {
                if (C3349v.m6862a()) {
                    C3349v c3349v = ServiceConnectionC2675a.this.f6375b;
                    c3349v.m6854b("AppLovinFullscreenActivity", "Failed to forward callback (" + enumC2674b.m9178a() + ")", e);
                }
            }
        }

        /* renamed from: a */
        private void m9168a(FullscreenAdService.EnumC2674b enumC2674b) {
            m9169a(null, enumC2674b);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            m9168a(FullscreenAdService.EnumC2674b.AD_CLICKED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            m9168a(FullscreenAdService.EnumC2674b.AD_DISPLAYED);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            m9168a(FullscreenAdService.EnumC2674b.AD_HIDDEN);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            m9168a(FullscreenAdService.EnumC2674b.AD_VIDEO_STARTED);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d);
            bundle.putBoolean("fully_watched", z);
            m9169a(bundle, FullscreenAdService.EnumC2674b.AD_VIDEO_ENDED);
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.a$b */
    /* loaded from: classes.dex */
    public static class HandlerC2679b extends Handler {

        /* renamed from: a */
        private final WeakReference<ServiceConnectionC2675a> f6385a;

        private HandlerC2679b(ServiceConnectionC2675a serviceConnectionC2675a) {
            this.f6385a = new WeakReference<>(serviceConnectionC2675a);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            ServiceConnectionC2675a serviceConnectionC2675a;
            if (message.what != FullscreenAdService.EnumC2674b.AD.m9178a() || (serviceConnectionC2675a = this.f6385a.get()) == null) {
                super.handleMessage(message);
            } else {
                serviceConnectionC2675a.m9174a(EnumC3076b.m7997a(message.getData().getInt("ad_source")), message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            }
        }
    }

    public ServiceConnectionC2675a(AppLovinFullscreenActivity appLovinFullscreenActivity, C3214m c3214m) {
        this.f6374a = c3214m;
        this.f6375b = c3214m.m7487A();
        this.f6376c = new WeakReference<>(appLovinFullscreenActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m9177a() {
        AppLovinFullscreenActivity appLovinFullscreenActivity = this.f6376c.get();
        if (appLovinFullscreenActivity != null) {
            if (C3349v.m6862a()) {
                this.f6375b.m6855b("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss();
        } else if (C3349v.m6862a()) {
            this.f6375b.m6850e("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m9174a(EnumC3076b enumC3076b, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f6374a.m7469S().m7621a((AbstractRunnableC3131a) new C3169p(jSONObject, C3079d.m7988a(JsonUtils.getString(jSONObject, "zone_id", "")), enumC3076b, new AppLovinAdLoadListener() { // from class: com.applovin.impl.adview.activity.a.1
                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void adReceived(final AppLovinAd appLovinAd) {
                    final AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) ServiceConnectionC2675a.this.f6376c.get();
                    boolean m6862a = C3349v.m6862a();
                    if (appLovinFullscreenActivity != null) {
                        if (m6862a) {
                            ServiceConnectionC2675a.this.f6375b.m6855b("AppLovinFullscreenActivity", "Presenting ad...");
                        }
                        final C2678a c2678a = new C2678a();
                        AbstractC2688a.m9152a((AbstractC3080e) appLovinAd, c2678a, c2678a, c2678a, ServiceConnectionC2675a.this.f6374a, appLovinFullscreenActivity, new AbstractC2688a.InterfaceC2700a() { // from class: com.applovin.impl.adview.activity.a.1.1
                            @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a.InterfaceC2700a
                            /* renamed from: a */
                            public void mo8889a(AbstractC2688a abstractC2688a) {
                                appLovinFullscreenActivity.setPresenter(abstractC2688a);
                                abstractC2688a.mo9055d();
                            }

                            @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a.InterfaceC2700a
                            /* renamed from: a */
                            public void mo8888a(String str2, Throwable th) {
                                C2791o.m8905a((AbstractC3080e) appLovinAd, c2678a, str2, th, appLovinFullscreenActivity);
                            }
                        });
                    } else if (m6862a) {
                        C3349v c3349v = ServiceConnectionC2675a.this.f6375b;
                        c3349v.m6850e("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
                    }
                }

                @Override // com.applovin.sdk.AppLovinAdLoadListener
                public void failedToReceiveAd(int i) {
                    ServiceConnectionC2675a.this.m9177a();
                }
            }, this.f6374a));
        } catch (JSONException e) {
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f6375b;
                c3349v.m6854b("AppLovinFullscreenActivity", "Unable to process ad: " + str, e);
            }
            m9177a();
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f6377d.compareAndSet(false, true)) {
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f6375b;
                c3349v.m6855b("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f6378e = new Messenger(iBinder);
            Message obtain = Message.obtain((Handler) null, FullscreenAdService.EnumC2674b.AD.m9178a());
            obtain.replyTo = new Messenger(new HandlerC2679b());
            try {
                if (C3349v.m6862a()) {
                    this.f6375b.m6855b("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f6378e.send(obtain);
            } catch (RemoteException e) {
                if (C3349v.m6862a()) {
                    this.f6375b.m6854b("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e);
                }
                m9177a();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f6377d.compareAndSet(true, false) && C3349v.m6862a()) {
            C3349v c3349v = this.f6375b;
            c3349v.m6855b("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }
}
