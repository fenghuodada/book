package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzbn {
    @Nullable
    public final Uri zzc = null;
    @Nullable
    public final String zzd = null;
    public static final zzbn zza = new zzbn(new zzbm());
    private static final String zze = Integer.toString(0, 36);
    private static final String zzf = Integer.toString(1, 36);
    private static final String zzg = Integer.toString(2, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzbl
    };

    private zzbn(zzbm zzbmVar) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbn) {
            Uri uri = ((zzbn) obj).zzc;
            return zzfn.zzB(null, null) && zzfn.zzB(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return 0;
    }
}
