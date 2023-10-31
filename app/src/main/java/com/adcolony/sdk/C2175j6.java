package com.adcolony.sdk;

import androidx.annotation.NonNull;
import com.adcolony.sdk.C2232o6;
import java.util.Date;

/* renamed from: com.adcolony.sdk.j6 */
/* loaded from: classes.dex */
public final class C2175j6 {

    /* renamed from: a */
    public boolean f5303a = true;

    /* renamed from: b */
    public final RunnableC2176a f5304b = new RunnableC2176a();

    /* renamed from: c */
    public Runnable f5305c;

    /* renamed from: d */
    public C2177b f5306d;

    /* renamed from: com.adcolony.sdk.j6$a */
    /* loaded from: classes.dex */
    public class RunnableC2176a implements Runnable {
        public RunnableC2176a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            new C2100e2("AdColony.heartbeat", 1).m9640b();
            C2175j6 c2175j6 = C2175j6.this;
            c2175j6.getClass();
            if (C2201m0.m9586f()) {
                C2232o6.C2234b c2234b = new C2232o6.C2234b(C2201m0.m9588d().f4980V);
                RunnableC2186k6 runnableC2186k6 = new RunnableC2186k6(c2175j6, c2234b);
                c2175j6.f5305c = runnableC2186k6;
                C2232o6.m9556g(runnableC2186k6, c2234b.m9536a());
            }
        }
    }

    /* renamed from: com.adcolony.sdk.j6$b */
    /* loaded from: classes.dex */
    public static class C2177b {

        /* renamed from: a */
        public final C2367y1 f5308a;

        public C2177b(C2367y1 c2367y1) {
            C2367y1 c2367y12;
            if (c2367y1 != null) {
                c2367y12 = c2367y1.m9439t("payload");
            } else {
                c2367y12 = new C2367y1();
            }
            this.f5308a = c2367y12;
            C2080d1.m9660h(c2367y12, "heartbeatLastTimestamp", C2360x1.f5674e.format(new Date()));
        }

        @NonNull
        public final String toString() {
            return this.f5308a.toString();
        }
    }

    /* renamed from: a */
    public final void m9603a() {
        this.f5303a = true;
        C2232o6.m9545r(this.f5304b);
        C2232o6.m9545r(this.f5305c);
        this.f5305c = null;
    }
}
