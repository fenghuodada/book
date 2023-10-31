package com.applovin.impl.sdk.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C3267o;
import com.applovin.impl.sdk.C3349v;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.sdk.utils.c */
/* loaded from: classes.dex */
public class C3289c {

    /* renamed from: a */
    private static boolean f8676a = true;

    /* renamed from: b */
    private static final Object f8677b = new Object();

    /* renamed from: c */
    private static final Collection<CountDownLatch> f8678c = new HashSet();

    /* renamed from: d */
    private static boolean f8679d = false;

    /* renamed from: e */
    private static C3267o.C3273a f8680e = null;

    @Nullable
    /* renamed from: a */
    public static C3267o.C3273a m7042a(Context context) {
        return m7041b(context);
    }

    /* renamed from: a */
    public static boolean m7043a() {
        return Utils.checkClassExistence("com.google.android.gms.ads.identifier.AdvertisingIdClient");
    }

    @Nullable
    /* renamed from: b */
    private static C3267o.C3273a m7041b(Context context) {
        C3267o.C3273a c3273a;
        HashSet hashSet;
        Object obj = f8677b;
        synchronized (obj) {
            if (f8679d) {
                return f8680e;
            }
            Collection<CountDownLatch> collection = f8678c;
            boolean isEmpty = collection.isEmpty();
            CountDownLatch countDownLatch = new CountDownLatch(1);
            collection.add(countDownLatch);
            if (isEmpty) {
                C3267o.C3273a m7040c = m7040c(context);
                synchronized (obj) {
                    f8679d = true;
                    f8680e = m7040c;
                    hashSet = new HashSet(collection);
                    collection.clear();
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((CountDownLatch) it.next()).countDown();
                }
            }
            try {
                if (!countDownLatch.await(60L, TimeUnit.SECONDS) && C3349v.m6862a()) {
                    C3349v.m6846i("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout");
                }
            } catch (InterruptedException e) {
                if (C3349v.m6862a()) {
                    C3349v.m6852c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e);
                }
            }
            synchronized (f8677b) {
                c3273a = f8680e;
            }
            return c3273a;
        }
    }

    /* renamed from: c */
    private static C3267o.C3273a m7040c(Context context) {
        C3267o.C3273a m7039d = m7039d(context);
        if (m7039d == null) {
            m7039d = m7038e(context);
        }
        return m7039d == null ? new C3267o.C3273a() : m7039d;
    }

    @Nullable
    /* renamed from: d */
    private static C3267o.C3273a m7039d(Context context) {
        if (!m7043a()) {
            if (AppLovinSdkUtils.isFireOS(context) || !C3349v.m6862a()) {
                return null;
            }
            C3349v.m6846i("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }");
            return null;
        }
        try {
            C3267o.C3273a c3273a = new C3267o.C3273a();
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            c3273a.f8636a = advertisingIdInfo.isLimitAdTrackingEnabled();
            c3273a.f8637b = advertisingIdInfo.getId();
            return c3273a;
        } catch (Throwable th) {
            if (AppLovinSdkUtils.isFireOS(context) || !C3349v.m6862a()) {
                return null;
            }
            C3349v.m6852c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
            return null;
        }
    }

    @Nullable
    /* renamed from: e */
    private static C3267o.C3273a m7038e(Context context) {
        String str;
        if (f8676a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                C3267o.C3273a c3273a = new C3267o.C3273a();
                c3273a.f8637b = StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id"));
                c3273a.f8636a = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                return c3273a;
            } catch (Settings.SettingNotFoundException e) {
                e = e;
                if (C3349v.m6862a()) {
                    str = "Unable to determine if Fire OS limited ad tracking is turned on";
                    C3349v.m6852c("DataCollector", str, e);
                }
            } catch (Throwable th) {
                e = th;
                if (C3349v.m6862a()) {
                    str = "Unable to collect Fire OS IDFA";
                    C3349v.m6852c("DataCollector", str, e);
                }
            }
        }
        f8676a = false;
        return null;
    }
}
