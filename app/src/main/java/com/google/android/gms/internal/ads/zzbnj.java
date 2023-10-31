package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class zzbnj implements zzbiv {
    final /* synthetic */ zzbnk zza;
    private final zzcal zzb;

    public zzbnj(zzbnk zzbnkVar, zzcal zzcalVar) {
        this.zza = zzbnkVar;
        this.zzb = zzcalVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final void zza(@Nullable String str) {
        try {
            if (str == null) {
                this.zzb.zze(new zzbmn());
            } else {
                this.zzb.zze(new zzbmn(str));
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final void zzb(JSONObject jSONObject) {
        try {
            this.zzb.zzd(jSONObject);
        } catch (IllegalStateException unused) {
        } catch (JSONException e) {
            this.zzb.zze(e);
        }
    }
}
