package com.applovin.impl.sdk.p033e;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p030b.C3105c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.v */
/* loaded from: classes.dex */
public class C3182v extends AbstractC3183w {

    /* renamed from: a */
    private final AbstractC3080e f8303a;

    public C3182v(AbstractC3080e abstractC3080e, C3214m c3214m) {
        super("TaskReportAppLovinReward", c3214m);
        this.f8303a = abstractC3080e;
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3187y
    /* renamed from: a */
    public String mo7568a() {
        return "2.0/cr";
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3187y
    /* renamed from: a */
    public void mo7567a(int i) {
        super.mo7567a(i);
        if (C3349v.m6862a()) {
            m7700d("Failed to report reward for ad: " + this.f8303a + " - error code: " + i);
        }
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3187y
    /* renamed from: a */
    public void mo7566a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f8303a.getAdZone().m7991a());
        JsonUtils.putInt(jSONObject, "fire_percent", this.f8303a.m7925ae());
        String clCode = this.f8303a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3183w
    /* renamed from: b */
    public C3105c mo7579b() {
        return this.f8303a.m7935aG();
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3183w
    /* renamed from: b */
    public void mo7578b(JSONObject jSONObject) {
        if (C3349v.m6862a()) {
            m7705a("Reported reward successfully for ad: " + this.f8303a);
        }
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3183w
    /* renamed from: c */
    public void mo7577c() {
        if (C3349v.m6862a()) {
            m7700d("No reward result was found for ad: " + this.f8303a);
        }
    }
}
