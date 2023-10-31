package com.vungle.warren.tasks.runnable;

import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vungle.warren.tasks.C9987i;
import com.vungle.warren.tasks.InterfaceC9981d;
import com.vungle.warren.tasks.InterfaceC9982e;
import com.vungle.warren.tasks.JobInfo;
import com.vungle.warren.tasks.utility.C9990a;
import com.vungle.warren.tasks.utility.InterfaceC9991b;
import com.vungle.warren.utility.AbstractRunnableC10101q;

/* renamed from: com.vungle.warren.tasks.runnable.a */
/* loaded from: classes3.dex */
public final class C9989a extends AbstractRunnableC10101q {

    /* renamed from: a */
    public final JobInfo f20083a;

    /* renamed from: b */
    public final InterfaceC9981d f20084b;

    /* renamed from: c */
    public final InterfaceC9982e f20085c;

    /* renamed from: d */
    public final InterfaceC9991b f20086d;

    public C9989a(@NonNull JobInfo jobInfo, @NonNull InterfaceC9981d interfaceC9981d, @NonNull InterfaceC9982e interfaceC9982e, @Nullable InterfaceC9991b interfaceC9991b) {
        this.f20083a = jobInfo;
        this.f20084b = interfaceC9981d;
        this.f20085c = interfaceC9982e;
        this.f20086d = interfaceC9991b;
    }

    @Override // com.vungle.warren.utility.AbstractRunnableC10101q
    /* renamed from: b */
    public final Integer mo1252b() {
        return Integer.valueOf(this.f20083a.f20057h);
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        InterfaceC9982e interfaceC9982e = this.f20085c;
        JobInfo jobInfo = this.f20083a;
        InterfaceC9991b interfaceC9991b = this.f20086d;
        if (interfaceC9991b != null) {
            try {
                ((C9990a) interfaceC9991b).getClass();
                int min = Math.min(19, Math.abs(Math.min(0, jobInfo.f20057h - 2)) + 10);
                Process.setThreadPriority(min);
                Log.d("a", "Setting process thread prio = " + min + " for " + jobInfo.f20050a);
            } catch (Throwable unused) {
                Log.e("a", "Error on setting process thread priority");
            }
        }
        try {
            String str = jobInfo.f20050a;
            Bundle bundle = jobInfo.f20055f;
            Log.d("a", "Start job " + str + "Thread " + Thread.currentThread().getName());
            int mo1357a = this.f20084b.mo1355a(str).mo1357a(bundle, interfaceC9982e);
            Log.d("a", "On job finished " + str + " with result " + mo1357a);
            if (mo1357a == 2) {
                long j2 = jobInfo.f20053d;
                if (j2 == 0) {
                    j = 0;
                } else {
                    long j3 = jobInfo.f20054e;
                    if (j3 == 0) {
                        jobInfo.f20054e = j2;
                    } else if (jobInfo.f20056g == 1) {
                        jobInfo.f20054e = j3 * 2;
                    }
                    j = jobInfo.f20054e;
                }
                if (j > 0) {
                    jobInfo.f20052c = j;
                    interfaceC9982e.mo1353a(jobInfo);
                    Log.d("a", "Rescheduling " + str + " in " + j);
                }
            }
        } catch (C9987i e) {
            Log.e("a", "Cannot create job" + e.getLocalizedMessage());
        } catch (Throwable th) {
            Log.e("a", "Can't start job", th);
        }
    }
}
