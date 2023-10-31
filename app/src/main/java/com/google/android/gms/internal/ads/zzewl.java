package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzewl implements zzeww {
    @Nullable
    private zzcup zza;

    @Override // com.google.android.gms.internal.ads.zzeww
    /* renamed from: zza */
    public final synchronized zzcup zzd() {
        return this.zza;
    }

    public final synchronized zzfwb zzb(zzewx zzewxVar, zzewv zzewvVar, @Nullable zzcup zzcupVar) {
        zzcsm zzb;
        if (zzcupVar != null) {
            this.zza = zzcupVar;
        } else {
            this.zza = (zzcup) zzewvVar.zza(zzewxVar.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzi(zzb.zzj());
    }

    @Override // com.google.android.gms.internal.ads.zzeww
    public final /* bridge */ /* synthetic */ zzfwb zzc(zzewx zzewxVar, zzewv zzewvVar, @Nullable Object obj) {
        return zzb(zzewxVar, zzewvVar, null);
    }
}
