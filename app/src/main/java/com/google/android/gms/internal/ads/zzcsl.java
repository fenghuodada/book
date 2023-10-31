package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcsl implements zzfvn {
    final /* synthetic */ zzcsm zza;

    public zzcsl(zzcsm zzcsmVar) {
        this.zza = zzcsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzdan zzdanVar;
        zzdanVar = this.zza.zzf;
        zzdanVar.zzh(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Object obj) {
        zzdan zzdanVar;
        Void r2 = (Void) obj;
        zzdanVar = this.zza.zzf;
        zzdanVar.zzh(true);
    }
}
