package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes.dex */
public abstract class zzfnp implements Runnable {
    @Nullable
    private final TaskCompletionSource zza;

    public zzfnp() {
        this.zza = null;
    }

    public zzfnp(@Nullable TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zza();
        } catch (Exception e) {
            zzc(e);
        }
    }

    public abstract void zza();

    @Nullable
    public final TaskCompletionSource zzb() {
        return this.zza;
    }

    public final void zzc(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }
}
