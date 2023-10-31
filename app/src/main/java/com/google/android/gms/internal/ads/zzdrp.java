package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzdrp extends zzbvv {
    final /* synthetic */ zzdrr zza;

    public zzdrp(zzdrr zzdrrVar) {
        this.zza = zzdrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zze(int i) throws RemoteException {
        zzdrg zzdrgVar;
        long j;
        zzdrr zzdrrVar = this.zza;
        zzdrgVar = zzdrrVar.zzb;
        j = zzdrrVar.zza;
        zzdrgVar.zzm(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzdrg zzdrgVar;
        long j;
        zzdrr zzdrrVar = this.zza;
        zzdrgVar = zzdrrVar.zzb;
        j = zzdrrVar.zza;
        zzdrgVar.zzm(j, zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbvw
    public final void zzg() throws RemoteException {
        zzdrg zzdrgVar;
        long j;
        zzdrr zzdrrVar = this.zza;
        zzdrgVar = zzdrrVar.zzb;
        j = zzdrrVar.zza;
        zzdrgVar.zzp(j);
    }
}
