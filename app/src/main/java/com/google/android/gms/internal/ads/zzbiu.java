package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbiu implements zzbiv {
    final /* synthetic */ zzcal zza;

    public zzbiu(zzbiw zzbiwVar, zzcal zzcalVar) {
        this.zza = zzcalVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final void zza(@Nullable String str) {
        this.zza.zze(new zzbmn(str));
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final void zzb(JSONObject jSONObject) {
        this.zza.zzd(jSONObject);
    }
}
