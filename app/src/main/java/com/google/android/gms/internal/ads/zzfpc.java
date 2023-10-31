package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.List;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
final class zzfpc implements Serializable, zzfpa {
    private final List zza;

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzfpc) {
            return this.zza.equals(((zzfpc) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 306654252;
    }

    public final String toString() {
        List list = this.zza;
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfpa
    public final boolean zza(Object obj) {
        for (int i = 0; i < this.zza.size(); i++) {
            if (!((zzfpa) this.zza.get(i)).zza(obj)) {
                return false;
            }
        }
        return true;
    }
}
