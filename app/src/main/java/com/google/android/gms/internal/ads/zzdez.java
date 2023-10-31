package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.C0470b;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes.dex */
public final class zzdez implements zzcww, com.google.android.gms.ads.internal.overlay.zzo, zzcwc {
    @Nullable
    @VisibleForTesting
    zzfgo zza;
    private final Context zzb;
    @Nullable
    private final zzcfb zzc;
    private final zzezf zzd;
    private final zzbzz zze;
    private final zzaxh zzf;

    public zzdez(Context context, @Nullable zzcfb zzcfbVar, zzezf zzezfVar, zzbzz zzbzzVar, zzaxh zzaxhVar) {
        this.zzb = context;
        this.zzc = zzcfbVar;
        this.zzd = zzezfVar;
        this.zze = zzbzzVar;
        this.zzf = zzaxhVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzb() {
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeP)).booleanValue()) {
            return;
        }
        this.zzc.zzd("onSdkImpression", new C0470b());
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbF() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zze() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzcwc
    public final void zzl() {
        if (this.zza == null || this.zzc == null) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzeP)).booleanValue()) {
            this.zzc.zzd("onSdkImpression", new C0470b());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcww
    public final void zzn() {
        zzebu zzebuVar;
        zzebt zzebtVar;
        zzaxh zzaxhVar = this.zzf;
        if ((zzaxhVar == zzaxh.REWARD_BASED_VIDEO_AD || zzaxhVar == zzaxh.INTERSTITIAL || zzaxhVar == zzaxh.APP_OPEN) && this.zzd.zzU && this.zzc != null && com.google.android.gms.ads.internal.zzt.zzA().zze(this.zzb)) {
            zzbzz zzbzzVar = this.zze;
            String str = zzbzzVar.zzb + "." + zzbzzVar.zzc;
            String zza = this.zzd.zzW.zza();
            if (this.zzd.zzW.zzb() == 1) {
                zzebtVar = zzebt.VIDEO;
                zzebuVar = zzebu.DEFINED_BY_JAVASCRIPT;
            } else {
                zzebuVar = this.zzd.zzZ == 2 ? zzebu.UNSPECIFIED : zzebu.BEGIN_TO_RENDER;
                zzebtVar = zzebt.HTML_DISPLAY;
            }
            zzfgo zza2 = com.google.android.gms.ads.internal.zzt.zzA().zza(str, this.zzc.zzG(), "", "javascript", zza, zzebuVar, zzebtVar, this.zzd.zzam);
            this.zza = zza2;
            if (zza2 != null) {
                com.google.android.gms.ads.internal.zzt.zzA().zzc(this.zza, (View) this.zzc);
                this.zzc.zzap(this.zza);
                com.google.android.gms.ads.internal.zzt.zzA().zzd(this.zza);
                this.zzc.zzd("onSdkLoaded", new C0470b());
            }
        }
    }
}
