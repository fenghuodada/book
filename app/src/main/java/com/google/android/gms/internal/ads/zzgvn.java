package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgvn implements zzgwb, zzgvi {
    private static final Object zza = new Object();
    private volatile zzgwb zzb;
    private volatile Object zzc = zza;

    private zzgvn(zzgwb zzgwbVar) {
        this.zzb = zzgwbVar;
    }

    public static zzgvi zza(zzgwb zzgwbVar) {
        if (zzgwbVar instanceof zzgvi) {
            return (zzgvi) zzgwbVar;
        }
        zzgwbVar.getClass();
        return new zzgvn(zzgwbVar);
    }

    public static zzgwb zzc(zzgwb zzgwbVar) {
        zzgwbVar.getClass();
        return zzgwbVar instanceof zzgvn ? zzgwbVar : new zzgvn(zzgwbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwb
    public final Object zzb() {
        Object obj = this.zzc;
        Object obj2 = zza;
        if (obj == obj2) {
            synchronized (this) {
                obj = this.zzc;
                if (obj == obj2) {
                    obj = this.zzb.zzb();
                    Object obj3 = this.zzc;
                    if (obj3 != obj2 && obj3 != obj) {
                        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                    }
                    this.zzc = obj;
                    this.zzb = null;
                }
            }
        }
        return obj;
    }
}
