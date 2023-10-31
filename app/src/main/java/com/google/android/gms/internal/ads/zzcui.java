package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class zzcui implements zzcww, zzcwd {
    private final Context zza;
    private final zzezf zzb;
    private final zzbsa zzc;

    public zzcui(Context context, zzezf zzezfVar, zzbsa zzbsaVar) {
        this.zza = context;
        this.zzb = zzezfVar;
        this.zzc = zzbsaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final void zzbn(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final void zzbp(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final void zzbq(@Nullable Context context) {
    }

    @Override // com.google.android.gms.internal.ads.zzcww
    public final void zzn() {
        zzbsb zzbsbVar = this.zzb.zzae;
        if (zzbsbVar == null || !zzbsbVar.zza) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.zzb.zzae.zzb.isEmpty()) {
            return;
        }
        arrayList.add(this.zzb.zzae.zzb);
    }
}
