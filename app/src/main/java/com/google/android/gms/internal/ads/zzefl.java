package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzefl {
    private final zzfap zza;
    private final zzdnu zzb;
    private final zzdqc zzc;
    private final zzfen zzd;

    public zzefl(zzfap zzfapVar, zzdnu zzdnuVar, zzdqc zzdqcVar, zzfen zzfenVar) {
        this.zza = zzfapVar;
        this.zzb = zzdnuVar;
        this.zzc = zzdqcVar;
        this.zzd = zzfenVar;
    }

    public final void zza(zzezi zzeziVar, zzezf zzezfVar, int i, @Nullable zzebz zzebzVar, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzid)).booleanValue()) {
            zzfem zzb = zzfem.zzb("adapter_status");
            zzb.zzg(zzeziVar);
            zzb.zzf(zzezfVar);
            zzb.zza("adapter_l", String.valueOf(j));
            zzb.zza("sc", Integer.toString(i));
            if (zzebzVar != null) {
                zzb.zza("arec", Integer.toString(zzebzVar.zzb().zza));
                String zza = this.zza.zza(zzebzVar.getMessage());
                if (zza != null) {
                    zzb.zza("areec", zza);
                }
            }
            zzdnt zzb2 = this.zzb.zzb(zzezfVar.zzu);
            if (zzb2 != null) {
                zzb.zza("ancn", zzb2.zza);
                zzbqj zzbqjVar = zzb2.zzb;
                if (zzbqjVar != null) {
                    zzb.zza("adapter_v", zzbqjVar.toString());
                }
                zzbqj zzbqjVar2 = zzb2.zzc;
                if (zzbqjVar2 != null) {
                    zzb.zza("adapter_sv", zzbqjVar2.toString());
                }
            }
            this.zzd.zzb(zzb);
            return;
        }
        zzdqb zza2 = this.zzc.zza();
        zza2.zze(zzeziVar);
        zza2.zzd(zzezfVar);
        zza2.zzb("action", "adapter_status");
        zza2.zzb("adapter_l", String.valueOf(j));
        zza2.zzb("sc", Integer.toString(i));
        if (zzebzVar != null) {
            zza2.zzb("arec", Integer.toString(zzebzVar.zzb().zza));
            String zza3 = this.zza.zza(zzebzVar.getMessage());
            if (zza3 != null) {
                zza2.zzb("areec", zza3);
            }
        }
        zzdnt zzb3 = this.zzb.zzb(zzezfVar.zzu);
        if (zzb3 != null) {
            zza2.zzb("ancn", zzb3.zza);
            zzbqj zzbqjVar3 = zzb3.zzb;
            if (zzbqjVar3 != null) {
                zza2.zzb("adapter_v", zzbqjVar3.toString());
            }
            zzbqj zzbqjVar4 = zzb3.zzc;
            if (zzbqjVar4 != null) {
                zza2.zzb("adapter_sv", zzbqjVar4.toString());
            }
        }
        zza2.zzg();
    }
}
