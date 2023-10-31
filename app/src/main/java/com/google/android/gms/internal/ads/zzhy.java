package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzhy implements zzkh {
    private final zzlk zza;
    private final zzhx zzb;
    @Nullable
    private zzle zzc;
    @Nullable
    private zzkh zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzhy(zzhx zzhxVar, zzdz zzdzVar) {
        this.zzb = zzhxVar;
        this.zza = new zzlk(zzdzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final long zza() {
        throw null;
    }

    public final long zzb(boolean z) {
        zzle zzleVar = this.zzc;
        if (zzleVar == null || zzleVar.zzO() || (!this.zzc.zzP() && (z || this.zzc.zzI()))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzkh zzkhVar = this.zzd;
            zzkhVar.getClass();
            long zza = zzkhVar.zza();
            if (this.zze) {
                if (zza < this.zza.zza()) {
                    this.zza.zze();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zzd();
                    }
                }
            }
            this.zza.zzb(zza);
            zzci zzc = zzkhVar.zzc();
            if (!zzc.equals(this.zza.zzc())) {
                this.zza.zzg(zzc);
                this.zzb.zza(zzc);
            }
        }
        if (this.zze) {
            return this.zza.zza();
        }
        zzkh zzkhVar2 = this.zzd;
        zzkhVar2.getClass();
        return zzkhVar2.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final zzci zzc() {
        zzkh zzkhVar = this.zzd;
        return zzkhVar != null ? zzkhVar.zzc() : this.zza.zzc();
    }

    public final void zzd(zzle zzleVar) {
        if (zzleVar == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzle zzleVar) throws zzia {
        zzkh zzkhVar;
        zzkh zzi = zzleVar.zzi();
        if (zzi == null || zzi == (zzkhVar = this.zzd)) {
            return;
        }
        if (zzkhVar != null) {
            throw zzia.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.zzd = zzi;
        this.zzc = zzleVar;
        zzi.zzg(this.zza.zzc());
    }

    public final void zzf(long j) {
        this.zza.zzb(j);
    }

    @Override // com.google.android.gms.internal.ads.zzkh
    public final void zzg(zzci zzciVar) {
        zzkh zzkhVar = this.zzd;
        if (zzkhVar != null) {
            zzkhVar.zzg(zzciVar);
            zzciVar = this.zzd.zzc();
        }
        this.zza.zzg(zzciVar);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }
}
