package com.applovin.impl.mediation.debugger.p017b.p018a;

import androidx.annotation.Nullable;
import com.applovin.impl.mediation.debugger.p016a.C2903b;
import com.applovin.impl.mediation.debugger.p017b.p019b.C2911b;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAdFormat;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.b */
/* loaded from: classes.dex */
public class C2906b {

    /* renamed from: a */
    private final C2908d f7056a;

    /* renamed from: b */
    private final C2909e f7057b;
    @Nullable

    /* renamed from: c */
    private final List<C2909e> f7058c;

    /* renamed from: d */
    private final List<C2903b> f7059d;

    public C2906b(JSONObject jSONObject, MaxAdFormat maxAdFormat, C2911b c2911b, C3214m c3214m) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(jSONObject, "bidder_placement", (JSONObject) null);
        if (jSONObject2 != null) {
            this.f7057b = new C2909e(jSONObject2, c3214m);
        } else {
            this.f7057b = null;
        }
        this.f7056a = new C2908d(JsonUtils.getString(jSONObject, "name", ""), JsonUtils.getString(jSONObject, "display_name", ""), jSONObject2 != null, c2911b);
        this.f7059d = c2911b.m8373x() ? new ArrayList() : null;
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "placements", new JSONArray());
        this.f7058c = new ArrayList(jSONArray.length());
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject3 = JsonUtils.getJSONObject(jSONArray, i, (JSONObject) null);
            if (jSONObject3 != null) {
                this.f7058c.add(new C2909e(jSONObject3, c3214m));
            }
            List<C2903b> list = this.f7059d;
            if (list != null) {
                list.add(new C2903b(JsonUtils.getString(jSONObject3, FacebookAdapter.KEY_ID, ""), JsonUtils.getJSONObject(jSONObject3, "amazon_marketplace", (JSONObject) null), maxAdFormat));
            }
        }
    }

    /* renamed from: a */
    public C2908d m8422a() {
        return this.f7056a;
    }

    @Nullable
    /* renamed from: b */
    public C2909e m8421b() {
        return this.f7057b;
    }

    /* renamed from: c */
    public boolean m8420c() {
        return this.f7057b != null;
    }

    /* renamed from: d */
    public List<C2909e> m8419d() {
        return this.f7058c;
    }

    /* renamed from: e */
    public List<C2903b> m8418e() {
        return this.f7059d;
    }
}
