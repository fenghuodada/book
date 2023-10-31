package com.applovin.impl.adview.activity.p010b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.p000v4.media.session.C0017a;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.Nullable;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.AbstractC2774i;
import com.applovin.impl.adview.C2762d;
import com.applovin.impl.adview.C2789m;
import com.applovin.impl.adview.C2790n;
import com.applovin.impl.adview.activity.C2687b;
import com.applovin.impl.p008a.C2649a;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.C3195h;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p030b.C3097b;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p032d.C3123d;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.p033e.C3182v;
import com.applovin.impl.sdk.p033e.C3189z;
import com.applovin.impl.sdk.utils.AbstractC3287a;
import com.applovin.impl.sdk.utils.AppKilledService;
import com.applovin.impl.sdk.utils.C3298j;
import com.applovin.impl.sdk.utils.C3337o;
import com.applovin.impl.sdk.utils.C3340q;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.adview.activity.b.a */
/* loaded from: classes.dex */
public abstract class AbstractC2688a implements C3097b.InterfaceC3104a {

    /* renamed from: a */
    protected final AbstractC3080e f6405a;

    /* renamed from: b */
    protected final C3214m f6406b;

    /* renamed from: c */
    protected final C3349v f6407c;

    /* renamed from: d */
    protected final C3123d f6408d;

    /* renamed from: e */
    protected Activity f6409e;

    /* renamed from: f */
    protected AppLovinAdView f6410f;
    @Nullable

    /* renamed from: g */
    protected final C2789m f6411g;

    /* renamed from: m */
    protected boolean f6417m;

    /* renamed from: n */
    protected AppLovinAdClickListener f6418n;

    /* renamed from: o */
    protected AppLovinAdDisplayListener f6419o;

    /* renamed from: p */
    protected AppLovinAdVideoPlaybackListener f6420p;

    /* renamed from: q */
    protected final C3097b f6421q;
    @Nullable

    /* renamed from: r */
    protected C3337o f6422r;
    @Nullable

    /* renamed from: t */
    private final AbstractC3287a f6424t;
    @Nullable

    /* renamed from: u */
    private final AppLovinBroadcastManager.Receiver f6425u;
    @Nullable

    /* renamed from: v */
    private final C3195h.InterfaceC3197a f6426v;

    /* renamed from: y */
    private long f6429y;

    /* renamed from: z */
    private boolean f6430z;

    /* renamed from: s */
    private final Handler f6423s = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    protected final long f6412h = SystemClock.elapsedRealtime();

    /* renamed from: w */
    private final AtomicBoolean f6427w = new AtomicBoolean();

    /* renamed from: x */
    private final AtomicBoolean f6428x = new AtomicBoolean();

    /* renamed from: i */
    protected long f6413i = -1;

    /* renamed from: A */
    private int f6403A = 0;

    /* renamed from: B */
    private final ArrayList<Long> f6404B = new ArrayList<>();

    /* renamed from: j */
    protected int f6414j = 0;

    /* renamed from: k */
    protected int f6415k = 0;

    /* renamed from: l */
    protected int f6416l = C3195h.f8328a;

    /* renamed from: com.applovin.impl.adview.activity.b.a$7 */
    /* loaded from: classes.dex */
    public class RunnableC26967 implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C2789m f6441a;

        /* renamed from: b */
        final /* synthetic */ Runnable f6442b;

