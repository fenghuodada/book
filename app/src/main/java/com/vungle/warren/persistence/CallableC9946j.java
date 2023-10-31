package com.vungle.warren.persistence;

import com.vungle.warren.model.Report;
import com.vungle.warren.persistence.C9919c;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.vungle.warren.persistence.j */
/* loaded from: classes3.dex */
public final class CallableC9946j implements Callable<List<Report>> {

    /* renamed from: a */
    public final /* synthetic */ C9928h f19965a;

    public CallableC9946j(C9928h c9928h) {
        this.f19965a = c9928h;
    }

    @Override // java.util.concurrent.Callable
    public final List<Report> call() throws Exception {
        String[] strArr = {String.valueOf(1), String.valueOf(3)};
        C9928h c9928h = this.f19965a;
        List<Report> m1388k = c9928h.m1388k(Report.class, c9928h.f19929a.m1411a().query("report", null, "status = ?  OR status = ? ", strArr, null, null, null, null));
        for (Report report : m1388k) {
            report.f19781a = 2;
            try {
                C9928h.m1394e(c9928h, report);
            } catch (C9919c.C9920a unused) {
                return null;
            }
        }
        return m1388k;
    }
}
