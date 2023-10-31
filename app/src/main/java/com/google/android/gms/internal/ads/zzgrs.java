package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
final class zzgrs extends zzgrq {
    @Override // com.google.android.gms.internal.ads.zzgrq
    public final /* synthetic */ int zza(Object obj) {
        return ((zzgrr) obj).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final /* synthetic */ int zzb(Object obj) {
        return ((zzgrr) obj).zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzgow zzgowVar = (zzgow) obj;
        zzgrr zzgrrVar = zzgowVar.zzc;
        if (zzgrrVar == zzgrr.zzc()) {
            zzgrr zzf = zzgrr.zzf();
            zzgowVar.zzc = zzf;
            return zzf;
        }
        return zzgrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final /* synthetic */ Object zzd(Object obj) {
        return ((zzgow) obj).zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (zzgrr.zzc().equals(obj2)) {
            return obj;
        }
        zzgrr zzgrrVar = (zzgrr) obj2;
        if (zzgrr.zzc().equals(obj)) {
            return zzgrr.zze((zzgrr) obj, zzgrrVar);
        }
        ((zzgrr) obj).zzd(zzgrrVar);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final /* synthetic */ Object zzf() {
        return zzgrr.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final /* synthetic */ Object zzg(Object obj) {
        ((zzgrr) obj).zzh();
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i, int i2) {
        ((zzgrr) obj).zzj((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final /* bridge */ /* synthetic */ void zzi(Object obj, int i, long j) {
        ((zzgrr) obj).zzj((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final /* bridge */ /* synthetic */ void zzj(Object obj, int i, Object obj2) {
        ((zzgrr) obj).zzj((i << 3) | 3, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i, zzgno zzgnoVar) {
        ((zzgrr) obj).zzj((i << 3) | 2, zzgnoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final /* bridge */ /* synthetic */ void zzl(Object obj, int i, long j) {
        ((zzgrr) obj).zzj(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final void zzm(Object obj) {
        ((zzgow) obj).zzc.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzgow) obj).zzc = (zzgrr) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzgow) obj).zzc = (zzgrr) obj2;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final boolean zzq(zzgqr zzgqrVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgrq
    public final /* synthetic */ void zzr(Object obj, zzgoe zzgoeVar) throws IOException {
        ((zzgrr) obj).zzk(zzgoeVar);
    }
}
