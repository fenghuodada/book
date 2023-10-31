package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzpp {
    @Nullable
    private Exception zza;
    private long zzb;

    public zzpp(long j) {
    }

    public final void zza() {
        this.zza = null;
    }

    public final void zzb(Exception exc) throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zza == null) {
            this.zza = exc;
            this.zzb = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.zzb) {
            Exception exc2 = this.zza;
            if (exc2 != exc) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(exc2, exc);
                } catch (Exception unused) {
                }
            }
            Exception exc3 = this.zza;
            this.zza = null;
            throw exc3;
        }
    }
}
