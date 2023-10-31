package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbxd {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzbxy zzd;

    private zzbxd() {
    }

    public /* synthetic */ zzbxd(zzbxc zzbxcVar) {
    }

    public final zzbxd zza(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzbxd zzb(Context context) {
        context.getClass();
        this.zza = context;
        return this;
    }

    public final zzbxd zzc(Clock clock) {
        clock.getClass();
        this.zzb = clock;
        return this;
    }

    public final zzbxd zzd(zzbxy zzbxyVar) {
        this.zzd = zzbxyVar;
        return this;
    }

    public final zzbxz zze() {
        zzgvw.zzc(this.zza, Context.class);
        zzgvw.zzc(this.zzb, Clock.class);
        zzgvw.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzgvw.zzc(this.zzd, zzbxy.class);
        return new zzbxf(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
