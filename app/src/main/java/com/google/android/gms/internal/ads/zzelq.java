package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzelq implements zzeqq {
    private final Executor zza;
    private final zzbzc zzb;

    public zzelq(Executor executor, zzbzc zzbzcVar) {
        this.zza = executor;
        this.zzb = zzbzcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 10;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbbk.zzct)).booleanValue() ? zzfvr.zzh(null) : zzfvr.zzl(this.zzb.zzj(), new zzfon() { // from class: com.google.android.gms.internal.ads.zzelo
            @Override // com.google.android.gms.internal.ads.zzfon
            public final Object apply(Object obj) {
                final ArrayList arrayList = (ArrayList) obj;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new zzeqp() { // from class: com.google.android.gms.internal.ads.zzelp
                    @Override // com.google.android.gms.internal.ads.zzeqp
                    public final void zzh(Object obj2) {
                        ((Bundle) obj2).putStringArrayList("android_permissions", arrayList);
                    }
                };
            }
        }, this.zza);
    }
}
