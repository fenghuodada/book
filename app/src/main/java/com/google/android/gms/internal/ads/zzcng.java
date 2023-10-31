package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzcng implements zzcvl {
    private final zzezi zza;
    private final zzezr zzb;
    private final zzfgf zzc;
    private final zzfgj zzd;

    public zzcng(zzezr zzezrVar, zzfgj zzfgjVar, zzfgf zzfgfVar) {
        this.zzb = zzezrVar;
        this.zzd = zzfgjVar;
        this.zzc = zzfgfVar;
        this.zza = zzezrVar.zzb.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcvl
    public final void zza(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzd.zzd(this.zzc.zzc(this.zzb, null, this.zza.zza));
    }
}
