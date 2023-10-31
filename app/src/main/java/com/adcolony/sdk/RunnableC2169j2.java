package com.adcolony.sdk;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.adcolony.sdk.j2 */
/* loaded from: classes.dex */
public final class RunnableC2169j2 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f5295a;

    /* renamed from: b */
    public final /* synthetic */ C2367y1 f5296b;

    /* renamed from: c */
    public final /* synthetic */ C2117g2 f5297c;

    public RunnableC2169j2(C2117g2 c2117g2, String str, C2367y1 c2367y1) {
        this.f5297c = c2117g2;
        this.f5295a = str;
        this.f5296b = c2367y1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2117g2 c2117g2 = this.f5297c;
        String str = this.f5295a;
        C2367y1 c2367y1 = this.f5296b;
        synchronized (c2117g2.f5126c) {
            ArrayList<InterfaceC2203m2> arrayList = c2117g2.f5126c.get(str);
            if (arrayList != null) {
                ArrayList arrayList2 = new ArrayList(arrayList);
                C2100e2 c2100e2 = new C2100e2(c2367y1);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    try {
                        ((InterfaceC2203m2) it.next()).mo9422a(c2100e2);
                    } catch (RuntimeException e) {
                        C2201m0.m9588d().m9689n().m9706d(e.toString(), 0, 0, true);
                        e.printStackTrace();
                        return;
                    }
                }
            }
        }
    }
}
