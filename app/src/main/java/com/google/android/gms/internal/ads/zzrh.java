package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class zzrh {
    private long zza;
    private long zzb;
    private boolean zzc;

    private final long zzd(long j) {
        return Math.max(0L, ((this.zzb - 529) * 1000000) / j) + this.zza;
    }

    public final long zza(zzam zzamVar) {
        return zzd(zzamVar.zzA);
    }

    public final long zzb(zzam zzamVar, zzhi zzhiVar) {
        if (this.zzb == 0) {
            this.zza = zzhiVar.zzd;
        }
        if (this.zzc) {
            return zzhiVar.zzd;
        }
        ByteBuffer byteBuffer = zzhiVar.zzb;
        byteBuffer.getClass();
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int zzc = zzabi.zzc(i);
        if (zzc != -1) {
            long zzd = zzd(zzamVar.zzA);
            this.zzb += zzc;
            return zzd;
        }
        this.zzc = true;
        this.zzb = 0L;
        this.zza = zzhiVar.zzd;
        zzer.zze("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
        return zzhiVar.zzd;
    }

    public final void zzc() {
        this.zza = 0L;
        this.zzb = 0L;
        this.zzc = false;
    }
}
