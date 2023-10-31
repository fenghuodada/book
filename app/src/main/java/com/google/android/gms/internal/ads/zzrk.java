package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzrk {
    public final zzrp zza;
    public final MediaFormat zzb;
    public final zzam zzc;
    @Nullable
    public final Surface zzd;
    @Nullable
    public final MediaCrypto zze = null;

    private zzrk(zzrp zzrpVar, MediaFormat mediaFormat, zzam zzamVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i) {
        this.zza = zzrpVar;
        this.zzb = mediaFormat;
        this.zzc = zzamVar;
        this.zzd = surface;
    }

    public static zzrk zza(zzrp zzrpVar, MediaFormat mediaFormat, zzam zzamVar, @Nullable MediaCrypto mediaCrypto) {
        return new zzrk(zzrpVar, mediaFormat, zzamVar, null, null, 0);
    }

    public static zzrk zzb(zzrp zzrpVar, MediaFormat mediaFormat, zzam zzamVar, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto) {
        return new zzrk(zzrpVar, mediaFormat, zzamVar, surface, null, 0);
    }
}
