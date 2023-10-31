package com.applovin.impl.mediation.debugger.p017b.p018a;

import androidx.annotation.Nullable;
import com.applovin.impl.mediation.debugger.p017b.p019b.C2911b;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.a */
/* loaded from: classes.dex */
public class C2905a implements Comparable<C2905a> {

    /* renamed from: a */
    private final String f7051a;

    /* renamed from: b */
    private final String f7052b;

    /* renamed from: c */
    private final MaxAdFormat f7053c;

    /* renamed from: d */
    private final C2907c f7054d;

    /* renamed from: e */
    private final List<C2907c> f7055e;

    public C2905a(JSONObject jSONObject, Map<String, C2911b> map, C3214m c3214m) {
        this.f7051a = JsonUtils.getString(jSONObject, "name", "");
        this.f7052b = JsonUtils.getString(jSONObject, "display_name", "");
        this.f7053c = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, "format", null));
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "waterfalls", new JSONArray());
        this.f7055e = new ArrayList(jSONArray.length());
        C2907c c2907c = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject2 != null) {
                C2907c c2907c2 = new C2907c(jSONObject2, map, this.f7053c, c3214m);
                this.f7055e.add(c2907c2);
                if (c2907c == null && c2907c2.m8414c()) {
                    c2907c = c2907c2;
                }
            }
        }
        this.f7054d = c2907c;
    }

    @Nullable
    /* renamed from: g */
    private C2907c m8423g() {
        if (this.f7055e.isEmpty()) {
            return null;
        }
        return this.f7055e.get(0);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(C2905a c2905a) {
        return this.f7052b.compareToIgnoreCase(c2905a.f7052b);
    }

    /* renamed from: a */
    public String m8430a() {
        return this.f7051a;
    }

    /* renamed from: b */
    public String m8428b() {
        return this.f7052b;
    }

    /* renamed from: c */
    public String m8427c() {
        MaxAdFormat maxAdFormat = this.f7053c;
        return maxAdFormat != null ? maxAdFormat.getLabel() : "Unknown";
    }

    /* renamed from: d */
    public MaxAdFormat m8426d() {
        return this.f7053c;
    }

    @Nullable
    /* renamed from: e */
    public C2907c m8425e() {
        C2907c c2907c = this.f7054d;
        return c2907c != null ? c2907c : m8423g();
    }

    /* renamed from: f */
    public String m8424f() {
        return "\n---------- " + this.f7052b + " ----------\nIdentifier - " + this.f7051a + "\nFormat     - " + m8427c();
    }
}
