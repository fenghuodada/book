package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
final class zzfsy extends zzfta implements Serializable {
    static final zzfsy zza = new zzfsy();

    private zzfsy() {
    }

    @Override // com.google.android.gms.internal.ads.zzfta, java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.android.gms.internal.ads.zzfta
    public final zzfta zza() {
        return zzfti.zza;
    }
}
