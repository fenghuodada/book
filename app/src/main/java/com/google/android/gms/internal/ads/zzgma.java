package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzgma {
    public static final zzgma zza = new zzgma(new zzgmb());
    public static final zzgma zzb = new zzgma(new zzgmf());
    public static final zzgma zzc = new zzgma(new zzgmh());
    public static final zzgma zzd = new zzgma(new zzgmg());
    public static final zzgma zze = new zzgma(new zzgmc());
    public static final zzgma zzf = new zzgma(new zzgme());
    public static final zzgma zzg = new zzgma(new zzgmd());
    private final zzglz zzh;

    public zzgma(zzgmi zzgmiVar) {
        this.zzh = zzgcw.zzb() ? new zzgly(zzgmiVar, null) : zzgmr.zza() ? new zzglu(zzgmiVar, null) : new zzglw(zzgmiVar, null);
    }

    public static List zzb(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final Object zza(String str) throws GeneralSecurityException {
        return this.zzh.zza(str);
    }
}
