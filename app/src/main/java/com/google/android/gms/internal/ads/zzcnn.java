package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcnn implements zzfvn {
    final /* synthetic */ String zza;
    final /* synthetic */ zzcno zzb;

    public zzcnn(zzcno zzcnoVar, String str) {
        this.zzb = zzcnoVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        zzfaj zzfajVar;
        zzfgf zzfgfVar;
        zzezr zzezrVar;
        zzezf zzezfVar;
        zzezf zzezfVar2;
        zzcno zzcnoVar = this.zzb;
        zzfajVar = zzcnoVar.zzh;
        zzfgfVar = zzcnoVar.zzg;
        zzezrVar = zzcnoVar.zze;
        zzezfVar = zzcnoVar.zzf;
        String str = this.zza;
        zzezfVar2 = zzcnoVar.zzf;
        zzfajVar.zza(zzfgfVar.zzd(zzezrVar, zzezfVar, false, str, null, zzezfVar2.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfaj zzfajVar;
        zzfgf zzfgfVar;
        zzezr zzezrVar;
        zzezf zzezfVar;
        zzezf zzezfVar2;
        String str = (String) obj;
        zzcno zzcnoVar = this.zzb;
        zzfajVar = zzcnoVar.zzh;
        zzfgfVar = zzcnoVar.zzg;
        zzezrVar = zzcnoVar.zze;
        zzezfVar = zzcnoVar.zzf;
        String str2 = this.zza;
        zzezfVar2 = zzcnoVar.zzf;
        zzfajVar.zza(zzfgfVar.zzd(zzezrVar, zzezfVar, false, str2, str, zzezfVar2.zzd));
    }
}
