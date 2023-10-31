package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;

/* loaded from: classes.dex */
final class zzglu implements zzglz {
    private final zzgmi zza;

    @Override // com.google.android.gms.internal.ads.zzglz
    public final Object zza(String str) throws GeneralSecurityException {
        for (Provider provider : zzgma.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL")) {
            try {
                return this.zza.zza(str, provider);
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
