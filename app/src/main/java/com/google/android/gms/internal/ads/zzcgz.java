package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zzcgz {
    private final zzbzz zza;
    private final Context zzb;
    private final WeakReference zzc;

    public /* synthetic */ zzcgz(zzcgx zzcgxVar, zzcgy zzcgyVar) {
        zzbzz zzbzzVar;
        Context context;
        WeakReference weakReference;
        zzbzzVar = zzcgxVar.zza;
        this.zza = zzbzzVar;
        context = zzcgxVar.zzb;
        this.zzb = context;
        weakReference = zzcgxVar.zzc;
        this.zzc = weakReference;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final zzaqq zzb() {
        return new zzaqq(new com.google.android.gms.ads.internal.zzi(this.zzb, this.zza));
    }

    public final zzbdx zzc() {
        return new zzbdx(this.zzb);
    }

    public final zzbzz zzd() {
        return this.zza;
    }

    public final String zze() {
        return com.google.android.gms.ads.internal.zzt.zzp().zzc(this.zzb, this.zza.zza);
    }

    public final WeakReference zzf() {
        return this.zzc;
    }
}
