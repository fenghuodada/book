package com.unity3d.services.banners;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.properties.C9448a;
import com.unity3d.services.banners.view.EnumC9449a;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.misc.C9565k;
import com.unity3d.services.core.properties.C9568a;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class UnityBanners {

    /* renamed from: a */
    private static UnityBanners f18495a;

    /* renamed from: b */
    private IUnityBannerListener f18496b;

    /* renamed from: c */
    private EnumC9449a f18497c = EnumC9449a.NONE;

    /* renamed from: d */
    private C9442d f18498d;

    /* renamed from: com.unity3d.services.banners.UnityBanners$a */
    /* loaded from: classes3.dex */
    public class C9435a extends BannerView.Listener {

        /* renamed from: a */
        final /* synthetic */ UnityBanners f18499a;

        /* renamed from: b */
        final /* synthetic */ C9442d f18500b;

        public C9435a(UnityBanners unityBanners, C9442d c9442d) {
            this.f18499a = unityBanners;
            this.f18500b = c9442d;
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public void onBannerClick(BannerView bannerView) {
            if (this.f18499a.f18496b != null) {
                this.f18499a.f18496b.onUnityBannerClick(bannerView.getPlacementId());
            }
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
            if (this.f18499a.f18496b != null) {
                IUnityBannerListener iUnityBannerListener = this.f18499a.f18496b;
                iUnityBannerListener.onUnityBannerError(bannerView.getPlacementId() + " " + bannerErrorInfo.errorMessage);
            }
        }

        @Override // com.unity3d.services.banners.BannerView.Listener, com.unity3d.services.banners.BannerView.IListener
        public void onBannerLoaded(BannerView bannerView) {
            if (this.f18499a.f18496b != null) {
                this.f18499a.f18496b.onUnityBannerLoaded(bannerView.getPlacementId(), this.f18500b);
            }
        }
    }

    /* renamed from: com.unity3d.services.banners.UnityBanners$b */
    /* loaded from: classes3.dex */
    public static class RunnableC9436b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f18502a;

        public RunnableC9436b(String str) {
            this.f18502a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IUnityBannerListener bannerListener = UnityBanners.getBannerListener();
            if (bannerListener != null) {
                bannerListener.onUnityBannerError(this.f18502a);
            }
        }
    }

    /* renamed from: com.unity3d.services.banners.UnityBanners$c */
    /* loaded from: classes3.dex */
    public class C9437c extends RelativeLayout {

        /* renamed from: a */
        private String f18503a;

        /* renamed from: b */
        private boolean f18504b;

        /* renamed from: c */
        private long f18505c;

        /* renamed from: d */
        private BannerView f18506d;

        /* renamed from: e */
        private boolean f18507e;

        /* renamed from: f */
        private boolean f18508f;

        /* renamed from: g */
        private C9441d f18509g;

        /* renamed from: h */
        private Handler f18510h;

        /* renamed from: i */
        private Runnable f18511i;

        /* renamed from: j */
        private long f18512j;

        /* renamed from: com.unity3d.services.banners.UnityBanners$c$a */
        /* loaded from: classes3.dex */
        public class RunnableC9438a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ UnityBanners f18514a;

            /* renamed from: b */
            final /* synthetic */ C9437c f18515b;

            public RunnableC9438a(UnityBanners unityBanners, C9437c c9437c) {
                this.f18514a = unityBanners;
                this.f18515b = c9437c;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18515b.m2294c();
            }
        }

        /* renamed from: com.unity3d.services.banners.UnityBanners$c$b */
        /* loaded from: classes3.dex */
        public class RunnableC9439b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C9437c f18517a;

            public RunnableC9439b(C9437c c9437c) {
                this.f18517a = c9437c;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18517a.removeAllViews();
            }
        }

        /* renamed from: com.unity3d.services.banners.UnityBanners$c$c */
        /* loaded from: classes3.dex */
        public class C9440c extends C9441d {

            /* renamed from: b */
            final /* synthetic */ C9437c f18519b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9440c(C9437c c9437c) {
                super(C9437c.this, null);
                this.f18519b = c9437c;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                this.f18519b.m2290f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                this.f18519b.m2290f();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                this.f18519b.m2291e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                this.f18519b.m2290f();
            }
        }

        @TargetApi(14)
        /* renamed from: com.unity3d.services.banners.UnityBanners$c$d */
        /* loaded from: classes3.dex */
        public class C9441d implements Application.ActivityLifecycleCallbacks {
            private C9441d() {
            }

            public /* synthetic */ C9441d(C9437c c9437c, C9435a c9435a) {
                this();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
            }
        }

        public C9437c(Activity activity, String str, UnityBannerSize unityBannerSize) {
            super(activity);
            this.f18504b = false;
            this.f18505c = 30L;
            this.f18507e = false;
            this.f18508f = false;
            this.f18503a = str;
            this.f18510h = new Handler();
            this.f18511i = new RunnableC9438a(UnityBanners.this, this);
            m2292d();
            setBackgroundColor(0);
            BannerView bannerView = new BannerView(activity, str, unityBannerSize);
            this.f18506d = bannerView;
            addView(bannerView);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public void m2294c() {
            this.f18506d.load();
            long millis = TimeUnit.SECONDS.toMillis(this.f18505c) + SystemClock.uptimeMillis();
            this.f18512j = millis;
            this.f18510h.postAtTime(this.f18511i, millis);
        }

        /* renamed from: d */
        private void m2292d() {
            setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public void m2291e() {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.f18512j;
            if (uptimeMillis < j) {
                this.f18510h.postAtTime(this.f18511i, j);
            } else {
                m2294c();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public void m2290f() {
            Runnable runnable;
            Handler handler = this.f18510h;
            if (handler == null || (runnable = this.f18511i) == null) {
                return;
            }
            handler.removeCallbacks(runnable);
        }

        /* renamed from: g */
        private void m2289g() {
            if (this.f18508f || C9568a.m1960d() == null) {
                return;
            }
            this.f18509g = new C9440c(this);
            this.f18508f = true;
            C9568a.m1960d().registerActivityLifecycleCallbacks(this.f18509g);
        }

        /* renamed from: h */
        private void m2288h() {
            if (!this.f18508f || this.f18509g == null || C9568a.m1960d() == null) {
                return;
            }
            this.f18508f = false;
            C9568a.m1960d().unregisterActivityLifecycleCallbacks(this.f18509g);
        }

        /* renamed from: a */
        public void m2299a() {
            m2290f();
            this.f18506d.destroy();
            C9564j.m1991a(new RunnableC9439b(this));
            this.f18506d = null;
        }

        /* renamed from: a */
        public void m2298a(BannerView.IListener iListener) {
            this.f18506d.setListener(iListener);
        }

        /* renamed from: b */
        public void m2296b() {
            if (this.f18504b) {
                return;
            }
            this.f18504b = true;
            Integer m2275a = C9448a.m2276a().m2275a(this.f18503a);
            if (m2275a != null) {
                this.f18505c = m2275a.longValue();
            }
            m2294c();
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            m2289g();
            if (this.f18507e) {
                m2291e();
            } else {
                this.f18507e = true;
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            m2290f();
            m2288h();
        }
    }

    /* renamed from: com.unity3d.services.banners.UnityBanners$d */
    /* loaded from: classes3.dex */
    public class C9442d extends FrameLayout {

        /* renamed from: a */
        private EnumC9449a f18522a;

        /* renamed from: b */
        private C9437c f18523b;

        /* renamed from: com.unity3d.services.banners.UnityBanners$d$a */
        /* loaded from: classes3.dex */
        public class RunnableC9443a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C9442d f18525a;

            public RunnableC9443a(C9442d c9442d) {
                this.f18525a = c9442d;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18525a.removeAllViews();
                C9565k.m1982a(this.f18525a);
            }
        }

        public C9442d(Context context, C9437c c9437c) {
            super(context);
            this.f18522a = EnumC9449a.NONE;
            this.f18523b = c9437c;
            addView(c9437c);
            m2285b();
            setBackgroundColor(0);
        }

        /* renamed from: b */
        private void m2285b() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = this.f18522a.m2273a();
            setLayoutParams(layoutParams);
        }

        /* renamed from: a */
        public void m2287a() {
            C9564j.m1991a(new RunnableC9443a(this));
            C9437c c9437c = this.f18523b;
            if (c9437c != null) {
                c9437c.m2299a();
                this.f18523b = null;
            }
        }

        /* renamed from: a */
        public void m2286a(EnumC9449a enumC9449a) {
            this.f18522a = enumC9449a;
            m2285b();
        }
    }

    private UnityBanners() {
    }

    /* renamed from: a */
    private void m2304a() {
        C9442d c9442d = this.f18498d;
        if (c9442d != null) {
            c9442d.m2287a();
            this.f18498d = null;
        }
    }

    /* renamed from: a */
    private void m2303a(Activity activity, String str) {
        if (this.f18498d != null) {
            m2301a("A Banner is already in use, please call destroy before loading another banner!");
            return;
        }
        C9437c c9437c = new C9437c(activity, str, new UnityBannerSize(320, 50));
        C9442d c9442d = new C9442d(activity, c9437c);
        c9442d.m2286a(this.f18497c);
        this.f18498d = c9442d;
        c9437c.m2298a(new C9435a(this, c9442d));
        c9437c.m2296b();
    }

    /* renamed from: a */
    private static void m2301a(String str) {
        C9564j.m1991a(new RunnableC9436b(str));
    }

    /* renamed from: b */
    private static UnityBanners m2300b() {
        if (f18495a == null) {
            f18495a = new UnityBanners();
        }
        return f18495a;
    }

    @Deprecated
    public static void destroy() {
        m2300b().m2304a();
    }

    @Deprecated
    public static IUnityBannerListener getBannerListener() {
        return m2300b().f18496b;
    }

    @Deprecated
    public static void loadBanner(Activity activity, String str) {
        C9549a.m2029a();
        if (!UnityAds.isSupported()) {
            m2301a("Unity Ads is not supported on this device.");
        }
        if (!UnityAds.isInitialized()) {
            m2301a("UnityAds is not initialized.");
            return;
        }
        C9568a.m1966a(activity);
        m2300b().m2303a(activity, str);
    }

    @Deprecated
    public static void setBannerListener(IUnityBannerListener iUnityBannerListener) {
        m2300b().f18496b = iUnityBannerListener;
    }

    @Deprecated
    public static void setBannerPosition(EnumC9449a enumC9449a) {
        m2300b().f18497c = enumC9449a;
    }
}
