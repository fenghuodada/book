package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbmy {
    @VisibleForTesting
    static final com.google.android.gms.ads.internal.util.zzbb zza = new zzbmw();
    @VisibleForTesting
    static final com.google.android.gms.ads.internal.util.zzbb zzb = new zzbmx();
    private final zzbmk zzc;

    public zzbmy(Context context, zzbzz zzbzzVar, String str, @Nullable zzfft zzfftVar) {
        this.zzc = new zzbmk(context, zzbzzVar, str, zza, zzb, zzfftVar);
    }

    public final zzbmo zza(String str, zzbmr zzbmrVar, zzbmq zzbmqVar) {
        return new zzbnc(this.zzc, str, zzbmrVar, zzbmqVar);
    }

    public final zzbnh zzb() {
        return new zzbnh(this.zzc);
    }
}
