package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgcx extends zzgda {
    final /* synthetic */ zzgcy zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgcx(zzgmu zzgmuVar, Class cls, zzgcy zzgcyVar) {
        super(zzgmuVar, cls, null);
        this.zza = zzgcyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgda
    public final zzfxb zza(zzgen zzgenVar, @Nullable zzfye zzfyeVar) throws GeneralSecurityException {
        return this.zza.zza(zzgenVar, zzfyeVar);
    }
}
