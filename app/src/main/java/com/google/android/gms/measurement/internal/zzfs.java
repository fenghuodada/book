package com.google.android.gms.measurement.internal;

import java.util.List;

/* loaded from: classes3.dex */
final class zzfs implements com.google.android.gms.internal.measurement.zzr {
    final /* synthetic */ zzfu zza;

    public zzfs(zzfu zzfuVar) {
        this.zza = zzfuVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzr
    public final void zza(int i, String str, List list, boolean z, boolean z2) {
        zzer zzc;
        int i2 = i - 1;
        if (i2 == 0) {
            zzc = this.zza.zzt.zzaA().zzc();
        } else if (i2 == 1) {
            zzet zzaA = this.zza.zzt.zzaA();
            zzc = z ? zzaA.zzh() : !z2 ? zzaA.zze() : zzaA.zzd();
        } else if (i2 == 3) {
            zzc = this.zza.zzt.zzaA().zzj();
        } else if (i2 != 4) {
            zzc = this.zza.zzt.zzaA().zzi();
        } else {
            zzet zzaA2 = this.zza.zzt.zzaA();
            zzc = z ? zzaA2.zzm() : !z2 ? zzaA2.zzl() : zzaA2.zzk();
        }
        int size = list.size();
        if (size == 1) {
            zzc.zzb(str, list.get(0));
        } else if (size == 2) {
            zzc.zzc(str, list.get(0), list.get(1));
        } else if (size != 3) {
            zzc.zza(str);
        } else {
            zzc.zzd(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
