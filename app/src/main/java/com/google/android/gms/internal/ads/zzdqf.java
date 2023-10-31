package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdqf implements zzfee {
    private final zzdpx zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdqf(zzdpx zzdpxVar, Set set, Clock clock) {
        zzfdx zzfdxVar;
        this.zzb = zzdpxVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdqe zzdqeVar = (zzdqe) it.next();
            Map map = this.zzd;
            zzfdxVar = zzdqeVar.zzc;
            map.put(zzfdxVar, zzdqeVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfdx zzfdxVar, boolean z) {
        zzfdx zzfdxVar2;
        String str;
        zzfdxVar2 = ((zzdqe) this.zzd.get(zzfdxVar)).zzb;
        if (this.zza.containsKey(zzfdxVar2)) {
            String str2 = true != z ? "f." : "s.";
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfdxVar2)).longValue();
            Map zza = this.zzb.zza();
            str = ((zzdqe) this.zzd.get(zzfdxVar)).zza;
            zza.put("label.".concat(str), str2.concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzbB(zzfdx zzfdxVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzbC(zzfdx zzfdxVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfdxVar)) {
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfdxVar)).longValue()))));
        }
        if (this.zzd.containsKey(zzfdxVar)) {
            zze(zzfdxVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzc(zzfdx zzfdxVar, String str) {
        this.zza.put(zzfdxVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzd(zzfdx zzfdxVar, String str) {
        if (this.zza.containsKey(zzfdxVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfdxVar)).longValue();
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfdxVar)) {
            zze(zzfdxVar, true);
        }
    }
}
