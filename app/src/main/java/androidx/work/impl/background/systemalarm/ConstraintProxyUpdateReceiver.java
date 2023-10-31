package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.AbstractC2005l;
import androidx.work.impl.C1915l;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.utils.C1978g;
import androidx.work.impl.utils.taskexecutor.C1999b;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final String f4493a = AbstractC2005l.m9732e("ConstrntProxyUpdtRecvr");

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    /* loaded from: classes.dex */
    public class RunnableC1848a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Intent f4494a;

        /* renamed from: b */
        public final /* synthetic */ Context f4495b;

        /* renamed from: c */
        public final /* synthetic */ BroadcastReceiver.PendingResult f4496c;

        public RunnableC1848a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f4494a = intent;
            this.f4495b = context;
            this.f4496c = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.f4496c;
            Context context = this.f4495b;
            Intent intent = this.f4494a;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                AbstractC2005l.m9733c().mo9731a(ConstraintProxyUpdateReceiver.f4493a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                C1978g.m9747a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C1978g.m9747a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C1978g.m9747a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C1978g.m9747a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, @Nullable Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            AbstractC2005l.m9733c().mo9731a(f4493a, String.format("Ignoring unknown action %s", str), new Throwable[0]);
            return;
        }
        ((C1999b) C1915l.m9816c(context).f4658d).m9738a(new RunnableC1848a(intent, context, goAsync()));
    }
}
