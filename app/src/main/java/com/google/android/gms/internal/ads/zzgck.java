package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;

/* loaded from: classes.dex */
final class zzgck extends ThreadLocal {
    public static final Cipher zza() {
        try {
            return (Cipher) zzgma.zza.zza("AES/GCM/NoPadding");
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Object initialValue() {
        return zza();
    }
}
