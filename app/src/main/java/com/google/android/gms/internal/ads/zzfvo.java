package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfvo implements Runnable {
    final Future zza;
    final zzfvn zzb;

    public zzfvo(Future future, zzfvn zzfvnVar) {
        this.zza = future;
        this.zzb = zzfvnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable zza;
        Future future = this.zza;
        if ((future instanceof zzfwu) && (zza = zzfwv.zza((zzfwu) future)) != null) {
            this.zzb.zza(zza);
            return;
        }
        try {
            this.zzb.zzb(zzfvr.zzo(this.zza));
        } catch (Error e) {
            e = e;
            this.zzb.zza(e);
        } catch (RuntimeException e2) {
            e = e2;
            this.zzb.zza(e);
        } catch (ExecutionException e3) {
            this.zzb.zza(e3.getCause());
        }
    }

    public final String toString() {
        zzfos zza = zzfot.zza(this);
        zza.zza(this.zzb);
        return zza.toString();
    }
}
