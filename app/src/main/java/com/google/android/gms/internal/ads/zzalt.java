package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzalt {
    public static final boolean zza = zzalu.zzb;
    private final List zzb = new ArrayList();
    private boolean zzc = false;

    public final void finalize() throws Throwable {
        if (this.zzc) {
            return;
        }
        zzb("Request on the loose");
        zzalu.zzb("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
    }

    public final synchronized void zza(String str, long j) {
        if (this.zzc) {
            throw new IllegalStateException("Marker added to finished log");
        }
        this.zzb.add(new zzals(str, j, SystemClock.elapsedRealtime()));
    }

    public final synchronized void zzb(String str) {
        List list;
        long j;
        this.zzc = true;
        if (this.zzb.size() == 0) {
            j = 0;
        } else {
            j = ((zzals) this.zzb.get(list.size() - 1)).zzc - ((zzals) this.zzb.get(0)).zzc;
        }
        if (j <= 0) {
            return;
        }
        long j2 = ((zzals) this.zzb.get(0)).zzc;
        zzalu.zza("(%-4d ms) %s", Long.valueOf(j), str);
        for (zzals zzalsVar : this.zzb) {
            long j3 = zzalsVar.zzc;
            zzalu.zza("(+%-4d) [%2d] %s", Long.valueOf(j3 - j2), Long.valueOf(zzalsVar.zzb), zzalsVar.zza);
            j2 = j3;
        }
    }
}
