package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
abstract class zzgrq {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i, int i2);

    public abstract void zzi(Object obj, int i, long j);

    public abstract void zzj(Object obj, int i, Object obj2);

    public abstract void zzk(Object obj, int i, zzgno zzgnoVar);

    public abstract void zzl(Object obj, int i, long j);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public final boolean zzp(Object obj, zzgqr zzgqrVar) throws IOException {
        int zzd = zzgqrVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 == 0) {
            zzl(obj, i, zzgqrVar.zzl());
            return true;
        } else if (i2 == 1) {
            zzi(obj, i, zzgqrVar.zzk());
            return true;
        } else if (i2 == 2) {
            zzk(obj, i, zzgqrVar.zzp());
            return true;
        } else if (i2 != 3) {
            if (i2 != 4) {
                if (i2 == 5) {
                    zzh(obj, i, zzgqrVar.zzf());
                    return true;
                }
                throw zzgpi.zza();
            }
            return false;
        } else {
            Object zzf = zzf();
            int i3 = i << 3;
            while (zzgqrVar.zzc() != Integer.MAX_VALUE && zzp(zzf, zzgqrVar)) {
            }
            if ((4 | i3) == zzgqrVar.zzd()) {
                zzg(zzf);
                zzj(obj, i, zzf);
                return true;
            }
            throw zzgpi.zzb();
        }
    }

    public abstract boolean zzq(zzgqr zzgqrVar);

    public abstract void zzr(Object obj, zzgoe zzgoeVar) throws IOException;
}
