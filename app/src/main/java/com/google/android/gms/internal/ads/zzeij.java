package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzeij extends com.google.android.gms.ads.internal.client.zzbm {
    private final zzejq zza;

    public zzeij(Context context, zzcgw zzcgwVar, zzezy zzezyVar, zzdhn zzdhnVar, com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        zzejs zzejsVar = new zzejs(zzdhnVar, zzcgwVar.zzx());
        zzejsVar.zze(zzbhVar);
        this.zza = new zzejq(new zzekc(zzcgwVar, context, zzejsVar, zzezyVar), zzezyVar.zzI());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zze() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized String zzf() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        this.zza.zzd(zzlVar, 1);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zzl zzlVar, int i) throws RemoteException {
        this.zza.zzd(zzlVar, i);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final synchronized boolean zzi() throws RemoteException {
        return this.zza.zze();
    }
}
