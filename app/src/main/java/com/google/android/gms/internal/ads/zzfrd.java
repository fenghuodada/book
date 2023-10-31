package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class zzfrd extends zzfrg {
    public zzfrd() {
        super(null);
    }

    public static final zzfrg zzf(int i) {
        zzfrg zzfrgVar;
        zzfrg zzfrgVar2;
        zzfrg zzfrgVar3;
        if (i < 0) {
            zzfrgVar3 = zzfrg.zzb;
            return zzfrgVar3;
        } else if (i > 0) {
            zzfrgVar2 = zzfrg.zzc;
            return zzfrgVar2;
        } else {
            zzfrgVar = zzfrg.zza;
            return zzfrgVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final zzfrg zzb(int i, int i2) {
        return zzf(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final zzfrg zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final zzfrg zzd(boolean z, boolean z2) {
        return zzf(zzfty.zza(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzfrg
    public final zzfrg zze(boolean z, boolean z2) {
        return zzf(zzfty.zza(false, false));
    }
}
