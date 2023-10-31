package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdlj extends zzbgm {
    @Nullable
    private final String zza;
    private final zzdgx zzb;
    private final zzdhc zzc;
    private final zzdqc zzd;

    public zzdlj(@Nullable String str, zzdgx zzdgxVar, zzdhc zzdhcVar, zzdqc zzdqcVar) {
        this.zza = str;
        this.zzb = zzdgxVar;
        this.zzc = zzdhcVar;
        this.zzd = zzdqcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzA() {
        this.zzb.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzB(Bundle bundle) throws RemoteException {
        this.zzb.zzK(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzC() {
        this.zzb.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzD(com.google.android.gms.ads.internal.client.zzcs zzcsVar) throws RemoteException {
        this.zzb.zzN(zzcsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzE(com.google.android.gms.ads.internal.client.zzdg zzdgVar) throws RemoteException {
        try {
            if (!zzdgVar.zzf()) {
                this.zzd.zze();
            }
        } catch (RemoteException e) {
            zzbzt.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzO(zzdgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzF(zzbgk zzbgkVar) throws RemoteException {
        this.zzb.zzP(zzbgkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final boolean zzG() {
        return this.zzb.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final boolean zzH() throws RemoteException {
        return (this.zzc.zzG().isEmpty() || this.zzc.zzk() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final boolean zzI(Bundle bundle) throws RemoteException {
        return this.zzb.zzX(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final double zze() throws RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final Bundle zzf() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdn zzg() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgy)).booleanValue()) {
            return this.zzb.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final com.google.android.gms.ads.internal.client.zzdq zzh() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final zzbei zzi() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final zzben zzj() throws RemoteException {
        return this.zzb.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final zzbeq zzk() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final IObjectWrapper zzl() throws RemoteException {
        return this.zzc.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final IObjectWrapper zzm() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzn() throws RemoteException {
        return this.zzc.zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzo() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzp() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzq() throws RemoteException {
        return this.zzc.zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzr() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzs() throws RemoteException {
        return this.zzc.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final String zzt() throws RemoteException {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final List zzu() throws RemoteException {
        return this.zzc.zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final List zzv() throws RemoteException {
        return zzH() ? this.zzc.zzG() : Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzw() throws RemoteException {
        this.zzb.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzx() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzy(@Nullable com.google.android.gms.ads.internal.client.zzcw zzcwVar) throws RemoteException {
        this.zzb.zzB(zzcwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zzz(Bundle bundle) throws RemoteException {
        this.zzb.zzF(bundle);
    }
}
