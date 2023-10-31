package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;

/* loaded from: classes.dex */
final class zzdys implements zzfvn {
    final /* synthetic */ zzbtz zza;

    public zzdys(zzdyt zzdytVar, zzbtz zzbtzVar) {
        this.zza = zzbtzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        try {
            this.zza.zze(com.google.android.gms.ads.internal.util.zzaz.zzb(th));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ad service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Ad service can't call client", e);
        }
    }
}
