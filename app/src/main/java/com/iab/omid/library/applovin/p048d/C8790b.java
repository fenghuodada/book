package com.iab.omid.library.applovin.p048d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.p046b.C8778c;
import com.iab.omid.library.applovin.walking.C8805a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.applovin.d.b */
/* loaded from: classes3.dex */
public class C8790b {

    /* renamed from: b */
    private static WindowManager f16728b;

    /* renamed from: c */
    private static String[] f16729c = {"x", "y", "width", "height"};

    /* renamed from: a */
    static float f16727a = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: com.iab.omid.library.applovin.d.b$a */
    /* loaded from: classes3.dex */
    public static class C8791a {

        /* renamed from: a */
        final float f16730a;

        /* renamed from: b */
        final float f16731b;

        public C8791a(float f, float f2) {
            this.f16730a = f;
            this.f16731b = f2;
        }
    }

    /* renamed from: a */
    public static float m3062a(int i) {
        return i / f16727a;
    }

    /* renamed from: a */
    public static JSONObject m3061a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", m3062a(i));
            jSONObject.put("y", m3062a(i2));
            jSONObject.put("width", m3062a(i3));
            jSONObject.put("height", m3062a(i4));
        } catch (JSONException e) {
            C8792c.m3043a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m3060a(Context context) {
        if (context != null) {
            f16727a = context.getResources().getDisplayMetrics().density;
            f16728b = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: a */
    public static void m3058a(JSONObject jSONObject) {
        C8791a m3052b = m3052b(jSONObject);
        try {
            jSONObject.put("width", m3052b.f16730a);
            jSONObject.put("height", m3052b.f16731b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m3057a(JSONObject jSONObject, C8805a.C8806a c8806a) {
        C8778c m2963a = c8806a.m2963a();
        JSONArray jSONArray = new JSONArray();
        for (String str : c8806a.m2961b()) {
            jSONArray.put(str);
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", m2963a.m3110b());
            jSONObject.put("friendlyObstructionPurpose", m2963a.m3109c());
            jSONObject.put("friendlyObstructionReason", m2963a.m3108d());
        } catch (JSONException e) {
            C8792c.m3043a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: a */
    public static void m3056a(JSONObject jSONObject, Boolean bool) {
        try {
            jSONObject.put("hasWindowFocus", bool);
        } catch (JSONException e) {
            C8792c.m3043a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: a */
    public static void m3055a(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            C8792c.m3043a("Error with setting ad session id", e);
        }
    }

    /* renamed from: a */
    public static void m3054a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C8792c.m3043a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public static void m3053a(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static boolean m3059a(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }

    /* renamed from: b */
    private static C8791a m3052b(JSONObject jSONObject) {
        float f;
        float f2;
        if (f16728b != null) {
            Point point = new Point(0, 0);
            f16728b.getDefaultDisplay().getRealSize(point);
            f = m3062a(point.x);
            f2 = m3062a(point.y);
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        return new C8791a(f, f2);
    }

    /* renamed from: b */
    public static void m3051b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            C8792c.m3043a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: b */
    public static boolean m3050b(@NonNull JSONObject jSONObject, @Nullable JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject == null || jSONObject2 == null) {
            return false;
        }
        return m3049c(jSONObject, jSONObject2) && m3047e(jSONObject, jSONObject2) && m3048d(jSONObject, jSONObject2) && m3046f(jSONObject, jSONObject2) && m3045g(jSONObject, jSONObject2);
    }

    /* renamed from: c */
    private static boolean m3049c(JSONObject jSONObject, JSONObject jSONObject2) {
        String[] strArr;
        for (String str : f16729c) {
            if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m3048d(JSONObject jSONObject, JSONObject jSONObject2) {
        return Boolean.valueOf(jSONObject.optBoolean("hasWindowFocus")).equals(Boolean.valueOf(jSONObject2.optBoolean("hasWindowFocus")));
    }

    /* renamed from: e */
    private static boolean m3047e(JSONObject jSONObject, JSONObject jSONObject2) {
        return jSONObject.optString("adSessionId", "").equals(jSONObject2.optString("adSessionId", ""));
    }

    /* renamed from: f */
    private static boolean m3046f(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m3059a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!optJSONArray.optString(i, "").equals(optJSONArray2.optString(i, ""))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private static boolean m3045g(JSONObject jSONObject, JSONObject jSONObject2) {
        JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("childViews");
        if (optJSONArray == null && optJSONArray2 == null) {
            return true;
        }
        if (m3059a(optJSONArray, optJSONArray2)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                if (!m3050b(optJSONArray.optJSONObject(i), optJSONArray2.optJSONObject(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
