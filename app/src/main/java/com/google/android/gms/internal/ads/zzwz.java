package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzwz {
    private final String[] zza;
    private final int[] zzb;
    private final zzvk[] zzc;
    private final int[] zzd;
    private final int[][][] zze;
    private final zzvk zzf;

    @VisibleForTesting
    public zzwz(String[] strArr, int[] iArr, zzvk[] zzvkVarArr, int[] iArr2, int[][][] iArr3, zzvk zzvkVar) {
        this.zza = strArr;
        this.zzb = iArr;
        this.zzc = zzvkVarArr;
        this.zze = iArr3;
        this.zzd = iArr2;
        this.zzf = zzvkVar;
    }

    public final int zza(int i, int i2, boolean z) {
        int i3 = this.zzc[i].zzb(i2).zzb;
        int[] iArr = new int[1];
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 <= 0; i6++) {
            if ((this.zze[i][i2][i6] & 7) == 4) {
                iArr[i5] = i6;
                i5++;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, i5);
        String str = null;
        int i7 = 16;
        boolean z2 = false;
        int i8 = 0;
        while (i4 < copyOf.length) {
            String str2 = this.zzc[i].zzb(i2).zzb(copyOf[i4]).zzm;
            int i9 = i8 + 1;
            if (i8 == 0) {
                str = str2;
            } else {
                z2 |= !zzfn.zzB(str, str2);
            }
            i7 = Math.min(i7, this.zze[i][i2][i4] & 24);
            i4++;
            i8 = i9;
        }
        return z2 ? Math.min(i7, this.zzd[i]) : i7;
    }

    public final int zzb(int i, int i2, int i3) {
        return this.zze[i][i2][i3];
    }

    public final int zzc(int i) {
        return this.zzb[i];
    }

    public final zzvk zzd(int i) {
        return this.zzc[i];
    }

    public final zzvk zze() {
        return this.zzf;
    }
}
