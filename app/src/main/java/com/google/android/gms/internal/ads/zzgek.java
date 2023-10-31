package com.google.android.gms.internal.ads;

import androidx.core.content.C0663f;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgek {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgek(zzgeg zzgegVar, zzgej zzgejVar) {
        Map map;
        Map map2;
        map = zzgegVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgegVar.zzb;
        this.zzb = new HashMap(map2);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzfyb) this.zzb.get(cls)).zza();
        }
        throw new GeneralSecurityException(C0663f.m12005a("No input primitive class for ", cls.toString(), " available"));
    }

    public final Object zzb(zzfxb zzfxbVar, Class cls) throws GeneralSecurityException {
        zzgei zzgeiVar = new zzgei(zzfxbVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgeiVar)) {
            return ((zzgee) this.zza.get(zzgeiVar)).zza(zzfxbVar);
        }
        throw new GeneralSecurityException(C0663f.m12005a("No PrimitiveConstructor for ", zzgeiVar.toString(), " available"));
    }

    public final Object zzc(zzfya zzfyaVar, Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            zzfyb zzfybVar = (zzfyb) this.zzb.get(cls);
            if (zzfyaVar.zzc().equals(zzfybVar.zza()) && zzfybVar.zza().equals(zzfyaVar.zzc())) {
                return zzfybVar.zzc(zzfyaVar);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
    }
}
