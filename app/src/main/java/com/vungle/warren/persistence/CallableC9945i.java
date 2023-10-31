package com.vungle.warren.persistence;

import com.vungle.warren.model.Report;
import com.vungle.warren.persistence.C9919c;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.vungle.warren.persistence.i */
/* loaded from: classes3.dex */
public final class CallableC9945i implements Callable<List<Report>> {

    /* renamed from: a */
    public final /* synthetic */ C9928h f19964a;

    public CallableC9945i(C9928h c9928h) {
        this.f19964a = c9928h;
    }

    @Override // java.util.concurrent.Callable
    public final List<Report> call() throws Exception {
        C9928h c9928h = this.f19964a;
        List<Report> m1379t = c9928h.m1379t(Report.class);
        for (Report report : m1379t) {
            report.f19781a = 2;
            try {
                C9928h.m1394e(c9928h, report);
            } catch (C9919c.C9920a unused) {
                return null;
            }
        }
        return m1379t;
    }
}
