package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgvm implements zzgvo {
    private zzgwb zza;

    public static void zza(zzgwb zzgwbVar, zzgwb zzgwbVar2) {
        zzgvm zzgvmVar = (zzgvm) zzgwbVar;
        if (zzgvmVar.zza != null) {
            throw new IllegalStateException();
        }
        zzgvmVar.zza = zzgwbVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final Object zzb() {
        zzgwb zzgwbVar = this.zza;
        if (zzgwbVar != null) {
            return zzgwbVar.zzb();
        }
        throw new IllegalStateException();
    }
}
