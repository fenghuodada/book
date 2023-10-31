package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzvg extends zzcx {
    private static final Object zzc = new Object();
    private static final zzbq zzd;
    private final long zze;
    private final long zzf;
    private final boolean zzg;
    @Nullable
    private final zzbq zzh;
    @Nullable
    private final zzbg zzi;

    static {
        zzat zzatVar = new zzat();
        zzatVar.zza("SinglePeriodTimeline");
        zzatVar.zzb(Uri.EMPTY);
        zzd = zzatVar.zzc();
    }

    public zzvg(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @Nullable Object obj, zzbq zzbqVar, @Nullable zzbg zzbgVar) {
        this.zze = j4;
        this.zzf = j5;
        this.zzg = z;
        this.zzh = zzbqVar;
        this.zzi = zzbgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zza(Object obj) {
        return zzc.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zzb() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final zzcu zzd(int i, zzcu zzcuVar, boolean z) {
        zzdy.zza(i, 0, 1);
        zzcuVar.zzl(null, z ? zzc : null, 0, this.zze, 0L, zzd.zza, false);
        return zzcuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final zzcw zze(int i, zzcw zzcwVar, long j) {
        zzdy.zza(i, 0, 1);
        zzcwVar.zza(zzcw.zza, this.zzh, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.zzg, false, this.zzi, 0L, this.zzf, 0, 0, 0L);
        return zzcwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcx
    public final Object zzf(int i) {
        zzdy.zza(i, 0, 1);
        return zzc;
    }
}
