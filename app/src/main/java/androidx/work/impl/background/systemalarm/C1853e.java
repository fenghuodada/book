package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.impl.C1890d;
import androidx.work.impl.C1915l;
import androidx.work.impl.InterfaceC1844b;
import androidx.work.impl.utils.C1986n;
import androidx.work.impl.utils.C1994t;
import androidx.work.impl.utils.ExecutorC1982k;
import androidx.work.impl.utils.taskexecutor.C1999b;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.systemalarm.e */
/* loaded from: classes.dex */
public final class C1853e implements InterfaceC1844b {

    /* renamed from: k */
    public static final String f4520k = AbstractC2005l.m9732e("SystemAlarmDispatcher");

    /* renamed from: a */
    public final Context f4521a;

    /* renamed from: b */
    public final InterfaceC1998a f4522b;

    /* renamed from: c */
    public final C1994t f4523c;

    /* renamed from: d */
    public final C1890d f4524d;

    /* renamed from: e */
    public final C1915l f4525e;

    /* renamed from: f */
    public final C1850b f4526f;

    /* renamed from: g */
    public final Handler f4527g;

    /* renamed from: h */
    public final ArrayList f4528h;

    /* renamed from: i */
    public Intent f4529i;
    @Nullable

    /* renamed from: j */
    public InterfaceC1856c f4530j;

