package com.applovin.impl.mediation.p014c;

import com.applovin.impl.mediation.p011a.C2825c;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p030b.C3105c;
import com.applovin.impl.sdk.p033e.AbstractC3183w;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.mediation.c.f */
/* loaded from: classes.dex */
public class C2886f extends AbstractC3183w {

    /* renamed from: a */
    private final C2825c f6991a;

    public C2886f(C2825c c2825c, C3214m c3214m) {
        super("TaskReportMaxReward", c3214m);
        this.f6991a = c2825c;
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3187y
    /* renamed from: a */
    public String mo7568a() {
        return "2.0/mcr";
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3187y
    /* renamed from: a */
    public void mo7567a(int i) {
        super.mo7567a(i);
        if (C3349v.m6862a()) {
            m7705a("Failed to report reward for mediated ad: " + this.f6991a + " - error code: " + i);
        }
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3187y
    /* renamed from: a */
    public void mo7566a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "ad_unit_id", this.f6991a.getAdUnitId());
        JsonUtils.putString(jSONObject, "placement", this.f6991a.getPlacement());
        JsonUtils.putString(jSONObject, "custom_data", this.f6991a.m8729Z());
        String m8771D = this.f6991a.m8771D();
        if (!StringUtils.isValidString(m8771D)) {
            m8771D = "NO_MCODE";
        }
        JsonUtils.putString(jSONObject, "mcode", m8771D);
        String m8772C = this.f6991a.m8772C();
        if (!StringUtils.isValidString(m8772C)) {
            m8772C = "NO_BCODE";
        }
        JsonUtils.putString(jSONObject, "bcode", m8772C);
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3183w
    /* renamed from: b */
    public C3105c mo7579b() {
        return this.f6991a.m8768G();
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3183w
    /* renamed from: b */
    public void mo7578b(JSONObject jSONObject) {
        m7705a("Reported reward successfully for mediated ad: " + this.f6991a);
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3183w
    /* renamed from: c */
    public void mo7577c() {
        if (C3349v.m6862a()) {
            m7700d("No reward result was found for mediated ad: " + this.f6991a);
        }
    }
}
