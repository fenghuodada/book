package androidx.work.impl;

import android.annotation.SuppressLint;
import androidx.work.AbstractC2005l;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C1977c;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: androidx.work.impl.n */
/* loaded from: classes.dex */
public final class RunnableC1957n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1977c f4723a;

    /* renamed from: b */
    public final /* synthetic */ String f4724b;

    /* renamed from: c */
    public final /* synthetic */ RunnableC1958o f4725c;

    public RunnableC1957n(RunnableC1958o runnableC1958o, C1977c c1977c, String str) {
        this.f4725c = runnableC1958o;
        this.f4723a = c1977c;
        this.f4724b = str;
    }

    @Override // java.lang.Runnable
    @SuppressLint({"SyntheticAccessor"})
    public final void run() {
        String str = this.f4724b;
        RunnableC1958o runnableC1958o = this.f4725c;
        try {
            try {
                ListenableWorker.AbstractC1822a abstractC1822a = (ListenableWorker.AbstractC1822a) this.f4723a.get();
                if (abstractC1822a == null) {
                    AbstractC2005l.m9733c().mo9730b(RunnableC1958o.f4726t, String.format("%s returned a null result. Treating it as a failure.", runnableC1958o.f4731e.f4692c), new Throwable[0]);
                } else {
                    AbstractC2005l.m9733c().mo9731a(RunnableC1958o.f4726t, String.format("%s returned a %s result.", runnableC1958o.f4731e.f4692c, abstractC1822a), new Throwable[0]);
                    runnableC1958o.f4734h = abstractC1822a;
                }
            } catch (InterruptedException e) {
                e = e;
                AbstractC2005l.m9733c().mo9730b(RunnableC1958o.f4726t, String.format("%s failed because it threw an exception/error", str), e);
            } catch (CancellationException e2) {
                AbstractC2005l.m9733c().mo9729d(RunnableC1958o.f4726t, String.format("%s was cancelled", str), e2);
            } catch (ExecutionException e3) {
                e = e3;
                AbstractC2005l.m9733c().mo9730b(RunnableC1958o.f4726t, String.format("%s failed because it threw an exception/error", str), e);
            }
        } finally {
            runnableC1958o.m9776c();
        }
    }
}
