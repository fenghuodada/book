package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbbk;
import com.google.android.gms.internal.ads.zzbru;
import com.google.android.gms.internal.ads.zzdcw;

/* loaded from: classes.dex */
public final class zzy extends zzbru {
    private final AdOverlayInfoParcel zza;
    private final Activity zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzy(Activity activity, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.zza = adOverlayInfoParcel;
        this.zzb = activity;
    }

    private final synchronized void zzb() {
        if (this.zzd) {
            return;
        }
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzf(4);
        }
        this.zzd = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final boolean zzF() throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzg(int i, int i2, Intent intent) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzh() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzk(@Nullable Bundle bundle) {
        zzo zzoVar;
        if (((Boolean) zzba.zzc().zzb(zzbbk.zzip)).booleanValue()) {
            this.zzb.requestWindowFeature(1);
        }
        boolean z = false;
        if (bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false)) {
            z = true;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zza;
        if (adOverlayInfoParcel != null && !z) {
            if (bundle == null) {
                com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
                if (zzaVar != null) {
                    zzaVar.onAdClicked();
                }
                zzdcw zzdcwVar = this.zza.zzy;
                if (zzdcwVar != null) {
                    zzdcwVar.zzr();
                }
                if (this.zzb.getIntent() != null && this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true) && (zzoVar = this.zza.zzc) != null) {
                    zzoVar.zzb();
                }
            }
            com.google.android.gms.ads.internal.zzt.zzh();
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zza;
            zzc zzcVar = adOverlayInfoParcel2.zza;
            if (zza.zzb(activity, zzcVar, adOverlayInfoParcel2.zzi, zzcVar.zzi)) {
                return;
            }
        }
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzl() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzn() throws RemoteException {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbo();
        }
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzo(int i, String[] strArr, int[] iArr) {
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzp() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzq() throws RemoteException {
        if (this.zzc) {
            this.zzb.finish();
            return;
        }
        this.zzc = true;
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zzbF();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzr(Bundle bundle) throws RemoteException {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzs() throws RemoteException {
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzt() throws RemoteException {
        if (this.zzb.isFinishing()) {
            zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzu() throws RemoteException {
        zzo zzoVar = this.zza.zzc;
        if (zzoVar != null) {
            zzoVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbrv
    public final void zzw() throws RemoteException {
    }
}
