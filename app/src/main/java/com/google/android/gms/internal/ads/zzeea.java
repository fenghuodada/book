package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
final class zzeea implements zzdey {
    private final zzezf zza;
    private final zzbpv zzb;
    private final AdFormat zzc;
    @Nullable
    private zzcwa zzd = null;

    public zzeea(zzezf zzezfVar, zzbpv zzbpvVar, AdFormat adFormat) {
        this.zza = zzezfVar;
        this.zzb = zzbpvVar;
        this.zzc = adFormat;
    }

    @Override // com.google.android.gms.internal.ads.zzdey
    public final void zza(boolean z, Context context, zzcvv zzcvvVar) throws zzdex {
        boolean zzs;
        try {
            AdFormat adFormat = AdFormat.BANNER;
            int ordinal = this.zzc.ordinal();
            if (ordinal == 1) {
                zzs = this.zzb.zzs(ObjectWrapper.wrap(context));
            } else if (ordinal != 2) {
                if (ordinal == 6) {
                    zzs = this.zzb.zzr(ObjectWrapper.wrap(context));
                }
                throw new zzdex("Adapter failed to show.");
            } else {
                zzs = this.zzb.zzt(ObjectWrapper.wrap(context));
            }
            if (zzs) {
                if (this.zzd == null) {
                    return;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbs)).booleanValue() || this.zza.zzZ != 2) {
                    return;
                }
                this.zzd.zza();
                return;
            }
            throw new zzdex("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdex(th);
        }
    }

    public final void zzb(zzcwa zzcwaVar) {
        this.zzd = zzcwaVar;
    }
}
