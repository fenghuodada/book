package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzesb implements zzeqq {
    private final Context zza;
    private final String zzb;
    private final zzfwc zzc;

    public zzesb(@Nullable zzbui zzbuiVar, Context context, String str, zzfwc zzfwcVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzfwcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final int zza() {
        return 42;
    }

    @Override // com.google.android.gms.internal.ads.zzeqq
    public final zzfwb zzb() {
        return this.zzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzesa
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzesc(new JSONObject());
            }
        });
    }
}
