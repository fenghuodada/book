package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.WeakReference;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzddp extends zzcrf {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdce zze;
    private final zzdey zzf;
    private final zzcrz zzg;
    private final zzfje zzh;
    private final zzcvv zzi;
    private boolean zzj;

    public zzddp(zzcre zzcreVar, Context context, @Nullable zzcfb zzcfbVar, zzdce zzdceVar, zzdey zzdeyVar, zzcrz zzcrzVar, zzfje zzfjeVar, zzcvv zzcvvVar) {
        super(zzcreVar);
        this.zzj = false;
        this.zzc = context;
        this.zzd = new WeakReference(zzcfbVar);
        this.zze = zzdceVar;
        this.zzf = zzdeyVar;
        this.zzg = zzcrzVar;
        this.zzh = zzfjeVar;
        this.zzi = zzcvvVar;
    }

    public final void finalize() throws Throwable {
        try {
            final zzcfb zzcfbVar = (zzcfb) this.zzd.get();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgw)).booleanValue()) {
                if (!this.zzj && zzcfbVar != null) {
                    zzcag.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzddo
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

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean zzc(boolean z, @Nullable Activity activity) {
        this.zze.zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaB)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(this.zzc)) {
                zzbzt.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzaC)).booleanValue()) {
                    this.zzh.zza(this.zza.zzb.zzb.zzb);
                }
                return false;
            }
        }
        if (this.zzj) {
            zzbzt.zzj("The interstitial ad has been showed.");
            this.zzi.zza(zzfba.zzd(10, null, null));
        }
        Activity activity2 = activity;
        if (!this.zzj) {
            if (activity == null) {
                activity2 = this.zzc;
            }
            try {
                this.zzf.zza(z, activity2, this.zzi);
                this.zze.zza();
                this.zzj = true;
                return true;
            } catch (zzdex e) {
                this.zzi.zzc(e);
            }
        }
        return false;
    }
}
