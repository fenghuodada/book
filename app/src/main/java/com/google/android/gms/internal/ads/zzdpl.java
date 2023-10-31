package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzdpl implements zzdaa, com.google.android.gms.ads.internal.client.zza, zzcwc, zzcvm {
    private final Context zza;
    private final zzfap zzb;
    private final zzdqc zzc;
    private final zzezr zzd;
    private final zzezf zze;
    private final zzebc zzf;
    @Nullable
    private Boolean zzg;
    private final boolean zzh = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgC)).booleanValue();

    public zzdpl(Context context, zzfap zzfapVar, zzdqc zzdqcVar, zzezr zzezrVar, zzezf zzezfVar, zzebc zzebcVar) {
        this.zza = context;
        this.zzb = zzfapVar;
        this.zzc = zzdqcVar;
        this.zzd = zzezrVar;
        this.zze = zzezfVar;
        this.zzf = zzebcVar;
    }

    private final zzdqb zzf(String str) {
        zzdqb zza = this.zzc.zza();
        zza.zze(this.zzd.zzb.zzb);
        zza.zzd(this.zze);
        zza.zzb("action", str);
        if (!this.zze.zzu.isEmpty()) {
            zza.zzb("ancn", (String) this.zze.zzu.get(0));
        }
        if (this.zze.zzaj) {
            zza.zzb("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza) ? "offline" : "online");
            zza.zzb("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zza.zzb("offline_ad", "1");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgL)).booleanValue()) {
            boolean z = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zze(this.zzd.zza.zza) != 1;
            zza.zzb("scar", String.valueOf(z));
            if (z) {
                com.google.android.gms.ads.internal.client.zzl zzlVar = this.zzd.zza.zza.zzd;
                zza.zzc("ragent", zzlVar.zzp);
                zza.zzc("rtype", com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza(com.google.android.gms.ads.nonagon.signalgeneration.zzf.zzb(zzlVar)));
            }
        }
        return zza;
    }

    private final void zzg(zzdqb zzdqbVar) {
        if (!this.zze.zzaj) {
            zzdqbVar.zzg();
            return;
        }
        this.zzf.zzd(new zzebe(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdqbVar.zzf(), 2));
    }

    private final boolean zzh() {
        if (this.zzg == null) {
            synchronized (this) {
                if (this.zzg == null) {
                    String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbp);
                    com.google.android.gms.ads.internal.zzt.zzp();
                    String zzn = com.google.android.gms.ads.internal.util.zzs.zzn(this.zza);
                    boolean z = false;
                    if (str != null && zzn != null) {
                        try {
                            z = Pattern.matches(str, zzn);
                        } catch (RuntimeException e) {
                            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzg = Boolean.valueOf(z);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zze.zzaj) {
            zzg(zzf("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvm
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzh) {
            zzdqb zzf = zzf("ifts");
            zzf.zzb("reason", "adapter");
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            if (i >= 0) {
                zzf.zzb("arec", String.valueOf(i));
            }
            String zza = this.zzb.zza(str);
            if (zza != null) {
                zzf.zzb("areec", zza);
            }
            zzf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvm
    public final void zzb() {
        if (this.zzh) {
            zzdqb zzf = zzf("ifts");
            zzf.zzb("reason", "blocked");
            zzf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvm
    public final void zzc(zzdex zzdexVar) {
        if (this.zzh) {
            zzdqb zzf = zzf("ifts");
            zzf.zzb("reason", "exception");
            if (!TextUtils.isEmpty(zzdexVar.getMessage())) {
                zzf.zzb("msg", zzdexVar.getMessage());
            }
            zzf.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaa
    public final void zzd() {
        if (zzh()) {
            zzf("adapter_shown").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaa
    public final void zze() {
        if (zzh()) {
            zzf("adapter_impression").zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzl() {
        if (zzh() || this.zze.zzaj) {
            zzg(zzf(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
