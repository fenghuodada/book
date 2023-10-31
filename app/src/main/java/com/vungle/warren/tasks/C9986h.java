package com.vungle.warren.tasks;

import android.os.Bundle;
import android.util.Log;
import com.vungle.warren.VungleApiClient;
import com.vungle.warren.model.Report;
import com.vungle.warren.network.C9901e;
import com.vungle.warren.persistence.C9919c;
import com.vungle.warren.persistence.C9928h;
import com.vungle.warren.persistence.CallableC9945i;
import com.vungle.warren.persistence.CallableC9946j;
import com.vungle.warren.persistence.FutureC9926f;
import com.vungle.warren.utility.C10111y;
import java.io.IOException;
import java.util.List;

/* renamed from: com.vungle.warren.tasks.h */
/* loaded from: classes3.dex */
public final class C9986h implements Job {

    /* renamed from: c */
    public static final /* synthetic */ int f20074c = 0;

    /* renamed from: a */
    public final C9928h f20075a;

    /* renamed from: b */
    public final VungleApiClient f20076b;

    public C9986h(VungleApiClient vungleApiClient, C9928h c9928h) {
        this.f20075a = c9928h;
        this.f20076b = vungleApiClient;
    }

    /* renamed from: b */
    public static JobInfo m1356b(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("sendAll", z);
        JobInfo jobInfo = new JobInfo("com.vungle.warren.tasks.h");
        jobInfo.f20055f = bundle;
        jobInfo.f20057h = 5;
        jobInfo.f20053d = 30000L;
        jobInfo.f20056g = 1;
        return jobInfo;
    }

    @Override // com.vungle.warren.tasks.Job
    /* renamed from: a */
    public final int mo1357a(Bundle bundle, InterfaceC9982e interfaceC9982e) {
        FutureC9926f futureC9926f;
        C9901e m1432a;
        VungleApiClient vungleApiClient = this.f20076b;
        boolean z = bundle.getBoolean("sendAll", false);
        C9928h c9928h = this.f20075a;
        c9928h.getClass();
        C10111y c10111y = c9928h.f19930b;
        if (z) {
            futureC9926f = new FutureC9926f(c10111y.submit(new CallableC9945i(c9928h)));
        } else {
            futureC9926f = new FutureC9926f(c10111y.submit(new CallableC9946j(c9928h)));
        }
        List<Report> list = (List) futureC9926f.get();
        if (list == null) {
            return 1;
        }
        for (Report report : list) {
            try {
                m1432a = vungleApiClient.m1609k(report.m1455c()).m1432a();
            } catch (C9919c.C9920a unused) {
            } catch (IOException e) {
                Log.d("com.vungle.warren.tasks.h", "SendReportsJob: IOEx");
                for (Report report2 : list) {
                    report2.f19781a = 3;
                    try {
                        c9928h.m1376w(report2);
                    } catch (C9919c.C9920a unused2) {
                        return 1;
                    }
                }
                Log.e("com.vungle.warren.tasks.h", Log.getStackTraceString(e));
                return 2;
            }
            if (m1432a.f19882a.code() == 200) {
                c9928h.m1393f(report);
            } else {
                report.f19781a = 3;
                c9928h.m1376w(report);
                long m1613g = VungleApiClient.m1613g(m1432a);
                if (m1613g > 0) {
                    JobInfo m1356b = m1356b(false);
                    m1356b.f20052c = m1613g;
                    interfaceC9982e.mo1353a(m1356b);
                    return 1;
                }
            }
        }
        return 0;
    }
}
