package com.applovin.impl.adview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.AbstractC1464h;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.adview.activity.p010b.AbstractC2688a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p029ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p029ad.InterfaceC3087g;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p032d.C3125f;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

/* renamed from: com.applovin.impl.adview.o */
/* loaded from: classes.dex */
public class C2791o implements AppLovinInterstitialAdDialog {

    /* renamed from: a */
    protected final C3214m f6658a;

    /* renamed from: b */
    private final WeakReference<Context> f6659b;

    /* renamed from: c */
    private volatile AppLovinAdLoadListener f6660c;

    /* renamed from: d */
    private volatile AppLovinAdDisplayListener f6661d;

    /* renamed from: e */
    private volatile AppLovinAdVideoPlaybackListener f6662e;

    /* renamed from: f */
    private volatile AppLovinAdClickListener f6663f;

    /* renamed from: g */
    private volatile AbstractC3080e f6664g;

    /* renamed from: h */
    private volatile AbstractC3080e.EnumC3083b f6665h;

    /* renamed from: i */
    private ViewGroup f6666i;

    /* renamed from: j */
    private AppLovinFullscreenAdViewObserver f6667j;

    /* renamed from: k */
    private AbstractC2688a f6668k;

    /* renamed from: com.applovin.impl.adview.o$2 */
    /* loaded from: classes.dex */
    public class RunnableC27932 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f6670a;

        /* renamed from: b */
        final /* synthetic */ long f6671b;

