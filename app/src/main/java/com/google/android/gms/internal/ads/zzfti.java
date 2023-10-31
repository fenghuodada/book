package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
final class zzfti extends zzfta implements Serializable {
    static final zzfti zza = new zzfti();

    private zzfti() {
    }

    @Override // com.google.android.gms.internal.ads.zzfta, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public final String toString() {
        return "Ordering.natural().reverse()";
    }

    @Override // com.google.android.gms.internal.ads.zzfta
    public final zzfta zza() {
        return zzfsy.zza;
    }
}
