package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.C0485b;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzgei {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgei(Class cls, Class cls2, zzgeh zzgehVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgei) {
            zzgei zzgeiVar = (zzgei) obj;
            return zzgeiVar.zza.equals(this.zza) && zzgeiVar.zzb.equals(this.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return C0485b.m12391a(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }
}
