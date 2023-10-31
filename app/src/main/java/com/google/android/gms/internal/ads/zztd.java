package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zztd implements zztj, zzti {
    public final zztl zza;
    private final long zzb;
    private zztn zzc;
    private zztj zzd;
    @Nullable
    private zzti zze;
    private long zzf = -9223372036854775807L;
    private final zzxm zzg;

    public zztd(zztl zztlVar, zzxm zzxmVar, long j) {
        this.zza = zztlVar;
        this.zzg = zzxmVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzf;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final long zza(long j, zzlh zzlhVar) {
        zztj zztjVar = this.zzd;
        int i = zzfn.zza;
        return zztjVar.zza(j, zzlhVar);
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final long zzb() {
        zztj zztjVar = this.zzd;
        int i = zzfn.zza;
        return zztjVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final long zzc() {
        zztj zztjVar = this.zzd;
        int i = zzfn.zza;
        return zztjVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final long zzd() {
        zztj zztjVar = this.zzd;
        int i = zzfn.zza;
        return zztjVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final long zze(long j) {
        zztj zztjVar = this.zzd;
        int i = zzfn.zza;
        return zztjVar.zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final long zzf(zzwx[] zzwxVarArr, boolean[] zArr, zzvc[] zzvcVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.zzf;
        if (j3 == -9223372036854775807L || j != this.zzb) {
            j2 = j;
        } else {
            this.zzf = -9223372036854775807L;
            j2 = j3;
        }
        zztj zztjVar = this.zzd;
        int i = zzfn.zza;
        return zztjVar.zzf(zzwxVarArr, zArr, zzvcVarArr, zArr2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzvd
    public final /* bridge */ /* synthetic */ void zzg(zzve zzveVar) {
        zztj zztjVar = (zztj) zzveVar;
        zzti zztiVar = this.zze;
        int i = zzfn.zza;
        zztiVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final zzvk zzh() {
        zztj zztjVar = this.zzd;
        int i = zzfn.zza;
        return zztjVar.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzti
    public final void zzi(zztj zztjVar) {
        zzti zztiVar = this.zze;
        int i = zzfn.zza;
        zztiVar.zzi(this);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void zzj(long j, boolean z) {
        zztj zztjVar = this.zzd;
        int i = zzfn.zza;
        zztjVar.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void zzk() throws IOException {
        try {
            zztj zztjVar = this.zzd;
            if (zztjVar != null) {
                zztjVar.zzk();
                return;
            }
            zztn zztnVar = this.zzc;
            if (zztnVar != null) {
                zztnVar.zzy();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj
    public final void zzl(zzti zztiVar, long j) {
        this.zze = zztiVar;
        zztj zztjVar = this.zzd;
        if (zztjVar != null) {
            zztjVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final void zzm(long j) {
        zztj zztjVar = this.zzd;
        int i = zzfn.zza;
        zztjVar.zzm(j);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final boolean zzo(long j) {
        zztj zztjVar = this.zzd;
        return zztjVar != null && zztjVar.zzo(j);
    }

    @Override // com.google.android.gms.internal.ads.zztj, com.google.android.gms.internal.ads.zzve
    public final boolean zzp() {
        zztj zztjVar = this.zzd;
        return zztjVar != null && zztjVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zztl zztlVar) {
        long zzv = zzv(this.zzb);
        zztn zztnVar = this.zzc;
        zztnVar.getClass();
        zztj zzH = zztnVar.zzH(zztlVar, this.zzg, zzv);
        this.zzd = zzH;
        if (this.zze != null) {
            zzH.zzl(this, zzv);
        }
    }

    public final void zzs(long j) {
        this.zzf = j;
    }

    public final void zzt() {
        zztj zztjVar = this.zzd;
        if (zztjVar != null) {
            zztn zztnVar = this.zzc;
            zztnVar.getClass();
            zztnVar.zzF(zztjVar);
        }
    }

    public final void zzu(zztn zztnVar) {
        zzdy.zzf(this.zzc == null);
        this.zzc = zztnVar;
    }
}
