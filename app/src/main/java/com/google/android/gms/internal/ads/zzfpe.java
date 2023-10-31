package com.google.android.gms.internal.ads;

import androidx.core.content.C0663f;
import javax.annotation.CheckForNull;

/* loaded from: classes.dex */
final class zzfpe extends zzfov {
    private final Object zza;

    public zzfpe(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzfpe) {
            return this.zza.equals(((zzfpe) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return C0663f.m12005a("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfov
    public final zzfov zza(zzfon zzfonVar) {
        Object apply = zzfonVar.apply(this.zza);
        zzfoz.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfpe(apply);
    }

    @Override // com.google.android.gms.internal.ads.zzfov
    public final Object zzb(Object obj) {
        return this.zza;
    }
}
