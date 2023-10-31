package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class zzdvc implements zzfvn {
    final /* synthetic */ zzdvd zza;

    public zzdvc(zzdvd zzdvdVar) {
        this.zza = zzdvdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final void zza(Throwable th) {
        Pattern pattern;
        zzdzz zzdzzVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfU)).booleanValue()) {
            pattern = zzdvd.zza;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzdzzVar = this.zza.zzf;
                zzdzzVar.zzi(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvn
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdzz zzdzzVar;
        zzdzz zzdzzVar2;
        zzezr zzezrVar = (zzezr) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzfU)).booleanValue()) {
            zzdzzVar = this.zza.zzf;
            zzdzzVar.zzi(zzezrVar.zzb.zzb.zze);
            zzdzzVar2 = this.zza.zzf;
            zzdzzVar2.zzj(zzezrVar.zzb.zzb.zzf);
        }
    }
}
