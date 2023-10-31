package androidx.work.impl.workers;

import androidx.work.ListenableWorker;
import com.google.common.util.concurrent.InterfaceFutureC8037a;

/* renamed from: androidx.work.impl.workers.a */
/* loaded from: classes.dex */
public final class RunnableC2002a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InterfaceFutureC8037a f4865a;

    /* renamed from: b */
    public final /* synthetic */ ConstraintTrackingWorker f4866b;

    public RunnableC2002a(ConstraintTrackingWorker constraintTrackingWorker, InterfaceFutureC8037a interfaceFutureC8037a) {
        this.f4866b = constraintTrackingWorker;
        this.f4865a = interfaceFutureC8037a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f4866b.f4859b) {
            if (this.f4866b.f4860c) {
                ConstraintTrackingWorker constraintTrackingWorker = this.f4866b;
                constraintTrackingWorker.getClass();
                constraintTrackingWorker.f4861d.m9750h(new ListenableWorker.AbstractC1822a.C1824b());
            } else {
                this.f4866b.f4861d.m9748j(this.f4865a);
            }
        }
    }
}
