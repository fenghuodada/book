package com.applovin.impl.mediation.p014c;

import com.applovin.impl.mediation.p011a.C2825c;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p030b.C3105c;
import com.applovin.impl.sdk.p033e.AbstractC3134ab;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.g */
/* loaded from: classes.dex */
public class C2887g extends AbstractC3134ab {

    /* renamed from: a */
    private final C2825c f6992a;

    public C2887g(C2825c c2825c, C3214m c3214m) {
        super("TaskValidateMaxReward", c3214m);
        this.f6992a = c2825c;
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3187y
    /* renamed from: a */
    public String mo7568a() {
        return "2.0/mvr";
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3187y
    /* renamed from: a */
    public void mo7567a(int i) {
        super.mo7567a(i);
        this.f6992a.m8766a(C3105c.m7823a((i < 400 || i >= 500) ? "network_timeout" : "rejected"));
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3134ab
    /* renamed from: a */
    public void mo7695a(C3105c c3105c) {
        this.f6992a.m8766a(c3105c);
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3187y
    /* renamed from: a */
    public void mo7566a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f6992a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f6992a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f6992a.m8729Z());
        JsonUtils.putString(jSONObject, FirebaseAnalytics.Param.AD_FORMAT, this.f6992a.getFormat().getLabel());
        String m8771D = this.f6992a.m8771D();
        if (!StringUtils.isValidString(m8771D)) {
            m8771D = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", m8771D);
        String m8772C = this.f6992a.m8772C();
        if (!StringUtils.isValidString(m8772C)) {
            m8772C = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", m8772C);
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3134ab
    /* renamed from: b */
    public boolean mo7693b() {
        return this.f6992a.m8770E();
    }
}
