package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcsk implements zzfvn {
    final /* synthetic */ zzcsm zza;

    public zzcsk(zzcsm zzcsmVar) {
        this.zza = zzcsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzdan zzdanVar;
        zzdanVar = this.zza.zzf;
        zzdanVar.zzk(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzdan zzdanVar;
        zzbug zzbugVar = (zzbug) obj;
        zzdanVar = this.zza.zzf;
        zzdanVar.zzk(true);
    }
}
