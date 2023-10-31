package com.applovin.impl.mediation.debugger.p017b.p018a;

import com.applovin.impl.mediation.debugger.p016a.C2903b;
import com.applovin.impl.mediation.debugger.p017b.p019b.C2911b;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.c */
/* loaded from: classes.dex */
public class C2907c {

    /* renamed from: a */
    private final String f7060a;

    /* renamed from: b */
    private final boolean f7061b;

    /* renamed from: c */
    private final List<C2906b> f7062c;

    /* renamed from: d */
    private final List<C2906b> f7063d;

    /* renamed from: e */
    private final List<C2903b> f7064e;

    public C2907c(JSONObject jSONObject, Map<String, C2911b> map, MaxAdFormat maxAdFormat, C3214m c3214m) {
        C2906b c2906b;
        this.f7060a = JsonUtils.getString(jSONObject, "name", "");
        this.f7061b = JsonUtils.getBoolean(jSONObject, "default", Boolean.FALSE).booleanValue();
        this.f7062c = m8416a("bidders", jSONObject, map, maxAdFormat, c3214m);
        List<C2906b> m8416a = m8416a("waterfall", jSONObject, map, maxAdFormat, c3214m);
        this.f7063d = m8416a;
        Iterator<C2906b> it = m8416a.iterator();
        while (true) {
            if (!it.hasNext()) {
                c2906b = null;
                break;
            }
            c2906b = it.next();
            if (c2906b.m8422a().m8409c().m8373x()) {
                break;
            }
        }
        this.f7064e = c2906b != null ? c2906b.m8418e() : null;
    }

    /* renamed from: a */
    private List<C2906b> m8416a(String str, JSONObject jSONObject, Map<String, C2911b> map, MaxAdFormat maxAdFormat, C3214m c3214m) {
        C2911b c2911b;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null && (c2911b = map.get(JsonUtils.getString(jSONObject2, "adapter_class", ""))) != null) {
                arrayList.add(new C2906b(jSONObject2, maxAdFormat, c2911b, c3214m));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<C2906b> m8417a() {
        return this.f7062c;
    }

    /* renamed from: b */
    public List<C2906b> m8415b() {
        return this.f7063d;
    }

    /* renamed from: c */
    public boolean m8414c() {
        return this.f7061b;
    }

    /* renamed from: d */
    public List<C2903b> m8413d() {
        return this.f7064e;
    }
}
