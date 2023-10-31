package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzcnf implements zzcwd {
    private final zzfav zza;

    public zzcnf(zzfav zzfavVar) {
        this.zza = zzfavVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final void zzbn(@Nullable Context context) {
        try {
            this.zza.zzg();
        } catch (zzfaf e) {
            zzbzt.zzk("Cannot invoke onDestroy for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final void zzbp(@Nullable Context context) {
        try {
            this.zza.zzt();
        } catch (zzfaf e) {
            zzbzt.zzk("Cannot invoke onPause for the mediation adapter.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final void zzbq(@Nullable Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzfaf e) {
            zzbzt.zzk("Cannot invoke onResume for the mediation adapter.", e);
        }
    }
}
