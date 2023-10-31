package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdrm extends com.google.android.gms.ads.internal.client.zzbg {
    final /* synthetic */ zzdrg zza;
    final /* synthetic */ zzdrn zzb;

    public zzdrm(zzdrn zzdrnVar, zzdrg zzdrgVar) {
        this.zzb = zzdrnVar;
        this.zza = zzdrgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() throws RemoteException {
        long j;
        zzdrg zzdrgVar = this.zza;
        j = this.zzb.zza;
        zzdrgVar.zzb(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() throws RemoteException {
        long j;
        zzdrg zzdrgVar = this.zza;
        j = this.zzb.zza;
        zzdrgVar.zzc(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i) throws RemoteException {
        long j;
        zzdrg zzdrgVar = this.zza;
        j = this.zzb.zza;
        zzdrgVar.zzd(j, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        long j;
        zzdrg zzdrgVar = this.zza;
        j = this.zzb.zza;
        zzdrgVar.zzd(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() throws RemoteException {
        long j;
        zzdrg zzdrgVar = this.zza;
        j = this.zzb.zza;
        zzdrgVar.zze(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() throws RemoteException {
        long j;
        zzdrg zzdrgVar = this.zza;
        j = this.zzb.zza;
        zzdrgVar.zzg(j);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
    }
}
