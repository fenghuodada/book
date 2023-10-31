package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdgv implements zzaty {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdgx zzb;

    public zzdgv(zzdgx zzdgxVar, String str) {
        this.zzb = zzdgxVar;
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaty
    public final void zzc(zzatx zzatxVar) {
        Map map;
        zzdiy zzdiyVar;
        zzdiy zzdiyVar2;
        zzdiy zzdiyVar3;
        zzdiy zzdiyVar4;
        Map map2;
        zzdiy zzdiyVar5;
        zzdiy zzdiyVar6;
        zzdiy zzdiyVar7;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzbD)).booleanValue()) {
            if (zzatxVar.zzj) {
                map = this.zzb.zzy;
                map.put(this.zza, Boolean.TRUE);
                zzdgx zzdgxVar = this.zzb;
                zzdiyVar = zzdgxVar.zzo;
                View zzf = zzdiyVar.zzf();
                zzdiyVar2 = this.zzb.zzo;
                Map zzl = zzdiyVar2.zzl();
                zzdiyVar3 = this.zzb.zzo;
                zzdgxVar.zzA(zzf, zzl, zzdiyVar3.zzm(), true);
                return;
            }
            return;
        }
        synchronized (this) {
            if (zzatxVar.zzj) {
                zzdgx zzdgxVar2 = this.zzb;
                zzdiyVar4 = zzdgxVar2.zzo;
                if (zzdiyVar4 == null) {
                    return;
                }
                map2 = zzdgxVar2.zzy;
                map2.put(this.zza, Boolean.TRUE);
                zzdgx zzdgxVar3 = this.zzb;
                zzdiyVar5 = zzdgxVar3.zzo;
                View zzf2 = zzdiyVar5.zzf();
                zzdiyVar6 = this.zzb.zzo;
                Map zzl2 = zzdiyVar6.zzl();
                zzdiyVar7 = this.zzb.zzo;
                zzdgxVar3.zzA(zzf2, zzl2, zzdiyVar7.zzm(), true);
            }
        }
    }
}
