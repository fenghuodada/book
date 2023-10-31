package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
final class zzgoe {
    private final zzgod zza;

    private zzgoe(zzgod zzgodVar) {
        byte[] bArr = zzgpg.zzd;
        this.zza = zzgodVar;
        zzgodVar.zze = this;
    }

    public static zzgoe zza(zzgod zzgodVar) {
        zzgoe zzgoeVar = zzgodVar.zze;
        return zzgoeVar != null ? zzgoeVar : new zzgoe(zzgodVar);
    }

    public final void zzA(int i, int i2) throws IOException {
        this.zza.zzr(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void zzB(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzgod zzgodVar = this.zza;
                int intValue = ((Integer) list.get(i2)).intValue();
                zzgodVar.zzr(i, (intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int intValue2 = ((Integer) list.get(i4)).intValue();
            i3 += zzgod.zzA((intValue2 >> 31) ^ (intValue2 + intValue2));
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            zzgod zzgodVar2 = this.zza;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            zzgodVar2.zzs((intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    public final void zzC(int i, long j) throws IOException {
        this.zza.zzt(i, (j >> 63) ^ (j + j));
    }

    public final void zzD(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                zzgod zzgodVar = this.zza;
                long longValue = ((Long) list.get(i2)).longValue();
                zzgodVar.zzt(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += zzgod.zzB((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            zzgod zzgodVar2 = this.zza;
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzgodVar2.zzu((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    @Deprecated
    public final void zzE(int i) throws IOException {
        this.zza.zzq(i, 3);
    }

    public final void zzF(int i, String str) throws IOException {
        this.zza.zzo(i, str);
    }

    public final void zzG(int i, List list) throws IOException {
        int i2 = 0;
        if (!(list instanceof zzgpo)) {
            while (i2 < list.size()) {
                this.zza.zzo(i, (String) list.get(i2));
                i2++;
            }
            return;
        }
        zzgpo zzgpoVar = (zzgpo) list;
        while (i2 < list.size()) {
            Object zzf = zzgpoVar.zzf(i2);
            if (zzf instanceof String) {
                this.zza.zzo(i, (String) zzf);
            } else {
                this.zza.zzL(i, (zzgno) zzf);
            }
            i2++;
        }
    }

    public final void zzH(int i, int i2) throws IOException {
        this.zza.zzr(i, i2);
    }

    public final void zzI(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzr(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzgod.zzA(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzs(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzJ(int i, long j) throws IOException {
        this.zza.zzt(i, j);
    }

    public final void zzK(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzt(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzgod.zzB(((Long) list.get(i4)).longValue());
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzu(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzb(int i, boolean z) throws IOException {
        this.zza.zzK(i, z);
    }

    public final void zzc(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzK(i, ((Boolean) list.get(i2)).booleanValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Boolean) list.get(i4)).booleanValue();
            i3++;
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzJ(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : (byte) 0);
            i2++;
        }
    }

    public final void zzd(int i, zzgno zzgnoVar) throws IOException {
        this.zza.zzL(i, zzgnoVar);
    }

    public final void zze(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzL(i, (zzgno) list.get(i2));
        }
    }

    public final void zzf(int i, double d) throws IOException {
        this.zza.zzj(i, Double.doubleToRawLongBits(d));
    }

    public final void zzg(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).doubleValue();
            i3 += 8;
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzq(i, 4);
    }

    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    public final void zzj(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzgod.zzx(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzm(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    public final void zzl(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzi(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzm(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }

    public final void zzn(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzk(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzo(int i, float f) throws IOException {
        this.zza.zzh(i, Float.floatToRawIntBits(f));
    }

    public final void zzp(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).floatValue();
            i3 += 4;
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public final void zzq(int i, Object obj, zzgqz zzgqzVar) throws IOException {
        zzgod zzgodVar = this.zza;
        zzgodVar.zzq(i, 3);
        zzgqzVar.zzm((zzgqg) obj, zzgodVar.zze);
        zzgodVar.zzq(i, 4);
    }

    public final void zzr(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    public final void zzs(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzgod.zzx(((Integer) list.get(i4)).intValue());
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzm(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzt(int i, long j) throws IOException {
        this.zza.zzt(i, j);
    }

    public final void zzu(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzt(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += zzgod.zzB(((Long) list.get(i4)).longValue());
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzu(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzv(int i, Object obj, zzgqz zzgqzVar) throws IOException {
        this.zza.zzn(i, (zzgqg) obj, zzgqzVar);
    }

    public final void zzw(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    public final void zzx(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Integer) list.get(i4)).intValue();
            i3 += 4;
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzi(((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzy(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }

    public final void zzz(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                this.zza.zzj(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        this.zza.zzq(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).longValue();
            i3 += 8;
        }
        this.zza.zzs(i3);
        while (i2 < list.size()) {
            this.zza.zzk(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
