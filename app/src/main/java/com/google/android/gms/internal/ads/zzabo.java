package com.google.android.gms.internal.ads;

import android.support.p000v4.media.session.C0017a;
import androidx.annotation.Nullable;
import androidx.concurrent.futures.C0486c;

/* loaded from: classes.dex */
public final class zzabo {
    public static final zzabo zza = new zzabo(0, 0);
    public final long zzb;
    public final long zzc;

    public zzabo(long j, long j2) {
        this.zzb = j;
        this.zzc = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabo.class == obj.getClass()) {
            zzabo zzaboVar = (zzabo) obj;
            if (this.zzb == zzaboVar.zzb && this.zzc == zzaboVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j = this.zzb;
        return C0017a.m13071a(C0486c.m12390a("[timeUs=", j, ", position="), this.zzc, "]");
    }
}
