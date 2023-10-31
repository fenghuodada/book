package com.google.android.gms.internal.ads;

import androidx.core.content.C0663f;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfwr extends zzfvh implements RunnableFuture {
    @CheckForNull
    private volatile zzfwa zza;

    public zzfwr(zzfux zzfuxVar) {
        this.zza = new zzfwp(this, zzfuxVar);
    }

    public zzfwr(Callable callable) {
        this.zza = new zzfwq(this, callable);
    }

    public static zzfwr zzf(Runnable runnable, Object obj) {
        return new zzfwr(Executors.callable(runnable, obj));
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzfwa zzfwaVar = this.zza;
        if (zzfwaVar != null) {
            zzfwaVar.run();
        }
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    @CheckForNull
    public final String zza() {
        zzfwa zzfwaVar = this.zza;
        if (zzfwaVar != null) {
            return C0663f.m12005a("task=[", zzfwaVar.toString(), "]");
        }
        return super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb() {
        zzfwa zzfwaVar;
        if (zzu() && (zzfwaVar = this.zza) != null) {
            zzfwaVar.zzh();
        }
        this.zza = null;
    }
}
