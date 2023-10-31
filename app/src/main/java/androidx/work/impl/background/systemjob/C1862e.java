package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.room.AbstractC1668i;
import androidx.work.AbstractC2005l;
import androidx.work.C1830c;
import androidx.work.EnumC2018s;
import androidx.work.impl.C1915l;
import androidx.work.impl.InterfaceC1892e;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C1921d;
import androidx.work.impl.model.C1923f;
import androidx.work.impl.model.C1925g;
import androidx.work.impl.model.C1927i;
import androidx.work.impl.model.C1940p;
import androidx.work.impl.model.C1943r;
import androidx.work.impl.utils.C1965f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

@RequiresApi(23)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.systemjob.e */
/* loaded from: classes.dex */
public final class C1862e implements InterfaceC1892e {

    /* renamed from: e */
    public static final String f4541e = AbstractC2005l.m9732e("SystemJobScheduler");

    /* renamed from: a */
    public final Context f4542a;

    /* renamed from: b */
    public final JobScheduler f4543b;

    /* renamed from: c */
    public final C1915l f4544c;

    /* renamed from: d */
    public final C1861d f4545d;

    public C1862e(@NonNull Context context, @NonNull C1915l c1915l) {
        C1861d c1861d = new C1861d(context);
        this.f4542a = context;
        this.f4544c = c1915l;
        this.f4543b = (JobScheduler) context.getSystemService("jobscheduler");
        this.f4545d = c1861d;
    }

