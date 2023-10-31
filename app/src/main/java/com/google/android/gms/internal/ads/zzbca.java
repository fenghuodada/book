package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class zzbca {
    private final Map zza = new HashMap();
    private final zzbcc zzb;

    public zzbca(zzbcc zzbccVar) {
        this.zzb = zzbccVar;
    }

    public final zzbcc zza() {
        return this.zzb;
    }

    public final void zzb(String str, @Nullable zzbbz zzbbzVar) {
        this.zza.put(str, zzbbzVar);
    }

    public final void zzc(String str, String str2, long j) {
        zzbcc zzbccVar = this.zzb;
        zzbbz zzbbzVar = (zzbbz) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbbzVar != null) {
            zzbccVar.zze(zzbbzVar, j, strArr);
        }
        this.zza.put(str, new zzbbz(j, null, null));
    }
}
