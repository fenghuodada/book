package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class zzais implements zzaih {
    private final zzaji zza;
    private String zzb;
    private zzabr zzc;
    private zzair zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaiw zzg = new zzaiw(32, 128);
    private final zzaiw zzh = new zzaiw(33, 128);
    private final zzaiw zzi = new zzaiw(34, 128);
    private final zzaiw zzj = new zzaiw(39, 128);
    private final zzaiw zzk = new zzaiw(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzfd zzn = new zzfd();

    public zzais(zzaji zzajiVar) {
        this.zza = zzajiVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        this.zzd.zzb(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zza(bArr, i, i2);
            this.zzh.zza(bArr, i, i2);
            this.zzi.zza(bArr, i, i2);
        }
        this.zzj.zza(bArr, i, i2);
        this.zzk.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03a1  */
    @Override // com.google.android.gms.internal.ads.zzaih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfd r34) {
        /*
            Method dump skipped, instructions count: 968
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzais.zza(com.google.android.gms.internal.ads.zzfd):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzb(zzaar zzaarVar, zzajt zzajtVar) {
        zzajtVar.zzc();
        this.zzb = zzajtVar.zzb();
        zzabr zzv = zzaarVar.zzv(zzajtVar.zza(), 2);
        this.zzc = zzv;
        this.zzd = new zzair(zzv);
        this.zza.zzb(zzaarVar, zzajtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzm = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zze() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzew.zze(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        zzair zzairVar = this.zzd;
        if (zzairVar != null) {
            zzairVar.zzc();
        }
    }
}
