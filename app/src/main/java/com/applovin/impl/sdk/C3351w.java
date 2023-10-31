package com.applovin.impl.sdk;

import androidx.annotation.Nullable;
import com.applovin.impl.mediation.p011a.AbstractC2823a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.w */
/* loaded from: classes.dex */
public class C3351w {

    /* renamed from: a */
    private final C3214m f8828a;

    /* renamed from: b */
    private final C3349v f8829b;

    /* renamed from: c */
    private final Map<String, AbstractC2823a> f8830c = new HashMap(4);

    /* renamed from: d */
    private final Object f8831d = new Object();

    public C3351w(C3214m c3214m) {
        this.f8828a = c3214m;
        this.f8829b = c3214m.m7487A();
    }

    @Nullable
    /* renamed from: a */
    public AbstractC2823a m6843a(String str) {
        AbstractC2823a abstractC2823a;
        synchronized (this.f8831d) {
            abstractC2823a = this.f8830c.get(str);
        }
        return abstractC2823a;
    }

    /* renamed from: a */
    public void m6844a(AbstractC2823a abstractC2823a) {
        synchronized (this.f8831d) {
            if (C3349v.m6862a()) {
                C3349v c3349v = this.f8829b;
                c3349v.m6855b("MediationWaterfallWinnerTracker", "Tracking winning ad: " + abstractC2823a);
            }
            this.f8830c.put(abstractC2823a.getAdUnitId(), abstractC2823a);
        }
    }

    /* renamed from: b */
    public void m6842b(AbstractC2823a abstractC2823a) {
        synchronized (this.f8831d) {
            String adUnitId = abstractC2823a.getAdUnitId();
            AbstractC2823a abstractC2823a2 = this.f8830c.get(adUnitId);
            if (abstractC2823a == abstractC2823a2) {
                if (C3349v.m6862a()) {
                    C3349v c3349v = this.f8829b;
                    c3349v.m6855b("MediationWaterfallWinnerTracker", "Clearing previous winning ad: " + abstractC2823a2);
                }
                this.f8830c.remove(adUnitId);
            } else if (C3349v.m6862a()) {
                C3349v c3349v2 = this.f8829b;
                c3349v2.m6855b("MediationWaterfallWinnerTracker", "Previous winner not cleared for ad: " + abstractC2823a + " , since it could have already been updated with a new ad: " + abstractC2823a2);
            }
        }
    }
}
