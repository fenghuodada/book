package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzdrr implements zzdrb {
    private final long zza;
    private final zzdrg zzb;
    private final zzeyw zzc;

    public zzdrr(long j, Context context, zzdrg zzdrgVar, zzcgw zzcgwVar, String str) {
        this.zza = j;
        this.zzb = zzdrgVar;
        zzeyy zzu = zzcgwVar.zzu();
        zzu.zzb(context);
        zzu.zza(str);
        this.zzc = zzu.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzdrb
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzdrb
    public final void zzb(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        try {
            this.zzc.zzf(zzlVar, new zzdrp(this));
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrb
    public final void zzc() {
        try {
            this.zzc.zzk(new zzdrq(this));
            this.zzc.zzm(ObjectWrapper.wrap(null));
        } catch (RemoteException e) {
            zzbzt.zzl("#007 Could not call remote method.", e);
        }
    }
}
