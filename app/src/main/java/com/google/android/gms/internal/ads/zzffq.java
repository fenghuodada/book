package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zzffq implements Runnable {
    private final zzfft zzb;
    private String zzc;
    private String zzd;
    private zzezq zze;
    private com.google.android.gms.ads.internal.client.zze zzf;
    private Future zzg;
    private final List zza = new ArrayList();
    private int zzh = 2;

    public zzffq(zzfft zzfftVar) {
        this.zzb = zzfftVar;
    }

    @Override // java.lang.Runnable
    public final synchronized void run() {
        zzg();
    }

    public final synchronized zzffq zza(zzfff zzfffVar) {
        if (((Boolean) zzbcw.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfffVar.zzi();
            list.add(zzfffVar);
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            this.zzg = zzcag.zzd.schedule(this, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzik)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzffq zzb(String str) {
        if (((Boolean) zzbcw.zzc.zze()).booleanValue() && zzffp.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzffq zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) zzbcw.zzc.zze()).booleanValue()) {
            this.zzf = zzeVar;
        }
        return this;
    }

    public final synchronized zzffq zzd(ArrayList arrayList) {
        if (((Boolean) zzbcw.zzc.zze()).booleanValue()) {
            if (!arrayList.contains("banner") && !arrayList.contains(AdFormat.BANNER.name())) {
                if (!arrayList.contains("interstitial") && !arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                    if (!arrayList.contains("native") && !arrayList.contains(AdFormat.NATIVE.name())) {
                        if (!arrayList.contains("rewarded") && !arrayList.contains(AdFormat.REWARDED.name())) {
                            if (arrayList.contains("app_open_ad")) {
                                this.zzh = 7;
                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                this.zzh = 6;
                            }
                        }
                        this.zzh = 5;
                    }
                    this.zzh = 8;
                }
                this.zzh = 4;
            }
            this.zzh = 3;
        }
        return this;
    }

    public final synchronized zzffq zze(String str) {
        if (((Boolean) zzbcw.zzc.zze()).booleanValue()) {
            this.zzd = str;
        }
        return this;
    }

    public final synchronized zzffq zzf(zzezq zzezqVar) {
        if (((Boolean) zzbcw.zzc.zze()).booleanValue()) {
            this.zze = zzezqVar;
        }
        return this;
    }

    public final synchronized void zzg() {
        if (((Boolean) zzbcw.zzc.zze()).booleanValue()) {
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            for (zzfff zzfffVar : this.zza) {
                int i = this.zzh;
                if (i != 2) {
                    zzfffVar.zzm(i);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzfffVar.zze(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zzd) && !zzfffVar.zzk()) {
                    zzfffVar.zzd(this.zzd);
                }
                zzezq zzezqVar = this.zze;
                if (zzezqVar != null) {
                    zzfffVar.zzb(zzezqVar);
                } else {
                    com.google.android.gms.ads.internal.client.zze zzeVar = this.zzf;
                    if (zzeVar != null) {
                        zzfffVar.zza(zzeVar);
                    }
                }
                this.zzb.zzb(zzfffVar.zzl());
            }
            this.zza.clear();
        }
    }

    public final synchronized zzffq zzh(int i) {
        if (((Boolean) zzbcw.zzc.zze()).booleanValue()) {
            this.zzh = i;
        }
        return this;
    }
}
