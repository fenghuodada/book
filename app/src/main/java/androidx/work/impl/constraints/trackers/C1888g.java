package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.constraints.trackers.g */
/* loaded from: classes.dex */
public final class C1888g extends AbstractC1880c<Boolean> {

    /* renamed from: i */
    public static final String f4581i = AbstractC2005l.m9732e("StorageNotLowTracker");

    public C1888g(@NonNull Context context, @NonNull InterfaceC1998a interfaceC1998a) {
        super(context, interfaceC1998a);
    }

    @Override // androidx.work.impl.constraints.trackers.AbstractC1882d
    /* renamed from: a */
    public final Object mo9845a() {
        Intent registerReceiver = this.f4569b.registerReceiver(null, mo9844f());
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.getClass();
            if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                return Boolean.FALSE;
            }
            if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                return null;
            }
        }
        return Boolean.TRUE;
    }

    @Override // androidx.work.impl.constraints.trackers.AbstractC1880c
    /* renamed from: f */
    public final IntentFilter mo9844f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
        return intentFilter;
    }

    @Override // androidx.work.impl.constraints.trackers.AbstractC1880c
    /* renamed from: g */
    public final void mo9843g(@NonNull Intent intent) {
        Boolean bool;
        if (intent.getAction() == null) {
            return;
        }
        AbstractC2005l.m9733c().mo9731a(f4581i, String.format("Received %s", intent.getAction()), new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            bool = Boolean.FALSE;
        } else if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
            return;
        } else {
            bool = Boolean.TRUE;
        }
        m9850c(bool);
    }
}
