package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbbo {
    public static List zza() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbcp.zzc("gad:dynamite_module:experiment_id", ""));
        zzc(arrayList, zzbda.zza);
        zzc(arrayList, zzbda.zzb);
        zzc(arrayList, zzbda.zzc);
        zzc(arrayList, zzbda.zzd);
        zzc(arrayList, zzbda.zze);
        zzc(arrayList, zzbda.zzu);
        zzc(arrayList, zzbda.zzf);
        zzc(arrayList, zzbda.zzm);
        zzc(arrayList, zzbda.zzn);
        zzc(arrayList, zzbda.zzo);
        zzc(arrayList, zzbda.zzp);
        zzc(arrayList, zzbda.zzq);
        zzc(arrayList, zzbda.zzr);
        zzc(arrayList, zzbda.zzs);
        zzc(arrayList, zzbda.zzt);
        zzc(arrayList, zzbda.zzg);
        zzc(arrayList, zzbda.zzh);
        zzc(arrayList, zzbda.zzi);
        zzc(arrayList, zzbda.zzj);
        zzc(arrayList, zzbda.zzk);
        zzc(arrayList, zzbda.zzl);
        return arrayList;
    }

    public static List zzb() {
        ArrayList arrayList = new ArrayList();
        zzc(arrayList, zzbdo.zza);
        return arrayList;
    }

    private static void zzc(List list, zzbcp zzbcpVar) {
        String str = (String) zzbcpVar.zze();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
