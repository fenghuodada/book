package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgeo {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzgeo() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public zzgeo(zzgeu zzgeuVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzgeuVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgeuVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzgeuVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzgeuVar.zzd;
        this.zzd = new HashMap(map4);
    }

    public final zzgeo zza(zzgda zzgdaVar) throws GeneralSecurityException {
        zzgeq zzgeqVar = new zzgeq(zzgdaVar.zzd(), zzgdaVar.zzc(), null);
        if (this.zzb.containsKey(zzgeqVar)) {
            zzgda zzgdaVar2 = (zzgda) this.zzb.get(zzgeqVar);
            if (!zzgdaVar2.equals(zzgdaVar) || !zzgdaVar.equals(zzgdaVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgeqVar.toString()));
            }
        } else {
            this.zzb.put(zzgeqVar, zzgdaVar);
        }
        return this;
    }

    public final zzgeo zzb(zzgde zzgdeVar) throws GeneralSecurityException {
        zzges zzgesVar = new zzges(zzgdeVar.zzb(), zzgdeVar.zzc(), null);
        if (this.zza.containsKey(zzgesVar)) {
            zzgde zzgdeVar2 = (zzgde) this.zza.get(zzgesVar);
            if (!zzgdeVar2.equals(zzgdeVar) || !zzgdeVar.equals(zzgdeVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgesVar.toString()));
            }
        } else {
            this.zza.put(zzgesVar, zzgdeVar);
        }
        return this;
    }

    public final zzgeo zzc(zzgdw zzgdwVar) throws GeneralSecurityException {
        zzgeq zzgeqVar = new zzgeq(zzgdwVar.zzc(), zzgdwVar.zzb(), null);
        if (this.zzd.containsKey(zzgeqVar)) {
            zzgdw zzgdwVar2 = (zzgdw) this.zzd.get(zzgeqVar);
            if (!zzgdwVar2.equals(zzgdwVar) || !zzgdwVar.equals(zzgdwVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzgeqVar.toString()));
            }
        } else {
            this.zzd.put(zzgeqVar, zzgdwVar);
        }
        return this;
    }

    public final zzgeo zzd(zzgea zzgeaVar) throws GeneralSecurityException {
        zzges zzgesVar = new zzges(zzgeaVar.zzb(), zzgeaVar.zzc(), null);
        if (this.zzc.containsKey(zzgesVar)) {
            zzgea zzgeaVar2 = (zzgea) this.zzc.get(zzgesVar);
            if (!zzgeaVar2.equals(zzgeaVar) || !zzgeaVar.equals(zzgeaVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzgesVar.toString()));
            }
        } else {
            this.zzc.put(zzgesVar, zzgeaVar);
        }
        return this;
    }
}
