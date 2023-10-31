package com.applovin.impl.mediation;

import com.applovin.impl.mediation.p011a.C2825c;
import com.applovin.impl.sdk.C3214m;
import com.applovin.impl.sdk.C3349v;
import com.applovin.impl.sdk.utils.C3291e;

/* renamed from: com.applovin.impl.mediation.c */
/* loaded from: classes.dex */
public class C2866c {

    /* renamed from: a */
    private final C3214m f6930a;

    /* renamed from: b */
    private final C3349v f6931b;

    /* renamed from: c */
    private final InterfaceC2868a f6932c;

    /* renamed from: d */
    private C3291e f6933d;

    /* renamed from: com.applovin.impl.mediation.c$a */
    /* loaded from: classes.dex */
    public interface InterfaceC2868a {
        /* renamed from: c */
        void mo8554c(C2825c c2825c);
    }

    public C2866c(C3214m c3214m, InterfaceC2868a interfaceC2868a) {
        this.f6930a = c3214m;
        this.f6931b = c3214m.m7487A();
        this.f6932c = interfaceC2868a;
    }

    /* renamed from: a */
    public void m8561a() {
        if (C3349v.m6862a()) {
            this.f6931b.m6855b("AdHiddenCallbackTimeoutManager", "Cancelling timeout");
        }
        C3291e c3291e = this.f6933d;
        if (c3291e != null) {
            c3291e.m7032a();
            this.f6933d = null;
        }
    }

    /* renamed from: a */
    public void m8560a(final C2825c c2825c, long j) {
        if (C3349v.m6862a()) {
            C3349v c3349v = this.f6931b;
            c3349v.m6855b("AdHiddenCallbackTimeoutManager", "Scheduling in " + j + "ms...");
        }
        this.f6933d = C3291e.m7031a(j, this.f6930a, new Runnable() { // from class: com.applovin.impl.mediation.c.1
            @Override // java.lang.Runnable
            public void run() {
                if (C3349v.m6862a()) {
                    C2866c.this.f6931b.m6855b("AdHiddenCallbackTimeoutManager", "Timing out...");
                }
                C2866c.this.f6932c.mo8554c(c2825c);
            }
        });
    }
}
