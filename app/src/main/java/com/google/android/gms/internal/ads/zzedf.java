package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
final class zzedf extends zzbpi {
    final /* synthetic */ zzedg zza;
    private final zzeby zzb;

    public /* synthetic */ zzedf(zzedg zzedgVar, zzeby zzebyVar, zzede zzedeVar) {
        this.zza = zzedgVar;
        this.zzb = zzebyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zze(String str) throws RemoteException {
        ((zzedr) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzedr) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzedg.zze(this.zza, (View) ObjectWrapper.unwrap(iObjectWrapper));
        ((zzedr) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbpj
    public final void zzh(zzboh zzbohVar) throws RemoteException {
        zzedg.zzd(this.zza, zzbohVar);
        ((zzedr) this.zzb.zzc).zzo();
    }
}
