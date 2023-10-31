package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.C0485b;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzgeq {
    private final Class zza;
    private final zzgmu zzb;

    public /* synthetic */ zzgeq(Class cls, zzgmu zzgmuVar, zzgep zzgepVar) {
        this.zza = cls;
        this.zzb = zzgmuVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgeq) {
            zzgeq zzgeqVar = (zzgeq) obj;
            return zzgeqVar.zza.equals(this.zza) && zzgeqVar.zzb.equals(this.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return C0485b.m12391a(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }
}
