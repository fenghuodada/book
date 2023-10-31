package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdyf implements zzfvn {
    final /* synthetic */ zzbuc zza;

    public zzdyf(zzdyj zzdyjVar, zzbuc zzbucVar) {
        this.zza = zzbucVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        try {
            this.zza.zze(com.google.android.gms.ads.internal.util.zzaz.zzb(th));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }
}
