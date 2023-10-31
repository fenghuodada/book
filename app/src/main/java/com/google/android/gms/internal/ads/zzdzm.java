package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdzm implements zzfee {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final zzfem zzc;

    public zzdzm(Set set, zzfem zzfemVar) {
        zzfdx zzfdxVar;
        String str;
        zzfdx zzfdxVar2;
        String str2;
        this.zzc = zzfemVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdzl zzdzlVar = (zzdzl) it.next();
            Map map = this.zza;
            zzfdxVar = zzdzlVar.zzb;
            str = zzdzlVar.zza;
            map.put(zzfdxVar, str);
            Map map2 = this.zzb;
            zzfdxVar2 = zzdzlVar.zzc;
            str2 = zzdzlVar.zza;
            map2.put(zzfdxVar2, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzbB(zzfdx zzfdxVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzbC(zzfdx zzfdxVar, String str, Throwable th) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "f.");
        if (this.zzb.containsKey(zzfdxVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfdxVar))), "f.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzc(zzfdx zzfdxVar, String str) {
        this.zzc.zzd("task.".concat(String.valueOf(str)));
        if (this.zza.containsKey(zzfdxVar)) {
            this.zzc.zzd("label.".concat(String.valueOf((String) this.zza.get(zzfdxVar))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzd(zzfdx zzfdxVar, String str) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "s.");
        if (this.zzb.containsKey(zzfdxVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfdxVar))), "s.");
        }
    }
}
