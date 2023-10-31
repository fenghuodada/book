package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
public final class zzgco extends zzgcp {
    public zzgco(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    public final zzgcn zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgcm(bArr, i);
    }
}
