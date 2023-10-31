package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;

/* loaded from: classes.dex */
final class zzgly implements zzglz {
    private final zzgmi zza;

    @Override // com.google.android.gms.internal.ads.zzglz
    public final Object zza(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider provider : zzgma.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt")) {
            try {
                return this.zza.zza(str, provider);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
