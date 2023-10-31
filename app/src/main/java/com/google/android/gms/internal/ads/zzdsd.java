package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdsd extends zzbkh {
    final /* synthetic */ Object zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzfff zzd;
    final /* synthetic */ zzcal zze;
    final /* synthetic */ zzdse zzf;

    public zzdsd(zzdse zzdseVar, Object obj, String str, long j, zzfff zzfffVar, zzcal zzcalVar) {
        this.zzf = zzdseVar;
        this.zza = obj;
        this.zzb = str;
        this.zzc = j;
        this.zzd = zzfffVar;
        this.zze = zzcalVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final void zze(String str) {
        zzdql zzdqlVar;
        zzdbz zzdbzVar;
        zzfft zzfftVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, false, str, (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            zzdqlVar = this.zzf.zzl;
            zzdqlVar.zzb(this.zzb, "error");
            zzdbzVar = this.zzf.zzo;
            zzdbzVar.zzb(this.zzb, "error");
            zzfftVar = this.zzf.zzp;
            zzfff zzfffVar = this.zzd;
            zzfffVar.zzc(str);
            zzfffVar.zzf(false);
            zzfftVar.zzb(zzfffVar.zzl());
            this.zze.zzd(Boolean.FALSE);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbki
    public final void zzf() {
        zzdql zzdqlVar;
        zzdbz zzdbzVar;
        zzfft zzfftVar;
        synchronized (this.zza) {
            this.zzf.zzv(this.zzb, true, "", (int) (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
            zzdqlVar = this.zzf.zzl;
            zzdqlVar.zzd(this.zzb);
            zzdbzVar = this.zzf.zzo;
            zzdbzVar.zzd(this.zzb);
            zzfftVar = this.zzf.zzp;
            zzfff zzfffVar = this.zzd;
            zzfffVar.zzf(true);
            zzfftVar.zzb(zzfffVar.zzl());
            this.zze.zzd(Boolean.TRUE);
        }
    }
}
