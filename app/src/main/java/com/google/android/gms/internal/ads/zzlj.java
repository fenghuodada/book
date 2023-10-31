package com.google.android.gms.internal.ads;

import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

@Deprecated
/* loaded from: classes.dex */
public final class zzlj extends zzm implements zzil {
    private final zzjt zzb;
    private final zzeb zzc;

    public zzlj(zzik zzikVar) {
        zzeb zzebVar = new zzeb(zzdz.zza);
        this.zzc = zzebVar;
        try {
            this.zzb = new zzjt(zzikVar, this);
            zzebVar.zze();
        } catch (Throwable th) {
            this.zzc.zze();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzil
    public final void zzA(zzlv zzlvVar) {
        this.zzc.zzb();
        this.zzb.zzA(zzlvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzil
    public final void zzB(zztn zztnVar) {
        this.zzc.zzb();
        this.zzb.zzB(zztnVar);
    }

    @Nullable
    public final zzia zzC() {
        this.zzc.zzb();
        return this.zzb.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzm
    @VisibleForTesting(otherwise = 4)
    public final void zza(int i, long j, int i2, boolean z) {
        this.zzc.zzb();
        this.zzb.zza(i, j, 5, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final int zzb() {
        this.zzc.zzb();
        return this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final int zzc() {
        this.zzc.zzb();
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final int zzd() {
        this.zzc.zzb();
        return this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final int zze() {
        this.zzc.zzb();
        return this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final int zzf() {
        this.zzc.zzb();
        return this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final int zzg() {
        this.zzc.zzb();
        return this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final int zzh() {
        this.zzc.zzb();
        this.zzb.zzh();
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final long zzi() {
        this.zzc.zzb();
        return this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final long zzj() {
        this.zzc.zzb();
        return this.zzb.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final long zzk() {
        this.zzc.zzb();
        return this.zzb.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final long zzl() {
        this.zzc.zzb();
        return this.zzb.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final long zzm() {
        this.zzc.zzb();
        return this.zzb.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzcx zzn() {
        this.zzc.zzb();
        return this.zzb.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final zzdi zzo() {
        this.zzc.zzb();
        return this.zzb.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzp() {
        this.zzc.zzb();
        this.zzb.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzq() {
        this.zzc.zzb();
        this.zzb.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzr(boolean z) {
        this.zzc.zzb();
        this.zzb.zzr(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzs(@Nullable Surface surface) {
        this.zzc.zzb();
        this.zzb.zzs(surface);
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzt(float f) {
        this.zzc.zzb();
        this.zzb.zzt(f);
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final void zzu() {
        this.zzc.zzb();
        this.zzb.zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final boolean zzv() {
        this.zzc.zzb();
        return this.zzb.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final boolean zzw() {
        this.zzc.zzb();
        this.zzb.zzw();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcq
    public final boolean zzx() {
        this.zzc.zzb();
        return this.zzb.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzil
    public final int zzy() {
        this.zzc.zzb();
        this.zzb.zzy();
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzil
    public final void zzz(zzlv zzlvVar) {
        this.zzc.zzb();
        this.zzb.zzz(zzlvVar);
    }
}
