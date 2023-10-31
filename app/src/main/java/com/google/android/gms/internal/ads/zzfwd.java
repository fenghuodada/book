package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfwd implements Executor {
    final /* synthetic */ Executor zza;
    final /* synthetic */ zzfuf zzb;

    public zzfwd(Executor executor, zzfuf zzfufVar) {
        this.zza = executor;
        this.zzb = zzfufVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zze(e);
        }
    }
}
