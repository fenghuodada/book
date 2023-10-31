package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzbgs extends zzbft {
    final /* synthetic */ zzbgv zza;

    public /* synthetic */ zzbgs(zzbgv zzbgvVar, zzbgr zzbgrVar) {
        this.zza = zzbgvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfu
    public final void zze(zzbfk zzbfkVar, String str) {
        zzbgv zzbgvVar = this.zza;
        if (zzbgv.zza(zzbgvVar) == null) {
            return;
        }
        zzbgv.zza(zzbgvVar).onCustomClick(zzbgv.zzc(zzbgvVar, zzbfkVar), str);
    }
}
