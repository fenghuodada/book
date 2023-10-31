package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzgdr {
    private static final zzgdr zza = new zzgdr();
    private final AtomicReference zzb = new AtomicReference(new zzgek(new zzgeg(), null));

    public static zzgdr zza() {
        return zza;
    }

    public final Class zzb(Class cls) throws GeneralSecurityException {
        return ((zzgek) this.zzb.get()).zza(cls);
    }

    public final Object zzc(zzfxb zzfxbVar, Class cls) throws GeneralSecurityException {
        return ((zzgek) this.zzb.get()).zzb(zzfxbVar, cls);
    }

    public final Object zzd(zzfya zzfyaVar, Class cls) throws GeneralSecurityException {
        return ((zzgek) this.zzb.get()).zzc(zzfyaVar, cls);
    }

    public final synchronized void zze(zzgee zzgeeVar) throws GeneralSecurityException {
        zzgeg zzgegVar = new zzgeg((zzgek) this.zzb.get());
        zzgegVar.zza(zzgeeVar);
        this.zzb.set(new zzgek(zzgegVar, null));
    }

    public final synchronized void zzf(zzfyb zzfybVar) throws GeneralSecurityException {
        zzgeg zzgegVar = new zzgeg((zzgek) this.zzb.get());
        zzgegVar.zzb(zzfybVar);
        this.zzb.set(new zzgek(zzgegVar, null));
    }
}
