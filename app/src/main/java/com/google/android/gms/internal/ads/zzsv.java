package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzsv implements zzve {
    protected final zzve[] zza;

    public zzsv(zzve[] zzveVarArr) {
        this.zza = zzveVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final long zzb() {
        long j = Long.MAX_VALUE;
        for (zzve zzveVar : this.zza) {
            long zzb = zzveVar.zzb();
            if (zzb != Long.MIN_VALUE) {
                j = Math.min(j, zzb);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final long zzc() {
        long j = Long.MAX_VALUE;
        for (zzve zzveVar : this.zza) {
            long zzc = zzveVar.zzc();
            if (zzc != Long.MIN_VALUE) {
                j = Math.min(j, zzc);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final void zzm(long j) {
        for (zzve zzveVar : this.zza) {
            zzveVar.zzm(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final boolean zzo(long j) {
        zzve[] zzveVarArr;
        boolean z;
        boolean z2 = false;
        do {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            z = false;
            for (zzve zzveVar : this.zza) {
                long zzc2 = zzveVar.zzc();
                boolean z3 = zzc2 != Long.MIN_VALUE && zzc2 <= j;
                if (zzc2 == zzc || z3) {
                    z |= zzveVar.zzo(j);
                }
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzve
    public final boolean zzp() {
        for (zzve zzveVar : this.zza) {
            if (zzveVar.zzp()) {
                return true;
            }
        }
        return false;
    }
}
