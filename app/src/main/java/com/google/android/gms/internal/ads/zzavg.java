package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzavg {
    final long zza;
    final String zzb;
    final int zzc;

    public zzavg(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof zzavg)) {
            zzavg zzavgVar = (zzavg) obj;
            if (zzavgVar.zza == this.zza && zzavgVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
