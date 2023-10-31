package com.google.android.gms.internal.ads;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* loaded from: classes.dex */
public final class zzbri {
    private final NativeCustomFormatAd.OnCustomFormatAdLoadedListener zza;
    @Nullable
    private final NativeCustomFormatAd.OnCustomClickListener zzb;
    @Nullable
    @GuardedBy("this")
    private NativeCustomFormatAd zzc;

    public zzbri(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, @Nullable NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.zza = onCustomFormatAdLoadedListener;
        this.zzb = onCustomClickListener;
    }

    public final synchronized NativeCustomFormatAd zzf(zzbfk zzbfkVar) {
        NativeCustomFormatAd nativeCustomFormatAd = this.zzc;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        zzbrj zzbrjVar = new zzbrj(zzbfkVar);
        this.zzc = zzbrjVar;
        return zzbrjVar;
    }

    @Nullable
    public final zzbfu zza() {
        if (this.zzb == null) {
            return null;
        }
        return new zzbrf(this, null);
    }

    public final zzbfx zzb() {
        return new zzbrh(this, null);
    }
}
