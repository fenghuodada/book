package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.AbstractC6522n;
import com.google.android.datatransport.runtime.C6496d;
import com.google.android.datatransport.runtime.C6527r;
import com.google.android.datatransport.runtime.util.C6619a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f10314a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C6527r.m6270b(context);
        C6496d.C6497a m6278a = AbstractC6522n.m6278a();
        m6278a.m6300b(queryParameter);
        m6278a.m6299c(C6619a.m6224b(intValue));
        if (queryParameter2 != null) {
            m6278a.f10232b = Base64.decode(queryParameter2, 0);
        }
        C6559r c6559r = C6527r.m6271a().f10290d;
        C6496d m6301a = m6278a.m6301a();
        Runnable runnable = new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.a
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = AlarmManagerSchedulerBroadcastReceiver.f10314a;
            }
        };
        c6559r.getClass();
        c6559r.f10364e.execute(new RunnableC6557p(c6559r, m6301a, i, runnable));
    }
}
