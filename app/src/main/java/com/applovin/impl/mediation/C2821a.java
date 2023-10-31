package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.mediation.p011a.C2825c;
import com.applovin.impl.sdk.C3038a;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.AbstractC3287a;

/* renamed from: com.applovin.impl.mediation.a */
/* loaded from: classes.dex */
public class C2821a extends AbstractC3287a {

    /* renamed from: a */
    private final C3038a f6775a;

    /* renamed from: b */
    private final C3349v f6776b;

    /* renamed from: c */
    private InterfaceC2822a f6777c;

    /* renamed from: d */
    private C2825c f6778d;

    /* renamed from: e */
    private int f6779e;

    /* renamed from: f */
    private boolean f6780f;

    /* renamed from: com.applovin.impl.mediation.a$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2822a {
        /* renamed from: a */
        void mo8603a(C2825c c2825c);
    }

    public C2821a(C3214m c3214m) {
        this.f6776b = c3214m.m7487A();
        this.f6775a = c3214m.m7434af();
    }

    /* renamed from: a */
    public void m8810a() {
        if (C3349v.m6862a()) {
            this.f6776b.m6855b("AdActivityObserver", "Cancelling...");
        }
        this.f6775a.m8067b(this);
        this.f6777c = null;
        this.f6778d = null;
        this.f6779e = 0;
        this.f6780f = false;
    }

    /* renamed from: a */
    public void m8809a(C2825c c2825c, InterfaceC2822a interfaceC2822a) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6776b;
            c3349v.m6855b("AdActivityObserver", "Starting for ad " + c2825c.getAdUnitId() + "...");
        }
        m8810a();
        this.f6777c = interfaceC2822a;
        this.f6778d = c2825c;
        this.f6775a.m8069a(this);
    }

    @Override // com.applovin.impl.sdk.utils.AbstractC3287a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (!this.f6780f) {
            this.f6780f = true;
        }
        this.f6779e++;
        if (C3349v.m6862a()) {
            this.f6776b.m6855b("AdActivityObserver", "Created Activity: " + activity + ", counter is " + this.f6779e);
        }
    }

    @Override // com.applovin.impl.sdk.utils.AbstractC3287a, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        if (this.f6780f) {
            this.f6779e--;
            if (C3349v.m6862a()) {
                this.f6776b.m6855b("AdActivityObserver", "Destroyed Activity: " + activity + ", counter is " + this.f6779e);
            }
            if (this.f6779e <= 0) {
                if (C3349v.m6862a()) {
                    this.f6776b.m6855b("AdActivityObserver", "Last ad Activity destroyed");
                }
                if (this.f6777c != null) {
                    if (C3349v.m6862a()) {
                        this.f6776b.m6855b("AdActivityObserver", "Invoking callback...");
                    }
                    this.f6777c.mo8603a(this.f6778d);
                }
                m8810a();
            }
        }
    }
}
