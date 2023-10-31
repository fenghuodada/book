package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class zzgee {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgee(Class cls, Class cls2, zzged zzgedVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgee zzb(zzgec zzgecVar, Class cls, Class cls2) {
        return new zzgeb(cls, cls2, zzgecVar);
    }

    public abstract Object zza(zzfxb zzfxbVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
