package androidx.work.impl;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.room.AbstractC1668i;
import androidx.sqlite.p004db.framework.C1714e;
import androidx.work.AbstractC2005l;
import androidx.work.AbstractC2019t;
import androidx.work.C1830c;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemjob.C1862e;
import androidx.work.impl.model.C1943r;
import androidx.work.impl.utils.C1979h;
import androidx.work.impl.utils.RunnableC1984l;
import androidx.work.impl.utils.RunnableC1985m;
import androidx.work.impl.utils.taskexecutor.C1999b;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.l */
/* loaded from: classes.dex */
public final class C1915l extends AbstractC2019t {

    /* renamed from: j */
    public static C1915l f4652j;

    /* renamed from: k */
    public static C1915l f4653k;

    /* renamed from: l */
    public static final Object f4654l;

    /* renamed from: a */
    public Context f4655a;

    /* renamed from: b */
    public C1830c f4656b;

    /* renamed from: c */
    public WorkDatabase f4657c;

    /* renamed from: d */
    public InterfaceC1998a f4658d;

    /* renamed from: e */
    public List<InterfaceC1892e> f4659e;

    /* renamed from: f */
    public C1890d f4660f;

    /* renamed from: g */
    public C1979h f4661g;

    /* renamed from: h */
    public boolean f4662h;

    /* renamed from: i */
    public BroadcastReceiver.PendingResult f4663i;

    static {
        AbstractC2005l.m9732e("WorkManagerImpl");
        f4652j = null;
        f4653k = null;
        f4654l = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ea, code lost:
        if (r4 != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172 A[Catch: InstantiationException -> 0x0247, IllegalAccessException -> 0x025f, ClassNotFoundException -> 0x0277, TryCatch #3 {ClassNotFoundException -> 0x0277, IllegalAccessException -> 0x025f, InstantiationException -> 0x0247, blocks: (B:40:0x016a, B:44:0x0186, B:43:0x0172), top: B:81:0x016a }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1915l(@androidx.annotation.NonNull android.content.Context r25, @androidx.annotation.NonNull androidx.work.C1830c r26, @androidx.annotation.NonNull androidx.work.impl.utils.taskexecutor.C1999b r27) {
        /*
            Method dump skipped, instructions count: 684
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.C1915l.<init>(android.content.Context, androidx.work.c, androidx.work.impl.utils.taskexecutor.b):void");
    }

    @Nullable
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    @Deprecated
    /* renamed from: b */
    public static C1915l m9817b() {
        synchronized (f4654l) {
            C1915l c1915l = f4652j;
            if (c1915l != null) {
                return c1915l;
            }
            return f4653k;
        }
    }

    @NonNull
    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: c */
    public static C1915l m9816c(@NonNull Context context) {
        C1915l m9817b;
        synchronized (f4654l) {
            m9817b = m9817b();
            if (m9817b == null) {
                Context applicationContext = context.getApplicationContext();
                if (!(applicationContext instanceof C1830c.InterfaceC1832b)) {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
                m9815d(applicationContext, ((C1830c.InterfaceC1832b) applicationContext).m9905a());
                m9817b = m9816c(applicationContext);
            }
        }
        return m9817b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (androidx.work.impl.C1915l.f4653k != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        androidx.work.impl.C1915l.f4653k = new androidx.work.impl.C1915l(r4, r5, new androidx.work.impl.utils.taskexecutor.C1999b(r5.f4436b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        androidx.work.impl.C1915l.f4652j = androidx.work.impl.C1915l.f4653k;
     */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m9815d(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull androidx.work.C1830c r5) {
        /*
            java.lang.Object r0 = androidx.work.impl.C1915l.f4654l
            monitor-enter(r0)
            androidx.work.impl.l r1 = androidx.work.impl.C1915l.f4652j     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L14
            androidx.work.impl.l r2 = androidx.work.impl.C1915l.f4653k     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L14:
            if (r1 != 0) goto L30
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L32
            androidx.work.impl.l r1 = androidx.work.impl.C1915l.f4653k     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L2c
            androidx.work.impl.l r1 = new androidx.work.impl.l     // Catch: java.lang.Throwable -> L32
            androidx.work.impl.utils.taskexecutor.b r2 = new androidx.work.impl.utils.taskexecutor.b     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.ExecutorService r3 = r5.f4436b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L32
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L32
            androidx.work.impl.C1915l.f4653k = r1     // Catch: java.lang.Throwable -> L32
        L2c:
            androidx.work.impl.l r4 = androidx.work.impl.C1915l.f4653k     // Catch: java.lang.Throwable -> L32
            androidx.work.impl.C1915l.f4652j = r4     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.C1915l.m9815d(android.content.Context, androidx.work.c):void");
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: e */
    public final void m9814e() {
        synchronized (f4654l) {
            this.f4662h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f4663i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f4663i = null;
            }
        }
    }

    /* renamed from: f */
    public final void m9813f() {
        ArrayList m9864f;
        Context context = this.f4655a;
        String str = C1862e.f4541e;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (m9864f = C1862e.m9864f(context, jobScheduler)) != null && !m9864f.isEmpty()) {
            Iterator it = m9864f.iterator();
            while (it.hasNext()) {
                C1862e.m9866c(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        C1943r c1943r = (C1943r) this.f4657c.mo9893n();
        AbstractC1668i abstractC1668i = c1943r.f4710a;
        abstractC1668i.m10075b();
        C1943r.C1951h c1951h = c1943r.f4718i;
        C1714e m10062a = c1951h.m10062a();
        abstractC1668i.m10074c();
        try {
            m10062a.m10016g();
            abstractC1668i.m10071h();
            abstractC1668i.m10073f();
            c1951h.m10061c(m10062a);
            C1893f.m9828a(this.f4656b, this.f4657c, this.f4659e);
        } catch (Throwable th) {
            abstractC1668i.m10073f();
            c1951h.m10061c(m10062a);
            throw th;
        }
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: g */
    public final void m9812g(@NonNull String str, @Nullable WorkerParameters.C1827a c1827a) {
        ((C1999b) this.f4658d).m9738a(new RunnableC1984l(this, str, c1827a));
    }

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* renamed from: h */
    public final void m9811h(@NonNull String str) {
        ((C1999b) this.f4658d).m9738a(new RunnableC1985m(this, str, false));
    }
}
