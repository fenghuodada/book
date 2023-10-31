package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class zzcgx {
    private zzbzz zza;
    private Context zzb;
    private WeakReference zzc;

    public final zzcgx zzc(Context context) {
        this.zzc = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.zzb = context;
        return this;
    }

    public final zzcgx zzd(zzbzz zzbzzVar) {
        this.zza = zzbzzVar;
        return this;
    }
}
