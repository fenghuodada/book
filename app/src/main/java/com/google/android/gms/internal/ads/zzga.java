package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzga {
    @Nullable
    private Uri zza;
    private Map zzb = Collections.emptyMap();
    private long zzc;
    private int zzd;

    public final zzga zza(int i) {
        this.zzd = 6;
        return this;
    }

    public final zzga zzb(Map map) {
        this.zzb = map;
        return this;
    }

    public final zzga zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final zzga zzd(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzgc zze() {
        if (this.zza != null) {
            return new zzgc(this.zza, this.zzb, this.zzc, this.zzd);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
