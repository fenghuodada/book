package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.runtime.AbstractC6522n;
import com.google.android.datatransport.runtime.C6496d;
import com.google.android.datatransport.runtime.C6527r;
import com.google.android.datatransport.runtime.util.C6619a;

@RequiresApi(api = 21)
/* loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* renamed from: a */
    public static final /* synthetic */ int f10315a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        C6527r.m6270b(getApplicationContext());
        C6496d.C6497a m6278a = AbstractC6522n.m6278a();
        m6278a.m6300b(string);
        m6278a.m6299c(C6619a.m6224b(i));
        if (string2 != null) {
            m6278a.f10232b = Base64.decode(string2, 0);
        }
        C6559r c6559r = C6527r.m6271a().f10290d;
        C6496d m6301a = m6278a.m6301a();
        RunnableC6543e runnableC6543e = new RunnableC6543e(0, this, jobParameters);
        c6559r.getClass();
        c6559r.f10364e.execute(new RunnableC6557p(c6559r, m6301a, i2, runnableC6543e));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
