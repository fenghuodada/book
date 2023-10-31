package com.unity3d.services.banners.api;

import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.C9446a;
import com.unity3d.services.banners.properties.C9448a;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

/* loaded from: classes3.dex */
public class Banner {

    /* renamed from: com.unity3d.services.banners.api.Banner$a */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C9444a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18527a;

        static {
            int[] iArr = new int[EnumC9445b.values().length];
            f18527a = iArr;
            try {
                iArr[EnumC9445b.WEB_PLAYER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f18527a[EnumC9445b.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.unity3d.services.banners.api.Banner$b */
    /* loaded from: classes3.dex */
    public enum EnumC9445b {
        WEB_PLAYER,
        UNKNOWN;

        /* renamed from: a */
        public static EnumC9445b m2284a(String str) {
            try {
                return valueOf(str);
            } catch (IllegalArgumentException unused) {
                return UNKNOWN;
            }
        }
    }

    @WebViewExposed
    public static void load(String str, Integer num, Integer num2, String str2, C9644l c9644l) {
        if (C9444a.f18527a[EnumC9445b.m2284a(str).ordinal()] == 1 && BannerViewCache.getInstance().loadWebPlayer(str2, new UnityBannerSize(num.intValue(), num2.intValue()))) {
            C9446a.m2277d(str2);
        }
        c9644l.m1736a(new Object[0]);
    }

    @WebViewExposed
    public static void setRefreshRate(String str, Integer num, C9644l c9644l) {
        if (str != null && num != null) {
            C9448a.m2276a().m2274a(str, num);
        }
        c9644l.m1736a(new Object[0]);
    }
}
