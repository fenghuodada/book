package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzakz {
    private final Executor zza;

    public zzakz(Handler handler) {
        this.zza = new zzakx(this, handler);
    }

    public final void zza(zzali zzaliVar, zzalr zzalrVar) {
        zzaliVar.zzm("post-error");
        zzalo zza = zzalo.zza(zzalrVar);
        Executor executor = this.zza;
        ((zzakx) executor).zza.post(new zzaky(zzaliVar, zza, null));
    }

    public final void zzb(zzali zzaliVar, zzalo zzaloVar, Runnable runnable) {
        zzaliVar.zzq();
        zzaliVar.zzm("post-response");
        Executor executor = this.zza;
        ((zzakx) executor).zza.post(new zzaky(zzaliVar, zzaloVar, runnable));
    }
}
