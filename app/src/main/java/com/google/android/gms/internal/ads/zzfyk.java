package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
final class zzfyk implements zzfww {
    private final zzfya zza;
    private final zzggy zzb;
    private final zzggy zzc;

    public /* synthetic */ zzfyk(zzfya zzfyaVar, zzfyj zzfyjVar) {
        zzggy zzggyVar;
        this.zza = zzfyaVar;
        if (zzfyaVar.zzf()) {
            zzggz zzb = zzgdq.zza().zzb();
            zzghe zza = zzgdn.zza(zzfyaVar);
            this.zzb = zzb.zza(zza, "aead", "encrypt");
            zzggyVar = zzb.zza(zza, "aead", "decrypt");
        } else {
            zzggyVar = zzgdn.zza;
            this.zzb = zzggyVar;
        }
        this.zzc = zzggyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfww
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Logger logger;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzfxw zzfxwVar : this.zza.zze(copyOf)) {
                try {
                    byte[] zza = ((zzfww) zzfxwVar.zze()).zza(copyOfRange, bArr2);
                    zzfxwVar.zza();
                    int length2 = copyOfRange.length;
                    return zza;
                } catch (GeneralSecurityException e) {
                    logger = zzfyl.zza;
                    logger.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e.toString()));
                }
            }
        }
        for (zzfxw zzfxwVar2 : this.zza.zze(zzfxa.zza)) {
            try {
                byte[] zza2 = ((zzfww) zzfxwVar2.zze()).zza(bArr, bArr2);
                zzfxwVar2.zza();
                return zza2;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
