package com.unity3d.services.core.misc;

import com.unity3d.services.core.log.C9549a;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.misc.e */
/* loaded from: classes3.dex */
public class C9559e {

    /* renamed from: a */
    private final JSONObject f18925a;

    public C9559e(JSONObject jSONObject) {
        this.f18925a = jSONObject;
    }

    /* renamed from: a */
    private boolean m2000a(String str, List<String> list, List<String> list2) {
        if (!list2.contains(str) && list.size() > 0) {
            return list.contains(str);
        }
        return false;
    }

    /* renamed from: a */
    public JSONObject m2002a(String str, C9560f c9560f) {
        return c9560f == null ? new JSONObject() : m1999a(str, c9560f.m1996c(), c9560f.m1998a(), c9560f.m1997b());
    }

    /* renamed from: a */
    public JSONObject m1999a(String str, List<String> list, List<String> list2, List<String> list3) {
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<String> keys = this.f18925a.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (m2000a(next, list, list3)) {
                    Object opt = this.f18925a.opt(next);
                    if (opt instanceof JSONObject) {
                        new C9559e((JSONObject) opt).m2001a(str, next, jSONObject, list2, list3);
                    } else {
                        jSONObject.put(next, opt);
                    }
                }
            }
        } catch (JSONException e) {
            C9549a.m2018b("Could not flatten JSON: %s", e.getMessage());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public void m2001a(String str, String str2, JSONObject jSONObject, List<String> list, List<String> list2) throws JSONException {
        Iterator<String> keys = this.f18925a.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!list2.contains(next)) {
                Object obj = this.f18925a.get(next);
                String format = list.contains(next) ? str2 : String.format("%s%s%s", str2, str, next);
                if (obj instanceof JSONObject) {
                    new C9559e((JSONObject) obj).m2001a(str, format, jSONObject, list, list2);
                } else {
                    jSONObject.put(format, obj);
                }
            }
        }
    }
}
