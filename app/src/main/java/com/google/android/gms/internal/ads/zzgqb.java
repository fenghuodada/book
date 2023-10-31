package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgqb {
    public static final int zza(int i, Object obj, Object obj2) {
        zzgqa zzgqaVar = (zzgqa) obj;
        zzgpz zzgpzVar = (zzgpz) obj2;
        if (zzgqaVar.isEmpty()) {
            return 0;
        }
        Iterator it = zzgqaVar.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
        return 0;
    }

    public static final boolean zzb(Object obj) {
        return !((zzgqa) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzgqa zzgqaVar = (zzgqa) obj;
        zzgqa zzgqaVar2 = (zzgqa) obj2;
        if (!zzgqaVar2.isEmpty()) {
            if (!zzgqaVar.zze()) {
                zzgqaVar = zzgqaVar.zzb();
            }
            zzgqaVar.zzd(zzgqaVar2);
        }
        return zzgqaVar;
    }
}
