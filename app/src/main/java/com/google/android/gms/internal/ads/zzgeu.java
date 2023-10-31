package com.google.android.gms.internal.ads;

import androidx.core.content.C0663f;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzgeu {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgeu(zzgeo zzgeoVar, zzget zzgetVar) {
        this.zza = new HashMap(zzgeo.zzf(zzgeoVar));
        this.zzb = new HashMap(zzgeo.zze(zzgeoVar));
        this.zzc = new HashMap(zzgeo.zzh(zzgeoVar));
        this.zzd = new HashMap(zzgeo.zzg(zzgeoVar));
    }

    public final zzfxb zza(zzgen zzgenVar, @Nullable zzfye zzfyeVar) throws GeneralSecurityException {
        zzgeq zzgeqVar = new zzgeq(zzgenVar.getClass(), zzgenVar.zzd(), null);
        if (this.zzb.containsKey(zzgeqVar)) {
            return ((zzgda) this.zzb.get(zzgeqVar)).zza(zzgenVar, zzfyeVar);
        }
        throw new GeneralSecurityException(C0663f.m12005a("No Key Parser for requested key type ", zzgeqVar.toString(), " available"));
    }

    public final boolean zzf(zzgen zzgenVar) {
        return this.zzb.containsKey(new zzgeq(zzgenVar.getClass(), zzgenVar.zzd(), null));
    }
}
