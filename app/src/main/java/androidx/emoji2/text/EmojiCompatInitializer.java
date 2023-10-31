package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.p003os.C0749q;
import androidx.emoji2.text.C1311j;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC1464h;
import androidx.lifecycle.InterfaceC1452c;
import androidx.lifecycle.InterfaceC1483m;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.C1715a;
import androidx.startup.InterfaceC1716b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC1716b<Boolean> {

    @RequiresApi(19)
    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$a */
    /* loaded from: classes.dex */
    public static class C1291a extends EmojiCompat.AbstractC1283c {
        public C1291a(Context context) {
            super(new C1292b(context));
            this.f3167b = 1;
        }
    }

    @RequiresApi(19)
    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$b */
    /* loaded from: classes.dex */
    public static class C1292b implements EmojiCompat.InterfaceC1287g {

        /* renamed from: a */
        public final Context f3173a;

        public C1292b(Context context) {
            this.f3173a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.EmojiCompat.InterfaceC1287g
        /* renamed from: a */
        public final void mo10669a(@NonNull final EmojiCompat.AbstractC1288h abstractC1288h) {
            final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC1294a("EmojiCompatInitializer"));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            threadPoolExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.C1292b c1292b = EmojiCompatInitializer.C1292b.this;
                    EmojiCompat.AbstractC1288h abstractC1288h2 = abstractC1288h;
                    ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                    c1292b.getClass();
                    try {
                        C1311j m10679a = C1296c.m10679a(c1292b.f3173a);
                        if (m10679a != null) {
                            C1311j.C1313b c1313b = (C1311j.C1313b) m10679a.f3166a;
                            synchronized (c1313b.f3208d) {
                                c1313b.f3210f = threadPoolExecutor2;
                            }
                            m10679a.f3166a.mo10669a(new C1307g(abstractC1288h2, threadPoolExecutor2));
                            return;
                        }
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    } catch (Throwable th) {
                        abstractC1288h2.mo10676a(th);
                        threadPoolExecutor2.shutdown();
                    }
                }
            });
        }
    }

    /* renamed from: androidx.emoji2.text.EmojiCompatInitializer$c */
    /* loaded from: classes.dex */
    public static class RunnableC1293c implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                int i = C0749q.f2431a;
                C0749q.C0750a.m11833a("EmojiCompat.EmojiCompatInitializer.run");
                if (EmojiCompat.f3154j != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    EmojiCompat.m10693a().m10691c();
                }
                C0749q.C0750a.m11832b();
            } catch (Throwable th) {
                int i2 = C0749q.f2431a;
                C0749q.C0750a.m11832b();
                throw th;
            }
        }
    }

    @Override // androidx.startup.InterfaceC1716b
    @NonNull
    /* renamed from: b */
    public final Boolean mo9910a(@NonNull Context context) {
        C1291a c1291a = new C1291a(context);
        if (EmojiCompat.f3154j == null) {
            synchronized (EmojiCompat.f3153i) {
                if (EmojiCompat.f3154j == null) {
                    EmojiCompat.f3154j = new EmojiCompat(c1291a);
                }
            }
        }
        m10684c(context);
        return Boolean.TRUE;
    }

    @RequiresApi(19)
    /* renamed from: c */
    public final void m10684c(@NonNull Context context) {
        Object obj;
        C1715a m10013c = C1715a.m10013c(context);
        m10013c.getClass();
        synchronized (C1715a.f4173e) {
            try {
                obj = m10013c.f4174a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = m10013c.m10014b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final AbstractC1464h lifecycle = ((InterfaceC1483m) obj).getLifecycle();
        lifecycle.mo10539a(new InterfaceC1452c() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.InterfaceC1452c
            /* renamed from: a */
            public final void mo10562a(InterfaceC1483m interfaceC1483m) {
            }

            @Override // androidx.lifecycle.InterfaceC1452c
            /* renamed from: b */
            public final void mo10561b(InterfaceC1483m interfaceC1483m) {
            }

            @Override // androidx.lifecycle.InterfaceC1452c
            /* renamed from: c */
            public final void mo10560c(InterfaceC1483m interfaceC1483m) {
            }

            @Override // androidx.lifecycle.InterfaceC1452c
            /* renamed from: d */
            public final void mo10559d(InterfaceC1483m interfaceC1483m) {
            }

            @Override // androidx.lifecycle.InterfaceC1452c
            /* renamed from: e */
            public final void mo10558e(InterfaceC1483m interfaceC1483m) {
            }

            @Override // androidx.lifecycle.InterfaceC1452c
            /* renamed from: f */
            public final void mo10557f() {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = C1295b.m10680a(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new RunnableC1293c(), 500L);
                lifecycle.mo10537c(this);
            }
        });
    }

    @Override // androidx.startup.InterfaceC1716b
    @NonNull
    public final List<Class<? extends InterfaceC1716b<?>>> dependencies() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
