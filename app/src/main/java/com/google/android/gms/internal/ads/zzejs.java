package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzejs {
    private final zzdhn zza;
    private final zzejf zzb;
    private final zzcvl zzc;

    public zzejs(zzdhn zzdhnVar, zzfen zzfenVar) {
        this.zza = zzdhnVar;
        final zzejf zzejfVar = new zzejf(zzfenVar);
        this.zzb = zzejfVar;
        final zzbkz zzg = zzdhnVar.zzg();
        this.zzc = new zzcvl() { // from class: com.google.android.gms.internal.ads.zzejr
            @Override // com.google.android.gms.internal.ads.zzcvl
            public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzejf zzejfVar2 = zzejf.this;
                zzbkz zzbkzVar = zzg;
                zzejfVar2.zza(zzeVar);
                if (zzbkzVar != null) {
                    try {
                        zzbkzVar.zzf(zzeVar);
                    } catch (RemoteException e) {
                        zzbzt.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzbkzVar != null) {
                    try {
                        zzbkzVar.zze(zzeVar.zza);
                    } catch (RemoteException e2) {
                        zzbzt.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final zzcvl zza() {
        return this.zzc;
    }

    public final zzcww zzb() {
        return this.zzb;
    }

    public final zzdfh zzc() {
        return new zzdfh(this.zza, this.zzb.zzc());
    }

    public final zzejf zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        this.zzb.zze(zzbhVar);
    }
}
