package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.AbstractC2005l;
import androidx.work.impl.utils.taskexecutor.InterfaceC1998a;

@RestrictTo({RestrictTo.EnumC0076a.LIBRARY_GROUP})
/* renamed from: androidx.work.impl.constraints.trackers.a */
/* loaded from: classes.dex */
public final class C1878a extends AbstractC1880c<Boolean> {

    /* renamed from: i */
    public static final String f4562i = AbstractC2005l.m9732e("BatteryChrgTracker");

    public C1878a(@NonNull Context context, @NonNull InterfaceC1998a interfaceC1998a) {
        super(context, interfaceC1998a);
    }

    @Override // androidx.work.impl.constraints.trackers.AbstractC1882d
    /* renamed from: a */
    public final Object mo9845a() {
        Intent registerReceiver = this.f4569b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            AbstractC2005l.m9733c().mo9730b(f4562i, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra("status", -1);
        return Boolean.valueOf((intExtra == 2 || intExtra == 5) ? true : true);
    }

    @Override // androidx.work.impl.constraints.trackers.AbstractC1880c
    /* renamed from: f */
    public final IntentFilter mo9844f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.CHARGING");
        intentFilter.addAction("android.os.action.DISCHARGING");
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (r7.equals("android.os.action.DISCHARGING") == false) goto L7;
     */
    @Override // androidx.work.impl.constraints.trackers.AbstractC1880c
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void mo9843g(@androidx.annotation.NonNull android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r7 = r7.getAction()
            if (r7 != 0) goto L7
            return
        L7:
            androidx.work.l r0 = androidx.work.AbstractC2005l.m9733c()
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r7
            java.lang.String r4 = "Received %s"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            java.lang.String r5 = androidx.work.impl.constraints.trackers.C1878a.f4562i
            r0.mo9731a(r5, r2, r4)
            int r0 = r7.hashCode()
            r2 = -1
            switch(r0) {
                case -1886648615: goto L47;
                case -54942926: goto L3e;
                case 948344062: goto L33;
                case 1019184907: goto L28;
                default: goto L26;
            }
        L26:
            r1 = r2
            goto L51
        L28:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L31
            goto L26
        L31:
            r1 = 3
            goto L51
        L33:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L3c
            goto L26
        L3c:
            r1 = 2
            goto L51
        L3e:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L51
            goto L26
        L47:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r7 = r7.equals(r0)
            if (r7 != 0) goto L50
            goto L26
        L50:
            r1 = r3
        L51:
            switch(r1) {
                case 0: goto L58;
                case 1: goto L58;
                case 2: goto L55;
                case 3: goto L55;
                default: goto L54;
            }
        L54:
            goto L5d
        L55:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            goto L5a
        L58:
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L5a:
            r6.m9850c(r7)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.constraints.trackers.C1878a.mo9843g(android.content.Intent):void");
    }
}
