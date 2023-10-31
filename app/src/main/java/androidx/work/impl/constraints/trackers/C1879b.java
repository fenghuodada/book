package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.constraints.trackers.b */
/* loaded from: classes.dex */
public final class C1879b extends AbstractC1880c<Boolean> {

    /* renamed from: i */
    public static final String f4563i = AbstractC2005l.m9732e("BatteryNotLowTracker");

    public C1879b(@NonNull Context context, @NonNull InterfaceC1998a interfaceC1998a) {
        super(context, interfaceC1998a);
    }

    @Override // androidx.work.impl.constraints.trackers.AbstractC1882d
    /* renamed from: a */
    public final Object mo9845a() {
        Intent registerReceiver = this.f4569b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            AbstractC2005l.m9733c().mo9730b(f4563i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        float intExtra = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        if (registerReceiver.getIntExtra("status", -1) == 1 || intExtra > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // androidx.work.impl.constraints.trackers.AbstractC1880c
    /* renamed from: f */
    public final IntentFilter mo9844f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.AbstractC1880c
    /* renamed from: g */
    public final void mo9843g(@NonNull Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        AbstractC2005l.m9733c().mo9731a(f4563i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.BATTERY_OKAY")) {
            bool = Boolean.TRUE;
        } else if (!action.equals("android.intent.action.BATTERY_LOW")) {
            return;
        } else {
            bool = Boolean.FALSE;
        }
        m9850c(bool);
    }
}
