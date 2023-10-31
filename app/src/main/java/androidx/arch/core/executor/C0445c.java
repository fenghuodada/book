package androidx.arch.core.executor;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.arch.core.executor.c */
/* loaded from: classes.dex */
public final class C0445c extends AbstractC0448e {

    /* renamed from: a */
    public final Object f1440a = new Object();

    /* renamed from: b */
    public final ExecutorService f1441b = Executors.newFixedThreadPool(4, new ThreadFactoryC0446a());
    @Nullable

    /* renamed from: c */
    public volatile Handler f1442c;

    /* renamed from: androidx.arch.core.executor.c$a */
    /* loaded from: classes.dex */
    public class ThreadFactoryC0446a implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f1443a = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f1443a.getAndIncrement());
            return thread;
        }
    }

    @NonNull
    /* renamed from: a */
    public static Handler m12448a(@NonNull Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT >= 28) {
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
