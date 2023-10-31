package com.unity3d.services.core.request;

import android.os.ConditionVariable;
import com.unity3d.services.core.log.C9549a;
import com.unity3d.services.core.request.C9583h;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.unity3d.services.core.request.l */
/* loaded from: classes3.dex */
public class C9588l {

    /* renamed from: a */
    private static boolean f18998a = false;

    /* renamed from: b */
    private static LinkedBlockingQueue<Runnable> f18999b = null;

    /* renamed from: c */
    private static C9576a f19000c = null;

    /* renamed from: d */
    private static int f19001d = 1;

    /* renamed from: e */
    private static int f19002e = 1;

    /* renamed from: f */
    private static long f19003f = 1000;

    /* renamed from: g */
    private static final Object f19004g = new Object();

    /* renamed from: com.unity3d.services.core.request.l$a */
    /* loaded from: classes3.dex */
    public static class RunnableC9589a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            boolean unused = C9588l.f18998a = true;
            synchronized (C9588l.f19004g) {
                C9588l.f19004g.notify();
            }
        }
    }

    /* renamed from: com.unity3d.services.core.request.l$b */
    /* loaded from: classes3.dex */
    public static class RunnableC9590b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f19005a;

        /* renamed from: b */
        final /* synthetic */ InterfaceC9577b f19006b;

        /* renamed from: com.unity3d.services.core.request.l$b$a */
        /* loaded from: classes3.dex */
        public class RunnableC9591a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ConditionVariable f19007a;

            public RunnableC9591a(ConditionVariable conditionVariable) {
                this.f19007a = conditionVariable;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    String hostAddress = InetAddress.getByName(RunnableC9590b.this.f19005a).getHostAddress();
                    RunnableC9590b runnableC9590b = RunnableC9590b.this;
                    runnableC9590b.f19006b.mo1907a(runnableC9590b.f19005a, hostAddress);
                } catch (UnknownHostException e) {
                    C9549a.m2023a("Unknown host", e);
                    RunnableC9590b runnableC9590b2 = RunnableC9590b.this;
                    runnableC9590b2.f19006b.mo1908a(runnableC9590b2.f19005a, EnumC9581f.UNKNOWN_HOST, e.getMessage());
                }
                this.f19007a.open();
            }
        }

        public RunnableC9590b(String str, InterfaceC9577b interfaceC9577b) {
            this.f19005a = str;
            this.f19006b = interfaceC9577b;
        }

        @Override // java.lang.Runnable
        public void run() {
            Exception e;
            Thread thread;
            ConditionVariable conditionVariable = new ConditionVariable();
            try {
                thread = new Thread(new RunnableC9591a(conditionVariable));
                try {
                    thread.start();
                } catch (Exception e2) {
                    e = e2;
                    C9549a.m2023a("Exception while resolving host", e);
                    this.f19006b.mo1908a(this.f19005a, EnumC9581f.UNEXPECTED_EXCEPTION, e.getMessage());
                    if (conditionVariable.block(20000L)) {
                        return;
                    }
                    return;
                }
            } catch (Exception e3) {
                e = e3;
                thread = null;
            }
            if (conditionVariable.block(20000L) || thread == null) {
                return;
            }
            thread.interrupt();
            this.f19006b.mo1908a(this.f19005a, EnumC9581f.TIMEOUT, "Timeout");
        }
    }

    /* renamed from: a */
    public static synchronized void m1878a(int i) {
        synchronized (C9588l.class) {
            f19001d = i;
            f19002e = i;
            C9576a c9576a = f19000c;
            if (c9576a != null) {
                c9576a.setCorePoolSize(i);
                f19000c.setMaximumPoolSize(f19002e);
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m1877a(long j) {
        synchronized (C9588l.class) {
            f19003f = j;
            C9576a c9576a = f19000c;
            if (c9576a != null) {
                c9576a.setKeepAliveTime(j, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m1875a(String str, C9583h.EnumC9584a enumC9584a, Map<String, List<String>> map, Integer num, Integer num2, InterfaceC9578c interfaceC9578c) {
        synchronized (C9588l.class) {
            m1874a(str, enumC9584a, map, null, num, num2, interfaceC9578c);
        }
    }

    /* renamed from: a */
    public static synchronized void m1874a(String str, C9583h.EnumC9584a enumC9584a, Map<String, List<String>> map, String str2, Integer num, Integer num2, InterfaceC9578c interfaceC9578c) {
        synchronized (C9588l.class) {
            if (!f18998a) {
                m1870c();
            }
            if (str != null && str.length() >= 3) {
                f18999b.add(new RunnableC9587k(str, enumC9584a.name(), str2, num.intValue(), num2.intValue(), map, interfaceC9578c));
                return;
            }
            interfaceC9578c.mo1906a(str, "Request is NULL or too short");
        }
    }

    /* renamed from: a */
    public static synchronized boolean m1876a(String str, InterfaceC9577b interfaceC9577b) {
        synchronized (C9588l.class) {
            if (str != null) {
                if (str.length() >= 3) {
                    new Thread(new RunnableC9590b(str, interfaceC9577b)).start();
                    return true;
                }
            }
            interfaceC9577b.mo1908a(str, EnumC9581f.INVALID_HOST, "Host is NULL");
            return false;
        }
    }

    /* renamed from: b */
    public static synchronized void m1872b() {
        synchronized (C9588l.class) {
            C9576a c9576a = f19000c;
            if (c9576a != null) {
                c9576a.m1909a();
                Iterator<Runnable> it = f18999b.iterator();
                while (it.hasNext()) {
                    Runnable next = it.next();
                    if (next instanceof RunnableC9587k) {
                        ((RunnableC9587k) next).m1880a(true);
                    }
                }
                f18999b.clear();
                f19000c.purge();
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m1871b(int i) {
        synchronized (C9588l.class) {
            f19002e = i;
            C9576a c9576a = f19000c;
            if (c9576a != null) {
                c9576a.setMaximumPoolSize(i);
            }
        }
    }

    /* renamed from: c */
    private static synchronized void m1870c() {
        synchronized (C9588l.class) {
            f18999b = new LinkedBlockingQueue<>();
            C9576a c9576a = new C9576a(f19001d, f19002e, f19003f, TimeUnit.MILLISECONDS, f18999b);
            f19000c = c9576a;
            c9576a.prestartAllCoreThreads();
            f18999b.add(new RunnableC9589a());
            while (!f18998a) {
                try {
                    Object obj = f19004g;
                    synchronized (obj) {
                        obj.wait();
                    }
                } catch (InterruptedException unused) {
                    C9549a.m2019b("Couldn't synchronize thread");
                    return;
                }
            }
        }
    }
}
