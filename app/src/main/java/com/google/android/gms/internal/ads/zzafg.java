package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
final class zzafg implements zzafi {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzafp zzc = new zzafp();
    private zzafh zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzaap zzaapVar, int i) throws IOException {
        ((zzaae) zzaapVar).zzn(this.zza, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.zza[i2] & 255);
        }
        return j;
    }

    @Override // com.google.android.gms.internal.ads.zzafi
    public final void zza(zzafh zzafhVar) {
        this.zzd = zzafhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafi
    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
        if (r0 == 1) goto L39;
     */
    @Override // com.google.android.gms.internal.ads.zzafi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzaap r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafg.zzc(com.google.android.gms.internal.ads.zzaap):boolean");
    }
}
