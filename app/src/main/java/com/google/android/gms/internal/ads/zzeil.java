package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzeil extends com.google.android.gms.ads.internal.client.zzbt implements zzcxy {
    private final Context zza;
    private final zzevr zzb;
    private final String zzc;
    private final zzejf zzd;
    private com.google.android.gms.ads.internal.client.zzq zze;
    private final zzezy zzf;
    private final zzbzz zzg;
    private final zzdqc zzh;
    @Nullable
    private zzcpd zzi;

    public zzeil(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzevr zzevrVar, zzejf zzejfVar, zzbzz zzbzzVar, zzdqc zzdqcVar) {
        this.zza = context;
        this.zzb = zzevrVar;
        this.zze = zzqVar;
        this.zzc = str;
        this.zzd = zzejfVar;
        this.zzf = zzevrVar.zzi();
        this.zzg = zzbzzVar;
        this.zzh = zzdqcVar;
        zzevrVar.zzp(this);
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzf.zzr(zzqVar);
        this.zzf.zzw(this.zze.zzn);
    }

    private final synchronized boolean zzf(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        if (zzh()) {
            Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        }
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!com.google.android.gms.ads.internal.util.zzs.zzD(this.zza) || zzlVar.zzs != null) {
            zzfau.zza(this.zza, zzlVar.zzf);
            return this.zzb.zzb(zzlVar, this.zzc, null, new zzeik(this));
        }
        zzbzt.zzg("Failed to load the ad because app ID is missing.");
        zzejf zzejfVar = this.zzd;
        if (zzejfVar != null) {
            zzejfVar.zza(zzfba.zzd(4, null, null));
        }
        return false;
    }

    private final boolean zzh() {
        boolean z;
        if (((Boolean) zzbdb.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjG)).booleanValue()) {
                z = true;
                return this.zzg.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjH)).intValue() || !z;
            }
        }
        z = false;
        if (this.zzg.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjH)).intValue()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzA() {
        Preconditions.checkMainThread("recordManualImpression must be called on the main UI thread.");
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar != null) {
            zzcpdVar.zzg();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r3.zzg.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbk.zzjI)).intValue()) goto L18;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzB() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbcp r0 = com.google.android.gms.internal.ads.zzbdb.zzh     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbbc r0 = com.google.android.gms.internal.ads.zzbbk.zzjC     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbbi r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.zzb(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbzz r0 = r3.zzg     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.zzc     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbbc r1 = com.google.android.gms.internal.ads.zzbbk.zzjI     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbbi r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r2.zzb(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "resume must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L4c
        L3c:
            com.google.android.gms.internal.ads.zzcpd r0 = r3.zzi     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            com.google.android.gms.internal.ads.zzcwh r0 = r0.zzm()     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            r0.zzc(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeil.zzB():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzb.zzo(zzbeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        }
        this.zzd.zze(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
        this.zzf.zzr(zzqVar);
        this.zze = zzqVar;
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar != null) {
            zzcpdVar.zzh(this.zzb.zzd(), zzqVar);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        }
        this.zzd.zzi(zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzavu zzavuVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(com.google.android.gms.ads.internal.client.zzci zzciVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(com.google.android.gms.ads.internal.client.zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzL(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbse zzbseVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzN(boolean z) {
        if (zzh()) {
            Preconditions.checkMainThread("setManualImpressionsEnabled must be called from the main thread.");
        }
        this.zzf.zzy(z);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(zzbci zzbciVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzb.zzq(zzbciVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        }
        try {
            if (!zzdgVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e) {
            zzbzt.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzd.zzg(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbsh zzbshVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbvc zzbvcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzfl zzflVar) {
        if (zzh()) {
            Preconditions.checkMainThread("setVideoOptions must be called on the main UI thread.");
        }
        this.zzf.zzF(zzflVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcxy
    public final synchronized void zza() {
        if (!this.zzb.zzr()) {
            this.zzb.zzn();
            return;
        }
        com.google.android.gms.ads.internal.client.zzq zzg = this.zzf.zzg();
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar != null && zzcpdVar.zzf() != null && this.zzf.zzO()) {
            zzg = zzfae.zza(this.zza, Collections.singletonList(this.zzi.zzf()));
        }
        zze(zzg);
        try {
            zzf(this.zzf.zze());
        } catch (RemoteException unused) {
            zzbzt.zzj("Failed to refresh the banner ad.");
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        zze(this.zze);
        return zzf(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        Preconditions.checkMainThread("setCorrelationIdProvider must be called on the main UI thread");
        this.zzf.zzQ(zzcfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        Preconditions.checkMainThread("getAdSize must be called on the main UI thread.");
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar != null) {
            return zzfae.zza(this.zza, Collections.singletonList(zzcpdVar.zze()));
        }
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzi() {
        return this.zzd.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcb zzj() {
        return this.zzd.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzk() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgy)).booleanValue()) {
            zzcpd zzcpdVar = this.zzi;
            if (zzcpdVar == null) {
                return null;
            }
            return zzcpdVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzl() {
        Preconditions.checkMainThread("getVideoController must be called from the main thread.");
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar != null) {
            return zzcpdVar.zzd();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        if (zzh()) {
            Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        }
        return ObjectWrapper.wrap(this.zzb.zzd());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final synchronized String zzs() {
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar == null || zzcpdVar.zzl() == null) {
            return null;
        }
        return zzcpdVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final synchronized String zzt() {
        zzcpd zzcpdVar = this.zzi;
        if (zzcpdVar == null || zzcpdVar.zzl() == null) {
            return null;
        }
        return zzcpdVar.zzl().zzg();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r3.zzg.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbk.zzjI)).intValue()) goto L18;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzx() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbcp r0 = com.google.android.gms.internal.ads.zzbdb.zze     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbbc r0 = com.google.android.gms.internal.ads.zzbbk.zzjD     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbbi r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r0 = r1.zzb(r0)     // Catch: java.lang.Throwable -> L47
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L47
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbzz r0 = r3.zzg     // Catch: java.lang.Throwable -> L47
            int r0 = r0.zzc     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbbc r1 = com.google.android.gms.internal.ads.zzbbk.zzjI     // Catch: java.lang.Throwable -> L47
            com.google.android.gms.internal.ads.zzbbi r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r2.zzb(r1)     // Catch: java.lang.Throwable -> L47
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L47
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L47
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "destroy must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L47
        L3c:
            com.google.android.gms.internal.ads.zzcpd r0 = r3.zzi     // Catch: java.lang.Throwable -> L47
            if (r0 == 0) goto L45
            r0.zzb()     // Catch: java.lang.Throwable -> L47
            monitor-exit(r3)
            return
        L45:
            monitor-exit(r3)
            return
        L47:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeil.zzx():void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
        if (r3.zzg.zzc < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(com.google.android.gms.internal.ads.zzbbk.zzjI)).intValue()) goto L18;
     */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void zzz() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.google.android.gms.internal.ads.zzbcp r0 = com.google.android.gms.internal.ads.zzbdb.zzg     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbbc r0 = com.google.android.gms.internal.ads.zzbbk.zzjE     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbbi r1 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r0 = r1.zzb(r0)     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L37
            com.google.android.gms.internal.ads.zzbzz r0 = r3.zzg     // Catch: java.lang.Throwable -> L4c
            int r0 = r0.zzc     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbbc r1 = com.google.android.gms.internal.ads.zzbbk.zzjI     // Catch: java.lang.Throwable -> L4c
            com.google.android.gms.internal.ads.zzbbi r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r1 = r2.zzb(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L4c
            if (r0 >= r1) goto L3c
        L37:
            java.lang.String r0 = "pause must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L4c
        L3c:
            com.google.android.gms.internal.ads.zzcpd r0 = r3.zzi     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L4a
            com.google.android.gms.internal.ads.zzcwh r0 = r0.zzm()     // Catch: java.lang.Throwable -> L4c
            r1 = 0
            r0.zzb(r1)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r3)
            return
        L4a:
            monitor-exit(r3)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeil.zzz():void");
    }
}
