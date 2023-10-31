package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgbu implements zzfww {
    private static final byte[] zza = new byte[0];
    private final zzgjz zzb;
    private final zzfww zzc;

    public zzgbu(zzgjz zzgjzVar, zzfww zzfwwVar) {
        this.zzb = zzgjzVar;
        this.zzc = zzfwwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfww
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            byte[] zza2 = this.zzc.zza(bArr3, zza);
            String zzg = this.zzb.zzg();
            int i2 = zzfyd.zza;
            zzgno zzgnoVar = zzgno.zzb;
            return ((zzfww) zzfyd.zzc(zzg, zzgno.zzv(zza2, 0, zza2.length), zzfww.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
