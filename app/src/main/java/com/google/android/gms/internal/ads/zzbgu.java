package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbgu extends zzbfw {
    final /* synthetic */ zzbgv zza;

    public /* synthetic */ zzbgu(zzbgv zzbgvVar, zzbgt zzbgtVar) {
        this.zza = zzbgvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfx
    public final void zze(zzbfk zzbfkVar) {
        NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener;
        NativeCustomTemplateAd zzf;
        zzbgv zzbgvVar = this.zza;
        onCustomTemplateAdLoadedListener = zzbgvVar.zza;
        zzf = zzbgvVar.zzf(zzbfkVar);
        onCustomTemplateAdLoadedListener.onCustomTemplateAdLoaded(zzf);
    }
}
