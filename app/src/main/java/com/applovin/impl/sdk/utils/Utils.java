package com.applovin.impl.sdk.utils;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.icu.util.VersionInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Toast;
import androidx.activity.result.C0063d;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import com.applovin.impl.mediation.p015d.C2895c;
import com.applovin.impl.p008a.C2649a;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p029ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p029ad.C3079d;
import com.applovin.impl.sdk.p029ad.C3086f;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p032d.C3119a;
import com.applovin.impl.sdk.p032d.C3125f;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.android.exoplayer2.C6999l0;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

@Keep
/* loaded from: classes.dex */
public abstract class Utils {
    public static final int BYTES_PER_KB = 1000;
    public static final String KEY_AD_VALUES = "ad_values";
    public static final String MACRO_CLCODE = "{CLCODE}";
    public static final String MACRO_CLICK_X = "{CLICK_X}";
    public static final String MACRO_CLICK_Y = "{CLICK_Y}";
    private static final String MACRO_EVENT_ID = "{EVENT_ID}";
    public static final String MACRO_IS_VIDEO_CLICK = "{IS_VIDEO_CLICK}";
    public static final String MACRO_SCREEN_HEIGHT = "{SCREEN_HEIGHT}";
    public static final String MACRO_SCREEN_WIDTH = "{SCREEN_WIDTH}";
    public static final String PLAY_STORE_PACKAGE_NAME = "com.android.vending";
    public static final String PLAY_STORE_SCHEME = "market";
    private static final String SDK_EXTRA_PARAM_RUN_IN_RELEASE_MODE = "run_in_release_mode";
    private static final String SDK_EXTRA_PARAM_USER_AGENT_COLLECTION_ENABLED = "user_agent_collection_enabled";
    private static final String TAG = "Utils";
    private static final DecimalFormat decimalFormat = new DecimalFormat();
    public static Boolean isDspDemoApp;
    public static Boolean isExoPlayerEligible;

    public static boolean bitMaskContainsFlag(long j, long j2) {
        return (j & j2) != 0;
    }

