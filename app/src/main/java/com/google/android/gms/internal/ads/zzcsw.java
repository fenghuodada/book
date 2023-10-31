package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class zzcsw implements zzcww, com.google.android.gms.ads.internal.client.zza, zzcyd, zzcwc, zzcvi, zzdap {
    private final Clock zza;
    private final zzbyv zzb;

    public zzcsw(Clock clock, zzbyv zzbyvVar) {
        this.zza = clock;
        this.zzb = zzbyvVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.zzb.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzb(zzezr zzezrVar) {
        this.zzb.zzk(this.zza.elapsedRealtime());
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzbA(zzbug zzbugVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzbr() {
    }

    public final String zzc() {
        return this.zzb.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zze(zzaxs zzaxsVar) {
        this.zzb.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzf(zzaxs zzaxsVar) {
    }

    public final void zzg(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zzb.zzj(zzlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzh(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzi(zzaxs zzaxsVar) {
        this.zzb.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzj() {
        this.zzb.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzdap
    public final void zzk(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzl() {
        this.zzb.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzcww
    public final void zzn() {
        this.zzb.zzh(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzo() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzp(zzbuw zzbuwVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcvi
    public final void zzq() {
    }
}