    /* renamed from: androidx.work.impl.background.systemalarm.e$a */
    /* loaded from: classes.dex */
    public class RunnableC1854a implements Runnable {
        public RunnableC1854a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1853e c1853e;
            RunnableC1857d runnableC1857d;
            synchronized (C1853e.this.f4528h) {
                C1853e c1853e2 = C1853e.this;
                c1853e2.f4529i = (Intent) c1853e2.f4528h.get(0);
            }
            Intent intent = C1853e.this.f4529i;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C1853e.this.f4529i.getIntExtra("KEY_START_ID", 0);
                AbstractC2005l m9733c = AbstractC2005l.m9733c();
                String str = C1853e.f4520k;
                m9733c.mo9731a(str, String.format("Processing command %s, %s", C1853e.this.f4529i, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock m9742a = C1986n.m9742a(C1853e.this.f4521a, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    AbstractC2005l.m9733c().mo9731a(str, String.format("Acquiring operation wake lock (%s) %s", action, m9742a), new Throwable[0]);
                    m9742a.acquire();
                    C1853e c1853e3 = C1853e.this;
                    c1853e3.f4526f.m9882e(intExtra, c1853e3.f4529i, c1853e3);
                    AbstractC2005l.m9733c().mo9731a(str, String.format("Releasing operation wake lock (%s) %s", action, m9742a), new Throwable[0]);
                    m9742a.release();
                    c1853e = C1853e.this;
                    runnableC1857d = new RunnableC1857d(c1853e);
                } catch (Throwable th) {
                    try {
                        AbstractC2005l m9733c2 = AbstractC2005l.m9733c();
                        String str2 = C1853e.f4520k;
                        m9733c2.mo9730b(str2, "Unexpected error in onHandleIntent", th);
                        AbstractC2005l.m9733c().mo9731a(str2, String.format("Releasing operation wake lock (%s) %s", action, m9742a), new Throwable[0]);
                        m9742a.release();
                        c1853e = C1853e.this;
                        runnableC1857d = new RunnableC1857d(c1853e);
                    } catch (Throwable th2) {
                        AbstractC2005l.m9733c().mo9731a(C1853e.f4520k, String.format("Releasing operation wake lock (%s) %s", action, m9742a), new Throwable[0]);
                        m9742a.release();
                        C1853e c1853e4 = C1853e.this;
                        c1853e4.m9874f(new RunnableC1857d(c1853e4));
                        throw th2;
                    }
                }
                c1853e.m9874f(runnableC1857d);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$b */
    /* loaded from: classes.dex */
    public static class RunnableC1855b implements Runnable {

        /* renamed from: a */
        public final C1853e f4532a;

        /* renamed from: b */
        public final Intent f4533b;

        /* renamed from: c */
        public final int f4534c;

        public RunnableC1855b(int i, @NonNull Intent intent, @NonNull C1853e c1853e) {
            this.f4532a = c1853e;
            this.f4533b = intent;
            this.f4534c = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f4532a.m9878a(this.f4534c, this.f4533b);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1856c {
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$d */
    /* loaded from: classes.dex */
    public static class RunnableC1857d implements Runnable {

        /* renamed from: a */
        public final C1853e f4535a;

        public RunnableC1857d(@NonNull C1853e c1853e) {
            this.f4535a = c1853e;
        }

        @Override // java.lang.Runnable
        public final void run() {
            C1853e c1853e = this.f4535a;
            c1853e.getClass();
            AbstractC2005l m9733c = AbstractC2005l.m9733c();
            String str = C1853e.f4520k;
            m9733c.mo9731a(str, "Checking if commands are complete.", new Throwable[0]);
            c1853e.m9877b();
            synchronized (c1853e.f4528h) {
                if (c1853e.f4529i != null) {
                    AbstractC2005l.m9733c().mo9731a(str, String.format("Removing command %s", c1853e.f4529i), new Throwable[0]);
                    if (((Intent) c1853e.f4528h.remove(0)).equals(c1853e.f4529i)) {
                        c1853e.f4529i = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                ExecutorC1982k executorC1982k = ((C1999b) c1853e.f4522b).f4853a;
                if (!c1853e.f4526f.m9883d() && c1853e.f4528h.isEmpty() && !executorC1982k.m9744a()) {
                    AbstractC2005l.m9733c().mo9731a(str, "No more commands & intents.", new Throwable[0]);
                    InterfaceC1856c interfaceC1856c = c1853e.f4530j;
                    if (interfaceC1856c != null) {
                        ((SystemAlarmService) interfaceC1856c).m9888b();
                    }
                } else if (!c1853e.f4528h.isEmpty()) {
                    c1853e.m9873g();
                }
            }
        }
    }

    public C1853e(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f4521a = applicationContext;
        this.f4526f = new C1850b(applicationContext);
        this.f4523c = new C1994t();
        C1915l m9816c = C1915l.m9816c(context);
        this.f4525e = m9816c;
        C1890d c1890d = m9816c.f4660f;
        this.f4524d = c1890d;
        this.f4522b = m9816c.f4658d;
        c1890d.m9841a(this);
        this.f4528h = new ArrayList();
        this.f4529i = null;
        this.f4527g = new Handler(Looper.getMainLooper());
    }

    @MainThread
    /* renamed from: a */
    public final void m9878a(int i, @NonNull Intent intent) {
        AbstractC2005l m9733c = AbstractC2005l.m9733c();
        String str = f4520k;
        m9733c.mo9731a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(i)), new Throwable[0]);
        m9877b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            AbstractC2005l.m9733c().mo9728f(str, "Unknown command. Ignoring", new Throwable[0]);
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m9876d()) {
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.f4528h) {
                boolean z = !this.f4528h.isEmpty();
                this.f4528h.add(intent);
                if (!z) {
                    m9873g();
                }
            }
        }
    }

    /* renamed from: b */
    public final void m9877b() {
        if (this.f4527g.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // androidx.work.impl.InterfaceC1844b
    /* renamed from: c */
    public final void mo9824c(@NonNull String str, boolean z) {
        String str2 = C1850b.f4502d;
        Intent intent = new Intent(this.f4521a, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        m9874f(new RunnableC1855b(0, intent, this));
    }

    @MainThread
    /* renamed from: d */
    public final boolean m9876d() {
        m9877b();
        synchronized (this.f4528h) {
            Iterator it = this.f4528h.iterator();
            while (it.hasNext()) {
                if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: e */
    public final void m9875e() {
        AbstractC2005l.m9733c().mo9731a(f4520k, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f4524d.m9837f(this);
        ScheduledExecutorService scheduledExecutorService = this.f4523c.f4846a;
        if (!scheduledExecutorService.isShutdown()) {
            scheduledExecutorService.shutdownNow();
        }
        this.f4530j = null;
    }

    /* renamed from: f */
    public final void m9874f(@NonNull Runnable runnable) {
        this.f4527g.post(runnable);
    }

    @MainThread
    /* renamed from: g */
    public final void m9873g() {
        m9877b();
        PowerManager.WakeLock m9742a = C1986n.m9742a(this.f4521a, "ProcessCommand");
        try {
            m9742a.acquire();
            ((C1999b) this.f4525e.f4658d).m9738a(new RunnableC1854a());
        } finally {
            m9742a.release();
        }
    }
}
