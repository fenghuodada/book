package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public abstract class zzfvm extends zzfvk implements zzfwb {
    @Override // com.google.android.gms.internal.ads.zzfvk
    public /* bridge */ /* synthetic */ Future zzb() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzfwb
    public final void zzc(Runnable runnable, Executor executor) {
        zzd().zzc(runnable, executor);
    }

    public abstract zzfwb zzd();
}
