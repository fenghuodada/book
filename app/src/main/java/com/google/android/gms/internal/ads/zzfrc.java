package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
final class zzfrc extends zzfta implements Serializable {
    final Comparator zza;

    public zzfrc(Comparator comparator) {
        comparator.getClass();
        this.zza = comparator;
    }

    @Override // com.google.android.gms.internal.ads.zzfta, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.zza.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(@CheckForNull Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfrc) {
            return this.zza.equals(((zzfrc) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}
