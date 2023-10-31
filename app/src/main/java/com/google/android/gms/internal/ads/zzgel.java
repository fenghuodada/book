package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzgel implements zzgen {
    private final String zza;
    private final zzgmu zzb;
    private final zzgno zzc;
    private final zzgjt zzd;
    private final zzgla zze;
    @Nullable
    private final Integer zzf;

    private zzgel(String str, zzgno zzgnoVar, zzgjt zzgjtVar, zzgla zzglaVar, @Nullable Integer num) {
        this.zza = str;
        this.zzb = zzgew.zza(str);
        this.zzc = zzgnoVar;
        this.zzd = zzgjtVar;
        this.zze = zzglaVar;
        this.zzf = num;
    }

    public static zzgel zza(String str, zzgno zzgnoVar, zzgjt zzgjtVar, zzgla zzglaVar, @Nullable Integer num) throws GeneralSecurityException {
        if (zzglaVar == zzgla.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new zzgel(str, zzgnoVar, zzgjtVar, zzglaVar, num);
    }

    public final zzgjt zzb() {
        return this.zzd;
    }

    public final zzgla zzc() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final zzgmu zzd() {
        return this.zzb;
    }

    public final zzgno zze() {
        return this.zzc;
    }

    @Nullable
    public final Integer zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zza;
    }
}
