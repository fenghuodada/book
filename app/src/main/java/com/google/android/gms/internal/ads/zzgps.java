package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes.dex */
final class zzgps extends zzgpu {
    private zzgps() {
        super(null);
    }

    public /* synthetic */ zzgps(zzgpr zzgprVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgpu
    public final List zza(Object obj, long j) {
        zzgpf zzgpfVar = (zzgpf) zzgsa.zzh(obj, j);
        if (zzgpfVar.zzc()) {
            return zzgpfVar;
        }
        int size = zzgpfVar.size();
        zzgpf zzd = zzgpfVar.zzd(size == 0 ? 10 : size + size);
        zzgsa.zzv(obj, j, zzd);
        return zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgpu
    public final void zzb(Object obj, long j) {
        ((zzgpf) zzgsa.zzh(obj, j)).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgpu
    public final void zzc(Object obj, Object obj2, long j) {
        zzgpf zzgpfVar = (zzgpf) zzgsa.zzh(obj, j);
        zzgpf zzgpfVar2 = (zzgpf) zzgsa.zzh(obj2, j);
        int size = zzgpfVar.size();
        int size2 = zzgpfVar2.size();
        if (size > 0 && size2 > 0) {
            if (!zzgpfVar.zzc()) {
                zzgpfVar = zzgpfVar.zzd(size2 + size);
            }
            zzgpfVar.addAll(zzgpfVar2);
        }
        if (size > 0) {
            zzgpfVar2 = zzgpfVar;
        }
        zzgsa.zzv(obj, j, zzgpfVar2);
    }
}
