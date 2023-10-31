package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
final class zzcnm implements zzfvn {
    final /* synthetic */ zzcno zza;

    public zzcnm(zzcno zzcnoVar) {
        this.zza = zzcnoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfaj zzfajVar;
        zzfgf zzfgfVar;
        zzezr zzezrVar;
        zzezf zzezfVar;
        zzezf zzezfVar2;
        Context context;
        String str = (String) obj;
        zzcno zzcnoVar = this.zza;
        zzfajVar = zzcnoVar.zzh;
        zzfgfVar = zzcnoVar.zzg;
        zzezrVar = zzcnoVar.zze;
        zzezfVar = zzcnoVar.zzf;
        zzezfVar2 = zzcnoVar.zzf;
        List zzd = zzfgfVar.zzd(zzezrVar, zzezfVar, false, "", str, zzezfVar2.zzc);
        zzbzc zzo = com.google.android.gms.ads.internal.zzt.zzo();
        context = this.zza.zza;
        zzfajVar.zzc(zzd, true == zzo.zzx(context) ? 2 : 1);
    }
}
