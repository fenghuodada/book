package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes.dex */
final class zzdvv implements zzcyd {
    private final Context zza;
    private final zzbxy zzb;

    public zzdvv(Context context, zzbxy zzbxyVar) {
        this.zza = context;
        this.zzb = zzbxyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzb(zzezr zzezrVar) {
        if (TextUtils.isEmpty(zzezrVar.zzb.zzb.zzd)) {
            return;
        }
        this.zzb.zzp(this.zza, zzezrVar.zza.zza.zzd);
        this.zzb.zzl(this.zza, zzezrVar.zzb.zzb.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzcyd
    public final void zzbA(zzbug zzbugVar) {
    }
}
