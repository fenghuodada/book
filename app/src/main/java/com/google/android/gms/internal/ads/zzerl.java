package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzerl implements zzeqq {
    private final Executor zza;
    private final String zzb;
    @Nullable
    private final PackageInfo zzc;
    private final zzbyt zzd;

    public zzerl(zzbyt zzbytVar, Executor executor, String str, @Nullable PackageInfo packageInfo, int i) {
        this.zzd = zzbytVar;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 41;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return zzfvr.zzf(zzfvr.zzl(zzfvr.zzh(this.zzb), new zzfon() { // from class: com.google.android.gms.internal.ads.zzerj
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                return new zzerm((String) obj);
            }
        }, this.zza), Throwable.class, new zzfuy() { // from class: com.google.android.gms.internal.ads.zzerk
            @Override // com.google.android.gms.internal.ads.zzfuy
            public final zzfwb zza(Object obj) {
                return zzerl.this.zzc((Throwable) obj);
            }
        }, this.zza);
    }

    public final /* synthetic */ zzfwb zzc(Throwable th) throws Exception {
        return zzfvr.zzh(new zzerm(this.zzb));
    }
}
