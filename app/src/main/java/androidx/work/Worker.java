package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.work.ListenableWorker;
import androidx.work.impl.utils.futures.C1977c;
import com.google.common.util.concurrent.InterfaceFutureC8037a;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    C1977c<ListenableWorker.AbstractC1822a> mFuture;

    /* renamed from: androidx.work.Worker$a */
    /* loaded from: classes.dex */
    public class RunnableC1826a implements Runnable {
        public RunnableC1826a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Worker worker = Worker.this;
            try {
                worker.mFuture.m9750h(worker.doWork());
            } catch (Throwable th) {
                worker.mFuture.m9749i(th);
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @NonNull
    @WorkerThread
    public abstract ListenableWorker.AbstractC1822a doWork();

    @Override // androidx.work.ListenableWorker
    @NonNull
    public final InterfaceFutureC8037a<ListenableWorker.AbstractC1822a> startWork() {
        this.mFuture = new C1977c<>();
        getBackgroundExecutor().execute(new RunnableC1826a());
        return this.mFuture;
    }
}
