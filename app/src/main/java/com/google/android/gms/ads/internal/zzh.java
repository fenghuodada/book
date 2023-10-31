package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfit;
import com.google.android.gms.internal.ads.zzfjw;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzh implements zzfjw {
    final /* synthetic */ zzi zza;

    public zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final void zza(int i, long j) {
        zzfit zzfitVar;
        zzfitVar = this.zza.zzi;
        zzfitVar.zzd(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzfjw
    public final void zzb(int i, long j, String str) {
        zzfit zzfitVar;
        zzfitVar = this.zza.zzi;
        zzfitVar.zze(i, System.currentTimeMillis() - j, str);
    }
}
