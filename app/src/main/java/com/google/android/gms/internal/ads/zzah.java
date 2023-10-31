package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzah {
    private final SparseBooleanArray zza;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzah) {
            zzah zzahVar = (zzah) obj;
            if (zzfn.zza < 24) {
                if (this.zza.size() == zzahVar.zza.size()) {
                    for (int i = 0; i < this.zza.size(); i++) {
                        if (zza(i) != zzahVar.zza(i)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return this.zza.equals(zzahVar.zza);
        }
        return false;
    }

    public final int hashCode() {
        if (zzfn.zza < 24) {
            int size = this.zza.size();
            for (int i = 0; i < this.zza.size(); i++) {
                size = (size * 31) + zza(i);
            }
            return size;
        }
        return this.zza.hashCode();
    }

    public final int zza(int i) {
        zzdy.zza(i, 0, this.zza.size());
        return this.zza.keyAt(i);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i) {
        return this.zza.get(i);
    }
}
