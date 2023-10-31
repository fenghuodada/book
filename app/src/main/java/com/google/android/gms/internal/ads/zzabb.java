package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzabb {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final long zzj;
    @Nullable
    public final zzaba zzk;
    @Nullable
    private final zzca zzl;

    private zzabb(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, @Nullable zzaba zzabaVar, @Nullable zzca zzcaVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = zzi(i5);
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = zzh(i7);
        this.zzj = j;
        this.zzk = zzabaVar;
        this.zzl = zzcaVar;
    }

    public zzabb(byte[] bArr, int i) {
        zzfc zzfcVar = new zzfc(bArr, bArr.length);
        zzfcVar.zzj(i * 8);
        this.zza = zzfcVar.zzd(16);
        this.zzb = zzfcVar.zzd(16);
        this.zzc = zzfcVar.zzd(24);
        this.zzd = zzfcVar.zzd(24);
        int zzd = zzfcVar.zzd(20);
        this.zze = zzd;
        this.zzf = zzi(zzd);
        this.zzg = zzfcVar.zzd(3) + 1;
        int zzd2 = zzfcVar.zzd(5) + 1;
        this.zzh = zzd2;
        this.zzi = zzh(zzd2);
        int zzd3 = zzfcVar.zzd(4);
        int zzd4 = zzfcVar.zzd(32);
        int i2 = zzfn.zza;
        this.zzj = ((zzd3 & 4294967295L) << 32) | (zzd4 & 4294967295L);
        this.zzk = null;
        this.zzl = null;
    }

    private static int zzh(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        return i != 24 ? -1 : 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    private static int zzi(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long zza() {
        long j = this.zzj;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.zze;
    }

    public final long zzb(long j) {
        return Math.max(0L, Math.min((j * this.zze) / 1000000, this.zzj - 1));
    }

    public final zzam zzc(byte[] bArr, @Nullable zzca zzcaVar) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.zzd;
        if (i <= 0) {
            i = -1;
        }
        zzca zzd = zzd(zzcaVar);
        zzak zzakVar = new zzak();
        zzakVar.zzS("audio/flac");
        zzakVar.zzL(i);
        zzakVar.zzw(this.zzg);
        zzakVar.zzT(this.zze);
        zzakVar.zzI(Collections.singletonList(bArr));
        zzakVar.zzM(zzd);
        return zzakVar.zzY();
    }

    @Nullable
    public final zzca zzd(@Nullable zzca zzcaVar) {
        zzca zzcaVar2 = this.zzl;
        return zzcaVar2 == null ? zzcaVar : zzcaVar2.zzd(zzcaVar);
    }

    public final zzabb zze(List list) {
        return new zzabb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(new zzca(list)));
    }

    public final zzabb zzf(@Nullable zzaba zzabaVar) {
        return new zzabb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, zzabaVar, this.zzl);
    }

    public final zzabb zzg(List list) {
        return new zzabb(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzg, this.zzh, this.zzj, this.zzk, zzd(zzabx.zzb(list)));
    }
}
