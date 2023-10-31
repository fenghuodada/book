package com.applovin.impl.mediation.p015d;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p033e.C3163o;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdSize;
import com.unity3d.ads.metadata.MediationMetaData;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.d.c */
/* loaded from: classes.dex */
public class C2895c {

    /* renamed from: a */
    private static final TreeMap<String, String> f7023a;

    /* renamed from: b */
    private static final List<String> f7024b;

    /* renamed from: c */
    private static JSONArray f7025c;

    /* renamed from: d */
    private static final Object f7026d = new Object();

    static {
        TreeMap<String, String> treeMap = new TreeMap<>();
        f7023a = treeMap;
        treeMap.put("com.applovin.mediation.adapters.AdColonyMediationAdapter", "AdColony");
        treeMap.put("com.applovin.mediation.adapters.AmazonMediationAdapter", "Amazon");
        treeMap.put("com.applovin.mediation.adapters.AmazonPublisherServicesMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AmazonAdMarketplaceMediationAdapter", "Amazon Publisher Services");
        treeMap.put("com.applovin.mediation.adapters.AppLovinMediationAdapter", "AppLovin");
        treeMap.put("com.applovin.mediation.adapters.BidMachineMediationAdapter", "BidMachine");
        treeMap.put("com.applovin.mediation.adapters.ByteDanceMediationAdapter", "Pangle");
        treeMap.put("com.applovin.mediation.adapters.ChartboostMediationAdapter", "Chartboost");
        treeMap.put("com.applovin.mediation.adapters.CriteoMediationAdapter", "Criteo");
        treeMap.put("com.applovin.mediation.adapters.DataseatMediationAdapter", "Dataseat");
        treeMap.put("com.applovin.mediation.adapters.FacebookMediationAdapter", "Facebook");
        treeMap.put("com.applovin.mediation.adapters.GoogleMediationAdapter", "AdMob");
        treeMap.put("com.applovin.mediation.adapters.GoogleAdManagerMediationAdapter", "Google Ad Manager");
        treeMap.put("com.applovin.mediation.adapters.HyprMXMediationAdapter", "HyprMX");
        treeMap.put("com.applovin.mediation.adapters.InMobiMediationAdapter", "InMobi");
        treeMap.put("com.applovin.mediation.adapters.InneractiveMediationAdapter", "Fyber");
        treeMap.put("com.applovin.mediation.adapters.IronSourceMediationAdapter", "ironSource");
        treeMap.put("com.applovin.mediation.adapters.LineMediationAdapter", "LINE");
        treeMap.put("com.applovin.mediation.adapters.MaioMediationAdapter", "Maio");
        treeMap.put("com.applovin.mediation.adapters.MintegralMediationAdapter", "Mintegral");
        treeMap.put("com.applovin.mediation.adapters.MyTargetMediationAdapter", "myTarget");
        treeMap.put("com.applovin.mediation.adapters.NendMediationAdapter", "Nend");
        treeMap.put("com.applovin.mediation.adapters.OguryMediationAdapter", "Ogury");
        treeMap.put("com.applovin.mediation.adapters.OguryPresageMediationAdapter", "Ogury Presage");
        treeMap.put("com.applovin.mediation.adapters.SayGamesMediationAdapter", "SayGames");
        treeMap.put("com.applovin.mediation.adapters.SmaatoMediationAdapter", "Smaato");
        treeMap.put("com.applovin.mediation.adapters.SnapMediationAdapter", "Snap");
        treeMap.put("com.applovin.mediation.adapters.TapjoyMediationAdapter", "Tapjoy");
        treeMap.put("com.applovin.mediation.adapters.TencentMediationAdapter", "Tencent");
        treeMap.put("com.applovin.mediation.adapters.UnityAdsMediationAdapter", "Unity Ads");
        treeMap.put("com.applovin.mediation.adapters.VerizonAdsMediationAdapter", "Verizon");
        treeMap.put("com.applovin.mediation.adapters.VerveMediationAdapter", "Verve");
        treeMap.put("com.applovin.mediation.adapters.VungleMediationAdapter", "Vungle");
        treeMap.put("com.applovin.mediation.adapters.YandexMediationAdapter", "Yandex");
        f7024b = new ArrayList(treeMap.keySet());
    }

    /* renamed from: a */
    public static C3163o.EnumC3165a m8457a(MaxAdFormat maxAdFormat) {
        return maxAdFormat == MaxAdFormat.INTERSTITIAL ? C3163o.EnumC3165a.MEDIATION_INTERSTITIAL : maxAdFormat == MaxAdFormat.REWARDED ? C3163o.EnumC3165a.MEDIATION_INCENTIVIZED : maxAdFormat == MaxAdFormat.REWARDED_INTERSTITIAL ? C3163o.EnumC3165a.MEDIATION_REWARDED_INTERSTITIAL : C3163o.EnumC3165a.MEDIATION_BANNER;
    }

