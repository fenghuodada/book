package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzehm implements zzebv {
    @Nullable
    private final zzbci zza;
    private final zzfwc zzb;
    private final zzfed zzc;
    private final zzehv zzd;

    public zzehm(zzfed zzfedVar, zzfwc zzfwcVar, @Nullable zzbci zzbciVar, zzehv zzehvVar) {
        this.zzc = zzfedVar;
        this.zzb = zzfwcVar;
        this.zza = zzbciVar;
        this.zzd = zzehvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final zzfwb zza(zzezr zzezrVar, zzezf zzezfVar) {
        zzcal zzcalVar = new zzcal();
        zzehr zzehrVar = new zzehr();
        zzehrVar.zzd(new zzehl(this, zzcalVar, zzezrVar, zzezfVar, zzehrVar));
        zzezk zzezkVar = zzezfVar.zzt;
        final zzbcd zzbcdVar = new zzbcd(zzehrVar, zzezkVar.zzb, zzezkVar.zza);
        zzfed zzfedVar = this.zzc;
        return zzfdn.zzd(new zzfdh() { // from class: com.google.android.gms.internal.ads.zzehk
            @Override // com.google.android.gms.internal.ads.zzfdh
            public final void zza() {
                zzehm.this.zzc(zzbcdVar);
            }
        }, this.zzb, zzfdx.CUSTOM_RENDER_SYN, zzfedVar).zzb(zzfdx.CUSTOM_RENDER_ACK).zzd(zzcalVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final boolean zzb(zzezr zzezrVar, zzezf zzezfVar) {
        zzezk zzezkVar;
        return (this.zza == null || (zzezkVar = zzezfVar.zzt) == null || zzezkVar.zza == null) ? false : true;
    }

    public final /* synthetic */ void zzc(zzbcd zzbcdVar) throws Exception {
        this.zza.zze(zzbcdVar);
    }
}
