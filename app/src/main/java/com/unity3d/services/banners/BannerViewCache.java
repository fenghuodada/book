package com.unity3d.services.banners;

import com.unity3d.services.banners.BannerView;
import com.unity3d.services.core.misc.C9564j;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class BannerViewCache {

    /* renamed from: a */
    private static BannerViewCache f18472a;

    /* renamed from: b */
    private HashMap<String, WeakReference<BannerView>> f18473b = new HashMap<>();

    /* renamed from: com.unity3d.services.banners.BannerViewCache$a */
    /* loaded from: classes3.dex */
    public class RunnableC9429a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BannerView.IListener f18474a;

        /* renamed from: b */
        final /* synthetic */ BannerView f18475b;

        public RunnableC9429a(BannerView.IListener iListener, BannerView bannerView) {
            this.f18474a = iListener;
            this.f18475b = bannerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            BannerView.IListener iListener = this.f18474a;
            if (iListener != null) {
                iListener.onBannerLoaded(this.f18475b);
            }
        }
    }

    /* renamed from: com.unity3d.services.banners.BannerViewCache$b */
    /* loaded from: classes3.dex */
    public class RunnableC9430b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BannerView.IListener f18477a;

        /* renamed from: b */
        final /* synthetic */ BannerView f18478b;

        public RunnableC9430b(BannerView.IListener iListener, BannerView bannerView) {
            this.f18477a = iListener;
            this.f18478b = bannerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            BannerView.IListener iListener = this.f18477a;
            if (iListener != null) {
                iListener.onBannerClick(this.f18478b);
            }
        }
    }

    /* renamed from: com.unity3d.services.banners.BannerViewCache$c */
    /* loaded from: classes3.dex */
    public class RunnableC9431c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BannerView.IListener f18480a;

        /* renamed from: b */
        final /* synthetic */ BannerView f18481b;

        /* renamed from: c */
        final /* synthetic */ BannerErrorInfo f18482c;

        public RunnableC9431c(BannerView.IListener iListener, BannerView bannerView, BannerErrorInfo bannerErrorInfo) {
            this.f18480a = iListener;
            this.f18481b = bannerView;
            this.f18482c = bannerErrorInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            BannerView.IListener iListener = this.f18480a;
            if (iListener != null) {
                iListener.onBannerFailedToLoad(this.f18481b, this.f18482c);
            }
        }
    }

    /* renamed from: com.unity3d.services.banners.BannerViewCache$d */
    /* loaded from: classes3.dex */
    public class RunnableC9432d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BannerView.IListener f18484a;

        /* renamed from: b */
        final /* synthetic */ BannerView f18485b;

        public RunnableC9432d(BannerView.IListener iListener, BannerView bannerView) {
            this.f18484a = iListener;
            this.f18485b = bannerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            BannerView.IListener iListener = this.f18484a;
            if (iListener != null) {
                iListener.onBannerLeftApplication(this.f18485b);
            }
        }
    }

    public static BannerViewCache getInstance() {
        if (f18472a == null) {
            f18472a = new BannerViewCache();
        }
        return f18472a;
    }

    public synchronized String addBannerView(BannerView bannerView) {
        this.f18473b.put(bannerView.getViewId(), new WeakReference<>(bannerView));
        return bannerView.getViewId();
    }

    public synchronized BannerView getBannerView(String str) {
        WeakReference<BannerView> weakReference = this.f18473b.get(str);
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return weakReference.get();
    }

    public synchronized boolean loadWebPlayer(String str, UnityBannerSize unityBannerSize) {
        BannerView bannerView = getBannerView(str);
        if (bannerView != null) {
            bannerView.m2316a(unityBannerSize);
            return true;
        }
        return false;
    }

    public synchronized void removeBannerView(String str) {
        this.f18473b.remove(str);
    }

    public synchronized void triggerBannerClickEvent(String str) {
        BannerView bannerView = getBannerView(str);
        if (bannerView != null && bannerView.getListener() != null) {
            C9564j.m1991a(new RunnableC9430b(bannerView.getListener(), bannerView));
        }
    }

    public synchronized void triggerBannerErrorEvent(String str, BannerErrorInfo bannerErrorInfo) {
        BannerView bannerView = getBannerView(str);
        if (bannerView != null && bannerView.getListener() != null) {
            C9564j.m1991a(new RunnableC9431c(bannerView.getListener(), bannerView, bannerErrorInfo));
        }
    }

    public synchronized void triggerBannerLeftApplicationEvent(String str) {
        BannerView bannerView = getBannerView(str);
        if (bannerView != null && bannerView.getListener() != null) {
            C9564j.m1991a(new RunnableC9432d(bannerView.getListener(), bannerView));
        }
    }

    public synchronized void triggerBannerLoadEvent(String str) {
        BannerView bannerView = getBannerView(str);
        if (bannerView != null && bannerView.getListener() != null) {
            C9564j.m1991a(new RunnableC9429a(bannerView.getListener(), bannerView));
        }
    }
}
