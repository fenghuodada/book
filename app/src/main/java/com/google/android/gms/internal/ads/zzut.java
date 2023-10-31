package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzut extends zzsm implements zzuk {
    private final zzbq zza;
    private final zzbi zzb;
    private final zzfw zzc;
    private final zzqr zzd;
    private final int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;
    @Nullable
    private zzgz zzj;
    private final zzuq zzk;
    private final zzxq zzl;

    public /* synthetic */ zzut(zzbq zzbqVar, zzfw zzfwVar, zzuq zzuqVar, zzqr zzqrVar, zzxq zzxqVar, int i, zzus zzusVar) {
        zzbi zzbiVar = zzbqVar.zzd;
        zzbiVar.getClass();
        this.zzb = zzbiVar;
        this.zza = zzbqVar;
        this.zzc = zzfwVar;
        this.zzk = zzuqVar;
        this.zzd = zzqrVar;
        this.zzl = zzxqVar;
        this.zze = i;
        this.zzf = true;
        this.zzg = -9223372036854775807L;
    }

    private final void zzv() {
        long j = this.zzg;
        boolean z = this.zzh;
        boolean z2 = this.zzi;
        zzbq zzbqVar = this.zza;
        zzvg zzvgVar = new zzvg(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, zzbqVar, z2 ? zzbqVar.zzf : null);
        zzo(this.zzf ? new zzup(this, zzvgVar) : zzvgVar);
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzF(zztj zztjVar) {
        ((zzuo) zztjVar).zzM();
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final zztj zzH(zztl zztlVar, zzxm zzxmVar, long j) {
        zzfx zza = this.zzc.zza();
        zzgz zzgzVar = this.zzj;
        if (zzgzVar != null) {
            zza.zzf(zzgzVar);
        }
        Uri uri = this.zzb.zza;
        zzuq zzuqVar = this.zzk;
        zzb();
        return new zzuo(uri, zza, new zzso(zzuqVar.zza), this.zzd, zzc(zztlVar), this.zzl, zze(zztlVar), this, zzxmVar, null, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final zzbq zzI() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zza(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.zzg;
        }
        if (!this.zzf && this.zzg == j && this.zzh == z && this.zzi == z2) {
            return;
        }
        this.zzg = j;
        this.zzh = z;
        this.zzi = z2;
        this.zzf = false;
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    public final void zzn(@Nullable zzgz zzgzVar) {
        this.zzj = zzgzVar;
        Looper.myLooper().getClass();
        zzb();
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzsm
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zztn
    public final void zzy() {
    }
}
