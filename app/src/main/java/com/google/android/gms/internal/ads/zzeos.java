package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeos implements zzeqq {
    private final zzfwc zza;
    private final Context zzb;
    private final Set zzc;

    public zzeos(zzfwc zzfwcVar, Context context, Set set) {
        this.zza = zzfwcVar;
        this.zzb = context;
        this.zzc = set;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 27;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeor
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeos.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzeot zzc() throws Exception {
        zzbbc zzbbcVar = zzbbk.zzeK;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar)).booleanValue()) {
            Set set = this.zzc;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                com.google.android.gms.ads.internal.zzt.zzA();
                return new zzeot(true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbcVar)).booleanValue() ? "a.1.3.37-google_20220829" : null);
            }
        }
        return new zzeot(null);
    }
}
