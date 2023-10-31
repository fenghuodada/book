package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zztz implements zztj, zzti {
    private final zztj zza;
    private final long zzb;
    private zzti zzc;

    public zztz(zztj zztjVar, long j) {
        this.zza = zztjVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final long zza(long j, zzlh zzlhVar) {
        return this.zza.zza(j - this.zzb, zzlhVar) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final long zze(long j) {
        return this.zza.zze(j - this.zzb) + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final long zzf(zzwx[] zzwxVarArr, boolean[] zArr, zzvc[] zzvcVarArr, boolean[] zArr2, long j) {
        zzvc[] zzvcVarArr2 = new zzvc[zzvcVarArr.length];
        int i = 0;
        while (true) {
            zzvc zzvcVar = null;
            if (i >= zzvcVarArr.length) {
                break;
            }
            zzua zzuaVar = (zzua) zzvcVarArr[i];
            if (zzuaVar != null) {
                zzvcVar = zzuaVar.zzc();
            }
            zzvcVarArr2[i] = zzvcVar;
            i++;
        }
        long zzf = this.zza.zzf(zzwxVarArr, zArr, zzvcVarArr2, zArr2, j - this.zzb);
        for (int i2 = 0; i2 < zzvcVarArr.length; i2++) {
            zzvc zzvcVar2 = zzvcVarArr2[i2];
            if (zzvcVar2 == null) {
                zzvcVarArr[i2] = null;
            } else {
                zzvc zzvcVar3 = zzvcVarArr[i2];
                if (zzvcVar3 == null || ((zzua) zzvcVar3).zzc() != zzvcVar2) {
                    zzvcVarArr[i2] = new zzua(zzvcVar2, this.zzb);
                }
            }
        }
        return zzf + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final /* bridge */ /* synthetic */ void zzg(zzve zzveVar) {
        zztj zztjVar = (zztj) zzveVar;
        zzti zztiVar = this.zzc;
        zztiVar.getClass();
        zztiVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final zzvk zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzti
    public final void zzi(zztj zztjVar) {
        zzti zztiVar = this.zzc;
        zztiVar.getClass();
        zztiVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void zzl(zzti zztiVar, long j) {
        this.zzc = zztiVar;
        this.zza.zzl(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final boolean zzo(long j) {
        return this.zza.zzo(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final boolean zzp() {
        return this.zza.zzp();
    }
}
