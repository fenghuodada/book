package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzeds extends zzbvg implements zzcws {
    private zzbvh zza;
    private zzcwr zzb;
    private zzddh zzc;

    @Override // com.google.android.gms.internal.ads.zzcws
    public final synchronized void zza(zzcwr zzcwrVar) {
        this.zzb = zzcwrVar;
    }

    public final synchronized void zzc(zzbvh zzbvhVar) {
        this.zza = zzbvhVar;
    }

    public final synchronized void zzd(zzddh zzddhVar) {
        this.zzc = zzddhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final synchronized void zze(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvh zzbvhVar = this.zza;
        if (zzbvhVar != null) {
            ((zzegq) zzbvhVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final synchronized void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvh zzbvhVar = this.zza;
        if (zzbvhVar != null) {
            zzbvhVar.zzf(iObjectWrapper);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final synchronized void zzg(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzcwr zzcwrVar = this.zzb;
        if (zzcwrVar != null) {
            zzcwrVar.zza(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final synchronized void zzh(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvh zzbvhVar = this.zza;
        if (zzbvhVar != null) {
            ((zzegq) zzbvhVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final synchronized void zzi(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzcwr zzcwrVar = this.zzb;
        if (zzcwrVar != null) {
            zzcwrVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final synchronized void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvh zzbvhVar = this.zza;
        if (zzbvhVar != null) {
            ((zzegq) zzbvhVar).zza.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final synchronized void zzk(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzddh zzddhVar = this.zzc;
        if (zzddhVar != null) {
            zzbzt.zzj("Fail to initialize adapter ".concat(String.valueOf(((zzegp) zzddhVar).zzc.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final synchronized void zzl(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzddh zzddhVar = this.zzc;
        if (zzddhVar != null) {
            Executor zzc = zzegr.zzc(((zzegp) zzddhVar).zzd);
            final zzezr zzezrVar = ((zzegp) zzddhVar).zza;
            final zzezf zzezfVar = ((zzegp) zzddhVar).zzb;
            final zzeby zzebyVar = ((zzegp) zzddhVar).zzc;
            final zzegp zzegpVar = (zzegp) zzddhVar;
            zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzego
                @Override // java.lang.Runnable
                public final void run() {
                    zzegp zzegpVar2 = zzegp.this;
                    zzezr zzezrVar2 = zzezrVar;
                    zzezf zzezfVar2 = zzezfVar;
                    zzeby zzebyVar2 = zzebyVar;
                    zzegr zzegrVar = zzegpVar2.zzd;
                    zzegr.zze(zzezrVar2, zzezfVar2, zzebyVar2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final synchronized void zzm(IObjectWrapper iObjectWrapper, zzbvi zzbviVar) throws RemoteException {
        zzbvh zzbvhVar = this.zza;
        if (zzbvhVar != null) {
            ((zzegq) zzbvhVar).zzd.zza(zzbviVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final synchronized void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvh zzbvhVar = this.zza;
        if (zzbvhVar != null) {
            ((zzegq) zzbvhVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvh
    public final synchronized void zzo(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzbvh zzbvhVar = this.zza;
        if (zzbvhVar != null) {
            ((zzegq) zzbvhVar).zzd.zzc();
        }
    }
}
