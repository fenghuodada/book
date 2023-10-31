package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgwa implements zzgwb {
    private static final Object zza = new Object();
    private volatile zzgwb zzb;
    private volatile Object zzc = zza;

    private zzgwa(zzgwb zzgwbVar) {
        this.zzb = zzgwbVar;
    }

    public static zzgwb zza(zzgwb zzgwbVar) {
        if ((zzgwbVar instanceof zzgwa) || (zzgwbVar instanceof zzgvn)) {
            return zzgwbVar;
        }
        zzgwbVar.getClass();
        return new zzgwa(zzgwbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj == zza) {
            zzgwb zzgwbVar = this.zzb;
            if (zzgwbVar == null) {
                return this.zzc;
            }
            Object zzb = zzgwbVar.zzb();
            this.zzc = zzb;
            this.zzb = null;
            return zzb;
        }
        return obj;
    }
}
