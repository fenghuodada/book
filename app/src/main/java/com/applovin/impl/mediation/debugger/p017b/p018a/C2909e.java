package com.applovin.impl.mediation.debugger.p017b.p018a;

import androidx.annotation.Nullable;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.google.ads.mediation.facebook.FacebookAdapter;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.debugger.b.a.e */
/* loaded from: classes.dex */
public class C2909e {

    /* renamed from: a */
    private final String f7069a;
    @Nullable

    /* renamed from: b */
    private final String f7070b;

    public C2909e(JSONObject jSONObject, C3214m c3214m) {
        this.f7069a = JsonUtils.getString(jSONObject, FacebookAdapter.KEY_ID, "");
        this.f7070b = JsonUtils.getString(jSONObject, "price", null);
    }

    /* renamed from: a */
    public String m8408a() {
        return this.f7069a;
    }

    @Nullable
    /* renamed from: b */
    public String m8407b() {
        return this.f7070b;
    }
}
