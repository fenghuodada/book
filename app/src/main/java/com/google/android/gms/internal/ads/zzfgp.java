package com.google.android.gms.internal.ads;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfgp {
    private final zzfgw zza;
    private final zzfgw zzb;
    private final zzfgt zzc;
    private final zzfgv zzd;

    private zzfgp(zzfgt zzfgtVar, zzfgv zzfgvVar, zzfgw zzfgwVar, zzfgw zzfgwVar2, boolean z) {
        this.zzc = zzfgtVar;
        this.zzd = zzfgvVar;
        this.zza = zzfgwVar;
        if (zzfgwVar2 == null) {
            this.zzb = zzfgw.NONE;
        } else {
            this.zzb = zzfgwVar2;
        }
    }

    public static zzfgp zza(zzfgt zzfgtVar, zzfgv zzfgvVar, zzfgw zzfgwVar, zzfgw zzfgwVar2, boolean z) {
        zzfhv.zzb(zzfgvVar, "ImpressionType is null");
        zzfhv.zzb(zzfgwVar, "Impression owner is null");
        if (zzfgwVar != zzfgw.NONE) {
            if (zzfgtVar == zzfgt.DEFINED_BY_JAVASCRIPT && zzfgwVar == zzfgw.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            if (zzfgvVar == zzfgv.DEFINED_BY_JAVASCRIPT && zzfgwVar == zzfgw.NATIVE) {
                throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            }
            return new zzfgp(zzfgtVar, zzfgvVar, zzfgwVar, zzfgwVar2, true);
        }
        throw new IllegalArgumentException("Impression owner is none");
    }

    public final JSONObject zzb() {
        JSONObject jSONObject = new JSONObject();
        zzfht.zze(jSONObject, "impressionOwner", this.zza);
        zzfht.zze(jSONObject, "mediaEventsOwner", this.zzb);
        zzfht.zze(jSONObject, "creativeType", this.zzc);
        zzfht.zze(jSONObject, "impressionType", this.zzd);
        zzfht.zze(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
