package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ShowFirstParty;

@ShowFirstParty
/* loaded from: classes.dex */
public final class zzfje {
    private final Context zza;
    private final Looper zzb;

    public zzfje(@NonNull Context context, @NonNull Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(@NonNull String str) {
        zzfjs zza = zzfju.zza();
        zza.zza(this.zza.getPackageName());
        zza.zzc(2);
        zzfjp zza2 = zzfjq.zza();
        zza2.zza(str);
        zza2.zzb(2);
        zza.zzb(zza2);
        new zzfjf(this.zza, this.zzb, (zzfju) zza.zzal()).zza();
    }
}
