package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzat {
    @Nullable
    private String zza;
    @Nullable
    private Uri zzb;
    private final zzav zzc = new zzav();
    private final zzbb zzd = new zzbb(null);
    private final List zze = Collections.emptyList();
    private final zzfrr zzf = zzfrr.zzl();
    private final zzbe zzg = new zzbe();
    private final zzbn zzh = zzbn.zza;

    public final zzat zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzat zzb(@Nullable Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzbq zzc() {
        Uri uri = this.zzb;
        zzbk zzbkVar = uri != null ? new zzbk(uri, null, null, null, this.zze, null, this.zzf, null, null) : null;
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzbq(str, new zzaz(this.zzc, null), zzbkVar, new zzbg(this.zzg), zzbw.zza, this.zzh, null);
    }
}
