package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.work.AbstractC2005l;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.C1915l;
import androidx.work.impl.constraints.C1877d;
import androidx.work.impl.constraints.InterfaceC1867c;
import androidx.work.impl.model.C1940p;
import androidx.work.impl.model.C1943r;
import androidx.work.impl.utils.futures.C1977c;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;
import com.google.common.util.concurrent.InterfaceFutureC8037a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements InterfaceC1867c {

    /* renamed from: f */
    public static final String f4857f = AbstractC2005l.m9732e("ConstraintTrkngWrkr");

    /* renamed from: a */
    public final WorkerParameters f4858a;

    /* renamed from: b */
    public final Object f4859b;

    /* renamed from: c */
    public volatile boolean f4860c;

    /* renamed from: d */
    public final C1977c<ListenableWorker.AbstractC1822a> f4861d;
    @Nullable

    /* renamed from: e */
    public ListenableWorker f4862e;

    /* renamed from: androidx.work.impl.workers.ConstraintTrackingWorker$a */
    /* loaded from: classes.dex */
    public class RunnableC2001a implements Runnable {
        public RunnableC2001a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            ConstraintTrackingWorker constraintTrackingWorker = ConstraintTrackingWorker.this;
            Object obj = constraintTrackingWorker.getInputData().f4459a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
            if (obj instanceof String) {
                str = (String) obj;
            } else {
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                AbstractC2005l.m9733c().mo9730b(ConstraintTrackingWorker.f4857f, "No worker to delegate to.", new Throwable[0]);
            } else {
                ListenableWorker m9724a = constraintTrackingWorker.getWorkerFactory().m9724a(constraintTrackingWorker.getApplicationContext(), str, constraintTrackingWorker.f4858a);
                constraintTrackingWorker.f4862e = m9724a;
                if (m9724a == null) {
                    AbstractC2005l.m9733c().mo9731a(ConstraintTrackingWorker.f4857f, "No worker to delegate to.", new Throwable[0]);
                } else {
                    C1940p m9793i = ((C1943r) C1915l.m9816c(constraintTrackingWorker.getApplicationContext()).f4657c.mo9893n()).m9793i(constraintTrackingWorker.getId().toString());
                    if (m9793i != null) {
                        C1877d c1877d = new C1877d(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
                        c1877d.m9853c(Collections.singletonList(m9793i));
                        if (c1877d.m9855a(constraintTrackingWorker.getId().toString())) {
                            AbstractC2005l.m9733c().mo9731a(ConstraintTrackingWorker.f4857f, String.format("Constraints met for delegate %s", str), new Throwable[0]);
                            try {
                                InterfaceFutureC8037a<ListenableWorker.AbstractC1822a> startWork = constraintTrackingWorker.f4862e.startWork();
                                startWork.addListener(new RunnableC2002a(constraintTrackingWorker, startWork), constraintTrackingWorker.getBackgroundExecutor());
                                return;
                            } catch (Throwable th) {
                                AbstractC2005l m9733c = AbstractC2005l.m9733c();
                                String str2 = ConstraintTrackingWorker.f4857f;
                                m9733c.mo9731a(str2, String.format("Delegated worker %s threw exception in startWork.", str), th);
                                synchronized (constraintTrackingWorker.f4859b) {
                                    if (constraintTrackingWorker.f4860c) {
                                        AbstractC2005l.m9733c().mo9731a(str2, "Constraints were unmet, Retrying.", new Throwable[0]);
                                        constraintTrackingWorker.f4861d.m9750h(new ListenableWorker.AbstractC1822a.C1824b());
                                    } else {
                                        constraintTrackingWorker.m9737a();
                                    }
                                    return;
                                }
                            }
                        }
                        AbstractC2005l.m9733c().mo9731a(ConstraintTrackingWorker.f4857f, String.format("Constraints not met for delegate %s. Requesting retry.", str), new Throwable[0]);
                        constraintTrackingWorker.f4861d.m9750h(new ListenableWorker.AbstractC1822a.C1824b());
                        return;
                    }
                }
            }
            constraintTrackingWorker.m9737a();
        }
    }

    public ConstraintTrackingWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f4858a = workerParameters;
        this.f4859b = new Object();
        this.f4860c = false;
        this.f4861d = new C1977c<>();
    }

    /* renamed from: a */
    public final void m9737a() {
        this.f4861d.m9750h(new ListenableWorker.AbstractC1822a.C1823a());
    }

    @Override // androidx.work.impl.constraints.InterfaceC1867c
    /* renamed from: e */
    public final void mo9736e(@NonNull ArrayList arrayList) {
        AbstractC2005l.m9733c().mo9731a(f4857f, String.format("Constraints changed for %s", arrayList), new Throwable[0]);
        synchronized (this.f4859b) {
            this.f4860c = true;
        }
    }

    @Override // androidx.work.impl.constraints.InterfaceC1867c
    /* renamed from: f */
    public final void mo9735f(@NonNull List<String> list) {
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    @VisibleForTesting
    public final InterfaceC1998a getTaskExecutor() {
        return C1915l.m9816c(getApplicationContext()).f4658d;
    }

    @Override // androidx.work.ListenableWorker
    public final boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f4862e;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public final void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f4862e;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.f4862e.stop();
    }

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final InterfaceFutureC8037a<ListenableWorker.AbstractC1822a> startWork() {
        getBackgroundExecutor().execute(new RunnableC2001a());
        return this.f4861d;
    }
}
