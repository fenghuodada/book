package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
final class zzftj extends zzfta implements Serializable {
    final zzfta zza;

    public zzftj(zzfta zzftaVar) {
        this.zza = zzftaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfta, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzftj) {
            return this.zza.equals(((zzftj) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    @Override // com.google.android.gms.internal.ads.zzfta
    public final zzfta zza() {
        return this.zza;
    }
}
