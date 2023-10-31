package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzehh implements zzebv {
    private final Context zza;
    private final zzcqa zzb;
    @Nullable
    private final zzbci zzc;
    private final zzfwc zzd;
    private final zzfed zze;

    public zzehh(Context context, zzcqa zzcqaVar, zzfed zzfedVar, zzfwc zzfwcVar, @Nullable zzbci zzbciVar) {
        this.zza = context;
        this.zzb = zzcqaVar;
        this.zze = zzfedVar;
        this.zzd = zzfwcVar;
        this.zzc = zzbciVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final zzfwb zza(zzezr zzezrVar, zzezf zzezfVar) {
        zzcpe zza = this.zzb.zza(new zzcru(zzezrVar, zzezfVar, null), new zzehf(this, new View(this.zza), null, new zzcrd() { // from class: com.google.android.gms.internal.ads.zzehd
            @Override // com.google.android.gms.internal.ads.zzcrd
            public final com.google.android.gms.ads.internal.client.zzdq zza() {
                return null;
            }
        }, (zzezg) zzezfVar.zzv.get(0)));
        zzehg zzk = zza.zzk();
        zzezk zzezkVar = zzezfVar.zzt;
        final zzbcd zzbcdVar = new zzbcd(zzk, zzezkVar.zzb, zzezkVar.zza);
        zzfed zzfedVar = this.zze;
        return zzfdn.zzd(new zzfdh() { // from class: com.google.android.gms.internal.ads.zzehe
            @Override // com.google.android.gms.internal.ads.zzfdh
            public final void zza() {
                zzehh.this.zzc(zzbcdVar);
            }
        }, this.zzd, zzfdx.CUSTOM_RENDER_SYN, zzfedVar).zzb(zzfdx.CUSTOM_RENDER_ACK).zzd(zzfvr.zzh(zza.zza())).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebv
    public final boolean zzb(zzezr zzezrVar, zzezf zzezfVar) {
        zzezk zzezkVar;
        return (this.zzc == null || (zzezkVar = zzezfVar.zzt) == null || zzezkVar.zza == null) ? false : true;
    }

    public final /* synthetic */ void zzc(zzbcd zzbcdVar) throws Exception {
        this.zzc.zze(zzbcdVar);
    }
}
