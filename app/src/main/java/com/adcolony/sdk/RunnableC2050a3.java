package com.adcolony.sdk;

import android.content.Context;
import kotlin.jvm.internal.C10843j;

/* renamed from: com.adcolony.sdk.a3 */
/* loaded from: classes.dex */
public final class RunnableC2050a3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f4935a;

    /* renamed from: b */
    public final /* synthetic */ C2100e2 f4936b;

    /* renamed from: c */
    public final /* synthetic */ C2058b3 f4937c;

    public RunnableC2050a3(C2058b3 c2058b3, Context context, C2100e2 c2100e2) {
        this.f4937c = c2058b3;
        this.f4935a = context;
        this.f4936b = c2100e2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2088e1 c2190l2;
        Context applicationContext = this.f4935a.getApplicationContext();
        int i = C2190l2.f5350E;
        C2117g2 m9688o = C2201m0.m9588d().m9688o();
        int i2 = m9688o.f5125b;
        m9688o.f5125b = i2 + 1;
        C2100e2 c2100e2 = this.f4936b;
        if (C10843j.m435a(c2100e2.f5098b.m9436w("type"), "aurora")) {
            c2190l2 = new C2352w1(applicationContext, i2, c2100e2);
        } else {
            c2190l2 = new C2190l2(applicationContext, i2, c2100e2);
        }
        c2190l2.mo9472n();
        this.f4937c.f5004v.put(Integer.valueOf(c2190l2.getAdc3ModuleId()), c2190l2);
    }
}
