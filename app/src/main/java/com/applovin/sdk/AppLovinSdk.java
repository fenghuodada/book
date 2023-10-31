package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.mediation.p015d.C2895c;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.C3290d;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Map<String, AppLovinSdk> sdkInstances = new HashMap();
    private static final Object sdkInstancesLock = new Object();
    public final C3214m coreSdk;

    /* loaded from: classes.dex */
    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    /* renamed from: com.applovin.sdk.AppLovinSdk$a */
    /* loaded from: classes.dex */
    public static class C3391a extends AppLovinSdkSettings {
        public C3391a(Context context) {
            super(context);
        }
    }

    private AppLovinSdk(C3214m c3214m) {
        this.coreSdk = c3214m;
    }

    /* renamed from: a */
    public static List<AppLovinSdk> m6793a() {
        return new ArrayList(sdkInstances.values());
    }

    public static AppLovinSdk getInstance(Context context) {
        return getInstance(new C3391a(context), context);
    }

    public static AppLovinSdk getInstance(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (context != null) {
            return getInstance(C3290d.m7036a(context).m7034a("applovin.sdk.key", ""), appLovinSdkSettings, context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    public static AppLovinSdk getInstance(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (appLovinSdkSettings != null) {
            if (context != null) {
                synchronized (sdkInstancesLock) {
                    Map<String, AppLovinSdk> map = sdkInstances;
                    if (map.containsKey(str)) {
                        return map.get(str);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        String str2 = File.separator;
                        if (str.contains(str2)) {
                            if (C3349v.m6862a()) {
                                C3349v.m6846i(TAG, "\n**************************************************\nINVALID SDK KEY: " + str + "\n**************************************************\n");
                            }
                            if (!map.isEmpty()) {
                                return map.values().iterator().next();
                            }
                            str = str.replace(str2, "");
                        }
                    }
                    C3214m c3214m = new C3214m();
                    c3214m.m7444a(str, appLovinSdkSettings, context);
                    AppLovinSdk appLovinSdk = new AppLovinSdk(c3214m);
                    c3214m.m7446a(appLovinSdk);
                    appLovinSdkSettings.attachAppLovinSdk(c3214m);
                    map.put(str, appLovinSdk);
                    return appLovinSdk;
                }
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No userSettings specified");
    }

    private static String getVersion() {
        return "11.4.4";
    }

    private static int getVersionCode() {
        return 11040499;
    }

    public static void initializeSdk(Context context) {
        initializeSdk(context, null);
    }

    public static void initializeSdk(Context context, SdkInitializationListener sdkInitializationListener) {
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        AppLovinSdk appLovinSdk = getInstance(context);
        if (appLovinSdk != null) {
            appLovinSdk.initializeSdk(sdkInitializationListener);
        } else if (C3349v.m6862a()) {
            C3349v.m6846i(TAG, "Unable to initialize AppLovin SDK: SDK object not created");
        }
    }

    public static void reinitializeAll(Boolean bool, Boolean bool2, Boolean bool3) {
        synchronized (sdkInstancesLock) {
            for (AppLovinSdk appLovinSdk : sdkInstances.values()) {
                appLovinSdk.coreSdk.m7424b();
                appLovinSdk.coreSdk.m7403i();
                if (bool != null) {
                    if (C3349v.m6862a()) {
                        C3349v m7487A = appLovinSdk.coreSdk.m7487A();
                        m7487A.m6853c(TAG, "Toggled 'huc' to " + bool);
                    }
                    appLovinSdk.getEventService().trackEvent("huc", CollectionUtils.map("value", bool.toString()));
                }
                if (bool2 != null) {
                    if (C3349v.m6862a()) {
                        C3349v m7487A2 = appLovinSdk.coreSdk.m7487A();
                        m7487A2.m6853c(TAG, "Toggled 'aru' to " + bool2);
                    }
                    appLovinSdk.getEventService().trackEvent("aru", CollectionUtils.map("value", bool2.toString()));
                }
                if (bool3 != null) {
                    if (C3349v.m6862a()) {
                        C3349v m7487A3 = appLovinSdk.coreSdk.m7487A();
                        m7487A3.m6853c(TAG, "Toggled 'dns' to " + bool3);
                    }
                    appLovinSdk.getEventService().trackEvent("dns", CollectionUtils.map("value", bool3.toString()));
                }
            }
        }
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.m7391u();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray m8458a = C2895c.m8458a(this.coreSdk);
        ArrayList arrayList = new ArrayList(m8458a.length());
        for (int i = 0; i < m8458a.length(); i++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(m8458a, i, (JSONObject) null)));
        }
        return arrayList;
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.m7393s();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.m7389w();
    }

    public String getMediationProvider() {
        return this.coreSdk.m7392t();
    }

    public AppLovinPostbackService getPostbackService() {
        return this.coreSdk.m7464X();
    }

    public String getSdkKey() {
        return this.coreSdk.m7386z();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.m7396p();
    }

    public AppLovinTargetingData getTargetingData() {
        return this.coreSdk.m7394r();
    }

    public String getUserIdentifier() {
        return this.coreSdk.m7399m();
    }

    public AppLovinUserSegment getUserSegment() {
        return this.coreSdk.m7395q();
    }

    public AppLovinUserService getUserService() {
        return this.coreSdk.m7388x();
    }

    public AppLovinVariableService getVariableService() {
        return this.coreSdk.m7387y();
    }

    public void initializeSdk() {
    }

    public void initializeSdk(SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.m7447a(sdkInitializationListener);
    }

    public boolean isEnabled() {
        return this.coreSdk.m7411d();
    }

    public boolean isInitialized() {
        return this.coreSdk.m7411d();
    }

    public void setMediationProvider(String str) {
        this.coreSdk.m7412c(str);
    }

    public void setPluginVersion(String str) {
        this.coreSdk.m7445a(str);
    }

    public void setUserIdentifier(String str) {
        this.coreSdk.m7417b(str);
    }

    public void showMediationDebugger() {
        this.coreSdk.m7400l();
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isEnabled=" + isEnabled() + ", isFirstSession=" + this.coreSdk.m7472P() + '}';
    }
}
