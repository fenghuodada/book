package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzbrf extends zzbft {
    final /* synthetic */ zzbri zza;

    public /* synthetic */ zzbrf(zzbri zzbriVar, zzbre zzbreVar) {
        this.zza = zzbriVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zze(zzbfk zzbfkVar, String str) {
        zzbri zzbriVar = this.zza;
        if (zzbriVar.zzb == null) {
            return;
        }
        zzbriVar.zzb.onCustomClick(zzbriVar.zzf(zzbfkVar), str);
    }
}
