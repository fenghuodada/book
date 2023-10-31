package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class zzdly implements zzbii {
    final /* synthetic */ zzdlz zza;
    private final WeakReference zzb;
    private final String zzc;
    private final zzbii zzd;

    public /* synthetic */ zzdly(zzdlz zzdlzVar, WeakReference weakReference, String str, zzbii zzbiiVar, zzdlx zzdlxVar) {
        this.zza = zzdlzVar;
        this.zzb = weakReference;
        this.zzc = str;
        this.zzd = zzbiiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void zza(Object obj, Map map) {
        Object obj2 = this.zzb.get();
        if (obj2 == null) {
            this.zza.zzk(this.zzc, this);
        } else {
            this.zzd.zza(obj2, map);
        }
    }
}
