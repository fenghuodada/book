package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.adcolony.sdk.j4 */
/* loaded from: classes.dex */
public final class C2171j4 implements InterfaceC2203m2 {

    /* renamed from: com.adcolony.sdk.j4$a */
    /* loaded from: classes.dex */
    public class RunnableC2172a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C2100e2 f5299a;

        /* renamed from: com.adcolony.sdk.j4$a$a */
        /* loaded from: classes.dex */
        public class RunnableC2173a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C2367y1 f5300a;

            public RunnableC2173a(C2367y1 c2367y1) {
                this.f5300a = c2367y1;
            }

            @Override // java.lang.Runnable
            public final void run() {
                RunnableC2172a.this.f5299a.m9641a(this.f5300a).m9640b();
            }
        }

        public RunnableC2172a(C2100e2 c2100e2) {
            this.f5299a = c2100e2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C2247p4 m9691l = C2201m0.m9588d().m9691l();
            m9691l.getClass();
            ArrayList arrayList = new ArrayList(Collections.singletonList(m9691l.m9527d()));
            C2229o4 c2229o4 = new C2229o4();
            if (m9691l.f5465a.f5701a) {
                arrayList.add(m9691l.m9529b());
            } else {
                c2229o4.m9567b(new CallableC2184k4(m9691l, 2000L));
            }
            if (m9691l.f5466b.f5701a) {
                arrayList.add(m9691l.m9528c());
            } else {
                c2229o4.m9567b(new CallableC2205m4(m9691l, 2000L));
            }
            if (!c2229o4.f5428a.isEmpty()) {
                arrayList.addAll(c2229o4.m9568a());
            }
            C2232o6.m9548o(new RunnableC2173a(C2080d1.m9664d((C2367y1[]) arrayList.toArray(new C2367y1[0]))));
        }
    }

    @Override // com.adcolony.sdk.InterfaceC2203m2
    /* renamed from: a */
    public final void mo9422a(C2100e2 c2100e2) {
        boolean z;
        try {
            C2232o6.f5446a.execute(new RunnableC2172a(c2100e2));
            z = true;
        } catch (RejectedExecutionException unused) {
            z = false;
        }
        if (!z) {
            C2201m0.m9588d().m9689n().m9706d("Error retrieving device info, disabling AdColony.", 0, 0, true);
            C2074d.m9671f();
        }
    }
}
