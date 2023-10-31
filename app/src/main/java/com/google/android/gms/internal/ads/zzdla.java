package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;

/* loaded from: classes.dex */
public final class zzdla extends zzbks implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, zzbeb {
    private View zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzdgx zzc;
    private boolean zzd = false;
    private boolean zze = false;

    public zzdla(zzdgx zzdgxVar, zzdhc zzdhcVar) {
        this.zza = zzdhcVar.zzf();
        this.zzb = zzdhcVar.zzj();
        this.zzc = zzdgxVar;
        if (zzdhcVar.zzr() != null) {
            zzdhcVar.zzr().zzam(this);
        }
    }

    private final void zzg() {
        View view;
        zzdgx zzdgxVar = this.zzc;
        if (zzdgxVar == null || (view = this.zza) == null) {
            return;
        }
        zzdgxVar.zzA(view, Collections.emptyMap(), Collections.emptyMap(), zzdgx.zzW(this.zza));
    }

    private final void zzh() {
        View view = this.zza;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.zza);
        }
    }

    private static final void zzi(zzbkw zzbkwVar, int i) {
        try {
            zzbkwVar.zze(i);
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        zzg();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbkt
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdq zzb() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzbzt.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbkt
    @Nullable
    public final zzben zzc() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzbzt.zzg("getVideoController: Instream ad should not be used after destroyed");
            return null;
        }
        zzdgx zzdgxVar = this.zzc;
        if (zzdgxVar == null || zzdgxVar.zzc() == null) {
            return null;
        }
        return zzdgxVar.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbkt
    public final void zzd() throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzh();
        zzdgx zzdgxVar = this.zzc;
        if (zzdgxVar != null) {
            zzdgxVar.zzb();
        }
        this.zzc = null;
        this.zza = null;
        this.zzb = null;
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbkt
    public final void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzf(iObjectWrapper, new zzdkz(this));
    }

    @Override // com.google.android.gms.internal.ads.zzbkt
    public final void zzf(IObjectWrapper iObjectWrapper, zzbkw zzbkwVar) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzd) {
            zzbzt.zzg("Instream ad can not be shown after destroy().");
            zzi(zzbkwVar, 2);
            return;
        }
        View view = this.zza;
        if (view == null || this.zzb == null) {
            zzbzt.zzg("Instream internal error: ".concat(view == null ? "can not get video view." : "can not get video controller."));
            zzi(zzbkwVar, 0);
        } else if (this.zze) {
            zzbzt.zzg("Instream ad should not be used again.");
            zzi(zzbkwVar, 1);
        } else {
            this.zze = true;
            zzh();
            ((ViewGroup) ObjectWrapper.unwrap(iObjectWrapper)).addView(this.zza, new ViewGroup.LayoutParams(-1, -1));
            com.google.android.gms.ads.internal.zzt.zzx();
            zzcat.zza(this.zza, this);
            com.google.android.gms.ads.internal.zzt.zzx();
            zzcat.zzb(this.zza, this);
            zzg();
            try {
                zzbkwVar.zzf();
            } catch (RemoteException e) {
                zzbzt.zzl("#007 Could not call remote method.", e);
            }
        }
    }
}