        public RunnableC26967(C2789m c2789m, Runnable runnable) {
            this.f6441a = c2789m;
            this.f6442b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.7.1
                @Override // java.lang.Runnable
                public void run() {
                    C3340q.m6887a(RunnableC26967.this.f6441a, 400L, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.7.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            RunnableC26967.this.f6441a.bringToFront();
                            RunnableC26967.this.f6442b.run();
                        }
                    });
                }
            });
        }
    }

    /* renamed from: com.applovin.impl.adview.activity.b.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2700a {
        /* renamed from: a */
        void mo8889a(AbstractC2688a abstractC2688a);

        /* renamed from: a */
        void mo8888a(String str, Throwable th);
    }

    /* renamed from: com.applovin.impl.adview.activity.b.a$b */
    /* loaded from: classes.dex */
    public class View$OnClickListenerC2701b implements View.OnClickListener, AppLovinAdClickListener {
        private View$OnClickListenerC2701b() {
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            if (C3349v.m6862a()) {
                AbstractC2688a.this.f6407c.m6855b("AppLovinFullscreenActivity", "Clicking through graphic");
            }
            C3298j.m6968a(AbstractC2688a.this.f6418n, appLovinAd);
            AbstractC2688a.this.f6408d.m7745b();
            AbstractC2688a.this.f6415k++;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            AbstractC2688a abstractC2688a = AbstractC2688a.this;
            if (view != abstractC2688a.f6411g || !((Boolean) abstractC2688a.f6406b.m7456a(C3109b.f7940cn)).booleanValue()) {
                if (C3349v.m6862a()) {
                    C3349v c3349v = AbstractC2688a.this.f6407c;
                    c3349v.m6850e("AppLovinFullscreenActivity", "Unhandled click on widget: " + view);
                    return;
                }
                return;
            }
            AbstractC2688a.m9141c(AbstractC2688a.this);
            if (AbstractC2688a.this.f6405a.m7953V()) {
                AbstractC2688a abstractC2688a2 = AbstractC2688a.this;
                abstractC2688a2.m9144b("javascript:al_onCloseButtonTapped(" + AbstractC2688a.this.f6403A + "," + AbstractC2688a.this.f6414j + "," + AbstractC2688a.this.f6415k + ");");
            }
            List<Integer> m7879t = AbstractC2688a.this.f6405a.m7879t();
            if (C3349v.m6862a()) {
                C3349v c3349v2 = AbstractC2688a.this.f6407c;
                c3349v2.m6855b("AppLovinFullscreenActivity", "Handling close button tap " + AbstractC2688a.this.f6403A + " with multi close delay: " + m7879t);
            }
            if (m7879t == null || m7879t.size() <= AbstractC2688a.this.f6403A) {
                AbstractC2688a.this.mo9052h();
                return;
            }
            AbstractC2688a.this.f6404B.add(Long.valueOf(SystemClock.elapsedRealtime() - AbstractC2688a.this.f6413i));
            List<AbstractC2774i.EnumC2775a> m7877v = AbstractC2688a.this.f6405a.m7877v();
            if (m7877v != null && m7877v.size() > AbstractC2688a.this.f6403A) {
                AbstractC2688a abstractC2688a3 = AbstractC2688a.this;
                abstractC2688a3.f6411g.m8916a(m7877v.get(abstractC2688a3.f6403A));
            }
            if (C3349v.m6862a()) {
                C3349v c3349v3 = AbstractC2688a.this.f6407c;
                c3349v3.m6855b("AppLovinFullscreenActivity", "Scheduling next close button with delay: " + m7879t.get(AbstractC2688a.this.f6403A));
            }
            AbstractC2688a.this.f6411g.setVisibility(8);
            AbstractC2688a abstractC2688a4 = AbstractC2688a.this;
            abstractC2688a4.m9153a(abstractC2688a4.f6411g, m7879t.get(abstractC2688a4.f6403A).intValue(), new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.b.1
                @Override // java.lang.Runnable
                public void run() {
                    AbstractC2688a.this.f6413i = SystemClock.elapsedRealtime();
                }
            });
        }
    }

    public AbstractC2688a(final AbstractC3080e abstractC3080e, Activity activity, final C3214m c3214m, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f6405a = abstractC3080e;
        this.f6406b = c3214m;
        this.f6407c = c3214m.m7487A();
        this.f6409e = activity;
        this.f6418n = appLovinAdClickListener;
        this.f6419o = appLovinAdDisplayListener;
        this.f6420p = appLovinAdVideoPlaybackListener;
        C3097b c3097b = new C3097b(activity, c3214m);
        this.f6421q = c3097b;
        c3097b.m7834a(this);
        C3123d c3123d = new C3123d(abstractC3080e, c3214m);
        this.f6408d = c3123d;
        View$OnClickListenerC2701b view$OnClickListenerC2701b = new View$OnClickListenerC2701b();
        C2790n c2790n = new C2790n(c3214m.m7463Y(), AppLovinAdSize.INTERSTITIAL, activity);
        this.f6410f = c2790n;
        c2790n.setAdClickListener(view$OnClickListenerC2701b);
        this.f6410f.setAdDisplayListener(new AppLovinAdDisplayListener() { // from class: com.applovin.impl.adview.activity.b.a.1
            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adDisplayed(AppLovinAd appLovinAd) {
                if (C3349v.m6862a()) {
                    AbstractC2688a.this.f6407c.m6855b("AppLovinFullscreenActivity", "Web content rendered");
                }
            }

            @Override // com.applovin.sdk.AppLovinAdDisplayListener
            public void adHidden(AppLovinAd appLovinAd) {
                if (C3349v.m6862a()) {
                    AbstractC2688a.this.f6407c.m6855b("AppLovinFullscreenActivity", "Closing from WebView");
                }
                AbstractC2688a.this.mo9052h();
            }
        });
        this.f6410f.getController().m9029a(c3123d);
        c3214m.m7391u().trackImpression(abstractC3080e);
        List<Integer> m7879t = abstractC3080e.m7879t();
        if (abstractC3080e.m7880s() >= 0 || m7879t != null) {
            C2789m c2789m = new C2789m(abstractC3080e.m7878u(), activity);
            this.f6411g = c2789m;
            c2789m.setVisibility(8);
            c2789m.setOnClickListener(view$OnClickListenerC2701b);
        } else {
            this.f6411g = null;
        }
        if (((Boolean) c3214m.m7456a(C3109b.f7942cp)).booleanValue()) {
            this.f6425u = new AppLovinBroadcastManager.Receiver() { // from class: com.applovin.impl.adview.activity.b.a.2
                @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
                public void onReceive(Context context, Intent intent, @Nullable Map<String, Object> map) {
                    c3214m.m7391u().trackAppKilled(abstractC3080e);
                    c3214m.m7430aj().unregisterReceiver(this);
                }
            };
        } else {
            this.f6425u = null;
        }
        if (abstractC3080e.m7918al()) {
            this.f6426v = new C3195h.InterfaceC3197a() { // from class: com.applovin.impl.adview.activity.b.a.3
                @Override // com.applovin.impl.sdk.C3195h.InterfaceC3197a
                /* renamed from: a */
                public void mo7537a(int i) {
                    String str;
                    AbstractC2688a abstractC2688a = AbstractC2688a.this;
                    if (abstractC2688a.f6416l != C3195h.f8328a) {
                        abstractC2688a.f6417m = true;
                    }
                    C2762d m8984s = abstractC2688a.f6410f.getController().m8984s();
                    if (!C3195h.m7543a(i) || C3195h.m7543a(AbstractC2688a.this.f6416l)) {
                        str = i == 2 ? "javascript:al_muteSwitchOff();" : "javascript:al_muteSwitchOff();";
                        AbstractC2688a.this.f6416l = i;
                    }
                    str = "javascript:al_muteSwitchOn();";
                    m8984s.m8972a(str);
                    AbstractC2688a.this.f6416l = i;
                }
            };
        } else {
            this.f6426v = null;
        }
        if (((Boolean) c3214m.m7456a(C3109b.f8007eC)).booleanValue()) {
            this.f6424t = new AbstractC3287a() { // from class: com.applovin.impl.adview.activity.b.a.4
                @Override // com.applovin.impl.sdk.utils.AbstractC3287a, android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity2, Bundle bundle) {
                    if (AbstractC2688a.this.f6428x.get()) {
                        return;
                    }
                    if (activity2.getClass().getName().equals(Utils.retrieveLauncherActivityFullyQualifiedName(activity2.getApplicationContext()))) {
                        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.4.1
                            @Override // java.lang.Runnable
                            public void run() {
                                C3349v.m6846i("AppLovinFullscreenActivity", "Dismissing on-screen ad due to app relaunched via launcher.");
                                try {
                                    AbstractC2688a.this.mo9052h();
                                } catch (Throwable th) {
                                    C3349v.m6852c("AppLovinFullscreenActivity", "Failed to dismiss ad.", th);
                                    try {
                                        AbstractC2688a.this.m9135n();
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        });
                    }
                }
            };
        } else {
            this.f6424t = null;
        }
    }

    /* renamed from: a */
    public static void m9152a(AbstractC3080e abstractC3080e, AppLovinAdClickListener appLovinAdClickListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, C3214m c3214m, Activity activity, InterfaceC2700a interfaceC2700a) {
        AbstractC2688a c2703b;
        boolean z = abstractC3080e.m7934aH() && Utils.checkExoPlayerEligibility(c3214m);
        if (abstractC3080e instanceof C2649a) {
            if (z) {
                try {
                    c2703b = new C2707c(abstractC3080e, activity, c3214m, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        c3214m.m7487A().m6857a("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th);
                    }
                    Utils.isExoPlayerEligible = Boolean.FALSE;
                    try {
                        c2703b = new C2709d(abstractC3080e, activity, c3214m, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                    } catch (Throwable th2) {
                        interfaceC2700a.mo8888a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + c3214m + " and throwable: " + th2.getMessage(), th2);
                        return;
                    }
                }
            } else {
                try {
                    c2703b = new C2709d(abstractC3080e, activity, c3214m, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th3) {
                    interfaceC2700a.mo8888a("Failed to create FullscreenVastVideoAdPresenter with sdk: " + c3214m + " and throwable: " + th3.getMessage(), th3);
                    return;
                }
            }
        } else if (!abstractC3080e.hasVideoUrl()) {
            try {
                c2703b = new C2703b(abstractC3080e, activity, c3214m, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th4) {
                interfaceC2700a.mo8888a("Failed to create FullscreenGraphicAdPresenter with sdk: " + c3214m + " and throwable: " + th4.getMessage(), th4);
                return;
            }
        } else if (abstractC3080e.m7931aK()) {
            try {
                c2703b = new C2739g(abstractC3080e, activity, c3214m, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th5) {
                interfaceC2700a.mo8888a("Failed to create FullscreenWebVideoAdPresenter with sdk: " + c3214m + " and throwable: " + th5.getMessage(), th5);
                return;
            }
        } else if (z) {
            try {
                c2703b = new C2711e(abstractC3080e, activity, c3214m, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th6) {
                if (C3349v.m6862a()) {
                    c3214m.m7487A().m6857a("AppLovinFullscreenActivity", "Failed to create ExoPlayer presenter to show the ad. Falling back to using native media player presenter.", th6);
                }
                Utils.isExoPlayerEligible = Boolean.FALSE;
                try {
                    c2703b = new C2724f(abstractC3080e, activity, c3214m, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
                } catch (Throwable th7) {
                    interfaceC2700a.mo8888a("Failed to create FullscreenVideoAdExoPlayerPresenter with sdk: " + c3214m + " and throwable: " + th7.getMessage(), th7);
                    return;
                }
            }
        } else {
            try {
                c2703b = new C2724f(abstractC3080e, activity, c3214m, appLovinAdClickListener, appLovinAdDisplayListener, appLovinAdVideoPlaybackListener);
            } catch (Throwable th8) {
                interfaceC2700a.mo8888a("Failed to create FullscreenVideoAdPresenter with sdk: " + c3214m + " and throwable: " + th8.getMessage(), th8);
                return;
            }
        }
        c2703b.m9142c();
        interfaceC2700a.mo8889a(c2703b);
    }

    /* renamed from: c */
    public static /* synthetic */ int m9141c(AbstractC2688a abstractC2688a) {
        int i = abstractC2688a.f6403A;
        abstractC2688a.f6403A = i + 1;
        return i;
    }

    /* renamed from: c */
    private void m9142c() {
        if (this.f6425u != null) {
            this.f6406b.m7430aj().registerReceiver(this.f6425u, new IntentFilter(AppKilledService.ACTION_APP_KILLED));
        }
        if (this.f6426v != null) {
            this.f6406b.m7431ai().m7542a(this.f6426v);
        }
        if (this.f6424t != null) {
            this.f6406b.m7434af().m8069a(this.f6424t);
        }
    }

    /* renamed from: a */
    public void m9157a(int i, KeyEvent keyEvent) {
        if (this.f6407c == null || !C3349v.m6862a()) {
            return;
        }
        C3349v c3349v = this.f6407c;
        c3349v.m6853c("AppLovinFullscreenActivity", "onKeyDown(int, KeyEvent) -  " + i + ", " + keyEvent);
    }

    /* renamed from: a */
    public void m9156a(int i, boolean z, boolean z2, long j) {
        if (this.f6427w.compareAndSet(false, true)) {
            if (this.f6405a.hasVideoUrl() || m9131t()) {
                C3298j.m6962a(this.f6420p, this.f6405a, i, z2);
            }
            if (this.f6405a.hasVideoUrl()) {
                this.f6408d.m7742c(i);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f6412h;
            this.f6406b.m7391u().trackVideoEnd(this.f6405a, TimeUnit.MILLISECONDS.toSeconds(elapsedRealtime), i, z);
            long j2 = -1;
            if (this.f6413i != -1) {
                j2 = SystemClock.elapsedRealtime() - this.f6413i;
            }
            this.f6406b.m7391u().trackFullScreenAdClosed(this.f6405a, j2, this.f6404B, j, this.f6417m, this.f6416l);
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f6407c;
                StringBuilder sb = new StringBuilder("Video ad ended at percent: ");
                sb.append(i);
                sb.append("%, elapsedTime: ");
                sb.append(elapsedRealtime);
                sb.append("ms, skipTimeMillis: ");
                sb.append(j);
                sb.append("ms, closeTimeMillis: ");
                c3349v.m6855b("AppLovinFullscreenActivity", C0017a.m13071a(sb, j2, "ms"));
            }
        }
    }

    /* renamed from: a */
    public abstract void mo9063a(long j);

    /* renamed from: a */
    public void m9155a(Configuration configuration) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6407c;
            c3349v.m6853c("AppLovinFullscreenActivity", "onConfigurationChanged(Configuration) -  " + configuration);
        }
    }

    /* renamed from: a */
    public abstract void mo9062a(@Nullable ViewGroup viewGroup);

    /* renamed from: a */
    public void m9153a(C2789m c2789m, long j, Runnable runnable) {
        if (j >= ((Long) this.f6406b.m7456a(C3109b.f7939cm)).longValue()) {
            return;
        }
        this.f6406b.m7469S().m7618a(new C3189z(this.f6406b, new RunnableC26967(c2789m, runnable)), C3163o.EnumC3165a.MAIN, TimeUnit.SECONDS.toMillis(j), true);
    }

    /* renamed from: a */
    public void m9151a(Runnable runnable, long j) {
        AppLovinSdkUtils.runOnUiThreadDelayed(runnable, j, this.f6423s);
    }

    /* renamed from: a */
    public void m9150a(String str) {
        if (this.f6405a.m7952W()) {
            m9149a(str, 0L);
        }
    }

    /* renamed from: a */
    public void m9149a(final String str, long j) {
        if (j >= 0) {
            m9151a(new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.6
                @Override // java.lang.Runnable
                public void run() {
                    AppLovinAdView appLovinAdView;
                    C2762d m8984s;
                    if (!StringUtils.isValidString(str) || (appLovinAdView = AbstractC2688a.this.f6410f) == null || (m8984s = appLovinAdView.getController().m8984s()) == null) {
                        return;
                    }
                    m8984s.m8972a(str);
                }
            }, j);
        }
    }

    /* renamed from: a */
    public void m9148a(boolean z) {
        List<Uri> checkCachedResourcesExist = Utils.checkCachedResourcesExist(z, this.f6405a, this.f6406b, this.f6409e);
        if (checkCachedResourcesExist.isEmpty()) {
            return;
        }
        if (!((Boolean) this.f6406b.m7456a(C3109b.f8011eG)).booleanValue()) {
            this.f6405a.mo7948a();
            return;
        }
        throw new IllegalStateException("Missing cached resource(s): " + checkCachedResourcesExist);
    }

    /* renamed from: a */
    public void m9147a(boolean z, long j) {
        if (this.f6405a.m7954U()) {
            m9149a(z ? "javascript:al_mute();" : "javascript:al_unmute();", j);
        }
    }

    /* renamed from: b */
    public void m9146b(long j) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6407c;
            c3349v.m6855b("AppLovinFullscreenActivity", "Scheduling report reward in " + TimeUnit.MILLISECONDS.toSeconds(j) + " seconds...");
        }
        this.f6422r = C3337o.m6906a(j, this.f6406b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.8
            @Override // java.lang.Runnable
            public void run() {
                if (AbstractC2688a.this.f6405a.m7923ag().getAndSet(true)) {
                    return;
                }
                AbstractC2688a abstractC2688a = AbstractC2688a.this;
                AbstractC2688a.this.f6406b.m7469S().m7620a(new C3182v(abstractC2688a.f6405a, abstractC2688a.f6406b), C3163o.EnumC3165a.REWARD);
            }
        });
    }

    /* renamed from: b */
    public void m9144b(String str) {
        m9149a(str, 0L);
    }

    /* renamed from: b */
    public void m9143b(boolean z) {
        m9147a(z, ((Long) this.f6406b.m7456a(C3109b.f7903cC)).longValue());
        C3298j.m6967a(this.f6419o, this.f6405a);
        this.f6406b.m7435ae().m7070a(this.f6405a);
        this.f6406b.m7429ak().m7376a(this.f6405a);
        if (this.f6405a.hasVideoUrl() || m9131t()) {
            C3298j.m6963a(this.f6420p, this.f6405a);
        }
        new C2687b(this.f6409e).m9158a(this.f6405a);
        this.f6408d.m7751a();
        this.f6405a.setHasShown(true);
    }

    /* renamed from: c */
    public void mo9073c(boolean z) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6407c;
            c3349v.m6853c("AppLovinFullscreenActivity", "onWindowFocusChanged(boolean) - " + z);
        }
        m9150a("javascript:al_onWindowFocusChanged( " + z + " );");
    }

    /* renamed from: d */
    public abstract void mo9055d();

    /* renamed from: e */
    public abstract void mo9053e();

    /* renamed from: f */
    public void mo9108f() {
        if (C3349v.m6862a()) {
            this.f6407c.m6853c("AppLovinFullscreenActivity", "onResume()");
        }
        this.f6408d.m7740d(SystemClock.elapsedRealtime() - this.f6429y);
        m9150a("javascript:al_onAppResumed();");
        m9132q();
        if (this.f6421q.m7829c()) {
            this.f6421q.m7836a();
        }
    }

    /* renamed from: g */
    public void mo9107g() {
        if (C3349v.m6862a()) {
            this.f6407c.m6853c("AppLovinFullscreenActivity", "onPause()");
        }
        this.f6429y = SystemClock.elapsedRealtime();
        m9150a("javascript:al_onAppPaused();");
        if (this.f6421q.m7829c()) {
            this.f6421q.m7836a();
        }
        m9133p();
    }

    /* renamed from: h */
    public void mo9052h() {
        this.f6430z = true;
        if (C3349v.m6862a()) {
            this.f6407c.m6853c("AppLovinFullscreenActivity", "dismiss()");
        }
        AbstractC3080e abstractC3080e = this.f6405a;
        if (abstractC3080e != null) {
            abstractC3080e.mo7884o().m8059e();
        }
        this.f6423s.removeCallbacksAndMessages(null);
        m9149a("javascript:al_onPoststitialDismiss();", this.f6405a.m7955T());
        m9135n();
        this.f6408d.m7743c();
        if (this.f6425u != null) {
            C3337o.m6906a(TimeUnit.SECONDS.toMillis(2L), this.f6406b, new Runnable() { // from class: com.applovin.impl.adview.activity.b.a.5
                @Override // java.lang.Runnable
                public void run() {
                    AbstractC2688a.this.f6409e.stopService(new Intent(AbstractC2688a.this.f6409e.getApplicationContext(), AppKilledService.class));
                    AbstractC2688a.this.f6406b.m7430aj().unregisterReceiver(AbstractC2688a.this.f6425u);
                }
            });
        }
        if (this.f6426v != null) {
            this.f6406b.m7431ai().m7539b(this.f6426v);
        }
        if (this.f6424t != null) {
            this.f6406b.m7434af().m8067b(this.f6424t);
        }
        if (m9134o()) {
            this.f6409e.finish();
            return;
        }
        if (C3349v.m6862a()) {
            this.f6406b.m7487A().m6855b("AppLovinFullscreenActivity", "Fullscreen ad shown in container view dismissed, destroying the presenter.");
        }
        mo9069k();
    }

    /* renamed from: i */
    public boolean m9138i() {
        return this.f6430z;
    }

    /* renamed from: j */
    public void m9137j() {
        if (C3349v.m6862a()) {
            this.f6407c.m6853c("AppLovinFullscreenActivity", "onStop()");
        }
    }

    /* renamed from: k */
    public void mo9069k() {
        AppLovinAdView appLovinAdView = this.f6410f;
        if (appLovinAdView != null) {
            ViewParent parent = appLovinAdView.getParent();
            this.f6410f.destroy();
            this.f6410f = null;
            if ((parent instanceof ViewGroup) && m9134o()) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        mo9051m();
        m9135n();
        this.f6418n = null;
        this.f6419o = null;
        this.f6420p = null;
        this.f6409e = null;
    }

    /* renamed from: l */
    public void m9136l() {
        if (C3349v.m6862a()) {
            this.f6407c.m6853c("AppLovinFullscreenActivity", "onBackPressed()");
        }
        if (this.f6405a.m7953V()) {
            m9144b("javascript:onBackPressed();");
        }
    }

    /* renamed from: m */
    public abstract void mo9051m();

    /* renamed from: n */
    public void m9135n() {
        if (this.f6428x.compareAndSet(false, true)) {
            C3298j.m6955b(this.f6419o, this.f6405a);
            this.f6406b.m7435ae().m7066b(this.f6405a);
            this.f6406b.m7429ak().m7384a();
        }
    }

    /* renamed from: o */
    public boolean m9134o() {
        return this.f6409e instanceof AppLovinFullscreenActivity;
    }

    /* renamed from: p */
    public void m9133p() {
        C3337o c3337o = this.f6422r;
        if (c3337o != null) {
            c3337o.m6903b();
        }
    }

    /* renamed from: q */
    public void m9132q() {
        C3337o c3337o = this.f6422r;
        if (c3337o != null) {
            c3337o.m6901c();
        }
    }

    /* renamed from: r */
    public abstract boolean mo9050r();

    /* renamed from: s */
    public abstract boolean mo9049s();

    /* renamed from: t */
    public boolean m9131t() {
        return AppLovinAdType.INCENTIVIZED == this.f6405a.getType() || AppLovinAdType.AUTO_INCENTIVIZED == this.f6405a.getType();
    }

    /* renamed from: u */
    public abstract void mo9048u();
}
