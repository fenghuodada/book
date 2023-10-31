package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import androidx.annotation.RequiresApi;

@RequiresApi(24)
/* loaded from: classes.dex */
final class zzhe {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* bridge */ /* synthetic */ void zza(zzhe zzheVar, int i, int i2) {
        zzheVar.zzb.set(i, i2);
        zzheVar.zza.setPattern(zzheVar.zzb);
    }
}
