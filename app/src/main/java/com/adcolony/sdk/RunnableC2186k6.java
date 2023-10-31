package com.adcolony.sdk;

import androidx.datastore.preferences.protobuf.C1169e;
import com.adcolony.sdk.C2175j6;
import com.adcolony.sdk.C2232o6;

/* renamed from: com.adcolony.sdk.k6 */
/* loaded from: classes.dex */
public final class RunnableC2186k6 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2232o6.C2234b f5338a;

    /* renamed from: b */
    public final /* synthetic */ C2175j6 f5339b;

    public RunnableC2186k6(C2175j6 c2175j6, C2232o6.C2234b c2234b) {
        this.f5339b = c2175j6;
        this.f5338a = c2234b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2232o6.C2234b c2234b;
        boolean z;
        String str;
        C2175j6 c2175j6 = this.f5339b;
        c2175j6.f5305c = null;
        if (!C2201m0.m9586f()) {
            return;
        }
        C2058b3 m9588d = C2201m0.m9588d();
        if (this.f5338a.m9536a() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && m9588d.f4962D.f5701a) {
            m9588d.m9695h();
            StringBuilder sb = new StringBuilder("Controller heartbeat timeout occurred. ");
            sb.append("Timeout set to: " + c2234b.f5448a + " ms. ");
            sb.append("Interval set to: " + m9588d.f4979U + " ms. ");
            sb.append("Heartbeat last reply: ");
            C2175j6.C2177b c2177b = c2175j6.f5306d;
            if (c2177b != null) {
                str = c2177b.toString();
            } else {
                str = "null";
            }
            sb.append(str);
            C1169e.m11129c(sb.toString(), 0, 0, true);
        } else if (!m9588d.f4961C) {
            C2232o6.m9556g(c2175j6.f5304b, m9588d.f4979U);
            return;
        }
        c2175j6.m9603a();
    }
}
