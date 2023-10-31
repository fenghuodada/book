package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzvp {
    public final long zza;
    public final long zzb;

    public zzvp(long j, long j2) {
        this.zza = j;
        this.zzb = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzvp) {
            zzvp zzvpVar = (zzvp) obj;
            return this.zza == zzvpVar.zza && this.zzb == zzvpVar.zzb;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zza) * 31) + ((int) this.zzb);
    }
}
