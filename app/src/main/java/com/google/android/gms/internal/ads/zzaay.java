package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaay {
    @Nullable
    public static zzca zza(zzaap zzaapVar, boolean z) throws IOException {
        zzca zza = new zzabf().zza(zzaapVar, z ? null : zzaee.zza);
        if (zza == null || zza.zza() == 0) {
            return null;
        }
        return zza;
    }

    public static zzaba zzb(zzfd zzfdVar) {
        zzfdVar.zzG(1);
        int zzm = zzfdVar.zzm();
        long zzc = zzfdVar.zzc();
        long j = zzm;
        int i = zzm / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long zzr = zzfdVar.zzr();
            if (zzr == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = zzr;
            jArr2[i2] = zzfdVar.zzr();
            zzfdVar.zzG(2);
            i2++;
        }
        zzfdVar.zzG((int) ((zzc + j) - zzfdVar.zzc()));
        return new zzaba(jArr, jArr2);
    }
}
