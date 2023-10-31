package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbmp {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbmy zzc;
    private zzbmy zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbmy zza(Context context, zzbzz zzbzzVar, @Nullable zzfft zzfftVar) {
        zzbmy zzbmyVar;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbmy(zzc(context), zzbzzVar, (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zza), zzfftVar);
            }
            zzbmyVar = this.zzc;
        }
        return zzbmyVar;
    }

    public final zzbmy zzb(Context context, zzbzz zzbzzVar, zzfft zzfftVar) {
        zzbmy zzbmyVar;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbmy(zzc(context), zzbzzVar, (String) zzbdn.zzb.zze(), zzfftVar);
            }
            zzbmyVar = this.zzd;
        }
        return zzbmyVar;
    }
}
