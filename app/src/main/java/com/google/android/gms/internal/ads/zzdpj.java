package com.google.android.gms.internal.ads;

import java.util.Map;

/* loaded from: classes.dex */
public final class zzdpj implements zzfee {
    private final Map zza;
    private final zzawx zzb;

    public zzdpj(zzawx zzawxVar, Map map) {
        this.zza = map;
        this.zzb = zzawxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzbB(zzfdx zzfdxVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzbC(zzfdx zzfdxVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfdxVar)) {
            this.zzb.zzc(((zzdpi) this.zza.get(zzfdxVar)).zzc);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzc(zzfdx zzfdxVar, String str) {
        if (this.zza.containsKey(zzfdxVar)) {
            this.zzb.zzc(((zzdpi) this.zza.get(zzfdxVar)).zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfee
    public final void zzd(zzfdx zzfdxVar, String str) {
        if (this.zza.containsKey(zzfdxVar)) {
            this.zzb.zzc(((zzdpi) this.zza.get(zzfdxVar)).zzb);
        }
    }
}
