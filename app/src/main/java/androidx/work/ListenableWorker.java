package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.Keep;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.C1991q;
import androidx.work.impl.utils.C1993s;
import androidx.work.impl.utils.RunnableC1990p;
import androidx.work.impl.utils.RunnableC1992r;
import androidx.work.impl.utils.futures.C1977c;
import androidx.work.impl.utils.taskexecutor.C1999b;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;
import com.google.common.util.concurrent.InterfaceFutureC8037a;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    @NonNull
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    @NonNull
    private WorkerParameters mWorkerParams;

    /* renamed from: androidx.work.ListenableWorker$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC1822a {

        @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
        /* renamed from: androidx.work.ListenableWorker$a$a */
        /* loaded from: classes.dex */
        public static final class C1823a extends AbstractC1822a {

            /* renamed from: a */
            public final C1837f f4416a = C1837f.f4458c;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1823a.class != obj.getClass()) {
                    return false;
                }
                return this.f4416a.equals(((C1823a) obj).f4416a);
            }

            public final int hashCode() {
                return this.f4416a.hashCode() + (C1823a.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Failure {mOutputData=" + this.f4416a + '}';
            }
        }

        @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
        /* renamed from: androidx.work.ListenableWorker$a$b */
        /* loaded from: classes.dex */
        public static final class C1824b extends AbstractC1822a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && C1824b.class == obj.getClass();
            }

            public final int hashCode() {
                return C1824b.class.getName().hashCode();
            }

            public final String toString() {
                return "Retry";
            }
        }

        @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
        /* renamed from: androidx.work.ListenableWorker$a$c */
        /* loaded from: classes.dex */
        public static final class C1825c extends AbstractC1822a {

            /* renamed from: a */
            public final C1837f f4417a;

            public C1825c() {
                this(C1837f.f4458c);
            }

            public C1825c(@NonNull C1837f c1837f) {
                this.f4417a = c1837f;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1825c.class != obj.getClass()) {
                    return false;
                }
                return this.f4417a.equals(((C1825c) obj).f4417a);
            }

            public final int hashCode() {
                return this.f4417a.hashCode() + (C1825c.class.getName().hashCode() * 31);
            }

            public final String toString() {
                return "Success {mOutputData=" + this.f4417a + '}';
            }
        }
    }

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (workerParameters == null) {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
        this.mAppContext = context;
        this.mWorkerParams = workerParameters;
    }

    @NonNull
    public final Context getApplicationContext() {
        return this.mAppContext;
    }

    @NonNull
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.f4425f;
    }

    @NonNull
    public InterfaceFutureC8037a<C1839g> getForegroundInfoAsync() {
        C1977c c1977c = new C1977c();
        c1977c.m9749i(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return c1977c;
    }

    @NonNull
    public final UUID getId() {
        return this.mWorkerParams.f4420a;
    }

    @NonNull
    public final C1837f getInputData() {
        return this.mWorkerParams.f4421b;
    }

    @Nullable
    @RequiresApi(28)
    public final Network getNetwork() {
        return this.mWorkerParams.f4423d.f4432c;
    }

    @IntRange(from = 0)
    public final int getRunAttemptCount() {
        return this.mWorkerParams.f4424e;
    }

    @NonNull
    public final Set<String> getTags() {
        return this.mWorkerParams.f4422c;
    }

    @NonNull
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public InterfaceC1998a getTaskExecutor() {
        return this.mWorkerParams.f4426g;
    }

    @NonNull
    @RequiresApi(24)
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.f4423d.f4430a;
    }

    @NonNull
    @RequiresApi(24)
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.f4423d.f4431b;
    }

    @NonNull
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public AbstractC2023w getWorkerFactory() {
        return this.mWorkerParams.f4427h;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }

    public final boolean isStopped() {
        return this.mStopped;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public final boolean isUsed() {
        return this.mUsed;
    }

    public void onStopped() {
    }

    @NonNull
    public final InterfaceFutureC8037a<Void> setForegroundAsync(@NonNull C1839g c1839g) {
        this.mRunInForeground = true;
        InterfaceC1840h interfaceC1840h = this.mWorkerParams.f4429j;
        Context applicationContext = getApplicationContext();
        UUID id = getId();
        C1991q c1991q = (C1991q) interfaceC1840h;
        c1991q.getClass();
        C1977c c1977c = new C1977c();
        ((C1999b) c1991q.f4835a).m9738a(new RunnableC1990p(c1991q, c1977c, id, c1839g, applicationContext));
        return c1977c;
    }

    @NonNull
    public InterfaceFutureC8037a<Void> setProgressAsync(@NonNull C1837f c1837f) {
        InterfaceC2015p interfaceC2015p = this.mWorkerParams.f4428i;
        getApplicationContext();
        UUID id = getId();
        C1993s c1993s = (C1993s) interfaceC2015p;
        c1993s.getClass();
        C1977c c1977c = new C1977c();
        ((C1999b) c1993s.f4844b).m9738a(new RunnableC1992r(c1993s, id, c1837f, c1977c));
        return c1977c;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public void setRunInForeground(boolean z) {
        this.mRunInForeground = z;
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public final void setUsed() {
        this.mUsed = true;
    }

    @NonNull
    @MainThread
    public abstract InterfaceFutureC8037a<AbstractC1822a> startWork();

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    public final void stop() {
        this.mStopped = true;
        onStopped();
    }
}
