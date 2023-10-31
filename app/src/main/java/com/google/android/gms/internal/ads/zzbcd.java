package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbcd extends zzbce {
    private final com.google.android.gms.ads.internal.zzf zza;
    @Nullable
    private final String zzb;
    private final String zzc;

    public zzbcd(com.google.android.gms.ads.internal.zzf zzfVar, @Nullable String str, String str2) {
        this.zza = zzfVar;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final void zzd(@Nullable IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return;
        }
        this.zza.zza((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final void zze() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbcf
    public final void zzf() {
        this.zza.zzc();
    }
}
