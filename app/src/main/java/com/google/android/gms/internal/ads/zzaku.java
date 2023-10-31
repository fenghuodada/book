package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
public final class zzaku extends Thread {
    private static final boolean zza = zzalu.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzaks zzd;
    private volatile boolean zze = false;
    private final zzalv zzf;
    private final zzakz zzg;

    public zzaku(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzaks zzaksVar, zzakz zzakzVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzaksVar;
        this.zzg = zzakzVar;
        this.zzf = new zzalv(this, blockingQueue2, zzakzVar);
    }

    private void zzc() throws InterruptedException {
        zzakz zzakzVar;
        zzali zzaliVar = (zzali) this.zzb.take();
        zzaliVar.zzm("cache-queue-take");
        zzaliVar.zzt(1);
        try {
            zzaliVar.zzw();
            zzakr zza2 = this.zzd.zza(zzaliVar.zzj());
            if (zza2 == null) {
                zzaliVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzaliVar)) {
                    this.zzc.put(zzaliVar);
                }
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (zza2.zza(currentTimeMillis)) {
                zzaliVar.zzm("cache-hit-expired");
                zzaliVar.zze(zza2);
                if (!this.zzf.zzc(zzaliVar)) {
                    this.zzc.put(zzaliVar);
                }
                return;
            }
            zzaliVar.zzm("cache-hit");
            zzalo zzh = zzaliVar.zzh(new zzale(zza2.zza, zza2.zzg));
            zzaliVar.zzm("cache-hit-parsed");
            if (!zzh.zzc()) {
                zzaliVar.zzm("cache-parsing-failed");
                this.zzd.zzc(zzaliVar.zzj(), true);
                zzaliVar.zze(null);
                if (!this.zzf.zzc(zzaliVar)) {
                    this.zzc.put(zzaliVar);
                }
                return;
            }
            if (zza2.zzf < currentTimeMillis) {
                zzaliVar.zzm("cache-hit-refresh-needed");
                zzaliVar.zze(zza2);
                zzh.zzd = true;
                if (!this.zzf.zzc(zzaliVar)) {
                    this.zzg.zzb(zzaliVar, zzh, new zzakt(this, zzaliVar));
                }
                zzakzVar = this.zzg;
            } else {
                zzakzVar = this.zzg;
            }
            zzakzVar.zzb(zzaliVar, zzh, null);
        } finally {
            zzaliVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzalu.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzalu.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
