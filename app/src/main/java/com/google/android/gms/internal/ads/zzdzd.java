package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.ads.AdSDKNotificationListener;
import com.google.android.gms.ads.MobileAds;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class zzdzd implements zzdaa, com.google.android.gms.ads.internal.client.zza, zzcwc, zzcvm {
    private final Context zza;
    private final zzfap zzb;
    private final zzezr zzc;
    private final zzezf zzd;
    private final zzebc zze;
    @Nullable
    private Boolean zzf;
    private final boolean zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzgC)).booleanValue();
    @NonNull
    private final zzfen zzh;
    private final String zzi;

    public zzdzd(Context context, zzfap zzfapVar, zzezr zzezrVar, zzezf zzezfVar, zzebc zzebcVar, @NonNull zzfen zzfenVar, String str) {
        this.zza = context;
        this.zzb = zzfapVar;
        this.zzc = zzezrVar;
        this.zzd = zzezfVar;
        this.zze = zzebcVar;
        this.zzh = zzfenVar;
        this.zzi = str;
    }

    private final zzfem zzf(String str) {
        zzfem zzb = zzfem.zzb(str);
        zzb.zzh(this.zzc, null);
        zzb.zzf(this.zzd);
        zzb.zza("request_id", this.zzi);
        if (!this.zzd.zzu.isEmpty()) {
            zzb.zza("ancn", (String) this.zzd.zzu.get(0));
        }
        if (this.zzd.zzaj) {
            zzb.zza("device_connectivity", true != com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza) ? "offline" : "online");
            zzb.zza("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()));
            zzb.zza("offline_ad", "1");
        }
        return zzb;
    }

    private final void zzg(zzfem zzfemVar) {
        if (!this.zzd.zzaj) {
            this.zzh.zzb(zzfemVar);
            return;
        }
        this.zze.zzd(new zzebe(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zza(zzfemVar), 2));
    }

    private final boolean zzh() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
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
                    this.zzf = Boolean.valueOf(z);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (this.zzd.zzaj) {
            zzg(zzf("click"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvm
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zze zzeVar2;
        if (this.zzg) {
            int i = zzeVar.zza;
            String str = zzeVar.zzb;
            if (zzeVar.zzc.equals(MobileAds.ERROR_DOMAIN) && (zzeVar2 = zzeVar.zzd) != null && !zzeVar2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                com.google.android.gms.ads.internal.client.zze zzeVar3 = zzeVar.zzd;
                i = zzeVar3.zza;
                str = zzeVar3.zzb;
            }
            String zza = this.zzb.zza(str);
            zzfem zzf = zzf("ifts");
            zzf.zza("reason", "adapter");
            if (i >= 0) {
                zzf.zza("arec", String.valueOf(i));
            }
            if (zza != null) {
                zzf.zza("areec", zza);
            }
            this.zzh.zzb(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvm
    public final void zzb() {
        if (this.zzg) {
            zzfen zzfenVar = this.zzh;
            zzfem zzf = zzf("ifts");
            zzf.zza("reason", "blocked");
            zzfenVar.zzb(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvm
    public final void zzc(zzdex zzdexVar) {
        if (this.zzg) {
            zzfem zzf = zzf("ifts");
            zzf.zza("reason", "exception");
            if (!TextUtils.isEmpty(zzdexVar.getMessage())) {
                zzf.zza("msg", zzdexVar.getMessage());
            }
            this.zzh.zzb(zzf);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaa
    public final void zzd() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_shown"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdaa
    public final void zze() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_impression"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzl() {
        if (zzh() || this.zzd.zzaj) {
            zzg(zzf(AdSDKNotificationListener.IMPRESSION_EVENT));
        }
    }
}
