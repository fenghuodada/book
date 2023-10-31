package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzfca {
    private final HashMap zza = new HashMap();

    public final zzfbz zza(zzfbq zzfbqVar, Context context, zzfbi zzfbiVar, zzfcg zzfcgVar) {
        zzfbz zzfbzVar = (zzfbz) this.zza.get(zzfbqVar);
        if (zzfbzVar == null) {
            zzfbn zzfbnVar = new zzfbn(zzfbt.zza(zzfbqVar, context));
            zzfbz zzfbzVar2 = new zzfbz(zzfbnVar, new zzfci(zzfbnVar, zzfbiVar, zzfcgVar));
            this.zza.put(zzfbqVar, zzfbzVar2);
            return zzfbzVar2;
        }
        return zzfbzVar;
    }
}
