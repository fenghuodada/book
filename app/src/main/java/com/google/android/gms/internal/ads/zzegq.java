package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;

/* loaded from: classes.dex */
final class zzegq extends zzbvg {
    final /* synthetic */ zzcxo zza;
    final /* synthetic */ zzcvg zzb;
    final /* synthetic */ zzcwp zzc;
    final /* synthetic */ zzddf zzd;

    public zzegq(zzegr zzegrVar, zzcxo zzcxoVar, zzcvg zzcvgVar, zzcwp zzcwpVar, zzddf zzddfVar) {
        this.zza = zzcxoVar;
        this.zzb = zzcvgVar;
        this.zzc = zzcwpVar;
        this.zzd = zzddfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzf(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzg(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzk(IObjectWrapper iObjectWrapper, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzm(IObjectWrapper iObjectWrapper, zzbvi zzbviVar) {
        this.zzd.zza(zzbviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
