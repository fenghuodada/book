package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class zzfae {
    public static com.google.android.gms.ads.internal.client.zzq zza(Context context, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzezg zzezgVar = (zzezg) it.next();
            if (zzezgVar.zzc) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(zzezgVar.zza, zzezgVar.zzb));
            }
        }
        return new com.google.android.gms.ads.internal.client.zzq(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    public static zzezg zzb(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzqVar.zzi ? new zzezg(-3, 0, true) : new zzezg(zzqVar.zze, zzqVar.zzb, false);
    }
}
