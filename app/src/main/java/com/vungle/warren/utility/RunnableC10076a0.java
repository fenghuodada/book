package com.vungle.warren.utility;

import com.vungle.warren.C9975t1;
import java.lang.ref.WeakReference;

/* renamed from: com.vungle.warren.utility.a0 */
/* loaded from: classes3.dex */
public final class RunnableC10076a0 implements Runnable {

    /* renamed from: a */
    public final WeakReference<Runnable> f20298a;

    public RunnableC10076a0(C9975t1.RunnableC9976a runnableC9976a) {
        this.f20298a = new WeakReference<>(runnableC9976a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.f20298a.get();
        if (runnable != null) {
            runnable.run();
        }
    }
}
