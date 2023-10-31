package com.google.android.gms.internal.measurement;

import androidx.core.content.C0663f;
import java.io.Serializable;
import java.util.Arrays;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
final class zziq implements Serializable, zzim {
    final Object zza;

    public zziq(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zziq) {
            return zzih.zza(this.zza, ((zziq) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return C0663f.m12005a("Suppliers.ofInstance(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        return this.zza;
    }
}
