package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
final class zzdfy implements zzbii {
    private final WeakReference zza;

    public /* synthetic */ zzdfy(zzdfz zzdfzVar, zzdfx zzdfxVar) {
        this.zza = new WeakReference(zzdfzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final void zza(Object obj, Map map) {
        zzdfz zzdfzVar = (zzdfz) this.zza.get();
        if (zzdfzVar == null) {
            return;
        }
        zzdfz.zzc(zzdfzVar).zza();
    }
}
