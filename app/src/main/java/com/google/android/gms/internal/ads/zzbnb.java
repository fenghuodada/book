package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbnb implements zzbiv {
    final /* synthetic */ zzbnc zza;
    private final zzbme zzb;
    private final zzcal zzc;

    public zzbnb(zzbnc zzbncVar, zzbme zzbmeVar, zzcal zzcalVar) {
        this.zza = zzbncVar;
        this.zzb = zzbmeVar;
        this.zzc = zzcalVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final void zza(@Nullable String str) {
        try {
            if (str == null) {
                this.zzc.zze(new zzbmn());
            } else {
                this.zzc.zze(new zzbmn(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            this.zzb.zzb();
            throw th;
        }
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbiv
    public final void zzb(JSONObject jSONObject) {
        zzbmq zzbmqVar;
        try {
            try {
                zzcal zzcalVar = this.zzc;
                zzbmqVar = this.zza.zza;
                zzcalVar.zzd(zzbmqVar.zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.zzc.zze(e);
            }
        } finally {
            this.zzb.zzb();
        }
    }
}
