package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzcsm {
    private final zzdvi zza;
    private final zzfaa zzb;
    private final zzfed zzc;
    private final zzcmj zzd;
    private final zzefp zze;
    private final zzdan zzf;
    @Nullable
    private zzezr zzg;
    private final zzdwn zzh;
    private final zzcum zzi;
    private final Executor zzj;
    private final zzdvz zzk;
    private final zzeca zzl;
    private final zzdxd zzm;
    private final zzdxk zzn;

    public zzcsm(zzdvi zzdviVar, zzfaa zzfaaVar, zzfed zzfedVar, zzcmj zzcmjVar, zzefp zzefpVar, zzdan zzdanVar, @Nullable zzezr zzezrVar, zzdwn zzdwnVar, zzcum zzcumVar, Executor executor, zzdvz zzdvzVar, zzeca zzecaVar, zzdxd zzdxdVar, zzdxk zzdxkVar) {
        this.zza = zzdviVar;
        this.zzb = zzfaaVar;
        this.zzc = zzfedVar;
        this.zzd = zzcmjVar;
        this.zze = zzefpVar;
        this.zzf = zzdanVar;
        this.zzg = zzezrVar;
        this.zzh = zzdwnVar;
        this.zzi = zzcumVar;
        this.zzj = executor;
        this.zzk = zzdvzVar;
        this.zzl = zzecaVar;
        this.zzm = zzdxdVar;
        this.zzn = zzdxkVar;
    }

    public final com.google.android.gms.ads.internal.client.zze zza(Throwable th) {
        return zzfba.zzb(th, this.zzl);
    }

    public final zzdan zzc() {
        return this.zzf;
    }

    public final /* synthetic */ zzezr zzd(zzezr zzezrVar) throws Exception {
        this.zzd.zza(zzezrVar);
        return zzezrVar;
    }

    public final zzfwb zze(final zzfbt zzfbtVar) {
        zzfdi zza = this.zzc.zzb(zzfdx.GET_CACHE_KEY, this.zzi.zzc()).zzf(new zzfuy() { // from class: com.google.android.gms.internal.ads.zzcsj
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzcsm.this.zzf(zzfbtVar, (zzbug) obj);
            }
        }).zza();
        zzfvr.zzq(zza, new zzcsk(this), this.zzj);
        return zza;
    }

    public final /* synthetic */ zzfwb zzf(zzfbt zzfbtVar, zzbug zzbugVar) throws Exception {
        zzbugVar.zzi = zzfbtVar;
        return this.zzh.zza(zzbugVar);
    }

    public final /* synthetic */ zzfwb zzg(zzfwb zzfwbVar, zzfwb zzfwbVar2, zzfwb zzfwbVar3) throws Exception {
        return this.zzn.zzc((zzbug) zzfwbVar.get(), (JSONObject) zzfwbVar2.get(), (zzbuj) zzfwbVar3.get());
    }

    public final zzfwb zzh(zzbug zzbugVar) {
        zzfdi zza = this.zzc.zzb(zzfdx.NOTIFY_CACHE_HIT, this.zzh.zzg(zzbugVar)).zza();
        zzfvr.zzq(zza, new zzcsl(this), this.zzj);
        return zza;
    }

    public final zzfwb zzi(zzfwb zzfwbVar) {
        zzfdu zzf = this.zzc.zzb(zzfdx.RENDERER, zzfwbVar).zze(new zzfdg() { // from class: com.google.android.gms.internal.ads.zzcsi
            @Override // com.google.android.gms.internal.ads.zzfdg
            public final Object zza(Object obj) {
                zzezr zzezrVar = (zzezr) obj;
                zzcsm.this.zzd(zzezrVar);
                return zzezrVar;
            }
        }).zzf(this.zze);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfj)).booleanValue()) {
            zzf = zzf.zzi(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfk)).intValue(), TimeUnit.SECONDS);
        }
        return zzf.zza();
    }

    public final zzfwb zzj() {
        com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzb.zzd;
        if (zzlVar.zzx == null && zzlVar.zzs == null) {
            return zzk(this.zzi.zzc());
        }
        zzfed zzfedVar = this.zzc;
        return zzfdn.zzc(this.zza.zza(), zzfdx.PRELOADED_LOADER, zzfedVar).zza();
    }

    public final zzfwb zzk(final zzfwb zzfwbVar) {
        zzfdu zzf;
        zzezr zzezrVar = this.zzg;
        if (zzezrVar != null) {
            zzf = zzfdn.zzc(zzfvr.zzh(zzezrVar), zzfdx.SERVER_TRANSACTION, this.zzc);
        } else {
            com.google.android.gms.ads.internal.zzt.zzc().zzj();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzjQ)).booleanValue() || ((Boolean) zzbdj.zzb.zze()).booleanValue()) {
                zzfdu zzb = this.zzc.zzb(zzfdx.SERVER_TRANSACTION, zzfwbVar);
                final zzdvz zzdvzVar = this.zzk;
                zzf = zzb.zzf(new zzfuy() { // from class: com.google.android.gms.internal.ads.zzcsh
                    @Override // com.google.android.gms.internal.ads.zzfuy
                    public final zzfwb zza(Object obj) {
                        return zzdvz.this.zzb((zzbug) obj);
                    }
                });
            } else {
                final zzdxd zzdxdVar = this.zzm;
                final zzfwb zzm = zzfvr.zzm(zzfwbVar, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzcsd
                    @Override // com.google.android.gms.internal.ads.zzfuy
                    public final zzfwb zza(Object obj) {
                        return zzdxd.this.zza((zzbug) obj);
                    }
                }, this.zzj);
                zzfdu zzb2 = this.zzc.zzb(zzfdx.BUILD_URL, zzm);
                final zzdwn zzdwnVar = this.zzh;
                final zzfdi zza = zzb2.zzf(new zzfuy() { // from class: com.google.android.gms.internal.ads.zzcse
                    @Override // com.google.android.gms.internal.ads.zzfuy
                    public final zzfwb zza(Object obj) {
                        return zzdwn.this.zzb((JSONObject) obj);
                    }
                }).zza();
                zzf = this.zzc.zza(zzfdx.SERVER_TRANSACTION, zzfwbVar, zzm, zza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcsf
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzcsm.this.zzg(zzfwbVar, zzm, zza);
                    }
                }).zzf(new zzfuy() { // from class: com.google.android.gms.internal.ads.zzcsg
                    @Override // com.google.android.gms.internal.ads.zzfuy
                    public final zzfwb zza(Object obj) {
                        return (zzfwb) obj;
                    }
                });
            }
        }
        return zzf.zza();
    }

    public final void zzl(zzezr zzezrVar) {
        this.zzg = zzezrVar;
    }
}
