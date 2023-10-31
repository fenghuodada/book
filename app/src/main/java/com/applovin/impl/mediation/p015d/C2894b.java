package com.applovin.impl.mediation.p015d;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p031c.C3108a;
import com.applovin.impl.sdk.p031c.C3111d;
import com.applovin.impl.sdk.utils.C3295h;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.d.b */
/* loaded from: classes.dex */
public class C2894b extends C3295h {

    /* renamed from: a */
    private static final String[] f7021a = {"ads", "settings", "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters"};

    /* renamed from: b */
    private static final String[] f7022b = {"ads", "settings", "signal_providers"};

    /* renamed from: a */
    public static String m8469a(C3214m c3214m) {
        return C3295h.m7009a((String) c3214m.m7456a(C3108a.f7767c), "1.0/mediate", c3214m);
    }

    /* renamed from: a */
    public static void m8468a(JSONObject jSONObject, C3214m c3214m) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(shallowCopy, f7021a);
            c3214m.m7453a((C3111d<C3111d<String>>) C3111d.f8088x, (C3111d<String>) shallowCopy.toString());
        }
    }

    /* renamed from: b */
    public static String m8466b(C3214m c3214m) {
        return C3295h.m7009a((String) c3214m.m7456a(C3108a.f7768d), "1.0/mediate", c3214m);
    }

    /* renamed from: b */
    public static void m8465b(JSONObject jSONObject, C3214m c3214m) {
        if (jSONObject.length() == 0) {
            return;
        }
        if (!JsonUtils.valueExists(jSONObject, "auto_init_adapters") && !JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
            c3214m.m7422b(C3111d.f8089y);
            return;
        }
        JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
        JsonUtils.removeObjectsForKeys(shallowCopy, f7022b);
        c3214m.m7453a((C3111d<C3111d<String>>) C3111d.f8089y, (C3111d<String>) shallowCopy.toString());
    }

    /* renamed from: c */
    public static String m8463c(C3214m c3214m) {
        return C3295h.m7009a((String) c3214m.m7456a(C3108a.f7767c), "1.0/mediate_debug", c3214m);
    }

    /* renamed from: d */
    public static String m8461d(C3214m c3214m) {
        return C3295h.m7009a((String) c3214m.m7456a(C3108a.f7768d), "1.0/mediate_debug", c3214m);
    }
}
