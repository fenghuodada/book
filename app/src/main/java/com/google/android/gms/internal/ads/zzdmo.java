package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zzdmo extends zzcrf {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdey zze;
    private final zzdce zzf;
    private final zzcvv zzg;
    private final zzcxc zzh;
    private final zzcrz zzi;
    private final zzbvm zzj;
    private final zzfje zzk;
    private final zzezt zzl;
    private boolean zzm;

    public zzdmo(zzcre zzcreVar, Context context, @Nullable zzcfb zzcfbVar, zzdey zzdeyVar, zzdce zzdceVar, zzcvv zzcvvVar, zzcxc zzcxcVar, zzcrz zzcrzVar, zzezf zzezfVar, zzfje zzfjeVar, zzezt zzeztVar) {
        super(zzcreVar);
        this.zzm = false;
        this.zzc = context;
        this.zze = zzdeyVar;
        this.zzd = new WeakReference(zzcfbVar);
        this.zzf = zzdceVar;
        this.zzg = zzcvvVar;
        this.zzh = zzcxcVar;
        this.zzi = zzcrzVar;
        this.zzk = zzfjeVar;
        zzbvi zzbviVar = zzezfVar.zzm;
        this.zzj = new zzbwg(zzbviVar != null ? zzbviVar.zza : "", zzbviVar != null ? zzbviVar.zzb : 1);
        this.zzl = zzeztVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcfb zzcfbVar = (zzcfb) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgw)).booleanValue()) {
                if (!this.zzm && zzcfbVar != null) {
                    zzcag.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmn
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcfb.this.destroy();
                        }
                    });
                }
            } else if (zzcfbVar != null) {
                zzcfbVar.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbvm zzc() {
        return this.zzj;
    }

    public final zzezt zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        zzcfb zzcfbVar = (zzcfb) this.zzd.get();
        return (zzcfbVar == null || zzcfbVar.zzaB()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzh(boolean z, @Nullable Activity activity) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaB)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(this.zzc)) {
                zzbzt.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaC)).booleanValue()) {
                    this.zzk.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzm) {
            zzbzt.zzj("The rewarded ad have been showed.");
            this.zzg.zza(zzfba.zzd(10, null, null));
            return false;
        }
        this.zzm = true;
        this.zzf.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.zzc;
        }
        try {
            this.zze.zza(z, activity2, this.zzg);
            this.zzf.zza();
            return true;
        } catch (zzdex e) {
            this.zzg.zzc(e);
            return false;
        }
    }
}
