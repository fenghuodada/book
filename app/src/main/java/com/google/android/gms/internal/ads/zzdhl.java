package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.collection.C0482i;

/* loaded from: classes.dex */
public final class zzdhl {
    zzbfr zza;
    zzbfo zzb;
    zzbge zzc;
    zzbgb zzd;
    zzbkz zze;
    final C0482i zzf = new C0482i();
    final C0482i zzg = new C0482i();

    public final zzdhl zza(zzbfo zzbfoVar) {
        this.zzb = zzbfoVar;
        return this;
    }

    public final zzdhl zzb(zzbfr zzbfrVar) {
        this.zza = zzbfrVar;
        return this;
    }

    public final zzdhl zzc(String str, zzbfx zzbfxVar, @Nullable zzbfu zzbfuVar) {
        this.zzf.put(str, zzbfxVar);
        if (zzbfuVar != null) {
            this.zzg.put(str, zzbfuVar);
        }
        return this;
    }

    public final zzdhl zzd(zzbkz zzbkzVar) {
        this.zze = zzbkzVar;
        return this;
    }

    public final zzdhl zze(zzbgb zzbgbVar) {
        this.zzd = zzbgbVar;
        return this;
    }

    public final zzdhl zzf(zzbge zzbgeVar) {
        this.zzc = zzbgeVar;
        return this;
    }

    public final zzdhn zzg() {
        return new zzdhn(this);
    }
}
