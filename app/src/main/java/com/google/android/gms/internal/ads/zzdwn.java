package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdwn {
    private final zzfwc zza;
    private final zzdvt zzb;
    private final zzgvi zzc;
    private final zzfft zzd;
    private final Context zze;
    private final zzbzz zzf;

    public zzdwn(zzfwc zzfwcVar, zzdvt zzdvtVar, zzgvi zzgviVar, zzfft zzfftVar, Context context, zzbzz zzbzzVar) {
        this.zza = zzfwcVar;
        this.zzb = zzdvtVar;
        this.zzc = zzgviVar;
        this.zzd = zzfftVar;
        this.zze = context;
        this.zzf = zzbzzVar;
    }

    private final zzfwb zzh(final zzbug zzbugVar, zzdwm zzdwmVar, final zzdwm zzdwmVar2, final zzfuy zzfuyVar) {
        String str = zzbugVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzp();
        return zzfvr.zzf(zzfvr.zzm(zzfvi.zzv(com.google.android.gms.ads.internal.util.zzs.zzy(str) ? zzfvr.zzg(new zzdwc(1)) : zzfvr.zzf(zzdwmVar.zza(zzbugVar), ExecutionException.class, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdwd
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                Throwable th = (ExecutionException) obj;
                if (th.getCause() != null) {
                    th = th.getCause();
                }
                return zzfvr.zzg(th);
            }
        }, this.zza)), zzfuyVar, this.zza), zzdwc.class, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdwl
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzdwn.this.zzc(zzdwmVar2, zzbugVar, zzfuyVar, (zzdwc) obj);
            }
        }, this.zza);
    }

    public final zzfwb zza(final zzbug zzbugVar) {
        zzfuy zzfuyVar = new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdwi
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                zzbug zzbugVar2 = zzbug.this;
                zzbugVar2.zzj = new String(zzftu.zza((InputStream) obj), zzfol.zzc);
                return zzfvr.zzh(zzbugVar2);
            }
        };
        final zzdvt zzdvtVar = this.zzb;
        return zzh(zzbugVar, new zzdwm() { // from class: com.google.android.gms.internal.ads.zzdwj
            @Override // com.google.android.gms.internal.ads.zzdwm
            public final zzfwb zza(zzbug zzbugVar2) {
                return zzdvt.this.zzb(zzbugVar2);
            }
        }, new zzdwm() { // from class: com.google.android.gms.internal.ads.zzdwk
            @Override // com.google.android.gms.internal.ads.zzdwm
            public final zzfwb zza(zzbug zzbugVar2) {
                return zzdwn.this.zzd(zzbugVar2);
            }
        }, zzfuyVar);
    }

    public final zzfwb zzb(JSONObject jSONObject) {
        return zzfvr.zzm(zzfvi.zzv(zzfvr.zzh(jSONObject)), com.google.android.gms.ads.internal.zzt.zzf().zza(this.zze, this.zzf, this.zzd).zza("AFMA_getAdDictionary", zzbmv.zza, new zzbmq() { // from class: com.google.android.gms.internal.ads.zzdwh
            @Override // com.google.android.gms.internal.ads.zzbmq
            public final Object zza(JSONObject jSONObject2) {
                return new zzbuj(jSONObject2);
            }
        }), this.zza);
    }

    public final /* synthetic */ zzfwb zzc(zzdwm zzdwmVar, zzbug zzbugVar, zzfuy zzfuyVar, zzdwc zzdwcVar) throws Exception {
        return zzfvr.zzm(zzdwmVar.zza(zzbugVar), zzfuyVar, this.zza);
    }

    public final /* synthetic */ zzfwb zzd(zzbug zzbugVar) {
        return ((zzdyj) this.zzc.zzb()).zzb(zzbugVar, Binder.getCallingUid());
    }

    public final /* synthetic */ zzfwb zze(zzbug zzbugVar) {
        return this.zzb.zzc(zzbugVar.zzh);
    }

    public final /* synthetic */ zzfwb zzf(zzbug zzbugVar) {
        return ((zzdyj) this.zzc.zzb()).zzi(zzbugVar.zzh);
    }

    public final zzfwb zzg(zzbug zzbugVar) {
        return zzh(zzbugVar, new zzdwm() { // from class: com.google.android.gms.internal.ads.zzdwf
            @Override // com.google.android.gms.internal.ads.zzdwm
            public final zzfwb zza(zzbug zzbugVar2) {
                return zzdwn.this.zze(zzbugVar2);
            }
        }, new zzdwm() { // from class: com.google.android.gms.internal.ads.zzdwg
            @Override // com.google.android.gms.internal.ads.zzdwm
            public final zzfwb zza(zzbug zzbugVar2) {
                return zzdwn.this.zzf(zzbugVar2);
            }
        }, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdwe
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                InputStream inputStream = (InputStream) obj;
                return zzfvr.zzh(null);
            }
        });
    }
}
