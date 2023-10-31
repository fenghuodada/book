package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzewp implements zzfon {
    final /* synthetic */ zzews zza;

    public zzewp(zzews zzewsVar) {
        this.zza = zzewsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfon
    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        zzewr zzewrVar;
        zzbug zzbugVar = (zzbug) obj;
        this.zza.zzd = new zzewr(zzbugVar, new zzfby(zzbugVar.zzj), null);
        zzewrVar = this.zza.zzd;
        return zzewrVar;
    }
}
