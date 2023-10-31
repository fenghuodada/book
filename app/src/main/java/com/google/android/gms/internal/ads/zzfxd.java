package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzfxd implements zzfxc {
    private final zzgdh zza;
    private final Class zzb;

    public zzfxd(zzgdh zzgdhVar, Class cls) {
        if (!zzgdhVar.zzl().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzgdhVar.toString(), cls.getName()));
        }
        this.zza = zzgdhVar;
        this.zzb = cls;
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final zzgju zza(zzgno zzgnoVar) throws GeneralSecurityException {
        try {
            zzgdg zza = this.zza.zza();
            zzgqg zzb = zza.zzb(zzgnoVar);
            zza.zzd(zzb);
            zzgqg zza2 = zza.zza(zzb);
            zzgjr zza3 = zzgju.zza();
            zza3.zzb(this.zza.zzd());
            zza3.zzc(zza2.zzau());
            zza3.zza(this.zza.zzb());
            return (zzgju) zza3.zzal();
        } catch (zzgpi e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final Object zzb(zzgno zzgnoVar) throws GeneralSecurityException {
        try {
            zzgqg zzc = this.zza.zzc(zzgnoVar);
            if (Void.class.equals(this.zzb)) {
                throw new GeneralSecurityException("Cannot create a primitive for Void");
            }
            this.zza.zze(zzc);
            return this.zza.zzk(zzc, this.zzb);
        } catch (zzgpi e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zzj().getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfxc
    public final String zzc() {
        return this.zza.zzd();
    }
}
