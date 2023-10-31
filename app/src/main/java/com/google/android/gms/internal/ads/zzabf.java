package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzabf {
    private final zzfd zza = new zzfd(10);

    @Nullable
    public final zzca zza(zzaap zzaapVar, @Nullable zzaec zzaecVar) throws IOException {
        zzca zzcaVar = null;
        int i = 0;
        while (true) {
            try {
                ((zzaae) zzaapVar).zzm(this.zza.zzH(), 0, 10, false);
                this.zza.zzF(0);
                if (this.zza.zzm() != 4801587) {
                    break;
                }
                this.zza.zzG(3);
                int zzj = this.zza.zzj();
                int i2 = zzj + 10;
                if (zzcaVar == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.zza.zzH(), 0, bArr, 0, 10);
                    ((zzaae) zzaapVar).zzm(bArr, 10, zzj, false);
                    zzcaVar = zzaee.zza(bArr, i2, zzaecVar, new zzadf());
                } else {
                    ((zzaae) zzaapVar).zzl(zzj, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        zzaapVar.zzj();
        ((zzaae) zzaapVar).zzl(i, false);
        return zzcaVar;
    }
}
