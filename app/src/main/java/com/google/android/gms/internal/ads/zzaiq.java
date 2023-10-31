package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes.dex */
public final class zzaiq implements zzaih {
    private final zzaji zza;
    private long zze;
    private String zzg;
    private zzabr zzh;
    private zzaip zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzaiw zzb = new zzaiw(7, 128);
    private final zzaiw zzc = new zzaiw(8, 128);
    private final zzaiw zzd = new zzaiw(6, 128);
    private long zzk = -9223372036854775807L;
    private final zzfd zzm = new zzfd();

    public zzaiq(zzaji zzajiVar, boolean z, boolean z2) {
        this.zza = zzajiVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i, i2);
            this.zzc.zza(bArr, i, i2);
        }
        this.zzd.zza(bArr, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x017a A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzaih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfd r20) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaiq.zza(com.google.android.gms.internal.ads.zzfd):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzb(zzaar zzaarVar, zzajt zzajtVar) {
        zzajtVar.zzc();
        this.zzg = zzajtVar.zzb();
        zzabr zzv = zzaarVar.zzv(zzajtVar.zza(), 2);
        this.zzh = zzv;
        this.zzi = new zzaip(zzv, false, false);
        this.zza.zzb(zzaarVar, zzajtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzd(long j, int i) {
        if (j != -9223372036854775807L) {
            this.zzk = j;
        }
        this.zzl |= (i & 2) != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = -9223372036854775807L;
        zzew.zze(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        zzaip zzaipVar = this.zzi;
        if (zzaipVar != null) {
            zzaipVar.zzc();
        }
    }
}
