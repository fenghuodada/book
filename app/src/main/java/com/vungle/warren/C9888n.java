package com.vungle.warren;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.warren.AdConfig;
import com.vungle.warren.error.VungleException;

/* renamed from: com.vungle.warren.n */
/* loaded from: classes3.dex */
public final class C9888n {

    /* renamed from: a */
    public static final /* synthetic */ int f19867a = 0;

    /* renamed from: a */
    public static void m1438a(@NonNull String str, @Nullable String str2, @NonNull C9821k c9821k, @Nullable InterfaceC10136z interfaceC10136z) {
        int i;
        VungleLogger.m1604b("Banners#loadBanner", "loadBanner API call invoked");
        if (Vungle.appContext() == null || !Vungle.isInitialized()) {
            i = 9;
        } else {
            AdConfig adConfig = new AdConfig(c9821k);
            if (AdConfig.AdSize.isBannerAdSize(adConfig.m1425a())) {
                Vungle.loadAdInternal(str, str2, adConfig, interfaceC10136z);
                return;
            }
            i = 30;
        }
        m1437b(str, interfaceC10136z, i);
    }

    /* renamed from: b */
    public static void m1437b(@NonNull String str, @Nullable InterfaceC10136z interfaceC10136z, @VungleException.ExceptionCode int i) {
        VungleException vungleException = new VungleException(i);
        if (interfaceC10136z != null) {
            interfaceC10136z.onError(str, vungleException);
        }
        VungleLogger.m1603c("Banners#onLoadError", "Banner load error: " + vungleException.getLocalizedMessage());
    }

    /* renamed from: c */
    public static void m1436c(@NonNull String str, @Nullable InterfaceC9782e0 interfaceC9782e0, @VungleException.ExceptionCode int i) {
        VungleException vungleException = new VungleException(i);
        if (interfaceC9782e0 != null) {
            interfaceC9782e0.onError(str, vungleException);
        }
        VungleLogger.m1603c("Banners#onPlaybackError", "Banner play error: " + vungleException.getLocalizedMessage());
    }
}
