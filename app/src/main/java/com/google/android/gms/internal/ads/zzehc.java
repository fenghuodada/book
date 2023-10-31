package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* loaded from: classes.dex */
public class zzehc extends zzbod {
    private final zzcvg zza;
    private final zzdcu zzb;
    private final zzcwa zzc;
    private final zzcwp zzd;
    private final zzcwu zze;
    private final zzdac zzf;
    private final zzcxo zzg;
    private final zzddm zzh;
    private final zzczy zzi;
    private final zzcvv zzj;

    public zzehc(zzcvg zzcvgVar, zzdcu zzdcuVar, zzcwa zzcwaVar, zzcwp zzcwpVar, zzcwu zzcwuVar, zzdac zzdacVar, zzcxo zzcxoVar, zzddm zzddmVar, zzczy zzczyVar, zzcvv zzcvvVar) {
        this.zza = zzcvgVar;
        this.zzb = zzdcuVar;
        this.zzc = zzcwaVar;
        this.zzd = zzcwpVar;
        this.zze = zzcwuVar;
        this.zzf = zzdacVar;
        this.zzg = zzcxoVar;
        this.zzh = zzddmVar;
        this.zzi = zzczyVar;
        this.zzj = zzcvvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzf() {
        this.zzg.zzf(4);
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzg(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzi(int i, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    @Deprecated
    public final void zzj(int i) throws RemoteException {
        zzk(new com.google.android.gms.ads.internal.client.zze(i, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zza(zzfba.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzo() {
        this.zze.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzp() {
        this.zzg.zzb();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzq(String str, String str2) {
        this.zzf.zzbz(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzr(zzbfk zzbfkVar, String str) {
    }

    public void zzs(zzbvi zzbviVar) {
    }

    public void zzt(zzbvm zzbvmVar) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzboe
    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
