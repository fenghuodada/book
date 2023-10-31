package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public final class zzgmq {
    private static final ThreadLocal zza = new zzgmp();

    public static byte[] zza(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) zza.get()).nextBytes(bArr);
        return bArr;
    }
}
