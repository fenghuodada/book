package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzte extends zzsz {
    public static final Object zzd = new Object();
    @Nullable
    private final Object zze;
    @Nullable
    private final Object zzf;

    private zzte(zzcx zzcxVar, @Nullable Object obj, @Nullable Object obj2) {
        super(zzcxVar);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zzte zzq(zzbq zzbqVar) {
        return new zzte(new zztf(zzbqVar), zzcw.zza, zzd);
    }

    public static zzte zzr(zzcx zzcxVar, @Nullable Object obj, @Nullable Object obj2) {
        return new zzte(zzcxVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzcx
    public final int zza(Object obj) {
        Object obj2;
        zzcx zzcxVar = this.zzc;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return zzcxVar.zza(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzcx
    public final zzcu zzd(int i, zzcu zzcuVar, boolean z) {
        this.zzc.zzd(i, zzcuVar, z);
        if (zzfn.zzB(zzcuVar.zzc, this.zzf) && z) {
            zzcuVar.zzc = zzd;
        }
        return zzcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzcx
    public final zzcw zze(int i, zzcw zzcwVar, long j) {
        this.zzc.zze(i, zzcwVar, j);
        if (zzfn.zzB(zzcwVar.zzc, this.zze)) {
            zzcwVar.zzc = zzcw.zza;
        }
        return zzcwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzsz, com.google.android.gms.internal.ads.zzcx
    public final Object zzf(int i) {
        Object zzf = this.zzc.zzf(i);
        return zzfn.zzB(zzf, this.zzf) ? zzd : zzf;
    }

    public final zzte zzp(zzcx zzcxVar) {
        return new zzte(zzcxVar, this.zze, this.zzf);
    }
}
