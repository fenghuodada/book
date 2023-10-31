package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfck {
    private final long zza;
    private long zzc;
    private final zzfcj zzb = new zzfcj();
    private int zzd = 0;
    private int zze = 0;
    private int zzf = 0;

    public zzfck() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        this.zza = currentTimeMillis;
        this.zzc = currentTimeMillis;
    }

    public final int zza() {
        return this.zzd;
    }

    public final long zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final zzfcj zzd() {
        zzfcj clone = this.zzb.clone();
        zzfcj zzfcjVar = this.zzb;
        zzfcjVar.zza = false;
        zzfcjVar.zzb = 0;
        return clone;
    }

    public final String zze() {
        return "Created: " + this.zza + " Last accessed: " + this.zzc + " Accesses: " + this.zzd + "\nEntries retrieved: Valid: " + this.zze + " Stale: " + this.zzf;
    }

    public final void zzf() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        this.zzd++;
    }

    public final void zzg() {
        this.zzf++;
        this.zzb.zzb++;
    }

    public final void zzh() {
        this.zze++;
        this.zzb.zza = true;
    }
}
