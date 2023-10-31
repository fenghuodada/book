package com.unity3d.services.banners.bridge;

import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.webview.C9620a;
import com.unity3d.services.core.webview.EnumC9627b;

/* renamed from: com.unity3d.services.banners.bridge.a */
/* loaded from: classes3.dex */
public class C9446a {

    /* renamed from: com.unity3d.services.banners.bridge.a$a */
    /* loaded from: classes3.dex */
    public enum EnumC9447a {
        BANNER_VISIBILITY_CHANGED,
        BANNER_RESIZED,
        BANNER_LOADED,
        BANNER_DESTROYED,
        BANNER_ATTACHED,
        BANNER_DETACHED,
        BANNER_LOAD_PLACEMENT,
        BANNER_DESTROY_BANNER
    }

    /* renamed from: a */
    public static void m2283a(String str) {
        C9620a m1774c = C9620a.m1774c();
        if (m1774c != null) {
            m1774c.m1784a(EnumC9627b.BANNER, EnumC9447a.BANNER_DESTROY_BANNER, str);
        }
    }

    /* renamed from: a */
    public static void m2282a(String str, int i) {
        C9620a m1774c = C9620a.m1774c();
        if (m1774c != null) {
            m1774c.m1784a(EnumC9627b.BANNER, EnumC9447a.BANNER_VISIBILITY_CHANGED, str, Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public static void m2281a(String str, int i, int i2, int i3, int i4, float f) {
        C9620a m1774c = C9620a.m1774c();
        if (m1774c != null) {
            m1774c.m1784a(EnumC9627b.BANNER, EnumC9447a.BANNER_RESIZED, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Float.valueOf(f));
        }
    }

    /* renamed from: a */
    public static void m2280a(String str, String str2, UnityBannerSize unityBannerSize) {
        C9620a m1774c = C9620a.m1774c();
        if (m1774c != null) {
            m1774c.m1784a(EnumC9627b.BANNER, EnumC9447a.BANNER_LOAD_PLACEMENT, str, str2, Integer.valueOf(unityBannerSize.getWidth()), Integer.valueOf(unityBannerSize.getHeight()));
            return;
        }
        BannerView bannerView = BannerViewCache.getInstance().getBannerView(str2);
        if (bannerView == null || bannerView.getListener() == null) {
            return;
        }
        bannerView.getListener().onBannerFailedToLoad(bannerView, new BannerErrorInfo("WebViewApp was not available, this is likely because UnityAds has not been initialized", BannerErrorCode.WEBVIEW_ERROR));
    }

    /* renamed from: b */
    public static void m2279b(String str) {
        C9620a m1774c = C9620a.m1774c();
        if (m1774c != null) {
            m1774c.m1784a(EnumC9627b.BANNER, EnumC9447a.BANNER_ATTACHED, str);
        }
    }

    /* renamed from: c */
    public static void m2278c(String str) {
        C9620a m1774c = C9620a.m1774c();
        if (m1774c != null) {
            m1774c.m1784a(EnumC9627b.BANNER, EnumC9447a.BANNER_DETACHED, str);
        }
    }

    /* renamed from: d */
    public static void m2277d(String str) {
        C9620a m1774c = C9620a.m1774c();
        if (m1774c != null) {
            m1774c.m1784a(EnumC9627b.BANNER, EnumC9447a.BANNER_LOADED, str);
        }
    }
}
