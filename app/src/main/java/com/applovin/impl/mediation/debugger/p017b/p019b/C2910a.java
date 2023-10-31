package com.applovin.impl.mediation.debugger.p017b.p019b;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.b.a */
/* loaded from: classes.dex */
public class C2910a {

    /* renamed from: a */
    private final String f7071a;

    /* renamed from: b */
    private final String f7072b;

    /* renamed from: c */
    private final boolean f7073c;

    public C2910a(JSONObject jSONObject, C3214m c3214m) {
        this.f7071a = JsonUtils.getString(jSONObject, "name", "");
        this.f7072b = JsonUtils.getString(jSONObject, "description", "");
        List list = JsonUtils.getList(jSONObject, "existence_classes", null);
        this.f7073c = list != null ? Utils.checkClassesExistence(list) : Utils.checkClassExistence(JsonUtils.getString(jSONObject, "existence_class", ""));
    }

    /* renamed from: a */
    public static boolean m8405a(String str, String str2, String str3) {
        if (str == null) {
            return true;
        }
        if (str2 == null || Utils.compare(str2, str) != 1) {
            return str3 == null || Utils.compare(str3, str) != -1;
        }
        return false;
    }

    /* renamed from: a */
    public String m8406a() {
        return this.f7071a;
    }

    /* renamed from: b */
    public String m8404b() {
        return this.f7072b;
    }

    /* renamed from: c */
    public boolean m8403c() {
        return this.f7073c;
    }
}
