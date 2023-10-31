package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzgds {
    private static final zzgds zza = new zzgds();
    private final AtomicReference zzb = new AtomicReference(new zzgeu(new zzgeo(), null));

    public static zzgds zzb() {
        return zza;
    }

    public final zzfxb zza(zzgel zzgelVar, zzfye zzfyeVar) throws GeneralSecurityException {
        if (((zzgeu) this.zzb.get()).zzf(zzgelVar)) {
            return ((zzgeu) this.zzb.get()).zza(zzgelVar, zzfyeVar);
        }
        try {
            return new zzgdj(zzgelVar, zzfyeVar);
        } catch (GeneralSecurityException e) {
            throw new zzgev("Creating a LegacyProtoKey failed", e);
        }
    }

    public final synchronized void zzc(zzgda zzgdaVar) throws GeneralSecurityException {
        zzgeo zzgeoVar = new zzgeo((zzgeu) this.zzb.get());
        zzgeoVar.zza(zzgdaVar);
        this.zzb.set(new zzgeu(zzgeoVar, null));
    }

    public final synchronized void zzd(zzgde zzgdeVar) throws GeneralSecurityException {
        zzgeo zzgeoVar = new zzgeo((zzgeu) this.zzb.get());
        zzgeoVar.zzb(zzgdeVar);
        this.zzb.set(new zzgeu(zzgeoVar, null));
    }

    public final synchronized void zze(zzgdw zzgdwVar) throws GeneralSecurityException {
        zzgeo zzgeoVar = new zzgeo((zzgeu) this.zzb.get());
        zzgeoVar.zzc(zzgdwVar);
        this.zzb.set(new zzgeu(zzgeoVar, null));
    }

    public final synchronized void zzf(zzgea zzgeaVar) throws GeneralSecurityException {
        zzgeo zzgeoVar = new zzgeo((zzgeu) this.zzb.get());
        zzgeoVar.zzd(zzgeaVar);
        this.zzb.set(new zzgeu(zzgeoVar, null));
    }
}