    /* renamed from: c */
    public static void m9866c(@NonNull JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            AbstractC2005l.m9733c().mo9730b(f4541e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0012 A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList m9865e(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull android.app.job.JobScheduler r6, @androidx.annotation.NonNull java.lang.String r7) {
        /*
            java.util.ArrayList r5 = m9864f(r5, r6)
            r6 = 0
            if (r5 != 0) goto L8
            return r6
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r5.next()
            android.app.job.JobInfo r1 = (android.app.job.JobInfo) r1
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r3 = r1.getExtras()
            if (r3 == 0) goto L31
            boolean r4 = r3.containsKey(r2)     // Catch: java.lang.NullPointerException -> L31
            if (r4 == 0) goto L31
            java.lang.String r2 = r3.getString(r2)     // Catch: java.lang.NullPointerException -> L31
            goto L32
        L31:
            r2 = r6
        L32:
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L12
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L12
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.C1862e.m9865e(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.ArrayList");
    }

    @Nullable
    /* renamed from: f */
    public static ArrayList m9864f(@NonNull Context context, @NonNull JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            AbstractC2005l.m9733c().mo9730b(f4541e, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // androidx.work.impl.InterfaceC1892e
    /* renamed from: a */
    public final void mo9831a(@NonNull C1940p... c1940pArr) {
        int i;
        int i2;
        int i3;
        ArrayList m9865e;
        int m9763a;
        C1940p[] c1940pArr2 = c1940pArr;
        C1915l c1915l = this.f4544c;
        WorkDatabase workDatabase = c1915l.f4657c;
        C1965f c1965f = new C1965f(workDatabase);
        int length = c1940pArr2.length;
        int i4 = 0;
        int i5 = 0;
        while (i5 < length) {
            C1940p c1940p = c1940pArr2[i5];
            workDatabase.m10074c();
            try {
                C1940p m9793i = ((C1943r) workDatabase.mo9893n()).m9793i(c1940p.f4690a);
                String str = f4541e;
                if (m9793i == null) {
                    AbstractC2005l.m9733c().mo9728f(str, "Skipping scheduling " + c1940p.f4690a + " because it's no longer in the DB", new Throwable[i4]);
                } else if (m9793i.f4691b != EnumC2018s.ENQUEUED) {
                    AbstractC2005l.m9733c().mo9728f(str, "Skipping scheduling " + c1940p.f4690a + " because it is no longer enqueued", new Throwable[i4]);
                } else {
                    C1925g m9806a = ((C1927i) workDatabase.mo9896k()).m9806a(c1940p.f4690a);
                    if (m9806a != null) {
                        i3 = m9806a.f4676b;
                    } else {
                        c1915l.f4656b.getClass();
                        int i6 = c1915l.f4656b.f4441g;
                        synchronized (C1965f.class) {
                            try {
                                WorkDatabase workDatabase2 = c1965f.f4771a;
                                workDatabase2.m10074c();
                                try {
                                    Long m9808a = ((C1923f) workDatabase2.mo9897j()).m9808a("next_job_scheduler_id");
                                    if (m9808a != null) {
                                        i = m9808a.intValue();
                                    } else {
                                        i = i4;
                                    }
                                    if (i == Integer.MAX_VALUE) {
                                        i2 = i4;
                                    } else {
                                        i2 = i + 1;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                }
                                try {
                                    ((C1923f) workDatabase2.mo9897j()).m9807b(new C1921d("next_job_scheduler_id", i2));
                                    workDatabase2.m10071h();
                                    try {
                                        workDatabase2.m10073f();
                                        if (i >= 0 && i <= i6) {
                                            i3 = i;
                                        }
                                        ((C1923f) c1965f.f4771a.mo9897j()).m9807b(new C1921d("next_job_scheduler_id", 1));
                                        i3 = 0;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    workDatabase2.m10073f();
                                    throw th;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                        throw th;
                    }
                    if (m9806a == null) {
                        try {
                            C1925g c1925g = new C1925g(c1940p.f4690a, i3);
                            C1927i c1927i = (C1927i) c1915l.f4657c.mo9896k();
                            AbstractC1668i abstractC1668i = c1927i.f4677a;
                            abstractC1668i.m10075b();
                            abstractC1668i.m10074c();
                            c1927i.f4678b.m10084e(c1925g);
                            abstractC1668i.m10071h();
                            abstractC1668i.m10073f();
                        } catch (Throwable th5) {
                            th = th5;
                            workDatabase.m10073f();
                            throw th;
                        }
                    }
                    m9863g(c1940p, i3);
                    if (Build.VERSION.SDK_INT == 23 && (m9865e = m9865e(this.f4542a, this.f4543b, c1940p.f4690a)) != null) {
                        int indexOf = m9865e.indexOf(Integer.valueOf(i3));
                        if (indexOf >= 0) {
                            m9865e.remove(indexOf);
                        }
                        if (!m9865e.isEmpty()) {
                            i4 = 0;
                            m9763a = ((Integer) m9865e.get(0)).intValue();
                        } else {
                            i4 = 0;
                            c1915l.f4656b.getClass();
                            m9763a = c1965f.m9763a(c1915l.f4656b.f4441g);
                        }
                        m9863g(c1940p, m9763a);
                    } else {
                        i4 = 0;
                    }
                }
                workDatabase.m10071h();
                workDatabase.m10073f();
                i5++;
                c1940pArr2 = c1940pArr;
            } catch (Throwable th6) {
                th = th6;
            }
        }
    }

    @Override // androidx.work.impl.InterfaceC1892e
    /* renamed from: b */
    public final boolean mo9830b() {
        return true;
    }

    @Override // androidx.work.impl.InterfaceC1892e
    /* renamed from: d */
    public final void mo9829d(@NonNull String str) {
        Context context = this.f4542a;
        JobScheduler jobScheduler = this.f4543b;
        ArrayList m9865e = m9865e(context, jobScheduler, str);
        if (m9865e != null && !m9865e.isEmpty()) {
            Iterator it = m9865e.iterator();
            while (it.hasNext()) {
                m9866c(jobScheduler, ((Integer) it.next()).intValue());
            }
            ((C1927i) this.f4544c.f4657c.mo9896k()).m9805b(str);
        }
    }

    @VisibleForTesting
    /* renamed from: g */
    public final void m9863g(C1940p c1940p, int i) {
        int i2;
        JobScheduler jobScheduler = this.f4543b;
        JobInfo m9867a = this.f4545d.m9867a(c1940p, i);
        AbstractC2005l m9733c = AbstractC2005l.m9733c();
        Object[] objArr = {c1940p.f4690a, Integer.valueOf(i)};
        String str = f4541e;
        m9733c.mo9731a(str, String.format("Scheduling work ID %s Job ID %s", objArr), new Throwable[0]);
        try {
            if (jobScheduler.schedule(m9867a) == 0) {
                AbstractC2005l.m9733c().mo9728f(str, String.format("Unable to schedule work ID %s", c1940p.f4690a), new Throwable[0]);
                if (c1940p.f4706q && c1940p.f4707r == 1) {
                    c1940p.f4706q = false;
                    AbstractC2005l.m9733c().mo9731a(str, String.format("Scheduling a non-expedited job (work ID %s)", c1940p.f4690a), new Throwable[0]);
                    m9863g(c1940p, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList m9864f = m9864f(this.f4542a, jobScheduler);
            if (m9864f != null) {
                i2 = m9864f.size();
            } else {
                i2 = 0;
            }
            Locale locale = Locale.getDefault();
            Object[] objArr2 = new Object[3];
            objArr2[0] = Integer.valueOf(i2);
            C1915l c1915l = this.f4544c;
            objArr2[1] = Integer.valueOf(((C1943r) c1915l.f4657c.mo9893n()).m9797e().size());
            C1830c c1830c = c1915l.f4656b;
            int i3 = Build.VERSION.SDK_INT;
            int i4 = c1830c.f4442h;
            if (i3 == 23) {
                i4 /= 2;
            }
            objArr2[2] = Integer.valueOf(i4);
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", objArr2);
            AbstractC2005l.m9733c().mo9730b(str, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            AbstractC2005l.m9733c().mo9730b(str, String.format("Unable to schedule %s", c1940p), th);
        }
    }
}
