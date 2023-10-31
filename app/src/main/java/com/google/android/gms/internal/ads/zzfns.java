package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfns extends zzfnp {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ zzfnp zzb;
    final /* synthetic */ zzfnz zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfns(zzfnz zzfnzVar, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, zzfnp zzfnpVar) {
        super(taskCompletionSource);
        this.zzc = zzfnzVar;
        this.zza = taskCompletionSource2;
        this.zzb = zzfnpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfnp
    public final void zza() {
        Object obj;
        AtomicInteger atomicInteger;
        zzfno zzfnoVar;
        obj = this.zzc.zzg;
        synchronized (obj) {
            zzfnz.zzn(this.zzc, this.zza);
            atomicInteger = this.zzc.zzl;
            if (atomicInteger.getAndIncrement() > 0) {
                zzfnoVar = this.zzc.zzc;
                zzfnoVar.zzc("Already connected to the service.", new Object[0]);
            }
            zzfnz.zzp(this.zzc, this.zzb);
        }
    }
}
