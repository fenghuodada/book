package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzemg implements zzeqq {
    private final zzfwc zza;
    private final Context zzb;

    public zzemg(zzfwc zzfwcVar, Context context) {
        this.zza = zzfwcVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    @SuppressLint({"UnprotectedReceiver"})
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzemg.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzemh zzc() throws Exception {
        double d;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        Intent registerReceiver = (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjx)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.zzb.registerReceiver(null, intentFilter) : this.zzb.registerReceiver(null, intentFilter, 4);
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            double intExtra2 = registerReceiver.getIntExtra("level", -1);
            double intExtra3 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
            d = intExtra2 / intExtra3;
        } else {
            d = -1.0d;
        }
        return new zzemh(d, z);
    }
}
