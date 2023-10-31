package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.AbstractC2005l;
import androidx.work.impl.C1915l;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f4497a = AbstractC2005l.m9732e("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AbstractC2005l.m9733c().mo9731a(f4497a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            C1915l m9816c = C1915l.m9816c(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            m9816c.getClass();
            synchronized (C1915l.f4654l) {
                m9816c.f4663i = goAsync;
                if (m9816c.f4662h) {
                    goAsync.finish();
                    m9816c.f4663i = null;
                }
            }
        } catch (IllegalStateException e) {
            AbstractC2005l.m9733c().mo9730b(f4497a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
