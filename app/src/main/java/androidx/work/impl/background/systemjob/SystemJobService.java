package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.impl.C1915l;
import androidx.work.impl.InterfaceC1844b;
import java.util.HashMap;

@RequiresApi(23)
@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC1844b {

    /* renamed from: c */
    public static final String f4536c = AbstractC2005l.m9732e("SystemJobService");

    /* renamed from: a */
    public C1915l f4537a;

    /* renamed from: b */
    public final HashMap f4538b = new HashMap();

    @Override // androidx.work.impl.InterfaceC1844b
    /* renamed from: c */
    public final void mo9824c(@NonNull String str, boolean z) {
        JobParameters jobParameters;
        AbstractC2005l.m9733c().mo9731a(f4536c, String.format("%s executed on JobScheduler", str), new Throwable[0]);
        synchronized (this.f4538b) {
            jobParameters = (JobParameters) this.f4538b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            C1915l m9816c = C1915l.m9816c(getApplicationContext());
            this.f4537a = m9816c;
            m9816c.f4660f.m9841a(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                AbstractC2005l.m9733c().mo9728f(f4536c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        C1915l c1915l = this.f4537a;
        if (c1915l != null) {
            c1915l.f4660f.m9837f(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStartJob(@androidx.annotation.NonNull android.app.job.JobParameters r10) {
        /*
            r9 = this;
            androidx.work.impl.l r0 = r9.f4537a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L17
            androidx.work.l r0 = androidx.work.AbstractC2005l.m9733c()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f4536c
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.mo9731a(r3, r4, r5)
            r9.jobFinished(r10, r1)
            return r2
        L17:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            r3 = 0
            android.os.PersistableBundle r4 = r10.getExtras()     // Catch: java.lang.NullPointerException -> L2b
            if (r4 == 0) goto L2b
            boolean r5 = r4.containsKey(r0)     // Catch: java.lang.NullPointerException -> L2b
            if (r5 == 0) goto L2b
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.NullPointerException -> L2b
            goto L2c
        L2b:
            r0 = r3
        L2c:
            boolean r4 = android.text.TextUtils.isEmpty(r0)
            if (r4 == 0) goto L40
            androidx.work.l r10 = androidx.work.AbstractC2005l.m9733c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f4536c
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r10.mo9730b(r0, r1, r3)
            return r2
        L40:
            java.util.HashMap r4 = r9.f4538b
            monitor-enter(r4)
            java.util.HashMap r5 = r9.f4538b     // Catch: java.lang.Throwable -> Lb8
            boolean r5 = r5.containsKey(r0)     // Catch: java.lang.Throwable -> Lb8
            if (r5 == 0) goto L62
            androidx.work.l r10 = androidx.work.AbstractC2005l.m9733c()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f4536c     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lb8
            r1[r2] = r0     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> Lb8
            r10.mo9731a(r3, r0, r1)     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb8
            return r2
        L62:
            androidx.work.l r5 = androidx.work.AbstractC2005l.m9733c()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r6 = androidx.work.impl.background.systemjob.SystemJobService.f4536c     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r7 = "onStartJob for %s"
            java.lang.Object[] r8 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Lb8
            r8[r2] = r0     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r7 = java.lang.String.format(r7, r8)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch: java.lang.Throwable -> Lb8
            r5.mo9731a(r6, r7, r2)     // Catch: java.lang.Throwable -> Lb8
            java.util.HashMap r2 = r9.f4538b     // Catch: java.lang.Throwable -> Lb8
            r2.put(r0, r10)     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb8
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r2 < r4) goto Lb2
            androidx.work.WorkerParameters$a r3 = new androidx.work.WorkerParameters$a
            r3.<init>()
            android.net.Uri[] r4 = androidx.work.impl.background.systemjob.C1863f.m9862a(r10)
            if (r4 == 0) goto L98
            android.net.Uri[] r4 = androidx.work.impl.background.systemjob.C1863f.m9862a(r10)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f4431b = r4
        L98:
            java.lang.String[] r4 = androidx.appcompat.view.C0195i.m12863c(r10)
            if (r4 == 0) goto La8
            java.lang.String[] r4 = androidx.appcompat.view.C0195i.m12863c(r10)
            java.util.List r4 = java.util.Arrays.asList(r4)
            r3.f4430a = r4
        La8:
            r4 = 28
            if (r2 < r4) goto Lb2
            android.net.Network r10 = androidx.core.app.C0640r.m12053a(r10)
            r3.f4432c = r10
        Lb2:
            androidx.work.impl.l r10 = r9.f4537a
            r10.m9812g(r0, r3)
            return r1
        Lb8:
            r10 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb8
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    @Override // android.app.job.JobService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onStopJob(@androidx.annotation.NonNull android.app.job.JobParameters r7) {
        /*
            r6 = this;
            androidx.work.impl.l r0 = r6.f4537a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L14
            androidx.work.l r7 = androidx.work.AbstractC2005l.m9733c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f4536c
            java.lang.String r3 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r7.mo9731a(r0, r3, r2)
            return r1
        L14:
            java.lang.String r0 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r7 = r7.getExtras()     // Catch: java.lang.NullPointerException -> L27
            if (r7 == 0) goto L27
            boolean r3 = r7.containsKey(r0)     // Catch: java.lang.NullPointerException -> L27
            if (r3 == 0) goto L27
            java.lang.String r7 = r7.getString(r0)     // Catch: java.lang.NullPointerException -> L27
            goto L28
        L27:
            r7 = 0
        L28:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L3c
            androidx.work.l r7 = androidx.work.AbstractC2005l.m9733c()
            java.lang.String r0 = androidx.work.impl.background.systemjob.SystemJobService.f4536c
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r7.mo9730b(r0, r1, r3)
            return r2
        L3c:
            androidx.work.l r0 = androidx.work.AbstractC2005l.m9733c()
            java.lang.String r3 = androidx.work.impl.background.systemjob.SystemJobService.f4536c
            java.lang.String r4 = "onStopJob for %s"
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r5[r2] = r7
            java.lang.String r4 = java.lang.String.format(r4, r5)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]
            r0.mo9731a(r3, r4, r2)
            java.util.HashMap r0 = r6.f4538b
            monitor-enter(r0)
            java.util.HashMap r2 = r6.f4538b     // Catch: java.lang.Throwable -> L69
            r2.remove(r7)     // Catch: java.lang.Throwable -> L69
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            androidx.work.impl.l r0 = r6.f4537a
            r0.m9811h(r7)
            androidx.work.impl.l r0 = r6.f4537a
            androidx.work.impl.d r0 = r0.f4660f
            boolean r7 = r0.m9839d(r7)
            r7 = r7 ^ r1
            return r7
        L69:
            r7 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L69
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStopJob(android.app.job.JobParameters):boolean");
    }
}
