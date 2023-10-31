package com.applovin.impl.sdk.p033e;

import com.applovin.impl.p008a.C2657e;
import com.applovin.impl.p008a.C2665l;
import com.applovin.impl.p008a.EnumC2658f;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.network.C3245c;
import com.applovin.impl.sdk.p031c.C3109b;
import com.applovin.impl.sdk.utils.C3343r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.applovin.impl.sdk.e.x */
/* loaded from: classes.dex */
public class C3185x extends AbstractRunnableC3131a {

    /* renamed from: a */
    private final C2657e f8305a;

    /* renamed from: c */
    private final AppLovinAdLoadListener f8306c;

    public C3185x(C2657e c2657e, AppLovinAdLoadListener appLovinAdLoadListener, C3214m c3214m) {
        super("TaskResolveVastWrapper", c3214m);
        this.f8306c = appLovinAdLoadListener;
        this.f8305a = c2657e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m7574a(int i) {
        if (C3349v.m6862a()) {
            m7700d("Failed to resolve VAST wrapper due to error code " + i);
        }
        if (i != -1009) {
            C2665l.m9215a(this.f8305a, this.f8306c, i == -1001 ? EnumC2658f.TIMED_OUT : EnumC2658f.GENERAL_WRAPPER_ERROR, i, this.f8192b);
            return;
        }
        AppLovinAdLoadListener appLovinAdLoadListener = this.f8306c;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.failedToReceiveAd(i);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String m9217a = C2665l.m9217a(this.f8305a);
        if (StringUtils.isValidString(m9217a)) {
            if (C3349v.m6862a()) {
                m7705a("Resolving VAST ad with depth " + this.f8305a.m9245a() + " at " + m9217a);
            }
            try {
                this.f8192b.m7469S().m7621a((AbstractRunnableC3131a) new AbstractC3180u<C3343r>(C3245c.m7323a(this.f8192b).mo7186a(m9217a).mo7179b("GET").mo7187a((C3245c.C3246a) C3343r.f8813a).mo7189a(((Integer) this.f8192b.m7456a(C3109b.f8042en)).intValue()).mo7182b(((Integer) this.f8192b.m7456a(C3109b.f8043eo)).intValue()).mo7173c(false).mo7190a(), this.f8192b) { // from class: com.applovin.impl.sdk.e.x.1
                    @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
                    /* renamed from: a */
                    public void mo7327a(int i, String str, C3343r c3343r) {
                        if (C3349v.m6862a()) {
                            m7700d("Unable to resolve VAST wrapper. Server returned " + i);
                        }
                        C3185x.this.m7574a(i);
                    }

                    @Override // com.applovin.impl.sdk.p033e.AbstractC3180u, com.applovin.impl.sdk.network.C3240b.InterfaceC3244c
                    /* renamed from: a */
                    public void mo7326a(C3343r c3343r, int i) {
                        this.f8192b.m7469S().m7621a((AbstractRunnableC3131a) AbstractC3173r.m7594a(c3343r, C3185x.this.f8305a, C3185x.this.f8306c, C3185x.this.f8192b));
                    }
                });
                return;
            } catch (Throwable th) {
                if (C3349v.m6862a()) {
                    m7704a("Unable to resolve VAST wrapper", th);
                }
            }
        } else if (C3349v.m6862a()) {
            m7700d("Resolving VAST failed. Could not find resolution URL");
        }
        m7574a(-1);
    }
}
