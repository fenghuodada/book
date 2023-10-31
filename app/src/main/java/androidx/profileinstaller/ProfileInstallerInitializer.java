package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.profileinstaller.ProfileInstallerInitializer;
import androidx.startup.InterfaceC1716b;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC1716b<C1536c> {

    @RequiresApi(16)
    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    /* loaded from: classes.dex */
    public static class C1534a {
        @DoNotInline
        /* renamed from: a */
        public static void m10488a(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.profileinstaller.k
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }
    }

    @RequiresApi(28)
    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    /* loaded from: classes.dex */
    public static class C1535b {
        @DoNotInline
        /* renamed from: a */
        public static Handler m10487a(Looper looper) {
            Handler createAsync;
            createAsync = Handler.createAsync(looper);
            return createAsync;
        }
    }

    /* renamed from: androidx.profileinstaller.ProfileInstallerInitializer$c */
    /* loaded from: classes.dex */
    public static class C1536c {
    }

    @Override // androidx.startup.InterfaceC1716b
    @NonNull
    /* renamed from: a */
    public final C1536c mo9910a(@NonNull Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C1536c();
        }
        final Context applicationContext = context.getApplicationContext();
        C1534a.m10488a(new Runnable() { // from class: androidx.profileinstaller.h
            @Override // java.lang.Runnable
            public final void run() {
                Handler handler;
                ProfileInstallerInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = ProfileInstallerInitializer.C1535b.m10487a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                int nextInt = new Random().nextInt(Math.max(1000, 1));
                final Context context2 = applicationContext;
                handler.postDelayed(new Runnable() { // from class: androidx.profileinstaller.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
                        final Context context3 = context2;
                        threadPoolExecutor.execute(new Runnable() { // from class: androidx.profileinstaller.j
                            @Override // java.lang.Runnable
                            public final void run() {
                                ProfileInstaller.m10491b(context3, new ExecutorC1545g(), ProfileInstaller.f3530a, false);
                            }
                        });
                    }
                }, nextInt + 5000);
            }
        });
        return new C1536c();
    }

    @Override // androidx.startup.InterfaceC1716b
    @NonNull
    public final List<Class<? extends InterfaceC1716b<?>>> dependencies() {
        return Collections.emptyList();
    }
}
