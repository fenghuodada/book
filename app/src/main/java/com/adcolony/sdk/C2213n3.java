package com.adcolony.sdk;

import java.util.HashMap;

/* renamed from: com.adcolony.sdk.n3 */
/* loaded from: classes.dex */
public final class C2213n3 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2058b3 f5388a;

    public C2213n3(C2058b3 c2058b3) {
        this.f5388a = c2058b3;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        C2365y c2365y;
        C2058b3 c2058b3 = this.f5388a;
        if (!c2058b3.f4961C) {
            String m9436w = c2100e2.f5098b.m9436w("zone_id");
            HashMap<String, C2365y> hashMap = c2058b3.f5003u;
            if (hashMap.containsKey(m9436w)) {
                c2365y = hashMap.get(m9436w);
            } else {
                C2365y c2365y2 = new C2365y(m9436w);
                hashMap.put(m9436w, c2365y2);
                c2365y = c2365y2;
            }
            c2365y.getClass();
            C2367y1 c2367y1 = c2100e2.f5098b;
            C2367y1 m9439t = c2367y1.m9439t("reward");
            c2365y.f5683b = m9439t.m9436w("reward_name");
            c2365y.f5686e = m9439t.m9441r("reward_amount");
            m9439t.m9441r("views_per_reward");
            m9439t.m9441r("views_until_reward");
            c2365y.f5688g = c2367y1.m9444o("rewarded");
            c2367y1.m9441r("status");
            c2365y.f5684c = c2367y1.m9441r("type");
            c2365y.f5685d = c2367y1.m9441r("play_interval");
            c2365y.f5682a = c2367y1.m9436w("zone_id");
        }
    }
}