        public RunnableC27932(Context context, long j) {
            this.f6670a = context;
            this.f6671b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            new Handler(this.f6670a.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.adview.o.2.1
                @Override // java.lang.Runnable
                public void run() {
                    if (C2791o.this.f6666i == null || C2791o.this.f6667j == null) {
                        if (C3349v.m6862a()) {
                            C2791o.this.f6658a.m7487A().m6855b("InterstitialAdDialogWrapper", "Presenting ad in a fullscreen activity");
                        }
                        RunnableC27932 runnableC27932 = RunnableC27932.this;
                        C2791o.this.m8913a(runnableC27932.f6670a);
                        return;
                    }
                    if (C3349v.m6862a()) {
                        C3349v m7487A = C2791o.this.f6658a.m7487A();
                        m7487A.m6855b("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + C2791o.this.f6666i + ")");
                    }
                    C2791o.this.f6666i.setBackgroundColor(-16777216);
                    AbstractC3080e abstractC3080e = C2791o.this.f6664g;
                    AppLovinAdClickListener appLovinAdClickListener = C2791o.this.f6663f;
                    AppLovinAdDisplayListener appLovinAdDisplayListener = C2791o.this.f6661d;
                    AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener = C2791o.this.f6662e;
                    C2791o c2791o = C2791o.this;
                    AbstractC2688a.m9152a(abstractC3080e, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener, c2791o.f6658a, (Activity) c2791o.m8893f(), new AbstractC2688a.InterfaceC2700a() { // from class: com.applovin.impl.adview.o.2.1.1
                        @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a.InterfaceC2700a
                        /* renamed from: a */
                        public void mo8889a(AbstractC2688a abstractC2688a) {
                            C2791o.this.f6668k = abstractC2688a;
                            C2791o.this.f6667j.setPresenter(abstractC2688a);
                            abstractC2688a.mo9062a(C2791o.this.f6666i);
                        }

                        @Override // com.applovin.impl.adview.activity.p010b.AbstractC2688a.InterfaceC2700a
                        /* renamed from: a */
                        public void mo8888a(String str, Throwable th) {
                            C2791o.m8905a(C2791o.this.f6664g, C2791o.this.f6661d, str, th, null);
                        }
                    });
                }
            }, this.f6671b);
        }
    }

    public C2791o(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f6658a = appLovinSdk.coreSdk;
        this.f6659b = new WeakReference<>(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8914a(final int i) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.o.5
            @Override // java.lang.Runnable
            public void run() {
                if (C2791o.this.f6660c != null) {
                    C2791o.this.f6660c.failedToReceiveAd(i);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m8913a(Context context) {
        Intent intent = new Intent(context, AppLovinFullscreenActivity.class);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f6658a.m7386z());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    /* renamed from: a */
    private void m8907a(AbstractC3080e abstractC3080e, Context context) {
        if (this.f6658a.m7434af().m8068b() == null) {
            this.f6658a.m7468T().m7719a(C3125f.f8173m);
        }
        this.f6664g = abstractC3080e;
        this.f6665h = this.f6664g.m7883p();
        long max = Math.max(0L, ((Long) this.f6658a.m7456a(C3109b.f7938cl)).longValue());
        if (C3349v.m6862a()) {
            C3349v m7487A = this.f6658a.m7487A();
            m7487A.m6855b("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        }
        m8906a(abstractC3080e, context, new RunnableC27932(context, max));
    }

    /* renamed from: a */
    private void m8906a(AbstractC3080e abstractC3080e, Context context, final Runnable runnable) {
        if (!TextUtils.isEmpty(abstractC3080e.m7961N()) || !abstractC3080e.m7922ah() || C3295h.m7013a(context) || !(context instanceof Activity)) {
            runnable.run();
            return;
        }
        AlertDialog create = new AlertDialog.Builder(context).setTitle(abstractC3080e.m7921ai()).setMessage(abstractC3080e.m7920aj()).setPositiveButton(abstractC3080e.m7919ak(), (DialogInterface.OnClickListener) null).create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.o.3
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
        create.show();
    }

    /* renamed from: a */
    public static void m8905a(AbstractC3080e abstractC3080e, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, @Nullable Throwable th, @Nullable AppLovinFullscreenActivity appLovinFullscreenActivity) {
        if (C3349v.m6862a()) {
            C3349v.m6852c("InterstitialAdDialogWrapper", str, th);
        }
        if (appLovinAdDisplayListener instanceof InterfaceC3087g) {
            C3298j.m6966a(appLovinAdDisplayListener, str);
        } else {
            C3298j.m6955b(appLovinAdDisplayListener, abstractC3080e);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss();
        }
    }

    /* renamed from: a */
    private void m8904a(AppLovinAd appLovinAd) {
        if (this.f6661d != null) {
            this.f6661d.adHidden(appLovinAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m8900b(final AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.o.4
            @Override // java.lang.Runnable
            public void run() {
                if (C2791o.this.f6660c != null) {
                    C2791o.this.f6660c.adReceived(appLovinAd);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public Context m8893f() {
        return this.f6659b.get();
    }

    /* renamed from: a */
    public AbstractC3080e m8915a() {
        return this.f6664g;
    }

    /* renamed from: a */
    public void m8903a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f6658a.m7391u().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    /* renamed from: b */
    public AppLovinAdVideoPlaybackListener m8902b() {
        return this.f6662e;
    }

    /* renamed from: c */
    public AppLovinAdDisplayListener m8899c() {
        return this.f6661d;
    }

    /* renamed from: d */
    public AppLovinAdClickListener m8897d() {
        return this.f6663f;
    }

    /* renamed from: e */
    public void m8895e() {
        this.f6666i = null;
        this.f6667j = null;
        this.f6663f = null;
        this.f6660c = null;
        this.f6662e = null;
        this.f6661d = null;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f6663f = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f6661d = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f6660c = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f6662e = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        m8903a(new AppLovinAdLoadListener() { // from class: com.applovin.impl.adview.o.1
            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void adReceived(AppLovinAd appLovinAd) {
                C2791o.this.m8900b(appLovinAd);
                C2791o.this.showAndRender(appLovinAd);
            }

            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void failedToReceiveAd(int i) {
                C2791o.this.m8914a(i);
            }
        });
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        Context m8893f = m8893f();
        if (m8893f == null) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            }
            m8904a(appLovinAd);
            return;
        }
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f6658a);
        if (maybeRetrieveNonDummyAd == null) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("InterstitialAdDialogWrapper", "Failed to show ad: " + appLovinAd);
            }
            m8904a(appLovinAd);
        } else if (((AppLovinAdImpl) maybeRetrieveNonDummyAd).hasShown() && ((Boolean) this.f6658a.m7456a(C3109b.f7874bZ)).booleanValue()) {
            throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
        } else {
            if (maybeRetrieveNonDummyAd instanceof AbstractC3080e) {
                m8907a((AbstractC3080e) maybeRetrieveNonDummyAd, m8893f);
                return;
            }
            if (C3349v.m6862a()) {
                C3349v m7487A = this.f6658a.m7487A();
                m7487A.m6850e("InterstitialAdDialogWrapper", "Failed to show interstitial: unknown ad type provided: '" + maybeRetrieveNonDummyAd + "'");
            }
            m8904a(maybeRetrieveNonDummyAd);
        }
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, AbstractC1464h abstractC1464h) {
        if (viewGroup == null || abstractC1464h == null) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null containerView or lifecycle");
            }
            m8904a(appLovinAd);
            return;
        }
        this.f6666i = viewGroup;
        AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver = new AppLovinFullscreenAdViewObserver(abstractC1464h, this, this.f6658a);
        this.f6667j = appLovinFullscreenAdViewObserver;
        abstractC1464h.mo10539a(appLovinFullscreenAdViewObserver);
        showAndRender(appLovinAd);
    }

    @NonNull
    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }
}
