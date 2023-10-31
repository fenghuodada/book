package com.adcolony.sdk;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.C0510h;
import androidx.datastore.preferences.protobuf.C1169e;

/* renamed from: com.adcolony.sdk.r2 */
/* loaded from: classes.dex */
public final class C2275r2 implements InterfaceC2203m2 {

    /* renamed from: a */
    public final /* synthetic */ C2058b3 f5537a;

    /* renamed from: com.adcolony.sdk.r2$a */
    /* loaded from: classes.dex */
    public class C2276a implements InterfaceC2140i6<String> {

        /* renamed from: a */
        public final /* synthetic */ C2100e2 f5538a;

        public C2276a(C2100e2 c2100e2) {
            this.f5538a = c2100e2;
        }

        /* renamed from: a */
        public final void m9511a(@NonNull String str) {
            C2367y1 c2367y1 = new C2367y1();
            C2275r2 c2275r2 = C2275r2.this;
            C2080d1.m9660h(c2367y1, "advertiser_id", c2275r2.f5537a.m9691l().f5467c);
            C2080d1.m9656l(c2367y1, "limit_ad_tracking", c2275r2.f5537a.m9691l().f5468d);
            this.f5538a.m9641a(c2367y1).m9640b();
        }

        /* renamed from: b */
        public final void m9510b(@NonNull Throwable th) {
            StringBuilder m12339b = C0510h.m12339b("Device.query_advertiser_info", " failed with error: ");
            m12339b.append(Log.getStackTraceString(th));
            C1169e.m11129c(m12339b.toString(), 0, 1, true);
        }
    }

    public C2275r2(C2058b3 c2058b3) {
        this.f5537a = c2058b3;
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        this.f5537a.m9691l().m9530a(C2201m0.f5363a, new C2276a(c2100e2));
    }
}
