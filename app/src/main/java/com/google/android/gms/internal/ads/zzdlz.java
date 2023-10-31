package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdlz {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final zzcfn zzc;
    private final Context zzd;
    private final zzdqc zze;
    private final zzfen zzf;
    private final Executor zzg;
    private final zzaqq zzh;
    private final zzbzz zzi;
    private final zzebc zzk;
    private final zzfgj zzl;
    private zzfwb zzm;
    private final zzdlm zza = new zzdlm();
    private final zzbiw zzj = new zzbiw();

    public zzdlz(zzdlw zzdlwVar) {
        this.zzd = zzdlw.zza(zzdlwVar);
        this.zzg = zzdlw.zzj(zzdlwVar);
        this.zzh = zzdlw.zzb(zzdlwVar);
        this.zzi = zzdlw.zzd(zzdlwVar);
        this.zzb = zzdlw.zzc(zzdlwVar);
        this.zzc = zzdlw.zze(zzdlwVar);
        this.zzk = zzdlw.zzg(zzdlwVar);
        this.zzl = zzdlw.zzi(zzdlwVar);
        this.zze = zzdlw.zzf(zzdlwVar);
        this.zzf = zzdlw.zzh(zzdlwVar);
    }

    public final /* synthetic */ zzcfb zza(zzcfb zzcfbVar) {
        zzcfbVar.zzad("/result", this.zzj);
        zzcgo zzN = zzcfbVar.zzN();
        zzdlm zzdlmVar = this.zza;
        zzN.zzM(null, zzdlmVar, zzdlmVar, zzdlmVar, zzdlmVar, false, null, new com.google.android.gms.ads.internal.zzb(this.zzd, null, null), null, null, this.zzk, this.zzl, this.zze, this.zzf, null, null, null, null);
        return zzcfbVar;
    }

    public final /* synthetic */ zzfwb zzc(String str, JSONObject jSONObject, zzcfb zzcfbVar) throws Exception {
        return this.zzj.zzb(zzcfbVar, str, jSONObject);
    }

    public final synchronized zzfwb zzd(final String str, final JSONObject jSONObject) {
        zzfwb zzfwbVar = this.zzm;
        if (zzfwbVar == null) {
            return zzfvr.zzh(null);
        }
        return zzfvr.zzm(zzfwbVar, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzdln
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzdlz.this.zzc(str, jSONObject, (zzcfb) obj);
            }
        }, this.zzg);
    }

    public final synchronized void zze(zzezf zzezfVar, zzezi zzeziVar) {
        zzfwb zzfwbVar = this.zzm;
        if (zzfwbVar == null) {
            return;
        }
        zzfvr.zzq(zzfwbVar, new zzdlt(this, zzezfVar, zzeziVar), this.zzg);
    }

    public final synchronized void zzf() {
        zzfwb zzfwbVar = this.zzm;
        if (zzfwbVar == null) {
            return;
        }
        zzfvr.zzq(zzfwbVar, new zzdlp(this), this.zzg);
        this.zzm = null;
    }

    public final synchronized void zzg(String str, Map map) {
        zzfwb zzfwbVar = this.zzm;
        if (zzfwbVar == null) {
            return;
        }
        zzfvr.zzq(zzfwbVar, new zzdls(this, "sendMessageToNativeJs", map), this.zzg);
    }

    public final synchronized void zzh() {
        final Context context = this.zzd;
        final zzbzz zzbzzVar = this.zzi;
        final String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzdu);
        final zzaqq zzaqqVar = this.zzh;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        zzfwb zzl = zzfvr.zzl(zzfvr.zzk(new zzfux() { // from class: com.google.android.gms.internal.ads.zzcfk
            @Override // com.google.android.gms.internal.ads.zzfux
            public final zzfwb zza() {
                Context context2 = context;
                zzaqq zzaqqVar2 = zzaqqVar;
                zzbzz zzbzzVar2 = zzbzzVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                String str2 = str;
                com.google.android.gms.ads.internal.zzt.zzz();
                zzcfb zza = zzcfn.zza(context2, zzcgq.zza(), "", false, false, zzaqqVar2, null, zzbzzVar2, null, null, zzaVar2, zzawx.zza(), null, null);
                final zzcak zza2 = zzcak.zza(zza);
                zza.zzN().zzA(new zzcgm() { // from class: com.google.android.gms.internal.ads.zzcfl
                    @Override // com.google.android.gms.internal.ads.zzcgm
                    public final void zza(boolean z) {
                        zzcak.this.zzb();
                    }
                });
                zza.loadUrl(str2);
                return zza2;
            }
        }, zzcag.zze), new zzfon() { // from class: com.google.android.gms.internal.ads.zzdlo
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                zzcfb zzcfbVar = (zzcfb) obj;
                zzdlz.this.zza(zzcfbVar);
                return zzcfbVar;
            }
        }, this.zzg);
        this.zzm = zzl;
        zzcaj.zza(zzl, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzi(String str, zzbii zzbiiVar) {
        zzfwb zzfwbVar = this.zzm;
        if (zzfwbVar == null) {
            return;
        }
        zzfvr.zzq(zzfwbVar, new zzdlq(this, str, zzbiiVar), this.zzg);
    }

    public final void zzj(WeakReference weakReference, String str, zzbii zzbiiVar) {
        zzi(str, new zzdly(this, weakReference, str, zzbiiVar, null));
    }

    public final synchronized void zzk(String str, zzbii zzbiiVar) {
        zzfwb zzfwbVar = this.zzm;
        if (zzfwbVar == null) {
            return;
        }
        zzfvr.zzq(zzfwbVar, new zzdlr(this, str, zzbiiVar), this.zzg);
    }
}
