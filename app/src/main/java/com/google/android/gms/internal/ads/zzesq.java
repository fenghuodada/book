package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzesq implements zzeqq {
    final zzfwc zza;
    final Context zzb;
    final zzawm zzc;

    public zzesq(zzawm zzawmVar, zzfwc zzfwcVar, Context context) {
        this.zzc = zzawmVar;
        this.zza = zzfwcVar;
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 45;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzesr(new JSONObject());
            }
        });
    }
}
