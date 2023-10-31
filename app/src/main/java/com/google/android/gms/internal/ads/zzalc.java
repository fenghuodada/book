package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class zzalc extends Thread {
    private final BlockingQueue zza;
    private final zzalb zzb;
    private final zzaks zzc;
    private volatile boolean zzd = false;
    private final zzakz zze;

    public zzalc(BlockingQueue blockingQueue, zzalb zzalbVar, zzaks zzaksVar, zzakz zzakzVar) {
        this.zza = blockingQueue;
        this.zzb = zzalbVar;
        this.zzc = zzaksVar;
        this.zze = zzakzVar;
    }

    private void zzb() throws InterruptedException {
        zzali zzaliVar = (zzali) this.zza.take();
        SystemClock.elapsedRealtime();
        zzaliVar.zzt(3);
        try {
            zzaliVar.zzm("network-queue-take");
            zzaliVar.zzw();
            TrafficStats.setThreadStatsTag(zzaliVar.zzc());
            zzale zza = this.zzb.zza(zzaliVar);
            zzaliVar.zzm("network-http-complete");
            if (zza.zze && zzaliVar.zzv()) {
                zzaliVar.zzp("not-modified");
                zzaliVar.zzr();
                return;
            }
            zzalo zzh = zzaliVar.zzh(zza);
            zzaliVar.zzm("network-parse-complete");
            if (zzh.zzb != null) {
                this.zzc.zzd(zzaliVar.zzj(), zzh.zzb);
                zzaliVar.zzm("network-cache-written");
            }
            zzaliVar.zzq();
            this.zze.zzb(zzaliVar, zzh, null);
            zzaliVar.zzs(zzh);
        } catch (zzalr e) {
            SystemClock.elapsedRealtime();
            this.zze.zza(zzaliVar, e);
            zzaliVar.zzr();
        } catch (Exception e2) {
            zzalu.zzc(e2, "Unhandled exception %s", e2.toString());
            zzalr zzalrVar = new zzalr(e2);
            SystemClock.elapsedRealtime();
            this.zze.zza(zzaliVar, zzalrVar);
            zzaliVar.zzr();
        } finally {
            zzaliVar.zzt(4);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                zzb();
            } catch (InterruptedException unused) {
                if (this.zzd) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzalu.zzb("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zza() {
        this.zzd = true;
        interrupt();
    }
}
