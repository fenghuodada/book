package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
final class zzewg implements zzfvn {
    public zzewg(zzewi zzewiVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* synthetic */ void zzb(@NullableDecl Object obj) {
        Void r1 = (Void) obj;
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit successful.");
    }
}
