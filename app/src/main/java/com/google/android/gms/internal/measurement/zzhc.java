package com.google.android.gms.internal.measurement;

import android.content.Context;
import androidx.core.provider.C0761g;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class zzhc extends zzhz {
    private final Context zza;
    private final zzim zzb;

    public zzhc(Context context, @Nullable zzim zzimVar) {
        this.zza = context;
        this.zzb = zzimVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzhz) {
            zzhz zzhzVar = (zzhz) obj;
            if (this.zza.equals(zzhzVar.zza())) {
                zzim zzimVar = this.zzb;
                zzim zzb = zzhzVar.zzb();
                if (zzimVar != null ? zzimVar.equals(zzb) : zzb == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        zzim zzimVar = this.zzb;
        return (hashCode * 1000003) ^ (zzimVar == null ? 0 : zzimVar.hashCode());
    }

    public final String toString() {
        return C0761g.m11824a("FlagsContext{context=", this.zza.toString(), ", hermeticFileOverrides=", String.valueOf(this.zzb), "}");
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzhz
    @Nullable
    public final zzim zzb() {
        return this.zzb;
    }
}
