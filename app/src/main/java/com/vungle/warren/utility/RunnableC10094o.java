package com.vungle.warren.utility;

import com.vungle.warren.utility.C10095p;
import java.util.Iterator;

/* renamed from: com.vungle.warren.utility.o */
/* loaded from: classes3.dex */
public final class RunnableC10094o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f20319a;

    /* renamed from: b */
    public final /* synthetic */ C10095p f20320b;

    public RunnableC10094o(C10095p c10095p, int i) {
        this.f20320b = c10095p;
        this.f20319a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f20320b.f20326e.iterator();
        while (it.hasNext()) {
            ((C10095p.InterfaceC10097b) it.next()).mo1260a(this.f20319a);
        }
    }
}
