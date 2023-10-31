package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgeg {
    private final Map zza;
    private final Map zzb;

    public zzgeg() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public zzgeg(zzgek zzgekVar) {
        this.zza = new HashMap(zzgek.zzd(zzgekVar));
        this.zzb = new HashMap(zzgek.zze(zzgekVar));
    }

    public final zzgeg zza(zzgee zzgeeVar) throws GeneralSecurityException {
        zzgei zzgeiVar = new zzgei(zzgeeVar.zzc(), zzgeeVar.zzd(), null);
        if (this.zza.containsKey(zzgeiVar)) {
            zzgee zzgeeVar2 = (zzgee) this.zza.get(zzgeiVar);
            if (!zzgeeVar2.equals(zzgeeVar) || !zzgeeVar.equals(zzgeeVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgeiVar.toString()));
            }
        } else {
            this.zza.put(zzgeiVar, zzgeeVar);
        }
        return this;
    }

    public final zzgeg zzb(zzfyb zzfybVar) throws GeneralSecurityException {
        if (zzfybVar != null) {
            Map map = this.zzb;
            Class zzb = zzfybVar.zzb();
            if (map.containsKey(zzb)) {
                zzfyb zzfybVar2 = (zzfyb) this.zzb.get(zzb);
                if (!zzfybVar2.equals(zzfybVar) || !zzfybVar.equals(zzfybVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb.toString()));
                }
            } else {
                this.zzb.put(zzb, zzfybVar);
            }
            return this;
        }
        throw new NullPointerException("wrapper must be non-null");
    }
}
