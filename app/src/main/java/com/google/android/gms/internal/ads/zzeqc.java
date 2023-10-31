package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzeqc implements zzeqp {
    @Nullable
    public final String zza;
    @Nullable
    public final String zzb;
    @Nullable
    public final String zzc;
    @Nullable
    public final String zzd;
    @Nullable
    public final Long zze;

    public zzeqc(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Long l) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = l;
    }

    @Override // com.google.android.gms.internal.ads.zzeqp
    public final /* bridge */ /* synthetic */ void zzh(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfal.zzc(bundle, "gmp_app_id", this.zza);
        zzfal.zzc(bundle, "fbs_aiid", this.zzb);
        zzfal.zzc(bundle, "fbs_aeid", this.zzc);
        zzfal.zzc(bundle, "apm_id_origin", this.zzd);
        Long l = this.zze;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
