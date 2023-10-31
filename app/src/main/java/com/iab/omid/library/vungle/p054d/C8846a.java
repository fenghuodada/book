package com.iab.omid.library.vungle.p054d;

import android.content.res.Resources;
import android.graphics.Point;
import android.view.WindowManager;
import androidx.fragment.C1349a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.vungle.d.a */
/* loaded from: classes3.dex */
public final class C8846a {

    /* renamed from: a */
    public static WindowManager f16851a;

    /* renamed from: b */
    public static final String[] f16852b = {"x", "y", "width", "height"};

    /* renamed from: c */
    public static float f16853c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: a */
    public static JSONObject m2933a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", i / f16853c);
            jSONObject.put("y", i2 / f16853c);
            jSONObject.put("width", i3 / f16853c);
            jSONObject.put("height", i4 / f16853c);
        } catch (JSONException e) {
            C1349a.m10610a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m2932b(JSONObject jSONObject) {
        float f;
        float f2;
        Point point;
        if (f16851a != null) {
            f16851a.getDefaultDisplay().getRealSize(new Point(0, 0));
            float f3 = f16853c;
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
    public static void m2931c(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            C1349a.m10610a("JSONException during JSONObject.put for name [" + str + "]", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m2930d(@androidx.annotation.NonNull org.json.JSONObject r9, @androidx.annotation.Nullable org.json.JSONObject r10) {
        /*
            r0 = 1
            if (r9 != 0) goto L6
            if (r10 != 0) goto L6
            return r0
        L6:
            r1 = 0
            if (r9 == 0) goto Lca
            if (r10 != 0) goto Ld
            goto Lca
        Ld:
            java.lang.String[] r2 = com.iab.omid.library.vungle.p054d.C8846a.f16852b
            r3 = r1
        L10:
            r4 = 4
            if (r3 >= r4) goto L26
            r4 = r2[r3]
            double r5 = r9.optDouble(r4)
            double r7 = r10.optDouble(r4)
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 == 0) goto L23
            r2 = r1
            goto L27
        L23:
            int r3 = r3 + 1
            goto L10
        L26:
            r2 = r0
        L27:
            if (r2 == 0) goto Lc8
            java.lang.String r2 = "adSessionId"
            java.lang.String r3 = ""
            java.lang.String r4 = r9.optString(r2, r3)
            java.lang.String r2 = r10.optString(r2, r3)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto Lc8
            java.lang.String r2 = "isFriendlyObstructionFor"
            org.json.JSONArray r4 = r9.optJSONArray(r2)
            org.json.JSONArray r2 = r10.optJSONArray(r2)
            if (r4 != 0) goto L4a
            if (r2 != 0) goto L4a
            goto L7e
        L4a:
            if (r4 != 0) goto L4f
            if (r2 != 0) goto L4f
            goto L5e
        L4f:
            if (r4 == 0) goto L60
            if (r2 != 0) goto L54
            goto L60
        L54:
            int r5 = r4.length()
            int r6 = r2.length()
            if (r5 != r6) goto L60
        L5e:
            r5 = r0
            goto L61
        L60:
            r5 = r1
        L61:
            if (r5 != 0) goto L64
            goto L79
        L64:
            r5 = r1
        L65:
            int r6 = r4.length()
            if (r5 >= r6) goto L7e
            java.lang.String r6 = r4.optString(r5, r3)
            java.lang.String r7 = r2.optString(r5, r3)
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L7b
        L79:
            r2 = r1
            goto L7f
        L7b:
            int r5 = r5 + 1
            goto L65
        L7e:
            r2 = r0
        L7f:
            if (r2 == 0) goto Lc8
            java.lang.String r2 = "childViews"
            org.json.JSONArray r9 = r9.optJSONArray(r2)
            org.json.JSONArray r10 = r10.optJSONArray(r2)
            if (r9 != 0) goto L90
            if (r10 != 0) goto L90
            goto Lc4
        L90:
            if (r9 != 0) goto L95
            if (r10 != 0) goto L95
            goto La4
        L95:
            if (r9 == 0) goto La6
            if (r10 != 0) goto L9a
            goto La6
        L9a:
            int r2 = r9.length()
            int r3 = r10.length()
            if (r2 != r3) goto La6
        La4:
            r2 = r0
            goto La7
        La6:
            r2 = r1
        La7:
            if (r2 != 0) goto Laa
            goto Lbf
        Laa:
            r2 = r1
        Lab:
            int r3 = r9.length()
            if (r2 >= r3) goto Lc4
            org.json.JSONObject r3 = r9.optJSONObject(r2)
            org.json.JSONObject r4 = r10.optJSONObject(r2)
            boolean r3 = m2930d(r3, r4)
            if (r3 != 0) goto Lc1
        Lbf:
            r9 = r1
            goto Lc5
        Lc1:
            int r2 = r2 + 1
            goto Lab
        Lc4:
            r9 = r0
        Lc5:
            if (r9 == 0) goto Lc8
            goto Lc9
        Lc8:
            r0 = r1
        Lc9:
            return r0
        Lca:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iab.omid.library.vungle.p054d.C8846a.m2930d(org.json.JSONObject, org.json.JSONObject):boolean");
    }
}
