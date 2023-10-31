package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzdff implements zzcri {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final zzgwb zzd;
    private final zzdhn zze;

    public zzdff(Map map, Map map2, Map map3, zzgwb zzgwbVar, zzdhn zzdhnVar) {
        this.zza = map;
        this.zzb = map2;
        this.zzc = map3;
        this.zzd = zzgwbVar;
        this.zze = zzdhnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcri
    @Nullable
    public final zzebv zza(int i, String str) {
        zzebv zza;
        zzebv zzebvVar = (zzebv) this.zza.get(str);
        if (zzebvVar != null) {
            return zzebvVar;
        }
        if (i == 1) {
            if (this.zze.zze() == null || (zza = ((zzcri) this.zzd.zzb()).zza(i, str)) == null) {
                return null;
            }
            return zzcrm.zza(zza);
        } else if (i != 4) {
            return null;
        } else {
            zzeej zzeejVar = (zzeej) this.zzc.get(str);
            if (zzeejVar != null) {
                return new zzebw(zzeejVar, new zzfon() { // from class: com.google.android.gms.internal.ads.zzcrk
                    @Override // com.google.android.gms.internal.ads.zzfon
                    public final Object apply(Object obj) {
                        return new zzcrm((List) obj);
                    }
                });
            }
            zzebv zzebvVar2 = (zzebv) this.zzb.get(str);
            if (zzebvVar2 == null) {
                return null;
            }
            return zzcrm.zza(zzebvVar2);
        }
    }
}
