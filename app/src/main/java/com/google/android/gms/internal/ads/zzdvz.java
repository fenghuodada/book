package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzdvz implements zzdwb {
    private final Map zza;
    private final zzfwc zzb;
    private final zzcyb zzc;

    public zzdvz(Map map, zzfwc zzfwcVar, zzcyb zzcybVar) {
        this.zza = map;
        this.zzb = zzfwcVar;
        this.zzc = zzcybVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdwb
    public final zzfwb zzb(final zzbug zzbugVar) {
        this.zzc.zzbA(zzbugVar);
        zzfwb zzg = zzfvr.zzg(new zzdtz(3));
        for (String str : ((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzhK)).split(",")) {
            final zzgwb zzgwbVar = (zzgwb) this.zza.get(str.trim());
            if (zzgwbVar != null) {
                zzg = zzfvr.zzf(zzg, zzdtz.class, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdvx
                    @Override // com.google.android.gms.internal.ads.zzfuy
                    public final zzfwb zza(Object obj) {
                        zzgwb zzgwbVar2 = zzgwb.this;
                        zzdtz zzdtzVar = (zzdtz) obj;
                        return ((zzdwb) zzgwbVar2.zzb()).zzb(zzbugVar);
                    }
                }, this.zzb);
            }
        }
        zzfvr.zzq(zzg, new zzdvy(this), zzcag.zzf);
        return zzg;
    }
}
