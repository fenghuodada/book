package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* loaded from: classes.dex */
final class zzaho extends zzahs {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    public static boolean zzd(zzfd zzfdVar) {
        return zzk(zzfdVar, zza);
    }

    private static boolean zzk(zzfd zzfdVar, byte[] bArr) {
        if (zzfdVar.zza() < 8) {
            return false;
        }
        int zzc = zzfdVar.zzc();
        byte[] bArr2 = new byte[8];
        zzfdVar.zzB(bArr2, 0, 8);
        zzfdVar.zzF(zzc);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final long zza(zzfd zzfdVar) {
        return zzg(zzabj.zzc(zzfdVar.zzH()));
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    public final void zzb(boolean z) {
        super.zzb(z);
        if (z) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzahs
    @EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    public final boolean zzc(zzfd zzfdVar, long j, zzahp zzahpVar) throws zzce {
        zzam zzY;
        if (zzk(zzfdVar, zza)) {
            byte[] copyOf = Arrays.copyOf(zzfdVar.zzH(), zzfdVar.zzd());
            int i = copyOf[9] & 255;
            List zzd = zzabj.zzd(copyOf);
            if (zzahpVar.zza != null) {
                return true;
            }
            zzak zzakVar = new zzak();
            zzakVar.zzS("audio/opus");
            zzakVar.zzw(i);
            zzakVar.zzT(48000);
            zzakVar.zzI(zzd);
            zzY = zzakVar.zzY();
        } else if (!zzk(zzfdVar, zzb)) {
            zzdy.zzb(zzahpVar.zza);
            return false;
        } else {
            zzdy.zzb(zzahpVar.zza);
            if (this.zzc) {
                return true;
            }
            this.zzc = true;
            zzfdVar.zzG(8);
            zzca zzb2 = zzabx.zzb(zzfrr.zzk(zzabx.zzc(zzfdVar, false, false).zzb));
            if (zzb2 == null) {
                return true;
            }
            zzak zzb3 = zzahpVar.zza.zzb();
            zzb3.zzM(zzb2.zzd(zzahpVar.zza.zzk));
            zzY = zzb3.zzY();
        }
        zzahpVar.zza = zzY;
        return true;
    }
}
