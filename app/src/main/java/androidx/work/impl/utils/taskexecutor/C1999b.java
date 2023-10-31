package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.ExecutorC1982k;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.utils.taskexecutor.b */
/* loaded from: classes.dex */
public final class C1999b implements InterfaceC1998a {

    /* renamed from: a */
    public final ExecutorC1982k f4853a;

    /* renamed from: b */
    public final Handler f4854b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final ExecutorC2000a f4855c = new ExecutorC2000a();

    /* renamed from: androidx.work.impl.utils.taskexecutor.b$a */
    /* loaded from: classes.dex */
    public class ExecutorC2000a implements Executor {
        public ExecutorC2000a() {
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            C1999b.this.f4854b.post(runnable);
        }
    }

    public C1999b(@NonNull ExecutorService executorService) {
        this.f4853a = new ExecutorC1982k(executorService);
    }

    /* renamed from: a */
    public final void m9738a(Runnable runnable) {
        this.f4853a.execute(runnable);
    }
}
