package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzbhz implements zzbii {
    @Override // com.google.android.gms.internal.ads.zzbii
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcfb zzcfbVar = (zzcfb) obj;
        if (zzcfbVar.zzJ() != null) {
            zzcfbVar.zzJ().zza();
        }
        com.google.android.gms.ads.internal.overlay.zzl zzL = zzcfbVar.zzL();
        if (zzL != null) {
            zzL.zzb();
            return;
        }
        com.google.android.gms.ads.internal.overlay.zzl zzM = zzcfbVar.zzM();
        if (zzM != null) {
            zzM.zzb();
        } else {
            zzbzt.zzj("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
