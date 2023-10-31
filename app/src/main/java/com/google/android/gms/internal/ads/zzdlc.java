package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdlc extends zzbfe {
    @Nullable
    private final String zza;
    private final zzdgx zzb;
    private final zzdhc zzc;

    public zzdlc(@Nullable String str, zzdgx zzdgxVar, zzdhc zzdhcVar) {
        this.zza = str;
        this.zzb = zzdgxVar;
        this.zzc = zzdhcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final double zzb() throws RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final Bundle zzc() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final com.google.android.gms.ads.internal.client.zzdq zzd() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzbei zze() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final zzbeq zzf() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final IObjectWrapper zzg() throws RemoteException {
        return this.zzc.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final IObjectWrapper zzh() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final String zzi() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final String zzj() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final String zzk() throws RemoteException {
        return this.zzc.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final String zzl() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final String zzm() throws RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final String zzn() throws RemoteException {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final List zzo() throws RemoteException {
        return this.zzc.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final void zzp() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final void zzq(Bundle bundle) throws RemoteException {
        this.zzb.zzF(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final void zzr(Bundle bundle) throws RemoteException {
        this.zzb.zzK(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbff
    public final boolean zzs(Bundle bundle) throws RemoteException {
        return this.zzb.zzX(bundle);
    }
}
