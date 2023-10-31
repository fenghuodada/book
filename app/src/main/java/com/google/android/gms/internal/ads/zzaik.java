package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzaik {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];
    private boolean zze;
    private int zzf;

    public zzaik(int i) {
    }

    public final void zza(byte[] bArr, int i, int i2) {
        if (this.zze) {
            int i3 = i2 - i;
            byte[] bArr2 = this.zzc;
            int length = bArr2.length;
            int i4 = this.zza + i3;
            if (length < i4) {
                this.zzc = Arrays.copyOf(bArr2, i4 + i4);
            }
            System.arraycopy(bArr, i, this.zzc, this.zza, i3);
            this.zza += i3;
        }
    }

    public final void zzb() {
        this.zze = false;
        this.zza = 0;
        this.zzf = 0;
    }

    public final boolean zzc(int i, int i2) {
        int i3 = this.zzf;
        if (i3 != 0) {
            if (i3 == 1) {
                if (i == 181) {
                    this.zzf = 2;
                }
                zzer.zze("H263Reader", "Unexpected start code value");
                zzb();
            } else if (i3 == 2) {
                if (i <= 31) {
                    this.zzf = 3;
                }
                zzer.zze("H263Reader", "Unexpected start code value");
                zzb();
            } else if (i3 == 3) {
                if ((i & 240) == 32) {
                    this.zzb = this.zza;
                    this.zzf = 4;
                }
                zzer.zze("H263Reader", "Unexpected start code value");
                zzb();
            } else if (i == 179 || i == 181) {
                this.zza -= i2;
                this.zze = false;
                return true;
            }
        } else if (i == 176) {
            this.zzf = 1;
            this.zze = true;
        }
        zza(zzd, 0, 3);
        return false;
    }
}
