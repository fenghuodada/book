package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzagv {
    public final zzaha zza;
    public final zzahd zzb;
    public final zzabr zzc;
    @Nullable
    public final zzabs zzd;
    public int zze;

    public zzagv(zzaha zzahaVar, zzahd zzahdVar, zzabr zzabrVar) {
        this.zza = zzahaVar;
        this.zzb = zzahdVar;
        this.zzc = zzabrVar;
        this.zzd = "audio/true-hd".equals(zzahaVar.zzf.zzm) ? new zzabs() : null;
    }
}
