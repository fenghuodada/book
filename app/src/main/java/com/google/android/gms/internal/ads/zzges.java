package com.google.android.gms.internal.ads;

import androidx.concurrent.futures.C0485b;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzges {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzges(Class cls, Class cls2, zzger zzgerVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzges) {
            zzges zzgesVar = (zzges) obj;
            return zzgesVar.zza.equals(this.zza) && zzgesVar.zzb.equals(this.zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb});
    }

    public final String toString() {
        return C0485b.m12391a(this.zza.getSimpleName(), " with serialization type: ", this.zzb.getSimpleName());
    }
}
