package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzaij implements zzaih {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private String zzb;
    private zzabr zzc;
    @Nullable
    private final zzajw zzd;
    @Nullable
    private final zzfd zze;
    @Nullable
    private final zzaiw zzf;
    private final boolean[] zzg;
    private final zzaii zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzaij() {
        this(null);
    }

    public zzaij(@Nullable zzajw zzajwVar) {
        zzfd zzfdVar;
        this.zzd = zzajwVar;
        this.zzg = new boolean[4];
        this.zzh = new zzaii(128);
        if (zzajwVar != null) {
            this.zzf = new zzaiw(178, 128);
            zzfdVar = new zzfd();
        } else {
            zzfdVar = null;
            this.zzf = null;
        }
        this.zze = zzfdVar;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e0  */
    @Override // com.google.android.gms.internal.ads.zzaih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfd r21) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaij.zza(com.google.android.gms.internal.ads.zzfd):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzb(zzaar zzaarVar, zzajt zzajtVar) {
        zzajtVar.zzc();
        this.zzb = zzajtVar.zzb();
        this.zzc = zzaarVar.zzv(zzajtVar.zza(), 2);
        zzajw zzajwVar = this.zzd;
        if (zzajwVar != null) {
            zzajwVar.zzb(zzaarVar, zzajtVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zze() {
        zzew.zze(this.zzg);
        this.zzh.zzb();
        zzaiw zzaiwVar = this.zzf;
        if (zzaiwVar != null) {
            zzaiwVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = -9223372036854775807L;
        this.zzo = -9223372036854775807L;
    }
}
