package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* loaded from: classes.dex */
public final class zzedr extends zzbod implements zzcws {
    private zzboe zza;
    private zzcwr zzb;

    @Override // com.google.android.gms.internal.ads.zzcws
    public final synchronized void zza(zzcwr zzcwrVar) {
        this.zzb = zzcwrVar;
    }

    public final synchronized void zzc(zzboe zzboeVar) {
        this.zza = zzboeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zze() throws RemoteException {
        zzboe zzboeVar = this.zza;
        if (zzboeVar != null) {
            zzboeVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzf() throws RemoteException {
        zzboe zzboeVar = this.zza;
        if (zzboeVar != null) {
            zzboeVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzg(int i) throws RemoteException {
        zzcwr zzcwrVar = this.zzb;
        if (zzcwrVar != null) {
            zzcwrVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzcwr zzcwrVar = this.zzb;
        if (zzcwrVar != null) {
            zzcwrVar.zzb(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzi(int i, String str) throws RemoteException {
        zzcwr zzcwrVar = this.zzb;
        if (zzcwrVar != null) {
            zzcwrVar.zzc(i, str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzj(int i) throws RemoteException {
        zzboe zzboeVar = this.zza;
        if (zzboeVar != null) {
            zzboeVar.zzj(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzboe zzboeVar = this.zza;
        if (zzboeVar != null) {
            zzboeVar.zzk(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzl(String str) throws RemoteException {
        zzboe zzboeVar = this.zza;
        if (zzboeVar != null) {
            zzboeVar.zzl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzm() throws RemoteException {
        zzboe zzboeVar = this.zza;
        if (zzboeVar != null) {
            zzboeVar.zzm();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzn() throws RemoteException {
        zzboe zzboeVar = this.zza;
        if (zzboeVar != null) {
            zzboeVar.zzn();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzo() throws RemoteException {
        zzboe zzboeVar = this.zza;
        if (zzboeVar != null) {
            zzboeVar.zzo();
        }
        zzcwr zzcwrVar = this.zzb;
        if (zzcwrVar != null) {
            zzcwrVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzp() throws RemoteException {
        zzboe zzboeVar = this.zza;
        if (zzboeVar != null) {
            zzboeVar.zzp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzq(String str, String str2) throws RemoteException {
        zzboe zzboeVar = this.zza;
        if (zzboeVar != null) {
            zzboeVar.zzq(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzr(zzbfk zzbfkVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzs(zzbvi zzbviVar) throws RemoteException {
        zzboe zzboeVar = this.zza;
        if (zzboeVar != null) {
            zzboeVar.zzs(zzbviVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzt(zzbvm zzbvmVar) throws RemoteException {
        zzboe zzboeVar = this.zza;
        if (zzboeVar != null) {
            zzboeVar.zzt(zzbvmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzu() throws RemoteException {
        zzboe zzboeVar = this.zza;
        if (zzboeVar != null) {
            zzboeVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzv() throws RemoteException {
        zzboe zzboeVar = this.zza;
        if (zzboeVar != null) {
            zzboeVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzw() throws RemoteException {
        zzboe zzboeVar = this.zza;
        if (zzboeVar != null) {
            zzboeVar.zzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzx() throws RemoteException {
        zzboe zzboeVar = this.zza;
        if (zzboeVar != null) {
            zzboeVar.zzx();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final synchronized void zzy() throws RemoteException {
        zzboe zzboeVar = this.zza;
        if (zzboeVar != null) {
            zzboeVar.zzy();
        }
    }
}
