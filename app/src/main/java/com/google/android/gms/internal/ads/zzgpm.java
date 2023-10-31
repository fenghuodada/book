package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzgpm {
    private static final zzgoi zzb = zzgoi.zza;
    protected volatile zzgqg zza;
    private volatile zzgno zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzgpm) {
            zzgpm zzgpmVar = (zzgpm) obj;
            zzgqg zzgqgVar = this.zza;
            zzgqg zzgqgVar2 = zzgpmVar.zza;
            if (zzgqgVar == null && zzgqgVar2 == null) {
                return zzb().equals(zzgpmVar.zzb());
            }
            if (zzgqgVar == null || zzgqgVar2 == null) {
                if (zzgqgVar != null) {
                    zzgpmVar.zzc(zzgqgVar.zzbf());
                    return zzgqgVar.equals(zzgpmVar.zza);
                }
                zzc(zzgqgVar2.zzbf());
                return this.zza.equals(zzgqgVar2);
            }
            return zzgqgVar.equals(zzgqgVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzgnk) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaz();
        }
        return 0;
    }

    public final zzgno zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            this.zzc = this.zza == null ? zzgno.zzb : this.zza.zzau();
            return this.zzc;
        }
    }

    public final void zzc(zzgqg zzgqgVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzgqgVar;
                    this.zzc = zzgno.zzb;
                } catch (zzgpi unused) {
                    this.zza = zzgqgVar;
                    this.zzc = zzgno.zzb;
                }
            }
        }
    }
}
