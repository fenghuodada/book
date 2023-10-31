package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaqk implements Runnable {
    final /* synthetic */ zzaql zza;

    public zzaqk(zzaql zzaqlVar) {
        this.zza = zzaqlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        zzarr zzarrVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb != null) {
            return;
        }
        conditionVariable = zzaql.zzc;
        synchronized (conditionVariable) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((Boolean) zzbbk.zzci.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    zzarrVar = this.zza.zze;
                    zzaql.zza = zzfkv.zzb(zzarrVar.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.zza.zzb = Boolean.valueOf(z2);
            conditionVariable2 = zzaql.zzc;
            conditionVariable2.open();
        }
    }
}
