package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class AppLovinSdkSettings {

    /* renamed from: a */
    private boolean f8964a;

    /* renamed from: b */
    private boolean f8965b;

    /* renamed from: g */
    private String f8970g;

    /* renamed from: l */
    private C3214m f8975l;

    /* renamed from: f */
    private boolean f8969f = true;
    private final Map<String, Object> localSettings = new HashMap();
    private final Map<String, String> metaData = new HashMap();

    /* renamed from: h */
    private List<String> f8971h = Collections.emptyList();

    /* renamed from: i */
    private List<String> f8972i = Collections.emptyList();

    /* renamed from: j */
    private final Map<String, String> f8973j = new HashMap();

    /* renamed from: k */
    private final Object f8974k = new Object();

    /* renamed from: c */
    private boolean f8966c = true;

    /* renamed from: d */
    private boolean f8967d = true;

    /* renamed from: e */
    private boolean f8968e = true;

    public AppLovinSdkSettings(Context context) {
        this.f8964a = Utils.isVerboseLoggingEnabled(context);
    }

    public void attachAppLovinSdk(C3214m c3214m) {
        this.f8975l = c3214m;
        if (StringUtils.isValidString(this.f8970g)) {
            c3214m.m7478J().m8195a(true);
            c3214m.m7478J().m8197a(this.f8970g);
            this.f8970g = null;
        }
    }

    public Map<String, String> getExtraParameters() {
        HashMap hashMap;
        synchronized (this.f8974k) {
            hashMap = new HashMap(this.f8973j);
        }
        return hashMap;
    }

    public List<String> getInitializationAdUnitIds() {
        return this.f8972i;
    }

    public List<String> getTestDeviceAdvertisingIds() {
        return this.f8971h;
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f8966c;
    }

    public boolean isExceptionHandlerEnabled() {
        return this.f8967d;
    }

    public boolean isLocationCollectionEnabled() {
        return this.f8968e;
    }

    public boolean isMuted() {
        return this.f8965b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f8964a;
    }

    public void setCreativeDebuggerEnabled(boolean z) {
        this.f8966c = z;
    }

    public void setExceptionHandlerEnabled(boolean z) {
        this.f8967d = z;
    }

    public void setExtraParameter(String str, @Nullable String str2) {
        if (TextUtils.isEmpty(str)) {
            if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
                return;
            }
            return;
        }
        String trim = str2 != null ? str2.trim() : null;
        synchronized (this.f8974k) {
            this.f8973j.put(str, trim);
        }
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f8975l == null) {
                this.f8970g = trim;
            } else if (StringUtils.isValidString(trim)) {
                this.f8975l.m7478J().m8195a(true);
                this.f8975l.m7478J().m8197a(trim);
            } else {
                this.f8975l.m7478J().m8195a(false);
                this.f8975l.m7478J().m8197a((String) null);
            }
        }
    }

    public void setInitializationAdUnitIds(List<String> list) {
        if (list == null) {
            this.f8972i = Collections.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (StringUtils.isValidString(str) && str.length() > 0) {
                if (str.length() == 16) {
                    arrayList.add(str);
                } else if (C3349v.m6862a()) {
                    C3349v.m6846i("AppLovinSdkSettings", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                }
            }
        }
        this.f8972i = arrayList;
    }

    public void setLocationCollectionEnabled(boolean z) {
        this.f8968e = z;
    }

    public void setMuted(boolean z) {
        this.f8965b = z;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z) {
        this.f8969f = z;
    }

    public void setTestDeviceAdvertisingIds(List<String> list) {
        if (list == null) {
            this.f8971h = Collections.emptyList();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (String str : list) {
            if (str != null && str.length() == 36) {
                arrayList.add(str);
            } else if (C3349v.m6862a()) {
                C3349v.m6846i("AppLovinSdkSettings", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
            }
        }
        this.f8971h = arrayList;
    }

    public void setVerboseLogging(boolean z) {
        if (!Utils.isVerboseLoggingConfigured()) {
            this.f8964a = z;
            return;
        }
        if (C3349v.m6862a()) {
            C3349v.m6846i("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        }
        if (Utils.isVerboseLoggingEnabled(null) != z) {
            C3349v.m6846i("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f8969f;
    }

    @NonNull
    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f8964a + ", muted=" + this.f8965b + ", testDeviceAdvertisingIds=" + this.f8971h.toString() + ", initializationAdUnitIds=" + this.f8972i.toString() + ", creativeDebuggerEnabled=" + this.f8966c + ", exceptionHandlerEnabled=" + this.f8967d + ", locationCollectionEnabled=" + this.f8968e + '}';
    }
}
