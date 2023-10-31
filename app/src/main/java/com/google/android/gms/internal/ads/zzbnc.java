package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.ads.mediation.facebook.FacebookAdapter;
import java.util.UUID;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzbnc implements zzbmo {
    private final zzbmq zza;
    private final zzbmr zzb;
    private final zzbmk zzc;
    private final String zzd;

    public zzbnc(zzbmk zzbmkVar, String str, zzbmr zzbmrVar, zzbmq zzbmqVar) {
        this.zzc = zzbmkVar;
        this.zzd = str;
        this.zzb = zzbmrVar;
        this.zza = zzbmqVar;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzbnc zzbncVar, zzbme zzbmeVar, zzbml zzbmlVar, Object obj, zzcal zzcalVar) {
        try {
            com.google.android.gms.ads.internal.zzt.zzp();
            String uuid = UUID.randomUUID().toString();
            zzbih.zzo.zzc(uuid, new zzbnb(zzbncVar, zzbmeVar, zzcalVar));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(FacebookAdapter.KEY_ID, uuid);
            jSONObject.put("args", zzbncVar.zzb.zzb(obj));
            zzbmlVar.zzl(zzbncVar.zzd, jSONObject);
        } catch (Exception e) {
            try {
                zzcalVar.zze(e);
                zzbzt.zzh("Unable to invokeJavascript", e);
            } finally {
                zzbmeVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final zzfwb zza(@Nullable Object obj) throws Exception {
        return zzb(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzbmo
    public final zzfwb zzb(Object obj) {
        zzcal zzcalVar = new zzcal();
        zzbme zzb = this.zzc.zzb(null);
        zzb.zzi(new zzbmz(this, zzb, obj, zzcalVar), new zzbna(this, zzcalVar, zzb));
        return zzcalVar;
    }
}
