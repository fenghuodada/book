package com.adcolony.sdk;

import androidx.datastore.preferences.protobuf.C1169e;
import com.adcolony.sdk.RunnableC2288s4;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.a5 */
/* loaded from: classes.dex */
public final class C2052a5 implements RunnableC2288s4.InterfaceC2289a {

    /* renamed from: a */
    public final LinkedBlockingQueue<Runnable> f4942a;

    /* renamed from: b */
    public int f4943b;

    /* renamed from: c */
    public int f4944c;

    /* renamed from: d */
    public double f4945d;

    /* renamed from: e */
    public final ThreadPoolExecutor f4946e;

    public C2052a5() {
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
        this.f4942a = linkedBlockingQueue;
        this.f4943b = 4;
        this.f4944c = 16;
        this.f4945d = 1.0d;
        this.f4946e = new ThreadPoolExecutor(this.f4943b, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    @Override // com.adcolony.sdk.RunnableC2288s4.InterfaceC2289a
    /* renamed from: a */
    public final void mo9434a(RunnableC2288s4 runnableC2288s4, C2100e2 c2100e2, Map<String, List<String>> map) {
        C2367y1 c2367y1 = new C2367y1();
        C2080d1.m9660h(c2367y1, ImagesContract.URL, runnableC2288s4.f5571l);
        C2080d1.m9656l(c2367y1, FirebaseAnalytics.Param.SUCCESS, runnableC2288s4.f5573n);
        C2080d1.m9657k(runnableC2288s4.f5575p, c2367y1, "status");
        C2080d1.m9660h(c2367y1, "body", runnableC2288s4.f5572m);
        C2080d1.m9657k(runnableC2288s4.f5574o, c2367y1, "size");
        if (map != null) {
            C2367y1 c2367y12 = new C2367y1();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String obj = entry.getValue().toString();
                String substring = obj.substring(1, obj.length() - 1);
                if (entry.getKey() != null) {
                    C2080d1.m9660h(c2367y12, entry.getKey(), substring);
                }
            }
            C2080d1.m9661g(c2367y1, "headers", c2367y12);
        }
        c2100e2.m9641a(c2367y1).m9640b();
    }

    /* renamed from: b */
    public final void m9703b(RunnableC2288s4 runnableC2288s4) {
        ThreadPoolExecutor threadPoolExecutor = this.f4946e;
        int corePoolSize = threadPoolExecutor.getCorePoolSize();
        int size = this.f4942a.size();
        int i = this.f4943b;
        if (size * this.f4945d > (corePoolSize - i) + 1 && corePoolSize < this.f4944c) {
            threadPoolExecutor.setCorePoolSize(corePoolSize + 1);
        } else if (size == 0 && corePoolSize > i) {
            threadPoolExecutor.setCorePoolSize(i);
        }
        try {
            threadPoolExecutor.execute(runnableC2288s4);
        } catch (RejectedExecutionException unused) {
            StringBuilder sb = new StringBuilder("RejectedExecutionException: ThreadPoolExecutor unable to ");
            sb.append("execute download for url " + runnableC2288s4.f5571l);
            C1169e.m11129c(sb.toString(), 0, 0, true);
            mo9434a(runnableC2288s4, runnableC2288s4.f5562c, null);
        }
    }
}
