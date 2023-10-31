package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgpx implements zzgqe {
    private final zzgqe[] zza;

    public zzgpx(zzgqe... zzgqeVarArr) {
        this.zza = zzgqeVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final zzgqd zzb(Class cls) {
        zzgqe[] zzgqeVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzgqe zzgqeVar = zzgqeVarArr[i];
            if (zzgqeVar.zzc(cls)) {
                return zzgqeVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.ads.zzgqe
    public final boolean zzc(Class cls) {
        zzgqe[] zzgqeVarArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzgqeVarArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
