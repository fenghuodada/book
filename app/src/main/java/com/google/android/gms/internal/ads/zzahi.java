package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
final class zzahi extends zzahs {
    @Nullable
    private zzabb zza;
    @Nullable
    private zzahh zzb;

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final long zza(zzfd zzfdVar) {
        if (zzd(zzfdVar.zzH())) {
            int i = (zzfdVar.zzH()[2] & 255) >> 4;
            if (i != 6) {
                if (i == 7) {
                    i = 7;
                }
                int zza = zzaax.zza(zzfdVar, i);
                zzfdVar.zzF(0);
                return zza;
            }
            zzfdVar.zzG(4);
            zzfdVar.zzu();
            int zza2 = zzaax.zza(zzfdVar, i);
            zzfdVar.zzF(0);
            return zza2;
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzfd zzfdVar, long j, zzahp zzahpVar) {
        byte[] zzH = zzfdVar.zzH();
        zzabb zzabbVar = this.zza;
        if (zzabbVar == null) {
            zzabb zzabbVar2 = new zzabb(zzH, 17);
            this.zza = zzabbVar2;
            zzahpVar.zza = zzabbVar2.zzc(Arrays.copyOfRange(zzH, 9, zzfdVar.zzd()), null);
            return true;
        } else if ((zzH[0] & Byte.MAX_VALUE) == 3) {
            zzaba zzb = zzaay.zzb(zzfdVar);
            zzabb zzf = zzabbVar.zzf(zzb);
            this.zza = zzf;
            this.zzb = new zzahh(zzf, zzb);
            return true;
        } else if (zzd(zzH)) {
            zzahh zzahhVar = this.zzb;
            if (zzahhVar != null) {
                zzahhVar.zza(j);
                zzahpVar.zzb = this.zzb;
            }
            zzahpVar.zza.getClass();
            return false;
        } else {
            return true;
        }
    }
}
