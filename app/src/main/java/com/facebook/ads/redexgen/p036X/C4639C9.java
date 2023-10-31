package com.facebook.ads.redexgen.p036X;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.facebook.ads.redexgen.X.C9 */
/* loaded from: assets/audience_network.dex */
public final class C4639C9 {
    public final CopyOnWriteArrayList<C4638C8> A00 = new CopyOnWriteArrayList<>();

    public final void A00() {
        Iterator<C4638C8> it = this.A00.iterator();
        while (it.hasNext()) {
            C4638C8 handlerAndListener = it.next();
            handlerAndListener.A00.post(new RunnableC4634C4(this, handlerAndListener.A01));
        }
    }

    public final void A01() {
        Iterator<C4638C8> it = this.A00.iterator();
        while (it.hasNext()) {
            C4638C8 handlerAndListener = it.next();
            handlerAndListener.A00.post(new RunnableC4637C7(this, handlerAndListener.A01));
        }
    }

    public final void A02() {
        Iterator<C4638C8> it = this.A00.iterator();
        while (it.hasNext()) {
            C4638C8 handlerAndListener = it.next();
            handlerAndListener.A00.post(new RunnableC4636C6(this, handlerAndListener.A01));
        }
    }

    public final void A03(Handler handler, InterfaceC4640CA interfaceC4640CA) {
        C4997IK.A03((handler == null || interfaceC4640CA == null) ? false : true);
        this.A00.add(new C4638C8(handler, interfaceC4640CA));
    }

    public final void A04(Exception exc) {
        Iterator<C4638C8> it = this.A00.iterator();
        while (it.hasNext()) {
            C4638C8 next = it.next();
            next.A00.post(new RunnableC4635C5(this, next.A01, exc));
        }
    }
}
