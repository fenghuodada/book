package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes.dex */
final class zzava implements Comparator {
    public zzava(zzavc zzavcVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzavg zzavgVar = (zzavg) obj;
        zzavg zzavgVar2 = (zzavg) obj2;
        int i = zzavgVar.zzc - zzavgVar2.zzc;
        return i != 0 ? i : (zzavgVar.zza > zzavgVar2.zza ? 1 : (zzavgVar.zza == zzavgVar2.zza ? 0 : -1));
    }
}
