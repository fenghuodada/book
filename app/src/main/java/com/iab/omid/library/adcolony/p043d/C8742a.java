package com.iab.omid.library.adcolony.p043d;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.cardview.C0463a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.adcolony.d.a */
/* loaded from: classes3.dex */
public final class C8742a {

    /* renamed from: a */
    public static WindowManager f16623a;

    /* renamed from: b */
    public static final String[] f16624b = {"x", "y", "width", "height"};

    /* renamed from: c */
    public static float f16625c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: a */
    public static JSONObject m3176a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / f16625c);
            jSONObject.put("y", i2 / f16625c);
            jSONObject.put("width", i3 / f16625c);
            jSONObject.put("height", i4 / f16625c);
        } catch (JSONException e) {
            C0463a.m12440a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m3175b(JSONObject jSONObject) {
        float f;
        float f2;
        Point point;
        if (f16623a != null) {
            f16623a.getDefaultDisplay().getRealSize(new Point(0, 0));
            float f3 = f16625c;
            f = point.x / f3;
            f2 = point.y / f3;
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        try {
            jSONObject.put("width", f);
            jSONObject.put("height", f2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public static void m3174c(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (NullPointerException | JSONException e) {
            C0463a.m12440a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m3173d(@androidx.annotation.NonNull org.json.JSONObject r9, @androidx.annotation.Nullable org.json.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iab.omid.library.adcolony.p043d.C8742a.m3173d(org.json.JSONObject, org.json.JSONObject):boolean");
    }
}
