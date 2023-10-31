package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class zzeqz implements zzeqp {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final boolean zze;
    public final int zzf;

    public zzeqz(String str, int i, int i2, int i3, boolean z, int i4) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = z;
        this.zzf = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.zza;
        zzfal.zzf(bundle, "carrier", str, !TextUtils.isEmpty(str));
        int i = this.zzb;
        zzfal.zze(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.zzc);
        bundle.putInt("pt", this.zzd);
        Bundle zza = zzfal.zza(bundle, "device");
        bundle.putBundle("device", zza);
        Bundle zza2 = zzfal.zza(zza, "network");
        zza.putBundle("network", zza2);
        zza2.putInt("active_network_state", this.zzf);
        zza2.putBoolean("active_network_metered", this.zze);
    }
}
