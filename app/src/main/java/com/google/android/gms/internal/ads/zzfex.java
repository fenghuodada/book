package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfex {
    private final String zza = (String) zzbcx.zzb.zze();

    public final String zza(Map map) {
        Uri.Builder buildUpon = Uri.parse(this.zza).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }
}
