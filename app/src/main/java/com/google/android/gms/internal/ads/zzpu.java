package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(29)
/* loaded from: classes.dex */
public final class zzpu {
    final /* synthetic */ zzpw zza;
    private final Handler zzb = new Handler(Looper.myLooper());
    private final AudioTrack.StreamEventCallback zzc;

    public zzpu(zzpw zzpwVar) {
        this.zza = zzpwVar;
        this.zzc = new zzpt(this, zzpwVar);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.zzps] */
    public final void zza(AudioTrack audioTrack) {
        final Handler handler = this.zzb;
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.zzps
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.zzc);
    }

    public final void zzb(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}
