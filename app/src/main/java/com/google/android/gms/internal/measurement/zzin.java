package com.google.android.gms.internal.measurement;

import androidx.core.content.C0663f;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
final class zzin implements Serializable, zzim {
    final zzim zza;
    volatile transient boolean zzb;
    @CheckForNull
    transient Object zzc;

    public zzin(zzim zzimVar) {
        zzimVar.getClass();
        this.zza = zzimVar;
    }

    public final String toString() {
        Object obj;
        if (this.zzb) {
            obj = C0663f.m12005a("<supplier that returned ", String.valueOf(this.zzc), ">");
        } else {
            obj = this.zza;
        }
        return C0663f.m12005a("Suppliers.memoize(", obj.toString(), ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                if (!this.zzb) {
                    Object zza = this.zza.zza();
                    this.zzc = zza;
                    this.zzb = true;
                    return zza;
                }
            }
        }
        return this.zzc;
    }
}
