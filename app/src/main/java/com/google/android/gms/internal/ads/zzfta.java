package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class zzfta implements Comparator {
    public static zzfta zzb(Comparator comparator) {
        return comparator instanceof zzfta ? (zzfta) comparator : new zzfrc(comparator);
    }

    public static zzfta zzc() {
        return zzfsy.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzfta zza() {
        return new zzftj(this);
    }
}
