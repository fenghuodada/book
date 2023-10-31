package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzaim implements zzaih {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    @Nullable
    private final zzajw zzb;
    @Nullable
    private final zzfd zzc;
    private final boolean[] zzd;
    private final zzaik zze;
    @Nullable
    private final zzaiw zzf;
    private zzail zzg;
    private long zzh;
    private String zzi;
    private zzabr zzj;
    private boolean zzk;
    private long zzl;

    public zzaim() {
        this(null);
    }

    public zzaim(@Nullable zzajw zzajwVar) {
        this.zzb = zzajwVar;
        this.zzd = new boolean[4];
        this.zze = new zzaik(128);
        this.zzl = -9223372036854775807L;
        this.zzf = new zzaiw(178, 128);
        this.zzc = new zzfd();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0129  */
    @Override // com.google.android.gms.internal.ads.zzaih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfd r18) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaim.zza(com.google.android.gms.internal.ads.zzfd):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzb(zzaar zzaarVar, zzajt zzajtVar) {
        zzajtVar.zzc();
        this.zzi = zzajtVar.zzb();
        zzabr zzv = zzaarVar.zzv(zzajtVar.zza(), 2);
        this.zzj = zzv;
        this.zzg = new zzail(zzv);
        this.zzb.zzb(zzaarVar, zzajtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzl = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zze() {
        zzew.zze(this.zzd);
        this.zze.zzb();
        zzail zzailVar = this.zzg;
        if (zzailVar != null) {
            zzailVar.zzd();
        }
        this.zzf.zzb();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }
}
