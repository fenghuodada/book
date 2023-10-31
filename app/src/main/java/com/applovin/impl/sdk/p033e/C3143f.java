package com.applovin.impl.sdk.p033e;

import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3267o;

/* renamed from: com.applovin.impl.sdk.e.f */
/* loaded from: classes.dex */
public class C3143f extends AbstractRunnableC3131a {

    /* renamed from: a */
    private final InterfaceC3144a f8215a;

    /* renamed from: com.applovin.impl.sdk.e.f$a */
    /* loaded from: classes.dex */
    public interface InterfaceC3144a {
        /* renamed from: a */
        void mo7112a(C3267o.C3273a c3273a);
    }

    public C3143f(C3214m c3214m, InterfaceC3144a interfaceC3144a) {
        super("TaskCollectAdvertisingId", c3214m, true);
        this.f8215a = interfaceC3144a;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f8215a.mo7112a(this.f8192b.m7466V().m7129k());
    }
}
