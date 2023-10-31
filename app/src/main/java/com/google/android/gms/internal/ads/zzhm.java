package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzhm {
    private final Context zza;
    private final zzhk zzb;

    public zzhm(Context context, Handler handler, zzhl zzhlVar) {
        this.zza = context.getApplicationContext();
        this.zzb = new zzhk(this, handler, zzhlVar);
    }
}
