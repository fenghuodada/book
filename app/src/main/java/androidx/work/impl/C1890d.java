package androidx.work.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.content.ContextCompat;
import androidx.work.AbstractC2005l;
import androidx.work.C1830c;
import androidx.work.C1839g;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.RunnableC1958o;
import androidx.work.impl.foreground.C1896c;
import androidx.work.impl.foreground.InterfaceC1894a;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.impl.utils.C1986n;
import androidx.work.impl.utils.futures.C1977c;
import androidx.work.impl.utils.taskexecutor.C1999b;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;
import com.google.common.util.concurrent.InterfaceFutureC8037a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.d */
/* loaded from: classes.dex */
public final class C1890d implements InterfaceC1844b, InterfaceC1894a {

    /* renamed from: l */
    public static final String f4587l = AbstractC2005l.m9732e("Processor");

    /* renamed from: b */
    public final Context f4589b;

    /* renamed from: c */
    public final C1830c f4590c;

    /* renamed from: d */
    public final InterfaceC1998a f4591d;

    /* renamed from: e */
    public final WorkDatabase f4592e;

    /* renamed from: h */
    public final List<InterfaceC1892e> f4595h;

    /* renamed from: g */
    public final HashMap f4594g = new HashMap();

    /* renamed from: f */
    public final HashMap f4593f = new HashMap();

    /* renamed from: i */
    public final HashSet f4596i = new HashSet();

    /* renamed from: j */
    public final ArrayList f4597j = new ArrayList();
    @Nullable

    /* renamed from: a */
    public PowerManager.WakeLock f4588a = null;

    /* renamed from: k */
    public final Object f4598k = new Object();

    /* renamed from: androidx.work.impl.d$a */
    /* loaded from: classes.dex */
    public static class RunnableC1891a implements Runnable {
        @NonNull

        /* renamed from: a */
        public final InterfaceC1844b f4599a;
        @NonNull

        /* renamed from: b */
        public final String f4600b;
        @NonNull

        /* renamed from: c */
        public final InterfaceFutureC8037a<Boolean> f4601c;

        public RunnableC1891a(@NonNull InterfaceC1844b interfaceC1844b, @NonNull String str, @NonNull C1977c c1977c) {
            this.f4599a = interfaceC1844b;
            this.f4600b = str;
            this.f4601c = c1977c;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            try {
                z = this.f4601c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f4599a.mo9824c(this.f4600b, z);
        }
    }

    public C1890d(@NonNull Context context, @NonNull C1830c c1830c, @NonNull C1999b c1999b, @NonNull WorkDatabase workDatabase, @NonNull List list) {
        this.f4589b = context;
        this.f4590c = c1830c;
        this.f4591d = c1999b;
        this.f4592e = workDatabase;
        this.f4595h = list;
    }

    /* renamed from: b */
    public static boolean m9840b(@NonNull String str, @Nullable RunnableC1958o runnableC1958o) {
        boolean z;
        if (runnableC1958o != null) {
            runnableC1958o.f4745s = true;
            runnableC1958o.m9770i();
            InterfaceFutureC8037a<ListenableWorker.AbstractC1822a> interfaceFutureC8037a = runnableC1958o.f4744r;
            if (interfaceFutureC8037a != null) {
                z = interfaceFutureC8037a.isDone();
                runnableC1958o.f4744r.cancel(true);
            } else {
                z = false;
            }
            ListenableWorker listenableWorker = runnableC1958o.f4732f;
            if (listenableWorker != null && !z) {
                listenableWorker.stop();
            } else {
                AbstractC2005l.m9733c().mo9731a(RunnableC1958o.f4726t, String.format("WorkSpec %s is already done. Not interrupting.", runnableC1958o.f4731e), new Throwable[0]);
            }
            AbstractC2005l.m9733c().mo9731a(f4587l, String.format("WorkerWrapper interrupted for %s", str), new Throwable[0]);
            return true;
        }
        AbstractC2005l.m9733c().mo9731a(f4587l, String.format("WorkerWrapper could not be found for %s", str), new Throwable[0]);
        return false;
    }

    /* renamed from: a */
    public final void m9841a(@NonNull InterfaceC1844b interfaceC1844b) {
        synchronized (this.f4598k) {
            this.f4597j.add(interfaceC1844b);
        }
    }

