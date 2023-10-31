package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;

/* loaded from: classes.dex */
public final class zzdzh implements zzdcb {
    private final String zzc;
    private final zzfen zzd;
    @GuardedBy("this")
    private boolean zza = false;
    @GuardedBy("this")
    private boolean zzb = false;
    private final com.google.android.gms.ads.internal.util.zzg zze = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzdzh(String str, zzfen zzfenVar) {
        this.zzc = str;
        this.zzd = zzfenVar;
    }

    private final zzfem zzg(String str) {
        String str2 = this.zze.zzP() ? "" : this.zzc;
        zzfem zzb = zzfem.zzb(str);
        zzb.zza("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime(), 10));
        zzb.zza("tid", str2);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdcb
    public final void zza(String str) {
        zzfen zzfenVar = this.zzd;
        zzfem zzg = zzg("aaia");
        zzg.zza("aair", "MalformedJson");
        zzfenVar.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdcb
    public final void zzb(String str, String str2) {
        zzfen zzfenVar = this.zzd;
        zzfem zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzg.zza("rqe", str2);
        zzfenVar.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdcb
    public final void zzc(String str) {
        zzfen zzfenVar = this.zzd;
        zzfem zzg = zzg("adapter_init_started");
        zzg.zza("ancn", str);
        zzfenVar.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdcb
    public final void zzd(String str) {
        zzfen zzfenVar = this.zzd;
        zzfem zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzfenVar.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdcb
    public final synchronized void zze() {
        if (this.zzb) {
            return;
        }
        this.zzd.zzb(zzg("init_finished"));
        this.zzb = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdcb
    public final synchronized void zzf() {
        if (this.zza) {
            return;
        }
        this.zzd.zzb(zzg("init_started"));
        this.zza = true;
    }
}
