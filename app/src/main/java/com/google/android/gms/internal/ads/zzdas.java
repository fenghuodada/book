package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class zzdas {
    protected final Map zza = new HashMap();

    public zzdas(Set set) {
        zzo(set);
    }

    public final synchronized void zzj(zzdco zzdcoVar) {
        zzm(zzdcoVar.zza, zzdcoVar.zzb);
    }

    public final synchronized void zzm(Object obj, Executor executor) {
        this.zza.put(obj, executor);
    }

    public final synchronized void zzo(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzj((zzdco) it.next());
        }
    }

    public final synchronized void zzp(final zzdar zzdarVar) {
        for (Map.Entry entry : this.zza.entrySet()) {
            final Object key = entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdaq
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        zzdar.this.zza(key);
                    } catch (Throwable th) {
                        com.google.android.gms.ads.internal.zzt.zzo().zzt(th, "EventEmitter.notify");
                        com.google.android.gms.ads.internal.util.zze.zzb("Event emitter exception.", th);
                    }
                }
            });
        }
    }
}
