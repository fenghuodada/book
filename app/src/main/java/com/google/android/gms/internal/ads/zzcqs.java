package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.C0470b;

/* loaded from: classes.dex */
public final class zzcqs implements zzcww, zzcwc {
    private final Context zza;
    @Nullable
    private final zzcfb zzb;
    private final zzezf zzc;
    private final zzbzz zzd;
    @Nullable
    private zzfgo zze;
    private boolean zzf;

    public zzcqs(Context context, @Nullable zzcfb zzcfbVar, zzezf zzezfVar, zzbzz zzbzzVar) {
        this.zza = context;
        this.zzb = zzcfbVar;
        this.zzc = zzezfVar;
        this.zzd = zzbzzVar;
    }

    private final synchronized void zza() {
        zzebt zzebtVar;
        zzebu zzebuVar;
        if (this.zzc.zzU) {
            if (this.zzb == null) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzt.zzA().zze(this.zza)) {
                zzbzz zzbzzVar = this.zzd;
                String str = zzbzzVar.zzb + "." + zzbzzVar.zzc;
                String zza = this.zzc.zzW.zza();
                if (this.zzc.zzW.zzb() == 1) {
                    zzebtVar = zzebt.VIDEO;
                    zzebuVar = zzebu.DEFINED_BY_JAVASCRIPT;
                } else {
                    zzebtVar = zzebt.HTML_DISPLAY;
                    zzebuVar = this.zzc.zzf == 1 ? zzebu.ONE_PIXEL : zzebu.BEGIN_TO_RENDER;
                }
                zzfgo zza2 = com.google.android.gms.ads.internal.zzt.zzA().zza(str, this.zzb.zzG(), "", "javascript", zza, zzebuVar, zzebtVar, this.zzc.zzam);
                this.zze = zza2;
                zzcfb zzcfbVar = this.zzb;
                if (zza2 != null) {
                    com.google.android.gms.ads.internal.zzt.zzA().zzc(this.zze, (View) zzcfbVar);
                    this.zzb.zzap(this.zze);
                    com.google.android.gms.ads.internal.zzt.zzA().zzd(this.zze);
                    this.zzf = true;
                    this.zzb.zzd("onSdkLoaded", new C0470b());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final synchronized void zzl() {
        zzcfb zzcfbVar;
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzU || this.zze == null || (zzcfbVar = this.zzb) == null) {
            return;
        }
        zzcfbVar.zzd("onSdkImpression", new C0470b());
    }

    @Override // com.google.android.gms.internal.ads.zzcww
    public final synchronized void zzn() {
        if (this.zzf) {
            return;
        }
        zza();
    }
}
