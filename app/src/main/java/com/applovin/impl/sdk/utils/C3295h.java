package com.applovin.impl.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.p031c.C3110c;
import com.applovin.impl.sdk.p031c.C3111d;
import com.applovin.impl.sdk.p031c.C3112e;
import com.vungle.warren.VungleApiClient;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.utils.h */
/* loaded from: classes.dex */
public class C3295h {

    /* renamed from: a */
    private static final int[] f8691a = {7, 4, 2, 1, 11};

    /* renamed from: b */
    private static final int[] f8692b = {5, 6, 12, 10, 3, 9, 8, 14};

    /* renamed from: c */
    private static final int[] f8693c = {15, 13};

    /* renamed from: d */
    private static final int[] f8694d = {20};

    /* renamed from: a */
    public static String m7012a(InputStream inputStream, C3214m c3214m) throws IOException {
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[((Integer) c3214m.m7456a(C3109b.f7923cW)).intValue()];
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: a */
    public static String m7010a(String str, C3214m c3214m) {
        return m7009a((String) c3214m.m7456a(C3109b.f7815aT), str, c3214m);
    }

    /* renamed from: a */
    public static String m7009a(String str, String str2, C3214m c3214m) {
        if (str == null || str.length() < 4) {
            throw new IllegalArgumentException("Invalid domain specified");
        }
        if (str2 != null) {
            if (c3214m != null) {
                return str.concat(str2);
            }
            throw new IllegalArgumentException("No sdk specified");
        }
        throw new IllegalArgumentException("No endpoint specified");
    }

    /* renamed from: a */
    public static JSONObject m7008a(JSONObject jSONObject) throws JSONException {
        return (JSONObject) jSONObject.getJSONArray("results").get(0);
    }

    /* renamed from: a */
    public static void m7015a(int i, C3214m c3214m) {
        if (i == 401 && C3349v.m6862a()) {
            C3349v.m6846i("AppLovinSdk", "SDK key \"" + c3214m.m7386z() + "\" is rejected by AppLovin. Please make sure the SDK key is correct.");
        } else if (i == 418) {
            c3214m.m7477K().m7805a(C3109b.f7791W, Boolean.TRUE);
            c3214m.m7477K().m7807a();
        } else {
            if (i < 400 || i >= 500) {
                if (i != -1 || !((Boolean) c3214m.m7456a(C3109b.f7793Y)).booleanValue()) {
                    return;
                }
            } else if (!((Boolean) c3214m.m7456a(C3109b.f7793Y)).booleanValue()) {
                return;
            }
            c3214m.m7401k();
        }
    }

    /* renamed from: a */
    public static void m7007a(JSONObject jSONObject, boolean z, C3214m c3214m) {
        c3214m.m7433ag().m7527a(jSONObject, z);
    }

    /* renamed from: a */
    public static boolean m7016a() {
        return m7011a((String) null);
    }

    /* renamed from: a */
    private static boolean m7014a(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m7013a(Context context) {
        if (context.getSystemService("connectivity") != null) {
            NetworkInfo m7006b = m7006b(context);
            if (m7006b != null) {
                return m7006b.isConnected();
            }
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m7011a(String str) {
        boolean isCleartextTrafficPermitted;
        if (C3294g.m7022e()) {
            if (!C3294g.m7021f() || TextUtils.isEmpty(str)) {
                return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
            }
            isCleartextTrafficPermitted = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
            return isCleartextTrafficPermitted;
        }
        return true;
    }

    /* renamed from: b */
    private static NetworkInfo m7006b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            return connectivityManager.getActiveNetworkInfo();
        }
        return null;
    }

    /* renamed from: b */
    public static String m7005b(String str, C3214m c3214m) {
        return m7009a((String) c3214m.m7456a(C3109b.f7816aU), str, c3214m);
    }

    /* renamed from: c */
    public static void m7004c(JSONObject jSONObject, C3214m c3214m) {
        String string = JsonUtils.getString(jSONObject, "persisted_data", null);
        if (StringUtils.isValidString(string)) {
            c3214m.m7453a((C3111d<C3111d<String>>) C3111d.f8090z, (C3111d<String>) string);
            if (C3349v.m6862a()) {
                c3214m.m7487A().m6853c("ConnectionUtils", "Updated persisted data");
            }
        }
    }

    /* renamed from: d */
    public static void m7003d(JSONObject jSONObject, C3214m c3214m) {
        if (jSONObject == null) {
            throw new IllegalArgumentException("No response specified");
        }
        if (c3214m == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        try {
            if (jSONObject.has("settings")) {
                C3110c m7477K = c3214m.m7477K();
                if (jSONObject.isNull("settings")) {
                    return;
                }
                m7477K.m7802a(jSONObject.getJSONObject("settings"));
                m7477K.m7807a();
            }
        } catch (JSONException e) {
            if (C3349v.m6862a()) {
                c3214m.m7487A().m6854b("ConnectionUtils", "Unable to parse settings out of API response", e);
            }
        }
    }

    /* renamed from: e */
    public static Map<String, String> m7002e(C3214m c3214m) {
        HashMap hashMap = new HashMap();
        String str = (String) c3214m.m7456a(C3109b.f7794Z);
        if (StringUtils.isValidString(str)) {
            hashMap.put("device_token", str);
        } else if (!((Boolean) c3214m.m7456a(C3109b.f8044ep)).booleanValue()) {
            hashMap.put("api_key", c3214m.m7386z());
        }
        hashMap.putAll(Utils.stringifyObjectMap(c3214m.m7466V().m7131i()));
        return hashMap;
    }

    /* renamed from: e */
    public static void m7001e(JSONObject jSONObject, C3214m c3214m) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "filesystem_values", (JSONObject) null);
        if (jSONObject2 != null) {
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(c3214m.m7476L()).edit();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object object = JsonUtils.getObject(jSONObject2, next, null);
                if (object != null) {
                    C3112e.m7784a(next, object, (SharedPreferences) null, edit);
                }
            }
            edit.apply();
        }
    }

