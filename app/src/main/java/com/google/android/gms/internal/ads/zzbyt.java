package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzbyt {
    public final zzfwb zza(Context context, int i) {
        zzcal zzcalVar = new zzcal();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        if (zzbzm.zzt(context)) {
            zzcag.zza.execute(new zzbys(this, context, zzcalVar));
        }
        return zzcalVar;
    }
}
