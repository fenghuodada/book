package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.p003os.BuildCompat;
import androidx.work.AbstractC2005l;
import androidx.work.C1830c;
import androidx.work.impl.C1914k;
import androidx.work.impl.C1915l;
import java.util.concurrent.TimeUnit;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {

    /* renamed from: d */
    public static final String f4754d = AbstractC2005l.m9732e("ForceStopRunnable");

    /* renamed from: e */
    public static final long f4755e = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a */
    public final Context f4756a;

    /* renamed from: b */
    public final C1915l f4757b;

    /* renamed from: c */
    public int f4758c = 0;

    @RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a */
        public static final String f4759a = AbstractC2005l.m9732e("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                if (((AbstractC2005l.C2006a) AbstractC2005l.m9733c()).f4868b <= 2) {
                    Log.v(f4759a, "Rescheduling alarm that keeps track of force-stops.");
                }
                ForceStopRunnable.m9767d(context);
            }
        }
    }

    public ForceStopRunnable(@NonNull Context context, @NonNull C1915l c1915l) {
        this.f4756a = context.getApplicationContext();
        this.f4757b = c1915l;
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: d */
    public static void m9767d(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (BuildCompat.m11867b()) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + f4755e;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x008b A[SYNTHETIC] */
    @androidx.annotation.VisibleForTesting
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m9769b() {
        /*
            Method dump skipped, instructions count: 593
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.m9769b():void");
    }

    @VisibleForTesting
    /* renamed from: c */
    public final boolean m9768c() {
        C1830c c1830c = this.f4757b.f4656b;
        c1830c.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = f4754d;
        if (isEmpty) {
            AbstractC2005l.m9733c().mo9731a(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean m9745a = C1981j.m9745a(this.f4756a, c1830c);
        AbstractC2005l.m9733c().mo9731a(str, String.format("Is default app process = %s", Boolean.valueOf(m9745a)), new Throwable[0]);
        return m9745a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f4754d;
        C1915l c1915l = this.f4757b;
        try {
            if (!m9768c()) {
                return;
            }
            while (true) {
                C1914k.m9818a(this.f4756a);
                AbstractC2005l.m9733c().mo9731a(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    m9769b();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                    int i = this.f4758c + 1;
                    this.f4758c = i;
                    if (i < 3) {
                        AbstractC2005l.m9733c().mo9731a(str, String.format("Retrying after %s", Long.valueOf(i * 300)), e);
                        try {
                            Thread.sleep(this.f4758c * 300);
                        } catch (InterruptedException unused) {
                        }
                    } else {
                        AbstractC2005l.m9733c().mo9730b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                        c1915l.f4656b.getClass();
                        throw illegalStateException;
                    }
                }
            }
        } finally {
            c1915l.m9814e();
        }
    }
}
