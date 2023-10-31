package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinAdViewDisplayErrorCode;
import com.applovin.adview.AppLovinAdViewEventListener;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p029ad.C3075a;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p032d.C3123d;
import com.applovin.impl.sdk.p032d.C3125f;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.p033e.C3189z;
import com.applovin.impl.sdk.utils.C3288b;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.C3333k;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.applovin.impl.adview.b */
/* loaded from: classes.dex */
public class C2746b implements AppLovinCommunicatorSubscriber {

    /* renamed from: A */
    private volatile AppLovinAdClickListener f6554A;

    /* renamed from: a */
    private Context f6556a;

    /* renamed from: b */
    private ViewGroup f6557b;

    /* renamed from: c */
    private C3214m f6558c;

    /* renamed from: d */
    private AppLovinAdServiceImpl f6559d;

    /* renamed from: e */
    private C3349v f6560e;

    /* renamed from: f */
    private AppLovinCommunicator f6561f;

    /* renamed from: g */
    private AppLovinAdSize f6562g;

    /* renamed from: h */
    private String f6563h;

    /* renamed from: i */
    private C3123d f6564i;

    /* renamed from: j */
    private C2768e f6565j;

    /* renamed from: k */
    private C2760c f6566k;

    /* renamed from: l */
    private C2762d f6567l;

    /* renamed from: m */
    private Runnable f6568m;

    /* renamed from: n */
    private Runnable f6569n;

    /* renamed from: x */
    private volatile AppLovinAdLoadListener f6579x;

    /* renamed from: y */
    private volatile AppLovinAdDisplayListener f6580y;

    /* renamed from: z */
    private volatile AppLovinAdViewEventListener f6581z;

    /* renamed from: o */
    private volatile AbstractC3080e f6570o = null;

    /* renamed from: p */
    private volatile AppLovinAd f6571p = null;

    /* renamed from: q */
    private DialogC2781l f6572q = null;

    /* renamed from: r */
    private DialogC2781l f6573r = null;

    /* renamed from: s */
    private final AtomicReference<AppLovinAd> f6574s = new AtomicReference<>();

    /* renamed from: t */
    private final AtomicBoolean f6575t = new AtomicBoolean();

    /* renamed from: u */
    private volatile boolean f6576u = false;

    /* renamed from: v */
    private volatile boolean f6577v = false;

    /* renamed from: w */
    private volatile boolean f6578w = false;

    /* renamed from: B */
    private volatile InterfaceC2772g f6555B = null;

