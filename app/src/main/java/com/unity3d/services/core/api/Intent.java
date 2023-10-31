package com.unity3d.services.core.api;

import android.app.Activity;
import android.net.Uri;
import com.google.ads.mediation.facebook.FacebookAdapter;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.properties.C9568a;
import com.unity3d.services.core.webview.bridge.C9644l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Intent {

    /* renamed from: a */
    private static WeakReference<Activity> f18575a;

    /* loaded from: classes3.dex */
    public enum IntentError {
        COULDNT_PARSE_EXTRAS,
        COULDNT_PARSE_CATEGORIES,
        INTENT_WAS_NULL,
        JSON_EXCEPTION,
        ACTIVITY_WAS_NULL
    }

    /* renamed from: com.unity3d.services.core.api.Intent$a */
    /* loaded from: classes3.dex */
    public static class C9457a extends Exception {

        /* renamed from: a */
        private IntentError f18577a;

        /* renamed from: b */
        private Object f18578b;

        public C9457a(IntentError intentError, Object obj) {
            this.f18577a = intentError;
            this.f18578b = obj;
        }

        /* renamed from: a */
        public IntentError m2254a() {
            return this.f18577a;
        }

        /* renamed from: b */
        public Object m2253b() {
            return this.f18578b;
        }
    }

    /* renamed from: a */
    private static Activity m2260a() {
        WeakReference<Activity> weakReference = f18575a;
        if (weakReference == null || weakReference.get() == null) {
            if (C9568a.m1967a() != null) {
                return C9568a.m1967a();
            }
            return null;
        }
        return f18575a.get();
    }

    /* renamed from: a */
    private static android.content.Intent m2256a(JSONObject jSONObject) throws C9457a {
        String str = (String) jSONObject.opt("className");
        String str2 = (String) jSONObject.opt("packageName");
        String str3 = (String) jSONObject.opt("action");
        String str4 = (String) jSONObject.opt("uri");
        String str5 = (String) jSONObject.opt("mimeType");
        JSONArray jSONArray = (JSONArray) jSONObject.opt("categories");
        Integer num = (Integer) jSONObject.opt("flags");
        JSONArray jSONArray2 = (JSONArray) jSONObject.opt("extras");
        if (str2 != null && str == null && str3 == null && str5 == null) {
            android.content.Intent launchIntentForPackage = C9568a.m1959e().getPackageManager().getLaunchIntentForPackage(str2);
            if (launchIntentForPackage == null || num.intValue() <= -1) {
                return launchIntentForPackage;
            }
            launchIntentForPackage.addFlags(num.intValue());
            return launchIntentForPackage;
        }
        android.content.Intent intent = new android.content.Intent();
        if (str != null && str2 != null) {
            intent.setClassName(str2, str);
        }
        if (str3 != null) {
            intent.setAction(str3);
        }
        if (str4 != null) {
            intent.setData(Uri.parse(str4));
        }
        if (str5 != null) {
            intent.setType(str5);
        }
        if (num != null && num.intValue() > -1) {
            intent.setFlags(num.intValue());
        }
        if (m2257a(intent, jSONArray)) {
            if (m2255b(intent, jSONArray2)) {
                return intent;
            }
            throw new C9457a(IntentError.COULDNT_PARSE_EXTRAS, jSONArray2);
        }
        throw new C9457a(IntentError.COULDNT_PARSE_CATEGORIES, jSONArray);
    }

    /* renamed from: a */
    private static boolean m2259a(android.content.Intent intent) {
        return C9568a.m1959e().getPackageManager().resolveActivity(intent, 0) != null;
    }

    /* renamed from: a */
    private static boolean m2258a(android.content.Intent intent, String str, Object obj) {
        if (obj instanceof String) {
            intent.putExtra(str, (String) obj);
            return true;
        } else if (obj instanceof Integer) {
            intent.putExtra(str, ((Integer) obj).intValue());
            return true;
        } else if (obj instanceof Double) {
            intent.putExtra(str, ((Double) obj).doubleValue());
            return true;
        } else if (obj instanceof Boolean) {
            intent.putExtra(str, ((Boolean) obj).booleanValue());
            return true;
        } else {
            C9549a.m2017c("Unable to parse launch intent extra " + str);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m2257a(android.content.Intent intent, JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return true;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                intent.addCategory(jSONArray.getString(i));
            } catch (Exception e) {
                C9549a.m2023a("Couldn't parse categories for intent", e);
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m2255b(android.content.Intent intent, JSONArray jSONArray) {
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    if (!m2258a(intent, jSONObject.getString("key"), jSONObject.get("value"))) {
                        return false;
                    }
                } catch (Exception e) {
                    C9549a.m2023a("Couldn't parse extras", e);
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @WebViewExposed
    public static void canOpenIntent(JSONObject jSONObject, C9644l c9644l) {
        try {
            c9644l.m1736a(Boolean.valueOf(m2259a(m2256a(jSONObject))));
        } catch (C9457a e) {
            C9549a.m2023a("Couldn't resolve intent", e);
            c9644l.m1737a(e.m2254a(), e.m2253b());
        }
    }

    @WebViewExposed
    public static void canOpenIntents(JSONArray jSONArray, C9644l c9644l) {
        JSONObject jSONObject = new JSONObject();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            try {
                jSONObject.put(optJSONObject.optString(FacebookAdapter.KEY_ID), m2259a(m2256a(optJSONObject)));
            } catch (C9457a e) {
                C9549a.m2023a("Exception parsing intent", e);
                c9644l.m1737a(e.m2254a(), e.m2253b());
                return;
            } catch (JSONException e2) {
                c9644l.m1737a(IntentError.JSON_EXCEPTION, e2.getMessage());
                return;
            }
        }
        c9644l.m1736a(jSONObject);
    }

    @WebViewExposed
    public static void launch(JSONObject jSONObject, C9644l c9644l) {
        android.content.Intent intent;
        String str = (String) jSONObject.opt("className");
        String str2 = (String) jSONObject.opt("packageName");
        String str3 = (String) jSONObject.opt("action");
        String str4 = (String) jSONObject.opt("uri");
        String str5 = (String) jSONObject.opt("mimeType");
        JSONArray jSONArray = (JSONArray) jSONObject.opt("categories");
        Integer num = (Integer) jSONObject.opt("flags");
        JSONArray jSONArray2 = (JSONArray) jSONObject.opt("extras");
        if (str2 != null && str == null && str3 == null && str5 == null) {
            intent = C9568a.m1959e().getPackageManager().getLaunchIntentForPackage(str2);
            if (intent != null && num.intValue() > -1) {
                intent.addFlags(num.intValue());
            }
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            if (str != null && str2 != null) {
                intent2.setClassName(str2, str);
            }
            if (str3 != null) {
                intent2.setAction(str3);
            }
            if (str4 != null && str5 != null) {
                intent2.setDataAndType(Uri.parse(str4), str5);
            } else if (str4 != null) {
                intent2.setData(Uri.parse(str4));
            } else if (str5 != null) {
                intent2.setType(str5);
            }
            if (num != null && num.intValue() > -1) {
                intent2.setFlags(num.intValue());
            }
            if (!m2257a(intent2, jSONArray)) {
                c9644l.m1737a(IntentError.COULDNT_PARSE_CATEGORIES, jSONArray);
            }
            if (!m2255b(intent2, jSONArray2)) {
                c9644l.m1737a(IntentError.COULDNT_PARSE_EXTRAS, jSONArray2);
            }
            intent = intent2;
        }
        if (intent == null) {
            c9644l.m1737a(IntentError.INTENT_WAS_NULL, new Object[0]);
        } else if (m2260a() == null) {
            c9644l.m1737a(IntentError.ACTIVITY_WAS_NULL, new Object[0]);
        } else {
            m2260a().startActivity(intent);
            c9644l.m1736a(new Object[0]);
        }
    }

    public static void removeActiveActivity(Activity activity) {
        WeakReference<Activity> weakReference = f18575a;
        if (weakReference == null || weakReference.get() == null || activity == null || !activity.equals(f18575a.get())) {
            return;
        }
        f18575a = null;
    }

    public static void setActiveActivity(Activity activity) {
        if (activity == null) {
            f18575a = null;
        } else {
            f18575a = new WeakReference<>(activity);
        }
    }
}
