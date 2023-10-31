package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
final class zzalv implements zzalh {
    private final Map zza = new HashMap();
    @Nullable
    private final zzaku zzb;
    @Nullable
    private final BlockingQueue zzc;
    private final zzakz zzd;

    public zzalv(@NonNull zzaku zzakuVar, @NonNull BlockingQueue blockingQueue, zzakz zzakzVar) {
        this.zzd = zzakzVar;
        this.zzb = zzakuVar;
        this.zzc = blockingQueue;
    }

    @Override // com.google.android.gms.internal.ads.zzalh
    public final synchronized void zza(zzali zzaliVar) {
        String zzj = zzaliVar.zzj();
        List list = (List) this.zza.remove(zzj);
        if (list == null || list.isEmpty()) {
            return;
        }
        if (zzalu.zzb) {
            zzalu.zzd("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(list.size()), zzj);
        }
        zzali zzaliVar2 = (zzali) list.remove(0);
        this.zza.put(zzj, list);
        zzaliVar2.zzu(this);
        try {
            this.zzc.put(zzaliVar2);
        } catch (InterruptedException e) {
            zzalu.zzb("Couldn't add request to queue. %s", e.toString());
            Thread.currentThread().interrupt();
            this.zzb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalh
    public final void zzb(zzali zzaliVar, zzalo zzaloVar) {
        List<zzali> list;
        zzakr zzakrVar = zzaloVar.zzb;
        if (zzakrVar == null || zzakrVar.zza(System.currentTimeMillis())) {
            zza(zzaliVar);
            return;
        }
        String zzj = zzaliVar.zzj();
        synchronized (this) {
            list = (List) this.zza.remove(zzj);
        }
        if (list != null) {
            if (zzalu.zzb) {
                zzalu.zzd("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(list.size()), zzj);
            }
            for (zzali zzaliVar2 : list) {
                this.zzd.zzb(zzaliVar2, zzaloVar, null);
            }
        }
    }

    public final synchronized boolean zzc(zzali zzaliVar) {
        String zzj = zzaliVar.zzj();
        if (!this.zza.containsKey(zzj)) {
            this.zza.put(zzj, null);
            zzaliVar.zzu(this);
            if (zzalu.zzb) {
                zzalu.zza("new request, sending to network %s", zzj);
            }
            return false;
        }
        List list = (List) this.zza.get(zzj);
        if (list == null) {
            list = new ArrayList();
        }
        zzaliVar.zzm("waiting-for-response");
        list.add(zzaliVar);
        this.zza.put(zzj, list);
        if (zzalu.zzb) {
            zzalu.zza("Request for cacheKey=%s is in flight, putting on hold.", zzj);
        }
        return true;
    }
}