    /* renamed from: f */
    public static String m7000f(C3214m c3214m) {
        NetworkInfo m7006b = m7006b(c3214m.m7476L());
        if (m7006b != null) {
            int type = m7006b.getType();
            int subtype = m7006b.getSubtype();
            return type == 1 ? "wifi" : type == 0 ? m7014a(subtype, f8691a) ? "2g" : m7014a(subtype, f8692b) ? "3g" : m7014a(subtype, f8693c) ? "4g" : m7014a(subtype, f8694d) ? "5g" : "mobile" : VungleApiClient.ConnectionTypeDetail.UNKNOWN;
        }
        return VungleApiClient.ConnectionTypeDetail.UNKNOWN;
    }

    /* renamed from: f */
    public static void m6999f(JSONObject jSONObject, C3214m c3214m) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "variables", (JSONObject) null);
        if (jSONObject2 != null) {
            c3214m.m7387y().updateVariables(jSONObject2);
        }
    }

    /* renamed from: g */
    public static String m6998g(C3214m c3214m) {
        return m7009a((String) c3214m.m7456a(C3109b.f7813aR), ((Boolean) c3214m.m7456a(C3109b.f7983de)).booleanValue() ? "5.0/ad" : "4.0/ad", c3214m);
    }

    /* renamed from: h */
    public static String m6997h(C3214m c3214m) {
        return m7009a((String) c3214m.m7456a(C3109b.f7814aS), ((Boolean) c3214m.m7456a(C3109b.f7983de)).booleanValue() ? "5.0/ad" : "4.0/ad", c3214m);
    }

    /* renamed from: i */
    public static String m6996i(C3214m c3214m) {
        return m7009a((String) c3214m.m7456a(C3109b.f7813aR), "4.0/ad", c3214m);
    }

    /* renamed from: j */
    public static String m6995j(C3214m c3214m) {
        return m7009a((String) c3214m.m7456a(C3109b.f7814aS), "4.0/ad", c3214m);
    }

    /* renamed from: k */
    public static String m6994k(C3214m c3214m) {
        return m7009a((String) c3214m.m7456a(C3109b.f7819aX), "1.0/variable_config", c3214m);
    }

    /* renamed from: l */
    public static String m6993l(C3214m c3214m) {
        return m7009a((String) c3214m.m7456a(C3109b.f7820aY), "1.0/variable_config", c3214m);
    }
}
