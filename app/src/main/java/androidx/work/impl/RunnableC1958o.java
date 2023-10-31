package androidx.work.impl;

import android.content.Context;
import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.AbstractC1668i;
import androidx.room.C1675k;
import androidx.sqlite.p004db.framework.C1714e;
import androidx.work.AbstractC2005l;
import androidx.work.C1830c;
import androidx.work.EnumC2018s;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.foreground.InterfaceC1894a;
import androidx.work.impl.model.C1919c;
import androidx.work.impl.model.C1936o;
import androidx.work.impl.model.C1940p;
import androidx.work.impl.model.C1943r;
import androidx.work.impl.model.InterfaceC1918b;
import androidx.work.impl.model.InterfaceC1942q;
import androidx.work.impl.model.InterfaceC1953t;
import androidx.work.impl.utils.C1978g;
import androidx.work.impl.utils.futures.C1977c;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;
import com.google.common.util.concurrent.InterfaceFutureC8037a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.o */
/* loaded from: classes.dex */
public final class RunnableC1958o implements Runnable {

    /* renamed from: t */
    public static final String f4726t = AbstractC2005l.m9732e("WorkerWrapper");

    /* renamed from: a */
    public final Context f4727a;

    /* renamed from: b */
    public final String f4728b;

    /* renamed from: c */
    public final List<InterfaceC1892e> f4729c;

    /* renamed from: d */
    public final WorkerParameters.C1827a f4730d;

    /* renamed from: e */
    public C1940p f4731e;

    /* renamed from: g */
    public final InterfaceC1998a f4733g;

    /* renamed from: i */
    public final C1830c f4735i;

    /* renamed from: j */
    public final InterfaceC1894a f4736j;

    /* renamed from: k */
    public final WorkDatabase f4737k;

    /* renamed from: l */
    public final InterfaceC1942q f4738l;

    /* renamed from: m */
    public final InterfaceC1918b f4739m;

    /* renamed from: n */
    public final InterfaceC1953t f4740n;

    /* renamed from: o */
    public ArrayList f4741o;

    /* renamed from: p */
    public String f4742p;

    /* renamed from: s */
    public volatile boolean f4745s;
    @NonNull

    /* renamed from: h */
    public ListenableWorker.AbstractC1822a f4734h = new ListenableWorker.AbstractC1822a.C1823a();
    @NonNull

    /* renamed from: q */
    public final C1977c<Boolean> f4743q = new C1977c<>();
    @Nullable

    /* renamed from: r */
    public InterfaceFutureC8037a<ListenableWorker.AbstractC1822a> f4744r = null;

    /* renamed from: f */
    public ListenableWorker f4732f = null;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: androidx.work.impl.o$a */
    /* loaded from: classes.dex */
    public static class C1959a {
        @NonNull

        /* renamed from: a */
        public final Context f4746a;
        @NonNull

        /* renamed from: b */
        public final InterfaceC1894a f4747b;
        @NonNull

        /* renamed from: c */
        public final InterfaceC1998a f4748c;
        @NonNull

        /* renamed from: d */
        public final C1830c f4749d;
        @NonNull

        /* renamed from: e */
        public final WorkDatabase f4750e;
        @NonNull

        /* renamed from: f */
        public final String f4751f;

        /* renamed from: g */
        public List<InterfaceC1892e> f4752g;
        @NonNull

        /* renamed from: h */
        public WorkerParameters.C1827a f4753h = new WorkerParameters.C1827a();

        public C1959a(@NonNull Context context, @NonNull C1830c c1830c, @NonNull InterfaceC1998a interfaceC1998a, @NonNull InterfaceC1894a interfaceC1894a, @NonNull WorkDatabase workDatabase, @NonNull String str) {
            this.f4746a = context.getApplicationContext();
            this.f4748c = interfaceC1998a;
            this.f4747b = interfaceC1894a;
            this.f4749d = c1830c;
            this.f4750e = workDatabase;
            this.f4751f = str;
        }
    }

    public RunnableC1958o(@NonNull C1959a c1959a) {
        this.f4727a = c1959a.f4746a;
        this.f4733g = c1959a.f4748c;
        this.f4736j = c1959a.f4747b;
        this.f4728b = c1959a.f4751f;
        this.f4729c = c1959a.f4752g;
        this.f4730d = c1959a.f4753h;
        this.f4735i = c1959a.f4749d;
        WorkDatabase workDatabase = c1959a.f4750e;
        this.f4737k = workDatabase;
        this.f4738l = workDatabase.mo9893n();
        this.f4739m = workDatabase.mo9898i();
        this.f4740n = workDatabase.mo9892o();
    }

