package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcar implements zzfvn {
    final /* synthetic */ zzcap zza;
    final /* synthetic */ zzcan zzb;

    public zzcar(zzcas zzcasVar, zzcap zzcapVar, zzcan zzcanVar) {
        this.zza = zzcapVar;
        this.zzb = zzcanVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zzb(@Nullable Object obj) {
        this.zza.zza(obj);
    }
}