    public static List<Uri> checkCachedResourcesExist(boolean z, AbstractC3080e abstractC3080e, C3214m c3214m, Context context) {
        if (abstractC3080e instanceof C2649a) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = new ArrayList(abstractC3080e.m7974A()).iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!(c3214m.m7439aa() != null ? c3214m.m7439aa().m7073b(uri.getLastPathSegment(), context) : c3214m.m7438ab().m7090b(uri.getLastPathSegment(), context))) {
                if (C3349v.m6862a()) {
                    C3349v m7487A = c3214m.m7487A();
                    m7487A.m6850e(TAG, "Cached HTML asset missing: " + uri);
                }
                arrayList.add(uri);
            }
        }
        if (z) {
            Uri mo7887h = abstractC3080e.mo7887h();
            if (!(c3214m.m7439aa() != null ? c3214m.m7439aa().m7073b(mo7887h.getLastPathSegment(), context) : c3214m.m7438ab().m7090b(mo7887h.getLastPathSegment(), context))) {
                if (C3349v.m6862a()) {
                    C3349v m7487A2 = c3214m.m7487A();
                    m7487A2.m6850e(TAG, "Cached video missing: " + mo7887h);
                }
                arrayList.add(mo7887h);
            }
        }
        return arrayList;
    }

    public static boolean checkClassExistence(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean checkClassesExistence(List<String> list) {
        for (String str : list) {
            if (checkClassExistence(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkExoPlayerEligibility(C3214m c3214m) {
        if (isExoPlayerEligible == null) {
            int tryToGetExoPlayerVersionCode = tryToGetExoPlayerVersionCode();
            int intValue = ((Integer) c3214m.m7456a(C3109b.f7905cE)).intValue();
            isExoPlayerEligible = Boolean.valueOf(checkClassExistence("com.google.android.exoplayer2.ui.PlayerView") && tryToGetExoPlayerVersionCode >= ((Integer) c3214m.m7456a(C3109b.f7904cD)).intValue() && (intValue < 0 || tryToGetExoPlayerVersionCode <= intValue));
        }
        return isExoPlayerEligible.booleanValue();
    }

    public static void close(Closeable closeable, C3214m c3214m) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th) {
            if (c3214m == null || !C3349v.m6862a()) {
                return;
            }
            C3349v m7487A = c3214m.m7487A();
            m7487A.m6854b(TAG, "Unable to close stream: " + closeable, th);
        }
    }

    public static int compare(String str, String str2) {
        VersionInfo versionInfo;
        VersionInfo versionInfo2;
        int compareTo;
        String digitsOnlyVersionString = StringUtils.toDigitsOnlyVersionString(str);
        String digitsOnlyVersionString2 = StringUtils.toDigitsOnlyVersionString(str2);
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                versionInfo = VersionInfo.getInstance(digitsOnlyVersionString);
                versionInfo2 = VersionInfo.getInstance(digitsOnlyVersionString2);
                compareTo = versionInfo.compareTo(versionInfo2);
                return compareTo == 0 ? compareTo : compareTo > 0 ? 1 : -1;
            }
            String[] split = digitsOnlyVersionString.split("\\.");
            String[] split2 = digitsOnlyVersionString2.split("\\.");
            int max = Math.max(split.length, split2.length);
            int i = 0;
            while (i < max) {
                String str3 = StringUtils.isValidString(split[i]) ? split[i] : "0";
                String str4 = StringUtils.isValidString(split2[i]) ? split2[i] : "0";
                int parseInt = i < split.length ? Integer.parseInt(str3) : 0;
                int parseInt2 = i < split2.length ? Integer.parseInt(str4) : 0;
                if (parseInt < parseInt2) {
                    return -1;
                }
                if (parseInt > parseInt2) {
                    return 1;
                }
                i++;
            }
            return 0;
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v.m6852c(TAG, "Failed to process version string.", th);
            }
            return 0;
        }
    }

    public static void disconnect(HttpURLConnection httpURLConnection, C3214m c3214m) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Throwable th) {
            if (c3214m == null || !C3349v.m6862a()) {
                return;
            }
            C3349v m7487A = c3214m.m7487A();
            m7487A.m6854b(TAG, "Unable to disconnect connection: " + httpURLConnection, th);
        }
    }

    public static String encodeUrlMap(Map<String, String> map, boolean z, boolean z2) {
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            TreeMap treeMap = new TreeMap(new Comparator<String>() { // from class: com.applovin.impl.sdk.utils.Utils.1
                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(String str, String str2) {
                    return str.compareToIgnoreCase(str2);
                }
            });
            treeMap.putAll(map);
            map = treeMap;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            String value = entry.getValue();
            if (z2 && (value instanceof String)) {
                String str = value;
                if (str.contains("&")) {
                    value = str.replace("&", "%26");
                }
            }
            sb.append((Object) entry.getKey());
            sb.append('=');
            sb.append((Object) value);
        }
        return sb.toString();
    }

    private static long floatToLong(float f) {
        return Math.round(f);
    }

    public static String formatDoubleValue(double d, int i) {
        DecimalFormat decimalFormat2 = decimalFormat;
        decimalFormat2.setMaximumFractionDigits(i);
        return decimalFormat2.format(d);
    }

    private static List<Class> generateClassesList(List<String> list, C3214m c3214m) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            try {
                arrayList.add(Class.forName(str));
            } catch (ClassNotFoundException unused) {
                if (C3349v.m6862a()) {
                    C3349v m7487A = c3214m.m7487A();
                    m7487A.m6850e(TAG, "Failed to create class for name: " + str);
                }
            }
        }
        return arrayList;
    }

    public static int getAlwaysFinishActivitiesSetting(Context context) {
        C3294g.m7025b();
        return Settings.System.getInt(context.getContentResolver(), "always_finish_activities", 0);
    }

    public static String getAndroidOSInfo() {
        try {
            return Build.VERSION.RELEASE + " (" + getAndroidSdkCodename() + " - API " + Build.VERSION.SDK_INT + ")";
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v.m6852c(TAG, "Unable to get Android OS info", th);
                return "";
            }
            return "";
        }
    }

    public static String getAndroidSdkCodename() {
        Field[] fields;
        try {
            for (Field field : Build.VERSION_CODES.class.getFields()) {
                if (field.getInt(null) == Build.VERSION.SDK_INT) {
                    return field.getName();
                }
            }
            return "";
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v.m6852c(TAG, "Unable to get Android SDK codename", th);
                return "";
            }
            return "";
        }
    }

    public static boolean getBooleanForProbability(int i) {
        return i > 0 && i <= 100 && ((int) (Math.random() * 100.0d)) + 1 <= i;
    }

    @Nullable
    public static String getCurrentAdServeId(Object obj) {
        if (obj instanceof AbstractC2823a) {
            return ((AbstractC2823a) obj).m8798f();
        }
        if (C2895c.m8456a(obj)) {
            return ((AbstractC3080e) obj).m7961N();
        }
        return null;
    }

    public static Field getField(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Class superclass = cls.getSuperclass();
            if (superclass == null) {
                return null;
            }
            return getField(superclass, str);
        }
    }

    public static String getFileName(Uri uri) {
        return TextUtils.join("_", uri.getPathSegments());
    }

    @Nullable
    public static Map<String, String> getMetaData(AppLovinSdkSettings appLovinSdkSettings) {
        try {
            Field field = getField(appLovinSdkSettings.getClass(), "metaData");
            if (field != null) {
                field.setAccessible(true);
            }
            return (Map) field.get(appLovinSdkSettings);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int getOrientation(Context context) {
        Resources resources;
        Configuration configuration;
        if (context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null) {
            return 0;
        }
        return configuration.orientation;
    }

    public static List<C3119a> getPostbacks(String str, JSONObject jSONObject, String str2, String str3, C3214m c3214m) {
        return getPostbacks(str, jSONObject, str2, (Map<String, String>) null, str3, c3214m);
    }

    public static List<C3119a> getPostbacks(String str, JSONObject jSONObject, String str2, String str3, Map<String, String> map, C3214m c3214m) {
        return getPostbacks(str, jSONObject, str2, Collections.emptyMap(), str3, map, false, c3214m);
    }

    public static List<C3119a> getPostbacks(String str, JSONObject jSONObject, String str2, Map<String, String> map, String str3, C3214m c3214m) {
        return getPostbacks(str, jSONObject, str2, map, str3, null, false, c3214m);
    }

    public static List<C3119a> getPostbacks(String str, JSONObject jSONObject, String str2, Map<String, String> map, String str3, Map<String, String> map2, boolean z, C3214m c3214m) {
        if (map == null) {
            map = new HashMap<>(1);
        }
        Map<String, String> map3 = map;
        map3.put(MACRO_CLCODE, str2);
        return getPostbacks(str, jSONObject, map3, str3, map2, z, c3214m);
    }

    public static List<C3119a> getPostbacks(String str, JSONObject jSONObject, Map<String, String> map, String str2, C3214m c3214m) {
        return getPostbacks(str, jSONObject, map, str2, (Map<String, String>) null, c3214m);
    }

    public static List<C3119a> getPostbacks(String str, JSONObject jSONObject, Map<String, String> map, String str2, Map<String, String> map2, C3214m c3214m) {
        return getPostbacks(str, jSONObject, map, str2, map2, false, c3214m);
    }

    public static List<C3119a> getPostbacks(String str, JSONObject jSONObject, Map<String, String> map, String str2, Map<String, String> map2, boolean z, C3214m c3214m) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, str, new JSONObject());
        ArrayList arrayList = new ArrayList(jSONObject2.length() + 1);
        if (StringUtils.isValidString(str2)) {
            arrayList.add(new C3119a(str2, null, map2, z));
        }
        if (jSONObject2.length() > 0) {
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next)) {
                        String optString = jSONObject2.optString(next);
                        String replace = StringUtils.replace(next, map);
                        if (!TextUtils.isEmpty(optString)) {
                            optString = StringUtils.replace(optString, map);
                        }
                        arrayList.add(new C3119a(replace, optString, map2, z));
                    }
                } catch (Throwable th) {
                    if (C3349v.m6862a()) {
                        c3214m.m7487A().m6854b(TAG, "Failed to create and add postback url.", th);
                    }
                }
            }
        }
        return arrayList;
    }

    public static View getRootView(View view) {
        View rootView;
        if (view == null || (rootView = view.getRootView()) == null) {
            return null;
        }
        View findViewById = rootView.findViewById(16908290);
        return findViewById != null ? findViewById : rootView;
    }

    public static int getRotation(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return 0;
        }
        return windowManager.getDefaultDisplay().getRotation();
    }

    public static long getServerAdjustedUnixTimestampMillis(C3214m c3214m) {
        long longValue = ((Long) c3214m.m7456a(C3109b.f8046er)).longValue();
        long longValue2 = ((Long) c3214m.m7456a(C3109b.f8047es)).longValue();
        long currentTimeMillis = System.currentTimeMillis();
        return (longValue <= 0 || longValue2 <= 0) ? currentTimeMillis : (longValue - longValue2) + currentTimeMillis;
    }

    public static String getString(Class cls, String str) {
        try {
            Field field = getField(cls, str);
            field.setAccessible(true);
            return (String) field.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getUserEngagementSdkVersion() {
        try {
            return (String) Class.forName("com.applovin.sdk.userengagement.impl.api.AppLovinUserEngagementSdkImpl").getMethod("getVersion", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static int getVideoCompletionPercent(JSONObject jSONObject) {
        int i = JsonUtils.getInt(jSONObject, "video_completion_percent", -1);
        if (i < 0 || i > 100) {
            return 95;
        }
        return i;
    }

    public static C3079d getZone(JSONObject jSONObject, C3214m c3214m) {
        return C3079d.m7989a(AppLovinAdSize.fromString(JsonUtils.getString(jSONObject, "ad_size", null)), AppLovinAdType.fromString(JsonUtils.getString(jSONObject, "ad_type", null)), JsonUtils.getString(jSONObject, "zone_id", null));
    }

    public static byte[] gzip(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean hasAndroidCoreJsonLibrary(C3214m c3214m) {
        if (C3294g.m7024c()) {
            try {
                JSONObject.wrap(JSONObject.NULL);
                return true;
            } catch (Throwable th) {
                if (C3349v.m6862a()) {
                    c3214m.m7487A().m6857a(TAG, "Failed to wrap JSONObject with exception", th);
                    return false;
                }
                return false;
            }
        }
        return true;
    }

    public static boolean isAppLovinTestEnvironment(Context context) {
        return C3290d.m7036a(context).m7035a("applovin.sdk.is_test_environment");
    }

    public static boolean isBML(AppLovinAdSize appLovinAdSize) {
        return appLovinAdSize == AppLovinAdSize.BANNER || appLovinAdSize == AppLovinAdSize.MREC || appLovinAdSize == AppLovinAdSize.LEADER || appLovinAdSize == AppLovinAdSize.CROSS_PROMO;
    }

    public static boolean isCurrentProcessInForeground() {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
        try {
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v.m6852c(TAG, "Exception thrown while getting memory state.", th);
            }
        }
        int i = runningAppProcessInfo.importance;
        return i == 100 || i == 200;
    }

    public static boolean isDeepLinkPlusUrl(Uri uri) {
        return uri != null && "applovin".equalsIgnoreCase(uri.getScheme()) && AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN.equalsIgnoreCase(uri.getHost()) && "/adservice/deeplink".equals(uri.getPath());
    }

    public static boolean isDomainWhitelisted(String str, List<String> list) {
        for (String str2 : list) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDspDemoApp(Context context) {
        if (isDspDemoApp == null) {
            isDspDemoApp = Boolean.valueOf("com.applovin.apps.dspdemo".equals(context.getPackageName()));
        }
        return isDspDemoApp.booleanValue();
    }

    public static boolean isMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean isProguardRulesOmitted() {
        try {
            String str = AppLovinSdk.VERSION;
            return false;
        } catch (ClassNotFoundException unused) {
            return true;
        }
    }

    public static boolean isPubInDebugMode(Context context, C3214m c3214m) {
        String str = c3214m.m7396p().getExtraParameters().get(SDK_EXTRA_PARAM_RUN_IN_RELEASE_MODE);
        return ((StringUtils.isValidString(str) && Boolean.parseBoolean(str)) || (context.getApplicationInfo().flags & 2) == 0) ? false : true;
    }

    public static boolean isTestApp(Context context) {
        String packageName = context.getPackageName();
        return "com.revolverolver.fliptrickster".equals(packageName) || "com.mindstormstudios.idlemakeover".equals(packageName);
    }

    public static boolean isUserAgentCollectionEnabled(C3214m c3214m) {
        String str = c3214m.m7396p().getExtraParameters().get(SDK_EXTRA_PARAM_USER_AGENT_COLLECTION_ENABLED);
        if (StringUtils.isValidString(str)) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000a A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:2:0x0000, B:3:0x0004, B:5:0x000a, B:7:0x001c, B:9:0x0024), top: B:19:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean isVPNConnected() {
        /*
            java.util.Enumeration r0 = java.net.NetworkInterface.getNetworkInterfaces()     // Catch: java.lang.Throwable -> L2e
        L4:
            boolean r1 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L3c
            java.lang.Object r1 = r0.nextElement()     // Catch: java.lang.Throwable -> L2e
            java.net.NetworkInterface r1 = (java.net.NetworkInterface) r1     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r1.getDisplayName()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "tun"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L2c
            java.lang.String r2 = "ppp"
            boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L2e
            if (r2 != 0) goto L2c
            java.lang.String r2 = "ipsec"
            boolean r1 = r1.contains(r2)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L4
        L2c:
            r0 = 1
            return r0
        L2e:
            r0 = move-exception
            boolean r1 = com.applovin.impl.sdk.C3349v.m6862a()
            if (r1 == 0) goto L3c
            java.lang.String r1 = "Utils"
            java.lang.String r2 = "Unable to check Network Interfaces"
            com.applovin.impl.sdk.C3349v.m6852c(r1, r2, r0)
        L3c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.utils.Utils.isVPNConnected():boolean");
    }

    @Keep
    public static boolean isVerboseLoggingConfigured() {
        Context m7475M = C3214m.m7475M();
        if (m7475M != null) {
            return C3290d.m7036a(m7475M).m7035a("applovin.sdk.verbose_logging");
        }
        return false;
    }

    public static boolean isVerboseLoggingEnabled(Context context) {
        if (context == null) {
            context = C3214m.m7475M();
        }
        if (context != null) {
            return C3290d.m7036a(context).m7033a("applovin.sdk.verbose_logging", false);
        }
        return false;
    }

    public static boolean isVideoMutedInitially(C3214m c3214m) {
        return ((Boolean) c3214m.m7456a(C3109b.f7947cu)).booleanValue() ? c3214m.m7396p().isMuted() : ((Boolean) c3214m.m7456a(C3109b.f7945cs)).booleanValue();
    }

    public static boolean isViewInChildView(View view, View view2) {
        if (view == view2) {
            return true;
        }
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (isViewInChildView(view, viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isViewInTopActivity(View view, Activity activity) {
        View rootView;
        if (activity != null && view != null) {
            Window window = activity.getWindow();
            if (window != null) {
                rootView = window.getDecorView();
            } else {
                View findViewById = activity.findViewById(16908290);
                if (findViewById != null) {
                    rootView = findViewById.getRootView();
                }
            }
            return isViewInChildView(view, rootView);
        }
        return false;
    }

    public static int kilobytesToByes(int i) {
        return i * 1000;
    }

    public static void maybeHandleNoFillResponseForPublisher(String str, MaxAdFormat maxAdFormat, JSONObject jSONObject, C3214m c3214m) {
        if (jSONObject.has("no_fill_reason") && C3349v.m6862a()) {
            Object object = JsonUtils.getObject(jSONObject, "no_fill_reason", new Object());
            StringBuilder m13052b = C0063d.m13052b("\n**************************************************\nNO FILL received:\n..ID: \"", str, "\"\n..FORMAT: \"");
            m13052b.append(maxAdFormat.getLabel());
            m13052b.append("\"\n..SDK KEY: \"");
            m13052b.append(c3214m.m7386z());
            m13052b.append("\"\n..PACKAGE NAME: \"");
            m13052b.append(c3214m.m7476L().getPackageName());
            m13052b.append("\"\n..Reason: ");
            m13052b.append(object);
            m13052b.append("\n**************************************************\n");
            c3214m.m7487A().m6850e("AppLovinSdk", m13052b.toString());
        }
    }

    public static void maybeLogCustomDataSizeLimit(@Nullable String str, String str2) {
        if (str == null || str.length() <= kilobytesToByes(8)) {
            return;
        }
        C3349v.m6847h(str2, "Provided custom data parameter longer than supported (" + str.length() + " bytes, " + kilobytesToByes(8) + " maximum)");
    }

    public static AppLovinAd maybeRetrieveNonDummyAd(AppLovinAd appLovinAd, C3214m c3214m) {
        if (appLovinAd instanceof C3086f) {
            C3086f c3086f = (C3086f) appLovinAd;
            AppLovinAd dequeueAd = c3214m.m7391u().dequeueAd(c3086f.getAdZone());
            if (C3349v.m6862a()) {
                C3349v m7487A = c3214m.m7487A();
                m7487A.m6855b(TAG, "Dequeued ad for dummy ad: " + dequeueAd);
            }
            if (dequeueAd != null) {
                c3086f.m7871a(dequeueAd);
                ((AppLovinAdImpl) dequeueAd).setDummyAd(c3086f);
                return dequeueAd;
            }
            return c3086f.m7872a();
        }
        return appLovinAd;
    }

    public static double millisToSeconds(long j) {
        return j / 1000.0d;
    }

    public static boolean objectIsOfType(Object obj, List<String> list, C3214m c3214m) {
        if (list == null) {
            return false;
        }
        for (Class cls : generateClassesList(list, c3214m)) {
            if (cls.isInstance(obj)) {
                if (!(obj instanceof Map)) {
                    if (obj instanceof List) {
                        for (Object obj2 : (List) obj) {
                            if (!objectIsOfType(obj2, list, c3214m)) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return true;
                }
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (!(entry.getKey() instanceof String)) {
                        if (C3349v.m6862a()) {
                            c3214m.m7487A().m6855b(TAG, "Invalid key type used. Map keys should be of type String.");
                        }
                        return false;
                    } else if (!objectIsOfType(entry.getValue(), list, c3214m)) {
                        return false;
                    }
                }
                return true;
            }
        }
        if (C3349v.m6862a()) {
            C3349v m7487A = c3214m.m7487A();
            m7487A.m6855b(TAG, "Object '" + obj + "' does not match any of the required types '" + list + "'.");
        }
        return false;
    }

    public static boolean openUri(Context context, Uri uri, C3214m c3214m) {
        boolean z = false;
        if (uri == null) {
            return false;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            if (PLAY_STORE_SCHEME.equals(intent.getScheme())) {
                intent.setPackage("com.android.vending");
            }
            c3214m.m7436ad().m6832c();
            context.startActivity(intent);
            z = true;
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v m7487A = c3214m.m7487A();
                m7487A.m6854b(TAG, "Unable to open \"" + uri + "\".", th);
            }
        }
        if (!z) {
            c3214m.m7436ad().m6830d();
        }
        return z;
    }

    public static long parseColor(String str) {
        if (StringUtils.isValidString(str)) {
            try {
                return Color.parseColor(str);
            } catch (Throwable unused) {
                return Long.MAX_VALUE;
            }
        }
        return Long.MAX_VALUE;
    }

    public static void putObjectForStringIfValid(String str, String str2, Map map) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    public static void renameKeyInObjectMap(String str, String str2, Map<String, Object> map) {
        if (map.containsKey(str)) {
            map.put(str2, map.get(str));
            map.remove(str);
        }
    }

    public static String retrieveLauncherActivityFullyQualifiedName(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setPackage(context.getPackageName());
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        if (queryIntentActivities.isEmpty()) {
            return null;
        }
        return queryIntentActivities.get(0).activityInfo.name;
    }

    public static Activity retrieveParentActivity(View view, C3214m c3214m) {
        if (view == null) {
            return null;
        }
        int i = 0;
        while (i < 1000) {
            i++;
            try {
                Context context = view.getContext();
                if (context instanceof Activity) {
                    return (Activity) context;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    return null;
                }
                view = (View) parent;
            } catch (Throwable th) {
                if (C3349v.m6862a()) {
                    c3214m.m7487A().m6854b(TAG, "Encountered error while retrieving activity from view", th);
                }
            }
        }
        return null;
    }

    public static Object sanitizeSuperProperty(Object obj, C3214m c3214m) {
        int intValue;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            HashMap hashMap = new HashMap(map.size());
            for (Map.Entry entry : map.entrySet()) {
                Object key = entry.getKey();
                hashMap.put(key instanceof String ? (String) key : String.valueOf(key), sanitizeSuperProperty(entry.getValue(), c3214m));
            }
            return hashMap;
        } else if (obj instanceof List) {
            List<Object> list = (List) obj;
            ArrayList arrayList = new ArrayList(list.size());
            for (Object obj2 : list) {
                arrayList.add(sanitizeSuperProperty(obj2, c3214m));
            }
            return arrayList;
        } else if (obj instanceof Date) {
            return String.valueOf(((Date) obj).getTime());
        } else {
            String valueOf = String.valueOf(obj);
            if (obj instanceof String) {
                intValue = ((Integer) c3214m.m7456a(C3109b.f7880bf)).intValue();
                if (intValue <= 0 || valueOf.length() <= intValue) {
                    return valueOf;
                }
            } else if (!(obj instanceof Uri) || (intValue = ((Integer) c3214m.m7456a(C3109b.f7881bg)).intValue()) <= 0 || valueOf.length() <= intValue) {
                return valueOf;
            }
            return valueOf.substring(0, intValue);
        }
    }

    public static float secondsToMillis(float f) {
        return f * 1000.0f;
    }

    public static long secondsToMillisLong(float f) {
        return floatToLong(secondsToMillis(f));
    }

    public static String shortenKey(String str) {
        return (str == null || str.length() <= 4) ? "NOKEY" : str.substring(str.length() - 4);
    }

    public static void showAlert(String str, String str2, Context context) {
        new AlertDialog.Builder(context).setTitle(str).setMessage(str2).setNegativeButton(17039370, (DialogInterface.OnClickListener) null).create().show();
    }

    public static void showToast(final String str, final Context context) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.sdk.utils.Utils.2
            @Override // java.lang.Runnable
            public void run() {
                Toast makeText = Toast.makeText(context, str, 0);
                makeText.setMargin(0.0f, 0.1f);
                makeText.show();
            }
        });
    }

    public static void showToast(String str, MaxAd maxAd, Context context) {
        Toast.makeText(context, maxAd.getFormat().getLabel() + ": " + str, 1).show();
    }

    public static Map<String, String> stringifyObjectMap(Map<String, Object> map) {
        HashMap hashMap = new HashMap();
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                hashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return hashMap;
    }

    public static Map<String, String> toUrlSafeMap(Map<String, String> map, C3214m c3214m) {
        HashMap hashMap = new HashMap(map);
        for (String str : hashMap.keySet()) {
            String str2 = (String) hashMap.get(str);
            if (str2 != null) {
                hashMap.put(str, StringUtils.encodeUriString(str2, c3214m));
            }
        }
        return hashMap;
    }

    public static int toVersionCode(String str) {
        String[] split;
        int i = 0;
        for (String str2 : str.replaceAll("-beta", ".").split("\\.")) {
            if (str2.length() > 2) {
                if (C3349v.m6862a()) {
                    C3349v.m6846i(TAG, "Version number components cannot be longer than two digits -> ".concat(str));
                }
                return i;
            }
            i = (i * 100) + Integer.parseInt(str2);
        }
        return !str.contains("-beta") ? (i * 100) + 99 : i;
    }

    public static double tryParseDouble(String str, double d) {
        try {
            return Double.parseDouble(str);
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v.m6852c(TAG, "Failed to parse double from String: " + str, th);
            }
            return d;
        }
    }

    @Nullable
    public static WebView tryToCreateWebView(Context context, String str) {
        try {
            return new WebView(context);
        } catch (Throwable th) {
            if (C3349v.m6862a()) {
                C3349v.m6852c(TAG, "Failed to initialize WebView for " + str + ".", th);
                return null;
            }
            return null;
        }
    }

    public static int tryToGetExoPlayerVersionCode() {
        try {
            HashSet<String> hashSet = C6999l0.f12262a;
            Field field = getField(C6999l0.class, "VERSION_INT");
            field.setAccessible(true);
            return ((Integer) field.get(null)).intValue();
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String urlStringWithoutQueryParameters(String str) {
        Uri parse = Uri.parse(str);
        return new Uri.Builder().scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).build().toString();
    }

    public static void validateAdSdkKey(AppLovinAd appLovinAd, C3214m c3214m) {
        if (appLovinAd instanceof AppLovinAdBase) {
            String m7386z = c3214m.m7386z();
            String m7386z2 = ((AppLovinAdBase) appLovinAd).getSdk().m7386z();
            if (m7386z.equals(m7386z2)) {
                return;
            }
            if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinAd", "Ad was loaded from sdk with key: " + m7386z2 + ", but is being rendered from sdk with key: " + m7386z);
            }
            c3214m.m7468T().m7719a(C3125f.f8172l);
        }
    }
}
