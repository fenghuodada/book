package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes.dex */
public final class zzbbt {
    public static final void zza(zzbbs zzbbsVar, @Nullable zzbbq zzbbqVar) {
        if (zzbbqVar.zza() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbbqVar.zzb())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbbsVar.zzd(zzbbqVar.zza(), zzbbqVar.zzb(), zzbbqVar.zzc(), zzbbqVar.zzd());
    }
}
