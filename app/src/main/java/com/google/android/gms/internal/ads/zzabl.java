package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.provider.C0758e;

/* loaded from: classes.dex */
public final class zzabl {
    public final zzabo zza;
    public final zzabo zzb;

    public zzabl(zzabo zzaboVar, zzabo zzaboVar2) {
        this.zza = zzaboVar;
        this.zzb = zzaboVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabl.class == obj.getClass()) {
            zzabl zzablVar = (zzabl) obj;
            if (this.zza.equals(zzablVar.zza) && this.zzb.equals(zzablVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        String concat;
        String zzaboVar = this.zza.toString();
        if (this.zza.equals(this.zzb)) {
            concat = "";
        } else {
            concat = ", ".concat(this.zzb.toString());
        }
        return C0758e.m11827a("[", zzaboVar, concat, "]");
    }
}
