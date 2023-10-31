package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzaha {
    public final int zza;
    public final int zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;
    public final zzam zzf;
    public final int zzg;
    @Nullable
    public final long[] zzh;
    @Nullable
    public final long[] zzi;
    public final int zzj;
    @Nullable
    private final zzahb[] zzk;

    public zzaha(int i, int i2, long j, long j2, long j3, zzam zzamVar, int i3, @Nullable zzahb[] zzahbVarArr, int i4, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = j;
        this.zzd = j2;
        this.zze = j3;
        this.zzf = zzamVar;
        this.zzg = i3;
        this.zzk = zzahbVarArr;
        this.zzj = i4;
        this.zzh = jArr;
        this.zzi = jArr2;
    }

    @Nullable
    public final zzahb zza(int i) {
        zzahb[] zzahbVarArr = this.zzk;
        if (zzahbVarArr == null) {
            return null;
        }
        return zzahbVarArr[i];
    }
}
