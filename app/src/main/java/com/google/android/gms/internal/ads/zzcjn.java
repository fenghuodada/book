package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcjn {
    private zzcgz zza;
    private zzcla zzb;
    private zzfeh zzc;
    private zzcln zzd;
    private zzfbb zze;

    private zzcjn() {
    }

    public /* synthetic */ zzcjn(zzcjm zzcjmVar) {
    }

    public final zzcgw zza() {
        zzgvw.zzc(this.zza, zzcgz.class);
        zzgvw.zzc(this.zzb, zzcla.class);
        if (this.zzc == null) {
            this.zzc = new zzfeh();
        }
        if (this.zzd == null) {
            this.zzd = new zzcln();
        }
        if (this.zze == null) {
            this.zze = new zzfbb();
        }
        return new zzcir(this.zza, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzcjn zzb(zzcgz zzcgzVar) {
        this.zza = zzcgzVar;
        return this;
    }

    public final zzcjn zzc(zzcla zzclaVar) {
        this.zzb = zzclaVar;
        return this;
    }
}
