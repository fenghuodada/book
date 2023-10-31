package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzejn extends com.google.android.gms.ads.internal.client.zzbt {
    private final com.google.android.gms.ads.internal.client.zzq zza;
    private final Context zzb;
    private final zzexi zzc;
    private final String zzd;
    private final zzbzz zze;
    private final zzejf zzf;
    private final zzeyi zzg;
    private final zzaqq zzh;
    private final zzdqc zzi;
    @Nullable
    private zzddp zzj;
    private boolean zzk = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaD)).booleanValue();

    public zzejn(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzexi zzexiVar, zzejf zzejfVar, zzeyi zzeyiVar, zzbzz zzbzzVar, zzaqq zzaqqVar, zzdqc zzdqcVar) {
        this.zza = zzqVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzexiVar;
        this.zzf = zzejfVar;
        this.zzg = zzeyiVar;
        this.zze = zzbzzVar;
        this.zzh = zzaqqVar;
        this.zzi = zzdqcVar;
    }

    private final synchronized boolean zze() {
        zzddp zzddpVar = this.zzj;
        if (zzddpVar != null) {
            if (!zzddpVar.zza()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzddp zzddpVar = this.zzj;
        if (zzddpVar != null) {
            zzddpVar.zzm().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.ads.internal.client.zzbe zzbeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(com.google.android.gms.ads.internal.client.zzbh zzbhVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zze(zzbhVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzcb zzcbVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzi(zzcbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(zzavu zzavuVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(com.google.android.gms.ads.internal.client.zzci zzciVar) {
        this.zzf.zzt(zzciVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(com.google.android.gms.ads.internal.client.zzdu zzduVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzL(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzk = z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzM(zzbse zzbseVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzO(zzbci zzbciVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbciVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdg zzdgVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdgVar.zzf()) {
                this.zzi.zze();
            }
        } catch (RemoteException e) {
            zzbzt.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzf.zzg(zzdgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(zzbsh zzbshVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(zzbvc zzbvcVar) {
        this.zzg.zzf(zzbvcVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzU(com.google.android.gms.ads.internal.client.zzfl zzflVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzW(IObjectWrapper iObjectWrapper) {
        if (this.zzj == null) {
            zzbzt.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzk(zzfba.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcr)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzX() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        if (this.zzj == null) {
            zzbzt.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzk(zzfba.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcr)).booleanValue()) {
            this.zzh.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzj.zzc(this.zzk, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzY() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized boolean zzZ() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[Catch: all -> 0x008c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:9:0x0025, B:13:0x0042, B:15:0x004e, B:17:0x0052, B:19:0x005b, B:22:0x0065, B:26:0x006d, B:12:0x003d), top: B:32:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.gms.internal.ads.zzbcp r0 = com.google.android.gms.internal.ads.zzbdb.zzi     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r0.zze()     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8c
            r1 = 0
            if (r0 == 0) goto L24
            com.google.android.gms.internal.ads.zzbbc r0 = com.google.android.gms.internal.ads.zzbbk.zzjG     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzbbi r2 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r0 = r2.zzb(r0)     // Catch: java.lang.Throwable -> L8c
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L8c
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = r1
        L25:
            com.google.android.gms.internal.ads.zzbzz r2 = r5.zze     // Catch: java.lang.Throwable -> L8c
            int r2 = r2.zzc     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzbbc r3 = com.google.android.gms.internal.ads.zzbbk.zzjH     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzbbi r4 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Throwable -> L8c
            java.lang.Object r3 = r4.zzb(r3)     // Catch: java.lang.Throwable -> L8c
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L8c
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L8c
            if (r2 < r3) goto L3d
            if (r0 != 0) goto L42
        L3d:
            java.lang.String r0 = "loadAd must be called on the main UI thread."
            com.google.android.gms.common.internal.Preconditions.checkMainThread(r0)     // Catch: java.lang.Throwable -> L8c
        L42:
            com.google.android.gms.ads.internal.zzt.zzp()     // Catch: java.lang.Throwable -> L8c
            android.content.Context r0 = r5.zzb     // Catch: java.lang.Throwable -> L8c
            boolean r0 = com.google.android.gms.ads.internal.util.zzs.zzD(r0)     // Catch: java.lang.Throwable -> L8c
            r2 = 0
            if (r0 == 0) goto L65
            com.google.android.gms.ads.internal.client.zzc r0 = r6.zzs     // Catch: java.lang.Throwable -> L8c
            if (r0 != 0) goto L65
            java.lang.String r6 = "Failed to load the ad because app ID is missing."
            com.google.android.gms.internal.ads.zzbzt.zzg(r6)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzejf r6 = r5.zzf     // Catch: java.lang.Throwable -> L8c
            if (r6 == 0) goto L63
            r0 = 4
            com.google.android.gms.ads.internal.client.zze r0 = com.google.android.gms.internal.ads.zzfba.zzd(r0, r2, r2)     // Catch: java.lang.Throwable -> L8c
            r6.zza(r0)     // Catch: java.lang.Throwable -> L8c
        L63:
            monitor-exit(r5)
            return r1
        L65:
            boolean r0 = r5.zze()     // Catch: java.lang.Throwable -> L8c
            if (r0 == 0) goto L6d
            monitor-exit(r5)
            return r1
        L6d:
            android.content.Context r0 = r5.zzb     // Catch: java.lang.Throwable -> L8c
            boolean r1 = r6.zzf     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzfau.zza(r0, r1)     // Catch: java.lang.Throwable -> L8c
            r5.zzj = r2     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzexi r0 = r5.zzc     // Catch: java.lang.Throwable -> L8c
            java.lang.String r1 = r5.zzd     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzexb r2 = new com.google.android.gms.internal.ads.zzexb     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.ads.internal.client.zzq r3 = r5.zza     // Catch: java.lang.Throwable -> L8c
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L8c
            com.google.android.gms.internal.ads.zzejm r3 = new com.google.android.gms.internal.ads.zzejm     // Catch: java.lang.Throwable -> L8c
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L8c
            boolean r6 = r0.zzb(r6, r1, r2, r3)     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r5)
            return r6
        L8c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzejn.zzaa(com.google.android.gms.ads.internal.client.zzl):boolean");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzab(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzi() {
        return this.zzf.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcb zzj() {
        return this.zzf.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzdn zzk() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgy)).booleanValue()) {
            zzddp zzddpVar = this.zzj;
            if (zzddpVar == null) {
                return null;
            }
            return zzddpVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzdq zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final IObjectWrapper zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized String zzr() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final synchronized String zzs() {
        zzddp zzddpVar = this.zzj;
        if (zzddpVar == null || zzddpVar.zzl() == null) {
            return null;
        }
        return zzddpVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    @Nullable
    public final synchronized String zzt() {
        zzddp zzddpVar = this.zzj;
        if (zzddpVar == null || zzddpVar.zzl() == null) {
            return null;
        }
        return zzddpVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzddp zzddpVar = this.zzj;
        if (zzddpVar != null) {
            zzddpVar.zzm().zza(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
        this.zzf.zzf(zzbkVar);
        zzaa(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzddp zzddpVar = this.zzj;
        if (zzddpVar != null) {
            zzddpVar.zzm().zzb(null);
        }
    }
}
