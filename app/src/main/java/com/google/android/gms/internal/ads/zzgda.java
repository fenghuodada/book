package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public abstract class zzgda {
    private final zzgmu zza;
    private final Class zzb;

    public /* synthetic */ zzgda(zzgmu zzgmuVar, Class cls, zzgcz zzgczVar) {
        this.zza = zzgmuVar;
        this.zzb = cls;
    }

    public static zzgda zzb(zzgcy zzgcyVar, zzgmu zzgmuVar, Class cls) {
        return new zzgcx(zzgmuVar, cls, zzgcyVar);
    }

    public abstract zzfxb zza(zzgen zzgenVar, @Nullable zzfye zzfyeVar) throws GeneralSecurityException;

    public final zzgmu zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
