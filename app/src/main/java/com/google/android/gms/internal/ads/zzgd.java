package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzgd implements zzfw {
    private final Context zza;
    private final zzfw zzb;

    public zzgd(Context context) {
        zzgf zzgfVar = new zzgf();
        this.zza = context.getApplicationContext();
        this.zzb = zzgfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfw
    public final /* bridge */ /* synthetic */ zzfx zza() {
        return new zzge(this.zza, ((zzgf) this.zzb).zza());
    }
}
