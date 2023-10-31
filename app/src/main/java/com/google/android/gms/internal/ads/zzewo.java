package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzewo implements zzfon {
    final /* synthetic */ zzews zza;

    public zzewo(zzews zzewsVar) {
        this.zza = zzewsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfon
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzfbw zze;
        zzewr zzewrVar;
        zzbzt.zzh("", (zzdwc) obj);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzews zzewsVar = this.zza;
        zze = zzewsVar.zze();
        zzewsVar.zzd = new zzewr(null, zze, null);
        zzewrVar = this.zza.zzd;
        return zzewrVar;
    }
}
