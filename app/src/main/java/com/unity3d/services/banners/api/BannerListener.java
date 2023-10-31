package com.unity3d.services.banners.api;

import com.unity3d.services.banners.BannerErrorCode;
import com.unity3d.services.banners.BannerErrorInfo;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* loaded from: classes3.dex */
public class BannerListener {
    @WebViewExposed
    public static void sendClickEvent(String str, C9644l c9644l) {
        BannerViewCache.getInstance().triggerBannerClickEvent(str);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void sendErrorEvent(String str, Integer num, String str2, C9644l c9644l) {
        BannerViewCache.getInstance().triggerBannerErrorEvent(str, new BannerErrorInfo(str2, BannerErrorCode.values()[num.intValue()]));
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void sendLeaveApplicationEvent(String str, C9644l c9644l) {
        BannerViewCache.getInstance().triggerBannerLeftApplicationEvent(str);
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void sendLoadEvent(String str, C9644l c9644l) {
        BannerViewCache.getInstance().triggerBannerLoadEvent(str);
        c9644l.m1736a(new Object[0]);
    }
}
