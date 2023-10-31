package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
final class zzbiq implements com.google.android.gms.ads.internal.overlay.zzx {
    boolean zza = false;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    public zzbiq(zzbis zzbisVar, boolean z, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, Map map2) {
        this.zzb = z;
        this.zzc = zzaVar;
        this.zzd = map;
        this.zze = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzx
    public final void zza(boolean z) {
        if (this.zza) {
            return;
        }
        if (z && this.zzb) {
            ((zzdcw) this.zzc).zzr();
        }
        this.zza = true;
        this.zzd.put((String) this.zze.get("event_id"), Boolean.valueOf(z));
        ((zzblb) this.zzc).zzd("openIntentAsync", this.zzd);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzx
    public final void zzb(int i) {
    }
}
