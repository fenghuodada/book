package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzaiu implements zzaih {
    @Nullable
    private final String zza;
    private final zzfd zzb;
    private final zzfc zzc;
    private zzabr zzd;
    private String zze;
    private zzam zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private boolean zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private long zzq;
    private int zzr;
    private long zzs;
    private int zzt;
    @Nullable
    private String zzu;

    public zzaiu(@Nullable String str) {
        this.zza = str;
        zzfd zzfdVar = new zzfd(1024);
        this.zzb = zzfdVar;
        byte[] zzH = zzfdVar.zzH();
        this.zzc = new zzfc(zzH, zzH.length);
        this.zzk = -9223372036854775807L;
    }

    private final int zzf(zzfc zzfcVar) throws zzce {
        int zza = zzfcVar.zza();
        zzzl zzb = zzzm.zzb(zzfcVar, true);
        this.zzu = zzb.zzc;
        this.zzr = zzb.zza;
        this.zzt = zzb.zzb;
        return zza - zzfcVar.zza();
    }

    private static long zzg(zzfc zzfcVar) {
        return zzfcVar.zzd((zzfcVar.zzd(2) + 1) * 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0154, code lost:
        if (r14.zzl == false) goto L26;
     */
    @Override // com.google.android.gms.internal.ads.zzaih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfd r15) throws com.google.android.gms.internal.ads.zzce {
        /*
            Method dump skipped, instructions count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiu.zza(com.google.android.gms.internal.ads.zzfd):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzb(zzaar zzaarVar, zzajt zzajtVar) {
        zzajtVar.zzc();
        this.zzd = zzaarVar.zzv(zzajtVar.zza(), 1);
        this.zze = zzajtVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zze() {
        this.zzg = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = false;
    }
}
