package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzxj {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzxk zzxkVar) {
        zzc(zzxkVar);
        this.zza.add(new zzxi(handler, zzxkVar));
    }

    public final void zzb(final int i, final long j, final long j2) {
        boolean z;
        Handler handler;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final zzxi zzxiVar = (zzxi) it.next();
            z = zzxiVar.zzc;
            if (!z) {
                handler = zzxiVar.zza;
                handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzxh
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzxk zzxkVar;
                        zzxi zzxiVar2 = zzxi.this;
                        int i2 = i;
                        long j3 = j;
                        long j4 = j2;
                        zzxkVar = zzxiVar2.zzb;
                        zzxkVar.zzY(i2, j3, j4);
                    }
                });
            }
        }
    }

    public final void zzc(zzxk zzxkVar) {
        zzxk zzxkVar2;
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzxi zzxiVar = (zzxi) it.next();
            zzxkVar2 = zzxiVar.zzb;
            if (zzxkVar2 == zzxkVar) {
                zzxiVar.zzc();
                this.zza.remove(zzxiVar);
            }
        }
    }
}
