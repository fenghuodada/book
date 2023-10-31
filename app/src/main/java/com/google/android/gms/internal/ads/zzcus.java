package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzcus {
    private final Context zza;
    private final zzfaa zzb;
    private final Bundle zzc;
    @Nullable
    private final zzezs zzd;
    @Nullable
    private final zzcuk zze;
    @Nullable
    private final zzeca zzf;

    public /* synthetic */ zzcus(zzcuq zzcuqVar, zzcur zzcurVar) {
        this.zza = zzcuq.zza(zzcuqVar);
        this.zzb = zzcuq.zzm(zzcuqVar);
        this.zzc = zzcuq.zzb(zzcuqVar);
        this.zzd = zzcuq.zzl(zzcuqVar);
        this.zze = zzcuq.zzc(zzcuqVar);
        this.zzf = zzcuq.zzk(zzcuqVar);
    }

    public final Context zza(Context context) {
        return this.zza;
    }

    @Nullable
    public final Bundle zzb() {
        return this.zzc;
    }

    @Nullable
    public final zzcuk zzc() {
        return this.zze;
    }

    public final zzcuq zzd() {
        zzcuq zzcuqVar = new zzcuq();
        zzcuqVar.zze(this.zza);
        zzcuqVar.zzi(this.zzb);
        zzcuqVar.zzf(this.zzc);
        zzcuqVar.zzg(this.zze);
        zzcuqVar.zzd(this.zzf);
        return zzcuqVar;
    }

    public final zzeca zze(String str) {
        zzeca zzecaVar = this.zzf;
        return zzecaVar != null ? zzecaVar : new zzeca(str);
    }

    @Nullable
    public final zzezs zzf() {
        return this.zzd;
    }

    public final zzfaa zzg() {
        return this.zzb;
    }
}
