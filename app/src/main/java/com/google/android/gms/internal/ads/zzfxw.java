package com.google.android.gms.internal.ads;

import java.util.Arrays;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzfxw {
    @Nullable
    private final Object zza;
    @Nullable
    private final Object zzb;
    private final byte[] zzc;
    private final zzgla zzd;
    private final int zze;
    private final String zzf;
    private final zzfxb zzg;
    private final int zzh;

    public zzfxw(@Nullable Object obj, @Nullable Object obj2, byte[] bArr, int i, zzgla zzglaVar, int i2, String str, zzfxb zzfxbVar) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = Arrays.copyOf(bArr, bArr.length);
        this.zzh = i;
        this.zzd = zzglaVar;
        this.zze = i2;
        this.zzf = str;
        this.zzg = zzfxbVar;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzfxb zzb() {
        return this.zzg;
    }

    public final zzgla zzc() {
        return this.zzd;
    }

    @Nullable
    public final Object zzd() {
        return this.zza;
    }

    @Nullable
    public final Object zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzf;
    }

    @Nullable
    public final byte[] zzg() {
        byte[] bArr = this.zzc;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzh() {
        return this.zzh;
    }
}
