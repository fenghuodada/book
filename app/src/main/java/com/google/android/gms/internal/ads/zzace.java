package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzace implements zzaao {
    private int zzc;
    private zzacf zze;
    private long zzh;
    @Nullable
    private zzach zzi;
    private int zzm;
    private boolean zzn;
    private final zzfd zza = new zzfd(12);
    private final zzacd zzb = new zzacd(null);
    private zzaar zzd = new zzaam();
    private zzach[] zzg = new zzach[0];
    private long zzk = -1;
    private long zzl = -1;
    private int zzj = -1;
    private long zzf = -9223372036854775807L;

    @Nullable
    private final zzach zzf(int i) {
        zzach[] zzachVarArr;
        for (zzach zzachVar : this.zzg) {
            if (zzachVar.zzg(i)) {
                return zzachVar;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // com.google.android.gms.internal.ads.zzaao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zza(com.google.android.gms.internal.ads.zzaap r23, com.google.android.gms.internal.ads.zzabk r24) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 955
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzace.zza(com.google.android.gms.internal.ads.zzaap, com.google.android.gms.internal.ads.zzabk):int");
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzb(zzaar zzaarVar) {
        this.zzc = 0;
        this.zzd = zzaarVar;
        this.zzh = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final void zzc(long j, long j2) {
        int i;
        this.zzh = -1L;
        this.zzi = null;
        for (zzach zzachVar : this.zzg) {
            zzachVar.zzf(j);
        }
        if (j != 0) {
            i = 6;
        } else if (this.zzg.length == 0) {
            this.zzc = 0;
            return;
        } else {
            i = 3;
        }
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaao
    public final boolean zzd(zzaap zzaapVar) throws IOException {
        ((zzaae) zzaapVar).zzm(this.zza.zzH(), 0, 12, false);
        this.zza.zzF(0);
        if (this.zza.zzg() != 1179011410) {
            return false;
        }
        this.zza.zzG(4);
        return this.zza.zzg() == 541677121;
    }
}
