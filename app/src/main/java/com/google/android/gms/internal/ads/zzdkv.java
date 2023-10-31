package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdkv {
    private final zzfaa zza;
    private final Executor zzb;
    private final zzdnk zzc;
    private final zzdmf zzd;
    private final Context zze;
    private final zzdqc zzf;
    private final zzfen zzg;
    private final zzfgj zzh;
    private final zzebc zzi;

    public zzdkv(zzfaa zzfaaVar, Executor executor, zzdnk zzdnkVar, Context context, zzdqc zzdqcVar, zzfen zzfenVar, zzfgj zzfgjVar, zzebc zzebcVar, zzdmf zzdmfVar) {
        this.zza = zzfaaVar;
        this.zzb = executor;
        this.zzc = zzdnkVar;
        this.zze = context;
        this.zzf = zzdqcVar;
        this.zzg = zzfenVar;
        this.zzh = zzfgjVar;
        this.zzi = zzebcVar;
        this.zzd = zzdmfVar;
    }

    private final void zzh(zzcfb zzcfbVar) {
        zzi(zzcfbVar);
        zzcfbVar.zzad("/video", zzbih.zzl);
        zzcfbVar.zzad("/videoMeta", zzbih.zzm);
        zzcfbVar.zzad("/precache", new zzcdo());
        zzcfbVar.zzad("/delayPageLoaded", zzbih.zzp);
        zzcfbVar.zzad("/instrument", zzbih.zzn);
        zzcfbVar.zzad("/log", zzbih.zzg);
        zzcfbVar.zzad("/click", new zzbhj(null));
        if (this.zza.zzb != null) {
            zzcfbVar.zzN().zzD(true);
            zzcfbVar.zzad("/open", new zzbis(null, null, null, null, null));
        } else {
            zzcfbVar.zzN().zzD(false);
        }
        if (com.google.android.gms.ads.internal.zzt.zzn().zzu(zzcfbVar.getContext())) {
            zzcfbVar.zzad("/logScionEvent", new zzbin(zzcfbVar.getContext()));
        }
    }

    private static final void zzi(zzcfb zzcfbVar) {
        zzcfbVar.zzad("/videoClicked", zzbih.zzh);
        zzcfbVar.zzN().zzF(true);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdw)).booleanValue()) {
            zzcfbVar.zzad("/getNativeAdViewSignals", zzbih.zzs);
        }
        zzcfbVar.zzad("/getNativeClickMeta", zzbih.zzt);
    }

    public final zzfwb zza(final JSONObject jSONObject) {
        return zzfvr.zzm(zzfvr.zzm(zzfvr.zzh(null), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdkl
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzdkv.this.zze(obj);
            }
        }, this.zzb), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdkm
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzdkv.this.zzc(jSONObject, (zzcfb) obj);
            }
        }, this.zzb);
    }

    public final zzfwb zzb(final String str, final String str2, final zzezf zzezfVar, final zzezi zzeziVar, final com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzfvr.zzm(zzfvr.zzh(null), new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdko
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzdkv.this.zzd(zzqVar, zzezfVar, zzeziVar, str, str2, obj);
            }
        }, this.zzb);
    }

    public final /* synthetic */ zzfwb zzc(JSONObject jSONObject, final zzcfb zzcfbVar) throws Exception {
        final zzcak zza = zzcak.zza(zzcfbVar);
        zzcfbVar.zzag(this.zza.zzb != null ? zzcgq.zzd() : zzcgq.zze());
        zzcfbVar.zzN().zzA(new zzcgm() { // from class: com.google.android.gms.internal.ads.zzdkk
            @Override // com.google.android.gms.internal.ads.zzcgm
            public final void zza(boolean z) {
                zzdkv.this.zzf(zzcfbVar, zza, z);
            }
        });
        zzcfbVar.zzl("google.afma.nativeAds.renderVideo", jSONObject);
        return zza;
    }

    public final /* synthetic */ zzfwb zzd(com.google.android.gms.ads.internal.client.zzq zzqVar, zzezf zzezfVar, zzezi zzeziVar, String str, String str2, Object obj) throws Exception {
        final zzcfb zza = this.zzc.zza(zzqVar, zzezfVar, zzeziVar);
        final zzcak zza2 = zzcak.zza(zza);
        if (this.zza.zzb != null) {
            zzh(zza);
            zza.zzag(zzcgq.zzd());
        } else {
            zzdmc zzb = this.zzd.zzb();
            zza.zzN().zzM(zzb, zzb, zzb, zzb, zzb, false, null, new com.google.android.gms.ads.internal.zzb(this.zze, null, null), null, null, this.zzi, this.zzh, this.zzf, this.zzg, null, zzb, null, null);
            zzi(zza);
        }
        zza.zzN().zzA(new zzcgm() { // from class: com.google.android.gms.internal.ads.zzdkp
            @Override // com.google.android.gms.internal.ads.zzcgm
            public final void zza(boolean z) {
                zzdkv.this.zzg(zza, zza2, z);
            }
        });
        zza.zzab(str, str2, null);
        return zza2;
    }

    public final /* synthetic */ zzfwb zze(Object obj) throws Exception {
        zzcfb zza = this.zzc.zza(com.google.android.gms.ads.internal.client.zzq.zzc(), null, null);
        final zzcak zza2 = zzcak.zza(zza);
        zzh(zza);
        zza.zzN().zzG(new zzcgn() { // from class: com.google.android.gms.internal.ads.zzdkn
            @Override // com.google.android.gms.internal.ads.zzcgn
            public final void zza() {
                zzcak.this.zzb();
            }
        });
        zza.loadUrl((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdv));
        return zza2;
    }

    public final /* synthetic */ void zzf(zzcfb zzcfbVar, zzcak zzcakVar, boolean z) {
        if (this.zza.zza != null && zzcfbVar.zzq() != null) {
            zzcfbVar.zzq().zzs(this.zza.zza);
        }
        zzcakVar.zzb();
    }

    public final /* synthetic */ void zzg(zzcfb zzcfbVar, zzcak zzcakVar, boolean z) {
        if (!z) {
            zzcakVar.zze(new zzefn(1, "Html video Web View failed to load."));
            return;
        }
        if (this.zza.zza != null && zzcfbVar.zzq() != null) {
            zzcfbVar.zzq().zzs(this.zza.zza);
        }
        zzcakVar.zzb();
    }
}
