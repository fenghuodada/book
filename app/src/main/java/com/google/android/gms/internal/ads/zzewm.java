package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzewm implements zzeww {
    private final zzeww zza;
    @Nullable
    private zzcup zzb;

    public zzewm(zzeww zzewwVar) {
        this.zza = zzewwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeww
    /* renamed from: zza */
    public final synchronized zzcup zzd() {
        return this.zzb;
    }

    public final synchronized zzfwb zzb(zzewx zzewxVar, zzewv zzewvVar, @Nullable zzcup zzcupVar) {
        this.zzb = zzcupVar;
        if (zzewxVar.zza == null) {
            return ((zzewl) this.zza).zzb(zzewxVar, zzewvVar, zzcupVar);
        }
        zzcsm zzb = zzcupVar.zzb();
        return zzb.zzi(zzb.zzk(zzfvr.zzh(zzewxVar.zza)));
    }

    @Override // com.google.android.gms.internal.ads.zzeww
    public final /* bridge */ /* synthetic */ zzfwb zzc(zzewx zzewxVar, zzewv zzewvVar, @Nullable Object obj) {
        return zzb(zzewxVar, zzewvVar, null);
    }
}
