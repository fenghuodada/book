package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* loaded from: classes.dex */
public final class zzbgv {
    private final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener zza;
    @Nullable
    private final NativeCustomTemplateAd.OnCustomClickListener zzb;
    @Nullable
    @GuardedBy("this")
    private NativeCustomTemplateAd zzc;

    public zzbgv(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, @Nullable NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomTemplateAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public final synchronized NativeCustomTemplateAd zzf(zzbfk zzbfkVar) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.zzc;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        zzbfl zzbflVar = new zzbfl(zzbfkVar);
        this.zzc = zzbflVar;
        return zzbflVar;
    }

    @Nullable
    public final zzbfu zzd() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbgs(this, null);
    }

    public final zzbfx zze() {
        return new zzbgu(this, null);
    }
}
