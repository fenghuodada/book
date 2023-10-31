package com.google.android.gms.ads.internal.client;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbfk;
import com.google.android.gms.internal.ads.zzbzt;

/* loaded from: classes.dex */
public final class zzep implements MediaContent {
    private final zzben zza;
    private final VideoController zzb = new VideoController();
    @Nullable
    private final zzbfk zzc;

    public zzep(zzben zzbenVar, @Nullable zzbfk zzbfkVar) {
        this.zza = zzbenVar;
        this.zzc = zzbfkVar;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getAspectRatio() {
        try {
            return this.zza.zze();
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getCurrentTime() {
        try {
            return this.zza.zzf();
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final float getDuration() {
        try {
            return this.zza.zzg();
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
            return 0.0f;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    @Nullable
    public final Drawable getMainImage() {
        try {
            IObjectWrapper zzi = this.zza.zzi();
            if (zzi != null) {
                return (Drawable) ObjectWrapper.unwrap(zzi);
            }
            return null;
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final VideoController getVideoController() {
        try {
            if (this.zza.zzh() != null) {
                this.zzb.zzb(this.zza.zzh());
            }
        } catch (RemoteException e) {
            zzbzt.zzh("Exception occurred while getting video controller", e);
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean hasVideoContent() {
        try {
            return this.zza.zzl();
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final void setMainImage(@Nullable Drawable drawable) {
        try {
            this.zza.zzj(ObjectWrapper.wrap(drawable));
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.MediaContent
    @Nullable
    public final zzbfk zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.MediaContent
    public final boolean zzb() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
            return false;
        }
    }

    public final zzben zzc() {
        return this.zza;
    }
}
