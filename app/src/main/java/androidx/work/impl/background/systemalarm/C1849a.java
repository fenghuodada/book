package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.AbstractC1668i;
import androidx.work.AbstractC2005l;
import androidx.work.impl.C1915l;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.C1921d;
import androidx.work.impl.model.C1923f;
import androidx.work.impl.model.C1925g;
import androidx.work.impl.model.C1927i;
import androidx.work.impl.utils.C1965f;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.background.systemalarm.a */
/* loaded from: classes.dex */
public final class C1849a {

    /* renamed from: a */
    public static final String f4501a = AbstractC2005l.m9732e("Alarms");

    /* renamed from: a */
    public static void m9887a(@NonNull Context context, int i, @NonNull String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C1850b.m9885a(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        AbstractC2005l.m9733c().mo9731a(f4501a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    /* renamed from: b */
    public static void m9886b(@NonNull Context context, @NonNull C1915l c1915l, @NonNull String str, long j) {
        int i;
        int i2;
        WorkDatabase workDatabase = c1915l.f4657c;
        C1927i c1927i = (C1927i) workDatabase.mo9896k();
        C1925g m9806a = c1927i.m9806a(str);
        if (m9806a != null) {
            m9887a(context, m9806a.f4676b, str);
            int i3 = m9806a.f4676b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i3, C1850b.m9885a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        synchronized (C1965f.class) {
            workDatabase.m10074c();
            Long m9808a = ((C1923f) workDatabase.mo9897j()).m9808a("next_alarm_manager_id");
            if (m9808a != null) {
                i = m9808a.intValue();
            } else {
                i = 0;
            }
            if (i == Integer.MAX_VALUE) {
                i2 = 0;
            } else {
                i2 = i + 1;
            }
            ((C1923f) workDatabase.mo9897j()).m9807b(new C1921d("next_alarm_manager_id", i2));
            workDatabase.m10071h();
            workDatabase.m10073f();
        }
        C1925g c1925g = new C1925g(str, i);
        AbstractC1668i abstractC1668i = c1927i.f4677a;
        abstractC1668i.m10075b();
        abstractC1668i.m10074c();
        try {
            c1927i.f4678b.m10084e(c1925g);
            abstractC1668i.m10071h();
            abstractC1668i.m10073f();
            AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service2 = PendingIntent.getService(context, i, C1850b.m9885a(context, str), 201326592);
            if (alarmManager2 != null) {
                alarmManager2.setExact(0, j, service2);
            }
        } catch (Throwable th) {
            abstractC1668i.m10073f();
            throw th;
        }
    }
}
