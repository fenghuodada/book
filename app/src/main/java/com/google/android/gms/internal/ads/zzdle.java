package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdle extends zzbfg {
    @Nullable
    private final String zza;
    private final zzdgx zzb;
    private final zzdhc zzc;

    public zzdle(@Nullable String str, zzdgx zzdgxVar, zzdhc zzdhcVar) {
        this.zza = str;
        this.zzb = zzdgxVar;
        this.zzc = zzdhcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final Bundle zzb() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final com.google.android.gms.ads.internal.client.zzdq zzc() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final zzbei zzd() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final zzbeq zze() throws RemoteException {
        return this.zzc.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final IObjectWrapper zzf() throws RemoteException {
        return this.zzc.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final IObjectWrapper zzg() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final String zzh() throws RemoteException {
        return this.zzc.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final String zzi() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final String zzj() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final String zzk() throws RemoteException {
        return this.zzc.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final String zzl() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final List zzm() throws RemoteException {
        return this.zzc.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final void zzn() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final void zzo(Bundle bundle) throws RemoteException {
        this.zzb.zzF(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final void zzp(Bundle bundle) throws RemoteException {
        this.zzb.zzK(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbfh
    public final boolean zzq(Bundle bundle) throws RemoteException {
        return this.zzb.zzX(bundle);
    }
}
