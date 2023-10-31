package com.vungle.warren;

import com.vungle.warren.C10114v0;
import com.vungle.warren.downloader.C9778e;
import com.vungle.warren.downloader.C9780g;
import com.vungle.warren.persistence.C9914a;
import java.util.concurrent.TimeUnit;

/* renamed from: com.vungle.warren.r0 */
/* loaded from: classes3.dex */
public final class C9965r0 extends C10114v0.AbstractC10117c {

    /* renamed from: a */
    public final /* synthetic */ C10114v0 f20010a;

    public C9965r0(C10114v0 c10114v0) {
        this.f20010a = c10114v0;
    }

    @Override // com.vungle.warren.C10114v0.AbstractC10117c
    /* renamed from: a */
    public final Object mo1226a() {
        C10114v0 c10114v0 = this.f20010a;
        C9914a c9914a = (C9914a) c10114v0.m1233b(C9914a.class);
        return new C9778e(c9914a, new C9780g(c9914a), new C9992u(c9914a, (C9822k0) c10114v0.m1233b(C9822k0.class)), TimeUnit.DAYS.toMillis(90L));
    }
}
