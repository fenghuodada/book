package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzny {
    final /* synthetic */ zznz zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zztl zze;
    private boolean zzf;
    private boolean zzg;

    public zzny(zznz zznzVar, String str, @Nullable int i, zztl zztlVar) {
        this.zza = zznzVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zztlVar == null ? -1L : zztlVar.zzd;
        if (zztlVar == null || !zztlVar.zzb()) {
            return;
        }
        this.zze = zztlVar;
    }

    public final void zzg(int i, @Nullable zztl zztlVar) {
        if (this.zzd == -1 && i == this.zzc && zztlVar != null) {
            this.zzd = zztlVar.zzd;
        }
    }

    public final boolean zzj(int i, @Nullable zztl zztlVar) {
        if (zztlVar == null) {
            return i == this.zzc;
        }
        zztl zztlVar2 = this.zze;
        return zztlVar2 == null ? !zztlVar.zzb() && zztlVar.zzd == this.zzd : zztlVar.zzd == zztlVar2.zzd && zztlVar.zzb == zztlVar2.zzb && zztlVar.zzc == zztlVar2.zzc;
    }

    public final boolean zzk(zzlt zzltVar) {
        zztl zztlVar = zzltVar.zzd;
        if (zztlVar == null) {
            return this.zzc != zzltVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        if (zztlVar.zzd > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        int zza = zzltVar.zzb.zza(zztlVar.zza);
        int zza2 = zzltVar.zzb.zza(this.zze.zza);
        zztl zztlVar2 = zzltVar.zzd;
        if (zztlVar2.zzd < this.zze.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        boolean zzb = zztlVar2.zzb();
        zztl zztlVar3 = zzltVar.zzd;
        if (!zzb) {
            int i = zztlVar3.zze;
            return i == -1 || i > this.zze.zzb;
        }
        int i2 = zztlVar3.zzb;
        int i3 = zztlVar3.zzc;
        zztl zztlVar4 = this.zze;
        int i4 = zztlVar4.zzb;
        if (i2 <= i4) {
            return i2 == i4 && i3 > zztlVar4.zzc;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r8.zzc()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzl(com.google.android.gms.internal.ads.zzcx r7, com.google.android.gms.internal.ads.zzcx r8) {
        /*
            r6 = this;
            int r0 = r6.zzc
            int r1 = r7.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r7 = r8.zzc()
            if (r0 >= r7) goto L11
            goto L4a
        L11:
            r0 = r3
            goto L4a
        L13:
            com.google.android.gms.internal.ads.zznz r1 = r6.zza
            com.google.android.gms.internal.ads.zzcw r1 = com.google.android.gms.internal.ads.zznz.zzb(r1)
            r4 = 0
            r7.zze(r0, r1, r4)
            com.google.android.gms.internal.ads.zznz r0 = r6.zza
            com.google.android.gms.internal.ads.zzcw r0 = com.google.android.gms.internal.ads.zznz.zzb(r0)
            int r0 = r0.zzo
        L26:
            com.google.android.gms.internal.ads.zznz r1 = r6.zza
            com.google.android.gms.internal.ads.zzcw r1 = com.google.android.gms.internal.ads.zznz.zzb(r1)
            int r1 = r1.zzp
            if (r0 > r1) goto L11
            java.lang.Object r1 = r7.zzf(r0)
            int r1 = r8.zza(r1)
            if (r1 == r3) goto L47
            com.google.android.gms.internal.ads.zznz r7 = r6.zza
            com.google.android.gms.internal.ads.zzcu r7 = com.google.android.gms.internal.ads.zznz.zza(r7)
            com.google.android.gms.internal.ads.zzcu r7 = r8.zzd(r1, r7, r2)
            int r0 = r7.zzd
            goto L4a
        L47:
            int r0 = r0 + 1
            goto L26
        L4a:
            r6.zzc = r0
            if (r0 != r3) goto L4f
            return r2
        L4f:
            com.google.android.gms.internal.ads.zztl r7 = r6.zze
            r0 = 1
            if (r7 != 0) goto L55
            return r0
        L55:
            java.lang.Object r7 = r7.zza
            int r7 = r8.zza(r7)
            if (r7 == r3) goto L5e
            return r0
        L5e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzny.zzl(com.google.android.gms.internal.ads.zzcx, com.google.android.gms.internal.ads.zzcx):boolean");
    }
}
