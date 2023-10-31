package com.vungle.warren.tasks;

import android.os.Bundle;
import com.google.gson.AbstractC8692o;
import com.google.gson.C8686j;
import com.vungle.warren.analytics.InterfaceC9751a;
import com.vungle.warren.tasks.JobInfo;

/* loaded from: classes3.dex */
public final class AnalyticsJob implements Job {

    /* renamed from: b */
    public static final /* synthetic */ int f20047b = 0;

    /* renamed from: a */
    public final InterfaceC9751a f20048a;

    /* loaded from: classes3.dex */
    public @interface Action {
        public static final int PING = 1;
        public static final int RETRY_UNSENT = 2;

        /* renamed from: RI */
        public static final int f20049RI = 0;
        public static final int STORE_URL = 3;
    }

    public AnalyticsJob(InterfaceC9751a interfaceC9751a) {
        this.f20048a = interfaceC9751a;
    }

    /* renamed from: b */
    public static JobInfo m1362b(@Action int i, String str, String[] strArr, @JobInfo.NetworkType int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("action_extra", i);
        bundle.putString("extra_body", str);
        bundle.putStringArray("extra_urls", strArr);
        JobInfo jobInfo = new JobInfo("AnalyticsJob");
        jobInfo.f20051b = false;
        jobInfo.f20055f = bundle;
        jobInfo.f20053d = 2000L;
        jobInfo.f20056g = 1;
        jobInfo.f20058i = i2;
        jobInfo.f20057h = 5;
        return jobInfo;
    }

    @Override // com.vungle.warren.tasks.Job
    /* renamed from: a */
    public final int mo1357a(Bundle bundle, InterfaceC9982e interfaceC9982e) {
        String[] stringArray;
        int i = bundle.getInt("action_extra", -1);
        InterfaceC9751a interfaceC9751a = this.f20048a;
        if (i == 0) {
            interfaceC9751a.mo1593a(((AbstractC8692o) new C8686j().m3235c(AbstractC8692o.class, bundle.getString("extra_body"))).m3220n());
            return 0;
        } else if (i == 1) {
            String[] stringArray2 = bundle.getStringArray("extra_urls");
            if (stringArray2 != null) {
                String[] mo1591c = interfaceC9751a.mo1591c(stringArray2);
                if (mo1591c.length != 0) {
                    bundle.putStringArray("extra_urls", mo1591c);
                    return 2;
                }
                return 0;
            }
            return 0;
        } else if (i == 2) {
            String[] mo1592b = interfaceC9751a.mo1592b();
            if (mo1592b.length != 0) {
                bundle.putStringArray("extra_urls", mo1592b);
                return 2;
            }
            return 0;
        } else if (i != 3 || (stringArray = bundle.getStringArray("extra_urls")) == null) {
            return 0;
        } else {
            interfaceC9751a.mo1590d(stringArray);
            return 0;
        }
    }
}