    /* renamed from: a */
    public final void m9778a(ListenableWorker.AbstractC1822a abstractC1822a) {
        boolean z = abstractC1822a instanceof ListenableWorker.AbstractC1822a.C1825c;
        String str = f4726t;
        if (z) {
            AbstractC2005l.m9733c().mo9729d(str, String.format("Worker result SUCCESS for %s", this.f4742p), new Throwable[0]);
            if (!this.f4731e.m9802c()) {
                InterfaceC1918b interfaceC1918b = this.f4739m;
                String str2 = this.f4728b;
                InterfaceC1942q interfaceC1942q = this.f4738l;
                WorkDatabase workDatabase = this.f4737k;
                workDatabase.m10074c();
                try {
                    ((C1943r) interfaceC1942q).m9788n(EnumC2018s.SUCCEEDED, str2);
                    ((C1943r) interfaceC1942q).m9790l(str2, ((ListenableWorker.AbstractC1822a.C1825c) this.f4734h).f4417a);
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = ((C1919c) interfaceC1918b).m9810a(str2).iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        if (((C1943r) interfaceC1942q).m9796f(str3) == EnumC2018s.BLOCKED && ((C1919c) interfaceC1918b).m9809b(str3)) {
                            AbstractC2005l.m9733c().mo9729d(str, String.format("Setting status to enqueued for %s", str3), new Throwable[0]);
                            ((C1943r) interfaceC1942q).m9788n(EnumC2018s.ENQUEUED, str3);
                            ((C1943r) interfaceC1942q).m9789m(currentTimeMillis, str3);
                        }
                    }
                    workDatabase.m10071h();
                    return;
                } finally {
                    workDatabase.m10073f();
                    m9773f(false);
                }
            }
        } else if (abstractC1822a instanceof ListenableWorker.AbstractC1822a.C1824b) {
            AbstractC2005l.m9733c().mo9729d(str, String.format("Worker result RETRY for %s", this.f4742p), new Throwable[0]);
            m9775d();
            return;
        } else {
            AbstractC2005l.m9733c().mo9729d(str, String.format("Worker result FAILURE for %s", this.f4742p), new Throwable[0]);
            if (!this.f4731e.m9802c()) {
                m9771h();
                return;
            }
        }
        m9774e();
    }

    /* renamed from: b */
    public final void m9777b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            C1943r c1943r = (C1943r) this.f4738l;
            if (c1943r.m9796f(str2) != EnumC2018s.CANCELLED) {
                c1943r.m9788n(EnumC2018s.FAILED, str2);
            }
            linkedList.addAll(((C1919c) this.f4739m).m9810a(str2));
        }
    }

    /* renamed from: c */
    public final void m9776c() {
        boolean m9770i = m9770i();
        String str = this.f4728b;
        WorkDatabase workDatabase = this.f4737k;
        if (!m9770i) {
            workDatabase.m10074c();
            try {
                EnumC2018s m9796f = ((C1943r) this.f4738l).m9796f(str);
                C1936o c1936o = (C1936o) workDatabase.mo9894m();
                AbstractC1668i abstractC1668i = c1936o.f4686a;
                abstractC1668i.m10075b();
                C1936o.C1938b c1938b = c1936o.f4688c;
                C1714e m10062a = c1938b.m10062a();
                if (str == null) {
                    m10062a.m10018e(1);
                } else {
                    m10062a.m10017f(1, str);
                }
                abstractC1668i.m10074c();
                m10062a.m10016g();
                abstractC1668i.m10071h();
                abstractC1668i.m10073f();
                c1938b.m10061c(m10062a);
                if (m9796f == null) {
                    m9773f(false);
                } else if (m9796f == EnumC2018s.RUNNING) {
                    m9778a(this.f4734h);
                } else if (!m9796f.m9727a()) {
                    m9775d();
                }
                workDatabase.m10071h();
            } finally {
                workDatabase.m10073f();
            }
        }
        List<InterfaceC1892e> list = this.f4729c;
        if (list != null) {
            for (InterfaceC1892e interfaceC1892e : list) {
                interfaceC1892e.mo9829d(str);
            }
            C1893f.m9828a(this.f4735i, workDatabase, list);
        }
    }

    /* renamed from: d */
    public final void m9775d() {
        String str = this.f4728b;
        InterfaceC1942q interfaceC1942q = this.f4738l;
        WorkDatabase workDatabase = this.f4737k;
        workDatabase.m10074c();
        try {
            ((C1943r) interfaceC1942q).m9788n(EnumC2018s.ENQUEUED, str);
            ((C1943r) interfaceC1942q).m9789m(System.currentTimeMillis(), str);
            ((C1943r) interfaceC1942q).m9791k(-1L, str);
            workDatabase.m10071h();
        } finally {
            workDatabase.m10073f();
            m9773f(true);
        }
    }

    /* renamed from: e */
    public final void m9774e() {
        String str = this.f4728b;
        InterfaceC1942q interfaceC1942q = this.f4738l;
        WorkDatabase workDatabase = this.f4737k;
        workDatabase.m10074c();
        try {
            ((C1943r) interfaceC1942q).m9789m(System.currentTimeMillis(), str);
            ((C1943r) interfaceC1942q).m9788n(EnumC2018s.ENQUEUED, str);
            C1943r c1943r = (C1943r) interfaceC1942q;
            AbstractC1668i abstractC1668i = c1943r.f4710a;
            abstractC1668i.m10075b();
            C1943r.C1949f c1949f = c1943r.f4716g;
            C1714e m10062a = c1949f.m10062a();
            if (str == null) {
                m10062a.m10018e(1);
            } else {
                m10062a.m10017f(1, str);
            }
            abstractC1668i.m10074c();
            m10062a.m10016g();
            abstractC1668i.m10071h();
            abstractC1668i.m10073f();
            c1949f.m10061c(m10062a);
            ((C1943r) interfaceC1942q).m9791k(-1L, str);
            workDatabase.m10071h();
        } finally {
            workDatabase.m10073f();
            m9773f(false);
        }
    }

    /* renamed from: f */
    public final void m9773f(boolean z) {
        boolean z2;
        ListenableWorker listenableWorker;
        this.f4737k.m10074c();
        try {
            C1943r c1943r = (C1943r) this.f4737k.mo9893n();
            c1943r.getClass();
            C1675k m10068d = C1675k.m10068d(0, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
            AbstractC1668i abstractC1668i = c1943r.f4710a;
            abstractC1668i.m10075b();
            Cursor m10072g = abstractC1668i.m10072g(m10068d);
            if (m10072g.moveToFirst() && m10072g.getInt(0) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            m10072g.close();
            m10068d.release();
            if (!z2) {
                C1978g.m9747a(this.f4727a, RescheduleReceiver.class, false);
            }
            if (z) {
                ((C1943r) this.f4738l).m9788n(EnumC2018s.ENQUEUED, this.f4728b);
                ((C1943r) this.f4738l).m9791k(-1L, this.f4728b);
            }
            if (this.f4731e != null && (listenableWorker = this.f4732f) != null && listenableWorker.isRunInForeground()) {
                InterfaceC1894a interfaceC1894a = this.f4736j;
                String str = this.f4728b;
                C1890d c1890d = (C1890d) interfaceC1894a;
                synchronized (c1890d.f4598k) {
                    c1890d.f4593f.remove(str);
                    c1890d.m9834i();
                }
            }
            this.f4737k.m10071h();
            this.f4737k.m10073f();
            this.f4743q.m9750h(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.f4737k.m10073f();
            throw th;
        }
    }

    /* renamed from: g */
    public final void m9772g() {
        String str = this.f4728b;
        EnumC2018s m9796f = ((C1943r) this.f4738l).m9796f(str);
        EnumC2018s enumC2018s = EnumC2018s.RUNNING;
        String str2 = f4726t;
        if (m9796f == enumC2018s) {
            AbstractC2005l.m9733c().mo9731a(str2, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", str), new Throwable[0]);
            m9773f(true);
            return;
        }
        AbstractC2005l.m9733c().mo9731a(str2, String.format("Status for %s is %s; not doing any work", str, m9796f), new Throwable[0]);
        m9773f(false);
    }

    @VisibleForTesting
    /* renamed from: h */
    public final void m9771h() {
        String str = this.f4728b;
        WorkDatabase workDatabase = this.f4737k;
        workDatabase.m10074c();
        try {
            m9777b(str);
            ((C1943r) this.f4738l).m9790l(str, ((ListenableWorker.AbstractC1822a.C1823a) this.f4734h).f4416a);
            workDatabase.m10071h();
        } finally {
            workDatabase.m10073f();
            m9773f(false);
        }
    }

    /* renamed from: i */
    public final boolean m9770i() {
        if (this.f4745s) {
            AbstractC2005l.m9733c().mo9731a(f4726t, String.format("Work interrupted for %s", this.f4742p), new Throwable[0]);
            EnumC2018s m9796f = ((C1943r) this.f4738l).m9796f(this.f4728b);
            if (m9796f == null) {
                m9773f(false);
            } else {
                m9773f(!m9796f.m9727a());
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ac, code lost:
        if (r0 != false) goto L103;
     */
    @Override // java.lang.Runnable
    @androidx.annotation.WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 721
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.RunnableC1958o.run():void");
    }
}
