package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzghc {
    private final zzfxg zza;
    private final int zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzghc(zzfxg zzfxgVar, int i, String str, String str2, zzghb zzghbVar) {
        this.zza = zzfxgVar;
        this.zzb = i;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzghc) {
            zzghc zzghcVar = (zzghc) obj;
            return this.zza == zzghcVar.zza && this.zzb == zzghcVar.zzb && this.zzc.equals(zzghcVar.zzc) && this.zzd.equals(zzghcVar.zzd);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final int zza() {
        return this.zzb;
    }
}
