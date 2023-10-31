package com.vungle.warren.utility;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.vungle.warren.utility.s */
/* loaded from: classes3.dex */
public final class C10103s implements InterfaceC10086h {

    /* renamed from: a */
    public static final C10111y f20341a;

    /* renamed from: b */
    public static final C10111y f20342b;

    /* renamed from: c */
    public static final C10111y f20343c;

    /* renamed from: d */
    public static final C10104a f20344d;

    /* renamed from: e */
    public static final C10111y f20345e;

    /* renamed from: f */
    public static final C10111y f20346f;

    /* renamed from: g */
    public static final C10111y f20347g;

    /* renamed from: h */
    public static final C10111y f20348h;

    /* renamed from: i */
    public static final C10111y f20349i;

    /* renamed from: j */
    public static final C10111y f20350j;

    /* renamed from: k */
    public static final C10111y f20351k;

    /* renamed from: com.vungle.warren.utility.s$a */
    /* loaded from: classes3.dex */
    public class C10104a extends AbstractExecutorService {

        /* renamed from: a */
        public final Handler f20352a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j, @NonNull TimeUnit timeUnit) {
            return false;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            this.f20352a.post(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return false;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return false;
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return null;
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f20344d = new C10104a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f20343c = new C10111y(availableProcessors, availableProcessors, 1L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC10092m("vng_jr"));
        f20341a = new C10111y(1, 1, 5L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC10092m("vng_io"));
        f20346f = new C10111y(1, 1, 5L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC10092m("vng_logger"));
        f20342b = new C10111y(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC10092m("vng_background"));
        f20345e = new C10111y(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC10092m("vng_api"));
        f20347g = new C10111y(1, 20, 10L, timeUnit, new SynchronousQueue(), new ThreadFactoryC10092m("vng_task"));
        f20348h = new C10111y(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC10092m("vng_ua"));
        f20349i = new C10111y(4, 4, 1L, timeUnit, new PriorityBlockingQueue(), new ThreadFactoryC10092m("vng_down"));
        f20350j = new C10111y(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC10092m("vng_ol"));
        f20351k = new C10111y(1, 1, 5L, timeUnit, new LinkedBlockingQueue(), new ThreadFactoryC10092m("vng_session"));
    }

    @Override // com.vungle.warren.utility.InterfaceC10086h
    /* renamed from: a */
    public final C10111y mo1249a() {
        return f20345e;
    }

    @Override // com.vungle.warren.utility.InterfaceC10086h
    /* renamed from: b */
    public final C10104a mo1248b() {
        return f20344d;
    }

    @Override // com.vungle.warren.utility.InterfaceC10086h
    /* renamed from: c */
    public final C10111y mo1247c() {
        return f20347g;
    }

    @Override // com.vungle.warren.utility.InterfaceC10086h
    /* renamed from: d */
    public final C10111y mo1246d() {
        return f20346f;
    }

    @Override // com.vungle.warren.utility.InterfaceC10086h
    /* renamed from: e */
    public final C10111y mo1245e() {
        return f20350j;
    }

    @Override // com.vungle.warren.utility.InterfaceC10086h
    /* renamed from: f */
    public final C10111y mo1244f() {
        return f20348h;
    }

    @Override // com.vungle.warren.utility.InterfaceC10086h
    /* renamed from: g */
    public final C10111y mo1243g() {
        return f20349i;
    }

    @Override // com.vungle.warren.utility.InterfaceC10086h
    /* renamed from: h */
    public final C10111y mo1242h() {
        return f20341a;
    }

    @Override // com.vungle.warren.utility.InterfaceC10086h
    /* renamed from: i */
    public final C10111y mo1241i() {
        return f20343c;
    }

    @Override // com.vungle.warren.utility.InterfaceC10086h
    /* renamed from: j */
    public final C10111y mo1240j() {
        return f20342b;
    }
}
