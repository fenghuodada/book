package com.applovin.impl.sdk.p033e;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.p029ad.AbstractC3080e;
import com.applovin.impl.sdk.p030b.C3105c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.Collections;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.e.aa */
/* loaded from: classes.dex */
public class C3133aa extends AbstractC3134ab {

    /* renamed from: a */
    private final AbstractC3080e f8196a;

    /* renamed from: c */
    private final AppLovinAdRewardListener f8197c;

    public C3133aa(AbstractC3080e abstractC3080e, AppLovinAdRewardListener appLovinAdRewardListener, C3214m c3214m) {
        super("TaskValidateAppLovinReward", c3214m);
        this.f8196a = abstractC3080e;
        this.f8197c = appLovinAdRewardListener;
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3187y
    /* renamed from: a */
    public String mo7568a() {
        return "2.0/vr";
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3187y
    /* renamed from: a */
    public void mo7567a(int i) {
        String str;
        super.mo7567a(i);
        if (i < 400 || i >= 500) {
            this.f8197c.validationRequestFailed(this.f8196a, i);
            str = "network_timeout";
        } else {
            this.f8197c.userRewardRejected(this.f8196a, Collections.emptyMap());
            str = "rejected";
        }
        this.f8196a.m7943a(C3105c.m7823a(str));
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3134ab
    /* renamed from: a */
    public void mo7695a(C3105c c3105c) {
        this.f8196a.m7943a(c3105c);
        String m7821b = c3105c.m7821b();
        Map<String, String> m7824a = c3105c.m7824a();
        if (m7821b.equals("accepted")) {
            this.f8197c.userRewardVerified(this.f8196a, m7824a);
        } else if (m7821b.equals("quota_exceeded")) {
            this.f8197c.userOverQuota(this.f8196a, m7824a);
        } else if (m7821b.equals("rejected")) {
            this.f8197c.userRewardRejected(this.f8196a, m7824a);
        } else {
            this.f8197c.validationRequestFailed(this.f8196a, AppLovinErrorCodes.INCENTIVIZED_UNKNOWN_SERVER_ERROR);
        }
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3187y
    /* renamed from: a */
    public void mo7566a(JSONObject jSONObject) {
        JsonUtils.putString(jSONObject, "zone_id", this.f8196a.getAdZone().m7991a());
        String clCode = this.f8196a.getClCode();
        if (!StringUtils.isValidString(clCode)) {
            clCode = "NO_CLCODE";
        }
        JsonUtils.putString(jSONObject, "clcode", clCode);
    }

    @Override // com.applovin.impl.sdk.p033e.AbstractC3134ab
    /* renamed from: b */
    public boolean mo7693b() {
        return this.f8196a.m7937aE();
    }
}
