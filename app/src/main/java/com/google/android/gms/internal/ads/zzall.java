package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class zzall {
    private final AtomicInteger zza;
    private final Set zzb;
    private final PriorityBlockingQueue zzc;
    private final PriorityBlockingQueue zzd;
    private final zzaks zze;
    private final zzalb zzf;
    private final zzalc[] zzg;
    private zzaku zzh;
    private final List zzi;
    private final List zzj;
    private final zzakz zzk;

    public zzall(zzaks zzaksVar, zzalb zzalbVar, int i) {
        zzakz zzakzVar = new zzakz(new Handler(Looper.getMainLooper()));
        this.zza = new AtomicInteger();
        this.zzb = new HashSet();
        this.zzc = new PriorityBlockingQueue();
        this.zzd = new PriorityBlockingQueue();
        this.zzi = new ArrayList();
        this.zzj = new ArrayList();
        this.zze = zzaksVar;
        this.zzf = zzalbVar;
        this.zzg = new zzalc[4];
        this.zzk = zzakzVar;
    }

    public final zzali zza(zzali zzaliVar) {
        zzaliVar.zzf(this);
        synchronized (this.zzb) {
            this.zzb.add(zzaliVar);
        }
        zzaliVar.zzg(this.zza.incrementAndGet());
        zzaliVar.zzm("add-to-queue");
        zzc(zzaliVar, 0);
        this.zzc.add(zzaliVar);
        return zzaliVar;
    }

    public final void zzb(zzali zzaliVar) {
        synchronized (this.zzb) {
            this.zzb.remove(zzaliVar);
        }
        synchronized (this.zzi) {
            for (zzalk zzalkVar : this.zzi) {
                zzalkVar.zza();
            }
        }
        zzc(zzaliVar, 5);
    }

    public final void zzc(zzali zzaliVar, int i) {
        synchronized (this.zzj) {
            for (zzalj zzaljVar : this.zzj) {
                zzaljVar.zza();
            }
        }
    }

    public final void zzd() {
        zzaku zzakuVar = this.zzh;
        if (zzakuVar != null) {
            zzakuVar.zzb();
        }
        zzalc[] zzalcVarArr = this.zzg;
        for (int i = 0; i < 4; i++) {
            zzalc zzalcVar = zzalcVarArr[i];
            if (zzalcVar != null) {
                zzalcVar.zza();
            }
        }
        zzaku zzakuVar2 = new zzaku(this.zzc, this.zzd, this.zze, this.zzk);
        this.zzh = zzakuVar2;
        zzakuVar2.start();
        for (int i2 = 0; i2 < 4; i2++) {
            zzalc zzalcVar2 = new zzalc(this.zzd, this.zzf, this.zze, this.zzk);
            this.zzg[i2] = zzalcVar2;
            zzalcVar2.start();
        }
    }
}