    /* renamed from: a */
    public static AppLovinSdkUtils.Size m8459a(int i, MaxAdFormat maxAdFormat, Context context) {
        if (i < 0) {
            try {
                Display defaultDisplay = (context instanceof Activity ? ((Activity) context).getWindowManager() : (WindowManager) context.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                defaultDisplay.getMetrics(displayMetrics);
                i = AppLovinSdkUtils.pxToDp(context, displayMetrics.widthPixels);
            } catch (Throwable unused) {
                return maxAdFormat.getSize();
            }
        }
        int i2 = AdSize.FULL_WIDTH;
        Method method = AdSize.class.getMethod("getCurrentOrientationAnchoredAdaptiveBannerAdSize", Context.class, Integer.TYPE);
        Method method2 = AdSize.class.getMethod("getWidth", new Class[0]);
        Method method3 = AdSize.class.getMethod("getHeight", new Class[0]);
        Object invoke = method.invoke(null, context, Integer.valueOf(i));
        return new AppLovinSdkUtils.Size(((Integer) method2.invoke(invoke, new Object[0])).intValue(), ((Integer) method3.invoke(invoke, new Object[0])).intValue());
    }

    /* renamed from: a */
    public static JSONArray m8458a(C3214m c3214m) {
        if (f7025c != null) {
            m8454b(c3214m);
            return f7025c;
        }
        f7025c = new JSONArray();
        for (String str : f7024b) {
            MaxAdapter m8452b = m8452b(str, c3214m);
            if (m8452b != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", f7023a.get(str));
                    jSONObject.put("class", str);
                    jSONObject.put("sdk_version", m8452b.getSdkVersion());
                    jSONObject.put(MediationMetaData.KEY_VERSION, m8452b.getAdapterVersion());
                } catch (Throwable unused) {
                }
                synchronized (f7026d) {
                    f7025c.put(jSONObject);
                }
            }
        }
        return f7025c;
    }

    /* renamed from: a */
    public static JSONObject m8455a(String str, C3214m c3214m) {
        JSONArray m8458a = m8458a(c3214m);
        for (int i = 0; i < m8458a.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(m8458a, i, (JSONObject) null);
            if (jSONObject != null && str.equals(JsonUtils.getString(jSONObject, "class", null))) {
                return jSONObject;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m8456a(Object obj) {
        return (obj instanceof AbstractC3080e) && StringUtils.isValidString(((AbstractC3080e) obj).m7961N());
    }

    /* renamed from: b */
    public static MaxAdapter m8452b(String str, C3214m c3214m) {
        Class<?> cls;
        if (TextUtils.isEmpty(str)) {
            if (C3349v.m6862a()) {
                c3214m.m7487A().m6850e("AppLovinSdk", "Failed to create adapter instance. No class name provided");
            }
            return null;
        }
        try {
            cls = Class.forName(str);
        } catch (ClassNotFoundException unused) {
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v m7487A = c3214m.m7487A();
                m7487A.m6854b("AppLovinSdk", "Failed to load: " + str, th);
            }
        }
        if (MaxAdapter.class.isAssignableFrom(cls)) {
            return (MaxAdapter) cls.getConstructor(AppLovinSdk.class).newInstance(c3214m.m7463Y());
        }
        if (C3349v.m6862a()) {
            C3349v m7487A2 = c3214m.m7487A();
            m7487A2.m6850e("AppLovinSdk", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
        }
        return null;
    }

    /* renamed from: b */
    private static void m8454b(C3214m c3214m) {
        MaxAdapter m8452b;
        for (int i = 0; i < f7025c.length(); i++) {
            JSONObject jSONObject = JsonUtils.getJSONObject(f7025c, i, (JSONObject) null);
            String string = JsonUtils.getString(jSONObject, "class", "");
            if (!StringUtils.isValidString(JsonUtils.getString(jSONObject, "sdk_version", "")) && (m8452b = m8452b(string, c3214m)) != null) {
                String sdkVersion = m8452b.getSdkVersion();
                if (StringUtils.isValidString(sdkVersion)) {
                    synchronized (f7026d) {
                        JsonUtils.putString(jSONObject, "sdk_version", sdkVersion);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: b */
    public static boolean m8453b(Object obj) {
        return (obj instanceof AbstractC2823a) && "APPLOVIN".equals(((AbstractC2823a) obj).m8742M());
    }
}
