package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzghe {
    private final zzggx zza;
    private final List zzb;
    @Nullable
    private final Integer zzc;

    public /* synthetic */ zzghe(zzggx zzggxVar, List list, Integer num, zzghd zzghdVar) {
        this.zza = zzggxVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzghe) {
            zzghe zzgheVar = (zzghe) obj;
            if (this.zza.equals(zzgheVar.zza) && this.zzb.equals(zzgheVar.zzb)) {
                Integer num = this.zzc;
                Integer num2 = zzgheVar.zzc;
                if (num == num2) {
                    return true;
                }
                if (num != null && num.equals(num2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }
}
