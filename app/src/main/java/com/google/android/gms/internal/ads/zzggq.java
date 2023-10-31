package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* loaded from: classes.dex */
final class zzggq implements zzfxs {
    private final zzfya zza;
    private final zzggy zzb;
    private final zzggy zzc;

    public /* synthetic */ zzggq(zzfya zzfyaVar, zzggp zzggpVar) {
        zzggy zzggyVar;
        this.zza = zzfyaVar;
        if (zzfyaVar.zzf()) {
            zzggz zzb = zzgdq.zza().zzb();
            zzghe zza = zzgdn.zza(zzfyaVar);
            this.zzb = zzb.zza(zza, "mac", "compute");
            zzggyVar = zzb.zza(zza, "mac", "verify");
        } else {
            zzggyVar = zzgdn.zza;
            this.zzb = zzggyVar;
        }
        this.zzc = zzggyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 5);
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
        for (zzfxw zzfxwVar : this.zza.zze(copyOf)) {
            try {
                ((zzfxs) zzfxwVar.zze()).zza(copyOfRange, zzfxwVar.zzc().equals(zzgla.LEGACY) ? zzglq.zzb(bArr2, zzggr.zzf()) : bArr2);
                zzfxwVar.zza();
                return;
            } catch (GeneralSecurityException e) {
                zzggr.zzd().logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
            }
        }
        for (zzfxw zzfxwVar2 : this.zza.zze(zzfxa.zza)) {
            try {
                ((zzfxs) zzfxwVar2.zze()).zza(bArr, bArr2);
                zzfxwVar2.zza();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}
