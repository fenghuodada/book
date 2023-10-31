package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.google.android.datatransport.EnumC6464d;
import com.google.android.datatransport.runtime.AbstractC6522n;
import com.google.android.datatransport.runtime.logging.C6520a;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AbstractC6544f;
import com.google.android.datatransport.runtime.scheduling.persistence.InterfaceC6574d;
import com.google.android.datatransport.runtime.util.C6619a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.zip.Adler32;

@RequiresApi(api = 21)
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.d */
/* loaded from: classes.dex */
public final class C6542d implements InterfaceC6565x {

    /* renamed from: a */
    public final Context f10324a;

    /* renamed from: b */
    public final InterfaceC6574d f10325b;

    /* renamed from: c */
    public final AbstractC6544f f10326c;

    public C6542d(Context context, InterfaceC6574d interfaceC6574d, AbstractC6544f abstractC6544f) {
        this.f10324a = context;
        this.f10325b = interfaceC6574d;
        this.f10326c = abstractC6544f;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6565x
    /* renamed from: a */
    public final void mo6259a(AbstractC6522n abstractC6522n, int i) {
        mo6258b(abstractC6522n, i, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC6565x
    /* renamed from: b */
    public final void mo6258b(AbstractC6522n abstractC6522n, int i, boolean z) {
        boolean z2;
        Context context = this.f10324a;
        ComponentName componentName = new ComponentName(context, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(abstractC6522n.mo6277b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(C6619a.m6225a(abstractC6522n.mo6275d())).array());
        if (abstractC6522n.mo6276c() != null) {
            adler32.update(abstractC6522n.mo6276c());
        }
        int value = (int) adler32.getValue();
        if (!z) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i2 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i2 >= i) {
                        z2 = true;
                    }
                }
            }
            z2 = false;
            if (z2) {
                C6520a.m6286a(abstractC6522n, "JobInfoScheduler", "Upload for context %s is already scheduled. Returning...");
                return;
            }
        }
        long mo6248B = this.f10325b.mo6248B(abstractC6522n);
        JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
        EnumC6464d mo6275d = abstractC6522n.mo6275d();
        AbstractC6544f abstractC6544f = this.f10326c;
        builder.setMinimumLatency(abstractC6544f.m6265b(mo6275d, mo6248B, i));
        Set<AbstractC6544f.EnumC6547b> mo6262b = abstractC6544f.mo6264c().get(mo6275d).mo6262b();
        if (mo6262b.contains(AbstractC6544f.EnumC6547b.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (mo6262b.contains(AbstractC6544f.EnumC6547b.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (mo6262b.contains(AbstractC6544f.EnumC6547b.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", abstractC6522n.mo6277b());
        persistableBundle.putInt("priority", C6619a.m6225a(abstractC6522n.mo6275d()));
        if (abstractC6522n.mo6276c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(abstractC6522n.mo6276c(), 0));
        }
        builder.setExtras(persistableBundle);
        Object[] objArr = {abstractC6522n, Integer.valueOf(value), Long.valueOf(abstractC6544f.m6265b(abstractC6522n.mo6275d(), mo6248B, i)), Long.valueOf(mo6248B), Integer.valueOf(i)};
        String m6284c = C6520a.m6284c("JobInfoScheduler");
        if (Log.isLoggable(m6284c, 3)) {
            Log.d(m6284c, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
        }
        jobScheduler.schedule(builder.build());
    }
}
