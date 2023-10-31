package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzemh implements zzeqp {
    public final double zza;
    public final boolean zzb;

    public zzemh(double d, boolean z) {
        this.zza = d;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza = zzfal.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzfal.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzb);
        zza2.putDouble("battery_level", this.zza);
    }
}
