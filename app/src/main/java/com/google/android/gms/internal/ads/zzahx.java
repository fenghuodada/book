package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzahx implements zzaih {
    private final zzfc zza;
    private final zzfd zzb;
    @Nullable
    private final String zzc;
    private String zzd;
    private zzabr zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private zzam zzj;
    private int zzk;
    private long zzl;

    public zzahx() {
        this(null);
    }

    public zzahx(@Nullable String str) {
        zzfc zzfcVar = new zzfc(new byte[128], 128);
        this.zza = zzfcVar;
        this.zzb = new zzfd(zzfcVar.zza);
        this.zzf = 0;
        this.zzl = -9223372036854775807L;
        this.zzc = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0101, code lost:
        if (r12.zzk() == 11) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0103, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0105, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0127, code lost:
        if (r0 == 11) goto L13;
     */
    @Override // com.google.android.gms.internal.ads.zzaih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzfd r12) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzahx.zza(com.google.android.gms.internal.ads.zzfd):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaih
    public final void zzb(zzaar zzaarVar, zzajt zzajtVar) {
        zzajtVar.zzc();
        this.zzd = zzajtVar.zzb();
        this.zze = zzaarVar.zzv(zzajtVar.zza(), 1);
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
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = false;
        this.zzl = -9223372036854775807L;
    }
}
