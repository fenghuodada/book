package androidx.work.impl.workers;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class CombineContinuationsWorker extends Worker {
    public CombineContinuationsWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    @NonNull
    public final ListenableWorker.AbstractC1822a doWork() {
        return new ListenableWorker.AbstractC1822a.C1825c(getInputData());
    }
}
