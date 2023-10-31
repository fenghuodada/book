package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class zzgmf implements zzgmi {
    @Override // com.google.android.gms.internal.ads.zzgmi
    public final /* bridge */ /* synthetic */ Object zza(String str, Provider provider) throws GeneralSecurityException {
        return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
    }
}