    /* renamed from: com.applovin.impl.adview.b$a */
    /* loaded from: classes.dex */
    public class RunnableC2758a implements Runnable {
        private RunnableC2758a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2746b.this.f6567l != null) {
                C2746b.this.f6567l.setVisibility(8);
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.b$b */
    /* loaded from: classes.dex */
    public class RunnableC2759b implements Runnable {
        private RunnableC2759b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2746b.this.f6570o != null) {
                if (C2746b.this.f6567l == null) {
                    if (C3349v.m6862a()) {
                        C3349v.m6846i("AppLovinAdView", "Unable to render advertisement for ad #" + C2746b.this.f6570o.getAdIdNumber() + ". Please make sure you are not calling AppLovinAdView.destroy() prematurely.");
                    }
                    C3298j.m6987a(C2746b.this.f6581z, C2746b.this.f6570o, (AppLovinAdView) null, AppLovinAdViewDisplayErrorCode.WEBVIEW_NOT_FOUND);
                    return;
                }
                C2746b.this.m8979x();
                if (C3349v.m6862a()) {
                    C3349v c3349v = C2746b.this.f6560e;
                    c3349v.m6855b("AppLovinAdView", "Rendering advertisement ad for #" + C2746b.this.f6570o.getAdIdNumber() + "...");
                }
                C2746b.m9020b(C2746b.this.f6567l, C2746b.this.f6570o.getSize());
                C2746b.this.f6567l.m8974a(C2746b.this.f6570o);
                if (C2746b.this.f6570o.getSize() != AppLovinAdSize.INTERSTITIAL && !C2746b.this.f6577v) {
                    C2746b c2746b = C2746b.this;
                    c2746b.f6564i = new C3123d(c2746b.f6570o, C2746b.this.f6558c);
                    C2746b.this.f6564i.m7751a();
                    C2746b.this.f6567l.setStatsManagerHelper(C2746b.this.f6564i);
                    C2746b.this.f6570o.setHasShown(true);
                }
                if (C2746b.this.f6567l.getStatsManagerHelper() != null) {
                    C2746b.this.f6567l.getStatsManagerHelper().m7750a(C2746b.this.f6570o.m7873z() ? 0L : 1L);
                }
            }
        }
    }

    /* renamed from: com.applovin.impl.adview.b$c */
    /* loaded from: classes.dex */
    public static class C2760c implements AppLovinAdLoadListener {

        /* renamed from: a */
        private final C2746b f6600a;

        public C2760c(C2746b c2746b, C3214m c3214m) {
            if (c2746b == null) {
                throw new IllegalArgumentException("No view specified");
            }
            if (c3214m == null) {
                throw new IllegalArgumentException("No sdk specified");
            }
            this.f6600a = c2746b;
        }

        /* renamed from: a */
        private C2746b m8978a() {
            return this.f6600a;
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            C2746b m8978a = m8978a();
            if (m8978a != null) {
                m8978a.m9017b(appLovinAd);
            } else if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinAdView", "Ad view has been garbage collected by the time an ad was received");
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            C2746b m8978a = m8978a();
            if (m8978a != null) {
                m8978a.m9041a(i);
            }
        }
    }

    /* renamed from: a */
    private void m9036a(AppLovinAdView appLovinAdView, C3214m c3214m, AppLovinAdSize appLovinAdSize, String str, Context context) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (c3214m == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (appLovinAdSize == null) {
            throw new IllegalArgumentException("No ad size specified");
        }
        this.f6558c = c3214m;
        this.f6559d = c3214m.m7391u();
        this.f6560e = c3214m.m7487A();
        this.f6561f = AppLovinCommunicator.getInstance(context);
        this.f6562g = appLovinAdSize;
        this.f6563h = str;
        if (!(context instanceof AppLovinFullscreenActivity)) {
            context = context.getApplicationContext();
        }
        this.f6556a = context;
        this.f6557b = appLovinAdView;
        this.f6565j = new C2768e(this, c3214m);
        this.f6569n = new RunnableC2758a();
        this.f6568m = new RunnableC2759b();
        this.f6566k = new C2760c(this, c3214m);
        m9023a(appLovinAdSize);
    }

    /* renamed from: a */
    private void m9022a(Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static void m9020b(View view, AppLovinAdSize appLovinAdSize) {
        if (view == null) {
            return;
        }
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        String label = appLovinAdSize.getLabel();
        AppLovinAdSize appLovinAdSize2 = AppLovinAdSize.INTERSTITIAL;
        int applyDimension = label.equals(appLovinAdSize2.getLabel()) ? -1 : appLovinAdSize.getWidth() == -1 ? displayMetrics.widthPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getWidth(), displayMetrics);
        int applyDimension2 = appLovinAdSize.getLabel().equals(appLovinAdSize2.getLabel()) ? -1 : appLovinAdSize.getHeight() == -1 ? displayMetrics.heightPixels : (int) TypedValue.applyDimension(1, appLovinAdSize.getHeight(), displayMetrics);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = applyDimension;
        layoutParams.height = applyDimension2;
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(10);
            layoutParams2.addRule(9);
        }
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: t */
    private void m8983t() {
        C3349v c3349v;
        if (C3349v.m6862a() && (c3349v = this.f6560e) != null) {
            c3349v.m6855b("AppLovinAdView", "Destroying...");
        }
        C2762d c2762d = this.f6567l;
        if (c2762d != null) {
            ViewParent parent = c2762d.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f6567l);
            }
            this.f6567l.removeAllViews();
            this.f6567l.loadUrl("about:blank");
            this.f6567l.onPause();
            this.f6567l.destroyDrawingCache();
            this.f6567l.destroy();
            this.f6567l = null;
        }
        this.f6579x = null;
        this.f6580y = null;
        this.f6554A = null;
        this.f6581z = null;
        this.f6577v = true;
    }

    /* renamed from: u */
    private void m8982u() {
        m9022a(new Runnable() { // from class: com.applovin.impl.adview.b.3
            @Override // java.lang.Runnable
            public void run() {
                if (C2746b.this.f6572q != null) {
                    if (C3349v.m6862a()) {
                        C3349v c3349v = C2746b.this.f6560e;
                        c3349v.m6855b("AppLovinAdView", "Detaching expanded ad: " + C2746b.this.f6572q.m8930a());
                    }
                    C2746b c2746b = C2746b.this;
                    c2746b.f6573r = c2746b.f6572q;
                    C2746b.this.f6572q = null;
                    C2746b c2746b2 = C2746b.this;
                    c2746b2.m9023a(c2746b2.f6562g);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void m8981v() {
        m9022a(new Runnable() { // from class: com.applovin.impl.adview.b.10
            @Override // java.lang.Runnable
            public void run() {
                C3075a m8930a;
                if (C2746b.this.f6573r == null && C2746b.this.f6572q == null) {
                    return;
                }
                if (C2746b.this.f6573r != null) {
                    m8930a = C2746b.this.f6573r.m8930a();
                    C2746b.this.f6573r.dismiss();
                    C2746b.this.f6573r = null;
                } else {
                    m8930a = C2746b.this.f6572q.m8930a();
                    C2746b.this.f6572q.dismiss();
                    C2746b.this.f6572q = null;
                }
                C3298j.m6959b(C2746b.this.f6581z, m8930a, (AppLovinAdView) C2746b.this.f6557b);
            }
        });
    }

    /* renamed from: w */
    private void m8980w() {
        C3123d c3123d = this.f6564i;
        if (c3123d != null) {
            c3123d.m7743c();
            this.f6564i = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void m8979x() {
        if (C3349v.m6862a()) {
            AbstractC3080e abstractC3080e = this.f6570o;
            C3333k c3333k = new C3333k();
            c3333k.m6939a().m6935a(abstractC3080e).m6937a(m8986r());
            if (!Utils.isBML(abstractC3080e.getSize())) {
                c3333k.m6939a().m6933a("Fullscreen Ad Properties").m6930b(abstractC3080e);
            }
            c3333k.m6934a(this.f6558c);
            c3333k.m6939a();
            this.f6560e.m6855b("AppLovinAdView", c3333k.toString());
        }
    }

    /* renamed from: a */
    public void m9042a() {
        if (this.f6558c != null && this.f6566k != null && this.f6556a != null && this.f6576u) {
            this.f6559d.loadNextAd(this.f6563h, this.f6562g, this.f6566k);
        } else if (C3349v.m6862a()) {
            C3349v.m6848g("AppLovinAdView", "Unable to load next ad: AppLovinAdView is not initialized.");
        }
    }

    /* renamed from: a */
    public void m9041a(final int i) {
        if (!this.f6577v) {
            m9022a(this.f6569n);
        }
        m9022a(new Runnable() { // from class: com.applovin.impl.adview.b.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (C2746b.this.f6579x != null) {
                        C2746b.this.f6579x.failedToReceiveAd(i);
                    }
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6852c("AppLovinAdView", "Exception while running app load  callback", th);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public void m9040a(final PointF pointF) {
        m9022a(new Runnable() { // from class: com.applovin.impl.adview.b.6
            @Override // java.lang.Runnable
            public void run() {
                if (C2746b.this.f6572q == null && (C2746b.this.f6570o instanceof C3075a) && C2746b.this.f6567l != null) {
                    C3075a c3075a = (C3075a) C2746b.this.f6570o;
                    Activity retrieveParentActivity = C2746b.this.f6556a instanceof Activity ? (Activity) C2746b.this.f6556a : Utils.retrieveParentActivity(C2746b.this.f6567l, C2746b.this.f6558c);
                    if (retrieveParentActivity != null) {
                        if (C2746b.this.f6557b != null) {
                            C2746b.this.f6557b.removeView(C2746b.this.f6567l);
                        }
                        C2746b.this.f6572q = new DialogC2781l(c3075a, C2746b.this.f6567l, retrieveParentActivity, C2746b.this.f6558c);
                        C2746b.this.f6572q.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.adview.b.6.1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public void onDismiss(DialogInterface dialogInterface) {
                                C2746b.this.m9000k();
                            }
                        });
                        C2746b.this.f6572q.show();
                        C3298j.m6988a(C2746b.this.f6581z, C2746b.this.f6570o, (AppLovinAdView) C2746b.this.f6557b);
                        if (C2746b.this.f6564i != null) {
                            C2746b.this.f6564i.m7741d();
                        }
                        if (C2746b.this.f6570o.isOpenMeasurementEnabled()) {
                            C2746b.this.f6570o.mo7884o().m8066a((View) C2746b.this.f6572q.m8926b());
                            return;
                        }
                        return;
                    }
                    if (C3349v.m6862a()) {
                        C3349v.m6846i("AppLovinAdView", "Unable to expand ad. No Activity found.");
                    }
                    Uri mo7886j = c3075a.mo7886j();
                    if (mo7886j != null) {
                        AppLovinAdServiceImpl appLovinAdServiceImpl = C2746b.this.f6559d;
                        AppLovinAdView m8986r = C2746b.this.m8986r();
                        C2746b c2746b = C2746b.this;
                        appLovinAdServiceImpl.trackAndLaunchClick(c3075a, m8986r, c2746b, mo7886j, pointF, c2746b.f6578w);
                        if (C2746b.this.f6564i != null) {
                            C2746b.this.f6564i.m7745b();
                        }
                    }
                    C2746b.this.f6567l.m8972a("javascript:al_onFailedExpand();");
                }
            }
        });
    }

    /* renamed from: a */
    public void m9038a(final WebView webView) {
        m9022a(new Runnable() { // from class: com.applovin.impl.adview.b.4
            @Override // java.lang.Runnable
            public void run() {
                webView.setVisibility(0);
            }
        });
        try {
            if (this.f6570o != this.f6571p) {
                this.f6571p = this.f6570o;
                if (this.f6580y != null) {
                    C3298j.m6967a(this.f6580y, this.f6570o);
                    this.f6567l.m8972a("javascript:al_onAdViewRendered();");
                }
                if ((this.f6570o instanceof C3075a) && this.f6570o.isOpenMeasurementEnabled()) {
                    this.f6558c.m7469S().m7619a(new C3189z(this.f6558c, new Runnable() { // from class: com.applovin.impl.adview.b.5
                        @Override // java.lang.Runnable
                        public void run() {
                            C2746b.this.f6570o.mo7884o().m8061b(webView);
                            C2746b.this.f6570o.mo7884o().m8066a((View) webView);
                            C2746b.this.f6570o.mo7884o().mo8039c();
                            C2746b.this.f6570o.mo7884o().m8060d();
                        }
                    }), C3163o.EnumC3165a.MAIN, 500L);
                }
            }
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v.m6852c("AppLovinAdView", "Exception while notifying ad display listener", th);
            }
        }
    }

    /* renamed from: a */
    public void m9037a(AppLovinAdView appLovinAdView, Context context, AppLovinAdSize appLovinAdSize, String str, AppLovinSdk appLovinSdk, AttributeSet attributeSet) {
        if (appLovinAdView == null) {
            throw new IllegalArgumentException("No parent view specified");
        }
        if (context == null) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinAdView", "Unable to build AppLovinAdView: no context provided. Please use a different constructor for this view.");
                return;
            }
            return;
        }
        if (appLovinAdSize == null && (appLovinAdSize = C3288b.m7047a(attributeSet)) == null) {
            appLovinAdSize = AppLovinAdSize.BANNER;
        }
        AppLovinAdSize appLovinAdSize2 = appLovinAdSize;
        if (appLovinSdk == null) {
            appLovinSdk = AppLovinSdk.getInstance(context);
        }
        if (appLovinSdk != null) {
            m9036a(appLovinAdView, appLovinSdk.coreSdk, appLovinAdSize2, str, context);
            if (C3288b.m7044b(attributeSet)) {
                m9042a();
            }
        }
    }

    /* renamed from: a */
    public void m9035a(AppLovinAdViewEventListener appLovinAdViewEventListener) {
        this.f6581z = appLovinAdViewEventListener;
    }

    /* renamed from: a */
    public void m9031a(InterfaceC2772g interfaceC2772g) {
        this.f6555B = interfaceC2772g;
    }

    /* renamed from: a */
    public void m9030a(AbstractC3080e abstractC3080e, AppLovinAdView appLovinAdView, Uri uri, PointF pointF) {
        if (appLovinAdView != null) {
            this.f6559d.trackAndLaunchClick(abstractC3080e, appLovinAdView, this, uri, pointF, this.f6578w);
        } else if (C3349v.m6862a()) {
            this.f6560e.m6850e("AppLovinAdView", "Unable to process ad click - AppLovinAdView destroyed prematurely");
        }
        C3298j.m6968a(this.f6554A, abstractC3080e);
    }

    /* renamed from: a */
    public void m9029a(C3123d c3123d) {
        C2762d c2762d = this.f6567l;
        if (c2762d != null) {
            c2762d.setStatsManagerHelper(c3123d);
        }
    }

    /* renamed from: a */
    public void m9028a(AppLovinAd appLovinAd) {
        m9027a(appLovinAd, (String) null);
    }

    /* renamed from: a */
    public void m9027a(AppLovinAd appLovinAd, String str) {
        if (appLovinAd == null) {
            throw new IllegalArgumentException("No ad specified");
        }
        Utils.validateAdSdkKey(appLovinAd, this.f6558c);
        if (!this.f6576u) {
            if (C3349v.m6862a()) {
                C3349v.m6848g("AppLovinAdView", "Unable to render ad: AppLovinAdView is not initialized.");
                return;
            }
            return;
        }
        AbstractC3080e abstractC3080e = (AbstractC3080e) Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f6558c);
        if (abstractC3080e == null || abstractC3080e == this.f6570o) {
            if (abstractC3080e == null) {
                if (C3349v.m6862a()) {
                    this.f6560e.m6851d("AppLovinAdView", "Unable to render ad. Ad is null. Internal inconsistency error.");
                    return;
                }
                return;
            }
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f6560e;
                c3349v.m6851d("AppLovinAdView", "Ad #" + abstractC3080e.getAdIdNumber() + " is already showing, ignoring");
            }
            if (((Boolean) this.f6558c.m7456a(C3109b.f7874bZ)).booleanValue()) {
                throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
            }
            return;
        }
        if (C3349v.m6862a()) {
            C3349v c3349v2 = this.f6560e;
            c3349v2.m6855b("AppLovinAdView", "Rendering ad #" + abstractC3080e.getAdIdNumber() + " (" + abstractC3080e.getSize() + ")");
        }
        C3298j.m6955b(this.f6580y, this.f6570o);
        if (abstractC3080e.getSize() != AppLovinAdSize.INTERSTITIAL) {
            m8980w();
        }
        if (this.f6570o != null && this.f6570o.isOpenMeasurementEnabled()) {
            this.f6570o.mo7884o().m8059e();
        }
        this.f6574s.set(null);
        this.f6571p = null;
        this.f6570o = abstractC3080e;
        if (!this.f6577v && Utils.isBML(this.f6562g)) {
            this.f6558c.m7391u().trackImpression(abstractC3080e);
        }
        if (this.f6572q != null) {
            m8982u();
        }
        m9022a(this.f6568m);
    }

    /* renamed from: a */
    public void m9026a(AppLovinAdClickListener appLovinAdClickListener) {
        this.f6554A = appLovinAdClickListener;
    }

    /* renamed from: a */
    public void m9025a(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f6580y = appLovinAdDisplayListener;
    }

    /* renamed from: a */
    public void m9024a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f6579x = appLovinAdLoadListener;
    }

    /* renamed from: a */
    public void m9023a(AppLovinAdSize appLovinAdSize) {
        try {
            C2762d c2762d = new C2762d(this.f6565j, this.f6558c, this.f6556a);
            this.f6567l = c2762d;
            c2762d.setBackgroundColor(0);
            this.f6567l.setWillNotCacheDrawing(false);
            this.f6557b.setBackgroundColor(0);
            this.f6557b.addView(this.f6567l);
            m9020b(this.f6567l, appLovinAdSize);
            if (!this.f6576u) {
                m9022a(this.f6569n);
            }
            m9022a(new Runnable() { // from class: com.applovin.impl.adview.b.1
                @Override // java.lang.Runnable
                public void run() {
                    C2746b.this.f6567l.loadDataWithBaseURL(RemoteSettings.FORWARD_SLASH_STRING, "<html></html>", "text/html", null, "");
                }
            });
            this.f6576u = true;
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v.m6852c("AppLovinAdView", "Failed to initialize AdWebView", th);
            }
            this.f6575t.set(true);
        }
    }

    /* renamed from: b */
    public AppLovinAdSize m9021b() {
        return this.f6562g;
    }

    /* renamed from: b */
    public void m9017b(final AppLovinAd appLovinAd) {
        if (appLovinAd == null) {
            if (C3349v.m6862a()) {
                this.f6560e.m6850e("AppLovinAdView", "No provided when to the view controller");
            }
            m9041a(-1);
            return;
        }
        if (this.f6577v) {
            this.f6574s.set(appLovinAd);
            if (C3349v.m6862a()) {
                this.f6560e.m6855b("AppLovinAdView", "Ad view has paused when an ad was received, ad saved for later");
            }
        } else {
            m9028a(appLovinAd);
        }
        m9022a(new Runnable() { // from class: com.applovin.impl.adview.b.8
            @Override // java.lang.Runnable
            public void run() {
                if (C2746b.this.f6575t.compareAndSet(true, false)) {
                    C2746b c2746b = C2746b.this;
                    c2746b.m9023a(c2746b.f6562g);
                }
                try {
                    if (C2746b.this.f6579x != null) {
                        C2746b.this.f6579x.adReceived(appLovinAd);
                    }
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        C3349v.m6846i("AppLovinAdView", "Exception while running ad load callback: " + th.getMessage());
                    }
                }
            }
        });
    }

    /* renamed from: c */
    public String m9016c() {
        return this.f6563h;
    }

    /* renamed from: d */
    public void m9014d() {
        if (!this.f6576u || this.f6577v) {
            return;
        }
        this.f6577v = true;
    }

    /* renamed from: e */
    public void m9012e() {
        if (this.f6576u) {
            AppLovinAd andSet = this.f6574s.getAndSet(null);
            if (andSet != null) {
                m9028a(andSet);
            }
            this.f6577v = false;
        }
    }

    /* renamed from: f */
    public void m9010f() {
        if (this.f6567l != null && this.f6572q != null) {
            m9000k();
        }
        m8983t();
    }

    /* renamed from: g */
    public AppLovinAdViewEventListener m9008g() {
        return this.f6581z;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "b";
    }

    @Nullable
    /* renamed from: h */
    public InterfaceC2772g m9006h() {
        return this.f6555B;
    }

    /* renamed from: i */
    public void m9004i() {
        if (C3288b.m7046a(this.f6567l)) {
            this.f6558c.m7468T().m7719a(C3125f.f8173m);
        }
    }

    /* renamed from: j */
    public void m9002j() {
        if (this.f6576u) {
            C3298j.m6955b(this.f6580y, this.f6570o);
            if (this.f6570o != null && this.f6570o.isOpenMeasurementEnabled() && Utils.isBML(this.f6570o.getSize())) {
                this.f6570o.mo7884o().m8059e();
            }
            if (this.f6567l == null || this.f6572q == null) {
                if (C3349v.m6862a()) {
                    this.f6560e.m6855b("AppLovinAdView", "onDetachedFromWindowCalled without an expanded ad present");
                    return;
                }
                return;
            }
            if (C3349v.m6862a()) {
                this.f6560e.m6855b("AppLovinAdView", "onDetachedFromWindowCalled with expanded ad present");
            }
            m8982u();
        }
    }

    /* renamed from: k */
    public void m9000k() {
        m9022a(new Runnable() { // from class: com.applovin.impl.adview.b.7
            @Override // java.lang.Runnable
            public void run() {
                C2746b.this.m8981v();
                if (C2746b.this.f6557b == null || C2746b.this.f6567l == null || C2746b.this.f6567l.getParent() != null) {
                    return;
                }
                C2746b.this.f6557b.addView(C2746b.this.f6567l);
                C2746b.m9020b(C2746b.this.f6567l, C2746b.this.f6570o.getSize());
                if (C2746b.this.f6570o.isOpenMeasurementEnabled()) {
                    C2746b.this.f6570o.mo7884o().m8066a((View) C2746b.this.f6567l);
                }
            }
        });
    }

    /* renamed from: l */
    public void m8998l() {
        if (this.f6572q != null || this.f6573r != null) {
            m9000k();
            return;
        }
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6560e;
            c3349v.m6855b("AppLovinAdView", "Ad: " + this.f6570o + " closed.");
        }
        m9022a(this.f6569n);
        C3298j.m6955b(this.f6580y, this.f6570o);
        this.f6570o = null;
    }

    /* renamed from: m */
    public void m8996m() {
        this.f6578w = true;
    }

    /* renamed from: n */
    public void m8994n() {
        this.f6578w = false;
    }

    /* renamed from: o */
    public void m8992o() {
        if (!(this.f6556a instanceof InterfaceC2780k) || this.f6570o == null) {
            return;
        }
        if (this.f6570o.m7969F() == AbstractC3080e.EnumC3082a.DISMISS) {
            ((InterfaceC2780k) this.f6556a).dismiss();
        }
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("crash_applovin_ad_webview".equals(appLovinCommunicatorMessage.getTopic())) {
            m9022a(new Runnable() { // from class: com.applovin.impl.adview.b.2
                @Override // java.lang.Runnable
                public void run() {
                    C2746b.this.m8984s().loadUrl("chrome://crash");
                }
            });
        }
    }

    /* renamed from: p */
    public AbstractC3080e m8990p() {
        return this.f6570o;
    }

    /* renamed from: q */
    public C3214m m8988q() {
        return this.f6558c;
    }

    /* renamed from: r */
    public AppLovinAdView m8986r() {
        return (AppLovinAdView) this.f6557b;
    }

    /* renamed from: s */
    public C2762d m8984s() {
        return this.f6567l;
    }
}
