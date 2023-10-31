package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public class zzcpk {
    private final zzcrd zza;
    private final View zzb;
    private final zzezg zzc;
    @Nullable
    private final zzcfb zzd;

    public zzcpk(View view, @Nullable zzcfb zzcfbVar, zzcrd zzcrdVar, zzezg zzezgVar) {
        this.zzb = view;
        this.zzd = zzcfbVar;
        this.zza = zzcrdVar;
        this.zzc = zzezgVar;
    }

    public static final zzdco zzf(final Context context, final zzbzz zzbzzVar, final zzezf zzezfVar, final zzfaa zzfaaVar) {
        return new zzdco(new zzcww() { // from class: com.google.android.gms.internal.ads.zzcpi
            @Override // com.google.android.gms.internal.ads.zzcww
            public final void zzn() {
                com.google.android.gms.ads.internal.zzt.zzs().zzn(context, zzbzzVar.zza, zzezfVar.zzD.toString(), zzfaaVar.zzf);
            }
        }, zzcag.zzf);
    }

    public static final Set zzg(zzcqu zzcquVar) {
        return Collections.singleton(new zzdco(zzcquVar, zzcag.zzf));
    }

    public static final zzdco zzh(zzcqs zzcqsVar) {
        return new zzdco(zzcqsVar, zzcag.zze);
    }

    public final View zza() {
        return this.zzb;
    }

    @Nullable
    public final zzcfb zzb() {
        return this.zzd;
    }

    public final zzcrd zzc() {
        return this.zza;
    }

    public zzcwu zzd(Set set) {
        return new zzcwu(set);
    }

    public final zzezg zze() {
        return this.zzc;
    }
}
