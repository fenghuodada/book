package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbfl implements NativeCustomTemplateAd {
    private final zzbfk zza;
    private final MediaView zzb;
    private final VideoController zzc = new VideoController();
    private NativeCustomTemplateAd.DisplayOpenMeasurement zzd;

    @VisibleForTesting
    public zzbfl(zzbfk zzbfkVar) {
        Context context;
        this.zza = zzbfkVar;
        MediaView mediaView = null;
        try {
            context = (Context) ObjectWrapper.unwrap(zzbfkVar.zzh());
        } catch (RemoteException | NullPointerException e) {
            zzbzt.zzh("", e);
            context = null;
        }
        if (context != null) {
            MediaView mediaView2 = new MediaView(context);
            try {
                if (true == this.zza.zzs(ObjectWrapper.wrap(mediaView2))) {
                    mediaView = mediaView2;
                }
            } catch (RemoteException e2) {
                zzbzt.zzh("", e2);
            }
        }
        this.zzb = mediaView;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void destroy() {
        try {
            this.zza.zzl();
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    @Nullable
    public final List<String> getAvailableAssetNames() {
        try {
            return this.zza.zzk();
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    @Nullable
    public final String getCustomTemplateId() {
        try {
            return this.zza.zzi();
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final NativeCustomTemplateAd.DisplayOpenMeasurement getDisplayOpenMeasurement() {
        try {
            if (this.zzd == null && this.zza.zzq()) {
                this.zzd = new zzbek(this.zza);
            }
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    @Nullable
    public final NativeAd.Image getImage(String str) {
        try {
            zzbeq zzg = this.zza.zzg(str);
            if (zzg != null) {
                return new zzber(zzg);
            }
            return null;
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    @Nullable
    public final CharSequence getText(String str) {
        try {
            return this.zza.zzj(str);
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final VideoController getVideoController() {
        try {
            com.google.android.gms.ads.internal.client.zzdq zze = this.zza.zze();
            if (zze != null) {
                this.zzc.zzb(zze);
            }
        } catch (RemoteException e) {
            zzbzt.zzh("Exception occurred while getting video controller", e);
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final MediaView getVideoMediaView() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void performClick(String str) {
        try {
            this.zza.zzn(str);
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeCustomTemplateAd
    public final void recordImpression() {
        try {
            this.zza.zzo();
        } catch (RemoteException e) {
            zzbzt.zzh("", e);
        }
    }

    public final zzbfk zza() {
        return this.zza;
    }
}
