package com.google.android.gms.internal.ads;

import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeuc implements zzeqq {
    private final zzfwc zza;

    public zzeuc(zzfwc zzfwcVar) {
        this.zza = zzfwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 51;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeub
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String[] split;
                HashMap hashMap = new HashMap();
                String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzL);
                if (str != null && !str.isEmpty()) {
                    if (Build.VERSION.SDK_INT >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzM)).intValue()) {
                        for (String str2 : str.split(",", -1)) {
                            hashMap.put(str2, com.google.android.gms.ads.internal.util.zzch.zza(str2));
                        }
                    }
                }
                return new zzeud(hashMap);
            }
        });
    }
}
