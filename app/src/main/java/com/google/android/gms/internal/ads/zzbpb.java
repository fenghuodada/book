package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzbpb extends zzbod {
    private final Adapter zza;
    private final zzbvh zzb;

    public zzbpb(Adapter adapter, zzbvh zzbvhVar) {
        this.zza = adapter;
        this.zzb = zzbvhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zze() throws RemoteException {
        zzbvh zzbvhVar = this.zzb;
        if (zzbvhVar != null) {
            zzbvhVar.zze(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzf() throws RemoteException {
        zzbvh zzbvhVar = this.zzb;
        if (zzbvhVar != null) {
            zzbvhVar.zzf(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzg(int i) throws RemoteException {
        zzbvh zzbvhVar = this.zzb;
        if (zzbvhVar != null) {
            zzbvhVar.zzg(ObjectWrapper.wrap(this.zza), i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzi(int i, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzj(int i) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzl(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzm() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzn() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzo() throws RemoteException {
        zzbvh zzbvhVar = this.zzb;
        if (zzbvhVar != null) {
            zzbvhVar.zzi(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzp() throws RemoteException {
        zzbvh zzbvhVar = this.zzb;
        if (zzbvhVar != null) {
            zzbvhVar.zzj(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzq(String str, String str2) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzr(zzbfk zzbfkVar, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzs(zzbvi zzbviVar) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzt(zzbvm zzbvmVar) throws RemoteException {
        zzbvh zzbvhVar = this.zzb;
        if (zzbvhVar != null) {
            zzbvhVar.zzm(ObjectWrapper.wrap(this.zza), new zzbvi(zzbvmVar.zzf(), zzbvmVar.zze()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzu() throws RemoteException {
        zzbvh zzbvhVar = this.zzb;
        if (zzbvhVar != null) {
            zzbvhVar.zzn(ObjectWrapper.wrap(this.zza));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzv() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzw() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzx() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzy() throws RemoteException {
        zzbvh zzbvhVar = this.zzb;
        if (zzbvhVar != null) {
            zzbvhVar.zzo(ObjectWrapper.wrap(this.zza));
        }
    }
}
