package com.unity3d.services.banners;

import android.app.Activity;
import android.view.ViewManager;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.webplayer.C9413e;
import com.unity3d.services.banners.bridge.C9446a;
import com.unity3d.services.banners.view.C9450b;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.IInitializationListener;
import com.unity3d.services.core.configuration.InitializationNotificationCenter;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.misc.C9564j;
import com.unity3d.services.core.misc.C9565k;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.properties.C9572d;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class BannerView extends RelativeLayout {

    /* renamed from: a */
    private String f18459a;

    /* renamed from: b */
    private String f18460b;

    /* renamed from: c */
    private UnityBannerSize f18461c;

    /* renamed from: d */
    private IListener f18462d;

    /* renamed from: e */
    private C9450b f18463e;

    /* renamed from: f */
    private IInitializationListener f18464f;

    /* loaded from: classes3.dex */
    public interface IListener {
        void onBannerClick(BannerView bannerView);

        void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo);

        void onBannerLeftApplication(BannerView bannerView);

        void onBannerLoaded(BannerView bannerView);
    }

    /* loaded from: classes3.dex */
    public static abstract class Listener implements IListener {
        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerClick(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerFailedToLoad(BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLeftApplication(BannerView bannerView) {
        }

        @Override // com.unity3d.services.banners.BannerView.IListener
        public void onBannerLoaded(BannerView bannerView) {
        }
    }

    /* renamed from: com.unity3d.services.banners.BannerView$a */
    /* loaded from: classes3.dex */
    public class RunnableC9426a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BannerView f18465a;

        public RunnableC9426a(BannerView bannerView) {
            this.f18465a = bannerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = this.f18465a.getParent();
            if (parent == null || !(parent instanceof ViewManager)) {
                return;
            }
            ((ViewManager) parent).removeView(this.f18465a);
        }
    }

    /* renamed from: com.unity3d.services.banners.BannerView$b */
    /* loaded from: classes3.dex */
    public class RunnableC9427b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BannerView f18467a;

        /* renamed from: b */
        final /* synthetic */ UnityBannerSize f18468b;

        public RunnableC9427b(BannerView bannerView, UnityBannerSize unityBannerSize) {
            this.f18467a = bannerView;
            this.f18468b = unityBannerSize;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject m2349c = C9413e.m2354a().m2349c(this.f18467a.f18460b);
            JSONObject m2351b = C9413e.m2354a().m2351b(this.f18467a.f18460b);
            JSONObject m2353a = C9413e.m2354a().m2353a(this.f18467a.f18460b);
            if (this.f18467a.f18463e != null) {
                this.f18467a.f18463e.m2268a(m2349c, m2351b);
                this.f18467a.f18463e.setWebPlayerEventSettings(m2353a);
                return;
            }
            this.f18467a.f18463e = new C9450b(this.f18467a.getContext(), this.f18467a.f18460b, m2349c, m2351b, m2353a, this.f18468b);
            BannerView bannerView = this.f18467a;
            bannerView.addView(bannerView.f18463e);
        }
    }

    /* renamed from: com.unity3d.services.banners.BannerView$c */
    /* loaded from: classes3.dex */
    public class C9428c implements IInitializationListener {

        /* renamed from: a */
        final /* synthetic */ BannerView f18470a;

        public C9428c(BannerView bannerView) {
            this.f18470a = bannerView;
        }

        @Override // com.unity3d.services.core.configuration.IInitializationListener
        public void onSdkInitializationFailed(String str, ErrorState errorState, int i) {
            this.f18470a.m2311d();
            if (this.f18470a.getListener() != null) {
                this.f18470a.getListener().onBannerFailedToLoad(this.f18470a, new BannerErrorInfo("UnityAds sdk initialization failed", BannerErrorCode.NATIVE_ERROR));
            }
        }

        @Override // com.unity3d.services.core.configuration.IInitializationListener
        public void onSdkInitialized() {
            this.f18470a.m2311d();
            this.f18470a.m2319a();
        }
    }

    public BannerView(Activity activity, String str, UnityBannerSize unityBannerSize) {
        super(activity);
        this.f18460b = UUID.randomUUID().toString();
        this.f18459a = str;
        this.f18461c = unityBannerSize;
        m2313c();
        setBackgroundColor(0);
        C9568a.m1966a(activity);
        BannerViewCache.getInstance().addBannerView(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m2319a() {
        C9446a.m2280a(this.f18459a, this.f18460b, this.f18461c);
    }

    /* renamed from: b */
    private void m2315b() {
        m2311d();
        this.f18464f = new C9428c(this);
        InitializationNotificationCenter.getInstance().addListener(this.f18464f);
    }

    /* renamed from: c */
    private void m2313c() {
        setLayoutParams(new RelativeLayout.LayoutParams(Math.round(C9565k.m1980b(getContext(), this.f18461c.getWidth())), Math.round(C9565k.m1980b(getContext(), this.f18461c.getHeight()))));
        setGravity(17);
        requestLayout();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m2311d() {
        if (this.f18464f != null) {
            InitializationNotificationCenter.getInstance().removeListener(this.f18464f);
        }
        this.f18464f = null;
    }

    /* renamed from: a */
    public void m2316a(UnityBannerSize unityBannerSize) {
        C9564j.m1991a(new RunnableC9427b(this, unityBannerSize));
    }

    public void destroy() {
        BannerViewCache.getInstance().removeBannerView(this.f18460b);
        m2311d();
        C9446a.m2283a(this.f18459a);
        C9564j.m1991a(new RunnableC9426a(this));
        C9450b c9450b = this.f18463e;
        if (c9450b != null) {
            c9450b.m2272a();
        }
        C9549a.m2015d("Banner [" + this.f18459a + "] was destroyed");
        this.f18460b = null;
        this.f18462d = null;
        this.f18463e = null;
    }

    public IListener getListener() {
        return this.f18462d;
    }

    public String getPlacementId() {
        return this.f18459a;
    }

    public UnityBannerSize getSize() {
        return this.f18461c;
    }

    public String getViewId() {
        return this.f18460b;
    }

    public void load() {
        if (C9572d.m1923q()) {
            m2319a();
        } else {
            m2315b();
        }
    }

    public void setListener(IListener iListener) {
        this.f18462d = iListener;
    }
}
