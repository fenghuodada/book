package com.google.android.gms.internal.ads;

import androidx.datastore.preferences.protobuf.C1169e;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes.dex */
final class zzajy implements zzajz {
    private static final int[] zza = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    private static final int[] zzb = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, StatusLine.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    private final zzaar zzc;
    private final zzabr zzd;
    private final zzakc zze;
    private final int zzf;
    private final byte[] zzg;
    private final zzfd zzh;
    private final int zzi;
    private final zzam zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private long zzn;

    public zzajy(zzaar zzaarVar, zzabr zzabrVar, zzakc zzakcVar) throws zzce {
        this.zzc = zzaarVar;
        this.zzd = zzabrVar;
        this.zze = zzakcVar;
        int max = Math.max(1, zzakcVar.zzc / 10);
        this.zzi = max;
        zzfd zzfdVar = new zzfd(zzakcVar.zzf);
        zzfdVar.zzi();
        int zzi = zzfdVar.zzi();
        this.zzf = zzi;
        int i = zzakcVar.zzb;
        int i2 = zzakcVar.zzd;
        int m11131a = C1169e.m11131a(i2 - (i * 4), 8, zzakcVar.zze * i, 1);
        if (zzi == m11131a) {
            int i3 = zzfn.zza;
            int i4 = ((max + zzi) - 1) / zzi;
            this.zzg = new byte[i2 * i4];
            this.zzh = new zzfd((zzi + zzi) * i * i4);
            int i5 = ((zzakcVar.zzc * zzakcVar.zzd) * 8) / zzi;
            zzak zzakVar = new zzak();
            zzakVar.zzS("audio/raw");
            zzakVar.zzv(i5);
            zzakVar.zzO(i5);
            zzakVar.zzL((max + max) * i);
            zzakVar.zzw(zzakcVar.zzb);
            zzakVar.zzT(zzakcVar.zzc);
            zzakVar.zzN(2);
            this.zzj = zzakVar.zzY();
            return;
        }
        throw zzce.zza("Expected frames per block: " + m11131a + "; got: " + zzi, null);
    }

    private final int zzd(int i) {
        int i2 = this.zze.zzb;
        return i / (i2 + i2);
    }

    private final int zze(int i) {
        return (i + i) * this.zze.zzb;
    }

    private final void zzf(int i) {
        long zzp = this.zzl + zzfn.zzp(this.zzn, 1000000L, this.zze.zzc);
        int zze = zze(i);
        this.zzd.zzs(zzp, 1, zze, this.zzm - zze, null);
        this.zzn += i;
        this.zzm -= zze;
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final void zza(int i, long j) {
        this.zzc.zzN(new zzakf(this.zze, this.zzf, i, j));
        this.zzd.zzk(this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzajz
    public final void zzb(long j) {
        this.zzk = 0;
        this.zzl = j;
        this.zzm = 0;
        this.zzn = 0L;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003b -> B:4:0x0020). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzajz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzaap r21, long r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajy.zzc(com.google.android.gms.internal.ads.zzaap, long):boolean");
    }
}
