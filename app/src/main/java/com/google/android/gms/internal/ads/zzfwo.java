package com.google.android.gms.internal.ads;

import androidx.core.content.C0663f;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfwo extends zzfvh {
    @CheckForNull
    private zzfwb zza;
    @CheckForNull
    private ScheduledFuture zzb;

    private zzfwo(zzfwb zzfwbVar) {
        zzfwbVar.getClass();
        this.zza = zzfwbVar;
    }

    public static zzfwb zzg(zzfwb zzfwbVar, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzfwo zzfwoVar = new zzfwo(zzfwbVar);
        zzfwl zzfwlVar = new zzfwl(zzfwoVar);
        zzfwoVar.zzb = scheduledExecutorService.schedule(zzfwlVar, j, timeUnit);
        zzfwbVar.zzc(zzfwlVar, zzfvf.INSTANCE);
        return zzfwoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    @CheckForNull
    public final String zza() {
        zzfwb zzfwbVar = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (zzfwbVar != null) {
            String m12005a = C0663f.m12005a("inputFuture=[", zzfwbVar.toString(), "]");
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    return m12005a + ", remaining delay=[" + delay + " ms]";
                }
                return m12005a;
            }
            return m12005a;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfuf
    public final void zzb() {
        zzs(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
