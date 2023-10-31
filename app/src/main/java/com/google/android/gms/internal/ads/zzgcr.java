package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
public final class zzgcr extends zzgcp {
    public zzgcr(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgcp
    public final zzgcn zza(byte[] bArr, int i) throws InvalidKeyException {
        return new zzgcq(bArr, i);
    }
}
