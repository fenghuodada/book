package com.google.android.gms.internal.measurement;

import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
final class zzie extends zzii {
    static final zzie zza = new zzie();

    private zzie() {
    }

    public final boolean equals(@CheckForNull Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final boolean zzb() {
        return false;
    }
}
