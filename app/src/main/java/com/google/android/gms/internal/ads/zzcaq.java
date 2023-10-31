package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcaq implements zzfvn {
    final /* synthetic */ zzcas zza;

    public zzcaq(zzcas zzcasVar) {
        this.zza = zzcasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zza.zzb;
        atomicInteger.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zzb(@Nullable Object obj) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zza.zzb;
        atomicInteger.set(1);
    }
}
