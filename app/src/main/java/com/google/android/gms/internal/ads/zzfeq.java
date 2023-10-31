package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfeq implements zzfen {
    private final zzfen zza;
    private final Queue zzb = new LinkedBlockingQueue();
    private final int zzc = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzig)).intValue();
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public zzfeq(zzfen zzfenVar, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfenVar;
        long intValue = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzif)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfep
            @Override // java.lang.Runnable
            public final void run() {
                zzfeq.zzc(zzfeq.this);
            }
        }, intValue, intValue, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void zzc(zzfeq zzfeqVar) {
        while (!zzfeqVar.zzb.isEmpty()) {
            zzfeqVar.zza.zzb((zzfem) zzfeqVar.zzb.remove());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfen
    public final String zza(zzfem zzfemVar) {
        return this.zza.zza(zzfemVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfen
    public final void zzb(zzfem zzfemVar) {
        if (this.zzb.size() < this.zzc) {
            this.zzb.offer(zzfemVar);
        } else if (this.zzd.getAndSet(true)) {
        } else {
            Queue queue = this.zzb;
            zzfem zzb = zzfem.zzb("dropped_event");
            Map zzj = zzfemVar.zzj();
            if (zzj.containsKey("action")) {
                zzb.zza("dropped_action", (String) zzj.get("action"));
            }
            queue.offer(zzb);
        }
    }
}
