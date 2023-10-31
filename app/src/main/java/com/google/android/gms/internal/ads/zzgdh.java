package com.google.android.gms.internal.ads;

import androidx.core.content.C0663f;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzgdh {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    public zzgdh(Class cls, zzgef... zzgefVarArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            zzgef zzgefVar = zzgefVarArr[i];
            if (hashMap.containsKey(zzgefVar.zzb())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzgefVar.zzb().getCanonicalName())));
            }
            hashMap.put(zzgefVar.zzb(), zzgefVar);
        }
        this.zzc = zzgefVarArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzgdg zza() {
        throw null;
    }

    public abstract zzgjt zzb();

    public abstract zzgqg zzc(zzgno zzgnoVar) throws zzgpi;

    public abstract String zzd();

    public abstract void zze(zzgqg zzgqgVar) throws GeneralSecurityException;

    public int zzf() {
        return 1;
    }

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzgqg zzgqgVar, Class cls) throws GeneralSecurityException {
        zzgef zzgefVar = (zzgef) this.zzb.get(cls);
        if (zzgefVar != null) {
            return zzgefVar.zza(zzgqgVar);
        }
        throw new IllegalArgumentException(C0663f.m12005a("Requested primitive class ", cls.getCanonicalName(), " not supported."));
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
