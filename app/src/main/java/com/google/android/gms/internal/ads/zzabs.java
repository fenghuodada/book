package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzabs {
    private final byte[] zza = new byte[10];
    private boolean zzb;
    private int zzc;
    private long zzd;
    private int zze;
    private int zzf;
    private int zzg;

    public final void zza(zzabr zzabrVar, @Nullable zzabq zzabqVar) {
        if (this.zzc > 0) {
            zzabrVar.zzs(this.zzd, this.zze, this.zzf, this.zzg, zzabqVar);
            this.zzc = 0;
        }
    }

    public final void zzb() {
        this.zzb = false;
        this.zzc = 0;
    }

    public final void zzc(zzabr zzabrVar, long j, int i, int i2, int i3, @Nullable zzabq zzabqVar) {
        if (this.zzg > i2 + i3) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.zzb) {
            int i4 = this.zzc;
            int i5 = i4 + 1;
            this.zzc = i5;
            if (i4 == 0) {
                this.zzd = j;
                this.zze = i;
                this.zzf = 0;
            }
            this.zzf += i2;
            this.zzg = i3;
            if (i5 >= 16) {
                zza(zzabrVar, zzabqVar);
            }
        }
    }

    public final void zzd(zzaap zzaapVar) throws IOException {
        if (this.zzb) {
            return;
        }
        zzaapVar.zzh(this.zza, 0, 10);
        zzaapVar.zzj();
        byte[] bArr = this.zza;
        int i = zzzp.zza;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.zzb = true;
        }
    }
}
