package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;

/* loaded from: classes.dex */
final class zzegz implements zzcwr {
    boolean zza = false;
    final /* synthetic */ zzeby zzb;
    final /* synthetic */ zzcal zzc;
    final /* synthetic */ zzeha zzd;

    public zzegz(zzeha zzehaVar, zzeby zzebyVar, zzcal zzcalVar) {
        this.zzd = zzehaVar;
        this.zzb = zzebyVar;
        this.zzc = zzcalVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfg)).booleanValue()) {
            i = 3;
        }
        this.zzc.zze(new zzebz(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcwr
    public final synchronized void zza(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i, zzeha.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcwr
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcwr
    public final synchronized void zzc(int i, @Nullable String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzeha.zze(this.zzb.zza, i);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcwr
    public final synchronized void zzd() {
        this.zzc.zzd(null);
    }
}
