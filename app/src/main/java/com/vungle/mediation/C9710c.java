package com.vungle.mediation;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.ads.mediation.vungle.VungleBannerAd;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MediationUtils;
import com.vungle.warren.AdConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p060j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.vungle.mediation.c */
/* loaded from: classes3.dex */
public final class C9710c {

    /* renamed from: b */
    public static C9710c f19260b;

    /* renamed from: a */
    public final ConcurrentHashMap<String, VungleBannerAd> f19261a = new ConcurrentHashMap<>();

    @Nullable
    /* renamed from: b */
    public static String m1657b(Bundle bundle, Bundle bundle2) {
        String string = (bundle == null || !bundle.containsKey("playPlacement")) ? null : bundle.getString("playPlacement");
        if (bundle2 != null && bundle2.containsKey("placementID")) {
            if (string != null) {
                Log.i("c", "'placementID' had a value in both serverParameters and networkExtras. Used one from serverParameters");
            }
            string = bundle2.getString("placementID");
        }
        if (string == null) {
            Log.e("c", "placementID not provided from serverParameters.");
        }
        return string;
    }

    /* renamed from: c */
    public static synchronized C9710c m1656c() {
        C9710c c9710c;
        synchronized (C9710c.class) {
            if (f19260b == null) {
                f19260b = new C9710c();
            }
            c9710c = f19260b;
        }
        return c9710c;
    }

    /* renamed from: d */
    public static boolean m1655d(Context context, AdSize adSize, AdConfig adConfig) {
        ArrayList arrayList = new ArrayList();
        AdConfig.AdSize adSize2 = AdConfig.AdSize.BANNER_SHORT;
        arrayList.add(new AdSize(adSize2.getWidth(), adSize2.getHeight()));
        AdConfig.AdSize adSize3 = AdConfig.AdSize.BANNER;
        arrayList.add(new AdSize(adSize3.getWidth(), adSize3.getHeight()));
        AdConfig.AdSize adSize4 = AdConfig.AdSize.BANNER_LEADERBOARD;
        arrayList.add(new AdSize(adSize4.getWidth(), adSize4.getHeight()));
        AdConfig.AdSize adSize5 = AdConfig.AdSize.VUNGLE_MREC;
        arrayList.add(new AdSize(adSize5.getWidth(), adSize5.getHeight()));
        AdSize findClosestSize = MediationUtils.findClosestSize(context, adSize, arrayList);
        if (findClosestSize == null) {
            Log.i("c", "Not found closest ad size: " + adSize);
            return false;
        }
        Log.i("c", "Found closest ad size: " + findClosestSize.toString() + " for requested ad size: " + adSize);
        if (findClosestSize.getWidth() == adSize2.getWidth() && findClosestSize.getHeight() == adSize2.getHeight()) {
            adConfig.m1423c(adSize2);
            return true;
        } else if (findClosestSize.getWidth() == adSize3.getWidth() && findClosestSize.getHeight() == adSize3.getHeight()) {
            adConfig.m1423c(adSize3);
            return true;
        } else if (findClosestSize.getWidth() == adSize4.getWidth() && findClosestSize.getHeight() == adSize4.getHeight()) {
            adConfig.m1423c(adSize4);
            return true;
        } else if (findClosestSize.getWidth() == adSize5.getWidth() && findClosestSize.getHeight() == adSize5.getHeight()) {
            adConfig.m1423c(adSize5);
            return true;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final synchronized boolean m1658a(@NonNull String str, @Nullable String str2) {
        ConcurrentHashMap<String, VungleBannerAd> concurrentHashMap = this.f19261a;
        Iterator it = new HashSet(concurrentHashMap.keySet()).iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            VungleBannerAd vungleBannerAd = concurrentHashMap.get(str3);
            if (vungleBannerAd != null && vungleBannerAd.getAdapter() == null) {
                m1653f(str3, vungleBannerAd);
            }
        }
        VungleBannerAd vungleBannerAd2 = this.f19261a.get(str);
        if (vungleBannerAd2 == null) {
            return true;
        }
        if (vungleBannerAd2.getAdapter() == null) {
            this.f19261a.remove(str);
            return true;
        }
        String str4 = vungleBannerAd2.getAdapter().f19244c;
        Log.d("c", "activeUniqueId: " + str4 + " ###  RequestId: " + str2);
        if (str4 == null) {
            Log.w("c", "Ad already loaded for placement ID: " + str + ", and cannot determine if this is a refresh. Set Vungle extras when making an ad request to support refresh on Vungle banner ads.");
            return false;
        } else if (str4.equals(str2)) {
            return true;
        } else {
            Log.w("c", "Ad already loaded for placement ID: " + str);
            return false;
        }
    }

    /* renamed from: e */
    public final void m1654e(@NonNull String str, @NonNull VungleBannerAd vungleBannerAd) {
        ConcurrentHashMap<String, VungleBannerAd> concurrentHashMap = this.f19261a;
        m1653f(str, concurrentHashMap.get(str));
        if (concurrentHashMap.containsKey(str)) {
            return;
        }
        concurrentHashMap.put(str, vungleBannerAd);
        Log.d("c", "registerBannerAd: " + vungleBannerAd + "; size=" + concurrentHashMap.size());
    }

    /* renamed from: f */
    public final void m1653f(@NonNull String str, @Nullable VungleBannerAd vungleBannerAd) {
        Log.d("c", "try to removeActiveBannerAd: " + str);
        ConcurrentHashMap<String, VungleBannerAd> concurrentHashMap = this.f19261a;
        if (!concurrentHashMap.remove(str, vungleBannerAd) || vungleBannerAd == null) {
            return;
        }
        Log.d("c", "removeActiveBannerAd: " + vungleBannerAd + "; size=" + concurrentHashMap.size());
        vungleBannerAd.detach();
        vungleBannerAd.destroyAd();
    }
}
