package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;

/* loaded from: classes.dex */
public final class zzekd implements zzeqq {
    private final Context zza;

    public zzekd(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        zzeke zzekeVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzcB)).booleanValue()) {
            zzekeVar = new zzeke(ContextCompat.m12040a(this.zza, "com.google.android.gms.permission.AD_ID") == 0);
        } else {
            zzekeVar = null;
        }
        return zzfvr.zzh(zzekeVar);
    }
}
