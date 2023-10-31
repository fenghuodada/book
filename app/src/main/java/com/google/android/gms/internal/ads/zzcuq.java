package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzcuq {
    private Context zza;
    private zzfaa zzb;
    private Bundle zzc;
    @Nullable
    private zzezs zzd;
    @Nullable
    private zzcuk zze;
    @Nullable
    private zzeca zzf;

    public final zzcuq zzd(@Nullable zzeca zzecaVar) {
        this.zzf = zzecaVar;
        return this;
    }

    public final zzcuq zze(Context context) {
        this.zza = context;
        return this;
    }

    public final zzcuq zzf(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzcuq zzg(@Nullable zzcuk zzcukVar) {
        this.zze = zzcukVar;
        return this;
    }

    public final zzcuq zzh(zzezs zzezsVar) {
        this.zzd = zzezsVar;
        return this;
    }

    public final zzcuq zzi(zzfaa zzfaaVar) {
        this.zzb = zzfaaVar;
        return this;
    }

    public final zzcus zzj() {
        return new zzcus(this, null);
    }
}
