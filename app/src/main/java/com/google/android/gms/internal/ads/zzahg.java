package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzahg implements zzahn {
    private final zzahm zza;
    private final long zzb;
    private final long zzc;
    private final zzahs zzd;
    private int zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    public zzahg(zzahs zzahsVar, long j, long j2, long j3, long j4, boolean z) {
        zzdy.zzd(j >= 0 && j2 > j);
        this.zzd = zzahsVar;
        this.zzb = j;
        this.zzc = j2;
        if (j3 == j2 - j || z) {
            this.zzf = j4;
            this.zze = 4;
        } else {
            this.zze = 0;
        }
        this.zza = new zzahm();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    @Override // com.google.android.gms.internal.ads.zzahn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long zzd(com.google.android.gms.internal.ads.zzaap r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahg.zzd(com.google.android.gms.internal.ads.zzaap):long");
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    @Nullable
    public final /* bridge */ /* synthetic */ zzabn zze() {
        if (this.zzf != 0) {
            return new zzahf(this, null);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzahn
    public final void zzg(long j) {
        this.zzh = Math.max(0L, Math.min(j, this.zzf - 1));
        this.zze = 2;
        this.zzi = this.zzb;
        this.zzj = this.zzc;
        this.zzk = 0L;
        this.zzl = this.zzf;
    }
}