    @Override // androidx.work.impl.InterfaceC1844b
    /* renamed from: c */
    public final void mo9824c(@NonNull String str, boolean z) {
        synchronized (this.f4598k) {
            this.f4594g.remove(str);
            AbstractC2005l.m9733c().mo9731a(f4587l, String.format("%s %s executed; reschedule = %s", C1890d.class.getSimpleName(), str, Boolean.valueOf(z)), new Throwable[0]);
            Iterator it = this.f4597j.iterator();
            while (it.hasNext()) {
                ((InterfaceC1844b) it.next()).mo9824c(str, z);
            }
        }
    }

    /* renamed from: d */
    public final boolean m9839d(@NonNull String str) {
        boolean contains;
        synchronized (this.f4598k) {
            contains = this.f4596i.contains(str);
        }
        return contains;
    }

    /* renamed from: e */
    public final boolean m9838e(@NonNull String str) {
        boolean z;
        synchronized (this.f4598k) {
            z = this.f4594g.containsKey(str) || this.f4593f.containsKey(str);
        }
        return z;
    }

    /* renamed from: f */
    public final void m9837f(@NonNull InterfaceC1844b interfaceC1844b) {
        synchronized (this.f4598k) {
            this.f4597j.remove(interfaceC1844b);
        }
    }

    /* renamed from: g */
    public final void m9836g(@NonNull String str, @NonNull C1839g c1839g) {
        synchronized (this.f4598k) {
            AbstractC2005l.m9733c().mo9729d(f4587l, String.format("Moving WorkSpec (%s) to the foreground", str), new Throwable[0]);
            RunnableC1958o runnableC1958o = (RunnableC1958o) this.f4594g.remove(str);
            if (runnableC1958o != null) {
                if (this.f4588a == null) {
                    PowerManager.WakeLock m9742a = C1986n.m9742a(this.f4589b, "ProcessorForegroundLck");
                    this.f4588a = m9742a;
                    m9742a.acquire();
                }
                this.f4593f.put(str, runnableC1958o);
                Intent m9825b = C1896c.m9825b(this.f4589b, str, c1839g);
                Context context = this.f4589b;
                Object obj = ContextCompat.f2323a;
                if (Build.VERSION.SDK_INT >= 26) {
                    ContextCompat.C0654f.m12023b(context, m9825b);
                } else {
                    context.startService(m9825b);
                }
            }
        }
    }

    /* renamed from: h */
    public final boolean m9835h(@NonNull String str, @Nullable WorkerParameters.C1827a c1827a) {
        synchronized (this.f4598k) {
            if (m9838e(str)) {
                AbstractC2005l.m9733c().mo9731a(f4587l, String.format("Work %s is already enqueued for processing", str), new Throwable[0]);
                return false;
            }
            RunnableC1958o.C1959a c1959a = new RunnableC1958o.C1959a(this.f4589b, this.f4590c, this.f4591d, this, this.f4592e, str);
            c1959a.f4752g = this.f4595h;
            if (c1827a != null) {
                c1959a.f4753h = c1827a;
            }
            RunnableC1958o runnableC1958o = new RunnableC1958o(c1959a);
            C1977c<Boolean> c1977c = runnableC1958o.f4743q;
            c1977c.addListener(new RunnableC1891a(this, str, c1977c), ((C1999b) this.f4591d).f4855c);
            this.f4594g.put(str, runnableC1958o);
            ((C1999b) this.f4591d).f4853a.execute(runnableC1958o);
            AbstractC2005l.m9733c().mo9731a(f4587l, String.format("%s: processing %s", C1890d.class.getSimpleName(), str), new Throwable[0]);
            return true;
        }
    }

    /* renamed from: i */
    public final void m9834i() {
        synchronized (this.f4598k) {
            if (!(!this.f4593f.isEmpty())) {
                Context context = this.f4589b;
                String str = C1896c.f4612j;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                this.f4589b.startService(intent);
                PowerManager.WakeLock wakeLock = this.f4588a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f4588a = null;
                }
            }
        }
    }

    /* renamed from: j */
    public final boolean m9833j(@NonNull String str) {
        boolean m9840b;
        synchronized (this.f4598k) {
            AbstractC2005l.m9733c().mo9731a(f4587l, String.format("Processor stopping foreground work %s", str), new Throwable[0]);
            m9840b = m9840b(str, (RunnableC1958o) this.f4593f.remove(str));
        }
        return m9840b;
    }

    /* renamed from: k */
    public final boolean m9832k(@NonNull String str) {
        boolean m9840b;
        synchronized (this.f4598k) {
            AbstractC2005l.m9733c().mo9731a(f4587l, String.format("Processor stopping background work %s", str), new Throwable[0]);
            m9840b = m9840b(str, (RunnableC1958o) this.f4594g.remove(str));
        }
        return m9840b;
    }
}
