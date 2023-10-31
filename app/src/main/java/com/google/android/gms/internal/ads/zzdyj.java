package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdyj extends zzbtr {
    private final Context zza;
    private final zzfwc zzb;
    private final zzdzb zzc;
    private final zzcmi zzd;
    private final ArrayDeque zze;
    private final zzfft zzf;
    private final zzbus zzg;
    private final zzdyy zzh;

    public zzdyj(Context context, zzfwc zzfwcVar, zzbus zzbusVar, zzcmi zzcmiVar, zzdzb zzdzbVar, ArrayDeque arrayDeque, zzdyy zzdyyVar, zzfft zzfftVar) {
        zzbbk.zza(context);
        this.zza = context;
        this.zzb = zzfwcVar;
        this.zzg = zzbusVar;
        this.zzc = zzdzbVar;
        this.zzd = zzcmiVar;
        this.zze = arrayDeque;
        this.zzh = zzdyyVar;
        this.zzf = zzfftVar;
    }

    @Nullable
    private final synchronized zzdyg zzk(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzdyg zzdygVar = (zzdyg) it.next();
            if (zzdygVar.zzc.equals(str)) {
                it.remove();
                return zzdygVar;
            }
        }
        return null;
    }

    private static zzfwb zzl(zzfwb zzfwbVar, zzfed zzfedVar, zzbmy zzbmyVar, zzffq zzffqVar, zzfff zzfffVar) {
        zzbmo zza = zzbmyVar.zza("AFMA_getAdDictionary", zzbmv.zza, new zzbmq() { // from class: com.google.android.gms.internal.ads.zzdya
            @Override // com.google.android.gms.internal.ads.zzbmq
            public final Object zza(JSONObject jSONObject) {
                return new zzbuj(jSONObject);
            }
        });
        zzffp.zzd(zzfwbVar, zzfffVar);
        zzfdi zza2 = zzfedVar.zzb(zzfdx.BUILD_URL, zzfwbVar).zzf(zza).zza();
        zzffp.zzc(zza2, zzffqVar, zzfffVar);
        return zza2;
    }

    private static zzfwb zzm(zzbug zzbugVar, zzfed zzfedVar, final zzeri zzeriVar) {
        zzfuy zzfuyVar = new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdxu
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzeri.this.zzb().zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzh((Bundle) obj));
            }
        };
        return zzfedVar.zzb(zzfdx.GMS_SIGNALS, zzfvr.zzh(zzbugVar.zza)).zzf(zzfuyVar).zze(new zzfdg() { // from class: com.google.android.gms.internal.ads.zzdxv
            @Override // com.google.android.gms.internal.ads.zzfdg
            public final Object zza(Object obj) {
                JSONObject jSONObject = (JSONObject) obj;
                com.google.android.gms.ads.internal.util.zze.zza("Ad request signals:");
                com.google.android.gms.ads.internal.util.zze.zza(jSONObject.toString(2));
                return jSONObject;
            }
        }).zza();
    }

    private final synchronized void zzn(zzdyg zzdygVar) {
        zzo();
        this.zze.addLast(zzdygVar);
    }

    private final synchronized void zzo() {
        int intValue = ((Long) zzbdk.zzd.zze()).intValue();
        while (this.zze.size() >= intValue) {
            this.zze.removeFirst();
        }
    }

    private final void zzp(zzfwb zzfwbVar, zzbuc zzbucVar) {
        zzfvr.zzq(zzfvr.zzm(zzfwbVar, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdyd
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzfvr.zzh(zzfaz.zza((InputStream) obj));
            }
        }, zzcag.zza), new zzdyf(this, zzbucVar), zzcag.zzf);
    }

    public final zzfwb zzb(final zzbug zzbugVar, int i) {
        if (((Boolean) zzbdk.zza.zze()).booleanValue()) {
            zzfbt zzfbtVar = zzbugVar.zzi;
            if (zzfbtVar == null) {
                return zzfvr.zzg(new Exception("Pool configuration missing from request."));
            }
            if (zzfbtVar.zzc == 0 || zzfbtVar.zzd == 0) {
                return zzfvr.zzg(new Exception("Caching is disabled."));
            }
            zzbmy zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzbzz.zza(), this.zzf);
            zzeri zzp = this.zzd.zzp(zzbugVar, i);
            zzfed zzc = zzp.zzc();
            final zzfwb zzm = zzm(zzbugVar, zzc, zzp);
            zzffq zzd = zzp.zzd();
            final zzfff zza = zzffe.zza(this.zza, 9);
            final zzfwb zzl = zzl(zzm, zzc, zzb, zzd, zza);
            return zzc.zza(zzfdx.GET_URL_AND_CACHE_KEY, zzm, zzl).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzdyj.this.zzj(zzl, zzm, zzbugVar, zza);
                }
            }).zza();
        }
        return zzfvr.zzg(new Exception("Split request is disabled."));
    }

    public final zzfwb zzc(zzbug zzbugVar, int i) {
        zzdyg zzk;
        String str;
        zzfdl zza;
        Callable callable;
        zzbmy zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzbzz.zza(), this.zzf);
        zzeri zzp = this.zzd.zzp(zzbugVar, i);
        zzbmo zza2 = zzb.zza("google.afma.response.normalize", zzdyi.zza, zzbmv.zzb);
        if (((Boolean) zzbdk.zza.zze()).booleanValue()) {
            zzk = zzk(zzbugVar.zzh);
            if (zzk == null) {
                str = "Request contained a PoolKey but no matching parameters were found.";
                com.google.android.gms.ads.internal.util.zze.zza(str);
            }
        } else {
            String str2 = zzbugVar.zzj;
            zzk = null;
            if (str2 != null && !str2.isEmpty()) {
                str = "Request contained a PoolKey but split request is disabled.";
                com.google.android.gms.ads.internal.util.zze.zza(str);
            }
        }
        zzfff zza3 = zzk == null ? zzffe.zza(this.zza, 9) : zzk.zze;
        zzffq zzd = zzp.zzd();
        zzd.zzd(zzbugVar.zza.getStringArrayList("ad_types"));
        zzdza zzdzaVar = new zzdza(zzbugVar.zzg, zzd, zza3);
        zzdyx zzdyxVar = new zzdyx(this.zza, zzbugVar.zzb.zza, this.zzg, i);
        zzfed zzc = zzp.zzc();
        zzfff zza4 = zzffe.zza(this.zza, 11);
        if (zzk == null) {
            final zzfwb zzm = zzm(zzbugVar, zzc, zzp);
            final zzfwb zzl = zzl(zzm, zzc, zzb, zzd, zza3);
            zzfff zza5 = zzffe.zza(this.zza, 10);
            final zzfdi zza6 = zzc.zza(zzfdx.HTTP, zzl, zzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzdxx
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzdyz((JSONObject) zzfwb.this.get(), (zzbuj) zzl.get());
                }
            }).zze(zzdzaVar).zze(new zzffl(zza5)).zze(zzdyxVar).zza();
            zzffp.zza(zza6, zzd, zza5);
            zzffp.zzd(zza6, zza4);
            zza = zzc.zza(zzfdx.PRE_PROCESS, zzm, zzl, zza6);
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzdxy
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new zzdyi((zzdyw) zzfwb.this.get(), (JSONObject) zzm.get(), (zzbuj) zzl.get());
                }
            };
        } else {
            zzdyz zzdyzVar = new zzdyz(zzk.zzb, zzk.zza);
            zzfff zza7 = zzffe.zza(this.zza, 10);
            final zzfdi zza8 = zzc.zzb(zzfdx.HTTP, zzfvr.zzh(zzdyzVar)).zze(zzdzaVar).zze(new zzffl(zza7)).zze(zzdyxVar).zza();
            zzffp.zza(zza8, zzd, zza7);
            final zzfwb zzh = zzfvr.zzh(zzk);
            zzffp.zzd(zza8, zza4);
            zza = zzc.zza(zzfdx.PRE_PROCESS, zza8, zzh);
            callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzdyc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    zzfwb zzfwbVar = zzfwb.this;
                    zzfwb zzfwbVar2 = zzh;
                    return new zzdyi((zzdyw) zzfwbVar.get(), ((zzdyg) zzfwbVar2.get()).zzb, ((zzdyg) zzfwbVar2.get()).zza);
                }
            };
        }
        zzfdi zza9 = zza.zza(callable).zzf(zza2).zza();
        zzffp.zza(zza9, zzd, zza4);
        return zza9;
    }

    public final zzfwb zzd(zzbug zzbugVar, int i) {
        zzbmy zzb = com.google.android.gms.ads.internal.zzt.zzf().zzb(this.zza, zzbzz.zza(), this.zzf);
        if (((Boolean) zzbdp.zza.zze()).booleanValue()) {
            zzeri zzp = this.zzd.zzp(zzbugVar, i);
            final zzeqt zza = zzp.zza();
            zzbmo zza2 = zzb.zza("google.afma.request.getSignals", zzbmv.zza, zzbmv.zzb);
            zzfff zza3 = zzffe.zza(this.zza, 22);
            zzfdi zza4 = zzp.zzc().zzb(zzfdx.GET_SIGNALS, zzfvr.zzh(zzbugVar.zza)).zze(new zzffl(zza3)).zzf(new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdyb
                @Override // com.google.android.gms.internal.ads.zzfuy
                public final zzfwb zza(Object obj) {
                    return zzeqt.this.zza(com.google.android.gms.ads.internal.client.zzay.zzb().zzh((Bundle) obj));
                }
            }).zzb(zzfdx.JS_SIGNALS).zzf(zza2).zza();
            zzffq zzd = zzp.zzd();
            zzd.zzd(zzbugVar.zza.getStringArrayList("ad_types"));
            zzffp.zzb(zza4, zzd, zza3);
            if (((Boolean) zzbdd.zze.zze()).booleanValue()) {
                zzdzb zzdzbVar = this.zzc;
                zzdzbVar.getClass();
                zza4.zzc(new zzdxw(zzdzbVar), this.zzb);
            }
            return zza4;
        }
        return zzfvr.zzg(new Exception("Signal collection disabled."));
    }

    @Override // com.google.android.gms.internal.ads.zzbts
    public final void zze(zzbug zzbugVar, zzbuc zzbucVar) {
        zzp(zzb(zzbugVar, Binder.getCallingUid()), zzbucVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbts
    public final void zzf(zzbug zzbugVar, zzbuc zzbucVar) {
        zzp(zzd(zzbugVar, Binder.getCallingUid()), zzbucVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbts
    public final void zzg(zzbug zzbugVar, zzbuc zzbucVar) {
        zzfwb zzc = zzc(zzbugVar, Binder.getCallingUid());
        zzp(zzc, zzbucVar);
        if (((Boolean) zzbdd.zzc.zze()).booleanValue()) {
            zzdzb zzdzbVar = this.zzc;
            zzdzbVar.getClass();
            zzc.zzc(new zzdxw(zzdzbVar), this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbts
    public final void zzh(String str, zzbuc zzbucVar) {
        zzp(zzi(str), zzbucVar);
    }

    public final zzfwb zzi(String str) {
        if (((Boolean) zzbdk.zza.zze()).booleanValue()) {
            return zzk(str) == null ? zzfvr.zzg(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzfvr.zzh(new zzdye(this));
        }
        return zzfvr.zzg(new Exception("Split request is disabled."));
    }

    public final /* synthetic */ InputStream zzj(zzfwb zzfwbVar, zzfwb zzfwbVar2, zzbug zzbugVar, zzfff zzfffVar) throws Exception {
        String zzc = ((zzbuj) zzfwbVar.get()).zzc();
        String str = zzbugVar.zzh;
        zzn(new zzdyg((zzbuj) zzfwbVar.get(), (JSONObject) zzfwbVar2.get(), str, zzc, zzfffVar));
        return new ByteArrayInputStream(zzc.getBytes(zzfol.zzc));
    }
}
