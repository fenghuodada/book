package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public final class zzfmd {
    public static zzfwb zza(Task task) {
        final zzfmc zzfmcVar = new zzfmc(task);
        task.addOnCompleteListener(zzfwi.zzb(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfmb
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfmc zzfmcVar2 = zzfmc.this;
                if (task2.isCanceled()) {
                    zzfmcVar2.cancel(false);
                } else if (task2.isSuccessful()) {
                    zzfmcVar2.zzd(task2.getResult());
                } else {
                    Exception exception = task2.getException();
                    if (exception == null) {
                        throw new IllegalStateException();
                    }
                    zzfmcVar2.zze(exception);
                }
            }
        });
        return zzfmcVar;
    }
}
