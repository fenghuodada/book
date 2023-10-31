package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class zzgnf implements Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzgno zzgnoVar = (zzgno) obj;
        zzgno zzgnoVar2 = (zzgno) obj2;
        zzgni it = zzgnoVar.iterator();
        zzgni it2 = zzgnoVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int compareTo = Integer.valueOf(it.zza() & 255).compareTo(Integer.valueOf(it2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzgnoVar.zzd()).compareTo(Integer.valueOf(zzgnoVar2.zzd()));
    }
}
