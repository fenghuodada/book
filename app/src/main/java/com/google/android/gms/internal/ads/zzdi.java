package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdi {
    private final zzfrr zzd;
    public static final zzdi zza = new zzdi(zzfrr.zzl());
    private static final String zzc = Integer.toString(0, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzdf
    };

    public zzdi(List list) {
        this.zzd = zzfrr.zzj(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdi.class != obj.getClass()) {
            return false;
        }
        return this.zzd.equals(((zzdi) obj).zzd);
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final zzfrr zza() {
        return this.zzd;
    }

    public final boolean zzb(int i) {
        for (int i2 = 0; i2 < this.zzd.size(); i2++) {
            zzdh zzdhVar = (zzdh) this.zzd.get(i2);
            if (zzdhVar.zzc() && zzdhVar.zza() == i) {
                return true;
            }
        }
        return false;
    }
}
