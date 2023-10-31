package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class zzfrg {
    private static final zzfrg zza = new zzfrd();
    private static final zzfrg zzb = new zzfre(-1);
    private static final zzfrg zzc = new zzfre(1);

    public /* synthetic */ zzfrg(zzfrf zzfrfVar) {
    }

    public static zzfrg zzj() {
        return zza;
    }

    public abstract int zza();

    public abstract zzfrg zzb(int i, int i2);

    public abstract zzfrg zzc(Object obj, Object obj2, Comparator comparator);

    public abstract zzfrg zzd(boolean z, boolean z2);

    public abstract zzfrg zze(boolean z, boolean z2);
}
